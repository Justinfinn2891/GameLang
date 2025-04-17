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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, Define=22, Print=23, Roll=24, 
		CALL=25, EXIT_GAME=26, Let=27, Dot=28, ENTER_QUEST=29, Number=30, Identifier=31, 
		Letter=32, LetterOrDigit=33, AT=34, ELLIPSIS=35, WS=36, Comment=37, Line_Comment=38, 
		STRING=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "Define", "Print", "Roll", "CALL", 
		"EXIT_GAME", "Let", "Dot", "ENTER_QUEST", "Number", "Identifier", "Letter", 
		"LetterOrDigit", "DIGIT", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment", 
		"STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'STAT'", "'='", "'('", "')'", "'-'", "'+'", "'*'", "'/'", "'^'", 
		"'|'", "'ORDER66'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'SHOOT-IF'", 
		"'{'", "'}'", "'RESPAWN-UNTIL'", "'define'", "'PRINT'", "'ROLL'", "'CALL'", 
		"'EXIT_GAME'", "'let'", "'.'", "'ENTER-QUEST'", null, null, null, null, 
		"'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "Define", 
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
		case 31:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 32:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u011f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\6\37\u00d2\n\37\r\37\16\37\u00d3\3 \3 \7 \u00d8"+
		"\n \f \16 \u00db\13 \3!\3!\3!\3!\3!\3!\5!\u00e3\n!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\5\"\u00eb\n\"\3#\3#\3$\3$\3%\3%\3%\3%\3&\6&\u00f6\n&\r&\16&\u00f7"+
		"\3&\3&\3\'\3\'\3\'\3\'\7\'\u0100\n\'\f\'\16\'\u0103\13\'\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\7(\u010e\n(\f(\16(\u0111\13(\3(\3(\3)\3)\3)\3)\7)\u0119"+
		"\n)\f)\16)\u011c\13)\3)\3)\3\u0101\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E\2G$I%K&M\'O(Q)\3\2\n\6"+
		"\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7"+
		"\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2$$^^\u0128\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5X\3\2\2\2\7Z\3\2\2"+
		"\2\t\\\3\2\2\2\13^\3\2\2\2\r`\3\2\2\2\17b\3\2\2\2\21d\3\2\2\2\23f\3\2"+
		"\2\2\25h\3\2\2\2\27j\3\2\2\2\31r\3\2\2\2\33t\3\2\2\2\35v\3\2\2\2\37y\3"+
		"\2\2\2!|\3\2\2\2#\177\3\2\2\2%\u0082\3\2\2\2\'\u008b\3\2\2\2)\u008d\3"+
		"\2\2\2+\u008f\3\2\2\2-\u009d\3\2\2\2/\u00a4\3\2\2\2\61\u00aa\3\2\2\2\63"+
		"\u00af\3\2\2\2\65\u00b4\3\2\2\2\67\u00be\3\2\2\29\u00c2\3\2\2\2;\u00c4"+
		"\3\2\2\2=\u00d1\3\2\2\2?\u00d5\3\2\2\2A\u00e2\3\2\2\2C\u00ea\3\2\2\2E"+
		"\u00ec\3\2\2\2G\u00ee\3\2\2\2I\u00f0\3\2\2\2K\u00f5\3\2\2\2M\u00fb\3\2"+
		"\2\2O\u0109\3\2\2\2Q\u0114\3\2\2\2ST\7U\2\2TU\7V\2\2UV\7C\2\2VW\7V\2\2"+
		"W\4\3\2\2\2XY\7?\2\2Y\6\3\2\2\2Z[\7*\2\2[\b\3\2\2\2\\]\7+\2\2]\n\3\2\2"+
		"\2^_\7/\2\2_\f\3\2\2\2`a\7-\2\2a\16\3\2\2\2bc\7,\2\2c\20\3\2\2\2de\7\61"+
		"\2\2e\22\3\2\2\2fg\7`\2\2g\24\3\2\2\2hi\7~\2\2i\26\3\2\2\2jk\7Q\2\2kl"+
		"\7T\2\2lm\7F\2\2mn\7G\2\2no\7T\2\2op\78\2\2pq\78\2\2q\30\3\2\2\2rs\7@"+
		"\2\2s\32\3\2\2\2tu\7>\2\2u\34\3\2\2\2vw\7@\2\2wx\7?\2\2x\36\3\2\2\2yz"+
		"\7>\2\2z{\7?\2\2{ \3\2\2\2|}\7?\2\2}~\7?\2\2~\"\3\2\2\2\177\u0080\7#\2"+
		"\2\u0080\u0081\7?\2\2\u0081$\3\2\2\2\u0082\u0083\7U\2\2\u0083\u0084\7"+
		"J\2\2\u0084\u0085\7Q\2\2\u0085\u0086\7Q\2\2\u0086\u0087\7V\2\2\u0087\u0088"+
		"\7/\2\2\u0088\u0089\7K\2\2\u0089\u008a\7H\2\2\u008a&\3\2\2\2\u008b\u008c"+
		"\7}\2\2\u008c(\3\2\2\2\u008d\u008e\7\177\2\2\u008e*\3\2\2\2\u008f\u0090"+
		"\7T\2\2\u0090\u0091\7G\2\2\u0091\u0092\7U\2\2\u0092\u0093\7R\2\2\u0093"+
		"\u0094\7C\2\2\u0094\u0095\7Y\2\2\u0095\u0096\7P\2\2\u0096\u0097\7/\2\2"+
		"\u0097\u0098\7W\2\2\u0098\u0099\7P\2\2\u0099\u009a\7V\2\2\u009a\u009b"+
		"\7K\2\2\u009b\u009c\7N\2\2\u009c,\3\2\2\2\u009d\u009e\7f\2\2\u009e\u009f"+
		"\7g\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7R\2\2\u00a5\u00a6\7T\2\2\u00a6"+
		"\u00a7\7K\2\2\u00a7\u00a8\7P\2\2\u00a8\u00a9\7V\2\2\u00a9\60\3\2\2\2\u00aa"+
		"\u00ab\7T\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad\7N\2\2\u00ad\u00ae\7N\2\2"+
		"\u00ae\62\3\2\2\2\u00af\u00b0\7E\2\2\u00b0\u00b1\7C\2\2\u00b1\u00b2\7"+
		"N\2\2\u00b2\u00b3\7N\2\2\u00b3\64\3\2\2\2\u00b4\u00b5\7G\2\2\u00b5\u00b6"+
		"\7Z\2\2\u00b6\u00b7\7K\2\2\u00b7\u00b8\7V\2\2\u00b8\u00b9\7a\2\2\u00b9"+
		"\u00ba\7I\2\2\u00ba\u00bb\7C\2\2\u00bb\u00bc\7O\2\2\u00bc\u00bd\7G\2\2"+
		"\u00bd\66\3\2\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7"+
		"v\2\2\u00c18\3\2\2\2\u00c2\u00c3\7\60\2\2\u00c3:\3\2\2\2\u00c4\u00c5\7"+
		"G\2\2\u00c5\u00c6\7P\2\2\u00c6\u00c7\7V\2\2\u00c7\u00c8\7G\2\2\u00c8\u00c9"+
		"\7T\2\2\u00c9\u00ca\7/\2\2\u00ca\u00cb\7S\2\2\u00cb\u00cc\7W\2\2\u00cc"+
		"\u00cd\7G\2\2\u00cd\u00ce\7U\2\2\u00ce\u00cf\7V\2\2\u00cf<\3\2\2\2\u00d0"+
		"\u00d2\5E#\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2"+
		"\2\u00d3\u00d4\3\2\2\2\u00d4>\3\2\2\2\u00d5\u00d9\5A!\2\u00d6\u00d8\5"+
		"C\"\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da@\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e3\t\2\2\2"+
		"\u00dd\u00de\n\3\2\2\u00de\u00e3\6!\2\2\u00df\u00e0\t\4\2\2\u00e0\u00e1"+
		"\t\5\2\2\u00e1\u00e3\6!\3\2\u00e2\u00dc\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2"+
		"\u00df\3\2\2\2\u00e3B\3\2\2\2\u00e4\u00eb\t\6\2\2\u00e5\u00e6\n\3\2\2"+
		"\u00e6\u00eb\6\"\4\2\u00e7\u00e8\t\4\2\2\u00e8\u00e9\t\5\2\2\u00e9\u00eb"+
		"\6\"\5\2\u00ea\u00e4\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb"+
		"D\3\2\2\2\u00ec\u00ed\4\62;\2\u00edF\3\2\2\2\u00ee\u00ef\7B\2\2\u00ef"+
		"H\3\2\2\2\u00f0\u00f1\7\60\2\2\u00f1\u00f2\7\60\2\2\u00f2\u00f3\7\60\2"+
		"\2\u00f3J\3\2\2\2\u00f4\u00f6\t\7\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\b&\2\2\u00faL\3\2\2\2\u00fb\u00fc\7\61\2\2\u00fc\u00fd\7,\2\2\u00fd"+
		"\u0101\3\2\2\2\u00fe\u0100\13\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3"+
		"\2\2\2\u0101\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0105\7,\2\2\u0105\u0106\7\61\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0108\b\'\2\2\u0108N\3\2\2\2\u0109\u010a\7\61\2\2\u010a\u010b"+
		"\7\61\2\2\u010b\u010f\3\2\2\2\u010c\u010e\n\b\2\2\u010d\u010c\3\2\2\2"+
		"\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\b(\2\2\u0113P\3\2\2\2\u0114\u011a"+
		"\7$\2\2\u0115\u0119\n\t\2\2\u0116\u0117\7^\2\2\u0117\u0119\13\2\2\2\u0118"+
		"\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011e\7$\2\2\u011eR\3\2\2\2\f\2\u00d3\u00d9\u00e2\u00ea\u00f7\u0101\u010f"+
		"\u0118\u011a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}