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
		T__0=1, T__1=2, T__2=3, PRINT=4, READ=5, TOINT=6, TOREAL=7, ADD=8, SUB=9, 
		MULT=10, DIV=11, REAL=12, INT=13, ID=14, STRING=15, NEWLINE=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "PRINT", "READ", "TOINT", "TOREAL", "ADD", "SUB", 
			"MULT", "DIV", "REAL", "INT", "ID", "STRING", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'print '", "'read '", "'(int)'", "'(real)'", 
			"'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "PRINT", "READ", "TOINT", "TOREAL", "ADD", "SUB", 
			"MULT", "DIV", "REAL", "INT", "ID", "STRING", "NEWLINE", "WS"
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
		case 16:
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
		"\u0004\u0000\u0011u\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0004\u000bM\b\u000b\u000b\u000b\f\u000bN\u0001\u000b\u0001\u000b"+
		"\u0004\u000bS\b\u000b\u000b\u000b\f\u000bT\u0001\f\u0004\fX\b\f\u000b"+
		"\f\f\fY\u0001\r\u0004\r]\b\r\u000b\r\f\r^\u0001\u000e\u0001\u000e\u0005"+
		"\u000ec\b\u000e\n\u000e\f\u000ef\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0003\u000fk\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004"+
		"\u0010p\b\u0010\u000b\u0010\f\u0010q\u0001\u0010\u0001\u0010\u0000\u0000"+
		"\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0003\u0002\u0000AZaz\u0002"+
		"\u0000\"\"\\\\\u0002\u0000\t\t  {\u0000\u0001\u0001\u0000\u0000\u0000"+
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
		"6\u0001\u0000\u0000\u0000\r<\u0001\u0000\u0000\u0000\u000fC\u0001\u0000"+
		"\u0000\u0000\u0011E\u0001\u0000\u0000\u0000\u0013G\u0001\u0000\u0000\u0000"+
		"\u0015I\u0001\u0000\u0000\u0000\u0017L\u0001\u0000\u0000\u0000\u0019W"+
		"\u0001\u0000\u0000\u0000\u001b\\\u0001\u0000\u0000\u0000\u001d`\u0001"+
		"\u0000\u0000\u0000\u001fj\u0001\u0000\u0000\u0000!o\u0001\u0000\u0000"+
		"\u0000#$\u0005=\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005(\u0000"+
		"\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005)\u0000\u0000(\u0006\u0001"+
		"\u0000\u0000\u0000)*\u0005p\u0000\u0000*+\u0005r\u0000\u0000+,\u0005i"+
		"\u0000\u0000,-\u0005n\u0000\u0000-.\u0005t\u0000\u0000./\u0005 \u0000"+
		"\u0000/\b\u0001\u0000\u0000\u000001\u0005r\u0000\u000012\u0005e\u0000"+
		"\u000023\u0005a\u0000\u000034\u0005d\u0000\u000045\u0005 \u0000\u0000"+
		"5\n\u0001\u0000\u0000\u000067\u0005(\u0000\u000078\u0005i\u0000\u0000"+
		"89\u0005n\u0000\u00009:\u0005t\u0000\u0000:;\u0005)\u0000\u0000;\f\u0001"+
		"\u0000\u0000\u0000<=\u0005(\u0000\u0000=>\u0005r\u0000\u0000>?\u0005e"+
		"\u0000\u0000?@\u0005a\u0000\u0000@A\u0005l\u0000\u0000AB\u0005)\u0000"+
		"\u0000B\u000e\u0001\u0000\u0000\u0000CD\u0005+\u0000\u0000D\u0010\u0001"+
		"\u0000\u0000\u0000EF\u0005-\u0000\u0000F\u0012\u0001\u0000\u0000\u0000"+
		"GH\u0005*\u0000\u0000H\u0014\u0001\u0000\u0000\u0000IJ\u0005/\u0000\u0000"+
		"J\u0016\u0001\u0000\u0000\u0000KM\u000209\u0000LK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PR\u0005.\u0000\u0000QS\u000209\u0000"+
		"RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000U\u0018\u0001\u0000\u0000\u0000VX\u0002"+
		"09\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u001a\u0001\u0000\u0000\u0000"+
		"[]\u0007\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u001c\u0001"+
		"\u0000\u0000\u0000`d\u0005\"\u0000\u0000ac\b\u0001\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000gh\u0005\"\u0000\u0000h\u001e\u0001\u0000\u0000\u0000ik\u0005\r"+
		"\u0000\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0005\n\u0000\u0000m \u0001\u0000\u0000\u0000np\u0007"+
		"\u0002\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000st\u0006\u0010\u0000\u0000t\"\u0001\u0000\u0000\u0000\b\u0000NT"+
		"Y^djq\u0001\u0001\u0010\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}