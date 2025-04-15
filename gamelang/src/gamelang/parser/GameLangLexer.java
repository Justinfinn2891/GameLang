// Generated from GameLang.g by ANTLR 4.5
package gamelang.parser; import static gamelang.AST.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GameLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, Define=11, Print=12, Roll=13, CALL=14, EXIT_GAME=15, Let=16, 
		Dot=17, Number=18, Identifier=19, Letter=20, LetterOrDigit=21, AT=22, 
		ELLIPSIS=23, WS=24, Comment=25, Line_Comment=26, STRING=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "Define", "Print", "Roll", "CALL", "EXIT_GAME", "Let", "Dot", 
		"Number", "Identifier", "Letter", "LetterOrDigit", "DIGIT", "AT", "ELLIPSIS", 
		"WS", "Comment", "Line_Comment", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'STAT'", "'='", "'('", "')'", "'-'", "'+'", "'*'", "'/'", "'^'", 
		"'ORDER66'", "'define'", "'PRINT'", "'ROLL'", "'CALL'", "'EXIT_GAME'", 
		"'let'", "'.'", null, null, null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "Define", 
		"Print", "Roll", "CALL", "EXIT_GAME", "Let", "Dot", "Number", "Identifier", 
		"Letter", "LetterOrDigit", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment", 
		"STRING"
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


	public GameLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GameLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 20:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00ce\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\6\23\u0081\n\23\r\23\16\23\u0082\3\24\3\24\7\24\u0087\n\24\f"+
		"\24\16\24\u008a\13\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0092\n\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u009a\n\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\6\32\u00a5\n\32\r\32\16\32\u00a6\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\7\33\u00af\n\33\f\33\16\33\u00b2\13\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\7\34\u00bd\n\34\f\34\16\34\u00c0\13\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\7\35\u00c8\n\35\f\35\16\35\u00cb\13\35\3"+
		"\35\3\35\3\u00b0\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\30\61\31\63\32"+
		"\65\33\67\349\35\3\2\n\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802"+
		"\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17"+
		"\17\4\2$$^^\u00d7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\3;\3\2\2\2\5@\3\2\2\2\7B\3\2\2\2\tD\3\2\2\2\13F\3\2\2\2\rH\3\2\2\2\17"+
		"J\3\2\2\2\21L\3\2\2\2\23N\3\2\2\2\25P\3\2\2\2\27X\3\2\2\2\31_\3\2\2\2"+
		"\33e\3\2\2\2\35j\3\2\2\2\37o\3\2\2\2!y\3\2\2\2#}\3\2\2\2%\u0080\3\2\2"+
		"\2\'\u0084\3\2\2\2)\u0091\3\2\2\2+\u0099\3\2\2\2-\u009b\3\2\2\2/\u009d"+
		"\3\2\2\2\61\u009f\3\2\2\2\63\u00a4\3\2\2\2\65\u00aa\3\2\2\2\67\u00b8\3"+
		"\2\2\29\u00c3\3\2\2\2;<\7U\2\2<=\7V\2\2=>\7C\2\2>?\7V\2\2?\4\3\2\2\2@"+
		"A\7?\2\2A\6\3\2\2\2BC\7*\2\2C\b\3\2\2\2DE\7+\2\2E\n\3\2\2\2FG\7/\2\2G"+
		"\f\3\2\2\2HI\7-\2\2I\16\3\2\2\2JK\7,\2\2K\20\3\2\2\2LM\7\61\2\2M\22\3"+
		"\2\2\2NO\7`\2\2O\24\3\2\2\2PQ\7Q\2\2QR\7T\2\2RS\7F\2\2ST\7G\2\2TU\7T\2"+
		"\2UV\78\2\2VW\78\2\2W\26\3\2\2\2XY\7f\2\2YZ\7g\2\2Z[\7h\2\2[\\\7k\2\2"+
		"\\]\7p\2\2]^\7g\2\2^\30\3\2\2\2_`\7R\2\2`a\7T\2\2ab\7K\2\2bc\7P\2\2cd"+
		"\7V\2\2d\32\3\2\2\2ef\7T\2\2fg\7Q\2\2gh\7N\2\2hi\7N\2\2i\34\3\2\2\2jk"+
		"\7E\2\2kl\7C\2\2lm\7N\2\2mn\7N\2\2n\36\3\2\2\2op\7G\2\2pq\7Z\2\2qr\7K"+
		"\2\2rs\7V\2\2st\7a\2\2tu\7I\2\2uv\7C\2\2vw\7O\2\2wx\7G\2\2x \3\2\2\2y"+
		"z\7n\2\2z{\7g\2\2{|\7v\2\2|\"\3\2\2\2}~\7\60\2\2~$\3\2\2\2\177\u0081\5"+
		"-\27\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083&\3\2\2\2\u0084\u0088\5)\25\2\u0085\u0087\5+\26\2"+
		"\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089(\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0092\t\2\2\2\u008c"+
		"\u008d\n\3\2\2\u008d\u0092\6\25\2\2\u008e\u008f\t\4\2\2\u008f\u0090\t"+
		"\5\2\2\u0090\u0092\6\25\3\2\u0091\u008b\3\2\2\2\u0091\u008c\3\2\2\2\u0091"+
		"\u008e\3\2\2\2\u0092*\3\2\2\2\u0093\u009a\t\6\2\2\u0094\u0095\n\3\2\2"+
		"\u0095\u009a\6\26\4\2\u0096\u0097\t\4\2\2\u0097\u0098\t\5\2\2\u0098\u009a"+
		"\6\26\5\2\u0099\u0093\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0096\3\2\2\2"+
		"\u009a,\3\2\2\2\u009b\u009c\4\62;\2\u009c.\3\2\2\2\u009d\u009e\7B\2\2"+
		"\u009e\60\3\2\2\2\u009f\u00a0\7\60\2\2\u00a0\u00a1\7\60\2\2\u00a1\u00a2"+
		"\7\60\2\2\u00a2\62\3\2\2\2\u00a3\u00a5\t\7\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a9\b\32\2\2\u00a9\64\3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab"+
		"\u00ac\7,\2\2\u00ac\u00b0\3\2\2\2\u00ad\u00af\13\2\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7,\2\2\u00b4\u00b5\7\61"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\33\2\2\u00b7\66\3\2\2\2\u00b8\u00b9"+
		"\7\61\2\2\u00b9\u00ba\7\61\2\2\u00ba\u00be\3\2\2\2\u00bb\u00bd\n\b\2\2"+
		"\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\b\34\2\2"+
		"\u00c28\3\2\2\2\u00c3\u00c9\7$\2\2\u00c4\u00c8\n\t\2\2\u00c5\u00c6\7^"+
		"\2\2\u00c6\u00c8\13\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7$\2\2\u00cd:\3\2\2\2\f\2\u0082\u0088"+
		"\u0091\u0099\u00a6\u00b0\u00be\u00c7\u00c9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}