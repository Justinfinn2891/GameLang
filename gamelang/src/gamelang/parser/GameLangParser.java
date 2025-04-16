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
		Define=18, Print=19, Roll=20, CALL=21, EXIT_GAME=22, Let=23, Dot=24, Number=25, 
		Identifier=26, Letter=27, LetterOrDigit=28, AT=29, ELLIPSIS=30, WS=31, 
		Comment=32, Line_Comment=33, STRING=34;
	public static final int
		RULE_program = 0, RULE_definedecl = 1, RULE_exp = 2, RULE_numexp = 3, 
		RULE_infixaddsubt = 4, RULE_infixmuldiv = 5, RULE_infixpower = 6, RULE_varexp = 7, 
		RULE_printexp = 8, RULE_rollexp = 9, RULE_exitexp = 10, RULE_orderexp = 11, 
		RULE_boolexp = 12, RULE_ifexp = 13;
	public static final String[] ruleNames = {
		"program", "definedecl", "exp", "numexp", "infixaddsubt", "infixmuldiv", 
		"infixpower", "varexp", "printexp", "rollexp", "exitexp", "orderexp", 
		"boolexp", "ifexp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'STAT'", "'='", "'('", "')'", "'-'", "'+'", "'*'", "'/'", "'^'", 
		"'ORDER66'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'IF'", "'define'", 
		"'PRINT'", "'ROLL'", "'CALL'", "'EXIT_GAME'", "'let'", "'.'", null, null, 
		null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "Define", "Print", "Roll", "CALL", 
		"EXIT_GAME", "Let", "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", 
		"AT", "ELLIPSIS", "WS", "Comment", "Line_Comment", "STRING"
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
		public Exp expr;
		public DefinedeclContext def;
		public ExpContext e;
		public List<DefinedeclContext> definedecl() {
			return getRuleContexts(DefinedeclContext.class);
		}
		public DefinedeclContext definedecl(int i) {
			return getRuleContext(DefinedeclContext.class,i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		 ((ProgramContext)_localctx).defs =  new ArrayList<DefineDecl>(); ((ProgramContext)_localctx).expr =  new UnitExp(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(28);
				((ProgramContext)_localctx).def = definedecl();
				 _localctx.defs.add(((ProgramContext)_localctx).def.ast); 
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__16) | (1L << Print) | (1L << Roll) | (1L << CALL) | (1L << Number) | (1L << Identifier))) != 0)) {
				{
				setState(36);
				((ProgramContext)_localctx).e = exp();
				 ((ProgramContext)_localctx).expr =  ((ProgramContext)_localctx).e.ast; 
				}
			}

			 ((ProgramContext)_localctx).ast =  new Program(_localctx.defs, _localctx.expr); 
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
			setState(43);
			match(T__0);
			setState(44);
			((DefinedeclContext)_localctx).id = match(Identifier);
			setState(45);
			match(T__1);
			setState(46);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp);
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__2);
				setState(50);
				((ExpContext)_localctx).e = exp();
				setState(51);
				match(T__3);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).e.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				((ExpContext)_localctx).v = varexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).v.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				((ExpContext)_localctx).in = infixaddsubt();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).in.ast;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				((ExpContext)_localctx).inm = infixmuldiv();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).inm.ast;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				((ExpContext)_localctx).inp = infixpower();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).inp.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				((ExpContext)_localctx).p = printexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).p.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				((ExpContext)_localctx).r = rollexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).r.ast; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(75);
				((ExpContext)_localctx).x = exitexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).x.ast; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(78);
				((ExpContext)_localctx).o = orderexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).o.ast; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(81);
				((ExpContext)_localctx).i = ifexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).i.ast; 
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
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__4);
				setState(89);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(-Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(92);
				match(Dot);
				setState(93);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(T__4);
				setState(96);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(97);
				match(Dot);
				setState(98);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((InfixaddsubtContext)_localctx).l = infixmuldiv();
			 ((InfixaddsubtContext)_localctx).ast =  ((InfixaddsubtContext)_localctx).l.ast; 
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(112);
					switch (_input.LA(1)) {
					case T__5:
						{
						{
						setState(104);
						match(T__5);
						setState(105);
						((InfixaddsubtContext)_localctx).r = infixmuldiv();
						 
						                          list = new ArrayList<Exp>();
						                          list.add(_localctx.ast);
						                          list.add(((InfixaddsubtContext)_localctx).r.ast);
						                          ((InfixaddsubtContext)_localctx).ast =  new AddExp(list);
						                        
						}
						}
						break;
					case T__4:
						{
						{
						setState(108);
						match(T__4);
						setState(109);
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
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(117);
			((InfixmuldivContext)_localctx).l = infixpower();
			 ((InfixmuldivContext)_localctx).ast =  ((InfixmuldivContext)_localctx).l.ast; 
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				setState(127);
				switch (_input.LA(1)) {
				case T__6:
					{
					{
					setState(119);
					match(T__6);
					setState(120);
					((InfixmuldivContext)_localctx).r = infixpower();
					 
					                     list = new ArrayList<Exp>();
					                     list.add(_localctx.ast);
					                     list.add(((InfixmuldivContext)_localctx).r.ast);
					                     ((InfixmuldivContext)_localctx).ast =  new MultExp(list);
					                   
					}
					}
					break;
				case T__7:
					{
					{
					setState(123);
					match(T__7);
					setState(124);
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
				setState(131);
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
			setState(132);
			((InfixpowerContext)_localctx).l = varexp();
			 ((InfixpowerContext)_localctx).ast =  ((InfixpowerContext)_localctx).l.ast; 
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					match(T__8);
					setState(135);
					((InfixpowerContext)_localctx).exponent = infixpower();
					  // Right-associative exponentiation
					                          ArrayList<Exp> list = new ArrayList<Exp>();
					                          list.add(_localctx.ast);
					                          list.add(((InfixpowerContext)_localctx).exponent.ast);
					                          ((InfixpowerContext)_localctx).ast =  new PowExp(list);
					                        
					}
					} 
				}
				setState(142);
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
			setState(148);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				((VarexpContext)_localctx).id = match(Identifier);
				 ((VarexpContext)_localctx).ast =  new VarExp((((VarexpContext)_localctx).id!=null?((VarexpContext)_localctx).id.getText():null)); 
				}
				break;
			case T__4:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
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

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(Print);
			setState(158); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(156);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(151);
						((PrintexpContext)_localctx).s = match(STRING);

						              String raw = (((PrintexpContext)_localctx).s!=null?((PrintexpContext)_localctx).s.getText():null);
						              parts.add(new StrLitExp(raw.substring(1, raw.length() - 1)));
						          
						}
						break;
					case T__2:
					case T__4:
					case T__9:
					case T__16:
					case Print:
					case Roll:
					case CALL:
					case Number:
					case Identifier:
						{
						setState(153);
						((PrintexpContext)_localctx).e = exp();
						 parts.add(((PrintexpContext)_localctx).e.ast); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(160); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			          ((PrintexpContext)_localctx).ast =  new PrintExp(parts);
			      
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
			setState(164);
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
			setState(167);
			match(CALL);
			setState(168);
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
			setState(171);
			match(T__9);
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
			setState(174);
			((BoolexpContext)_localctx).l = exp();
			setState(175);
			((BoolexpContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
				((BoolexpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(176);
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

	public static class IfexpContext extends ParserRuleContext {
		public Exp ast;
		public BoolexpContext cond;
		public ExpContext stmt;
		public BoolexpContext boolexp() {
			return getRuleContext(BoolexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IfexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexp; }
	}

	public final IfexpContext ifexp() throws RecognitionException {
		IfexpContext _localctx = new IfexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__16);
			setState(180);
			match(T__2);
			setState(181);
			((IfexpContext)_localctx).cond = boolexp();
			setState(182);
			match(T__3);
			setState(183);
			((IfexpContext)_localctx).stmt = exp();

			        ((IfexpContext)_localctx).ast =  new IfExp(((IfexpContext)_localctx).cond.ast, ((IfexpContext)_localctx).stmt.ast);
			    
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00bd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2"+
		"%\13\2\3\2\3\2\3\2\5\2*\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4W\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5g\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6s\n\6\f\6\16\6v\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0082\n\7\f\7\16\7\u0085\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090\13\b\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0097\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009f\n\n\6\n\u00a1\n\n\r"+
		"\n\16\n\u00a2\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\2\2\20\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2\r\22\u00c5\2#\3\2\2\2\4-\3"+
		"\2\2\2\6V\3\2\2\2\bf\3\2\2\2\nh\3\2\2\2\fw\3\2\2\2\16\u0086\3\2\2\2\20"+
		"\u0096\3\2\2\2\22\u0098\3\2\2\2\24\u00a6\3\2\2\2\26\u00a9\3\2\2\2\30\u00ad"+
		"\3\2\2\2\32\u00b0\3\2\2\2\34\u00b5\3\2\2\2\36\37\5\4\3\2\37 \b\2\1\2 "+
		"\"\3\2\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$)\3\2\2\2%#\3\2"+
		"\2\2&\'\5\6\4\2\'(\b\2\1\2(*\3\2\2\2)&\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\b"+
		"\2\1\2,\3\3\2\2\2-.\7\3\2\2./\7\34\2\2/\60\7\4\2\2\60\61\5\6\4\2\61\62"+
		"\b\3\1\2\62\5\3\2\2\2\63\64\7\5\2\2\64\65\5\6\4\2\65\66\7\6\2\2\66\67"+
		"\b\4\1\2\67W\3\2\2\289\5\20\t\29:\b\4\1\2:W\3\2\2\2;<\5\b\5\2<=\b\4\1"+
		"\2=W\3\2\2\2>?\5\n\6\2?@\b\4\1\2@W\3\2\2\2AB\5\f\7\2BC\b\4\1\2CW\3\2\2"+
		"\2DE\5\16\b\2EF\b\4\1\2FW\3\2\2\2GH\5\22\n\2HI\b\4\1\2IW\3\2\2\2JK\5\24"+
		"\13\2KL\b\4\1\2LW\3\2\2\2MN\5\26\f\2NO\b\4\1\2OW\3\2\2\2PQ\5\30\r\2QR"+
		"\b\4\1\2RW\3\2\2\2ST\5\34\17\2TU\b\4\1\2UW\3\2\2\2V\63\3\2\2\2V8\3\2\2"+
		"\2V;\3\2\2\2V>\3\2\2\2VA\3\2\2\2VD\3\2\2\2VG\3\2\2\2VJ\3\2\2\2VM\3\2\2"+
		"\2VP\3\2\2\2VS\3\2\2\2W\7\3\2\2\2XY\7\33\2\2Yg\b\5\1\2Z[\7\7\2\2[\\\7"+
		"\33\2\2\\g\b\5\1\2]^\7\33\2\2^_\7\32\2\2_`\7\33\2\2`g\b\5\1\2ab\7\7\2"+
		"\2bc\7\33\2\2cd\7\32\2\2de\7\33\2\2eg\b\5\1\2fX\3\2\2\2fZ\3\2\2\2f]\3"+
		"\2\2\2fa\3\2\2\2g\t\3\2\2\2hi\5\f\7\2it\b\6\1\2jk\7\b\2\2kl\5\f\7\2lm"+
		"\b\6\1\2ms\3\2\2\2no\7\7\2\2op\5\f\7\2pq\b\6\1\2qs\3\2\2\2rj\3\2\2\2r"+
		"n\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\13\3\2\2\2vt\3\2\2\2wx\5\16\b"+
		"\2x\u0083\b\7\1\2yz\7\t\2\2z{\5\16\b\2{|\b\7\1\2|\u0082\3\2\2\2}~\7\n"+
		"\2\2~\177\5\16\b\2\177\u0080\b\7\1\2\u0080\u0082\3\2\2\2\u0081y\3\2\2"+
		"\2\u0081}\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\r\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\5\20\t\2\u0087"+
		"\u008e\b\b\1\2\u0088\u0089\7\13\2\2\u0089\u008a\5\16\b\2\u008a\u008b\b"+
		"\b\1\2\u008b\u008d\3\2\2\2\u008c\u0088\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\17\3\2\2\2\u0090\u008e\3\2\2"+
		"\2\u0091\u0092\7\34\2\2\u0092\u0097\b\t\1\2\u0093\u0094\5\b\5\2\u0094"+
		"\u0095\b\t\1\2\u0095\u0097\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0093\3\2"+
		"\2\2\u0097\21\3\2\2\2\u0098\u00a0\7\25\2\2\u0099\u009a\7$\2\2\u009a\u009f"+
		"\b\n\1\2\u009b\u009c\5\6\4\2\u009c\u009d\b\n\1\2\u009d\u009f\3\2\2\2\u009e"+
		"\u0099\3\2\2\2\u009e\u009b\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\b\n\1\2\u00a5\23\3\2\2\2\u00a6\u00a7\7\26\2"+
		"\2\u00a7\u00a8\b\13\1\2\u00a8\25\3\2\2\2\u00a9\u00aa\7\27\2\2\u00aa\u00ab"+
		"\7\30\2\2\u00ab\u00ac\b\f\1\2\u00ac\27\3\2\2\2\u00ad\u00ae\7\f\2\2\u00ae"+
		"\u00af\b\r\1\2\u00af\31\3\2\2\2\u00b0\u00b1\5\6\4\2\u00b1\u00b2\t\2\2"+
		"\2\u00b2\u00b3\5\6\4\2\u00b3\u00b4\b\16\1\2\u00b4\33\3\2\2\2\u00b5\u00b6"+
		"\7\23\2\2\u00b6\u00b7\7\5\2\2\u00b7\u00b8\5\32\16\2\u00b8\u00b9\7\6\2"+
		"\2\u00b9\u00ba\5\6\4\2\u00ba\u00bb\b\17\1\2\u00bb\35\3\2\2\2\16#)Vfrt"+
		"\u0081\u0083\u008e\u0096\u009e\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}