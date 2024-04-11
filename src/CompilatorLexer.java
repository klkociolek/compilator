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
		T__0=1, T__1=2, T__2=3, WRITE=4, READREAL=5, READINT=6, READSTRING=7, 
		ID=8, REAL=9, INT=10, ADD=11, SUB=12, MULT=13, DIV=14, STRING=15, NEWLINE=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "WRITE", "READREAL", "READINT", "READSTRING", 
			"ID", "REAL", "INT", "ADD", "SUB", "MULT", "DIV", "STRING", "NEWLINE", 
			"WS"
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
		"\u0004\u0000\u0011w\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0004\u0007G\b\u0007\u000b\u0007\f\u0007"+
		"H\u0001\b\u0004\bL\b\b\u000b\b\f\bM\u0001\b\u0001\b\u0004\bR\b\b\u000b"+
		"\b\f\bS\u0001\t\u0004\tW\b\t\u000b\t\f\tX\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005"+
		"\u000ee\b\u000e\n\u000e\f\u000eh\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0003\u000fm\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004"+
		"\u0010r\b\u0010\u000b\u0010\f\u0010s\u0001\u0010\u0001\u0010\u0000\u0000"+
		"\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0003\u0002\u0000AZaz\u0002"+
		"\u0000\"\"\\\\\u0002\u0000\t\t  }\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000"+
		"\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000"+
		"\u0000\u0007)\u0001\u0000\u0000\u0000\t0\u0001\u0000\u0000\u0000\u000b"+
		"7\u0001\u0000\u0000\u0000\r>\u0001\u0000\u0000\u0000\u000fF\u0001\u0000"+
		"\u0000\u0000\u0011K\u0001\u0000\u0000\u0000\u0013V\u0001\u0000\u0000\u0000"+
		"\u0015Z\u0001\u0000\u0000\u0000\u0017\\\u0001\u0000\u0000\u0000\u0019"+
		"^\u0001\u0000\u0000\u0000\u001b`\u0001\u0000\u0000\u0000\u001db\u0001"+
		"\u0000\u0000\u0000\u001fl\u0001\u0000\u0000\u0000!q\u0001\u0000\u0000"+
		"\u0000#$\u0005=\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005(\u0000"+
		"\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005)\u0000\u0000(\u0006\u0001"+
		"\u0000\u0000\u0000)*\u0005p\u0000\u0000*+\u0005r\u0000\u0000+,\u0005i"+
		"\u0000\u0000,-\u0005n\u0000\u0000-.\u0005t\u0000\u0000./\u0005 \u0000"+
		"\u0000/\b\u0001\u0000\u0000\u000001\u0005r\u0000\u000012\u0005e\u0000"+
		"\u000023\u0005a\u0000\u000034\u0005d\u0000\u000045\u0005r\u0000\u0000"+
		"56\u0005 \u0000\u00006\n\u0001\u0000\u0000\u000078\u0005r\u0000\u0000"+
		"89\u0005e\u0000\u00009:\u0005a\u0000\u0000:;\u0005d\u0000\u0000;<\u0005"+
		"i\u0000\u0000<=\u0005 \u0000\u0000=\f\u0001\u0000\u0000\u0000>?\u0005"+
		"r\u0000\u0000?@\u0005e\u0000\u0000@A\u0005a\u0000\u0000AB\u0005d\u0000"+
		"\u0000BC\u0005s\u0000\u0000CD\u0005 \u0000\u0000D\u000e\u0001\u0000\u0000"+
		"\u0000EG\u0007\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0010"+
		"\u0001\u0000\u0000\u0000JL\u000209\u0000KJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OQ\u0005.\u0000\u0000PR\u000209\u0000QP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000T\u0012\u0001\u0000\u0000\u0000UW\u000209\u0000"+
		"VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0005"+
		"+\u0000\u0000[\u0016\u0001\u0000\u0000\u0000\\]\u0005-\u0000\u0000]\u0018"+
		"\u0001\u0000\u0000\u0000^_\u0005*\u0000\u0000_\u001a\u0001\u0000\u0000"+
		"\u0000`a\u0005/\u0000\u0000a\u001c\u0001\u0000\u0000\u0000bf\u0005\"\u0000"+
		"\u0000ce\b\u0001\u0000\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\"\u0000\u0000j\u001e\u0001"+
		"\u0000\u0000\u0000km\u0005\r\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005\n\u0000\u0000o \u0001"+
		"\u0000\u0000\u0000pr\u0007\u0002\u0000\u0000qp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0006\u0010\u0000\u0000v\"\u0001\u0000"+
		"\u0000\u0000\b\u0000HMSXfls\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}