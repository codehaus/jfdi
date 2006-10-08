// $ANTLR 3.0b4 /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g 2006-10-08 16:14:41

	package org.codehaus.jfdi.parser;
	import org.codehaus.jfdi.interpreter.*;
	import org.codehaus.jfdi.interpreter.operations.*;
	import java.util.List;
	import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class JFDIParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "STRING", "FLOAT", "'{'", "'}'", "'for'", "'in'", "'='", "'||'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'", "'('", "')'", "','", "'['", "']'", "'.'"
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



    	private ValueHandlerFactory factory;
    	
    	public void setValueHandlerFactory(ValueHandlerFactory factory) {
    		this.factory = factory;
    	}
    	
    	public ValueHandlerFactory getValueHandlerFactory() {
    		return this.factory;
    	}
    	



    // $ANTLR start compilation_unit
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:30:1: compilation_unit : statements ;
    public void compilation_unit() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:32:3: ( statements )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:32:3: statements
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:36:1: statements : ( statement )* ;
    public void statements() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:38:3: ( ( statement )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:38:3: ( statement )*
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:38:3: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);
                if ( ((LA1_0>=IDENT && LA1_0<=FLOAT)||LA1_0==10||(LA1_0>=19 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:38:3: statement
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:41:1: statement : ( expr | for_in_statement ) ;
    public void statement() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:43:3: ( ( expr | for_in_statement ) )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:43:3: ( expr | for_in_statement )
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:43:3: ( expr | for_in_statement )
            int alt2=2;
            int LA2_0 = input.LA(1);
            if ( ((LA2_0>=IDENT && LA2_0<=FLOAT)||(LA2_0>=19 && LA2_0<=21)) ) {
                alt2=1;
            }
            else if ( (LA2_0==10) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("43:3: ( expr | for_in_statement )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:43:5: expr
                    {
                    pushFollow(FOLLOW_expr_in_statement75);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:44:5: for_in_statement
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:48:1: statement_block : '{' statements '}' ;
    public void statement_block() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:50:3: ( '{' statements '}' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:50:3: '{' statements '}'
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:53:1: for_in_statement : 'for' IDENT 'in' expr statement_block ;
    public void for_in_statement() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:55:3: ( 'for' IDENT 'in' expr statement_block )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:55:3: 'for' IDENT 'in' expr statement_block
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:58:1: assignment_statement : object_expr '=' expr ;
    public void assignment_statement() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:60:3: ( object_expr '=' expr )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:60:3: object_expr '=' expr
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:63:1: expr returns [Expr e] : ex= logical_or_expr ;
    public Expr expr() throws RecognitionException {   
        Expr e = null;

        Expr ex = null;



        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:68:3: (ex= logical_or_expr )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:68:3: ex= logical_or_expr
            {
            pushFollow(FOLLOW_logical_or_expr_in_expr168);
            ex=logical_or_expr();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = ex; 
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
    // $ANTLR end expr


    // $ANTLR start logical_or_expr
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:71:1: logical_or_expr returns [Expr e] : lhs= logical_and_expr ( '||' rhs= logical_and_expr )* ;
    public Expr logical_or_expr() throws RecognitionException {   
        Expr e = null;

        Expr lhs = null;

        Expr rhs = null;



        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:76:3: (lhs= logical_and_expr ( '||' rhs= logical_and_expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:76:3: lhs= logical_and_expr ( '||' rhs= logical_and_expr )*
            {
            pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr196);
            lhs=logical_and_expr();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = lhs; 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:77:3: ( '||' rhs= logical_and_expr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);
                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:77:5: '||' rhs= logical_and_expr
            	    {
            	    match(input,13,FOLLOW_13_in_logical_or_expr204); if (failed) return e;
            	    pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr208);
            	    rhs=logical_and_expr();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	       e = new LogicalOrExpr( e, rhs ); 
            	    }

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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:82:1: logical_and_expr returns [Expr e] : lhs= additive_expr ( '&&' rhs= additive_expr )* ;
    public Expr logical_and_expr() throws RecognitionException {   
        Expr e = null;

        Expr lhs = null;

        Expr rhs = null;



        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:87:3: (lhs= additive_expr ( '&&' rhs= additive_expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:87:3: lhs= additive_expr ( '&&' rhs= additive_expr )*
            {
            pushFollow(FOLLOW_additive_expr_in_logical_and_expr245);
            lhs=additive_expr();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = lhs; 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:88:3: ( '&&' rhs= additive_expr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);
                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:88:5: '&&' rhs= additive_expr
            	    {
            	    match(input,14,FOLLOW_14_in_logical_and_expr253); if (failed) return e;
            	    pushFollow(FOLLOW_additive_expr_in_logical_and_expr257);
            	    rhs=additive_expr();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	       e = new LogicalAndExpr( e, rhs ); 
            	    }

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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:94:1: additive_expr returns [Expr e] : lhs= multiplicative_expr ( ( '+' | '-' ) rhs= multiplicative_expr )* ;
    public Expr additive_expr() throws RecognitionException {   
        Expr e = null;

        Expr lhs = null;

        Expr rhs = null;



        		e = null;
        		AdditiveExpr.Operator op = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:100:3: (lhs= multiplicative_expr ( ( '+' | '-' ) rhs= multiplicative_expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:100:3: lhs= multiplicative_expr ( ( '+' | '-' ) rhs= multiplicative_expr )*
            {
            pushFollow(FOLLOW_multiplicative_expr_in_additive_expr295);
            lhs=multiplicative_expr();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = lhs; 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:101:3: ( ( '+' | '-' ) rhs= multiplicative_expr )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);
                if ( ((LA6_0>=15 && LA6_0<=16)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:102:4: ( '+' | '-' ) rhs= multiplicative_expr
            	    {
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:102:4: ( '+' | '-' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);
            	    if ( (LA5_0==15) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==16) ) {
            	        alt5=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return e;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("102:4: ( '+' | '-' )", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:102:6: '+'
            	            {
            	            match(input,15,FOLLOW_15_in_additive_expr309); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = AdditiveExpr.PLUS; 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:103:6: '-'
            	            {
            	            match(input,16,FOLLOW_16_in_additive_expr318); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = AdditiveExpr.MINUS; 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expr_in_additive_expr333);
            	    rhs=multiplicative_expr();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	       e = new AdditiveExpr( e, rhs, op ); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( backtracking==0 ) {
              System.err.println( "add_expr returns " + e ); 
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
    // $ANTLR end additive_expr


    // $ANTLR start multiplicative_expr
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:111:1: multiplicative_expr returns [Expr e] : lhs= atom ( ( '*' | '/' ) rhs= atom )* ;
    public Expr multiplicative_expr() throws RecognitionException {   
        Expr e = null;

        Expr lhs = null;

        Expr rhs = null;



        		e = null;
        		MultiplicativeExpr.Operator op = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:117:3: (lhs= atom ( ( '*' | '/' ) rhs= atom )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:117:3: lhs= atom ( ( '*' | '/' ) rhs= atom )*
            {
            pushFollow(FOLLOW_atom_in_multiplicative_expr373);
            lhs=atom();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = lhs; 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:118:3: ( ( '*' | '/' ) rhs= atom )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);
                if ( ((LA8_0>=17 && LA8_0<=18)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:119:4: ( '*' | '/' ) rhs= atom
            	    {
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:119:4: ( '*' | '/' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);
            	    if ( (LA7_0==17) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==18) ) {
            	        alt7=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return e;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("119:4: ( '*' | '/' )", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:119:6: '*'
            	            {
            	            match(input,17,FOLLOW_17_in_multiplicative_expr386); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = MultiplicativeExpr.MULT; 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:120:6: '/'
            	            {
            	            match(input,18,FOLLOW_18_in_multiplicative_expr396); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = MultiplicativeExpr.DIV; 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_atom_in_multiplicative_expr411);
            	    rhs=atom();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	       e = new MultiplicativeExpr( e, rhs, op ); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( backtracking==0 ) {
              System.err.println( "mult_expr returns " + e ); 
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
    // $ANTLR end multiplicative_expr


    // $ANTLR start atom
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:128:1: atom returns [Expr e] : (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | ex= object_expr ) ;
    public Expr atom() throws RecognitionException {   
        Expr e = null;

        Token i=null;
        Token s=null;
        Token f=null;
        Expr ex = null;



        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:133:3: ( (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | ex= object_expr ) )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:133:3: (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | ex= object_expr )
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:133:3: (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | ex= object_expr )
            int alt9=7;
            switch ( input.LA(1) ) {
            case INTEGER:
                alt9=1;
                break;
            case STRING:
                alt9=2;
                break;
            case FLOAT:
                alt9=3;
                break;
            case 19:
                alt9=4;
                break;
            case 20:
                alt9=5;
                break;
            case 21:
                alt9=6;
                break;
            case IDENT:
                alt9=7;
                break;
            default:
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("133:3: (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | ex= object_expr )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:133:5: i= INTEGER
                    {
                    i=(Token)input.LT(1);
                    match(input,INTEGER,FOLLOW_INTEGER_in_atom453); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.Integer.class, i.getText() ); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:134:5: s= STRING
                    {
                    s=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_atom463); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.String.class,  s.getText().substring( 1, s.getText().length()-1 ) ); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:135:5: f= FLOAT
                    {
                    f=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_atom474); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.Double.class,   f.getText() ); 
                    }

                    }
                    break;
                case 4 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:136:5: 'true'
                    {
                    match(input,19,FOLLOW_19_in_atom484); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.Boolean.class, "true" ); 
                    }

                    }
                    break;
                case 5 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:137:5: 'false'
                    {
                    match(input,20,FOLLOW_20_in_atom495); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.Boolean.class, "false" ); 
                    }

                    }
                    break;
                case 6 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:138:5: '(' ex= expr ')'
                    {
                    match(input,21,FOLLOW_21_in_atom505); if (failed) return e;
                    pushFollow(FOLLOW_expr_in_atom509);
                    ex=expr();
                    _fsp--;
                    if (failed) return e;
                    match(input,22,FOLLOW_22_in_atom511); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = ex; 
                    }

                    }
                    break;
                case 7 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:139:5: ex= object_expr
                    {
                    pushFollow(FOLLOW_object_expr_in_atom521);
                    ex=object_expr();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                       e = ex; 
                    }

                    }
                    break;

            }

            if ( backtracking==0 ) {
              System.err.println( "atom returns " + e ); 
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:144:1: arg_list returns [List args] : first= expr ( ',' other= expr )* ;
    public List arg_list() throws RecognitionException {   
        List args = null;

        Expr first = null;

        Expr other = null;



        		args = new ArrayList();
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:149:3: (first= expr ( ',' other= expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:149:3: first= expr ( ',' other= expr )*
            {
            pushFollow(FOLLOW_expr_in_arg_list559);
            first=expr();
            _fsp--;
            if (failed) return args;
            if ( backtracking==0 ) {
               args.add( first ); 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:150:3: ( ',' other= expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);
                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:150:6: ',' other= expr
            	    {
            	    match(input,23,FOLLOW_23_in_arg_list569); if (failed) return args;
            	    pushFollow(FOLLOW_expr_in_arg_list573);
            	    other=expr();
            	    _fsp--;
            	    if (failed) return args;
            	    if ( backtracking==0 ) {
            	       args.add( other ); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
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
        return args;
    }
    // $ANTLR end arg_list


    // $ANTLR start object_expr
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:155:1: object_expr returns [Expr e] : i= IDENT ( '[' expr ']' | ( '.' IDENT '(' )=> '.' m= IDENT '(' (a= arg_list )? ')' )* ;
    public Expr object_expr() throws RecognitionException {   
        Expr e = null;

        Token i=null;
        Token m=null;
        List a = null;



        		e = null;
        		Expr[] paramExprs = new Expr[0];
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:161:3: (i= IDENT ( '[' expr ']' | ( '.' IDENT '(' )=> '.' m= IDENT '(' (a= arg_list )? ')' )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:161:3: i= IDENT ( '[' expr ']' | ( '.' IDENT '(' )=> '.' m= IDENT '(' (a= arg_list )? ')' )*
            {
            i=(Token)input.LT(1);
            match(input,IDENT,FOLLOW_IDENT_in_object_expr610); if (failed) return e;
            if ( backtracking==0 ) {
               e = factory.createExternalVariable( i.getText() ); 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:162:3: ( '[' expr ']' | ( '.' IDENT '(' )=> '.' m= IDENT '(' (a= arg_list )? ')' )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);
                if ( (LA12_0==24) ) {
                    alt12=1;
                }
                else if ( (LA12_0==26) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:162:5: '[' expr ']'
            	    {
            	    match(input,24,FOLLOW_24_in_object_expr618); if (failed) return e;
            	    pushFollow(FOLLOW_expr_in_object_expr620);
            	    expr();
            	    _fsp--;
            	    if (failed) return e;
            	    match(input,25,FOLLOW_25_in_object_expr622); if (failed) return e;

            	    }
            	    break;
            	case 2 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:163:5: ( '.' IDENT '(' )=> '.' m= IDENT '(' (a= arg_list )? ')'
            	    {
            	    match(input,26,FOLLOW_26_in_object_expr643); if (failed) return e;
            	    m=(Token)input.LT(1);
            	    match(input,IDENT,FOLLOW_IDENT_in_object_expr647); if (failed) return e;
            	    match(input,21,FOLLOW_21_in_object_expr649); if (failed) return e;
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:165:5: (a= arg_list )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);
            	    if ( ((LA11_0>=IDENT && LA11_0<=FLOAT)||(LA11_0>=19 && LA11_0<=21)) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:165:7: a= arg_list
            	            {
            	            pushFollow(FOLLOW_arg_list_in_object_expr659);
            	            a=arg_list();
            	            _fsp--;
            	            if (failed) return e;
            	            if ( backtracking==0 ) {

            	              						paramExprs = new Expr[ a.size() ];
            	              						for ( int j = 0 ; j < paramExprs.length ; ++j ) {
            	              							paramExprs[j] = (Expr) a.get( j );
            	              						} 
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    match(input,22,FOLLOW_22_in_object_expr675); if (failed) return e;
            	    if ( backtracking==0 ) {

            	      				e = new MethodCall( e, m.getText(), paramExprs );
            	      				paramExprs = new Expr[0];
            	      			
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
    public static final BitSet FOLLOW_statement_in_statements58 = new BitSet(new long[]{0x00000000003804F2L});
    public static final BitSet FOLLOW_expr_in_statement75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_in_statement_in_statement81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_statement_block99 = new BitSet(new long[]{0x00000000003806F0L});
    public static final BitSet FOLLOW_statements_in_statement_block101 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_statement_block103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_for_in_statement117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_for_in_statement119 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_for_in_statement121 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_expr_in_for_in_statement123 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_statement_block_in_for_in_statement125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_expr_in_assignment_statement138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_assignment_statement140 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_expr_in_assignment_statement142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expr_in_expr168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr196 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_logical_or_expr204 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr208 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_additive_expr_in_logical_and_expr245 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_logical_and_expr253 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_additive_expr_in_logical_and_expr257 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr295 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_15_in_additive_expr309 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_16_in_additive_expr318 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr333 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_atom_in_multiplicative_expr373 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_17_in_multiplicative_expr386 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_18_in_multiplicative_expr396 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_atom_in_multiplicative_expr411 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_INTEGER_in_atom453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_atom484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_atom495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_atom505 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_expr_in_atom509 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_atom511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_expr_in_atom521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_arg_list559 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_arg_list569 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_expr_in_arg_list573 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_IDENT_in_object_expr610 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_24_in_object_expr618 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_expr_in_object_expr620 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_object_expr622 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_26_in_object_expr643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_object_expr647 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_object_expr649 = new BitSet(new long[]{0x00000000007800F0L});
    public static final BitSet FOLLOW_arg_list_in_object_expr659 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_object_expr675 = new BitSet(new long[]{0x0000000005000002L});

}