// Generated from BaliseSimulator.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BaliseSimulatorParser}.
 */
public interface BaliseSimulatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BaliseSimulatorParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(BaliseSimulatorParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaliseSimulatorParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(BaliseSimulatorParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaliseSimulatorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(BaliseSimulatorParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaliseSimulatorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(BaliseSimulatorParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaliseSimulatorParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(BaliseSimulatorParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaliseSimulatorParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(BaliseSimulatorParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaliseSimulatorParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(BaliseSimulatorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaliseSimulatorParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(BaliseSimulatorParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaliseSimulatorParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(BaliseSimulatorParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaliseSimulatorParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(BaliseSimulatorParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaliseSimulatorParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(BaliseSimulatorParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaliseSimulatorParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(BaliseSimulatorParser.ValueContext ctx);
}