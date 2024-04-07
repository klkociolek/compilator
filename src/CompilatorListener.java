// Generated from Compilator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompilatorParser}.
 */
public interface CompilatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CompilatorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CompilatorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWrite(CompilatorParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWrite(CompilatorParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CompilatorParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CompilatorParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(CompilatorParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(CompilatorParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link CompilatorParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(CompilatorParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link CompilatorParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(CompilatorParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code stri}
	 * labeled alternative in {@link CompilatorParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterStri(CompilatorParser.StriContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stri}
	 * labeled alternative in {@link CompilatorParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitStri(CompilatorParser.StriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link CompilatorParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(CompilatorParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link CompilatorParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(CompilatorParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link CompilatorParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSub(CompilatorParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link CompilatorParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSub(CompilatorParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link CompilatorParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(CompilatorParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link CompilatorParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(CompilatorParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link CompilatorParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMult(CompilatorParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link CompilatorParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMult(CompilatorParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link CompilatorParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterDiv(CompilatorParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link CompilatorParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitDiv(CompilatorParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CompilatorParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterInt(CompilatorParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CompilatorParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitInt(CompilatorParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link CompilatorParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterReal(CompilatorParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link CompilatorParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitReal(CompilatorParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toint}
	 * labeled alternative in {@link CompilatorParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToint(CompilatorParser.TointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link CompilatorParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToint(CompilatorParser.TointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link CompilatorParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToreal(CompilatorParser.TorealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link CompilatorParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToreal(CompilatorParser.TorealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link CompilatorParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterPar(CompilatorParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link CompilatorParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitPar(CompilatorParser.ParContext ctx);
}