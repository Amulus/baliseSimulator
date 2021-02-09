package visiting;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import generated.BaliseSimulatorBaseVisitor;
import generated.BaliseSimulatorParser.ArgContext;
import generated.BaliseSimulatorParser.AssignContext;
import generated.BaliseSimulatorParser.CallContext;
import generated.BaliseSimulatorParser.CommandContext;
import generated.BaliseSimulatorParser.ScriptContext;
import generated.BaliseSimulatorParser.ValueContext;

public class SourceMaterializer extends BaliseSimulatorBaseVisitor<ParserRuleContext> {
	ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();
	public Object resultFor(ParserRuleContext ctx) {
		return values.get(ctx);
	}
	@Override
	public ParserRuleContext visitScript(ScriptContext ctx) {
		// TODO Auto-generated method stub
		ParserRuleContext r = (ParserRuleContext) super.visitScript(ctx);
		return r;
	}
	@Override
	public ParserRuleContext visitCommand(CommandContext ctx) {
		// TODO Auto-generated method stub
		ParserRuleContext r = (ParserRuleContext) super.visitCommand(ctx);
		return r;
	}
	@Override
	public ParserRuleContext visitCall(CallContext ctx) {
		// TODO Auto-generated method stub
		ParserRuleContext r = (ParserRuleContext) super.visitCall(ctx);
		return r;
	}
	@Override
	public ParserRuleContext visitAssign(AssignContext ctx) {
		// TODO Auto-generated method stub
		ParserRuleContext r = (ParserRuleContext) super.visitAssign(ctx);
		return r;
	}
	@Override
	public ParserRuleContext visitArg(ArgContext ctx) {
		// TODO Auto-generated method stub
		ParserRuleContext r = (ParserRuleContext) super.visitArg(ctx);
		return r;
	}
	@Override
	public ParserRuleContext visitValue(ValueContext ctx) {
		// TODO Auto-generated method stub
		ParserRuleContext r = (ParserRuleContext) super.visitValue(ctx);
		return r;
	}
}
