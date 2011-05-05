/* The following code was generated by JFlex 1.4.3 on 05/05/11 01:48 */

package compil.inv.parser;

import java_cup.runtime.*;

import compil.inv.parser.OCL_Sym;
import static compil.inv.parser.OCL_Sym.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 05/05/11 01:48 from the specification file
 * <tt>ocl.lex</tt>
 */
public class OCL_Lexer implements java_cup.runtime.Scanner {

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
    "\11\0\1\37\1\2\1\0\1\37\1\1\22\0\1\37\1\0\1\36"+
    "\5\0\1\3\1\4\1\21\1\20\1\11\1\15\1\16\1\22\12\24"+
    "\1\10\1\7\1\13\1\12\1\14\2\0\1\62\3\23\1\26\3\23"+
    "\1\34\2\23\1\30\1\33\1\35\1\23\1\27\2\23\1\32\1\23"+
    "\1\31\5\23\1\6\1\0\1\5\1\0\1\23\1\0\1\50\1\23"+
    "\1\40\1\51\1\25\1\52\1\23\1\53\1\45\2\23\1\54\1\56"+
    "\1\42\1\41\1\57\1\23\1\47\1\55\1\43\1\61\1\46\1\23"+
    "\1\44\1\23\1\60\1\0\1\17\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\23\1\1\11\23"+
    "\1\25\1\26\1\27\1\30\1\31\1\0\1\23\2\0"+
    "\3\23\1\0\1\32\1\23\1\33\4\23\1\34\5\23"+
    "\1\2\1\0\2\24\2\0\5\23\1\35\1\23\1\36"+
    "\1\23\1\37\1\23\1\40\3\23\2\0\3\23\1\41"+
    "\1\23\1\42\4\23\1\43\1\0\1\44\7\23\1\0"+
    "\1\23\1\45\3\23\1\46\1\47\1\23\1\50\1\23"+
    "\1\51\1\52\1\53\2\23\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[119];
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
    "\0\0\0\63\0\146\0\63\0\63\0\63\0\63\0\63"+
    "\0\63\0\231\0\63\0\63\0\314\0\377\0\u0132\0\63"+
    "\0\63\0\63\0\63\0\63\0\u0165\0\u0198\0\u01cb\0\u01fe"+
    "\0\u0231\0\u0264\0\u0297\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396"+
    "\0\u03c9\0\63\0\63\0\63\0\63\0\63\0\u03fc\0\u042f"+
    "\0\u0462\0\u0495\0\u04c8\0\u04fb\0\u052e\0\u01fe\0\u01fe\0\u0561"+
    "\0\u0165\0\u0594\0\u05c7\0\u05fa\0\u062d\0\u0165\0\u0660\0\u0693"+
    "\0\u06c6\0\u06f9\0\u072c\0\u03fc\0\u075f\0\u0792\0\u07c5\0\u07f8"+
    "\0\u082b\0\u085e\0\u0891\0\u08c4\0\u08f7\0\u092a\0\u0165\0\u095d"+
    "\0\u0165\0\u0990\0\u0165\0\u09c3\0\u0165\0\u09f6\0\u0a29\0\u0a5c"+
    "\0\u0a8f\0\u0ac2\0\u0af5\0\u0b28\0\u0b5b\0\u0165\0\u0b8e\0\u0165"+
    "\0\u0bc1\0\u0bf4\0\u0c27\0\u0c5a\0\u0165\0\u0c8d\0\u0165\0\u0cc0"+
    "\0\u0cf3\0\u0d26\0\u0d59\0\u0d8c\0\u0dbf\0\u0df2\0\u07c5\0\u0e25"+
    "\0\u0165\0\u0e58\0\u0e8b\0\u0ebe\0\u0165\0\u0165\0\u0ef1\0\u0165"+
    "\0\u0f24\0\u0165\0\u0165\0\u0f57\0\u0f8a\0\u0fbd\0\u0165";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[119];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\10\25\1\30"+
    "\1\4\1\31\1\32\1\33\1\34\1\35\1\36\2\25"+
    "\1\37\1\25\1\40\2\25\1\41\5\25\65\0\1\4"+
    "\70\0\1\42\64\0\1\43\1\0\1\44\60\0\1\45"+
    "\64\0\1\46\1\47\70\0\1\25\1\50\11\25\2\0"+
    "\23\25\16\0\1\51\5\0\1\26\2\52\57\0\1\25"+
    "\1\50\11\25\2\0\2\25\1\53\1\25\1\54\7\25"+
    "\1\55\6\25\2\56\1\0\33\56\1\57\24\56\23\0"+
    "\1\25\1\50\11\25\2\0\1\25\1\60\21\25\23\0"+
    "\1\25\1\50\11\25\2\0\7\25\1\61\13\25\23\0"+
    "\1\25\1\50\11\25\2\0\1\25\1\62\21\25\23\0"+
    "\1\25\1\50\11\25\2\0\13\25\1\63\7\25\23\0"+
    "\1\25\1\50\11\25\2\0\1\25\1\64\21\25\23\0"+
    "\1\25\1\50\11\25\2\0\2\25\1\65\7\25\1\66"+
    "\3\25\1\67\4\25\23\0\1\25\1\50\11\25\2\0"+
    "\2\25\1\70\20\25\23\0\1\25\1\50\11\25\2\0"+
    "\1\25\1\71\21\25\23\0\1\25\1\50\1\72\10\25"+
    "\2\0\5\25\1\73\15\25\1\47\1\74\1\4\60\47"+
    "\16\0\1\75\4\0\1\25\1\50\11\25\2\0\23\25"+
    "\24\0\1\76\62\0\1\77\2\0\1\100\3\0\1\101"+
    "\52\0\1\25\1\50\11\25\2\0\11\25\1\102\11\25"+
    "\23\0\1\25\1\50\11\25\2\0\1\103\4\25\1\104"+
    "\15\25\23\0\1\25\1\50\11\25\2\0\15\25\1\105"+
    "\5\25\23\0\1\25\1\50\11\25\2\0\2\25\1\106"+
    "\20\25\23\0\1\25\1\50\11\25\2\0\3\25\1\107"+
    "\17\25\23\0\1\25\1\50\1\110\10\25\2\0\23\25"+
    "\23\0\1\25\1\50\11\25\2\0\7\25\1\111\13\25"+
    "\23\0\1\25\1\50\11\25\2\0\1\112\5\25\1\113"+
    "\14\25\23\0\1\25\1\50\11\25\2\0\17\25\1\114"+
    "\3\25\23\0\1\25\1\50\11\25\2\0\11\25\1\115"+
    "\11\25\23\0\1\25\1\50\11\25\2\0\7\25\1\116"+
    "\13\25\23\0\1\25\1\50\11\25\2\0\14\25\1\117"+
    "\6\25\23\0\1\25\1\50\11\25\2\0\20\25\1\120"+
    "\2\25\24\0\1\25\62\0\1\76\2\52\60\0\1\77"+
    "\66\0\1\121\66\0\1\122\51\0\1\25\1\50\11\25"+
    "\2\0\5\25\1\123\15\25\23\0\1\25\1\50\11\25"+
    "\2\0\14\25\1\124\6\25\23\0\1\25\1\50\11\25"+
    "\2\0\15\25\1\125\5\25\23\0\1\25\1\50\1\126"+
    "\10\25\2\0\23\25\23\0\1\25\1\50\11\25\2\0"+
    "\3\25\1\127\17\25\23\0\1\25\1\50\11\25\2\0"+
    "\2\25\1\130\20\25\23\0\1\25\1\50\11\25\2\0"+
    "\14\25\1\131\6\25\23\0\1\25\1\50\11\25\2\0"+
    "\14\25\1\132\6\25\23\0\1\25\1\50\11\25\2\0"+
    "\22\25\1\133\23\0\1\25\1\50\1\134\10\25\2\0"+
    "\23\25\23\0\1\25\1\50\1\135\10\25\2\0\23\25"+
    "\31\0\1\136\66\0\1\121\50\0\1\25\1\50\11\25"+
    "\2\0\12\25\1\137\10\25\23\0\1\25\1\50\11\25"+
    "\2\0\21\25\1\140\1\25\23\0\1\25\1\50\11\25"+
    "\2\0\3\25\1\141\17\25\23\0\1\25\1\50\1\142"+
    "\10\25\2\0\23\25\23\0\1\25\1\50\11\25\2\0"+
    "\21\25\1\143\1\25\23\0\1\25\1\50\11\25\2\0"+
    "\5\25\1\144\15\25\23\0\1\25\1\50\11\25\2\0"+
    "\14\25\1\145\6\25\23\0\1\25\1\50\11\25\2\0"+
    "\1\146\22\25\32\0\1\147\53\0\1\25\1\50\11\25"+
    "\2\0\11\25\1\150\11\25\23\0\1\25\1\50\11\25"+
    "\2\0\15\25\1\151\5\25\23\0\1\25\1\50\11\25"+
    "\2\0\4\25\1\152\16\25\23\0\1\25\1\50\11\25"+
    "\2\0\11\25\1\153\11\25\23\0\1\25\1\50\1\154"+
    "\10\25\2\0\23\25\23\0\1\25\1\50\11\25\2\0"+
    "\14\25\1\155\6\25\23\0\1\25\1\50\11\25\2\0"+
    "\3\25\1\156\17\25\23\0\1\25\1\50\1\157\10\25"+
    "\2\0\23\25\23\0\1\25\1\50\11\25\2\0\3\25"+
    "\1\160\17\25\23\0\1\25\1\50\1\161\10\25\2\0"+
    "\23\25\23\0\1\25\1\50\11\25\2\0\15\25\1\162"+
    "\5\25\23\0\1\25\1\50\11\25\2\0\15\25\1\163"+
    "\5\25\23\0\1\25\1\50\11\25\2\0\15\25\1\164"+
    "\5\25\23\0\1\25\1\50\11\25\2\0\22\25\1\165"+
    "\23\0\1\25\1\50\11\25\2\0\14\25\1\166\6\25"+
    "\23\0\1\25\1\50\11\25\2\0\14\25\1\167\6\25";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4080];
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
    "\1\0\1\11\1\1\6\11\1\1\2\11\3\1\5\11"+
    "\15\1\5\11\1\0\1\1\2\0\3\1\1\0\16\1"+
    "\1\0\2\1\2\0\17\1\2\0\13\1\1\0\10\1"+
    "\1\0\20\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[119];
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
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public OCL_Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public OCL_Lexer(java.io.InputStream in) {
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
    while (i < 152) {
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
        case 11: 
          { return symbol(OCL_Sym.LT);
          }
        case 45: break;
        case 13: 
          { return symbol(OCL_Sym.MINUS);
          }
        case 46: break;
        case 37: 
          { return symbol(OCL_Sym.EXISTS);
          }
        case 47: break;
        case 40: 
          { return symbol(OCL_Sym.CONTEXT);
          }
        case 48: break;
        case 3: 
          { return symbol(OCL_Sym.LPAREN);
          }
        case 49: break;
        case 38: 
          { System.out.println("FORALL");return symbol(OCL_Sym.FORALL);
          }
        case 50: break;
        case 9: 
          { return symbol(OCL_Sym.COMMA);
          }
        case 51: break;
        case 7: 
          { return symbol(OCL_Sym.SEMICOL);
          }
        case 52: break;
        case 23: 
          { return symbol(OCL_Sym.NEQUAL);
          }
        case 53: break;
        case 28: 
          { return symbol(OCL_Sym.IF);
          }
        case 54: break;
        case 39: 
          { return symbol(OCL_Sym.SELECT);
          }
        case 55: break;
        case 30: 
          { return symbol(OCL_Sym.XOR);
          }
        case 56: break;
        case 25: 
          { return symbol(OCL_Sym.RARROW);
          }
        case 57: break;
        case 18: 
          { return symbol(OCL_Sym.DIVIDE);
          }
        case 58: break;
        case 27: 
          { return symbol(OCL_Sym.OR);
          }
        case 59: break;
        case 21: 
          { return symbol(OCL_Sym.DCOLON);
          }
        case 60: break;
        case 1: 
          { throw new RuntimeException("Illegal char at line: " + yyline + " column: " + yycolumn);
          }
        case 61: break;
        case 43: 
          { return symbol(OCL_Sym.INCLUDES);
          }
        case 62: break;
        case 6: 
          { return symbol(OCL_Sym.LCOL);
          }
        case 63: break;
        case 5: 
          { return symbol(OCL_Sym.RCOL);
          }
        case 64: break;
        case 41: 
          { return symbol(OCL_Sym.IMPLIES);
          }
        case 65: break;
        case 4: 
          { return symbol(OCL_Sym.RPAREN);
          }
        case 66: break;
        case 31: 
          { return symbol(OCL_Sym.INV);
          }
        case 67: break;
        case 14: 
          { return symbol(OCL_Sym.DOT);
          }
        case 68: break;
        case 24: 
          { return symbol(OCL_Sym.GE);
          }
        case 69: break;
        case 15: 
          { return symbol(OCL_Sym.BAR);
          }
        case 70: break;
        case 19: 
          { return symbol(OCL_Sym.ID, yytext());
          }
        case 71: break;
        case 22: 
          { return symbol(OCL_Sym.LE);
          }
        case 72: break;
        case 16: 
          { return symbol(OCL_Sym.PLUS);
          }
        case 73: break;
        case 35: 
          { return symbol(OCL_Sym.SIZE);
          }
        case 74: break;
        case 8: 
          { return symbol(OCL_Sym.COLON);
          }
        case 75: break;
        case 20: 
          { return symbol(OCL_Sym.NUMERO, yytext());
          }
        case 76: break;
        case 44: 
          { return symbol(OCL_Sym.INCLUDESALL);
          }
        case 77: break;
        case 10: 
          { return symbol(OCL_Sym.EQUAL);
          }
        case 78: break;
        case 33: 
          { return symbol(OCL_Sym.ELSE);
          }
        case 79: break;
        case 42: 
          { return symbol(OCL_Sym.EXCLUDES);
          }
        case 80: break;
        case 34: 
          { return symbol(OCL_Sym.THEN);
          }
        case 81: break;
        case 29: 
          { return symbol(OCL_Sym.NOT);
          }
        case 82: break;
        case 32: 
          { return symbol(OCL_Sym.AND);
          }
        case 83: break;
        case 17: 
          { return symbol(OCL_Sym.MULT);
          }
        case 84: break;
        case 12: 
          { return symbol(OCL_Sym.GT);
          }
        case 85: break;
        case 36: 
          { return symbol(OCL_Sym.ENDIF);
          }
        case 86: break;
        case 2: 
          { 
          }
        case 87: break;
        case 26: 
          { return symbol(OCL_Sym.STRING, yytext());
          }
        case 88: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {   return new java_cup.runtime.Symbol(OCL_Sym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
