// Generated from HelloLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, Then=2, Else=3, While=4, Return=5, Int=6, Char=7, Obracket=8, Cbracket=9, 
		Semicolone=10, Spot=11, Ombracket=12, Cmbracket=13, Esign=14, Iesign=15, 
		Equal=16, Psign=17, Msign=18, Linechange=19, Blank=20, Word=21, Num=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"If", "Then", "Else", "While", "Return", "Int", "Char", "Obracket", "Cbracket", 
			"Semicolone", "Spot", "Ombracket", "Cmbracket", "Esign", "Iesign", "Equal", 
			"Psign", "Msign", "Linechange", "Blank", "Word", "Num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'while'", "'return'", "'int'", "'char'", 
			"'('", "')'", "';'", "','", "'{'", "'}'", "'='", "'>'", "'=='", "'+'", 
			"'*'", "'\r\n'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "If", "Then", "Else", "While", "Return", "Int", "Char", "Obracket", 
			"Cbracket", "Semicolone", "Spot", "Ombracket", "Cmbracket", "Esign", 
			"Iesign", "Equal", "Psign", "Msign", "Linechange", "Blank", "Word", "Num"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HelloLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\6\26p\n\26\r\26\16\26q\3"+
		"\27\6\27u\n\27\r\27\16\27v\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2"+
		"\4\4\2C\\c|\3\2\62;\2y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\3/\3\2\2\2\5\62\3\2\2\2\7\67\3\2\2\2\t<\3\2\2\2\13B\3\2"+
		"\2\2\rI\3\2\2\2\17M\3\2\2\2\21R\3\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27X\3"+
		"\2\2\2\31Z\3\2\2\2\33\\\3\2\2\2\35^\3\2\2\2\37`\3\2\2\2!b\3\2\2\2#e\3"+
		"\2\2\2%g\3\2\2\2\'i\3\2\2\2)l\3\2\2\2+o\3\2\2\2-t\3\2\2\2/\60\7k\2\2\60"+
		"\61\7h\2\2\61\4\3\2\2\2\62\63\7v\2\2\63\64\7j\2\2\64\65\7g\2\2\65\66\7"+
		"p\2\2\66\6\3\2\2\2\678\7g\2\289\7n\2\29:\7u\2\2:;\7g\2\2;\b\3\2\2\2<="+
		"\7y\2\2=>\7j\2\2>?\7k\2\2?@\7n\2\2@A\7g\2\2A\n\3\2\2\2BC\7t\2\2CD\7g\2"+
		"\2DE\7v\2\2EF\7w\2\2FG\7t\2\2GH\7p\2\2H\f\3\2\2\2IJ\7k\2\2JK\7p\2\2KL"+
		"\7v\2\2L\16\3\2\2\2MN\7e\2\2NO\7j\2\2OP\7c\2\2PQ\7t\2\2Q\20\3\2\2\2RS"+
		"\7*\2\2S\22\3\2\2\2TU\7+\2\2U\24\3\2\2\2VW\7=\2\2W\26\3\2\2\2XY\7.\2\2"+
		"Y\30\3\2\2\2Z[\7}\2\2[\32\3\2\2\2\\]\7\177\2\2]\34\3\2\2\2^_\7?\2\2_\36"+
		"\3\2\2\2`a\7@\2\2a \3\2\2\2bc\7?\2\2cd\7?\2\2d\"\3\2\2\2ef\7-\2\2f$\3"+
		"\2\2\2gh\7,\2\2h&\3\2\2\2ij\7\17\2\2jk\7\f\2\2k(\3\2\2\2lm\7\"\2\2m*\3"+
		"\2\2\2np\t\2\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r,\3\2\2\2su\t"+
		"\3\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w.\3\2\2\2\6\2oqv\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}