// $ANTLR 3.0b4 /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g 2006-10-07 18:08:04

	package org.codehaus.jfdi.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JFDIParserLexer extends Lexer {
    public static final int T21=21;
    public static final int T14=14;
    public static final int IDENT=4;
    public static final int T22=22;
    public static final int T11=11;
    public static final int T9=9;
    public static final int STRING=6;
    public static final int FLOAT=7;
    public static final int T12=12;
    public static final int T23=23;
    public static final int T13=13;
    public static final int T20=20;
    public static final int T10=10;
    public static final int T25=25;
    public static final int INTEGER=5;
    public static final int T18=18;
    public static final int T26=26;
    public static final int T15=15;
    public static final int EOF=-1;
    public static final int T17=17;
    public static final int Tokens=27;
    public static final int T16=16;
    public static final int T8=8;
    public static final int T24=24;
    public static final int T19=19;
    public JFDIParserLexer() {;} 
    public JFDIParserLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g"; }

    // $ANTLR start T8
    public void mT8() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T8;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:6:6: ( '{' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:6:6: '{'
            {
            match('{'); 

            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T8

    // $ANTLR start T9
    public void mT9() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T9;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:7:6: ( '}' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:7:6: '}'
            {
            match('}'); 

            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T9

    // $ANTLR start T10
    public void mT10() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T10;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:8:7: ( 'for' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:8:7: 'for'
            {
            match("for"); 


            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public void mT11() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T11;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:9:7: ( 'in' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:9:7: 'in'
            {
            match("in"); 


            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public void mT12() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T12;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:10:7: ( '=' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:10:7: '='
            {
            match('='); 

            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public void mT13() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T13;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:11:7: ( '||' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:11:7: '||'
            {
            match("||"); 


            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public void mT14() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T14;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:12:7: ( '&&' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:12:7: '&&'
            {
            match("&&"); 


            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public void mT15() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T15;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:13:7: ( '+' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:13:7: '+'
            {
            match('+'); 

            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public void mT16() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T16;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:14:7: ( '-' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:14:7: '-'
            {
            match('-'); 

            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public void mT17() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T17;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:15:7: ( '*' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:15:7: '*'
            {
            match('*'); 

            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public void mT18() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T18;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:16:7: ( '/' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:16:7: '/'
            {
            match('/'); 

            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public void mT19() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T19;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:17:7: ( 'true' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:17:7: 'true'
            {
            match("true"); 


            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public void mT20() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T20;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:18:7: ( 'false' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:18:7: 'false'
            {
            match("false"); 


            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public void mT21() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T21;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:19:7: ( '(' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:19:7: '('
            {
            match('('); 

            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public void mT22() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T22;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:20:7: ( ')' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:20:7: ')'
            {
            match(')'); 

            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public void mT23() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T23;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:21:7: ( ',' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:21:7: ','
            {
            match(','); 

            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public void mT24() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T24;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:22:7: ( '[' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:22:7: '['
            {
            match('['); 

            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public void mT25() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T25;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:23:7: ( ']' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:23:7: ']'
            {
            match(']'); 

            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public void mT26() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = T26;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:24:7: ( '.' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:24:7: '.'
            {
            match('.'); 

            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end T26

    // $ANTLR start IDENT
    public void mIDENT() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = IDENT;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:169:3: ( ('a'..'z'|'A'..'Z'|'_'|'$') ( ('a'..'z'|'A'..'Z'|'_'|'0'..'9'))* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:169:3: ('a'..'z'|'A'..'Z'|'_'|'$') ( ('a'..'z'|'A'..'Z'|'_'|'0'..'9'))*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:169:30: ( ('a'..'z'|'A'..'Z'|'_'|'0'..'9'))*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);
                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:169:31: ('a'..'z'|'A'..'Z'|'_'|'0'..'9')
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end IDENT

    // $ANTLR start INTEGER
    public void mINTEGER() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = INTEGER;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:174:3: ( ( ( '1' .. '9' ) ( '0' .. '9' )* | '0x' ( ('0'..'9'|'A'..'F'|'a'..'f'))+ | '0' ( '0' .. '7' )+ ) )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:174:3: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0x' ( ('0'..'9'|'A'..'F'|'a'..'f'))+ | '0' ( '0' .. '7' )+ )
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:174:3: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0x' ( ('0'..'9'|'A'..'F'|'a'..'f'))+ | '0' ( '0' .. '7' )+ )
            int alt5=3;
            int LA5_0 = input.LA(1);
            if ( ((LA5_0>='1' && LA5_0<='9')) ) {
                alt5=1;
            }
            else if ( (LA5_0=='0') ) {
                int LA5_2 = input.LA(2);
                if ( (LA5_2=='x') ) {
                    alt5=2;
                }
                else if ( ((LA5_2>='0' && LA5_2<='7')) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("174:3: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0x' ( ('0'..'9'|'A'..'F'|'a'..'f'))+ | '0' ( '0' .. '7' )+ )", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("174:3: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0x' ( ('0'..'9'|'A'..'F'|'a'..'f'))+ | '0' ( '0' .. '7' )+ )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:174:5: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:174:5: ( '1' .. '9' )
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:174:6: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:174:15: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);
                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:174:16: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:175:5: '0x' ( ('0'..'9'|'A'..'F'|'a'..'f'))+
                    {
                    match("0x"); 

                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:175:10: ( ('0'..'9'|'A'..'F'|'a'..'f'))+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);
                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='F')||(LA3_0>='a' && LA3_0<='f')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:175:11: ('0'..'9'|'A'..'F'|'a'..'f')
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:176:5: '0' ( '0' .. '7' )+
                    {
                    match('0'); 
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:176:9: ( '0' .. '7' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);
                        if ( ((LA4_0>='0' && LA4_0<='7')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:176:10: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }


            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end INTEGER

    // $ANTLR start STRING
    public void mSTRING() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = STRING;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:182:3: ( '\"' (~ '\"' )+ '\"' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:182:3: '\"' (~ '\"' )+ '\"'
            {
            match('\"'); 
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:182:7: (~ '\"' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);
                if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:182:7: ~ '\"'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match('\"'); 

            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end STRING

    // $ANTLR start FLOAT
    public void mFLOAT() throws RecognitionException {
        try {
            ruleNestingLevel++;
            int type = FLOAT;
            int start = getCharIndex();
            int line = getLine();
            int charPosition = getCharPositionInLine();
            int channel = Token.DEFAULT_CHANNEL;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:187:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:187:3: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:187:3: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);
                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:187:4: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            match('.'); 
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:187:17: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);
                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:187:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }



                    if ( token==null && ruleNestingLevel==1 ) {
                        emit(type,line,charPosition,channel,start,getCharIndex()-1);
                    }

                        }
        finally {
            ruleNestingLevel--;
        }
    }
    // $ANTLR end FLOAT

    public void mTokens() throws RecognitionException {
        // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:10: ( T8 | T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | IDENT | INTEGER | STRING | FLOAT )
        int alt9=23;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:10: T8
                {
                mT8(); 

                }
                break;
            case 2 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:13: T9
                {
                mT9(); 

                }
                break;
            case 3 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:16: T10
                {
                mT10(); 

                }
                break;
            case 4 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:20: T11
                {
                mT11(); 

                }
                break;
            case 5 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:24: T12
                {
                mT12(); 

                }
                break;
            case 6 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:28: T13
                {
                mT13(); 

                }
                break;
            case 7 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:32: T14
                {
                mT14(); 

                }
                break;
            case 8 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:36: T15
                {
                mT15(); 

                }
                break;
            case 9 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:40: T16
                {
                mT16(); 

                }
                break;
            case 10 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:44: T17
                {
                mT17(); 

                }
                break;
            case 11 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:48: T18
                {
                mT18(); 

                }
                break;
            case 12 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:52: T19
                {
                mT19(); 

                }
                break;
            case 13 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:56: T20
                {
                mT20(); 

                }
                break;
            case 14 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:60: T21
                {
                mT21(); 

                }
                break;
            case 15 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:64: T22
                {
                mT22(); 

                }
                break;
            case 16 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:68: T23
                {
                mT23(); 

                }
                break;
            case 17 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:72: T24
                {
                mT24(); 

                }
                break;
            case 18 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:76: T25
                {
                mT25(); 

                }
                break;
            case 19 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:80: T26
                {
                mT26(); 

                }
                break;
            case 20 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:84: IDENT
                {
                mIDENT(); 

                }
                break;
            case 21 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:90: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 22 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:98: STRING
                {
                mSTRING(); 

                }
                break;
            case 23 :
                // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:1:105: FLOAT
                {
                mFLOAT(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    public static final String DFA9_eotS =
        "\3\uffff\2\23\7\uffff\1\23\7\uffff\1\34\2\uffff\2\23\1\41\1\23\1"+
        "\34\2\uffff\1\34\1\43\1\23\1\uffff\1\23\1\uffff\1\23\1\47\1\50\2"+
        "\uffff";
    public static final String DFA9_eofS =
        "\51\uffff";
    public static final String DFA9_minS =
        "\1\42\2\uffff\1\141\1\156\7\uffff\1\162\7\uffff\2\56\1\uffff\1\162"+
        "\1\154\1\60\1\165\1\56\2\uffff\1\56\1\60\1\163\1\uffff\1\145\1\uffff"+
        "\1\145\2\60\2\uffff";
    public static final String DFA9_maxS =
        "\1\175\2\uffff\1\157\1\156\7\uffff\1\162\7\uffff\1\71\1\170\1\uffff"+
        "\1\162\1\154\1\172\1\165\1\71\2\uffff\1\71\1\172\1\163\1\uffff\1"+
        "\145\1\uffff\1\145\2\172\2\uffff";
    public static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\2\uffff\1\26\5\uffff\1\25\1"+
        "\27\3\uffff\1\4\1\uffff\1\3\3\uffff\1\14\1\15";
    public static final String DFA9_specialS =
        "\51\uffff}>";
    public static final String[] DFA9_transition = {
        "\1\26\1\uffff\1\23\1\uffff\1\7\1\uffff\1\15\1\16\1\12\1\10\1\17"+
        "\1\11\1\22\1\13\1\25\11\24\3\uffff\1\5\3\uffff\32\23\1\20\1\uffff"+
        "\1\21\1\uffff\1\23\1\uffff\5\23\1\3\2\23\1\4\12\23\1\14\6\23\1\1"+
        "\1\6\1\2",
        "",
        "",
        "\1\30\15\uffff\1\27",
        "\1\31",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\32",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\35\1\uffff\12\33",
        "\1\35\1\uffff\10\36\2\35\76\uffff\1\34",
        "",
        "\1\37",
        "\1\40",
        "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
        "\1\42",
        "\1\35\1\uffff\12\33",
        "",
        "",
        "\1\35\1\uffff\10\36\2\35",
        "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
        "\1\44",
        "",
        "\1\45",
        "",
        "\1\46",
        "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
        "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
        "",
        ""
    };

    class DFA9 extends DFA {
        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA.unpackEncodedString(DFA9_eotS);
            this.eof = DFA.unpackEncodedString(DFA9_eofS);
            this.min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
            this.max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
            this.accept = DFA.unpackEncodedString(DFA9_acceptS);
            this.special = DFA.unpackEncodedString(DFA9_specialS);
            int numStates = DFA9_transition.length;
            this.transition = new short[numStates][];
            for (int i=0; i<numStates; i++) {
                transition[i] = DFA.unpackEncodedString(DFA9_transition[i]);
            }
        }
        public String getDescription() {
            return "1:1: Tokens : ( T8 | T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | IDENT | INTEGER | STRING | FLOAT );";
        }
    }
 

}