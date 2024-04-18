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
		T__0=1, T__1=2, T__2=3, FUNCTION=4, ENDFUNCTION=5, WRITE=6, READREAL=7, 
		READINT=8, READSTRING=9, ID=10, REAL=11, INT=12, STRING=13, BOOL=14, ADD=15, 
		SUB=16, MULT=17, DIV=18, OR=19, AND=20, XOR=21, NEG=22, NEWLINE=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "FUNCTION", "ENDFUNCTION", "WRITE", "READREAL", 
			"READINT", "READSTRING", "ID", "REAL", "INT", "STRING", "BOOL", "ADD", 
			"SUB", "MULT", "DIV", "OR", "AND", "XOR", "NEG", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'function'", "'endfunction'", "'print '", 
			"'readr '", "'readi '", "'reads '", null, null, null, null, null, "'+'", 
			"'-'", "'*'", "'/'", "'||'", "'&&'", "'^'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "FUNCTION", "ENDFUNCTION", "WRITE", "READREAL", 
			"READINT", "READSTRING", "ID", "REAL", "INT", "STRING", "BOOL", "ADD", 
			"SUB", "MULT", "DIV", "OR", "AND", "XOR", "NEG", "NEWLINE", "WS"
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

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u00af\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004"+
		"\tj\b\t\u000b\t\f\tk\u0001\n\u0004\no\b\n\u000b\n\f\np\u0001\n\u0001\n"+
		"\u0004\nu\b\n\u000b\n\f\nv\u0001\u000b\u0004\u000bz\b\u000b\u000b\u000b"+
		"\f\u000b{\u0001\f\u0001\f\u0005\f\u0080\b\f\n\f\f\f\u0083\t\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0090\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0003\u0016\u00a5\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u00aa\b\u0017\u000b\u0017\f"+
		"\u0017\u00ab\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000"+
		"\u0003\u0002\u0000AZaz\u0002\u0000\"\"\\\\\u0002\u0000\t\t  \u00b6\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u00033\u0001\u0000"+
		"\u0000\u0000\u00055\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000"+
		"\t@\u0001\u0000\u0000\u0000\u000bL\u0001\u0000\u0000\u0000\rS\u0001\u0000"+
		"\u0000\u0000\u000fZ\u0001\u0000\u0000\u0000\u0011a\u0001\u0000\u0000\u0000"+
		"\u0013i\u0001\u0000\u0000\u0000\u0015n\u0001\u0000\u0000\u0000\u0017y"+
		"\u0001\u0000\u0000\u0000\u0019}\u0001\u0000\u0000\u0000\u001b\u008f\u0001"+
		"\u0000\u0000\u0000\u001d\u0091\u0001\u0000\u0000\u0000\u001f\u0093\u0001"+
		"\u0000\u0000\u0000!\u0095\u0001\u0000\u0000\u0000#\u0097\u0001\u0000\u0000"+
		"\u0000%\u0099\u0001\u0000\u0000\u0000\'\u009c\u0001\u0000\u0000\u0000"+
		")\u009f\u0001\u0000\u0000\u0000+\u00a1\u0001\u0000\u0000\u0000-\u00a4"+
		"\u0001\u0000\u0000\u0000/\u00a9\u0001\u0000\u0000\u000012\u0005=\u0000"+
		"\u00002\u0002\u0001\u0000\u0000\u000034\u0005(\u0000\u00004\u0004\u0001"+
		"\u0000\u0000\u000056\u0005)\u0000\u00006\u0006\u0001\u0000\u0000\u0000"+
		"78\u0005f\u0000\u000089\u0005u\u0000\u00009:\u0005n\u0000\u0000:;\u0005"+
		"c\u0000\u0000;<\u0005t\u0000\u0000<=\u0005i\u0000\u0000=>\u0005o\u0000"+
		"\u0000>?\u0005n\u0000\u0000?\b\u0001\u0000\u0000\u0000@A\u0005e\u0000"+
		"\u0000AB\u0005n\u0000\u0000BC\u0005d\u0000\u0000CD\u0005f\u0000\u0000"+
		"DE\u0005u\u0000\u0000EF\u0005n\u0000\u0000FG\u0005c\u0000\u0000GH\u0005"+
		"t\u0000\u0000HI\u0005i\u0000\u0000IJ\u0005o\u0000\u0000JK\u0005n\u0000"+
		"\u0000K\n\u0001\u0000\u0000\u0000LM\u0005p\u0000\u0000MN\u0005r\u0000"+
		"\u0000NO\u0005i\u0000\u0000OP\u0005n\u0000\u0000PQ\u0005t\u0000\u0000"+
		"QR\u0005 \u0000\u0000R\f\u0001\u0000\u0000\u0000ST\u0005r\u0000\u0000"+
		"TU\u0005e\u0000\u0000UV\u0005a\u0000\u0000VW\u0005d\u0000\u0000WX\u0005"+
		"r\u0000\u0000XY\u0005 \u0000\u0000Y\u000e\u0001\u0000\u0000\u0000Z[\u0005"+
		"r\u0000\u0000[\\\u0005e\u0000\u0000\\]\u0005a\u0000\u0000]^\u0005d\u0000"+
		"\u0000^_\u0005i\u0000\u0000_`\u0005 \u0000\u0000`\u0010\u0001\u0000\u0000"+
		"\u0000ab\u0005r\u0000\u0000bc\u0005e\u0000\u0000cd\u0005a\u0000\u0000"+
		"de\u0005d\u0000\u0000ef\u0005s\u0000\u0000fg\u0005 \u0000\u0000g\u0012"+
		"\u0001\u0000\u0000\u0000hj\u0007\u0000\u0000\u0000ih\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000l\u0014\u0001\u0000\u0000\u0000mo\u000209\u0000nm\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0005.\u0000\u0000su\u0002"+
		"09\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0016\u0001\u0000\u0000\u0000"+
		"xz\u000209\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{"+
		"y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0018\u0001\u0000"+
		"\u0000\u0000}\u0081\u0005\"\u0000\u0000~\u0080\b\u0001\u0000\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\"\u0000\u0000\u0085\u001a\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"t\u0000\u0000\u0087\u0088\u0005r\u0000\u0000\u0088\u0089\u0005u\u0000"+
		"\u0000\u0089\u0090\u0005e\u0000\u0000\u008a\u008b\u0005f\u0000\u0000\u008b"+
		"\u008c\u0005a\u0000\u0000\u008c\u008d\u0005l\u0000\u0000\u008d\u008e\u0005"+
		"s\u0000\u0000\u008e\u0090\u0005e\u0000\u0000\u008f\u0086\u0001\u0000\u0000"+
		"\u0000\u008f\u008a\u0001\u0000\u0000\u0000\u0090\u001c\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005+\u0000\u0000\u0092\u001e\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005-\u0000\u0000\u0094 \u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005*\u0000\u0000\u0096\"\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"/\u0000\u0000\u0098$\u0001\u0000\u0000\u0000\u0099\u009a\u0005|\u0000"+
		"\u0000\u009a\u009b\u0005|\u0000\u0000\u009b&\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005&\u0000\u0000\u009d\u009e\u0005&\u0000\u0000\u009e(\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005^\u0000\u0000\u00a0*\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005!\u0000\u0000\u00a2,\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a5\u0005\r\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005\n\u0000\u0000\u00a7.\u0001\u0000\u0000\u0000\u00a8\u00aa\u0007"+
		"\u0002\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0006"+
		"\u0017\u0000\u0000\u00ae0\u0001\u0000\u0000\u0000\t\u0000kpv{\u0081\u008f"+
		"\u00a4\u00ab\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}