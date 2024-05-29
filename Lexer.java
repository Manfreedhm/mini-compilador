/* The following code was generated by JFlex 1.4.3 on 22/05/24 09:51 PM */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 22/05/24 09:51 PM from the specification file
 * <tt>src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\57\2\0\1\3\22\0\1\3\2\0\1\67\4\0"+
    "\1\73\1\74\1\72\1\70\1\3\1\71\1\75\1\52\1\53\1\51"+
    "\1\55\1\2\1\56\1\54\4\2\1\66\1\60\1\64\1\61\1\65"+
    "\2\0\1\21\1\4\1\24\1\22\1\7\1\20\1\17\1\11\1\14"+
    "\2\1\1\16\1\1\1\15\1\12\2\1\1\13\1\10\1\6\1\23"+
    "\1\25\2\1\1\5\1\1\4\0\1\1\1\0\1\37\1\42\1\30"+
    "\1\33\1\34\1\50\1\36\1\44\1\26\2\1\1\31\1\40\1\27"+
    "\1\43\1\41\1\1\1\45\1\35\1\47\1\32\1\1\1\46\3\1"+
    "\1\62\1\76\1\63\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\26\2\1\3\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\15\2\1\26\22\2\1\3\1\4\1\0\5\2\1\27"+
    "\31\2\2\0\1\30\4\2\1\31\3\2\1\32\4\2"+
    "\1\33\1\2\1\34\3\2\1\35\1\36\3\2\1\37"+
    "\2\2\1\40\1\2\1\0\1\3\2\2\1\41\1\2"+
    "\1\42\1\43\4\2\1\44\1\2\1\45\6\2\1\46"+
    "\1\47\1\0\1\2\1\50\1\51\1\52\5\2\1\53"+
    "\1\54\1\55\1\56\1\57\1\0\1\60\1\2\1\61"+
    "\2\2\1\62\1\0\2\2\1\63\1\0\1\64\1\65"+
    "\1\0\1\66";

  private static int [] zzUnpackAction() {
    int [] result = new int[197];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\77\0\176\0\275\0\374\0\u013b\0\u017a\0\u01b9"+
    "\0\u01f8\0\u0237\0\u0276\0\u02b5\0\u02f4\0\u0333\0\u0372\0\u03b1"+
    "\0\u03f0\0\u042f\0\u046e\0\u04ad\0\u04ec\0\u052b\0\u056a\0\u05a9"+
    "\0\u05e8\0\u0627\0\u0666\0\u06a5\0\u06e4\0\77\0\77\0\77"+
    "\0\77\0\77\0\77\0\77\0\77\0\77\0\77\0\77"+
    "\0\77\0\u0723\0\77\0\77\0\77\0\u0762\0\u07a1\0\u07e0"+
    "\0\u081f\0\u085e\0\u089d\0\u08dc\0\u091b\0\u095a\0\u0999\0\u09d8"+
    "\0\u0a17\0\u0a56\0\176\0\u0a95\0\u0ad4\0\u0b13\0\u0b52\0\u0b91"+
    "\0\u0bd0\0\u0c0f\0\u0c4e\0\u0c8d\0\u0ccc\0\u0d0b\0\u0d4a\0\u0d89"+
    "\0\u0dc8\0\u0e07\0\u0e46\0\u0e85\0\u0ec4\0\u0f03\0\u0f42\0\u0f81"+
    "\0\u0fc0\0\u0fff\0\u103e\0\u107d\0\u10bc\0\176\0\u10fb\0\u113a"+
    "\0\u1179\0\u11b8\0\u11f7\0\u1236\0\u1275\0\u12b4\0\u12f3\0\u1332"+
    "\0\u1371\0\u13b0\0\u13ef\0\u142e\0\u146d\0\u14ac\0\u14eb\0\u152a"+
    "\0\u1569\0\u15a8\0\u15e7\0\u1626\0\u1665\0\u16a4\0\u16e3\0\u1722"+
    "\0\u1761\0\176\0\u17a0\0\u17df\0\u181e\0\u185d\0\176\0\u189c"+
    "\0\u18db\0\u191a\0\176\0\u1959\0\u1998\0\u19d7\0\u1a16\0\176"+
    "\0\u1a55\0\176\0\u1a94\0\u1ad3\0\u1b12\0\176\0\176\0\u1b51"+
    "\0\u1b90\0\u1bcf\0\176\0\u1c0e\0\u1c4d\0\176\0\u1c8c\0\u1ccb"+
    "\0\77\0\u1d0a\0\u1d49\0\176\0\u1d88\0\176\0\176\0\u1dc7"+
    "\0\u1e06\0\u1e45\0\u1e84\0\176\0\u1ec3\0\176\0\u1f02\0\u1f41"+
    "\0\u1f80\0\u1fbf\0\u1ffe\0\u203d\0\176\0\176\0\u207c\0\u20bb"+
    "\0\176\0\176\0\176\0\u20fa\0\u2139\0\u2178\0\u21b7\0\u21f6"+
    "\0\176\0\176\0\176\0\176\0\176\0\u2235\0\176\0\u2274"+
    "\0\176\0\u22b3\0\u22f2\0\176\0\u2331\0\u2370\0\u23af\0\176"+
    "\0\u23ee\0\176\0\176\0\u242d\0\77";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[197];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\3\3\1\7\2\3"+
    "\1\10\1\11\1\3\1\12\1\3\1\13\1\3\1\14"+
    "\1\3\1\15\1\16\1\17\1\20\1\21\1\3\1\22"+
    "\1\23\1\24\1\25\3\3\1\26\1\3\1\27\1\3"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\4\4\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\100\0"+
    "\2\3\1\0\46\3\1\0\4\3\22\0\1\4\46\0"+
    "\1\4\1\0\4\4\23\0\1\5\74\0\2\3\1\0"+
    "\1\3\1\56\4\3\1\57\37\3\1\0\4\3\21\0"+
    "\2\3\1\0\2\3\1\60\2\3\1\61\40\3\1\0"+
    "\4\3\21\0\2\3\1\0\3\3\1\62\42\3\1\0"+
    "\4\3\21\0\2\3\1\0\11\3\1\63\34\3\1\0"+
    "\4\3\21\0\2\3\1\0\6\3\1\64\37\3\1\0"+
    "\4\3\21\0\2\3\1\0\12\3\1\65\2\3\1\66"+
    "\30\3\1\0\4\3\21\0\2\3\1\0\6\3\1\67"+
    "\37\3\1\0\4\3\21\0\2\3\1\0\5\3\1\70"+
    "\40\3\1\0\4\3\21\0\2\3\1\0\3\3\1\71"+
    "\42\3\1\0\4\3\21\0\2\3\1\0\23\3\1\72"+
    "\20\3\1\73\1\3\1\0\4\3\21\0\2\3\1\0"+
    "\33\3\1\74\12\3\1\0\4\3\21\0\2\3\1\0"+
    "\25\3\1\75\5\3\1\76\3\3\1\77\1\100\5\3"+
    "\1\0\4\3\21\0\2\3\1\0\31\3\1\101\14\3"+
    "\1\0\4\3\21\0\2\3\1\0\30\3\1\102\6\3"+
    "\1\103\6\3\1\0\4\3\21\0\2\3\1\0\23\3"+
    "\1\104\1\3\1\105\20\3\1\0\4\3\21\0\2\3"+
    "\1\0\42\3\1\106\3\3\1\0\4\3\21\0\2\3"+
    "\1\0\26\3\1\107\12\3\1\110\4\3\1\0\4\3"+
    "\21\0\2\3\1\0\23\3\1\111\22\3\1\0\4\3"+
    "\21\0\2\3\1\0\30\3\1\112\15\3\1\0\4\3"+
    "\21\0\2\3\1\0\40\3\1\113\5\3\1\0\4\3"+
    "\21\0\2\3\1\0\41\3\1\114\4\3\1\0\4\3"+
    "\21\0\2\3\1\0\33\3\1\115\12\3\1\0\4\3"+
    "\22\0\1\4\46\0\1\116\1\0\4\4\72\0\1\117"+
    "\115\0\1\120\6\0\2\3\1\0\2\3\1\121\43\3"+
    "\1\0\4\3\21\0\2\3\1\0\6\3\1\122\37\3"+
    "\1\0\4\3\21\0\2\3\1\0\7\3\1\123\36\3"+
    "\1\0\4\3\21\0\2\3\1\0\6\3\1\124\37\3"+
    "\1\0\4\3\21\0\2\3\1\0\2\3\1\125\43\3"+
    "\1\0\4\3\21\0\2\3\1\0\2\3\1\126\43\3"+
    "\1\0\4\3\21\0\2\3\1\0\11\3\1\127\34\3"+
    "\1\0\4\3\21\0\2\3\1\0\6\3\1\130\37\3"+
    "\1\0\4\3\21\0\2\3\1\0\12\3\1\131\33\3"+
    "\1\0\4\3\21\0\2\3\1\0\17\3\1\132\26\3"+
    "\1\0\4\3\21\0\2\3\1\0\15\3\1\133\30\3"+
    "\1\0\4\3\21\0\2\3\1\0\7\3\1\134\36\3"+
    "\1\0\4\3\21\0\2\3\1\0\24\3\1\135\21\3"+
    "\1\0\4\3\21\0\2\3\1\0\34\3\1\136\11\3"+
    "\1\0\4\3\21\0\2\3\1\0\33\3\1\137\12\3"+
    "\1\0\4\3\21\0\2\3\1\0\31\3\1\140\14\3"+
    "\1\0\4\3\21\0\2\3\1\0\23\3\1\141\22\3"+
    "\1\0\4\3\21\0\2\3\1\0\33\3\1\142\12\3"+
    "\1\0\4\3\21\0\2\3\1\0\22\3\1\143\23\3"+
    "\1\0\4\3\21\0\2\3\1\0\44\3\1\144\1\3"+
    "\1\0\4\3\21\0\2\3\1\0\26\3\1\145\17\3"+
    "\1\0\4\3\21\0\2\3\1\0\27\3\1\146\16\3"+
    "\1\0\4\3\21\0\2\3\1\0\31\3\1\147\14\3"+
    "\1\0\4\3\21\0\2\3\1\0\22\3\1\150\23\3"+
    "\1\0\4\3\21\0\2\3\1\0\36\3\1\151\7\3"+
    "\1\0\4\3\21\0\2\3\1\0\33\3\1\152\12\3"+
    "\1\0\4\3\21\0\2\3\1\0\24\3\1\153\21\3"+
    "\1\0\4\3\21\0\2\3\1\0\43\3\1\154\2\3"+
    "\1\0\4\3\21\0\2\3\1\0\22\3\1\155\23\3"+
    "\1\0\4\3\21\0\2\3\1\0\26\3\1\156\17\3"+
    "\1\0\4\3\21\0\2\3\1\0\25\3\1\157\20\3"+
    "\1\0\4\3\22\0\1\4\46\0\1\4\1\160\4\4"+
    "\20\0\57\117\1\0\17\117\2\0\1\161\46\0\1\161"+
    "\1\0\4\161\21\0\2\3\1\0\3\3\1\162\42\3"+
    "\1\0\4\3\21\0\2\3\1\0\12\3\1\163\33\3"+
    "\1\0\4\3\21\0\2\3\1\0\10\3\1\164\35\3"+
    "\1\0\4\3\21\0\2\3\1\0\7\3\1\165\36\3"+
    "\1\0\4\3\21\0\2\3\1\0\17\3\1\166\26\3"+
    "\1\0\4\3\21\0\2\3\1\0\13\3\1\167\32\3"+
    "\1\0\4\3\21\0\2\3\1\0\15\3\1\170\30\3"+
    "\1\0\4\3\21\0\2\3\1\0\4\3\1\171\41\3"+
    "\1\0\4\3\21\0\2\3\1\0\1\172\45\3\1\0"+
    "\4\3\21\0\2\3\1\0\7\3\1\173\36\3\1\0"+
    "\4\3\21\0\2\3\1\0\16\3\1\174\27\3\1\0"+
    "\4\3\21\0\2\3\1\0\25\3\1\175\20\3\1\0"+
    "\4\3\21\0\2\3\1\0\30\3\1\176\15\3\1\0"+
    "\4\3\21\0\2\3\1\0\31\3\1\177\14\3\1\0"+
    "\4\3\21\0\2\3\1\0\30\3\1\200\15\3\1\0"+
    "\4\3\21\0\2\3\1\0\43\3\1\201\2\3\1\0"+
    "\4\3\21\0\2\3\1\0\41\3\1\202\4\3\1\0"+
    "\4\3\21\0\2\3\1\0\23\3\1\203\22\3\1\0"+
    "\4\3\21\0\2\3\1\0\33\3\1\204\12\3\1\0"+
    "\4\3\21\0\2\3\1\0\36\3\1\205\7\3\1\0"+
    "\4\3\21\0\2\3\1\0\25\3\1\206\20\3\1\0"+
    "\4\3\21\0\2\3\1\0\30\3\1\207\15\3\1\0"+
    "\4\3\21\0\2\3\1\0\43\3\1\210\2\3\1\0"+
    "\4\3\21\0\2\3\1\0\25\3\1\211\20\3\1\0"+
    "\4\3\21\0\2\3\1\0\32\3\1\212\13\3\1\0"+
    "\4\3\21\0\2\3\1\0\30\3\1\213\15\3\1\0"+
    "\4\3\21\0\2\3\1\0\26\3\1\214\17\3\1\0"+
    "\4\3\21\0\2\3\1\0\25\3\1\215\20\3\1\0"+
    "\4\3\21\0\2\3\1\0\30\3\1\216\15\3\1\0"+
    "\4\3\21\0\2\3\1\0\31\3\1\217\14\3\1\0"+
    "\4\3\73\0\1\220\25\0\1\161\46\0\1\161\1\0"+
    "\4\161\15\0\1\221\3\0\2\3\1\0\3\3\1\222"+
    "\42\3\1\0\4\3\21\0\2\3\1\0\11\3\1\223"+
    "\34\3\1\0\4\3\21\0\2\3\1\0\2\3\1\224"+
    "\43\3\1\0\4\3\21\0\2\3\1\0\7\3\1\225"+
    "\36\3\1\0\4\3\21\0\2\3\1\0\2\3\1\226"+
    "\43\3\1\0\4\3\21\0\2\3\1\0\6\3\1\227"+
    "\37\3\1\0\4\3\21\0\2\3\1\0\12\3\1\230"+
    "\33\3\1\0\4\3\21\0\2\3\1\0\15\3\1\231"+
    "\30\3\1\0\4\3\21\0\2\3\1\0\26\3\1\232"+
    "\17\3\1\0\4\3\21\0\2\3\1\0\31\3\1\233"+
    "\14\3\1\0\4\3\21\0\2\3\1\0\31\3\1\234"+
    "\14\3\1\0\4\3\21\0\2\3\1\0\22\3\1\235"+
    "\23\3\1\0\4\3\21\0\2\3\1\0\32\3\1\236"+
    "\13\3\1\0\4\3\21\0\2\3\1\0\26\3\1\237"+
    "\17\3\1\0\4\3\21\0\2\3\1\0\25\3\1\240"+
    "\20\3\1\0\4\3\21\0\2\3\1\0\24\3\1\241"+
    "\21\3\1\0\4\3\21\0\2\3\1\0\22\3\1\242"+
    "\23\3\1\0\4\3\21\0\2\3\1\0\34\3\1\243"+
    "\11\3\1\0\4\3\21\0\2\3\1\0\41\3\1\244"+
    "\4\3\1\0\4\3\21\0\2\3\1\0\30\3\1\245"+
    "\15\3\1\0\4\3\21\0\2\3\1\0\30\3\1\246"+
    "\15\3\1\0\4\3\74\0\1\247\23\0\2\3\1\0"+
    "\15\3\1\250\30\3\1\0\4\3\21\0\2\3\1\0"+
    "\13\3\1\251\32\3\1\0\4\3\21\0\2\3\1\0"+
    "\11\3\1\252\34\3\1\0\4\3\21\0\2\3\1\0"+
    "\3\3\1\253\42\3\1\0\4\3\21\0\2\3\1\0"+
    "\16\3\1\254\27\3\1\0\4\3\21\0\2\3\1\0"+
    "\27\3\1\255\16\3\1\0\4\3\21\0\2\3\1\0"+
    "\35\3\1\256\10\3\1\0\4\3\21\0\2\3\1\0"+
    "\23\3\1\257\22\3\1\0\4\3\21\0\2\3\1\0"+
    "\25\3\1\260\20\3\1\0\4\3\21\0\2\3\1\0"+
    "\30\3\1\261\15\3\1\0\4\3\21\0\2\3\1\0"+
    "\40\3\1\262\5\3\1\0\4\3\21\0\2\3\1\0"+
    "\24\3\1\263\21\3\1\0\4\3\21\0\2\3\1\0"+
    "\33\3\1\264\12\3\1\0\4\3\21\0\2\3\1\0"+
    "\23\3\1\265\22\3\1\0\4\3\72\0\1\266\25\0"+
    "\2\3\1\0\11\3\1\267\34\3\1\0\4\3\21\0"+
    "\2\3\1\0\3\3\1\270\42\3\1\0\4\3\21\0"+
    "\2\3\1\0\30\3\1\271\15\3\1\0\4\3\21\0"+
    "\2\3\1\0\33\3\1\272\12\3\1\0\4\3\21\0"+
    "\2\3\1\0\26\3\1\273\17\3\1\0\4\3\21\0"+
    "\2\3\1\0\43\3\1\274\2\3\1\0\4\3\75\0"+
    "\1\275\22\0\2\3\1\0\7\3\1\276\36\3\1\0"+
    "\4\3\21\0\2\3\1\0\24\3\1\277\21\3\1\0"+
    "\4\3\21\0\2\3\1\0\30\3\1\300\15\3\1\0"+
    "\4\3\73\0\1\301\24\0\2\3\1\0\6\3\1\302"+
    "\37\3\1\0\4\3\21\0\2\3\1\0\30\3\1\303"+
    "\15\3\1\0\4\3\75\0\1\304\77\0\1\305\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9324];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\33\1\14\11\1\1\3\11\42\1\1\0"+
    "\37\1\2\0\36\1\1\0\1\11\25\1\1\0\16\1"+
    "\1\0\6\1\1\0\3\1\1\0\2\1\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[197];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 168) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 55: break;
        case 19: 
          { lexeme=yytext(); return parentesisCierre;
          }
        case 56: break;
        case 39: 
          { lexeme=yytext(); return falseT ;
          }
        case 57: break;
        case 17: 
          { lexeme=yytext(); return signoMultiplicacion;
          }
        case 58: break;
        case 53: 
          { lexeme=yytext(); return namespace;
          }
        case 59: break;
        case 50: 
          { lexeme=yytext(); return defaultT;
          }
        case 60: break;
        case 42: 
          { lexeme=yytext(); return DOUBLE;
          }
        case 61: break;
        case 38: 
          { lexeme=yytext(); return whileT;
          }
        case 62: break;
        case 23: 
          { lexeme=yytext(); return INT;
          }
        case 63: break;
        case 18: 
          { lexeme=yytext(); return parentesisApertura;
          }
        case 64: break;
        case 43: 
          { lexeme=yytext(); return doubleT;
          }
        case 65: break;
        case 24: 
          { lexeme=yytext(); return BYTE;
          }
        case 66: break;
        case 44: 
          { lexeme=yytext(); return switchT;
          }
        case 67: break;
        case 12: 
          { lexeme=yytext(); return signoMayorQue;
          }
        case 68: break;
        case 13: 
          { lexeme=yytext(); return signoDosPuntos;
          }
        case 69: break;
        case 54: 
          { lexeme=yytext(); return DAY ;
          }
        case 70: break;
        case 7: 
          { lexeme=yytext(); return puntoComa;
          }
        case 71: break;
        case 20: 
          { lexeme=yytext(); return signoPunto;
          }
        case 72: break;
        case 41: 
          { lexeme=yytext(); return RETURN;
          }
        case 73: break;
        case 5: 
          { lexeme=yytext(); return signoSlash;
          }
        case 74: break;
        case 25: 
          { lexeme=yytext(); return LONG;
          }
        case 75: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 76: break;
        case 8: 
          { lexeme=yytext(); return igual;
          }
        case 77: break;
        case 16: 
          { lexeme=yytext(); return signoMenos;
          }
        case 78: break;
        case 22: 
          { lexeme=yytext(); return ifT;
          }
        case 79: break;
        case 15: 
          { lexeme=yytext(); return signoMas;
          }
        case 80: break;
        case 40: 
          { lexeme=yytext(); return STRING;
          }
        case 81: break;
        case 27: 
          { lexeme=yytext(); return caseT;
          }
        case 82: break;
        case 37: 
          { lexeme=yytext(); return using;
          }
        case 83: break;
        case 11: 
          { lexeme=yytext(); return signoMenorQue;
          }
        case 84: break;
        case 33: 
          { lexeme=yytext(); return SHORT;
          }
        case 85: break;
        case 30: 
          { lexeme=yytext(); return elseT;
          }
        case 86: break;
        case 36: 
          { lexeme=yytext(); return classT;
          }
        case 87: break;
        case 10: 
          { lexeme=yytext(); return llaveCierre;
          }
        case 88: break;
        case 45: 
          { lexeme=yytext(); return publicT;
          }
        case 89: break;
        case 46: 
          { lexeme=yytext(); return pragmaT ;
          }
        case 90: break;
        case 34: 
          { lexeme=yytext(); return FLOAT;
          }
        case 91: break;
        case 28: 
          { lexeme=yytext(); return charT;
          }
        case 92: break;
        case 6: 
          { return linea;
          }
        case 93: break;
        case 51: 
          { lexeme=yytext(); return continueT;
          }
        case 94: break;
        case 49: 
          { lexeme=yytext(); return include;
          }
        case 95: break;
        case 21: 
          { lexeme=yytext(); return signoOr;
          }
        case 96: break;
        case 52: 
          { lexeme=yytext(); return VERDADERO;
          }
        case 97: break;
        case 9: 
          { lexeme=yytext(); return llaveApertura;
          }
        case 98: break;
        case 1: 
          { return ERROR;
          }
        case 99: break;
        case 31: 
          { lexeme=yytext(); return onceT ;
          }
        case 100: break;
        case 26: 
          { lexeme=yytext(); return CHAR;
          }
        case 101: break;
        case 4: 
          { /*Ignore*/
          }
        case 102: break;
        case 47: 
          { lexeme=yytext(); return returnT;
          }
        case 103: break;
        case 48: 
          { lexeme=yytext(); return BOOLEAN;
          }
        case 104: break;
        case 29: 
          { lexeme=yytext(); return endlT;
          }
        case 105: break;
        case 35: 
          { lexeme=yytext(); return FALSO;
          }
        case 106: break;
        case 32: 
          { lexeme=yytext(); return trueT ;
          }
        case 107: break;
        case 14: 
          { lexeme=yytext(); return signoAlmohoadilla;
          }
        case 108: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
