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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PRINT=7, READ=8, TOINT=9, 
		TOREAL=10, ADD=11, SUB=12, MULT=13, DIV=14, REAL=15, INT=16, ID=17, STRING=18, 
		NEWLINE=19, WS=20;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr0 = 2, RULE_expr1 = 3, RULE_expr2 = 4, 
		RULE_array_int = 5, RULE_array_real = 6, RULE_array_string = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr0", "expr1", "expr2", "array_int", "array_real", 
			"array_string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'['", "','", "']'", "'print '", "'read '", 
			"'(int)'", "'(real)'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PRINT", "READ", "TOINT", "TOREAL", 
			"ADD", "SUB", "MULT", "DIV", "REAL", "INT", "ID", "STRING", "NEWLINE", 
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
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 655744L) != 0)) {
				{
				{
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131456L) != 0)) {
					{
					setState(16);
					stat();
					}
				}

				setState(19);
				match(NEWLINE);
				}
				}
				setState(24);
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
	public static class PrintContext extends StatContext {
		public TerminalNode PRINT() { return getToken(CompilatorParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitPrint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends StatContext {
		public TerminalNode READ() { return getToken(CompilatorParser.READ, 0); }
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
		public ReadContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitRead(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArraystringContext extends StatContext {
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
		public Array_stringContext array_string() {
			return getRuleContext(Array_stringContext.class,0);
		}
		public ArraystringContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterArraystring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitArraystring(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends StatContext {
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
		public TerminalNode STRING() { return getToken(CompilatorParser.STRING, 0); }
		public StringContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitString(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayintContext extends StatContext {
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
		public Array_intContext array_int() {
			return getRuleContext(Array_intContext.class,0);
		}
		public ArrayintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterArrayint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitArrayint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayrealContext extends StatContext {
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
		public Array_realContext array_real() {
			return getRuleContext(Array_realContext.class,0);
		}
		public ArrayrealContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterArrayreal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitArrayreal(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends StatContext {
		public TerminalNode ID() { return getToken(CompilatorParser.ID, 0); }
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

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(ID);
				setState(26);
				match(T__0);
				setState(27);
				expr0();
				}
				break;
			case 2:
				_localctx = new ArrayintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(ID);
				setState(29);
				match(T__0);
				setState(30);
				array_int();
				}
				break;
			case 3:
				_localctx = new ArrayrealContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(ID);
				setState(32);
				match(T__0);
				setState(33);
				array_real();
				}
				break;
			case 4:
				_localctx = new ArraystringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				match(ID);
				setState(35);
				match(T__0);
				setState(36);
				array_string();
				}
				break;
			case 5:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				match(ID);
				setState(38);
				match(T__0);
				setState(39);
				match(STRING);
				}
				break;
			case 6:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				match(PRINT);
				setState(41);
				match(ID);
				}
				break;
			case 7:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				match(READ);
				setState(43);
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
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode ADD() { return getToken(CompilatorParser.ADD, 0); }
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
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode SUB() { return getToken(CompilatorParser.SUB, 0); }
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				expr1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				expr1();
				setState(48);
				match(ADD);
				setState(49);
				expr1();
				}
				break;
			case 3:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				expr1();
				setState(52);
				match(SUB);
				setState(53);
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
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode DIV() { return getToken(CompilatorParser.DIV, 0); }
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
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode MULT() { return getToken(CompilatorParser.MULT, 0); }
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
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				expr2();
				}
				break;
			case 2:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				expr2();
				setState(59);
				match(MULT);
				setState(60);
				expr2();
				}
				break;
			case 3:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				expr2();
				setState(63);
				match(DIV);
				setState(64);
				expr2();
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
	@SuppressWarnings("CheckReturnValue")
	public static class TointContext extends Expr2Context {
		public TerminalNode TOINT() { return getToken(CompilatorParser.TOINT, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TointContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterToint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitToint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TorealContext extends Expr2Context {
		public TerminalNode TOREAL() { return getToken(CompilatorParser.TOREAL, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TorealContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterToreal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitToreal(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealContext extends Expr2Context {
		public TerminalNode REAL() { return getToken(CompilatorParser.REAL, 0); }
		public RealContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitReal(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends Expr2Context {
		public TerminalNode INT() { return getToken(CompilatorParser.INT, 0); }
		public IntContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitInt(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr2);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(REAL);
				}
				break;
			case TOINT:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(TOINT);
				setState(71);
				expr2();
				}
				break;
			case TOREAL:
				_localctx = new TorealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(TOREAL);
				setState(73);
				expr2();
				}
				break;
			case T__1:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				match(T__1);
				setState(75);
				expr0();
				setState(76);
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
	public static class Array_intContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(CompilatorParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CompilatorParser.INT, i);
		}
		public Array_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterArray_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitArray_int(this);
		}
	}

	public final Array_intContext array_int() throws RecognitionException {
		Array_intContext _localctx = new Array_intContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__3);
			setState(81);
			match(INT);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(82);
				match(T__4);
				setState(83);
				match(INT);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(T__5);
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
	public static class Array_realContext extends ParserRuleContext {
		public List<TerminalNode> REAL() { return getTokens(CompilatorParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(CompilatorParser.REAL, i);
		}
		public Array_realContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterArray_real(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitArray_real(this);
		}
	}

	public final Array_realContext array_real() throws RecognitionException {
		Array_realContext _localctx = new Array_realContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__3);
			setState(92);
			match(REAL);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(93);
				match(T__4);
				setState(94);
				match(REAL);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(T__5);
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
	public static class Array_stringContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(CompilatorParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(CompilatorParser.STRING, i);
		}
		public Array_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).enterArray_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilatorListener ) ((CompilatorListener)listener).exitArray_string(this);
		}
	}

	public final Array_stringContext array_string() throws RecognitionException {
		Array_stringContext _localctx = new Array_stringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__3);
			setState(103);
			match(STRING);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(104);
				match(T__4);
				setState(105);
				match(STRING);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(T__5);
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
		"\u0004\u0001\u0014r\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0003\u0000\u0012\b\u0000\u0001\u0000\u0005\u0000\u0015\b\u0000"+
		"\n\u0000\f\u0000\u0018\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001-\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u00028\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005U\b\u0005\n\u0005\f\u0005X\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006`\b\u0006\n\u0006\f\u0006c\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007k\b\u0007\n\u0007"+
		"\f\u0007n\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0000\u0000|\u0000\u0016\u0001\u0000\u0000"+
		"\u0000\u0002,\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006"+
		"B\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000\u0000\nP\u0001\u0000\u0000"+
		"\u0000\f[\u0001\u0000\u0000\u0000\u000ef\u0001\u0000\u0000\u0000\u0010"+
		"\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013"+
		"\u0015\u0005\u0013\u0000\u0000\u0014\u0011\u0001\u0000\u0000\u0000\u0015"+
		"\u0018\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0001\u0000\u0000\u0000\u0017\u0001\u0001\u0000\u0000\u0000\u0018"+
		"\u0016\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0011\u0000\u0000\u001a"+
		"\u001b\u0005\u0001\u0000\u0000\u001b-\u0003\u0004\u0002\u0000\u001c\u001d"+
		"\u0005\u0011\u0000\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e-\u0003"+
		"\n\u0005\u0000\u001f \u0005\u0011\u0000\u0000 !\u0005\u0001\u0000\u0000"+
		"!-\u0003\f\u0006\u0000\"#\u0005\u0011\u0000\u0000#$\u0005\u0001\u0000"+
		"\u0000$-\u0003\u000e\u0007\u0000%&\u0005\u0011\u0000\u0000&\'\u0005\u0001"+
		"\u0000\u0000\'-\u0005\u0012\u0000\u0000()\u0005\u0007\u0000\u0000)-\u0005"+
		"\u0011\u0000\u0000*+\u0005\b\u0000\u0000+-\u0005\u0011\u0000\u0000,\u0019"+
		"\u0001\u0000\u0000\u0000,\u001c\u0001\u0000\u0000\u0000,\u001f\u0001\u0000"+
		"\u0000\u0000,\"\u0001\u0000\u0000\u0000,%\u0001\u0000\u0000\u0000,(\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-\u0003\u0001\u0000\u0000"+
		"\u0000.8\u0003\u0006\u0003\u0000/0\u0003\u0006\u0003\u000001\u0005\u000b"+
		"\u0000\u000012\u0003\u0006\u0003\u000028\u0001\u0000\u0000\u000034\u0003"+
		"\u0006\u0003\u000045\u0005\f\u0000\u000056\u0003\u0006\u0003\u000068\u0001"+
		"\u0000\u0000\u00007.\u0001\u0000\u0000\u00007/\u0001\u0000\u0000\u0000"+
		"73\u0001\u0000\u0000\u00008\u0005\u0001\u0000\u0000\u00009C\u0003\b\u0004"+
		"\u0000:;\u0003\b\u0004\u0000;<\u0005\r\u0000\u0000<=\u0003\b\u0004\u0000"+
		"=C\u0001\u0000\u0000\u0000>?\u0003\b\u0004\u0000?@\u0005\u000e\u0000\u0000"+
		"@A\u0003\b\u0004\u0000AC\u0001\u0000\u0000\u0000B9\u0001\u0000\u0000\u0000"+
		"B:\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000C\u0007\u0001\u0000"+
		"\u0000\u0000DO\u0005\u0010\u0000\u0000EO\u0005\u000f\u0000\u0000FG\u0005"+
		"\t\u0000\u0000GO\u0003\b\u0004\u0000HI\u0005\n\u0000\u0000IO\u0003\b\u0004"+
		"\u0000JK\u0005\u0002\u0000\u0000KL\u0003\u0004\u0002\u0000LM\u0005\u0003"+
		"\u0000\u0000MO\u0001\u0000\u0000\u0000ND\u0001\u0000\u0000\u0000NE\u0001"+
		"\u0000\u0000\u0000NF\u0001\u0000\u0000\u0000NH\u0001\u0000\u0000\u0000"+
		"NJ\u0001\u0000\u0000\u0000O\t\u0001\u0000\u0000\u0000PQ\u0005\u0004\u0000"+
		"\u0000QV\u0005\u0010\u0000\u0000RS\u0005\u0005\u0000\u0000SU\u0005\u0010"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000YZ\u0005\u0006\u0000\u0000Z\u000b\u0001\u0000"+
		"\u0000\u0000[\\\u0005\u0004\u0000\u0000\\a\u0005\u000f\u0000\u0000]^\u0005"+
		"\u0005\u0000\u0000^`\u0005\u000f\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\u0006"+
		"\u0000\u0000e\r\u0001\u0000\u0000\u0000fg\u0005\u0004\u0000\u0000gl\u0005"+
		"\u0012\u0000\u0000hi\u0005\u0005\u0000\u0000ik\u0005\u0012\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000op\u0005\u0006\u0000\u0000p\u000f\u0001\u0000\u0000\u0000"+
		"\t\u0011\u0016,7BNVal";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}