// Generated from Compilator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CompilatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WRITE=4, READREAL=5, READINT=6, READSTRING=7, 
		ID=8, REAL=9, INT=10, STRING=11, BOOL=12, ADD=13, SUB=14, MULT=15, DIV=16, 
		OR=17, AND=18, XOR=19, NEG=20, NEWLINE=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "WRITE", "READREAL", "READINT", "READSTRING", 
			"ID", "REAL", "INT", "STRING", "BOOL", "ADD", "SUB", "MULT", "DIV", "OR", 
			"AND", "XOR", "NEG", "NEWLINE", "WS"
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
		"\u0004\u0000\u0016\u0096\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0004\u0007Q\b\u0007\u000b\u0007\f\u0007R\u0001\b\u0004\b"+
		"V\b\b\u000b\b\f\bW\u0001\b\u0001\b\u0004\b\\\b\b\u000b\b\f\b]\u0001\t"+
		"\u0004\ta\b\t\u000b\t\f\tb\u0001\n\u0001\n\u0005\ng\b\n\n\n\f\nj\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bw\b\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0003"+
		"\u0014\u008c\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015\u0091"+
		"\b\u0015\u000b\u0015\f\u0015\u0092\u0001\u0015\u0001\u0015\u0000\u0000"+
		"\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001"+
		"\u0000\u0003\u0002\u0000AZaz\u0002\u0000\"\"\\\\\u0002\u0000\t\t  \u009d"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u0003/"+
		"\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u00073\u0001\u0000"+
		"\u0000\u0000\t:\u0001\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000"+
		"\rH\u0001\u0000\u0000\u0000\u000fP\u0001\u0000\u0000\u0000\u0011U\u0001"+
		"\u0000\u0000\u0000\u0013`\u0001\u0000\u0000\u0000\u0015d\u0001\u0000\u0000"+
		"\u0000\u0017v\u0001\u0000\u0000\u0000\u0019x\u0001\u0000\u0000\u0000\u001b"+
		"z\u0001\u0000\u0000\u0000\u001d|\u0001\u0000\u0000\u0000\u001f~\u0001"+
		"\u0000\u0000\u0000!\u0080\u0001\u0000\u0000\u0000#\u0083\u0001\u0000\u0000"+
		"\u0000%\u0086\u0001\u0000\u0000\u0000\'\u0088\u0001\u0000\u0000\u0000"+
		")\u008b\u0001\u0000\u0000\u0000+\u0090\u0001\u0000\u0000\u0000-.\u0005"+
		"=\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005(\u0000\u00000\u0004"+
		"\u0001\u0000\u0000\u000012\u0005)\u0000\u00002\u0006\u0001\u0000\u0000"+
		"\u000034\u0005p\u0000\u000045\u0005r\u0000\u000056\u0005i\u0000\u0000"+
		"67\u0005n\u0000\u000078\u0005t\u0000\u000089\u0005 \u0000\u00009\b\u0001"+
		"\u0000\u0000\u0000:;\u0005r\u0000\u0000;<\u0005e\u0000\u0000<=\u0005a"+
		"\u0000\u0000=>\u0005d\u0000\u0000>?\u0005r\u0000\u0000?@\u0005 \u0000"+
		"\u0000@\n\u0001\u0000\u0000\u0000AB\u0005r\u0000\u0000BC\u0005e\u0000"+
		"\u0000CD\u0005a\u0000\u0000DE\u0005d\u0000\u0000EF\u0005i\u0000\u0000"+
		"FG\u0005 \u0000\u0000G\f\u0001\u0000\u0000\u0000HI\u0005r\u0000\u0000"+
		"IJ\u0005e\u0000\u0000JK\u0005a\u0000\u0000KL\u0005d\u0000\u0000LM\u0005"+
		"s\u0000\u0000MN\u0005 \u0000\u0000N\u000e\u0001\u0000\u0000\u0000OQ\u0007"+
		"\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u0010\u0001\u0000"+
		"\u0000\u0000TV\u000209\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000Y[\u0005.\u0000\u0000Z\\\u000209\u0000[Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^\u0012\u0001\u0000\u0000\u0000_a\u000209\u0000`_\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000c\u0014\u0001\u0000\u0000\u0000dh\u0005\"\u0000\u0000"+
		"eg\b\u0001\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000kl\u0005\"\u0000\u0000l\u0016\u0001\u0000"+
		"\u0000\u0000mn\u0005t\u0000\u0000no\u0005r\u0000\u0000op\u0005u\u0000"+
		"\u0000pw\u0005e\u0000\u0000qr\u0005f\u0000\u0000rs\u0005a\u0000\u0000"+
		"st\u0005l\u0000\u0000tu\u0005s\u0000\u0000uw\u0005e\u0000\u0000vm\u0001"+
		"\u0000\u0000\u0000vq\u0001\u0000\u0000\u0000w\u0018\u0001\u0000\u0000"+
		"\u0000xy\u0005+\u0000\u0000y\u001a\u0001\u0000\u0000\u0000z{\u0005-\u0000"+
		"\u0000{\u001c\u0001\u0000\u0000\u0000|}\u0005*\u0000\u0000}\u001e\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005/\u0000\u0000\u007f \u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005|\u0000\u0000\u0081\u0082\u0005|\u0000\u0000\u0082"+
		"\"\u0001\u0000\u0000\u0000\u0083\u0084\u0005&\u0000\u0000\u0084\u0085"+
		"\u0005&\u0000\u0000\u0085$\u0001\u0000\u0000\u0000\u0086\u0087\u0005^"+
		"\u0000\u0000\u0087&\u0001\u0000\u0000\u0000\u0088\u0089\u0005!\u0000\u0000"+
		"\u0089(\u0001\u0000\u0000\u0000\u008a\u008c\u0005\r\u0000\u0000\u008b"+
		"\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\n\u0000\u0000\u008e*"+
		"\u0001\u0000\u0000\u0000\u008f\u0091\u0007\u0002\u0000\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0006\u0015\u0000\u0000\u0095,\u0001"+
		"\u0000\u0000\u0000\t\u0000RW]bhv\u008b\u0092\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}