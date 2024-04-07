// Generated from Compilator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CompilatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PRINT=7, READ=8, TOINT=9, 
		TOREAL=10, ADD=11, SUB=12, MULT=13, DIV=14, REAL=15, INT=16, ID=17, STRING=18, 
		NEWLINE=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "PRINT", "READ", "TOINT", 
			"TOREAL", "ADD", "SUB", "MULT", "DIV", "REAL", "INT", "ID", "STRING", 
			"NEWLINE", "WS"
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


	public CompilatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Compilator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 19:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u0081\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0004\u000eY\b\u000e\u000b\u000e\f\u000e"+
		"Z\u0001\u000e\u0001\u000e\u0004\u000e_\b\u000e\u000b\u000e\f\u000e`\u0001"+
		"\u000f\u0004\u000fd\b\u000f\u000b\u000f\f\u000fe\u0001\u0010\u0004\u0010"+
		"i\b\u0010\u000b\u0010\f\u0010j\u0001\u0011\u0001\u0011\u0005\u0011o\b"+
		"\u0011\n\u0011\f\u0011r\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0003"+
		"\u0012w\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013|\b\u0013"+
		"\u000b\u0013\f\u0013}\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0003\u0002"+
		"\u0000AZaz\u0002\u0000\"\"\\\\\u0002\u0000\t\t  \u0087\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001\u0000"+
		"\u0000\u0000\u0005-\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000"+
		"\t1\u0001\u0000\u0000\u0000\u000b3\u0001\u0000\u0000\u0000\r5\u0001\u0000"+
		"\u0000\u0000\u000f<\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000"+
		"\u0013H\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017Q"+
		"\u0001\u0000\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001bU\u0001\u0000"+
		"\u0000\u0000\u001dX\u0001\u0000\u0000\u0000\u001fc\u0001\u0000\u0000\u0000"+
		"!h\u0001\u0000\u0000\u0000#l\u0001\u0000\u0000\u0000%v\u0001\u0000\u0000"+
		"\u0000\'{\u0001\u0000\u0000\u0000)*\u0005=\u0000\u0000*\u0002\u0001\u0000"+
		"\u0000\u0000+,\u0005(\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005"+
		")\u0000\u0000.\u0006\u0001\u0000\u0000\u0000/0\u0005[\u0000\u00000\b\u0001"+
		"\u0000\u0000\u000012\u0005,\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005"+
		"]\u0000\u00004\f\u0001\u0000\u0000\u000056\u0005p\u0000\u000067\u0005"+
		"r\u0000\u000078\u0005i\u0000\u000089\u0005n\u0000\u00009:\u0005t\u0000"+
		"\u0000:;\u0005 \u0000\u0000;\u000e\u0001\u0000\u0000\u0000<=\u0005r\u0000"+
		"\u0000=>\u0005e\u0000\u0000>?\u0005a\u0000\u0000?@\u0005d\u0000\u0000"+
		"@A\u0005 \u0000\u0000A\u0010\u0001\u0000\u0000\u0000BC\u0005(\u0000\u0000"+
		"CD\u0005i\u0000\u0000DE\u0005n\u0000\u0000EF\u0005t\u0000\u0000FG\u0005"+
		")\u0000\u0000G\u0012\u0001\u0000\u0000\u0000HI\u0005(\u0000\u0000IJ\u0005"+
		"r\u0000\u0000JK\u0005e\u0000\u0000KL\u0005a\u0000\u0000LM\u0005l\u0000"+
		"\u0000MN\u0005)\u0000\u0000N\u0014\u0001\u0000\u0000\u0000OP\u0005+\u0000"+
		"\u0000P\u0016\u0001\u0000\u0000\u0000QR\u0005-\u0000\u0000R\u0018\u0001"+
		"\u0000\u0000\u0000ST\u0005*\u0000\u0000T\u001a\u0001\u0000\u0000\u0000"+
		"UV\u0005/\u0000\u0000V\u001c\u0001\u0000\u0000\u0000WY\u000209\u0000X"+
		"W\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0005."+
		"\u0000\u0000]_\u000209\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u001e\u0001"+
		"\u0000\u0000\u0000bd\u000209\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f \u0001"+
		"\u0000\u0000\u0000gi\u0007\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000k\"\u0001\u0000\u0000\u0000lp\u0005\"\u0000\u0000mo\b\u0001\u0000"+
		"\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000st\u0005\"\u0000\u0000t$\u0001\u0000\u0000\u0000uw\u0005"+
		"\r\u0000\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xy\u0005\n\u0000\u0000y&\u0001\u0000\u0000\u0000z|\u0007"+
		"\u0002\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0006\u0013\u0000\u0000\u0080(\u0001\u0000\u0000"+
		"\u0000\b\u0000Z`ejpv}\u0001\u0001\u0013\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}