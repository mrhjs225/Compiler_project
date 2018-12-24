// Generated from HelloParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.io.IOException;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, Then=2, Else=3, While=4, Return=5, Int=6, Char=7, Obracket=8, Cbracket=9, 
		Semicolone=10, Spot=11, Ombracket=12, Cmbracket=13, Esign=14, Iesign=15, 
		Equal=16, Psign=17, Msign=18, Linechange=19, Blank=20, Word=21, Num=22;
	public static final int
		RULE_prog = 0, RULE_decls = 1, RULE_decl = 2, RULE_words = 3, RULE_vtype = 4, 
		RULE_block = 5, RULE_slist = 6, RULE_stat = 7, RULE_statb = 8, RULE_cond = 9, 
		RULE_expr = 10, RULE_term = 11, RULE_fact = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decls", "decl", "words", "vtype", "block", "slist", "stat", 
			"statb", "cond", "expr", "term", "fact"
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

	@Override
	public String getGrammarFileName() { return "HelloParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public VtypeContext vtype() {
			return getRuleContext(VtypeContext.class,0);
		}
		public TerminalNode Blank() { return getToken(HelloParser.Blank, 0); }
		public TerminalNode Word() { return getToken(HelloParser.Word, 0); }
		public TerminalNode Obracket() { return getToken(HelloParser.Obracket, 0); }
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public TerminalNode Cbracket() { return getToken(HelloParser.Cbracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener )
				try {
					((HelloParserListener)listener).enterProg(this);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			vtype();
			setState(27);
			match(Blank);
			setState(28);
			match(Word);
			setState(29);
			match(Obracket);
			setState(30);
			words(0);
			setState(31);
			match(Cbracket);
			setState(32);
			block();
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

	public static class DeclsContext extends ParserRuleContext {
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).exitDecls(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		return decls(0);
	}

	private DeclsContext decls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclsContext _localctx = new DeclsContext(_ctx, _parentState);
		DeclsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_decls);
					setState(35);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(36);
					decl();
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class DeclContext extends ParserRuleContext {
		public VtypeContext vtype() {
			return getRuleContext(VtypeContext.class,0);
		}
		public TerminalNode Blank() { return getToken(HelloParser.Blank, 0); }
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public TerminalNode Semicolone() { return getToken(HelloParser.Semicolone, 0); }
		public TerminalNode Linechange() { return getToken(HelloParser.Linechange, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener )
				try {
					((HelloParserListener)listener).enterDecl(this);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			vtype();
			setState(43);
			match(Blank);
			setState(44);
			words(0);
			setState(45);
			match(Semicolone);
			setState(46);
			match(Linechange);
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

	public static class WordsContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(HelloParser.Word, 0); }
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public TerminalNode Spot() { return getToken(HelloParser.Spot, 0); }
		public WordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).enterWords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).exitWords(this);
		}
	}

	public final WordsContext words() throws RecognitionException {
		return words(0);
	}

	private WordsContext words(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WordsContext _localctx = new WordsContext(_ctx, _parentState);
		WordsContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_words, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(49);
			match(Word);
			}
			_ctx.stop = _input.LT(-1);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new WordsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_words);
					setState(51);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(52);
					match(Spot);
					setState(53);
					match(Word);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class VtypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(HelloParser.Int, 0); }
		public TerminalNode Char() { return getToken(HelloParser.Char, 0); }
		public VtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).enterVtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).exitVtype(this);
		}
	}

	public final VtypeContext vtype() throws RecognitionException {
		VtypeContext _localctx = new VtypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vtype);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(Int);
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(Char);
				}
				break;
			case Blank:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode Ombracket() { return getToken(HelloParser.Ombracket, 0); }
		public List<TerminalNode> Linechange() { return getTokens(HelloParser.Linechange); }
		public TerminalNode Linechange(int i) {
			return getToken(HelloParser.Linechange, i);
		}
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public SlistContext slist() {
			return getRuleContext(SlistContext.class,0);
		}
		public TerminalNode Cmbracket() { return getToken(HelloParser.Cmbracket, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ombracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(Ombracket);
				setState(65);
				match(Linechange);
				setState(66);
				decls(0);
				setState(67);
				slist();
				setState(68);
				match(Cmbracket);
				setState(69);
				match(Linechange);
				}
				break;
			case EOF:
			case If:
			case Else:
			case While:
			case Return:
			case Cmbracket:
			case Word:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SlistContext extends ParserRuleContext {
		public StatbContext statb() {
			return getRuleContext(StatbContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public SlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).enterSlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).exitSlist(this);
		}
	}

	public final SlistContext slist() throws RecognitionException {
		SlistContext _localctx = new SlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_slist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(74);
					stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(79);
			statb();
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

	public static class StatContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(HelloParser.If, 0); }
		public TerminalNode Obracket() { return getToken(HelloParser.Obracket, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode Cbracket() { return getToken(HelloParser.Cbracket, 0); }
		public TerminalNode Then() { return getToken(HelloParser.Then, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(HelloParser.Else, 0); }
		public TerminalNode While() { return getToken(HelloParser.While, 0); }
		public TerminalNode Word() { return getToken(HelloParser.Word, 0); }
		public TerminalNode Esign() { return getToken(HelloParser.Esign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semicolone() { return getToken(HelloParser.Semicolone, 0); }
		public TerminalNode Linechange() { return getToken(HelloParser.Linechange, 0); }
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public TerminalNode Return() { return getToken(HelloParser.Return, 0); }
		public TerminalNode Blank() { return getToken(HelloParser.Blank, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stat);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(If);
				setState(82);
				match(Obracket);
				setState(83);
				cond();
				setState(84);
				match(Cbracket);
				setState(85);
				match(Then);
				setState(86);
				block();
				setState(87);
				match(Else);
				setState(88);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(While);
				setState(91);
				match(Obracket);
				setState(92);
				cond();
				setState(93);
				match(Cbracket);
				setState(94);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(Word);
				setState(97);
				match(Esign);
				setState(98);
				expr();
				setState(99);
				match(Semicolone);
				setState(100);
				match(Linechange);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(Word);
				setState(103);
				match(Obracket);
				setState(104);
				words(0);
				setState(105);
				match(Cbracket);
				setState(106);
				match(Semicolone);
				setState(107);
				match(Linechange);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(Return);
				setState(110);
				match(Blank);
				setState(111);
				match(Word);
				setState(112);
				match(Semicolone);
				setState(113);
				match(Linechange);
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

	public static class StatbContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(HelloParser.If, 0); }
		public TerminalNode Obracket() { return getToken(HelloParser.Obracket, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode Cbracket() { return getToken(HelloParser.Cbracket, 0); }
		public TerminalNode Then() { return getToken(HelloParser.Then, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(HelloParser.Else, 0); }
		public TerminalNode While() { return getToken(HelloParser.While, 0); }
		public TerminalNode Word() { return getToken(HelloParser.Word, 0); }
		public TerminalNode Esign() { return getToken(HelloParser.Esign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semicolone() { return getToken(HelloParser.Semicolone, 0); }
		public TerminalNode Linechange() { return getToken(HelloParser.Linechange, 0); }
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public TerminalNode Return() { return getToken(HelloParser.Return, 0); }
		public TerminalNode Blank() { return getToken(HelloParser.Blank, 0); }
		public StatbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).enterStatb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).exitStatb(this);
		}
	}

	public final StatbContext statb() throws RecognitionException {
		StatbContext _localctx = new StatbContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statb);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(If);
				setState(117);
				match(Obracket);
				setState(118);
				cond();
				setState(119);
				match(Cbracket);
				setState(120);
				match(Then);
				setState(121);
				block();
				setState(122);
				match(Else);
				setState(123);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(While);
				setState(126);
				match(Obracket);
				setState(127);
				cond();
				setState(128);
				match(Cbracket);
				setState(129);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(Word);
				setState(132);
				match(Esign);
				setState(133);
				expr();
				setState(134);
				match(Semicolone);
				setState(135);
				match(Linechange);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(Word);
				setState(138);
				match(Obracket);
				setState(139);
				words(0);
				setState(140);
				match(Cbracket);
				setState(141);
				match(Semicolone);
				setState(142);
				match(Linechange);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(Return);
				setState(145);
				match(Blank);
				setState(146);
				match(Word);
				setState(147);
				match(Semicolone);
				setState(148);
				match(Linechange);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
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

	public static class CondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Iesign() { return getToken(HelloParser.Iesign, 0); }
		public TerminalNode Equal() { return getToken(HelloParser.Equal, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cond);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				expr();
				setState(153);
				match(Iesign);
				setState(154);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				expr();
				setState(157);
				match(Equal);
				setState(158);
				expr();
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode Psign() { return getToken(HelloParser.Psign, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				term();
				setState(164);
				match(Psign);
				setState(165);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public TerminalNode Msign() { return getToken(HelloParser.Msign, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				fact();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				fact();
				setState(171);
				match(Msign);
				setState(172);
				fact();
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

	public static class FactContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(HelloParser.Num, 0); }
		public TerminalNode Word() { return getToken(HelloParser.Word, 0); }
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloParserListener ) ((HelloParserListener)listener).exitFact(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Num) ) {
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
		case 1:
			return decls_sempred((DeclsContext)_localctx, predIndex);
		case 3:
			return words_sempred((WordsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean decls_sempred(DeclsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean words_sempred(WordsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u00b5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\59\n\5\f\5\16\5<\13\5\3\6\3\6\3\6\5\6A\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7K\n\7\3\b\6\bN\n\b\r\b\16\bO\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tu\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0099\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a3\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00aa\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00b1\n\r\3\16\3\16\3\16\2"+
		"\4\4\b\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\27\30\2\u00b9\2\34"+
		"\3\2\2\2\4$\3\2\2\2\6,\3\2\2\2\b\62\3\2\2\2\n@\3\2\2\2\fJ\3\2\2\2\16M"+
		"\3\2\2\2\20t\3\2\2\2\22\u0098\3\2\2\2\24\u00a2\3\2\2\2\26\u00a9\3\2\2"+
		"\2\30\u00b0\3\2\2\2\32\u00b2\3\2\2\2\34\35\5\n\6\2\35\36\7\26\2\2\36\37"+
		"\7\27\2\2\37 \7\n\2\2 !\5\b\5\2!\"\7\13\2\2\"#\5\f\7\2#\3\3\2\2\2$)\b"+
		"\3\1\2%&\f\4\2\2&(\5\6\4\2\'%\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*"+
		"\5\3\2\2\2+)\3\2\2\2,-\5\n\6\2-.\7\26\2\2./\5\b\5\2/\60\7\f\2\2\60\61"+
		"\7\25\2\2\61\7\3\2\2\2\62\63\b\5\1\2\63\64\7\27\2\2\64:\3\2\2\2\65\66"+
		"\f\4\2\2\66\67\7\r\2\2\679\7\27\2\28\65\3\2\2\29<\3\2\2\2:8\3\2\2\2:;"+
		"\3\2\2\2;\t\3\2\2\2<:\3\2\2\2=A\7\b\2\2>A\7\t\2\2?A\3\2\2\2@=\3\2\2\2"+
		"@>\3\2\2\2@?\3\2\2\2A\13\3\2\2\2BC\7\16\2\2CD\7\25\2\2DE\5\4\3\2EF\5\16"+
		"\b\2FG\7\17\2\2GH\7\25\2\2HK\3\2\2\2IK\3\2\2\2JB\3\2\2\2JI\3\2\2\2K\r"+
		"\3\2\2\2LN\5\20\t\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2"+
		"QR\5\22\n\2R\17\3\2\2\2ST\7\3\2\2TU\7\n\2\2UV\5\24\13\2VW\7\13\2\2WX\7"+
		"\4\2\2XY\5\f\7\2YZ\7\5\2\2Z[\5\f\7\2[u\3\2\2\2\\]\7\6\2\2]^\7\n\2\2^_"+
		"\5\24\13\2_`\7\13\2\2`a\5\f\7\2au\3\2\2\2bc\7\27\2\2cd\7\20\2\2de\5\26"+
		"\f\2ef\7\f\2\2fg\7\25\2\2gu\3\2\2\2hi\7\27\2\2ij\7\n\2\2jk\5\b\5\2kl\7"+
		"\13\2\2lm\7\f\2\2mn\7\25\2\2nu\3\2\2\2op\7\7\2\2pq\7\26\2\2qr\7\27\2\2"+
		"rs\7\f\2\2su\7\25\2\2tS\3\2\2\2t\\\3\2\2\2tb\3\2\2\2th\3\2\2\2to\3\2\2"+
		"\2u\21\3\2\2\2vw\7\3\2\2wx\7\n\2\2xy\5\24\13\2yz\7\13\2\2z{\7\4\2\2{|"+
		"\5\f\7\2|}\7\5\2\2}~\5\f\7\2~\u0099\3\2\2\2\177\u0080\7\6\2\2\u0080\u0081"+
		"\7\n\2\2\u0081\u0082\5\24\13\2\u0082\u0083\7\13\2\2\u0083\u0084\5\f\7"+
		"\2\u0084\u0099\3\2\2\2\u0085\u0086\7\27\2\2\u0086\u0087\7\20\2\2\u0087"+
		"\u0088\5\26\f\2\u0088\u0089\7\f\2\2\u0089\u008a\7\25\2\2\u008a\u0099\3"+
		"\2\2\2\u008b\u008c\7\27\2\2\u008c\u008d\7\n\2\2\u008d\u008e\5\b\5\2\u008e"+
		"\u008f\7\13\2\2\u008f\u0090\7\f\2\2\u0090\u0091\7\25\2\2\u0091\u0099\3"+
		"\2\2\2\u0092\u0093\7\7\2\2\u0093\u0094\7\26\2\2\u0094\u0095\7\27\2\2\u0095"+
		"\u0096\7\f\2\2\u0096\u0099\7\25\2\2\u0097\u0099\3\2\2\2\u0098v\3\2\2\2"+
		"\u0098\177\3\2\2\2\u0098\u0085\3\2\2\2\u0098\u008b\3\2\2\2\u0098\u0092"+
		"\3\2\2\2\u0098\u0097\3\2\2\2\u0099\23\3\2\2\2\u009a\u009b\5\26\f\2\u009b"+
		"\u009c\7\21\2\2\u009c\u009d\5\26\f\2\u009d\u00a3\3\2\2\2\u009e\u009f\5"+
		"\26\f\2\u009f\u00a0\7\22\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a3\3\2\2\2"+
		"\u00a2\u009a\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3\25\3\2\2\2\u00a4\u00aa"+
		"\5\30\r\2\u00a5\u00a6\5\30\r\2\u00a6\u00a7\7\23\2\2\u00a7\u00a8\5\30\r"+
		"\2\u00a8\u00aa\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\27"+
		"\3\2\2\2\u00ab\u00b1\5\32\16\2\u00ac\u00ad\5\32\16\2\u00ad\u00ae\7\24"+
		"\2\2\u00ae\u00af\5\32\16\2\u00af\u00b1\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0"+
		"\u00ac\3\2\2\2\u00b1\31\3\2\2\2\u00b2\u00b3\t\2\2\2\u00b3\33\3\2\2\2\f"+
		"):@JOt\u0098\u00a2\u00a9\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}