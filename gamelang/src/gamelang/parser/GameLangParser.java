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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Define=9, 
		Let=10, Dot=11, Number=12, Identifier=13, Letter=14, LetterOrDigit=15, 
		AT=16, ELLIPSIS=17, WS=18, Comment=19, Line_Comment=20;
	public static final int
		RULE_program = 0, RULE_definedecl = 1, RULE_exp = 2, RULE_numexp = 3, 
		RULE_addexp = 4, RULE_subexp = 5, RULE_multexp = 6, RULE_divexp = 7, RULE_negexp = 8, 
		RULE_infixaddsubt = 9, RULE_infixmuldiv = 10, RULE_infixpower = 11, RULE_varexp = 12, 
		RULE_letexp = 13;
	public static final String[] ruleNames = {
		"program", "definedecl", "exp", "numexp", "addexp", "subexp", "multexp", 
		"divexp", "negexp", "infixaddsubt", "infixmuldiv", "infixpower", "varexp", 
		"letexp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'-'", "'+'", "'*'", "'/'", "'^'", "'define'", 
		"'let'", "'.'", null, null, null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "Define", "Let", 
		"Dot", "Number", "Identifier", "Letter", "LetterOrDigit", "AT", "ELLIPSIS", 
		"WS", "Comment", "Line_Comment"
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(28);
					((ProgramContext)_localctx).def = definedecl();
					 _localctx.defs.add(((ProgramContext)_localctx).def.ast); 
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(39);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << Number) | (1L << Identifier))) != 0)) {
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
			((DefinedeclContext)_localctx).id = match(Identifier);
			setState(44);
			match(T__0);
			setState(45);
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
		public AddexpContext a;
		public SubexpContext s;
		public MultexpContext m;
		public DivexpContext d;
		public LetexpContext l;
		public NegexpContext neg;
		public InfixaddsubtContext in;
		public InfixmuldivContext inm;
		public InfixpowerContext inp;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public SubexpContext subexp() {
			return getRuleContext(SubexpContext.class,0);
		}
		public MultexpContext multexp() {
			return getRuleContext(MultexpContext.class,0);
		}
		public DivexpContext divexp() {
			return getRuleContext(DivexpContext.class,0);
		}
		public LetexpContext letexp() {
			return getRuleContext(LetexpContext.class,0);
		}
		public NegexpContext negexp() {
			return getRuleContext(NegexpContext.class,0);
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
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp);
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(T__1);
				setState(49);
				((ExpContext)_localctx).e = exp();
				setState(50);
				match(T__2);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).e.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				((ExpContext)_localctx).v = varexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).v.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				((ExpContext)_localctx).a = addexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).a.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				((ExpContext)_localctx).s = subexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).s.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				((ExpContext)_localctx).m = multexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).m.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				((ExpContext)_localctx).d = divexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).d.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				((ExpContext)_localctx).l = letexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).l.ast; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				((ExpContext)_localctx).neg = negexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).neg.ast; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(77);
				((ExpContext)_localctx).in = infixaddsubt();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).in.ast;
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(80);
				((ExpContext)_localctx).inm = infixmuldiv();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).inm.ast;
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(83);
				((ExpContext)_localctx).inp = infixpower();
				((ExpContext)_localctx).ast =  ((ExpContext)_localctx).inp.ast;
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
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(T__3);
				setState(91);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(-Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(94);
				match(Dot);
				setState(95);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(T__3);
				setState(98);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(99);
				match(Dot);
				setState(100);
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

	public static class AddexpContext extends ParserRuleContext {
		public AddExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AddexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexp; }
	}

	public final AddexpContext addexp() throws RecognitionException {
		AddexpContext _localctx = new AddexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addexp);
		 ((AddexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__1);
			setState(105);
			match(T__4);
			setState(106);
			((AddexpContext)_localctx).e = exp();
			 _localctx.list.add(((AddexpContext)_localctx).e.ast); 
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				((AddexpContext)_localctx).e = exp();
				 _localctx.list.add(((AddexpContext)_localctx).e.ast); 
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(115);
			match(T__2);
			 ((AddexpContext)_localctx).ast =  new AddExp(_localctx.list); 
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

	public static class SubexpContext extends ParserRuleContext {
		public SubExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SubexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexp; }
	}

	public final SubexpContext subexp() throws RecognitionException {
		SubexpContext _localctx = new SubexpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subexp);
		 ((SubexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__1);
			setState(119);
			match(T__3);
			setState(120);
			((SubexpContext)_localctx).e = exp();
			 _localctx.list.add(((SubexpContext)_localctx).e.ast); 
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				((SubexpContext)_localctx).e = exp();
				 _localctx.list.add(((SubexpContext)_localctx).e.ast); 
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(129);
			match(T__2);
			 ((SubexpContext)_localctx).ast =  new SubExp(_localctx.list); 
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

	public static class MultexpContext extends ParserRuleContext {
		public MultExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MultexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexp; }
	}

	public final MultexpContext multexp() throws RecognitionException {
		MultexpContext _localctx = new MultexpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multexp);
		 ((MultexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__1);
			setState(133);
			match(T__5);
			setState(134);
			((MultexpContext)_localctx).e = exp();
			 _localctx.list.add(((MultexpContext)_localctx).e.ast); 
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				((MultexpContext)_localctx).e = exp();
				 _localctx.list.add(((MultexpContext)_localctx).e.ast); 
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(143);
			match(T__2);
			 ((MultexpContext)_localctx).ast =  new MultExp(_localctx.list); 
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

	public static class DivexpContext extends ParserRuleContext {
		public DivExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public DivexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divexp; }
	}

	public final DivexpContext divexp() throws RecognitionException {
		DivexpContext _localctx = new DivexpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_divexp);
		 ((DivexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__1);
			setState(147);
			match(T__6);
			setState(148);
			((DivexpContext)_localctx).e = exp();
			 _localctx.list.add(((DivexpContext)_localctx).e.ast); 
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				((DivexpContext)_localctx).e = exp();
				 _localctx.list.add(((DivexpContext)_localctx).e.ast); 
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(157);
			match(T__2);
			 ((DivexpContext)_localctx).ast =  new DivExp(_localctx.list); 
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

	public static class NegexpContext extends ParserRuleContext {
		public NegExp ast;
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NegexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negexp; }
	}

	public final NegexpContext negexp() throws RecognitionException {
		NegexpContext _localctx = new NegexpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_negexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__1);
			setState(161);
			match(T__3);
			setState(162);
			((NegexpContext)_localctx).e = exp();
			setState(163);
			match(T__2);
			 ((NegexpContext)_localctx).ast = new NegExp(((NegexpContext)_localctx).e.ast); 
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
		enterRule(_localctx, 18, RULE_infixaddsubt);
		 ((InfixaddsubtContext)_localctx).ast =  null; ArrayList<Exp> list = new ArrayList<Exp>(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((InfixaddsubtContext)_localctx).l = infixmuldiv();
			 ((InfixaddsubtContext)_localctx).ast =  ((InfixaddsubtContext)_localctx).l.ast; 
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(176);
					switch (_input.LA(1)) {
					case T__4:
						{
						{
						setState(168);
						match(T__4);
						setState(169);
						((InfixaddsubtContext)_localctx).r = infixmuldiv();
						 
						                          list = new ArrayList<Exp>();
						                          list.add(_localctx.ast);
						                          list.add(((InfixaddsubtContext)_localctx).r.ast);
						                          ((InfixaddsubtContext)_localctx).ast =  new AddExp(list);
						                        
						}
						}
						break;
					case T__3:
						{
						{
						setState(172);
						match(T__3);
						setState(173);
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
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 20, RULE_infixmuldiv);
		 ((InfixmuldivContext)_localctx).ast =  null; ArrayList<Exp> list = new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			((InfixmuldivContext)_localctx).l = infixpower();
			 ((InfixmuldivContext)_localctx).ast =  ((InfixmuldivContext)_localctx).l.ast; 
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				setState(191);
				switch (_input.LA(1)) {
				case T__5:
					{
					{
					setState(183);
					match(T__5);
					setState(184);
					((InfixmuldivContext)_localctx).r = infixpower();
					 
					                     list = new ArrayList<Exp>();
					                     list.add(_localctx.ast);
					                     list.add(((InfixmuldivContext)_localctx).r.ast);
					                     ((InfixmuldivContext)_localctx).ast =  new MultExp(list);
					                   
					}
					}
					break;
				case T__6:
					{
					{
					setState(187);
					match(T__6);
					setState(188);
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
				setState(195);
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
		enterRule(_localctx, 22, RULE_infixpower);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			((InfixpowerContext)_localctx).l = varexp();
			 ((InfixpowerContext)_localctx).ast =  ((InfixpowerContext)_localctx).l.ast; 
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198);
					match(T__7);
					setState(199);
					((InfixpowerContext)_localctx).exponent = infixpower();
					  // Right-associative exponentiation
					                          ArrayList<Exp> list = new ArrayList<Exp>();
					                          list.add(_localctx.ast);
					                          list.add(((InfixpowerContext)_localctx).exponent.ast);
					                          ((InfixpowerContext)_localctx).ast =  new PowExp(list);
					                        
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 24, RULE_varexp);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				((VarexpContext)_localctx).id = match(Identifier);
				 ((VarexpContext)_localctx).ast =  new VarExp((((VarexpContext)_localctx).id!=null?((VarexpContext)_localctx).id.getText():null)); 
				}
				break;
			case T__3:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
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

	public static class LetexpContext extends ParserRuleContext {
		public LetExp ast;
		public ArrayList<String> names;
		public ArrayList<Exp> value_exps;
		public Token id;
		public ExpContext e;
		public ExpContext body;
		public TerminalNode Let() { return getToken(GameLangParser.Let, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(GameLangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(GameLangParser.Identifier, i);
		}
		public LetexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letexp; }
	}

	public final LetexpContext letexp() throws RecognitionException {
		LetexpContext _localctx = new LetexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_letexp);
		 ((LetexpContext)_localctx).names =  new ArrayList<String>(); ((LetexpContext)_localctx).value_exps =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__1);
			setState(215);
			match(Let);
			setState(216);
			match(T__1);
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				match(T__1);
				setState(218);
				((LetexpContext)_localctx).id = match(Identifier);
				setState(219);
				((LetexpContext)_localctx).e = exp();
				setState(220);
				match(T__2);
				 _localctx.names.add((((LetexpContext)_localctx).id!=null?((LetexpContext)_localctx).id.getText():null)); _localctx.value_exps.add(((LetexpContext)_localctx).e.ast); 
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(227);
			match(T__2);
			setState(228);
			((LetexpContext)_localctx).body = exp();
			setState(229);
			match(T__2);
			 ((LetexpContext)_localctx).ast =  new LetExp(_localctx.names, _localctx.value_exps, ((LetexpContext)_localctx).body.ast); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\u00eb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\3\2\5\2*\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4Y\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"i\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6r\n\6\r\6\16\6s\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\6\7\u0080\n\7\r\7\16\7\u0081\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\6\b\u008e\n\b\r\b\16\b\u008f\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\6\t\u009c\n\t\r\t\16\t\u009d\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u00b3\n\13\f\13\16\13\u00b6\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u00c2\n\f\f\f\16\f\u00c5\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u00cd\n\r\f\r\16\r\u00d0\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u00d7\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00e2\n\17\r\17\16"+
		"\17\u00e3\3\17\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\2\2\u00f7\2#\3\2\2\2\4-\3\2\2\2\6X\3\2\2\2\bh\3\2\2\2\nj"+
		"\3\2\2\2\fx\3\2\2\2\16\u0086\3\2\2\2\20\u0094\3\2\2\2\22\u00a2\3\2\2\2"+
		"\24\u00a8\3\2\2\2\26\u00b7\3\2\2\2\30\u00c6\3\2\2\2\32\u00d6\3\2\2\2\34"+
		"\u00d8\3\2\2\2\36\37\5\4\3\2\37 \b\2\1\2 \"\3\2\2\2!\36\3\2\2\2\"%\3\2"+
		"\2\2#!\3\2\2\2#$\3\2\2\2$)\3\2\2\2%#\3\2\2\2&\'\5\6\4\2\'(\b\2\1\2(*\3"+
		"\2\2\2)&\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\b\2\1\2,\3\3\2\2\2-.\7\17\2\2."+
		"/\7\3\2\2/\60\5\6\4\2\60\61\b\3\1\2\61\5\3\2\2\2\62\63\7\4\2\2\63\64\5"+
		"\6\4\2\64\65\7\5\2\2\65\66\b\4\1\2\66Y\3\2\2\2\678\5\32\16\289\b\4\1\2"+
		"9Y\3\2\2\2:;\5\b\5\2;<\b\4\1\2<Y\3\2\2\2=>\5\n\6\2>?\b\4\1\2?Y\3\2\2\2"+
		"@A\5\f\7\2AB\b\4\1\2BY\3\2\2\2CD\5\16\b\2DE\b\4\1\2EY\3\2\2\2FG\5\20\t"+
		"\2GH\b\4\1\2HY\3\2\2\2IJ\5\34\17\2JK\b\4\1\2KY\3\2\2\2LM\5\22\n\2MN\b"+
		"\4\1\2NY\3\2\2\2OP\5\24\13\2PQ\b\4\1\2QY\3\2\2\2RS\5\26\f\2ST\b\4\1\2"+
		"TY\3\2\2\2UV\5\30\r\2VW\b\4\1\2WY\3\2\2\2X\62\3\2\2\2X\67\3\2\2\2X:\3"+
		"\2\2\2X=\3\2\2\2X@\3\2\2\2XC\3\2\2\2XF\3\2\2\2XI\3\2\2\2XL\3\2\2\2XO\3"+
		"\2\2\2XR\3\2\2\2XU\3\2\2\2Y\7\3\2\2\2Z[\7\16\2\2[i\b\5\1\2\\]\7\6\2\2"+
		"]^\7\16\2\2^i\b\5\1\2_`\7\16\2\2`a\7\r\2\2ab\7\16\2\2bi\b\5\1\2cd\7\6"+
		"\2\2de\7\16\2\2ef\7\r\2\2fg\7\16\2\2gi\b\5\1\2hZ\3\2\2\2h\\\3\2\2\2h_"+
		"\3\2\2\2hc\3\2\2\2i\t\3\2\2\2jk\7\4\2\2kl\7\7\2\2lm\5\6\4\2mq\b\6\1\2"+
		"no\5\6\4\2op\b\6\1\2pr\3\2\2\2qn\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"tu\3\2\2\2uv\7\5\2\2vw\b\6\1\2w\13\3\2\2\2xy\7\4\2\2yz\7\6\2\2z{\5\6\4"+
		"\2{\177\b\7\1\2|}\5\6\4\2}~\b\7\1\2~\u0080\3\2\2\2\177|\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0084\7\5\2\2\u0084\u0085\b\7\1\2\u0085\r\3\2\2\2\u0086\u0087"+
		"\7\4\2\2\u0087\u0088\7\b\2\2\u0088\u0089\5\6\4\2\u0089\u008d\b\b\1\2\u008a"+
		"\u008b\5\6\4\2\u008b\u008c\b\b\1\2\u008c\u008e\3\2\2\2\u008d\u008a\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\7\5\2\2\u0092\u0093\b\b\1\2\u0093\17\3\2\2"+
		"\2\u0094\u0095\7\4\2\2\u0095\u0096\7\t\2\2\u0096\u0097\5\6\4\2\u0097\u009b"+
		"\b\t\1\2\u0098\u0099\5\6\4\2\u0099\u009a\b\t\1\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0098\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\5\2\2\u00a0\u00a1\b\t\1\2\u00a1"+
		"\21\3\2\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\7\6\2\2\u00a4\u00a5\5\6\4"+
		"\2\u00a5\u00a6\7\5\2\2\u00a6\u00a7\b\n\1\2\u00a7\23\3\2\2\2\u00a8\u00a9"+
		"\5\26\f\2\u00a9\u00b4\b\13\1\2\u00aa\u00ab\7\7\2\2\u00ab\u00ac\5\26\f"+
		"\2\u00ac\u00ad\b\13\1\2\u00ad\u00b3\3\2\2\2\u00ae\u00af\7\6\2\2\u00af"+
		"\u00b0\5\26\f\2\u00b0\u00b1\b\13\1\2\u00b1\u00b3\3\2\2\2\u00b2\u00aa\3"+
		"\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\25\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\5\30\r"+
		"\2\u00b8\u00c3\b\f\1\2\u00b9\u00ba\7\b\2\2\u00ba\u00bb\5\30\r\2\u00bb"+
		"\u00bc\b\f\1\2\u00bc\u00c2\3\2\2\2\u00bd\u00be\7\t\2\2\u00be\u00bf\5\30"+
		"\r\2\u00bf\u00c0\b\f\1\2\u00c0\u00c2\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1"+
		"\u00bd\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\27\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\5\32\16\2\u00c7"+
		"\u00ce\b\r\1\2\u00c8\u00c9\7\n\2\2\u00c9\u00ca\5\30\r\2\u00ca\u00cb\b"+
		"\r\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\31\3\2\2\2\u00d0\u00ce\3\2\2"+
		"\2\u00d1\u00d2\7\17\2\2\u00d2\u00d7\b\16\1\2\u00d3\u00d4\5\b\5\2\u00d4"+
		"\u00d5\b\16\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d3\3"+
		"\2\2\2\u00d7\33\3\2\2\2\u00d8\u00d9\7\4\2\2\u00d9\u00da\7\f\2\2\u00da"+
		"\u00e1\7\4\2\2\u00db\u00dc\7\4\2\2\u00dc\u00dd\7\17\2\2\u00dd\u00de\5"+
		"\6\4\2\u00de\u00df\7\5\2\2\u00df\u00e0\b\17\1\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00db\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\5\2\2\u00e6\u00e7\5\6\4\2\u00e7"+
		"\u00e8\7\5\2\2\u00e8\u00e9\b\17\1\2\u00e9\35\3\2\2\2\21#)Xhs\u0081\u008f"+
		"\u009d\u00b2\u00b4\u00c1\u00c3\u00ce\u00d6\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}