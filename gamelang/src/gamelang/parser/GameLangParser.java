// Generated from GameLang.g by ANTLR 4.5
package gamelang.parser; import static gamelang.AST.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GameLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, Define=23, Print=24, 
		Roll=25, CALL=26, EXIT_GAME=27, Let=28, Dot=29, ENTER_QUEST=30, Number=31, 
		Identifier=32, Letter=33, LetterOrDigit=34, AT=35, ELLIPSIS=36, WS=37, 
		Comment=38, Line_Comment=39, STRING=40;
	public static final int
		RULE_program = 0, RULE_definedecl = 1, RULE_exp = 2, RULE_numexp = 3, 
		RULE_infixaddsubt = 4, RULE_infixmuldiv = 5, RULE_infixpower = 6, RULE_varexp = 7, 
		RULE_printexp = 8, RULE_rollexp = 9, RULE_exitexp = 10, RULE_orderexp = 11, 
		RULE_boolexp = 12, RULE_enterexp = 13, RULE_ifexp = 14, RULE_whileexp = 15, 
		RULE_block = 16;
	public static final String[] ruleNames = {
		"program", "definedecl", "exp", "numexp", "infixaddsubt", "infixmuldiv", 
		"infixpower", "varexp", "printexp", "rollexp", "exitexp", "orderexp", 
		"boolexp", "enterexp", "ifexp", "whileexp", "block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'STAT'", "'='", "'('", "')'", "'-'", "'+'", "'#'", "'*'", "'/'", 
		"'^'", "'|'", "'ORDER66'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
		"'SHOOT-IF'", "'{'", "'}'", "'RESPAWN-UNTIL'", "'define'", "'PRINT'", 
		"'ROLL'", "'CALL'", "'EXIT_GAME'", "'let'", "'.'", "'ENTER-QUEST'", null, 
		null, null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "Define", 
		"Print", "Roll", "CALL", "EXIT_GAME", "Let", "Dot", "ENTER_QUEST", "Number", 
		"Identifier", "Letter", "LetterOrDigit", "AT", "ELLIPSIS", "WS", "Comment", 
		"Line_Comment", "STRING"
	};
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
	public String getGrammarFileName() { return "GameLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GameLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public ArrayList<DefineDecl> defs;
		public ArrayList<Exp> exprs;
		public DefinedeclContext def;
		public ExpContext e;
		public List<DefinedeclContext> definedecl() {
			return getRuleContexts(DefinedeclContext.class);
		}
		public DefinedeclContext definedecl(int i) {
			return getRuleContext(DefinedeclContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		 
		        ((ProgramContext)_localctx).defs =  new ArrayList<DefineDecl>(); 
		        ((ProgramContext)_localctx).exprs =  new ArrayList<Exp>();
		    
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34);
					((ProgramContext)_localctx).def = definedecl();
					 _localctx.defs.add(((ProgramContext)_localctx).def.ast); 
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				((ProgramContext)_localctx).e = exp();
				 _localctx.exprs.add(((ProgramContext)_localctx).e.ast); 
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__11) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << Print) | (1L << Roll) | (1L << CALL) | (1L << ENTER_QUEST) | (1L << Number) | (1L << Identifier))) != 0) );

			        ((ProgramContext)_localctx).ast =  new Program(_localctx.defs, new BlockExp(_localctx.exprs));
			    
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

	public static class DefinedeclContext extends ParserRuleContext {
		public DefineDecl ast;
		public Token id;
		public ExpContext e;
		public TerminalNode Identifier() { return getToken(GameLangParser.Identifier, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DefinedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedecl; }
	}

	public final DefinedeclContext definedecl() throws RecognitionException {
		DefinedeclContext _localctx = new DefinedeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definedecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			((DefinedeclContext)_localctx).id = match(Identifier);
			setState(53);
			match(T__1);
			setState(54);
			((DefinedeclContext)_localctx).e = exp();
			 ((DefinedeclContext)_localctx).ast =  new DefineDecl((((DefinedeclContext)_localctx).id!=null?((DefinedeclContext)_localctx).id.getText():null), ((DefinedeclContext)_localctx).e.ast); 
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

	public static class ExpContext extends ParserRuleContext {
		public Exp ast;
		public ExpContext e;
		public DefinedeclContext stat;
		public VarexpContext v;
		public NumexpContext n;
		public InfixaddsubtContext in;
		public InfixmuldivContext inm;
		public InfixpowerContext inp;
		public PrintexpContext p;
		public RollexpContext r;
		public ExitexpContext x;
		public OrderexpContext o;
		public IfexpContext i;
		public WhileexpContext wh;
		public BlockContext b;
		public EnterexpContext eq;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DefinedeclContext definedecl() {
			return getRuleContext(DefinedeclContext.class,0);
		}
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public InfixaddsubtContext infixaddsubt() {
			return getRuleContext(InfixaddsubtContext.class,0);
		}
		public InfixmuldivContext infixmuldiv() {
			return getRuleContext(InfixmuldivContext.class,0);
		}
		public InfixpowerContext infixpower() {
			return getRuleContext(InfixpowerContext.class,0);
		}
		public PrintexpContext printexp() {
			return getRuleContext(PrintexpContext.class,0);
		}
		public RollexpContext rollexp() {
			return getRuleContext(RollexpContext.class,0);
		}
		public ExitexpContext exitexp() {
			return getRuleContext(ExitexpContext.class,0);
		}
		public OrderexpContext orderexp() {
			return getRuleContext(OrderexpContext.class,0);
		}
		public IfexpContext ifexp() {
			return getRuleContext(IfexpContext.class,0);
		}
		public WhileexpContext whileexp() {
			return getRuleContext(WhileexpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EnterexpContext enterexp() {
			return getRuleContext(EnterexpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp);
		try {
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__2);
				setState(58);
				((ExpContext)_localctx).e = exp();
				setState(59);
				match(T__3);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).e.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				((ExpContext)_localctx).stat = definedecl();
				((ExpContext)_localctx).ast =  ((ExpContext)_localctx).stat.ast;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				((ExpContext)_localctx).v = varexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).v.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				((ExpContext)_localctx).in = infixaddsubt();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).in.ast;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				((ExpContext)_localctx).inm = infixmuldiv();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).inm.ast;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				((ExpContext)_localctx).inp = infixpower();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).inp.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				((ExpContext)_localctx).p = printexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).p.ast; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(83);
				((ExpContext)_localctx).r = rollexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).r.ast; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(86);
				((ExpContext)_localctx).x = exitexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).x.ast; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(89);
				((ExpContext)_localctx).o = orderexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).o.ast; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(92);
				((ExpContext)_localctx).i = ifexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).i.ast; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(95);
				((ExpContext)_localctx).wh = whileexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).wh.ast; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(98);
				((ExpContext)_localctx).b = block();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).b.ast; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(101);
				((ExpContext)_localctx).eq = enterexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).eq.ast; 
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

	public static class NumexpContext extends ParserRuleContext {
		public NumExp ast;
		public Token n0;
		public Token n1;
		public List<TerminalNode> Number() { return getTokens(GameLangParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GameLangParser.Number, i);
		}
		public TerminalNode Dot() { return getToken(GameLangParser.Dot, 0); }
		public NumexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexp; }
	}

	public final NumexpContext numexp() throws RecognitionException {
		NumexpContext _localctx = new NumexpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numexp);
		try {
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__4);
				setState(109);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(-Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(112);
				match(Dot);
				setState(113);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(T__4);
				setState(116);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(117);
				match(Dot);
				setState(118);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble("-" + (((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
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

	public static class InfixaddsubtContext extends ParserRuleContext {
		public Exp ast;
		public InfixmuldivContext l;
		public InfixmuldivContext r;
		public List<InfixmuldivContext> infixmuldiv() {
			return getRuleContexts(InfixmuldivContext.class);
		}
		public InfixmuldivContext infixmuldiv(int i) {
			return getRuleContext(InfixmuldivContext.class,i);
		}
		public InfixaddsubtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixaddsubt; }
	}

	public final InfixaddsubtContext infixaddsubt() throws RecognitionException {
		InfixaddsubtContext _localctx = new InfixaddsubtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_infixaddsubt);
		 ((InfixaddsubtContext)_localctx).ast =  null; ArrayList<Exp> list = new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			((InfixaddsubtContext)_localctx).l = infixmuldiv();
			 ((InfixaddsubtContext)_localctx).ast =  ((InfixaddsubtContext)_localctx).l.ast; 
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				setState(132);
				switch (_input.LA(1)) {
				case T__5:
					{
					{
					setState(124);
					match(T__5);
					setState(125);
					((InfixaddsubtContext)_localctx).r = infixmuldiv();
					 
					                          list = new ArrayList<Exp>();
					                          list.add(_localctx.ast);
					                          list.add(((InfixaddsubtContext)_localctx).r.ast);
					                          ((InfixaddsubtContext)_localctx).ast =  new AddExp(list);
					                        
					}
					}
					break;
				case T__6:
					{
					{
					setState(128);
					match(T__6);
					setState(129);
					((InfixaddsubtContext)_localctx).r = infixmuldiv();
					 
					                          list = new ArrayList<Exp>();
					                          list.add(_localctx.ast);
					                          list.add(((InfixaddsubtContext)_localctx).r.ast);
					                          ((InfixaddsubtContext)_localctx).ast =  new SubExp(list);
					                        
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(136);
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

	public static class InfixmuldivContext extends ParserRuleContext {
		public Exp ast;
		public InfixpowerContext l;
		public InfixpowerContext r;
		public List<InfixpowerContext> infixpower() {
			return getRuleContexts(InfixpowerContext.class);
		}
		public InfixpowerContext infixpower(int i) {
			return getRuleContext(InfixpowerContext.class,i);
		}
		public InfixmuldivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixmuldiv; }
	}

	public final InfixmuldivContext infixmuldiv() throws RecognitionException {
		InfixmuldivContext _localctx = new InfixmuldivContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_infixmuldiv);
		 ((InfixmuldivContext)_localctx).ast =  null; ArrayList<Exp> list = new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((InfixmuldivContext)_localctx).l = infixpower();
			 ((InfixmuldivContext)_localctx).ast =  ((InfixmuldivContext)_localctx).l.ast; 
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				setState(147);
				switch (_input.LA(1)) {
				case T__7:
					{
					{
					setState(139);
					match(T__7);
					setState(140);
					((InfixmuldivContext)_localctx).r = infixpower();
					 
					                     list = new ArrayList<Exp>();
					                     list.add(_localctx.ast);
					                     list.add(((InfixmuldivContext)_localctx).r.ast);
					                     ((InfixmuldivContext)_localctx).ast =  new MultExp(list);
					                   
					}
					}
					break;
				case T__8:
					{
					{
					setState(143);
					match(T__8);
					setState(144);
					((InfixmuldivContext)_localctx).r = infixpower();
					 
					                     list = new ArrayList<Exp>();
					                     list.add(_localctx.ast);
					                     list.add(((InfixmuldivContext)_localctx).r.ast);
					                     ((InfixmuldivContext)_localctx).ast =  new DivExp(list);
					                   
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(151);
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

	public static class InfixpowerContext extends ParserRuleContext {
		public Exp ast;
		public VarexpContext l;
		public InfixpowerContext exponent;
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public List<InfixpowerContext> infixpower() {
			return getRuleContexts(InfixpowerContext.class);
		}
		public InfixpowerContext infixpower(int i) {
			return getRuleContext(InfixpowerContext.class,i);
		}
		public InfixpowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixpower; }
	}

	public final InfixpowerContext infixpower() throws RecognitionException {
		InfixpowerContext _localctx = new InfixpowerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_infixpower);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			((InfixpowerContext)_localctx).l = varexp();
			 ((InfixpowerContext)_localctx).ast =  ((InfixpowerContext)_localctx).l.ast; 
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					match(T__9);
					setState(155);
					((InfixpowerContext)_localctx).exponent = infixpower();
					  // Right-associative exponentiation
					                          ArrayList<Exp> list = new ArrayList<Exp>();
					                          list.add(_localctx.ast);
					                          list.add(((InfixpowerContext)_localctx).exponent.ast);
					                          ((InfixpowerContext)_localctx).ast =  new PowExp(list);
					                        
					}
					} 
				}
				setState(162);
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
			exitRule();
		}
		return _localctx;
	}

	public static class VarexpContext extends ParserRuleContext {
		public Exp ast;
		public Token id;
		public NumexpContext n;
		public TerminalNode Identifier() { return getToken(GameLangParser.Identifier, 0); }
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public VarexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varexp; }
	}

	public final VarexpContext varexp() throws RecognitionException {
		VarexpContext _localctx = new VarexpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varexp);
		try {
			setState(168);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				((VarexpContext)_localctx).id = match(Identifier);
				 ((VarexpContext)_localctx).ast =  new VarExp((((VarexpContext)_localctx).id!=null?((VarexpContext)_localctx).id.getText():null)); 
				}
				break;
			case T__4:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				((VarexpContext)_localctx).n = numexp();
				 ((VarexpContext)_localctx).ast =  ((VarexpContext)_localctx).n.ast; 
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

	public static class PrintexpContext extends ParserRuleContext {
		public Exp ast;
		public Token s;
		public ExpContext e;
		public List<TerminalNode> STRING() { return getTokens(GameLangParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GameLangParser.STRING, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PrintexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printexp; }
	}

	public final PrintexpContext printexp() throws RecognitionException {
		PrintexpContext _localctx = new PrintexpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printexp);

		    List<Exp> parts = new ArrayList<Exp>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(Print);
			setState(171);
			match(T__10);
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(172);
					((PrintexpContext)_localctx).s = match(STRING);

					              String raw = (((PrintexpContext)_localctx).s!=null?((PrintexpContext)_localctx).s.getText():null);
					              parts.add(new StrLitExp(raw.substring(1, raw.length() - 1)));
					          
					}
					break;
				case T__0:
				case T__2:
				case T__4:
				case T__11:
				case T__18:
				case T__19:
				case T__21:
				case Print:
				case Roll:
				case CALL:
				case ENTER_QUEST:
				case Number:
				case Identifier:
					{
					setState(174);
					((PrintexpContext)_localctx).e = exp();
					 parts.add(((PrintexpContext)_localctx).e.ast); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__11) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << Print) | (1L << Roll) | (1L << CALL) | (1L << ENTER_QUEST) | (1L << Number) | (1L << Identifier) | (1L << STRING))) != 0) );

			          ((PrintexpContext)_localctx).ast =  new PrintExp(parts);
			      
			setState(184);
			match(T__10);
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

	public static class RollexpContext extends ParserRuleContext {
		public Exp ast;
		public RollexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollexp; }
	}

	public final RollexpContext rollexp() throws RecognitionException {
		RollexpContext _localctx = new RollexpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rollexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(Roll);
			 ((RollexpContext)_localctx).ast =  new RollExp(); 
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

	public static class ExitexpContext extends ParserRuleContext {
		public Exp ast;
		public ExitexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitexp; }
	}

	public final ExitexpContext exitexp() throws RecognitionException {
		ExitexpContext _localctx = new ExitexpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exitexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(CALL);
			setState(190);
			match(EXIT_GAME);
			 ((ExitexpContext)_localctx).ast =  new ExitGameExp(); 
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

	public static class OrderexpContext extends ParserRuleContext {
		public Exp ast;
		public OrderexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderexp; }
	}

	public final OrderexpContext orderexp() throws RecognitionException {
		OrderexpContext _localctx = new OrderexpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_orderexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__11);
			 ((OrderexpContext)_localctx).ast =  new Order(); 
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

	public static class BoolexpContext extends ParserRuleContext {
		public Exp ast;
		public ExpContext l;
		public Token op;
		public ExpContext r;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BoolexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexp; }
	}

	public final BoolexpContext boolexp() throws RecognitionException {
		BoolexpContext _localctx = new BoolexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_boolexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			((BoolexpContext)_localctx).l = exp();
			setState(197);
			((BoolexpContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
				((BoolexpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(198);
			((BoolexpContext)_localctx).r = exp();

			        ((BoolexpContext)_localctx).ast =  new CompareExp(((BoolexpContext)_localctx).l.ast, ((BoolexpContext)_localctx).r.ast, (((BoolexpContext)_localctx).op!=null?((BoolexpContext)_localctx).op.getText():null));
			    
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

	public static class EnterexpContext extends ParserRuleContext {
		public Exp ast;
		public Token id;
		public TerminalNode Identifier() { return getToken(GameLangParser.Identifier, 0); }
		public EnterexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enterexp; }
	}

	public final EnterexpContext enterexp() throws RecognitionException {
		EnterexpContext _localctx = new EnterexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enterexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ENTER_QUEST);
			setState(202);
			((EnterexpContext)_localctx).id = match(Identifier);
			 ((EnterexpContext)_localctx).ast =  new EnterQuestExp((((EnterexpContext)_localctx).id!=null?((EnterexpContext)_localctx).id.getText():null)); 
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

	public static class IfexpContext extends ParserRuleContext {
		public Exp ast;
		public BoolexpContext cond;
		public ExpContext exp;
		public List<ExpContext> stmts = new ArrayList<ExpContext>();
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IfexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexp; }
	}

	public final IfexpContext ifexp() throws RecognitionException {
		IfexpContext _localctx = new IfexpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__18);
			setState(206);
			match(T__2);
			setState(207);
			((IfexpContext)_localctx).cond = boolexp();
			setState(208);
			match(T__3);
			setState(209);
			match(T__19);
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				((IfexpContext)_localctx).exp = exp();
				((IfexpContext)_localctx).stmts.add(((IfexpContext)_localctx).exp);
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__11) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << Print) | (1L << Roll) | (1L << CALL) | (1L << ENTER_QUEST) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(215);
			match(T__20);

			        List<Exp> expressions = new ArrayList<>();
			        for (ExpContext expCtx : ((IfexpContext)_localctx).stmts) {
			            expressions.add(expCtx.ast);  // Add each inner expression
			        }
			        ((IfexpContext)_localctx).ast =  new IfExp(((IfexpContext)_localctx).cond.ast, new BlockExp(expressions));
			    
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

	public static class WhileexpContext extends ParserRuleContext {
		public Exp ast;
		public BoolexpContext cond;
		public ExpContext exp;
		public List<ExpContext> stmts = new ArrayList<ExpContext>();
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public WhileexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileexp; }
	}

	public final WhileexpContext whileexp() throws RecognitionException {
		WhileexpContext _localctx = new WhileexpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__21);
			setState(219);
			match(T__2);
			setState(220);
			((WhileexpContext)_localctx).cond = boolexp();
			setState(221);
			match(T__3);
			setState(222);
			match(T__19);
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				((WhileexpContext)_localctx).exp = exp();
				((WhileexpContext)_localctx).stmts.add(((WhileexpContext)_localctx).exp);
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__11) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << Print) | (1L << Roll) | (1L << CALL) | (1L << ENTER_QUEST) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(228);
			match(T__20);

			        List<Exp> expressions = new ArrayList<>();
			        for (ExpContext expCtx : ((WhileexpContext)_localctx).stmts) {
			            expressions.add(expCtx.ast);  // Add the AST of each statement
			        }
			        ((WhileexpContext)_localctx).ast =  new WhileExp(((WhileexpContext)_localctx).cond.ast, new BlockExp(expressions));
			    
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
		public Exp ast;
		public ExpContext exp;
		public List<ExpContext> exps = new ArrayList<ExpContext>();
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__19);
			setState(233); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(232);
				((BlockContext)_localctx).exp = exp();
				((BlockContext)_localctx).exps.add(((BlockContext)_localctx).exp);
				}
				}
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__11) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << Print) | (1L << Roll) | (1L << CALL) | (1L << ENTER_QUEST) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(237);
			match(T__20);
			  // ← directly allow blocks inside exp
			        List<Exp> exprs = new ArrayList<>();
			        for (ExpContext e : ((BlockContext)_localctx).exps) {
			            exprs.add(e.ast);
			        }
			        ((BlockContext)_localctx).ast =  new BlockExp(exprs);
			    
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00f3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\2\6\2\60\n\2\r\2\16\2\61"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4k\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5{\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0087\n\6"+
		"\f\6\16\6\u008a\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0096"+
		"\n\7\f\7\16\7\u0099\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a1\n\b\f\b\16"+
		"\b\u00a4\13\b\3\t\3\t\3\t\3\t\3\t\5\t\u00ab\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00b4\n\n\6\n\u00b6\n\n\r\n\16\n\u00b7\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00d6\n\20\r\20\16\20\u00d7"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00e3\n\21\r\21\16"+
		"\21\u00e4\3\21\3\21\3\21\3\22\3\22\6\22\u00ec\n\22\r\22\16\22\u00ed\3"+
		"\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2"+
		"\3\3\2\17\24\u00ff\2)\3\2\2\2\4\65\3\2\2\2\6j\3\2\2\2\bz\3\2\2\2\n|\3"+
		"\2\2\2\f\u008b\3\2\2\2\16\u009a\3\2\2\2\20\u00aa\3\2\2\2\22\u00ac\3\2"+
		"\2\2\24\u00bc\3\2\2\2\26\u00bf\3\2\2\2\30\u00c3\3\2\2\2\32\u00c6\3\2\2"+
		"\2\34\u00cb\3\2\2\2\36\u00cf\3\2\2\2 \u00dc\3\2\2\2\"\u00e9\3\2\2\2$%"+
		"\5\4\3\2%&\b\2\1\2&(\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2"+
		"*/\3\2\2\2+)\3\2\2\2,-\5\6\4\2-.\b\2\1\2.\60\3\2\2\2/,\3\2\2\2\60\61\3"+
		"\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\b\2\1\2\64\3\3\2"+
		"\2\2\65\66\7\3\2\2\66\67\7\"\2\2\678\7\4\2\289\5\6\4\29:\b\3\1\2:\5\3"+
		"\2\2\2;<\7\5\2\2<=\5\6\4\2=>\7\6\2\2>?\b\4\1\2?k\3\2\2\2@A\5\4\3\2AB\b"+
		"\4\1\2Bk\3\2\2\2CD\5\20\t\2DE\b\4\1\2Ek\3\2\2\2FG\5\b\5\2GH\b\4\1\2Hk"+
		"\3\2\2\2IJ\5\n\6\2JK\b\4\1\2Kk\3\2\2\2LM\5\f\7\2MN\b\4\1\2Nk\3\2\2\2O"+
		"P\5\16\b\2PQ\b\4\1\2Qk\3\2\2\2RS\5\22\n\2ST\b\4\1\2Tk\3\2\2\2UV\5\24\13"+
		"\2VW\b\4\1\2Wk\3\2\2\2XY\5\26\f\2YZ\b\4\1\2Zk\3\2\2\2[\\\5\30\r\2\\]\b"+
		"\4\1\2]k\3\2\2\2^_\5\36\20\2_`\b\4\1\2`k\3\2\2\2ab\5 \21\2bc\b\4\1\2c"+
		"k\3\2\2\2de\5\"\22\2ef\b\4\1\2fk\3\2\2\2gh\5\34\17\2hi\b\4\1\2ik\3\2\2"+
		"\2j;\3\2\2\2j@\3\2\2\2jC\3\2\2\2jF\3\2\2\2jI\3\2\2\2jL\3\2\2\2jO\3\2\2"+
		"\2jR\3\2\2\2jU\3\2\2\2jX\3\2\2\2j[\3\2\2\2j^\3\2\2\2ja\3\2\2\2jd\3\2\2"+
		"\2jg\3\2\2\2k\7\3\2\2\2lm\7!\2\2m{\b\5\1\2no\7\7\2\2op\7!\2\2p{\b\5\1"+
		"\2qr\7!\2\2rs\7\37\2\2st\7!\2\2t{\b\5\1\2uv\7\7\2\2vw\7!\2\2wx\7\37\2"+
		"\2xy\7!\2\2y{\b\5\1\2zl\3\2\2\2zn\3\2\2\2zq\3\2\2\2zu\3\2\2\2{\t\3\2\2"+
		"\2|}\5\f\7\2}\u0088\b\6\1\2~\177\7\b\2\2\177\u0080\5\f\7\2\u0080\u0081"+
		"\b\6\1\2\u0081\u0087\3\2\2\2\u0082\u0083\7\t\2\2\u0083\u0084\5\f\7\2\u0084"+
		"\u0085\b\6\1\2\u0085\u0087\3\2\2\2\u0086~\3\2\2\2\u0086\u0082\3\2\2\2"+
		"\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\13"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\5\16\b\2\u008c\u0097\b\7\1\2"+
		"\u008d\u008e\7\n\2\2\u008e\u008f\5\16\b\2\u008f\u0090\b\7\1\2\u0090\u0096"+
		"\3\2\2\2\u0091\u0092\7\13\2\2\u0092\u0093\5\16\b\2\u0093\u0094\b\7\1\2"+
		"\u0094\u0096\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u0091\3\2\2\2\u0096\u0099"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\r\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009b\5\20\t\2\u009b\u00a2\b\b\1\2\u009c\u009d\7"+
		"\f\2\2\u009d\u009e\5\16\b\2\u009e\u009f\b\b\1\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u009c\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\17\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00ab"+
		"\b\t\1\2\u00a7\u00a8\5\b\5\2\u00a8\u00a9\b\t\1\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a5\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\21\3\2\2\2\u00ac\u00ad\7\32\2"+
		"\2\u00ad\u00b5\7\r\2\2\u00ae\u00af\7*\2\2\u00af\u00b4\b\n\1\2\u00b0\u00b1"+
		"\5\6\4\2\u00b1\u00b2\b\n\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b3"+
		"\u00b0\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\b\n\1\2\u00ba\u00bb\7\r\2\2\u00bb\23\3\2\2\2\u00bc\u00bd\7\33\2"+
		"\2\u00bd\u00be\b\13\1\2\u00be\25\3\2\2\2\u00bf\u00c0\7\34\2\2\u00c0\u00c1"+
		"\7\35\2\2\u00c1\u00c2\b\f\1\2\u00c2\27\3\2\2\2\u00c3\u00c4\7\16\2\2\u00c4"+
		"\u00c5\b\r\1\2\u00c5\31\3\2\2\2\u00c6\u00c7\5\6\4\2\u00c7\u00c8\t\2\2"+
		"\2\u00c8\u00c9\5\6\4\2\u00c9\u00ca\b\16\1\2\u00ca\33\3\2\2\2\u00cb\u00cc"+
		"\7 \2\2\u00cc\u00cd\7\"\2\2\u00cd\u00ce\b\17\1\2\u00ce\35\3\2\2\2\u00cf"+
		"\u00d0\7\25\2\2\u00d0\u00d1\7\5\2\2\u00d1\u00d2\5\32\16\2\u00d2\u00d3"+
		"\7\6\2\2\u00d3\u00d5\7\26\2\2\u00d4\u00d6\5\6\4\2\u00d5\u00d4\3\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00da\7\27\2\2\u00da\u00db\b\20\1\2\u00db\37\3\2\2\2\u00dc"+
		"\u00dd\7\30\2\2\u00dd\u00de\7\5\2\2\u00de\u00df\5\32\16\2\u00df\u00e0"+
		"\7\6\2\2\u00e0\u00e2\7\26\2\2\u00e1\u00e3\5\6\4\2\u00e2\u00e1\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\7\27\2\2\u00e7\u00e8\b\21\1\2\u00e8!\3\2\2\2\u00e9"+
		"\u00eb\7\26\2\2\u00ea\u00ec\5\6\4\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3"+
		"\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\7\27\2\2\u00f0\u00f1\b\22\1\2\u00f1#\3\2\2\2\21)\61jz\u0086\u0088"+
		"\u0095\u0097\u00a2\u00aa\u00b3\u00b7\u00d7\u00e4\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}