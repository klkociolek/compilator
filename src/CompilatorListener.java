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
	 * Enter a parse tree produced by the {@code readstring}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReadstring(CompilatorParser.ReadstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readstring}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReadstring(CompilatorParser.ReadstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readint}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReadint(CompilatorParser.ReadintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readint}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReadint(CompilatorParser.ReadintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readreal}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReadreal(CompilatorParser.ReadrealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readreal}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReadreal(CompilatorParser.ReadrealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign0}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign0(CompilatorParser.Assign0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assign0}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign0(CompilatorParser.Assign0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCall(CompilatorParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link CompilatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCall(CompilatorParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleOr}
	 * labeled alternative in {@link CompilatorParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingleOr(CompilatorParser.SingleOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleOr}
	 * labeled alternative in {@link CompilatorParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingleOr(CompilatorParser.SingleOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link CompilatorParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterOr(CompilatorParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link CompilatorParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitOr(CompilatorParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleAnd}
	 * labeled alternative in {@link CompilatorParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingleAnd(CompilatorParser.SingleAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleAnd}
	 * labeled alternative in {@link CompilatorParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingleAnd(CompilatorParser.SingleAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link CompilatorParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterAnd(CompilatorParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link CompilatorParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitAnd(CompilatorParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleXor}
	 * labeled alternative in {@link CompilatorParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterSingleXor(CompilatorParser.SingleXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleXor}
	 * labeled alternative in {@link CompilatorParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitSingleXor(CompilatorParser.SingleXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xor}
	 * labeled alternative in {@link CompilatorParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterXor(CompilatorParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xor}
	 * labeled alternative in {@link CompilatorParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitXor(CompilatorParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neg}
	 * labeled alternative in {@link CompilatorParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterNeg(CompilatorParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link CompilatorParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitNeg(CompilatorParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleNeg}
	 * labeled alternative in {@link CompilatorParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterSingleNeg(CompilatorParser.SingleNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleNeg}
	 * labeled alternative in {@link CompilatorParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitSingleNeg(CompilatorParser.SingleNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link CompilatorParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterAdd(CompilatorParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link CompilatorParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitAdd(CompilatorParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link CompilatorParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterSub(CompilatorParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link CompilatorParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitSub(CompilatorParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleAddSub}
	 * labeled alternative in {@link CompilatorParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterSingleAddSub(CompilatorParser.SingleAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleAddSub}
	 * labeled alternative in {@link CompilatorParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitSingleAddSub(CompilatorParser.SingleAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link CompilatorParser#expr5}.
	 * @param ctx the parse tree
	 */
	void enterDiv(CompilatorParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link CompilatorParser#expr5}.
	 * @param ctx the parse tree
	 */
	void exitDiv(CompilatorParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link CompilatorParser#expr5}.
	 * @param ctx the parse tree
	 */
	void enterMult(CompilatorParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link CompilatorParser#expr5}.
	 * @param ctx the parse tree
	 */
	void exitMult(CompilatorParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleMultDiv}
	 * labeled alternative in {@link CompilatorParser#expr5}.
	 * @param ctx the parse tree
	 */
	void enterSingleMultDiv(CompilatorParser.SingleMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleMultDiv}
	 * labeled alternative in {@link CompilatorParser#expr5}.
	 * @param ctx the parse tree
	 */
	void exitSingleMultDiv(CompilatorParser.SingleMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link CompilatorParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterPar(CompilatorParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link CompilatorParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitPar(CompilatorParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code val}
	 * labeled alternative in {@link CompilatorParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterVal(CompilatorParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code val}
	 * labeled alternative in {@link CompilatorParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitVal(CompilatorParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CompilatorParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CompilatorParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CompilatorParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CompilatorParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#fparam}.
	 * @param ctx the parse tree
	 */
	void enterFparam(CompilatorParser.FparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#fparam}.
	 * @param ctx the parse tree
	 */
	void exitFparam(CompilatorParser.FparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#fblock}.
	 * @param ctx the parse tree
	 */
	void enterFblock(CompilatorParser.FblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#fblock}.
	 * @param ctx the parse tree
	 */
	void exitFblock(CompilatorParser.FblockContext ctx);
}