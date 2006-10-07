// $ANTLR 3.0b4 /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g 2006-10-07 17:27:32

	package org.codehaus.jfdi.parser;
	import org.codehaus.jfdi.interpreter.*;
	import org.codehaus.jfdi.interpreter.operations.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class JFDIParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "STRING", "FLOAT", "'{'", "'}'", "'for'", "'in'", "'='", "'||'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "','", "'['", "']'", "'.'"
    };
    public static final int INTEGER=5;
    public static final int IDENT=4;
    public static final int EOF=-1;
    public static final int STRING=6;
    public static final int FLOAT=7;

        public JFDIParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[15+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g"; }





    // $ANTLR start compilation_unit
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:17:1: compilation_unit : statements ;
    public void compilation_unit() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:19:3: ( statements )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:19:3: statements
            {
            pushFollow(FOLLOW_statements_in_compilation_unit42);
            statements();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end compilation_unit


    // $ANTLR start statements
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:23:1: statements : ( statement )* ;
    public void statements() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:25:3: ( ( statement )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:25:3: ( statement )*
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:25:3: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);
                if ( ((LA1_0>=IDENT && LA1_0<=FLOAT)||LA1_0==10||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:25:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements58);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end statements


    // $ANTLR start statement
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:28:1: statement : ( expr | for_in_statement ) ;
    public void statement() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:30:3: ( ( expr | for_in_statement ) )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:30:3: ( expr | for_in_statement )
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:30:3: ( expr | for_in_statement )
            int alt2=2;
            int LA2_0 = input.LA(1);
            if ( ((LA2_0>=IDENT && LA2_0<=FLOAT)||LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==10) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("30:3: ( expr | for_in_statement )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:30:5: expr
                    {
                    pushFollow(FOLLOW_expr_in_statement75);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:31:5: for_in_statement
                    {
                    pushFollow(FOLLOW_for_in_statement_in_statement81);
                    for_in_statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end statement


    // $ANTLR start statement_block
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:35:1: statement_block : '{' statements '}' ;
    public void statement_block() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:37:3: ( '{' statements '}' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:37:3: '{' statements '}'
            {
            match(input,8,FOLLOW_8_in_statement_block99); if (failed) return ;
            pushFollow(FOLLOW_statements_in_statement_block101);
            statements();
            _fsp--;
            if (failed) return ;
            match(input,9,FOLLOW_9_in_statement_block103); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end statement_block


    // $ANTLR start for_in_statement
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:40:1: for_in_statement : 'for' IDENT 'in' expr statement_block ;
    public void for_in_statement() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:42:3: ( 'for' IDENT 'in' expr statement_block )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:42:3: 'for' IDENT 'in' expr statement_block
            {
            match(input,10,FOLLOW_10_in_for_in_statement117); if (failed) return ;
            match(input,IDENT,FOLLOW_IDENT_in_for_in_statement119); if (failed) return ;
            match(input,11,FOLLOW_11_in_for_in_statement121); if (failed) return ;
            pushFollow(FOLLOW_expr_in_for_in_statement123);
            expr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_statement_block_in_for_in_statement125);
            statement_block();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end for_in_statement


    // $ANTLR start assignment_statement
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:45:1: assignment_statement : object_expr '=' expr ;
    public void assignment_statement() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:47:3: ( object_expr '=' expr )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:47:3: object_expr '=' expr
            {
            pushFollow(FOLLOW_object_expr_in_assignment_statement138);
            object_expr();
            _fsp--;
            if (failed) return ;
            match(input,12,FOLLOW_12_in_assignment_statement140); if (failed) return ;
            pushFollow(FOLLOW_expr_in_assignment_statement142);
            expr();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end assignment_statement


    // $ANTLR start expr
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:50:1: expr returns [Expr e] : logical_or_expr ;
    public Expr expr() throws RecognitionException {   
        Expr e = null;


        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:55:3: ( logical_or_expr )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:55:3: logical_or_expr
            {
            pushFollow(FOLLOW_logical_or_expr_in_expr166);
            logical_or_expr();
            _fsp--;
            if (failed) return e;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end expr


    // $ANTLR start logical_or_expr
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:58:1: logical_or_expr returns [Expr e] : logical_and_expr ( '||' logical_and_expr )* ;
    public Expr logical_or_expr() throws RecognitionException {   
        Expr e = null;


        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:63:3: ( logical_and_expr ( '||' logical_and_expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:63:3: logical_and_expr ( '||' logical_and_expr )*
            {
            pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr190);
            logical_and_expr();
            _fsp--;
            if (failed) return e;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:63:20: ( '||' logical_and_expr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);
                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:63:22: '||' logical_and_expr
            	    {
            	    match(input,13,FOLLOW_13_in_logical_or_expr194); if (failed) return e;
            	    pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr196);
            	    logical_and_expr();
            	    _fsp--;
            	    if (failed) return e;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end logical_or_expr


    // $ANTLR start logical_and_expr
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:66:1: logical_and_expr returns [Expr e] : additive_expr ( '&&' additive_expr )* ;
    public Expr logical_and_expr() throws RecognitionException {   
        Expr e = null;


        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:71:3: ( additive_expr ( '&&' additive_expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:71:3: additive_expr ( '&&' additive_expr )*
            {
            pushFollow(FOLLOW_additive_expr_in_logical_and_expr223);
            additive_expr();
            _fsp--;
            if (failed) return e;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:71:17: ( '&&' additive_expr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);
                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:71:19: '&&' additive_expr
            	    {
            	    match(input,14,FOLLOW_14_in_logical_and_expr227); if (failed) return e;
            	    pushFollow(FOLLOW_additive_expr_in_logical_and_expr229);
            	    additive_expr();
            	    _fsp--;
            	    if (failed) return e;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end logical_and_expr


    // $ANTLR start additive_expr
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:75:1: additive_expr returns [Expr e] : multiplicative_expr ( ('+'|'-') multiplicative_expr )* ;
    public Expr additive_expr() throws RecognitionException {   
        Expr e = null;


        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:80:3: ( multiplicative_expr ( ('+'|'-') multiplicative_expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:80:3: multiplicative_expr ( ('+'|'-') multiplicative_expr )*
            {
            pushFollow(FOLLOW_multiplicative_expr_in_additive_expr258);
            multiplicative_expr();
            _fsp--;
            if (failed) return e;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:80:23: ( ('+'|'-') multiplicative_expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);
                if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:80:25: ('+'|'-') multiplicative_expr
            	    {
            	    if ( (input.LA(1)>=15 && input.LA(1)<=16) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return e;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additive_expr264);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicative_expr_in_additive_expr272);
            	    multiplicative_expr();
            	    _fsp--;
            	    if (failed) return e;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end additive_expr


    // $ANTLR start multiplicative_expr
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:83:1: multiplicative_expr returns [Expr e] : atom ( ('*'|'/') atom )* ;
    public Expr multiplicative_expr() throws RecognitionException {   
        Expr e = null;


        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:88:3: ( atom ( ('*'|'/') atom )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:88:3: atom ( ('*'|'/') atom )*
            {
            pushFollow(FOLLOW_atom_in_multiplicative_expr298);
            atom();
            _fsp--;
            if (failed) return e;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:88:8: ( ('*'|'/') atom )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);
                if ( ((LA6_0>=17 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:88:10: ('*'|'/') atom
            	    {
            	    if ( (input.LA(1)>=17 && input.LA(1)<=18) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return e;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicative_expr304);    throw mse;
            	    }

            	    pushFollow(FOLLOW_atom_in_multiplicative_expr312);
            	    atom();
            	    _fsp--;
            	    if (failed) return e;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end multiplicative_expr


    // $ANTLR start atom
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:91:1: atom returns [Expr e] : (i= INTEGER | s= STRING | f= FLOAT | '(' ex= expr ')' | ex= object_expr ) ;
    public Expr atom() throws RecognitionException {   
        Expr e = null;

        Token i=null;
        Token s=null;
        Token f=null;
        Expr ex = null;



        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:96:3: ( (i= INTEGER | s= STRING | f= FLOAT | '(' ex= expr ')' | ex= object_expr ) )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:96:3: (i= INTEGER | s= STRING | f= FLOAT | '(' ex= expr ')' | ex= object_expr )
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:96:3: (i= INTEGER | s= STRING | f= FLOAT | '(' ex= expr ')' | ex= object_expr )
            int alt7=5;
            switch ( input.LA(1) ) {
            case INTEGER:
                alt7=1;
                break;
            case STRING:
                alt7=2;
                break;
            case FLOAT:
                alt7=3;
                break;
            case 19:
                alt7=4;
                break;
            case IDENT:
                alt7=5;
                break;
            default:
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("96:3: (i= INTEGER | s= STRING | f= FLOAT | '(' ex= expr ')' | ex= object_expr )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:96:5: i= INTEGER
                    {
                    i=(Token)input.LT(1);
                    match(input,INTEGER,FOLLOW_INTEGER_in_atom342); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = new LiteralValue( new Integer( i.getText() ) ); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:97:5: s= STRING
                    {
                    s=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_atom352); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = new LiteralValue( s.getText().substring( 1, s.getText().length()-1 ) ); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:98:5: f= FLOAT
                    {
                    f=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_atom363); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = new LiteralValue( new Double( f.getText() ) ); 
                    }

                    }
                    break;
                case 4 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:99:5: '(' ex= expr ')'
                    {
                    match(input,19,FOLLOW_19_in_atom373); if (failed) return e;
                    pushFollow(FOLLOW_expr_in_atom377);
                    ex=expr();
                    _fsp--;
                    if (failed) return e;
                    match(input,20,FOLLOW_20_in_atom379); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = ex; 
                    }

                    }
                    break;
                case 5 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:100:5: ex= object_expr
                    {
                    pushFollow(FOLLOW_object_expr_in_atom389);
                    ex=object_expr();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                       e = ex; 
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end atom


    // $ANTLR start arg_list
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:104:1: arg_list : ( IDENT '=' expr ( ',' IDENT '=' expr )+ ( ',' )? | expr ( ',' expr )* | ) ;
    public void arg_list() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:106:3: ( ( IDENT '=' expr ( ',' IDENT '=' expr )+ ( ',' )? | expr ( ',' expr )* | ) )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:106:3: ( IDENT '=' expr ( ',' IDENT '=' expr )+ ( ',' )? | expr ( ',' expr )* | )
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:106:3: ( IDENT '=' expr ( ',' IDENT '=' expr )+ ( ',' )? | expr ( ',' expr )* | )
            int alt11=3;
            switch ( input.LA(1) ) {
            case IDENT:
                int LA11_1 = input.LA(2);
                if ( (LA11_1==12) ) {
                    alt11=1;
                }
                else if ( ((LA11_1>=13 && LA11_1<=18)||(LA11_1>=20 && LA11_1<=22)||LA11_1==24) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("106:3: ( IDENT '=' expr ( ',' IDENT '=' expr )+ ( ',' )? | expr ( ',' expr )* | )", 11, 1, input);

                    throw nvae;
                }
                break;
            case INTEGER:
            case STRING:
            case FLOAT:
            case 19:
                alt11=2;
                break;
            case 20:
                alt11=3;
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("106:3: ( IDENT '=' expr ( ',' IDENT '=' expr )+ ( ',' )? | expr ( ',' expr )* | )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:106:5: IDENT '=' expr ( ',' IDENT '=' expr )+ ( ',' )?
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_arg_list413); if (failed) return ;
                    match(input,12,FOLLOW_12_in_arg_list415); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_arg_list417);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:106:20: ( ',' IDENT '=' expr )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);
                        if ( (LA8_0==21) ) {
                            int LA8_1 = input.LA(2);
                            if ( (LA8_1==IDENT) ) {
                                alt8=1;
                            }


                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:106:22: ',' IDENT '=' expr
                    	    {
                    	    match(input,21,FOLLOW_21_in_arg_list421); if (failed) return ;
                    	    match(input,IDENT,FOLLOW_IDENT_in_arg_list423); if (failed) return ;
                    	    match(input,12,FOLLOW_12_in_arg_list425); if (failed) return ;
                    	    pushFollow(FOLLOW_expr_in_arg_list427);
                    	    expr();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:106:44: ( ',' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);
                    if ( (LA9_0==21) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:106:44: ','
                            {
                            match(input,21,FOLLOW_21_in_arg_list432); if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:107:5: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_arg_list439);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:107:10: ( ',' expr )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);
                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:107:12: ',' expr
                    	    {
                    	    match(input,21,FOLLOW_21_in_arg_list443); if (failed) return ;
                    	    pushFollow(FOLLOW_expr_in_arg_list445);
                    	    expr();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:109:3: 
                    {
                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end arg_list


    // $ANTLR start object_expr
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:112:1: object_expr returns [Expr e] : IDENT ( '[' expr ']' | ( '.' IDENT '(' )=> '.' IDENT ( '(' arg_list ')' ) )* ;
    public Expr object_expr() throws RecognitionException {   
        Expr e = null;


        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:117:3: ( IDENT ( '[' expr ']' | ( '.' IDENT '(' )=> '.' IDENT ( '(' arg_list ')' ) )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:117:3: IDENT ( '[' expr ']' | ( '.' IDENT '(' )=> '.' IDENT ( '(' arg_list ')' ) )*
            {
            match(input,IDENT,FOLLOW_IDENT_in_object_expr482); if (failed) return e;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:118:3: ( '[' expr ']' | ( '.' IDENT '(' )=> '.' IDENT ( '(' arg_list ')' ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);
                if ( (LA12_0==22) ) {
                    alt12=1;
                }
                else if ( (LA12_0==24) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:118:5: '[' expr ']'
            	    {
            	    match(input,22,FOLLOW_22_in_object_expr488); if (failed) return e;
            	    pushFollow(FOLLOW_expr_in_object_expr490);
            	    expr();
            	    _fsp--;
            	    if (failed) return e;
            	    match(input,23,FOLLOW_23_in_object_expr492); if (failed) return e;

            	    }
            	    break;
            	case 2 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:119:5: ( '.' IDENT '(' )=> '.' IDENT ( '(' arg_list ')' )
            	    {
            	    match(input,24,FOLLOW_24_in_object_expr507); if (failed) return e;
            	    match(input,IDENT,FOLLOW_IDENT_in_object_expr509); if (failed) return e;
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:119:33: ( '(' arg_list ')' )
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:119:34: '(' arg_list ')'
            	    {
            	    match(input,19,FOLLOW_19_in_object_expr512); if (failed) return e;
            	    pushFollow(FOLLOW_arg_list_in_object_expr514);
            	    arg_list();
            	    _fsp--;
            	    if (failed) return e;
            	    match(input,20,FOLLOW_20_in_object_expr516); if (failed) return e;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end object_expr


 

    public static final BitSet FOLLOW_statements_in_compilation_unit42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements58 = new BitSet(new long[]{0x00000000000804F2L});
    public static final BitSet FOLLOW_expr_in_statement75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_in_statement_in_statement81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_statement_block99 = new BitSet(new long[]{0x00000000000806F0L});
    public static final BitSet FOLLOW_statements_in_statement_block101 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_statement_block103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_for_in_statement117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_for_in_statement119 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_for_in_statement121 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_expr_in_for_in_statement123 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_statement_block_in_for_in_statement125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_expr_in_assignment_statement138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_assignment_statement140 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_expr_in_assignment_statement142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expr_in_expr166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr190 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_logical_or_expr194 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr196 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_additive_expr_in_logical_and_expr223 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_logical_and_expr227 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_additive_expr_in_logical_and_expr229 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr258 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_set_in_additive_expr264 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr272 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_atom_in_multiplicative_expr298 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_multiplicative_expr304 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_atom_in_multiplicative_expr312 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_INTEGER_in_atom342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_atom373 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_expr_in_atom377 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_atom379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_expr_in_atom389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_arg_list413 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_arg_list415 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_expr_in_arg_list417 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_arg_list421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_arg_list423 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_arg_list425 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_expr_in_arg_list427 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_arg_list432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_arg_list439 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_arg_list443 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_expr_in_arg_list445 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_IDENT_in_object_expr482 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_22_in_object_expr488 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_expr_in_object_expr490 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_object_expr492 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_24_in_object_expr507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_object_expr509 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_object_expr512 = new BitSet(new long[]{0x00000000001800F0L});
    public static final BitSet FOLLOW_arg_list_in_object_expr514 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_object_expr516 = new BitSet(new long[]{0x0000000001400002L});

}