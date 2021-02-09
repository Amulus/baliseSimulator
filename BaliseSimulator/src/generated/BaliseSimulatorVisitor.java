// Generated from BaliseSimulator.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BaliseSimulatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BaliseSimulatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BaliseSimulatorParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(BaliseSimulatorParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaliseSimulatorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(BaliseSimulatorParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaliseSimulatorParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(BaliseSimulatorParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaliseSimulatorParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(BaliseSimulatorParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaliseSimulatorParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(BaliseSimulatorParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaliseSimulatorParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(BaliseSimulatorParser.ValueContext ctx);
}