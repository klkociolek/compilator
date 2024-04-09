// Generated from Compilator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CompilatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WRITE=4, READREAL=5, READINT=6, READSTRING=7, 
		ID=8, REAL=9, INT=10, ADD=11, SUB=12, MULT=13, DIV=14, STRING=15, NEWLINE=16, 
		WS=17;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr0 = 2, RULE_expr1 = 3, RULE_expr2 = 4, 
		RULE_value = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr0", "expr1", "expr2", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'print '", "'readr '", "'readi '", "'reads '", 
			null, null, null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WRITE", "READREAL", "READINT", "READSTRING", 
			"ID", "REAL", "INT", "ADD", "SUB", "MULT", "DIV", "STRING", "NEWLINE", 
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
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 66032L) != 0)) {
				{
				{
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 496L) != 0)) {
					{
					setState(12);
					stat();
					}
				}

				setState(15);
				match(NEWLINE);
				}
				}
				setState(20);
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
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(WRITE);
				setState(22);
				match(ID);
				}
				break;
			case READSTRING:
				_localctx = new ReadstringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(READSTRING);
				setState(24);
				match(ID);
				}
				break;
			case READINT:
				_localctx = new ReadintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				match(READINT);
				setState(26);
				match(ID);
				}
				break;
			case READREAL:
				_localctx = new ReadrealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				match(READREAL);
				setState(28);
				match(ID);
				}
				break;
			case ID:
				_localctx = new Assign0Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(29);
				match(ID);
				setState(30);
				match(T__0);
				setState(31);
				expr0();
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
	public static class Single0Context extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Single0Context(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterSingle0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitSingle0(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode ADD() { return getToken(CompilatorParser.ADD, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public AddContext(Expr0Context ctx) { copyFrom(ctx); }
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
	public static class SubContext extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode SUB() { return getToken(CompilatorParser.SUB, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public SubContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitSub(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr0);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				expr1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				expr1();
				setState(36);
				match(ADD);
				setState(37);
				expr0();
				}
				break;
			case 3:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				expr1();
				setState(40);
				match(SUB);
				setState(41);
				expr0();
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
	public static class DivContext extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode DIV() { return getToken(CompilatorParser.DIV, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public DivContext(Expr1Context ctx) { copyFrom(ctx); }
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
	public static class Single1Context extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Single1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterSingle1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitSingle1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode MULT() { return getToken(CompilatorParser.MULT, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public MultContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitMult(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr1);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				expr2();
				}
				break;
			case 2:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				expr2();
				setState(47);
				match(MULT);
				setState(48);
				expr1();
				}
				break;
			case 3:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				expr2();
				setState(51);
				match(DIV);
				setState(52);
				expr1();
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
	public static class ValContext extends Expr2Context {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitVal(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParContext extends Expr2Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public ParContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitPar(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr2);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case REAL:
			case INT:
			case STRING:
				_localctx = new ValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				value();
				}
				break;
			case T__1:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__1);
				setState(58);
				expr0();
				setState(59);
				match(T__2);
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
		enterRule(_localctx, 10, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34560L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0011B\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0003\u0000\u000e\b\u0000\u0001\u0000\u0005"+
		"\u0000\u0011\b\u0000\n\u0000\f\u0000\u0014\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002,\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u00037\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004>\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0001"+
		"\u0002\u0000\b\n\u000f\u000fF\u0000\u0012\u0001\u0000\u0000\u0000\u0002"+
		" \u0001\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u00066\u0001"+
		"\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000\u0000"+
		"\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000\u0000\u0000\r\u000e\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0011\u0005"+
		"\u0010\u0000\u0000\u0010\r\u0001\u0000\u0000\u0000\u0011\u0014\u0001\u0000"+
		"\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000"+
		"\u0000\u0000\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0005\u0004\u0000\u0000\u0016!\u0005\b\u0000"+
		"\u0000\u0017\u0018\u0005\u0007\u0000\u0000\u0018!\u0005\b\u0000\u0000"+
		"\u0019\u001a\u0005\u0006\u0000\u0000\u001a!\u0005\b\u0000\u0000\u001b"+
		"\u001c\u0005\u0005\u0000\u0000\u001c!\u0005\b\u0000\u0000\u001d\u001e"+
		"\u0005\b\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f!\u0003"+
		"\u0004\u0002\u0000 \u0015\u0001\u0000\u0000\u0000 \u0017\u0001\u0000\u0000"+
		"\u0000 \u0019\u0001\u0000\u0000\u0000 \u001b\u0001\u0000\u0000\u0000 "+
		"\u001d\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\",\u0003"+
		"\u0006\u0003\u0000#$\u0003\u0006\u0003\u0000$%\u0005\u000b\u0000\u0000"+
		"%&\u0003\u0004\u0002\u0000&,\u0001\u0000\u0000\u0000\'(\u0003\u0006\u0003"+
		"\u0000()\u0005\f\u0000\u0000)*\u0003\u0004\u0002\u0000*,\u0001\u0000\u0000"+
		"\u0000+\"\u0001\u0000\u0000\u0000+#\u0001\u0000\u0000\u0000+\'\u0001\u0000"+
		"\u0000\u0000,\u0005\u0001\u0000\u0000\u0000-7\u0003\b\u0004\u0000./\u0003"+
		"\b\u0004\u0000/0\u0005\r\u0000\u000001\u0003\u0006\u0003\u000017\u0001"+
		"\u0000\u0000\u000023\u0003\b\u0004\u000034\u0005\u000e\u0000\u000045\u0003"+
		"\u0006\u0003\u000057\u0001\u0000\u0000\u00006-\u0001\u0000\u0000\u0000"+
		"6.\u0001\u0000\u0000\u000062\u0001\u0000\u0000\u00007\u0007\u0001\u0000"+
		"\u0000\u00008>\u0003\n\u0005\u00009:\u0005\u0002\u0000\u0000:;\u0003\u0004"+
		"\u0002\u0000;<\u0005\u0003\u0000\u0000<>\u0001\u0000\u0000\u0000=8\u0001"+
		"\u0000\u0000\u0000=9\u0001\u0000\u0000\u0000>\t\u0001\u0000\u0000\u0000"+
		"?@\u0007\u0000\u0000\u0000@\u000b\u0001\u0000\u0000\u0000\u0006\r\u0012"+
		" +6=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}