package visiting;

import java.util.ArrayList;
import java.util.Iterator;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import generated.BaliseSimulatorBaseVisitor;
import generated.BaliseSimulatorParser.ArgContext;
import generated.BaliseSimulatorParser.AssignContext;
import generated.BaliseSimulatorParser.CallContext;
import generated.BaliseSimulatorParser.CommandContext;
import generated.BaliseSimulatorParser.ScriptContext;
import generated.BaliseSimulatorParser.ValueContext;
import metamodel.Call;
import metamodel.Command;
import metamodel.Script;
import metamodel.Arg;
import metamodel.Assign;
;

/*
grammar  BaliseSimulator;


script : command *;

command : call | assign;
call : ID '.' ID '('arg*')' ';';
assign: ID '=' value ';';
arg : ID ':' value ',';
value: NB|SYMBOL;

NB : [0-9]+ ;
ID : [a-zA-Z][a-zA-Z0-9]* ;
SYMBOL : '#' ID;
*/

public class SourceMaterializer extends BaliseSimulatorBaseVisitor<ParserRuleContext> {
	ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();
	public Object resultFor(ParserRuleContext ctx) {
		return values.get(ctx);
	}
	@Override
	public ParserRuleContext visitScript(ScriptContext ctx) {
		// TODO Auto-generated method stub
		ParserRuleContext r = (ParserRuleContext) super.visitScript(ctx);
		Iterator<CommandContext> itor = ctx.command().iterator();
		ArrayList<Command> commands = new ArrayList<Command>();
		while (itor.hasNext()) {		
			commands.add((Command) values.get(itor.next()));
		}
		Script script = new Script(commands);
		values.put(ctx,script);
		return r;
	}
	@Override
	public ParserRuleContext visitCommand(CommandContext ctx) {
		// TODO Auto-generated method stub
		ParserRuleContext r = (ParserRuleContext) super.visitCommand(ctx);
		values.put(ctx, values.get(ctx.getChild(0)));
		return r;
	}
	@Override
	public ParserRuleContext visitCall(CallContext ctx) {
		// TODO Auto-generated method stub
		ParserRuleContext r = (ParserRuleContext) super.visitCall(ctx);
		Iterator<ArgContext> itor = ctx.arg().iterator();
		ArrayList<Arg> args = new ArrayList<Arg>();
		while (itor.hasNext()) {		
			args.add((Arg) values.get(itor.next()));
		}
		Call call = new Call(ctx.ID(0).getText(),ctx.ID(1).getText(),args);
		values.put(ctx, call);
		return r;
	}
	@Override
	public ParserRuleContext visitAssign(AssignContext ctx) {
		// TODO Auto-generated method stub
		ParserRuleContext r = (ParserRuleContext) super.visitAssign(ctx);
		Assign assign = new Assign(ctx.ID().getText(), ctx.value().getText());
		values.put(ctx,assign);
		return r;
	}
	@Override
	public ParserRuleContext visitArg(ArgContext ctx) {
		// TODO Auto-generated method stub
		ParserRuleContext r = (ParserRuleContext) super.visitArg(ctx);
		Arg arg = new Arg(ctx.ID().getText(), ctx.value().getText());
		values.put(ctx,arg);
		return r;
	}
	@Override
	public ParserRuleContext visitValue(ValueContext ctx) {
		// TODO Auto-generated method stub
		ParserRuleContext r = (ParserRuleContext) super.visitValue(ctx);
		String value = new String(ctx.NB().getText() + ctx.SYMBOL().getText());
		values.put(ctx,value);
		return r;
	}
}
