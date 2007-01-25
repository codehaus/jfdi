// $ANTLR 3.0b5 /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g 2006-12-17 23:35:30

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "STRING", "FLOAT", "';'", "'{'", "'}'", "'for'", "'in'", "'='", "'||'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'true'", "'false'", "'('", "')'", "','", "'['", "']'", "'.'", "'=>'"
    };
    public static final int INTEGER=5;
    public static final int IDENT=4;
    public static final int EOF=-1;
    public static final int STRING=6;
    public static final int FLOAT=7;

        public JFDIParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[20+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g"; }



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

    	public boolean isVariableName(String name) {
    		return this.factory.isValidVariable(name);
    	}	



    // $ANTLR start compilation_unit
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:42:1: compilation_unit : statements ;
    public void compilation_unit() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:44:3: ( statements )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:44:3: statements
            {
            pushFollow(FOLLOW_statements_in_compilation_unit41);
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:48:1: statements : ( statement ';' )* ;
    public void statements() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:50:3: ( ( statement ';' )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:50:3: ( statement ';' )*
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:50:3: ( statement ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);
                if ( ((LA1_0>=IDENT && LA1_0<=FLOAT)||LA1_0==9||LA1_0==11||(LA1_0>=26 && LA1_0<=28)||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:50:4: statement ';'
            	    {
            	    pushFollow(FOLLOW_statement_in_statements58);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;
            	    match(input,8,FOLLOW_8_in_statements60); if (failed) return ;

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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:53:1: statement : ( expr | for_in_statement ) ;
    public void statement() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:55:3: ( ( expr | for_in_statement ) )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:55:3: ( expr | for_in_statement )
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:55:3: ( expr | for_in_statement )
            int alt2=2;
            int LA2_0 = input.LA(1);
            if ( ((LA2_0>=IDENT && LA2_0<=FLOAT)||LA2_0==9||(LA2_0>=26 && LA2_0<=28)||LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("55:3: ( expr | for_in_statement )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:55:5: expr
                    {
                    pushFollow(FOLLOW_expr_in_statement78);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:56:5: for_in_statement
                    {
                    pushFollow(FOLLOW_for_in_statement_in_statement84);
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:60:1: statement_block : '{' statements '}' ;
    public void statement_block() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:62:3: ( '{' statements '}' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:62:3: '{' statements '}'
            {
            match(input,9,FOLLOW_9_in_statement_block102); if (failed) return ;
            pushFollow(FOLLOW_statements_in_statement_block104);
            statements();
            _fsp--;
            if (failed) return ;
            match(input,10,FOLLOW_10_in_statement_block106); if (failed) return ;

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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:65:1: for_in_statement : 'for' IDENT 'in' expr statement_block ;
    public void for_in_statement() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:67:3: ( 'for' IDENT 'in' expr statement_block )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:67:3: 'for' IDENT 'in' expr statement_block
            {
            match(input,11,FOLLOW_11_in_for_in_statement120); if (failed) return ;
            match(input,IDENT,FOLLOW_IDENT_in_for_in_statement122); if (failed) return ;
            match(input,12,FOLLOW_12_in_for_in_statement124); if (failed) return ;
            pushFollow(FOLLOW_expr_in_for_in_statement126);
            expr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_statement_block_in_for_in_statement128);
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:70:1: assignment_statement : object_expr '=' expr ;
    public void assignment_statement() throws RecognitionException {   
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:72:3: ( object_expr '=' expr )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:72:3: object_expr '=' expr
            {
            pushFollow(FOLLOW_object_expr_in_assignment_statement141);
            object_expr();
            _fsp--;
            if (failed) return ;
            match(input,13,FOLLOW_13_in_assignment_statement143); if (failed) return ;
            pushFollow(FOLLOW_expr_in_assignment_statement145);
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:75:1: expr returns [Expr e] : ( ( '(' IDENT )=>{...}?t= cast | ) ex= logical_or_expr ;
    public Expr expr() throws RecognitionException {   
        Expr e = null;

        Class t = null;

        Expr ex = null;



        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:80:3: ( ( ( '(' IDENT )=>{...}?t= cast | ) ex= logical_or_expr )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:80:3: ( ( '(' IDENT )=>{...}?t= cast | ) ex= logical_or_expr
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:80:3: ( ( '(' IDENT )=>{...}?t= cast | )
            int alt3=2;
            int LA3_0 = input.LA(1);
            if ( (LA3_0==28) ) {
                int LA3_1 = input.LA(2);
                if ( (LA3_1==IDENT) ) {
                    int LA3_3 = input.LA(3);
                    if ( (LA3_3==29) ) {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case 8:
                        case 10:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 29:
                        case 30:
                        case 32:
                        case 34:
                            alt3=2;
                            break;
                        case 9:
                            if ( ((synpred1()&&!isVariableName( input.LT(2).getText() ))) ) {
                                alt3=1;
                            }
                            else if ( (true) ) {
                                alt3=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return e;}
                                NoViableAltException nvae =
                                    new NoViableAltException("80:3: ( ( '(' IDENT )=>{...}?t= cast | )", 3, 5, input);

                                throw nvae;
                            }
                            break;
                        case IDENT:
                        case INTEGER:
                        case STRING:
                        case FLOAT:
                        case 26:
                        case 27:
                        case 28:
                        case 31:
                            alt3=1;
                            break;
                        default:
                            if (backtracking>0) {failed=true; return e;}
                            NoViableAltException nvae =
                                new NoViableAltException("80:3: ( ( '(' IDENT )=>{...}?t= cast | )", 3, 4, input);

                            throw nvae;
                        }

                    }
                    else if ( ((LA3_3>=14 && LA3_3<=25)||LA3_3==31||LA3_3==33) ) {
                        alt3=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return e;}
                        NoViableAltException nvae =
                            new NoViableAltException("80:3: ( ( '(' IDENT )=>{...}?t= cast | )", 3, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA3_1>=INTEGER && LA3_1<=FLOAT)||LA3_1==9||(LA3_1>=26 && LA3_1<=28)||LA3_1==31) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("80:3: ( ( '(' IDENT )=>{...}?t= cast | )", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA3_0>=IDENT && LA3_0<=FLOAT)||LA3_0==9||(LA3_0>=26 && LA3_0<=27)||LA3_0==31) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("80:3: ( ( '(' IDENT )=>{...}?t= cast | )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:80:4: ( '(' IDENT )=>{...}?t= cast
                    {
                    if ( !(!isVariableName( input.LT(2).getText() )) ) {
                        if (backtracking>0) {failed=true; return e;}
                        throw new FailedPredicateException(input, "expr", "!isVariableName( input.LT(2).getText() )");
                    }
                    pushFollow(FOLLOW_cast_in_expr180);
                    t=cast();
                    _fsp--;
                    if (failed) return e;

                    }
                    break;
                case 2 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:80:68: 
                    {
                    }
                    break;

            }

            pushFollow(FOLLOW_logical_or_expr_in_expr187);
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:88:1: logical_or_expr returns [Expr e] : lhs= logical_and_expr ( '||' rhs= logical_and_expr )* ;
    public Expr logical_or_expr() throws RecognitionException {   
        Expr e = null;

        Expr lhs = null;

        Expr rhs = null;



        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:93:3: (lhs= logical_and_expr ( '||' rhs= logical_and_expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:93:3: lhs= logical_and_expr ( '||' rhs= logical_and_expr )*
            {
            pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr219);
            lhs=logical_and_expr();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = lhs; 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:94:3: ( '||' rhs= logical_and_expr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);
                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:94:5: '||' rhs= logical_and_expr
            	    {
            	    match(input,14,FOLLOW_14_in_logical_or_expr227); if (failed) return e;
            	    pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr231);
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:99:1: logical_and_expr returns [Expr e] : lhs= additive_expr ( '&&' rhs= additive_expr )* ;
    public Expr logical_and_expr() throws RecognitionException {   
        Expr e = null;

        Expr lhs = null;

        Expr rhs = null;



        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:104:3: (lhs= additive_expr ( '&&' rhs= additive_expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:104:3: lhs= additive_expr ( '&&' rhs= additive_expr )*
            {
            pushFollow(FOLLOW_additive_expr_in_logical_and_expr268);
            lhs=additive_expr();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = lhs; 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:105:3: ( '&&' rhs= additive_expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);
                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:105:5: '&&' rhs= additive_expr
            	    {
            	    match(input,15,FOLLOW_15_in_logical_and_expr276); if (failed) return e;
            	    pushFollow(FOLLOW_additive_expr_in_logical_and_expr280);
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:111:1: additive_expr returns [Expr e] : lhs= multiplicative_expr ( ( '+' | '-' ) rhs= multiplicative_expr )* ;
    public Expr additive_expr() throws RecognitionException {   
        Expr e = null;

        Expr lhs = null;

        Expr rhs = null;



        		e = null;
        		AdditiveExpr.Operator op = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:117:3: (lhs= multiplicative_expr ( ( '+' | '-' ) rhs= multiplicative_expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:117:3: lhs= multiplicative_expr ( ( '+' | '-' ) rhs= multiplicative_expr )*
            {
            pushFollow(FOLLOW_multiplicative_expr_in_additive_expr318);
            lhs=multiplicative_expr();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = lhs; 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:118:3: ( ( '+' | '-' ) rhs= multiplicative_expr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);
                if ( ((LA7_0>=16 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:119:4: ( '+' | '-' ) rhs= multiplicative_expr
            	    {
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:119:4: ( '+' | '-' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);
            	    if ( (LA6_0==16) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==17) ) {
            	        alt6=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return e;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("119:4: ( '+' | '-' )", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:119:6: '+'
            	            {
            	            match(input,16,FOLLOW_16_in_additive_expr332); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = AdditiveExpr.PLUS; 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:120:6: '-'
            	            {
            	            match(input,17,FOLLOW_17_in_additive_expr341); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = AdditiveExpr.MINUS; 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicative_expr_in_additive_expr356);
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
              //System.err.println( "add_expr returns " + e ); 
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:128:1: multiplicative_expr returns [Expr e] : lhs= equality_expr ( ( '*' | '/' ) rhs= equality_expr )* ;
    public Expr multiplicative_expr() throws RecognitionException {   
        Expr e = null;

        Expr lhs = null;

        Expr rhs = null;



        		e = null;
        		MultiplicativeExpr.Operator op = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:134:3: (lhs= equality_expr ( ( '*' | '/' ) rhs= equality_expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:134:3: lhs= equality_expr ( ( '*' | '/' ) rhs= equality_expr )*
            {
            pushFollow(FOLLOW_equality_expr_in_multiplicative_expr396);
            lhs=equality_expr();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = lhs; 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:135:3: ( ( '*' | '/' ) rhs= equality_expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);
                if ( ((LA9_0>=18 && LA9_0<=19)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:136:4: ( '*' | '/' ) rhs= equality_expr
            	    {
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:136:4: ( '*' | '/' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);
            	    if ( (LA8_0==18) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==19) ) {
            	        alt8=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return e;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("136:4: ( '*' | '/' )", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:136:6: '*'
            	            {
            	            match(input,18,FOLLOW_18_in_multiplicative_expr409); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = MultiplicativeExpr.MULT; 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:137:6: '/'
            	            {
            	            match(input,19,FOLLOW_19_in_multiplicative_expr419); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = MultiplicativeExpr.DIV; 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_equality_expr_in_multiplicative_expr434);
            	    rhs=equality_expr();
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
              //System.err.println( "mult_expr returns " + e ); 
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


    // $ANTLR start equality_expr
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:144:1: equality_expr returns [Expr e] : lhs= atom ( ( '==' | '!=' | '>=' | '>' | '<=' | '<' ) rhs= atom )* ;
    public Expr equality_expr() throws RecognitionException {   
        Expr e = null;

        Expr lhs = null;

        Expr rhs = null;



        		e = null;
        		EqualityExpr.Operator op = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:150:3: (lhs= atom ( ( '==' | '!=' | '>=' | '>' | '<=' | '<' ) rhs= atom )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:150:3: lhs= atom ( ( '==' | '!=' | '>=' | '>' | '<=' | '<' ) rhs= atom )*
            {
            pushFollow(FOLLOW_atom_in_equality_expr471);
            lhs=atom();
            _fsp--;
            if (failed) return e;
            if ( backtracking==0 ) {
               e = lhs; 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:151:3: ( ( '==' | '!=' | '>=' | '>' | '<=' | '<' ) rhs= atom )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);
                if ( ((LA11_0>=20 && LA11_0<=25)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:152:4: ( '==' | '!=' | '>=' | '>' | '<=' | '<' ) rhs= atom
            	    {
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:152:4: ( '==' | '!=' | '>=' | '>' | '<=' | '<' )
            	    int alt10=6;
            	    switch ( input.LA(1) ) {
            	    case 20:
            	        alt10=1;
            	        break;
            	    case 21:
            	        alt10=2;
            	        break;
            	    case 22:
            	        alt10=3;
            	        break;
            	    case 23:
            	        alt10=4;
            	        break;
            	    case 24:
            	        alt10=5;
            	        break;
            	    case 25:
            	        alt10=6;
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return e;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("152:4: ( '==' | '!=' | '>=' | '>' | '<=' | '<' )", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:152:6: '=='
            	            {
            	            match(input,20,FOLLOW_20_in_equality_expr484); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = EqualityExpr.IS_EQUAL; 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:153:6: '!='
            	            {
            	            match(input,21,FOLLOW_21_in_equality_expr493); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = EqualityExpr.IS_NOT_EQUAL; 
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:154:6: '>='
            	            {
            	            match(input,22,FOLLOW_22_in_equality_expr502); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = EqualityExpr.IS_GREATER_THAN_EQUAL; 
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:155:6: '>'
            	            {
            	            match(input,23,FOLLOW_23_in_equality_expr511); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = EqualityExpr.IS_GREATER_THAN; 
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:156:6: '<='
            	            {
            	            match(input,24,FOLLOW_24_in_equality_expr521); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = EqualityExpr.IS_LESS_THAN_EQUAL; 
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:157:6: '<'
            	            {
            	            match(input,25,FOLLOW_25_in_equality_expr530); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               op = EqualityExpr.IS_LESS_THAN; 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_atom_in_equality_expr545);
            	    rhs=atom();
            	    _fsp--;
            	    if (failed) return e;
            	    if ( backtracking==0 ) {
            	       e = new EqualityExpr( e, rhs, op ); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( backtracking==0 ) {
              //System.err.println( "equality_expr returns " + e ); 
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
    // $ANTLR end equality_expr


    // $ANTLR start atom
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:164:1: atom returns [Expr e] : (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | l= list | m= map | ex= object_expr ) ;
    public Expr atom() throws RecognitionException {   
        Expr e = null;

        Token i=null;
        Token s=null;
        Token f=null;
        Expr ex = null;

        AnonListValue l = null;

        AnonMapValue m = null;



        		e = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:169:3: ( (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | l= list | m= map | ex= object_expr ) )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:169:3: (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | l= list | m= map | ex= object_expr )
            {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:169:3: (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | l= list | m= map | ex= object_expr )
            int alt12=9;
            switch ( input.LA(1) ) {
            case INTEGER:
                alt12=1;
                break;
            case STRING:
                alt12=2;
                break;
            case FLOAT:
                alt12=3;
                break;
            case 26:
                alt12=4;
                break;
            case 27:
                alt12=5;
                break;
            case 28:
                alt12=6;
                break;
            case 31:
                alt12=7;
                break;
            case 9:
                alt12=8;
                break;
            case IDENT:
                alt12=9;
                break;
            default:
                if (backtracking>0) {failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("169:3: (i= INTEGER | s= STRING | f= FLOAT | 'true' | 'false' | '(' ex= expr ')' | l= list | m= map | ex= object_expr )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:169:5: i= INTEGER
                    {
                    i=(Token)input.LT(1);
                    match(input,INTEGER,FOLLOW_INTEGER_in_atom584); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.Integer.class, i.getText() ); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:170:5: s= STRING
                    {
                    s=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_atom594); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.String.class,  s.getText().substring( 1, s.getText().length()-1 ) ); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:171:5: f= FLOAT
                    {
                    f=(Token)input.LT(1);
                    match(input,FLOAT,FOLLOW_FLOAT_in_atom605); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.Double.class,   f.getText() ); 
                    }

                    }
                    break;
                case 4 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:172:5: 'true'
                    {
                    match(input,26,FOLLOW_26_in_atom615); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.Boolean.class, "true" ); 
                    }

                    }
                    break;
                case 5 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:173:5: 'false'
                    {
                    match(input,27,FOLLOW_27_in_atom626); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = factory.createLiteral( java.lang.Boolean.class, "false" ); 
                    }

                    }
                    break;
                case 6 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:174:5: '(' ex= expr ')'
                    {
                    match(input,28,FOLLOW_28_in_atom636); if (failed) return e;
                    pushFollow(FOLLOW_expr_in_atom640);
                    ex=expr();
                    _fsp--;
                    if (failed) return e;
                    match(input,29,FOLLOW_29_in_atom642); if (failed) return e;
                    if ( backtracking==0 ) {
                       e = ex; 
                    }

                    }
                    break;
                case 7 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:175:5: l= list
                    {
                    pushFollow(FOLLOW_list_in_atom652);
                    l=list();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                       e = l; 
                    }

                    }
                    break;
                case 8 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:176:5: m= map
                    {
                    pushFollow(FOLLOW_map_in_atom662);
                    m=map();
                    _fsp--;
                    if (failed) return e;
                    if ( backtracking==0 ) {
                       e = m; 
                    }

                    }
                    break;
                case 9 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:177:5: ex= object_expr
                    {
                    pushFollow(FOLLOW_object_expr_in_atom672);
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
              //System.err.println( "atom returns " + e ); 
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:182:1: arg_list returns [List args] : first= expr ( ',' other= expr )* ;
    public List arg_list() throws RecognitionException {   
        List args = null;

        Expr first = null;

        Expr other = null;



        		args = new ArrayList();
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:187:3: (first= expr ( ',' other= expr )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:187:3: first= expr ( ',' other= expr )*
            {
            pushFollow(FOLLOW_expr_in_arg_list710);
            first=expr();
            _fsp--;
            if (failed) return args;
            if ( backtracking==0 ) {
               args.add( first ); 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:188:3: ( ',' other= expr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);
                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:188:6: ',' other= expr
            	    {
            	    match(input,30,FOLLOW_30_in_arg_list720); if (failed) return args;
            	    pushFollow(FOLLOW_expr_in_arg_list724);
            	    other=expr();
            	    _fsp--;
            	    if (failed) return args;
            	    if ( backtracking==0 ) {
            	       args.add( other ); 
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
        return args;
    }
    // $ANTLR end arg_list


    // $ANTLR start object_expr
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:193:1: object_expr returns [Expr e] : i= IDENT ( ( '[' ~ '[' )=> '[' index= expr ']' | '.' n= IDENT ( '(' (a= arg_list )? ')' )? )* ;
    public Expr object_expr() throws RecognitionException {   
        Expr e = null;

        Token i=null;
        Token n=null;
        Expr index = null;

        List a = null;



        		e = null;
        		boolean isMethod = false;
        		Expr[] paramExprs = new Expr[0];
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:200:3: (i= IDENT ( ( '[' ~ '[' )=> '[' index= expr ']' | '.' n= IDENT ( '(' (a= arg_list )? ')' )? )* )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:200:3: i= IDENT ( ( '[' ~ '[' )=> '[' index= expr ']' | '.' n= IDENT ( '(' (a= arg_list )? ')' )? )*
            {
            i=(Token)input.LT(1);
            match(input,IDENT,FOLLOW_IDENT_in_object_expr761); if (failed) return e;
            if ( backtracking==0 ) {
               e = factory.createExternalVariable( i.getText() ); 
            }
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:201:3: ( ( '[' ~ '[' )=> '[' index= expr ']' | '.' n= IDENT ( '(' (a= arg_list )? ')' )? )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);
                if ( (LA16_0==31) ) {
                    alt16=1;
                }
                else if ( (LA16_0==33) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:201:5: ( '[' ~ '[' )=> '[' index= expr ']'
            	    {
            	    match(input,31,FOLLOW_31_in_object_expr779); if (failed) return e;
            	    pushFollow(FOLLOW_expr_in_object_expr783);
            	    index=expr();
            	    _fsp--;
            	    if (failed) return e;
            	    match(input,32,FOLLOW_32_in_object_expr785); if (failed) return e;
            	    if ( backtracking==0 ) {

            	      				e = new CollectionIndexExpr( e, index );
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:205:5: '.' n= IDENT ( '(' (a= arg_list )? ')' )?
            	    {
            	    match(input,33,FOLLOW_33_in_object_expr796); if (failed) return e;
            	    n=(Token)input.LT(1);
            	    match(input,IDENT,FOLLOW_IDENT_in_object_expr800); if (failed) return e;
            	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:206:4: ( '(' (a= arg_list )? ')' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);
            	    if ( (LA15_0==28) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:206:6: '(' (a= arg_list )? ')'
            	            {
            	            match(input,28,FOLLOW_28_in_object_expr808); if (failed) return e;
            	            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:207:6: (a= arg_list )?
            	            int alt14=2;
            	            int LA14_0 = input.LA(1);
            	            if ( ((LA14_0>=IDENT && LA14_0<=FLOAT)||LA14_0==9||(LA14_0>=26 && LA14_0<=28)||LA14_0==31) ) {
            	                alt14=1;
            	            }
            	            switch (alt14) {
            	                case 1 :
            	                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:207:8: a= arg_list
            	                    {
            	                    pushFollow(FOLLOW_arg_list_in_object_expr819);
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

            	            match(input,29,FOLLOW_29_in_object_expr842); if (failed) return e;
            	            if ( backtracking==0 ) {
            	               isMethod = true; 
            	            }

            	            }
            	            break;

            	    }

            	    if ( backtracking==0 ) {

            	      				String name = n.getText();
            	      				if ( ! isMethod ) {
            	      					name = "get" + name.substring(0,1).toUpperCase() + name.substring(1);
            	      				}
            	      				e = new MethodCall( e, name, paramExprs );
            	      				paramExprs = new Expr[0];
            	      				isMethod = false;
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:230:1: cast returns [Class type] : '(' i= IDENT ')' ;
    public Class cast() throws RecognitionException {   
        Class type = null;

        Token i=null;


        		type = null;
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:235:3: ( '(' i= IDENT ')' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:235:3: '(' i= IDENT ')'
            {
            match(input,28,FOLLOW_28_in_cast894); if (failed) return type;
            i=(Token)input.LT(1);
            match(input,IDENT,FOLLOW_IDENT_in_cast898); if (failed) return type;
            match(input,29,FOLLOW_29_in_cast900); if (failed) return type;
            if ( backtracking==0 ) {

              			try {
              				type = typeResolver.resolveType( i.getText() );
              				//System.err.println( "CASTING TO " + type);
              			} catch (ClassNotFoundException e) {
              				//System.err.println( e.getMessage() );
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:246:1: map returns [AnonMapValue m] : '{' (k= expr '=>' v= expr ( ',' k= expr '=>' v= expr )* ( ',' )? )? '}' ;
    public AnonMapValue map() throws RecognitionException {   
        AnonMapValue m = null;

        Expr k = null;

        Expr v = null;



        		m = null;
        		List pairs = new ArrayList();
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:252:3: ( '{' (k= expr '=>' v= expr ( ',' k= expr '=>' v= expr )* ( ',' )? )? '}' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:252:3: '{' (k= expr '=>' v= expr ( ',' k= expr '=>' v= expr )* ( ',' )? )? '}'
            {
            match(input,9,FOLLOW_9_in_map927); if (failed) return m;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:253:4: (k= expr '=>' v= expr ( ',' k= expr '=>' v= expr )* ( ',' )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);
            if ( ((LA19_0>=IDENT && LA19_0<=FLOAT)||LA19_0==9||(LA19_0>=26 && LA19_0<=28)||LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:253:6: k= expr '=>' v= expr ( ',' k= expr '=>' v= expr )* ( ',' )?
                    {
                    pushFollow(FOLLOW_expr_in_map936);
                    k=expr();
                    _fsp--;
                    if (failed) return m;
                    match(input,34,FOLLOW_34_in_map938); if (failed) return m;
                    pushFollow(FOLLOW_expr_in_map942);
                    v=expr();
                    _fsp--;
                    if (failed) return m;
                    if ( backtracking==0 ) {
                       pairs.add( new AnonMapValue.KeyValuePair( k, v ) ); 
                    }
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:255:5: ( ',' k= expr '=>' v= expr )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);
                        if ( (LA17_0==30) ) {
                            int LA17_1 = input.LA(2);
                            if ( ((LA17_1>=IDENT && LA17_1<=FLOAT)||LA17_1==9||(LA17_1>=26 && LA17_1<=28)||LA17_1==31) ) {
                                alt17=1;
                            }


                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:255:7: ',' k= expr '=>' v= expr
                    	    {
                    	    match(input,30,FOLLOW_30_in_map957); if (failed) return m;
                    	    pushFollow(FOLLOW_expr_in_map967);
                    	    k=expr();
                    	    _fsp--;
                    	    if (failed) return m;
                    	    match(input,34,FOLLOW_34_in_map969); if (failed) return m;
                    	    pushFollow(FOLLOW_expr_in_map973);
                    	    v=expr();
                    	    _fsp--;
                    	    if (failed) return m;
                    	    if ( backtracking==0 ) {
                    	       pairs.add( new AnonMapValue.KeyValuePair( k, v ) ); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:259:5: ( ',' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);
                    if ( (LA18_0==30) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:259:5: ','
                            {
                            match(input,30,FOLLOW_30_in_map994); if (failed) return m;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_map1006); if (failed) return m;
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
    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:268:1: list returns [AnonListValue l] : '[' (v= expr ( ',' v= expr )* ( ',' )? )? ']' ;
    public AnonListValue list() throws RecognitionException {   
        AnonListValue l = null;

        Expr v = null;



        		l = null;
        		List values = new ArrayList();
        	
        try {
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:274:3: ( '[' (v= expr ( ',' v= expr )* ( ',' )? )? ']' )
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:274:3: '[' (v= expr ( ',' v= expr )* ( ',' )? )? ']'
            {
            match(input,31,FOLLOW_31_in_list1034); if (failed) return l;
            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:274:7: (v= expr ( ',' v= expr )* ( ',' )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);
            if ( ((LA22_0>=IDENT && LA22_0<=FLOAT)||LA22_0==9||(LA22_0>=26 && LA22_0<=28)||LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:274:9: v= expr ( ',' v= expr )* ( ',' )?
                    {
                    pushFollow(FOLLOW_expr_in_list1040);
                    v=expr();
                    _fsp--;
                    if (failed) return l;
                    if ( backtracking==0 ) {
                       values.add( v ); 
                    }
                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:276:5: ( ',' v= expr )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);
                        if ( (LA20_0==30) ) {
                            int LA20_1 = input.LA(2);
                            if ( ((LA20_1>=IDENT && LA20_1<=FLOAT)||LA20_1==9||(LA20_1>=26 && LA20_1<=28)||LA20_1==31) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:276:7: ',' v= expr
                    	    {
                    	    match(input,30,FOLLOW_30_in_list1054); if (failed) return l;
                    	    pushFollow(FOLLOW_expr_in_list1058);
                    	    v=expr();
                    	    _fsp--;
                    	    if (failed) return l;
                    	    if ( backtracking==0 ) {
                    	       values.add( v ); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:279:5: ( ',' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);
                    if ( (LA21_0==30) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:279:5: ','
                            {
                            match(input,30,FOLLOW_30_in_list1079); if (failed) return l;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_list1092); if (failed) return l;
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

    // $ANTLR start synpred1
    public void synpred1_fragment() throws RecognitionException {   
        // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:80:4: ( '(' IDENT )
        // /Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g:80:5: '(' IDENT
        {
        match(input,28,FOLLOW_28_in_synpred1171); if (failed) return ;
        match(input,IDENT,FOLLOW_IDENT_in_synpred1173); if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    public boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            //System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_statements_in_compilation_unit41 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements58 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_statements60 = new BitSet(new long[]{0x000000009C000AF2L});
    public static final BitSet FOLLOW_expr_in_statement78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_in_statement_in_statement84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_statement_block102 = new BitSet(new long[]{0x000000009C000EF0L});
    public static final BitSet FOLLOW_statements_in_statement_block104 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_statement_block106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_for_in_statement120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_for_in_statement122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_for_in_statement124 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_expr_in_for_in_statement126 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_statement_block_in_for_in_statement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_expr_in_assignment_statement141 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_assignment_statement143 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_expr_in_assignment_statement145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_expr180 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_logical_or_expr_in_expr187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr219 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_logical_or_expr227 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr231 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_additive_expr_in_logical_and_expr268 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_logical_and_expr276 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_additive_expr_in_logical_and_expr280 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr318 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_additive_expr332 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_17_in_additive_expr341 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr356 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_equality_expr_in_multiplicative_expr396 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_multiplicative_expr409 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_19_in_multiplicative_expr419 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_equality_expr_in_multiplicative_expr434 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_atom_in_equality_expr471 = new BitSet(new long[]{0x0000000003F00002L});
    public static final BitSet FOLLOW_20_in_equality_expr484 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_21_in_equality_expr493 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_22_in_equality_expr502 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_23_in_equality_expr511 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_24_in_equality_expr521 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_25_in_equality_expr530 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_atom_in_equality_expr545 = new BitSet(new long[]{0x0000000003F00002L});
    public static final BitSet FOLLOW_INTEGER_in_atom584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_atom615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_atom626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_atom636 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_expr_in_atom640 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_atom642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_atom652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_atom662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_expr_in_atom672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_arg_list710 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_arg_list720 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_expr_in_arg_list724 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_IDENT_in_object_expr761 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_31_in_object_expr779 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_expr_in_object_expr783 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_object_expr785 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_33_in_object_expr796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_object_expr800 = new BitSet(new long[]{0x0000000290000002L});
    public static final BitSet FOLLOW_28_in_object_expr808 = new BitSet(new long[]{0x00000000BC0002F0L});
    public static final BitSet FOLLOW_arg_list_in_object_expr819 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_object_expr842 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_28_in_cast894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_cast898 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_cast900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_map927 = new BitSet(new long[]{0x000000009C0006F0L});
    public static final BitSet FOLLOW_expr_in_map936 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_map938 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_expr_in_map942 = new BitSet(new long[]{0x0000000040000400L});
    public static final BitSet FOLLOW_30_in_map957 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_expr_in_map967 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_map969 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_expr_in_map973 = new BitSet(new long[]{0x0000000040000400L});
    public static final BitSet FOLLOW_30_in_map994 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_map1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_list1034 = new BitSet(new long[]{0x000000019C0002F0L});
    public static final BitSet FOLLOW_expr_in_list1040 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_30_in_list1054 = new BitSet(new long[]{0x000000009C0002F0L});
    public static final BitSet FOLLOW_expr_in_list1058 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_30_in_list1079 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_list1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred1171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_synpred1173 = new BitSet(new long[]{0x0000000000000002L});

}