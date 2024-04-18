// Generated from Compilator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CompilatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IF=4, ELSE=5, ENDIF=6, FUNCTION=7, ENDFUNCTION=8, 
		WRITE=9, READREAL=10, READINT=11, READSTRING=12, ID=13, REAL=14, INT=15, 
		STRING=16, BOOL=17, ADD=18, SUB=19, MULT=20, DIV=21, OR=22, AND=23, XOR=24, 
		NEG=25, NEWLINE=26, WS=27;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr0 = 2, RULE_expr1 = 3, RULE_expr2 = 4, 
		RULE_expr3 = 5, RULE_expr4 = 6, RULE_expr5 = 7, RULE_expr6 = 8, RULE_value = 9, 
		RULE_function = 10, RULE_fparam = 11, RULE_fblock = 12, RULE_ifStatement = 13, 
		RULE_iblock = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr0", "expr1", "expr2", "expr3", "expr4", "expr5", 
			"expr6", "value", "function", "fparam", "fblock", "ifStatement", "iblock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'if'", "'else'", "'endif'", "'function'", 
			"'endfunction'", "'print '", "'readr '", "'readi '", "'reads '", null, 
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'||'", "'&&'", "'^'", 
			"'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IF", "ELSE", "ENDIF", "FUNCTION", "ENDFUNCTION", 
			"WRITE", "READREAL", "READINT", "READSTRING", "ID", "REAL", "INT", "STRING", 
			"BOOL", "ADD", "SUB", "MULT", "DIV", "OR", "AND", "XOR", "NEG", "NEWLINE", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Compilator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CompilatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CompilatorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CompilatorParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67124880L) != 0)) {
				{
				{
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WRITE:
				case READREAL:
				case READINT:
				case READSTRING:
				case ID:
					{
					setState(30);
					stat();
					}
					break;
				case FUNCTION:
					{
					setState(31);
					function();
					}
					break;
				case IF:
					{
					setState(32);
					ifStatement();
					}
					break;
				case NEWLINE:
					break;
				default:
					break;
				}
				setState(35);
				match(NEWLINE);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends StatContext {
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
		public CallContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitCall(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadrealContext extends StatContext {
		public TerminalNode READREAL() { return getToken(CompilatorParser.READREAL, 0); }
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
		public ReadrealContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterReadreal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitReadreal(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadintContext extends StatContext {
		public TerminalNode READINT() { return getToken(CompilatorParser.READINT, 0); }
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
		public ReadintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterReadint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitReadint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends StatContext {
		public TerminalNode WRITE() { return getToken(CompilatorParser.WRITE, 0); }
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
		public WriteContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitWrite(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadstringContext extends StatContext {
		public TerminalNode READSTRING() { return getToken(CompilatorParser.READSTRING, 0); }
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
		public ReadstringContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterReadstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitReadstring(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Assign0Context extends StatContext {
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public Assign0Context(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterAssign0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitAssign0(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(WRITE);
				setState(42);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ReadstringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(READSTRING);
				setState(44);
				match(ID);
				}
				break;
			case 3:
				_localctx = new ReadintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(READINT);
				setState(46);
				match(ID);
				}
				break;
			case 4:
				_localctx = new ReadrealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(READREAL);
				setState(48);
				match(ID);
				}
				break;
			case 5:
				_localctx = new Assign0Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(ID);
				setState(50);
				match(T__0);
				setState(51);
				expr0(0);
				}
				break;
			case 6:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr0Context extends ParserRuleContext {
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
	 
		public Expr0Context() { }
		public void copyFrom(Expr0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleOrContext extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public SingleOrContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterSingleOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitSingleOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends Expr0Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public TerminalNode OR() { return getToken(CompilatorParser.OR, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public OrContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitOr(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		return expr0(0);
	}

	private Expr0Context expr0(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr0Context _localctx = new Expr0Context(_ctx, _parentState);
		Expr0Context _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr0, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleOrContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(56);
			expr1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrContext(new Expr0Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr0);
					setState(58);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(59);
					match(OR);
					setState(60);
					expr1(0);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleAndContext extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public SingleAndContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterSingleAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitSingleAnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends Expr1Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode AND() { return getToken(CompilatorParser.AND, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public AndContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitAnd(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		return expr1(0);
	}

	private Expr1Context expr1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr1Context _localctx = new Expr1Context(_ctx, _parentState);
		Expr1Context _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleAndContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(67);
			expr2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndContext(new Expr1Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr1);
					setState(69);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(70);
					match(AND);
					setState(71);
					expr2(0);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleXorContext extends Expr2Context {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public SingleXorContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterSingleXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitSingleXor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorContext extends Expr2Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode XOR() { return getToken(CompilatorParser.XOR, 0); }
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public XorContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitXor(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		return expr2(0);
	}

	private Expr2Context expr2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr2Context _localctx = new Expr2Context(_ctx, _parentState);
		Expr2Context _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleXorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(78);
			expr3();
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new XorContext(new Expr2Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr2);
					setState(80);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(81);
					match(XOR);
					setState(82);
					expr3();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr3Context extends ParserRuleContext {
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
	 
		public Expr3Context() { }
		public void copyFrom(Expr3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegContext extends Expr3Context {
		public TerminalNode NEG() { return getToken(CompilatorParser.NEG, 0); }
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public NegContext(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitNeg(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleNegContext extends Expr3Context {
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public SingleNegContext(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterSingleNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitSingleNeg(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr3);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEG:
				_localctx = new NegContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(NEG);
				setState(89);
				expr4(0);
				}
				break;
			case T__1:
			case ID:
			case REAL:
			case INT:
			case STRING:
			case BOOL:
				_localctx = new SingleNegContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				expr4(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr4Context extends ParserRuleContext {
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
	 
		public Expr4Context() { }
		public void copyFrom(Expr4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends Expr4Context {
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public TerminalNode ADD() { return getToken(CompilatorParser.ADD, 0); }
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public AddContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitAdd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends Expr4Context {
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public TerminalNode SUB() { return getToken(CompilatorParser.SUB, 0); }
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public SubContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitSub(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleAddSubContext extends Expr4Context {
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public SingleAddSubContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterSingleAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitSingleAddSub(this);
		}
	}

	public final Expr4Context expr4() throws RecognitionException {
		return expr4(0);
	}

	private Expr4Context expr4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr4Context _localctx = new Expr4Context(_ctx, _parentState);
		Expr4Context _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleAddSubContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(94);
			expr5(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new Expr4Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(96);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(97);
						match(ADD);
						setState(98);
						expr5(0);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new Expr4Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(99);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(100);
						match(SUB);
						setState(101);
						expr5(0);
						}
						break;
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr5Context extends ParserRuleContext {
		public Expr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr5; }
	 
		public Expr5Context() { }
		public void copyFrom(Expr5Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends Expr5Context {
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public TerminalNode DIV() { return getToken(CompilatorParser.DIV, 0); }
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public DivContext(Expr5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitDiv(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends Expr5Context {
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public TerminalNode MULT() { return getToken(CompilatorParser.MULT, 0); }
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public MultContext(Expr5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitMult(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleMultDivContext extends Expr5Context {
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public SingleMultDivContext(Expr5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterSingleMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitSingleMultDiv(this);
		}
	}

	public final Expr5Context expr5() throws RecognitionException {
		return expr5(0);
	}

	private Expr5Context expr5(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr5Context _localctx = new Expr5Context(_ctx, _parentState);
		Expr5Context _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr5, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleMultDivContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(108);
			expr6();
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new Expr5Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr5);
						setState(110);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(111);
						match(MULT);
						setState(112);
						expr6();
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new Expr5Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr5);
						setState(113);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(114);
						match(DIV);
						setState(115);
						expr6();
						}
						break;
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr6Context extends ParserRuleContext {
		public Expr6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr6; }
	 
		public Expr6Context() { }
		public void copyFrom(Expr6Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParContext extends Expr6Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public ParContext(Expr6Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitPar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValContext extends Expr6Context {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValContext(Expr6Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitVal(this);
		}
	}

	public final Expr6Context expr6() throws RecognitionException {
		Expr6Context _localctx = new Expr6Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr6);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__1);
				setState(122);
				expr0(0);
				setState(123);
				match(T__2);
				}
				break;
			case ID:
			case REAL:
			case INT:
			case STRING:
			case BOOL:
				_localctx = new ValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
		public TerminalNode INT() { return getToken(CompilatorParser.INT, 0); }
		public TerminalNode STRING() { return getToken(CompilatorParser.STRING, 0); }
		public TerminalNode REAL() { return getToken(CompilatorParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(CompilatorParser.BOOL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(CompilatorParser.FUNCTION, 0); }
		public FparamContext fparam() {
			return getRuleContext(FparamContext.class,0);
		}
		public FblockContext fblock() {
			return getRuleContext(FblockContext.class,0);
		}
		public TerminalNode ENDFUNCTION() { return getToken(CompilatorParser.ENDFUNCTION, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(FUNCTION);
			setState(131);
			fparam();
			setState(132);
			fblock();
			setState(133);
			match(ENDFUNCTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FparamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
		public FparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterFparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitFparam(this);
		}
	}

	public final FparamContext fparam() throws RecognitionException {
		FparamContext _localctx = new FparamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FblockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CompilatorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CompilatorParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterFblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitFblock(this);
		}
	}

	public final FblockContext fblock() throws RecognitionException {
		FblockContext _localctx = new FblockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67124736L) != 0)) {
				{
				{
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15872L) != 0)) {
					{
					setState(137);
					stat();
					}
				}

				setState(140);
				match(NEWLINE);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CompilatorParser.IF, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public List<IblockContext> iblock() {
			return getRuleContexts(IblockContext.class);
		}
		public IblockContext iblock(int i) {
			return getRuleContext(IblockContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(CompilatorParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(CompilatorParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(IF);
			setState(147);
			expr0(0);
			setState(148);
			iblock();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(149);
				match(ELSE);
				setState(150);
				iblock();
				}
			}

			setState(153);
			match(ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IblockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CompilatorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CompilatorParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterIblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitIblock(this);
		}
	}

	public final IblockContext iblock() throws RecognitionException {
		IblockContext _localctx = new IblockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_iblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67124736L) != 0)) {
				{
				{
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15872L) != 0)) {
					{
					setState(155);
					stat();
					}
				}

				setState(158);
				match(NEWLINE);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr0_sempred((Expr0Context)_localctx, predIndex);
		case 3:
			return expr1_sempred((Expr1Context)_localctx, predIndex);
		case 4:
			return expr2_sempred((Expr2Context)_localctx, predIndex);
		case 6:
			return expr4_sempred((Expr4Context)_localctx, predIndex);
		case 7:
			return expr5_sempred((Expr5Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr0_sempred(Expr0Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr1_sempred(Expr1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr2_sempred(Expr2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr4_sempred(Expr4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr5_sempred(Expr5Context _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u00a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\"\b\u0000\u0001\u0000\u0005\u0000%\b\u0000"+
		"\n\u0000\f\u0000(\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002>\b\u0002"+
		"\n\u0002\f\u0002A\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003I\b\u0003\n\u0003\f\u0003L\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004T\b\u0004\n\u0004\f\u0004W\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\\\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006g\b\u0006\n\u0006\f\u0006j\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007u\b\u0007\n\u0007\f\u0007x\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u007f\b\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0003\f\u008b"+
		"\b\f\u0001\f\u0005\f\u008e\b\f\n\f\f\f\u0091\t\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0098\b\r\u0001\r\u0001\r\u0001\u000e\u0003"+
		"\u000e\u009d\b\u000e\u0001\u000e\u0005\u000e\u00a0\b\u000e\n\u000e\f\u000e"+
		"\u00a3\t\u000e\u0001\u000e\u0000\u0005\u0004\u0006\b\f\u000e\u000f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u0000\u0001\u0001\u0000\r\u0011\u00ac\u0000&\u0001\u0000\u0000\u0000"+
		"\u00025\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006B"+
		"\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000"+
		"\u0000\f]\u0001\u0000\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010"+
		"~\u0001\u0000\u0000\u0000\u0012\u0080\u0001\u0000\u0000\u0000\u0014\u0082"+
		"\u0001\u0000\u0000\u0000\u0016\u0087\u0001\u0000\u0000\u0000\u0018\u008f"+
		"\u0001\u0000\u0000\u0000\u001a\u0092\u0001\u0000\u0000\u0000\u001c\u00a1"+
		"\u0001\u0000\u0000\u0000\u001e\"\u0003\u0002\u0001\u0000\u001f\"\u0003"+
		"\u0014\n\u0000 \"\u0003\u001a\r\u0000!\u001e\u0001\u0000\u0000\u0000!"+
		"\u001f\u0001\u0000\u0000\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0005\u001a\u0000\u0000$!\u0001"+
		"\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'\u0001\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000)*\u0005\t\u0000\u0000*6\u0005\r\u0000\u0000+,\u0005\f\u0000"+
		"\u0000,6\u0005\r\u0000\u0000-.\u0005\u000b\u0000\u0000.6\u0005\r\u0000"+
		"\u0000/0\u0005\n\u0000\u000006\u0005\r\u0000\u000012\u0005\r\u0000\u0000"+
		"23\u0005\u0001\u0000\u000036\u0003\u0004\u0002\u000046\u0005\r\u0000\u0000"+
		"5)\u0001\u0000\u0000\u00005+\u0001\u0000\u0000\u00005-\u0001\u0000\u0000"+
		"\u00005/\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u000054\u0001\u0000"+
		"\u0000\u00006\u0003\u0001\u0000\u0000\u000078\u0006\u0002\uffff\uffff"+
		"\u000089\u0003\u0006\u0003\u00009?\u0001\u0000\u0000\u0000:;\n\u0002\u0000"+
		"\u0000;<\u0005\u0016\u0000\u0000<>\u0003\u0006\u0003\u0000=:\u0001\u0000"+
		"\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@\u0005\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000BC\u0006\u0003\uffff\uffff\u0000CD\u0003\b\u0004\u0000DJ\u0001\u0000"+
		"\u0000\u0000EF\n\u0002\u0000\u0000FG\u0005\u0017\u0000\u0000GI\u0003\b"+
		"\u0004\u0000HE\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0007\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000MN\u0006\u0004\uffff\uffff\u0000NO\u0003"+
		"\n\u0005\u0000OU\u0001\u0000\u0000\u0000PQ\n\u0002\u0000\u0000QR\u0005"+
		"\u0018\u0000\u0000RT\u0003\n\u0005\u0000SP\u0001\u0000\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"V\t\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005\u0019\u0000"+
		"\u0000Y\\\u0003\f\u0006\u0000Z\\\u0003\f\u0006\u0000[X\u0001\u0000\u0000"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0006"+
		"\u0006\uffff\uffff\u0000^_\u0003\u000e\u0007\u0000_h\u0001\u0000\u0000"+
		"\u0000`a\n\u0003\u0000\u0000ab\u0005\u0012\u0000\u0000bg\u0003\u000e\u0007"+
		"\u0000cd\n\u0002\u0000\u0000de\u0005\u0013\u0000\u0000eg\u0003\u000e\u0007"+
		"\u0000f`\u0001\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000gj\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\r\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0006\u0007\uffff\uffff"+
		"\u0000lm\u0003\u0010\b\u0000mv\u0001\u0000\u0000\u0000no\n\u0003\u0000"+
		"\u0000op\u0005\u0014\u0000\u0000pu\u0003\u0010\b\u0000qr\n\u0002\u0000"+
		"\u0000rs\u0005\u0015\u0000\u0000su\u0003\u0010\b\u0000tn\u0001\u0000\u0000"+
		"\u0000tq\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000w\u000f\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000yz\u0005\u0002\u0000\u0000z{\u0003\u0004\u0002"+
		"\u0000{|\u0005\u0003\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}\u007f"+
		"\u0003\u0012\t\u0000~y\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000"+
		"\u007f\u0011\u0001\u0000\u0000\u0000\u0080\u0081\u0007\u0000\u0000\u0000"+
		"\u0081\u0013\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0007\u0000\u0000"+
		"\u0083\u0084\u0003\u0016\u000b\u0000\u0084\u0085\u0003\u0018\f\u0000\u0085"+
		"\u0086\u0005\b\u0000\u0000\u0086\u0015\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005\r\u0000\u0000\u0088\u0017\u0001\u0000\u0000\u0000\u0089\u008b\u0003"+
		"\u0002\u0001\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0005"+
		"\u001a\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008e\u0091\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0019\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u0004\u0000\u0000\u0093\u0094\u0003"+
		"\u0004\u0002\u0000\u0094\u0097\u0003\u001c\u000e\u0000\u0095\u0096\u0005"+
		"\u0005\u0000\u0000\u0096\u0098\u0003\u001c\u000e\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005\u0006\u0000\u0000\u009a\u001b\u0001"+
		"\u0000\u0000\u0000\u009b\u009d\u0003\u0002\u0001\u0000\u009c\u009b\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0005\u001a\u0000\u0000\u009f\u009c\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u001d\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u0011!&5?JU[fh"+
		"tv~\u008a\u008f\u0097\u009c\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}