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
		T__0=1, T__1=2, T__2=3, WRITE=4, READREAL=5, READINT=6, READSTRING=7, 
		ID=8, REAL=9, INT=10, STRING=11, BOOL=12, ADD=13, SUB=14, MULT=15, DIV=16, 
		OR=17, AND=18, XOR=19, NEG=20, NEWLINE=21, WS=22;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr0 = 2, RULE_expr1 = 3, RULE_expr2 = 4, 
		RULE_expr3 = 5, RULE_expr4 = 6, RULE_expr5 = 7, RULE_expr6 = 8, RULE_value = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr0", "expr1", "expr2", "expr3", "expr4", "expr5", 
			"expr6", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'print '", "'readr '", "'readi '", "'reads '", 
			null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'||'", "'&&'", 
			"'^'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WRITE", "READREAL", "READINT", "READSTRING", 
			"ID", "REAL", "INT", "STRING", "BOOL", "ADD", "SUB", "MULT", "DIV", "OR", 
			"AND", "XOR", "NEG", "NEWLINE", "WS"
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
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2097648L) != 0)) {
				{
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 496L) != 0)) {
					{
					setState(20);
					stat();
					}
				}

				setState(23);
				match(NEWLINE);
				}
				}
				setState(28);
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
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
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
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(WRITE);
				setState(30);
				expr0(0);
				}
				break;
			case READSTRING:
				_localctx = new ReadstringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(READSTRING);
				setState(32);
				match(ID);
				}
				break;
			case READINT:
				_localctx = new ReadintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(READINT);
				setState(34);
				match(ID);
				}
				break;
			case READREAL:
				_localctx = new ReadrealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				match(READREAL);
				setState(36);
				match(ID);
				}
				break;
			case ID:
				_localctx = new Assign0Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				match(ID);
				setState(38);
				match(T__0);
				setState(39);
				expr0(0);
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

			setState(43);
			expr1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(50);
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
					setState(45);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(46);
					match(OR);
					setState(47);
					expr1(0);
					}
					} 
				}
				setState(52);
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

			setState(54);
			expr2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
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
					setState(56);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(57);
					match(AND);
					setState(58);
					expr2(0);
					}
					} 
				}
				setState(63);
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

			setState(65);
			expr3();
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
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
					setState(67);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(68);
					match(XOR);
					setState(69);
					expr3();
					}
					} 
				}
				setState(74);
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEG:
				_localctx = new NegContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(NEG);
				setState(76);
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
				setState(77);
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

			setState(81);
			expr5(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new Expr4Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(83);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(84);
						match(ADD);
						setState(85);
						expr5(0);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new Expr4Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr4);
						setState(86);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(87);
						match(SUB);
						setState(88);
						expr5(0);
						}
						break;
					}
					} 
				}
				setState(93);
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

			setState(95);
			expr6();
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new Expr5Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr5);
						setState(97);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(98);
						match(MULT);
						setState(99);
						expr6();
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new Expr5Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr5);
						setState(100);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(101);
						match(DIV);
						setState(102);
						expr6();
						}
						break;
					}
					} 
				}
				setState(107);
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(T__1);
				setState(109);
				expr0(0);
				setState(110);
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
				setState(112);
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
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) ) {
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
		"\u0004\u0001\u0016v\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0003\u0000\u0016\b\u0000\u0001"+
		"\u0000\u0005\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u00021\b\u0002\n\u0002\f\u00024\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003<\b\u0003"+
		"\n\u0003\f\u0003?\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004G\b\u0004\n\u0004\f\u0004J\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005O\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006Z\b\u0006\n\u0006\f\u0006]\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007h\b\u0007\n\u0007\f\u0007"+
		"k\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\br\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0000\u0005\u0004\u0006\b\f\u000e\n\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0000\u0001\u0001\u0000\b\fz\u0000\u001a"+
		"\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004*\u0001\u0000"+
		"\u0000\u0000\u00065\u0001\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000"+
		"\nN\u0001\u0000\u0000\u0000\fP\u0001\u0000\u0000\u0000\u000e^\u0001\u0000"+
		"\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012s\u0001\u0000\u0000\u0000"+
		"\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000"+
		"\u0017\u0019\u0005\u0015\u0000\u0000\u0018\u0015\u0001\u0000\u0000\u0000"+
		"\u0019\u001c\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0001\u0001\u0000\u0000\u0000"+
		"\u001c\u001a\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0004\u0000\u0000"+
		"\u001e)\u0003\u0004\u0002\u0000\u001f \u0005\u0007\u0000\u0000 )\u0005"+
		"\b\u0000\u0000!\"\u0005\u0006\u0000\u0000\")\u0005\b\u0000\u0000#$\u0005"+
		"\u0005\u0000\u0000$)\u0005\b\u0000\u0000%&\u0005\b\u0000\u0000&\'\u0005"+
		"\u0001\u0000\u0000\')\u0003\u0004\u0002\u0000(\u001d\u0001\u0000\u0000"+
		"\u0000(\u001f\u0001\u0000\u0000\u0000(!\u0001\u0000\u0000\u0000(#\u0001"+
		"\u0000\u0000\u0000(%\u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000"+
		"\u0000*+\u0006\u0002\uffff\uffff\u0000+,\u0003\u0006\u0003\u0000,2\u0001"+
		"\u0000\u0000\u0000-.\n\u0002\u0000\u0000./\u0005\u0011\u0000\u0000/1\u0003"+
		"\u0006\u0003\u00000-\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u0005\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000056\u0006\u0003\uffff\uffff\u0000"+
		"67\u0003\b\u0004\u00007=\u0001\u0000\u0000\u000089\n\u0002\u0000\u0000"+
		"9:\u0005\u0012\u0000\u0000:<\u0003\b\u0004\u0000;8\u0001\u0000\u0000\u0000"+
		"<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>\u0007\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0006"+
		"\u0004\uffff\uffff\u0000AB\u0003\n\u0005\u0000BH\u0001\u0000\u0000\u0000"+
		"CD\n\u0002\u0000\u0000DE\u0005\u0013\u0000\u0000EG\u0003\n\u0005\u0000"+
		"FC\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000I\t\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000KL\u0005\u0014\u0000\u0000LO\u0003\f\u0006\u0000MO\u0003\f"+
		"\u0006\u0000NK\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000O\u000b"+
		"\u0001\u0000\u0000\u0000PQ\u0006\u0006\uffff\uffff\u0000QR\u0003\u000e"+
		"\u0007\u0000R[\u0001\u0000\u0000\u0000ST\n\u0003\u0000\u0000TU\u0005\r"+
		"\u0000\u0000UZ\u0003\u000e\u0007\u0000VW\n\u0002\u0000\u0000WX\u0005\u000e"+
		"\u0000\u0000XZ\u0003\u000e\u0007\u0000YS\u0001\u0000\u0000\u0000YV\u0001"+
		"\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\\r\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000^_\u0006\u0007\uffff\uffff\u0000_`\u0003\u0010\b\u0000`i\u0001"+
		"\u0000\u0000\u0000ab\n\u0003\u0000\u0000bc\u0005\u000f\u0000\u0000ch\u0003"+
		"\u0010\b\u0000de\n\u0002\u0000\u0000ef\u0005\u0010\u0000\u0000fh\u0003"+
		"\u0010\b\u0000ga\u0001\u0000\u0000\u0000gd\u0001\u0000\u0000\u0000hk\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"j\u000f\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\u0002"+
		"\u0000\u0000mn\u0003\u0004\u0002\u0000no\u0005\u0003\u0000\u0000or\u0001"+
		"\u0000\u0000\u0000pr\u0003\u0012\t\u0000ql\u0001\u0000\u0000\u0000qp\u0001"+
		"\u0000\u0000\u0000r\u0011\u0001\u0000\u0000\u0000st\u0007\u0000\u0000"+
		"\u0000t\u0013\u0001\u0000\u0000\u0000\f\u0015\u001a(2=HNY[giq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}