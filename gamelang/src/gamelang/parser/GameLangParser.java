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
		Define=10, Print=11, Let=12, Dot=13, Number=14, Identifier=15, Letter=16, 
		LetterOrDigit=17, AT=18, ELLIPSIS=19, WS=20, Comment=21, Line_Comment=22, 
		STRING=23;
	public static final int
		RULE_program = 0, RULE_definedecl = 1, RULE_exp = 2, RULE_numexp = 3, 
		RULE_infixaddsubt = 4, RULE_infixmuldiv = 5, RULE_infixpower = 6, RULE_varexp = 7, 
		RULE_printexp = 8;
	public static final String[] ruleNames = {
		"program", "definedecl", "exp", "numexp", "infixaddsubt", "infixmuldiv", 
		"infixpower", "varexp", "printexp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'STAT'", "'='", "'('", "')'", "'-'", "'+'", "'*'", "'/'", "'^'", 
		"'define'", "'PRINT'", "'let'", "'.'", null, null, null, null, "'@'", 
		"'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "Define", 
		"Print", "Let", "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", 
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(18);
				((ProgramContext)_localctx).def = definedecl();
				 _localctx.defs.add(((ProgramContext)_localctx).def.ast); 
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << Print) | (1L << Number) | (1L << Identifier))) != 0)) {
				{
				setState(26);
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
			setState(33);
			match(T__0);
			setState(34);
			((DefinedeclContext)_localctx).id = match(Identifier);
			setState(35);
			match(T__1);
			setState(36);
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
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp);
		try {
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(T__2);
				setState(40);
				((ExpContext)_localctx).e = exp();
				setState(41);
				match(T__3);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).e.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				((ExpContext)_localctx).v = varexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).v.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				((ExpContext)_localctx).in = infixaddsubt();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).in.ast;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				((ExpContext)_localctx).inm = infixmuldiv();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).inm.ast;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				((ExpContext)_localctx).inp = infixpower();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).inp.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				((ExpContext)_localctx).p = printexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).p.ast; 
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
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__4);
				setState(67);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(-Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(70);
				match(Dot);
				setState(71);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(T__4);
				setState(74);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(75);
				match(Dot);
				setState(76);
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
			setState(80);
			((InfixaddsubtContext)_localctx).l = infixmuldiv();
			 ((InfixaddsubtContext)_localctx).ast =  ((InfixaddsubtContext)_localctx).l.ast; 
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(90);
					switch (_input.LA(1)) {
					case T__5:
						{
						{
						setState(82);
						match(T__5);
						setState(83);
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
						setState(86);
						match(T__4);
						setState(87);
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
				setState(94);
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
			setState(95);
			((InfixmuldivContext)_localctx).l = infixpower();
			 ((InfixmuldivContext)_localctx).ast =  ((InfixmuldivContext)_localctx).l.ast; 
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				setState(105);
				switch (_input.LA(1)) {
				case T__6:
					{
					{
					setState(97);
					match(T__6);
					setState(98);
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
					setState(101);
					match(T__7);
					setState(102);
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
				setState(109);
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
			setState(110);
			((InfixpowerContext)_localctx).l = varexp();
			 ((InfixpowerContext)_localctx).ast =  ((InfixpowerContext)_localctx).l.ast; 
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					match(T__8);
					setState(113);
					((InfixpowerContext)_localctx).exponent = infixpower();
					  // Right-associative exponentiation
					                          ArrayList<Exp> list = new ArrayList<Exp>();
					                          list.add(_localctx.ast);
					                          list.add(((InfixpowerContext)_localctx).exponent.ast);
					                          ((InfixpowerContext)_localctx).ast =  new PowExp(list);
					                        
					}
					} 
				}
				setState(120);
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
			setState(126);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				((VarexpContext)_localctx).id = match(Identifier);
				 ((VarexpContext)_localctx).ast =  new VarExp((((VarexpContext)_localctx).id!=null?((VarexpContext)_localctx).id.getText():null)); 
				}
				break;
			case T__4:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
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
			setState(128);
			match(Print);
			setState(136); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(134);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(129);
						((PrintexpContext)_localctx).s = match(STRING);

						              String raw = (((PrintexpContext)_localctx).s!=null?((PrintexpContext)_localctx).s.getText():null);
						              parts.add(new StrLitExp(raw.substring(1, raw.length() - 1)));
						          
						}
						break;
					case T__2:
					case T__4:
					case Print:
					case Number:
					case Identifier:
						{
						setState(131);
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
				setState(138); 
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0091\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\2\5\2 \n\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bw\n\b\f"+
		"\b\16\bz\13\b\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0089\n\n\6\n\u008b\n\n\r\n\16\n\u008c\3\n\3\n\3\n\2\2\13\2\4\6"+
		"\b\n\f\16\20\22\2\2\u009a\2\31\3\2\2\2\4#\3\2\2\2\6@\3\2\2\2\bP\3\2\2"+
		"\2\nR\3\2\2\2\fa\3\2\2\2\16p\3\2\2\2\20\u0080\3\2\2\2\22\u0082\3\2\2\2"+
		"\24\25\5\4\3\2\25\26\b\2\1\2\26\30\3\2\2\2\27\24\3\2\2\2\30\33\3\2\2\2"+
		"\31\27\3\2\2\2\31\32\3\2\2\2\32\37\3\2\2\2\33\31\3\2\2\2\34\35\5\6\4\2"+
		"\35\36\b\2\1\2\36 \3\2\2\2\37\34\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\b\2"+
		"\1\2\"\3\3\2\2\2#$\7\3\2\2$%\7\21\2\2%&\7\4\2\2&\'\5\6\4\2\'(\b\3\1\2"+
		"(\5\3\2\2\2)*\7\5\2\2*+\5\6\4\2+,\7\6\2\2,-\b\4\1\2-A\3\2\2\2./\5\20\t"+
		"\2/\60\b\4\1\2\60A\3\2\2\2\61\62\5\b\5\2\62\63\b\4\1\2\63A\3\2\2\2\64"+
		"\65\5\n\6\2\65\66\b\4\1\2\66A\3\2\2\2\678\5\f\7\289\b\4\1\29A\3\2\2\2"+
		":;\5\16\b\2;<\b\4\1\2<A\3\2\2\2=>\5\22\n\2>?\b\4\1\2?A\3\2\2\2@)\3\2\2"+
		"\2@.\3\2\2\2@\61\3\2\2\2@\64\3\2\2\2@\67\3\2\2\2@:\3\2\2\2@=\3\2\2\2A"+
		"\7\3\2\2\2BC\7\20\2\2CQ\b\5\1\2DE\7\7\2\2EF\7\20\2\2FQ\b\5\1\2GH\7\20"+
		"\2\2HI\7\17\2\2IJ\7\20\2\2JQ\b\5\1\2KL\7\7\2\2LM\7\20\2\2MN\7\17\2\2N"+
		"O\7\20\2\2OQ\b\5\1\2PB\3\2\2\2PD\3\2\2\2PG\3\2\2\2PK\3\2\2\2Q\t\3\2\2"+
		"\2RS\5\f\7\2S^\b\6\1\2TU\7\b\2\2UV\5\f\7\2VW\b\6\1\2W]\3\2\2\2XY\7\7\2"+
		"\2YZ\5\f\7\2Z[\b\6\1\2[]\3\2\2\2\\T\3\2\2\2\\X\3\2\2\2]`\3\2\2\2^\\\3"+
		"\2\2\2^_\3\2\2\2_\13\3\2\2\2`^\3\2\2\2ab\5\16\b\2bm\b\7\1\2cd\7\t\2\2"+
		"de\5\16\b\2ef\b\7\1\2fl\3\2\2\2gh\7\n\2\2hi\5\16\b\2ij\b\7\1\2jl\3\2\2"+
		"\2kc\3\2\2\2kg\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\r\3\2\2\2om\3\2"+
		"\2\2pq\5\20\t\2qx\b\b\1\2rs\7\13\2\2st\5\16\b\2tu\b\b\1\2uw\3\2\2\2vr"+
		"\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\17\3\2\2\2zx\3\2\2\2{|\7\21\2"+
		"\2|\u0081\b\t\1\2}~\5\b\5\2~\177\b\t\1\2\177\u0081\3\2\2\2\u0080{\3\2"+
		"\2\2\u0080}\3\2\2\2\u0081\21\3\2\2\2\u0082\u008a\7\r\2\2\u0083\u0084\7"+
		"\31\2\2\u0084\u0089\b\n\1\2\u0085\u0086\5\6\4\2\u0086\u0087\b\n\1\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0085\3\2\2\2\u0089\u008b\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\n\1\2\u008f\23\3\2\2"+
		"\2\16\31\37@P\\^kmx\u0080\u0088\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}