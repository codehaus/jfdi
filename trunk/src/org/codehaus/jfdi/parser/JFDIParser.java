// $ANTLR 3.0b4 /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g 2006-10-21 20:54:34

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "STRING", "FLOAT", "'{'", "'}'", "'for'", "'in'", "'='", "'||'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'", "'('", "')'", "','", "'['", "']'", "'.'", "'=>'"
    };
    public static final int INTEGER=5;
    public static final int IDENT=4;
    public static final int EOF=-1;
    public static final int STRING=6;
    public static final int FLOAT=7;

        public JFDIParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[18+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g"; }



    	private ValueHandlerFactory factory;
    	private TypeResolver typeResolver;
    	
    	public void setValueHandlerFactory(ValueHandlerFactory factory) {
    		this.factory = factory;
    	}
    	
    	public ValueHandlerFactory getValueHandlerFactory() {
    		return this.factory;
    	}
    	
    	public void setTypeResolver(TypeResolver typeResolver) {
    		this.typeResolver = typeResolver;
    	}
    	
    	public TypeResolver getTypeResolver() {
    		return typeResolver;
    	}
    	



    // $ANTLR start compilation_unit
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:39:1: compilation_unit : statements ;
    public void compilation_unit() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:41:3: ( statements )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:41:3: statements
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:45:1: statements : ( statement )* ;
    public void statements() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:47:3: ( ( statement )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:47:3: ( statement )*
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:47:3: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);
                if ( ((LA1_0>=IDENT && LA1_0<=FLOAT)||LA1_0==10||(LA1_0>=19 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:47:3: statement
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:50:1: statement : ( expr | for_in_statement ) ;
    public void statement() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:52:3: ( ( expr | for_in_statement ) )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:52:3: ( expr | for_in_statement )
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:52:3: ( expr | for_in_statement )
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
                    new NoViableAltException("52:3: ( expr | for_in_statement )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:52:5: expr
                    {
                    pushFollow(FOLLOW_expr_in_statement75);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:53:5: for_in_statement
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:57:1: statement_block : '{' statements '}' ;
    public void statement_block() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:59:3: ( '{' statements '}' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:59:3: '{' statements '}'
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:62:1: for_in_statement : 'for' IDENT 'in' expr statement_block ;
    public void for_in_statement() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:64:3: ( 'for' IDENT 'in' expr statement_block )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:64:3: 'for' IDENT 'in' expr statement_block
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:67:1: assignment_statement : object_expr '=' expr ;
    public void assignment_statement() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:69:3: ( object_expr '=' expr )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:69:3: object_expr '=' expr
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:72:1: expr returns [Expr e] : (t= cast )? ex= logical_or_expr ;
    public Expr expr() throws RecognitionException {   
        Expr e = null;

        Class t = null;

        Expr ex = null;



        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:77:3: ( (t= cast )? ex= logical_or_expr )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:77:3: (t= cast )? ex= logical_or_expr
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:77:3: (t= cast )?
            int alt3=2;
            int LA3_0 = input.LA(1);
            if ( (LA3_0==21) ) {
                int LA3_1 = input.LA(2);
                if ( (LA3_1==IDENT) ) {
                    int LA3_3 = input.LA(3);
                    if ( (LA3_3==22) ) {
                        alt3=1;
                    }
                }
            }
            switch (alt3) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:77:4: t= cast
                    {
                    pushFollow(FOLLOW_cast_in_expr169);
                    t=cast();
                    _fsp--;
                    if (failed) return e;

                    }
                    break;

            }

            pushFollow(FOLLOW_logical_or_expr_in_expr175);
            ex=logical_or_expr();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = ex; 
            }
            if ( backtracking==0 ) {

              			if ( t != null ) {
              				e = new CastExpr( t, e );
              			}
              		
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:85:1: logical_or_expr returns [Expr e] : lhs= logical_and_expr ( '||' rhs= logical_and_expr )* ;
    public Expr logical_or_expr() throws RecognitionException {   
        Expr e = null;

        Expr lhs = null;

        Expr rhs = null;



        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:90:3: (lhs= logical_and_expr ( '||' rhs= logical_and_expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:90:3: lhs= logical_and_expr ( '||' rhs= logical_and_expr )*
            {
            pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr207);
            lhs=logical_and_expr();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = lhs; 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:91:3: ( '||' rhs= logical_and_expr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);
                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:91:5: '||' rhs= logical_and_expr
            	    {
            	    match(input,13,FOLLOW_13_in_logical_or_expr215); if (failed) return e;
            	    pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr219);
            	    rhs=logical_and_expr();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	       e = new LogicalOrExpr( e, rhs ); 
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
    // $ANTLR end logical_or_expr


    // $ANTLR start logical_and_expr
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:96:1: logical_and_expr returns [Expr e] : lhs= additive_expr ( '&&' rhs= additive_expr )* ;
    public Expr logical_and_expr() throws RecognitionException {   
        Expr e = null;

        Expr lhs = null;

        Expr rhs = null;



        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:101:3: (lhs= additive_expr ( '&&' rhs= additive_expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:101:3: lhs= additive_expr ( '&&' rhs= additive_expr )*
            {
            pushFollow(FOLLOW_additive_expr_in_logical_and_expr256);
            lhs=additive_expr();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = lhs; 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:102:3: ( '&&' rhs= additive_expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);
                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:102:5: '&&' rhs= additive_expr
            	    {
            	    match(input,14,FOLLOW_14_in_logical_and_expr264); if (failed) return e;
            	    pushFollow(FOLLOW_additive_expr_in_logical_and_expr268);
            	    rhs=additive_expr();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	       e = new LogicalAndExpr( e, rhs ); 
            	    }

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
    // $ANTLR end logical_and_expr


    // $ANTLR start additive_expr
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:108:1: additive_expr returns [Expr e] : lhs= multiplicative_expr ( ( '+' | '-' ) rhs= multiplicative_expr )* ;
    public Expr additive_expr() throws RecognitionException {   
        Expr e = null;

        Expr lhs = null;

        Expr rhs = null;



        		e = null;
        		AdditiveExpr.Operator op = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:114:3: (lhs= multiplicative_expr ( ( '+' | '-' ) rhs= multiplicative_expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:114:3: lhs= multiplicative_expr ( ( '+' | '-' ) rhs= multiplicative_expr )*
            {
            pushFollow(FOLLOW_multiplicative_expr_in_additive_expr306);
            lhs=multiplicative_expr();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = lhs; 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:115:3: ( ( '+' | '-' ) rhs= multiplicative_expr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);
                if ( ((LA7_0>=15 && LA7_0<=16)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:116:4: ( '+' | '-' ) rhs= multiplicative_expr
            	    {
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:116:4: ( '+' | '-' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);
            	    if ( (LA6_0==15) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==16) ) {
            	        alt6=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return e;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("116:4: ( '+' | '-' )", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:116:6: '+'
            	            {
            	            match(input,15,FOLLOW_15_in_additive_expr320); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = AdditiveExpr.PLUS; 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:117:6: '-'
            	            {
            	            match(input,16,FOLLOW_16_in_additive_expr329); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = AdditiveExpr.MINUS; 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expr_in_additive_expr344);
            	    rhs=multiplicative_expr();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	       e = new AdditiveExpr( e, rhs, op ); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:125:1: multiplicative_expr returns [Expr e] : lhs= atom ( ( '*' | '/' ) rhs= atom )* ;
    public Expr multiplicative_expr() throws RecognitionException {   
        Expr e = null;

        Expr lhs = null;

        Expr rhs = null;



        		e = null;
        		MultiplicativeExpr.Operator op = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:131:3: (lhs= atom ( ( '*' | '/' ) rhs= atom )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:131:3: lhs= atom ( ( '*' | '/' ) rhs= atom )*
            {
            pushFollow(FOLLOW_atom_in_multiplicative_expr384);
            lhs=atom();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = lhs; 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:132:3: ( ( '*' | '/' ) rhs= atom )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);
                if ( ((LA9_0>=17 && LA9_0<=18)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:133:4: ( '*' | '/' ) rhs= atom
            	    {
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:133:4: ( '*' | '/' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);
            	    if ( (LA8_0==17) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==18) ) {
            	        alt8=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return e;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("133:4: ( '*' | '/' )", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:133:6: '*'
            	            {
            	            match(input,17,FOLLOW_17_in_multiplicative_expr397); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = MultiplicativeExpr.MULT; 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:134:6: '/'
            	            {
            	            match(input,18,FOLLOW_18_in_multiplicative_expr407); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = MultiplicativeExpr.DIV; 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_atom_in_multiplicative_expr422);
            	    rhs=atom();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	       e = new MultiplicativeExpr( e, rhs, op ); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:142:1: atom returns [Expr e] : (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | ex= object_expr ) ;
    public Expr atom() throws RecognitionException {   
        Expr e = null;

        Token i=null;
        Token s=null;
        Token f=null;
        Expr ex = null;



        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:147:3: ( (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | ex= object_expr ) )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:147:3: (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | ex= object_expr )
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:147:3: (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | ex= object_expr )
            int alt10=7;
            switch ( input.LA(1) ) {
            case INTEGER:
                alt10=1;
                break;
            case STRING:
                alt10=2;
                break;
            case FLOAT:
                alt10=3;
                break;
            case 19:
                alt10=4;
                break;
            case 20:
                alt10=5;
                break;
            case 21:
                alt10=6;
                break;
            case IDENT:
                alt10=7;
                break;
            default:
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("147:3: (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | ex= object_expr )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:147:5: i= INTEGER
                    {
                    i=(Token)input.LT(1);
                    match(input,INTEGER,FOLLOW_INTEGER_in_atom464); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.Integer.class, i.getText() ); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:148:5: s= STRING
                    {
                    s=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_atom474); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.String.class,  s.getText().substring( 1, s.getText().length()-1 ) ); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:149:5: f= FLOAT
                    {
                    f=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_atom485); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.Double.class,   f.getText() ); 
                    }

                    }
                    break;
                case 4 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:150:5: 'true'
                    {
                    match(input,19,FOLLOW_19_in_atom495); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.Boolean.class, "true" ); 
                    }

                    }
                    break;
                case 5 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:151:5: 'false'
                    {
                    match(input,20,FOLLOW_20_in_atom506); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.Boolean.class, "false" ); 
                    }

                    }
                    break;
                case 6 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:152:5: '(' ex= expr ')'
                    {
                    match(input,21,FOLLOW_21_in_atom516); if (failed) return e;
                    pushFollow(FOLLOW_expr_in_atom520);
                    ex=expr();
                    _fsp--;
                    if (failed) return e;
                    match(input,22,FOLLOW_22_in_atom522); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = ex; 
                    }

                    }
                    break;
                case 7 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:153:5: ex= object_expr
                    {
                    pushFollow(FOLLOW_object_expr_in_atom532);
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:158:1: arg_list returns [List args] : first= expr ( ',' other= expr )* ;
    public List arg_list() throws RecognitionException {   
        List args = null;

        Expr first = null;

        Expr other = null;



        		args = new ArrayList();
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:163:3: (first= expr ( ',' other= expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:163:3: first= expr ( ',' other= expr )*
            {
            pushFollow(FOLLOW_expr_in_arg_list570);
            first=expr();
            _fsp--;
            if (failed) return args;
            if ( backtracking==0 ) {
               args.add( first ); 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:164:3: ( ',' other= expr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);
                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:164:6: ',' other= expr
            	    {
            	    match(input,23,FOLLOW_23_in_arg_list580); if (failed) return args;
            	    pushFollow(FOLLOW_expr_in_arg_list584);
            	    other=expr();
            	    _fsp--;
            	    if (failed) return args;
            	    if ( backtracking==0 ) {
            	       args.add( other ); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:169:1: object_expr returns [Expr e] : i= IDENT ( '[' expr ']' | ( '.' IDENT '(' )=> '.' m= IDENT '(' (a= arg_list )? ')' )* ;
    public Expr object_expr() throws RecognitionException {   
        Expr e = null;

        Token i=null;
        Token m=null;
        List a = null;



        		e = null;
        		Expr[] paramExprs = new Expr[0];
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:175:3: (i= IDENT ( '[' expr ']' | ( '.' IDENT '(' )=> '.' m= IDENT '(' (a= arg_list )? ')' )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:175:3: i= IDENT ( '[' expr ']' | ( '.' IDENT '(' )=> '.' m= IDENT '(' (a= arg_list )? ')' )*
            {
            i=(Token)input.LT(1);
            match(input,IDENT,FOLLOW_IDENT_in_object_expr621); if (failed) return e;
            if ( backtracking==0 ) {
               e = factory.createExternalVariable( i.getText() ); 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:176:3: ( '[' expr ']' | ( '.' IDENT '(' )=> '.' m= IDENT '(' (a= arg_list )? ')' )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);
                if ( (LA13_0==24) ) {
                    alt13=1;
                }
                else if ( (LA13_0==26) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:176:5: '[' expr ']'
            	    {
            	    match(input,24,FOLLOW_24_in_object_expr629); if (failed) return e;
            	    pushFollow(FOLLOW_expr_in_object_expr631);
            	    expr();
            	    _fsp--;
            	    if (failed) return e;
            	    match(input,25,FOLLOW_25_in_object_expr633); if (failed) return e;

            	    }
            	    break;
            	case 2 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:177:5: ( '.' IDENT '(' )=> '.' m= IDENT '(' (a= arg_list )? ')'
            	    {
            	    match(input,26,FOLLOW_26_in_object_expr654); if (failed) return e;
            	    m=(Token)input.LT(1);
            	    match(input,IDENT,FOLLOW_IDENT_in_object_expr658); if (failed) return e;
            	    match(input,21,FOLLOW_21_in_object_expr660); if (failed) return e;
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:179:5: (a= arg_list )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);
            	    if ( ((LA12_0>=IDENT && LA12_0<=FLOAT)||(LA12_0>=19 && LA12_0<=21)) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:179:7: a= arg_list
            	            {
            	            pushFollow(FOLLOW_arg_list_in_object_expr670);
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

            	    match(input,22,FOLLOW_22_in_object_expr686); if (failed) return e;
            	    if ( backtracking==0 ) {

            	      				e = new MethodCall( e, m.getText(), paramExprs );
            	      				paramExprs = new Expr[0];
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
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


    // $ANTLR start cast
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:194:1: cast returns [Class type] : '(' i= IDENT ')' ;
    public Class cast() throws RecognitionException {   
        Class type = null;

        Token i=null;


        		type = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:199:3: ( '(' i= IDENT ')' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:199:3: '(' i= IDENT ')'
            {
            match(input,21,FOLLOW_21_in_cast725); if (failed) return type;
            i=(Token)input.LT(1);
            match(input,IDENT,FOLLOW_IDENT_in_cast729); if (failed) return type;
            match(input,22,FOLLOW_22_in_cast731); if (failed) return type;
            if ( backtracking==0 ) {

              			try {
              				type = typeResolver.resolveType( i.getText() );
              				System.err.println( "CASTING TO " + type);
              			} catch (ClassNotFoundException e) {
              				System.err.println( e.getMessage() );
              			}
              		
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end cast


    // $ANTLR start map
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:210:1: map returns [AnonMapValue m] : '{' (k= expr '=>' v= expr ( ',' k= expr '=>' v= expr )* ( ',' )? )? '}' ;
    public AnonMapValue map() throws RecognitionException {   
        AnonMapValue m = null;

        Expr k = null;

        Expr v = null;



        		m = null;
        		List pairs = new ArrayList();
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:216:3: ( '{' (k= expr '=>' v= expr ( ',' k= expr '=>' v= expr )* ( ',' )? )? '}' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:216:3: '{' (k= expr '=>' v= expr ( ',' k= expr '=>' v= expr )* ( ',' )? )? '}'
            {
            match(input,8,FOLLOW_8_in_map758); if (failed) return m;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:217:4: (k= expr '=>' v= expr ( ',' k= expr '=>' v= expr )* ( ',' )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);
            if ( ((LA16_0>=IDENT && LA16_0<=FLOAT)||(LA16_0>=19 && LA16_0<=21)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:217:6: k= expr '=>' v= expr ( ',' k= expr '=>' v= expr )* ( ',' )?
                    {
                    pushFollow(FOLLOW_expr_in_map767);
                    k=expr();
                    _fsp--;
                    if (failed) return m;
                    match(input,27,FOLLOW_27_in_map769); if (failed) return m;
                    pushFollow(FOLLOW_expr_in_map773);
                    v=expr();
                    _fsp--;
                    if (failed) return m;
                    if ( backtracking==0 ) {
                       pairs.add( new AnonMapValue.KeyValuePair( k, v ) ); 
                    }
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:219:5: ( ',' k= expr '=>' v= expr )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);
                        if ( (LA14_0==23) ) {
                            int LA14_1 = input.LA(2);
                            if ( ((LA14_1>=IDENT && LA14_1<=FLOAT)||(LA14_1>=19 && LA14_1<=21)) ) {
                                alt14=1;
                            }


                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:219:7: ',' k= expr '=>' v= expr
                    	    {
                    	    match(input,23,FOLLOW_23_in_map788); if (failed) return m;
                    	    pushFollow(FOLLOW_expr_in_map798);
                    	    k=expr();
                    	    _fsp--;
                    	    if (failed) return m;
                    	    match(input,27,FOLLOW_27_in_map800); if (failed) return m;
                    	    pushFollow(FOLLOW_expr_in_map804);
                    	    v=expr();
                    	    _fsp--;
                    	    if (failed) return m;
                    	    if ( backtracking==0 ) {
                    	       pairs.add( new AnonMapValue.KeyValuePair( k, v ) ); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:223:5: ( ',' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);
                    if ( (LA15_0==23) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:223:5: ','
                            {
                            match(input,23,FOLLOW_23_in_map825); if (failed) return m;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,9,FOLLOW_9_in_map837); if (failed) return m;
            if ( backtracking==0 ) {

              			m = new AnonMapValue( (AnonMapValue.KeyValuePair[]) pairs.toArray( new AnonMapValue.KeyValuePair[ pairs.size() ] ) );
              		
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return m;
    }
    // $ANTLR end map


    // $ANTLR start list
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:232:1: list returns [AnonListValue l] : '[' (v= expr ( ',' v= expr )* ( ',' )? )? ']' ;
    public AnonListValue list() throws RecognitionException {   
        AnonListValue l = null;

        Expr v = null;



        		l = null;
        		List values = new ArrayList();
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:238:3: ( '[' (v= expr ( ',' v= expr )* ( ',' )? )? ']' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:238:3: '[' (v= expr ( ',' v= expr )* ( ',' )? )? ']'
            {
            match(input,24,FOLLOW_24_in_list865); if (failed) return l;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:238:7: (v= expr ( ',' v= expr )* ( ',' )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);
            if ( ((LA19_0>=IDENT && LA19_0<=FLOAT)||(LA19_0>=19 && LA19_0<=21)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:238:9: v= expr ( ',' v= expr )* ( ',' )?
                    {
                    pushFollow(FOLLOW_expr_in_list871);
                    v=expr();
                    _fsp--;
                    if (failed) return l;
                    if ( backtracking==0 ) {
                       values.add( v ); 
                    }
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:240:5: ( ',' v= expr )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);
                        if ( (LA17_0==23) ) {
                            int LA17_1 = input.LA(2);
                            if ( ((LA17_1>=IDENT && LA17_1<=FLOAT)||(LA17_1>=19 && LA17_1<=21)) ) {
                                alt17=1;
                            }


                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:240:7: ',' v= expr
                    	    {
                    	    match(input,23,FOLLOW_23_in_list885); if (failed) return l;
                    	    pushFollow(FOLLOW_expr_in_list889);
                    	    v=expr();
                    	    _fsp--;
                    	    if (failed) return l;
                    	    if ( backtracking==0 ) {
                    	       values.add( v ); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:243:5: ( ',' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);
                    if ( (LA18_0==23) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g:243:5: ','
                            {
                            match(input,23,FOLLOW_23_in_list910); if (failed) return l;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_list923); if (failed) return l;
            if ( backtracking==0 ) {

              			l = new AnonListValue( values );
              		
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return l;
    }
    // $ANTLR end list


 

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
    public static final BitSet FOLLOW_cast_in_expr169 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_logical_or_expr_in_expr175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr207 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_logical_or_expr215 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr219 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_additive_expr_in_logical_and_expr256 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_logical_and_expr264 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_additive_expr_in_logical_and_expr268 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr306 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_15_in_additive_expr320 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_16_in_additive_expr329 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr344 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_atom_in_multiplicative_expr384 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_17_in_multiplicative_expr397 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_18_in_multiplicative_expr407 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_atom_in_multiplicative_expr422 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_INTEGER_in_atom464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_atom495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_atom506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_atom516 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_expr_in_atom520 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_atom522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_expr_in_atom532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_arg_list570 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_arg_list580 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_expr_in_arg_list584 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_IDENT_in_object_expr621 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_24_in_object_expr629 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_expr_in_object_expr631 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_object_expr633 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_26_in_object_expr654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_object_expr658 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_object_expr660 = new BitSet(new long[]{0x00000000007800F0L});
    public static final BitSet FOLLOW_arg_list_in_object_expr670 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_object_expr686 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_21_in_cast725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_cast729 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_cast731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_map758 = new BitSet(new long[]{0x00000000003802F0L});
    public static final BitSet FOLLOW_expr_in_map767 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_map769 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_expr_in_map773 = new BitSet(new long[]{0x0000000000800200L});
    public static final BitSet FOLLOW_23_in_map788 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_expr_in_map798 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_map800 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_expr_in_map804 = new BitSet(new long[]{0x0000000000800200L});
    public static final BitSet FOLLOW_23_in_map825 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_map837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_list865 = new BitSet(new long[]{0x00000000023800F0L});
    public static final BitSet FOLLOW_expr_in_list871 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_list885 = new BitSet(new long[]{0x00000000003800F0L});
    public static final BitSet FOLLOW_expr_in_list889 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_list910 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_list923 = new BitSet(new long[]{0x0000000000000002L});

}