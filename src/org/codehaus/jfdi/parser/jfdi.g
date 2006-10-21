grammar JFDIParser; 

@parser::header {
	package org.codehaus.jfdi.parser;
	import org.codehaus.jfdi.interpreter.*;
	import org.codehaus.jfdi.interpreter.operations.*;
	import java.util.List;
	import java.util.ArrayList;
}

@parser::members {

	private ValueHandlerFactory factory;
	
	public void setValueHandlerFactory(ValueHandlerFactory factory) {
		this.factory = factory;
	}
	
	public ValueHandlerFactory getValueHandlerFactory() {
		return this.factory;
	}
	
}

@lexer::header {
	package org.codehaus.jfdi.parser;
}


compilation_unit
	:
		statements	
	;
	

statements
	:
		statement*
	;
	
statement
	:
		(	expr
		|	for_in_statement
		)
	;
	
statement_block
	:
		'{' statements '}'
	;
	
for_in_statement
	:
		'for' IDENT 'in' expr statement_block
	;

assignment_statement
	:
		object_expr '=' expr
	;	

expr returns [Expr e]
	@init {
		e = null;
	}
	:
		ex=logical_or_expr { e = ex; }
	;
	
logical_or_expr returns [Expr e]
	@init {
		e = null;
	}
	:
		lhs=logical_and_expr { e = lhs; }
		(	'||' rhs=logical_and_expr 
			{ e = new LogicalOrExpr( e, rhs ); }
		)*
	;
	
logical_and_expr returns [Expr e]
	@init {
		e = null;
	}
	:
		lhs=additive_expr { e = lhs; }
		(	'&&' rhs=additive_expr
			{ e = new LogicalAndExpr( e, rhs ); }
		)*
	;
	
	
additive_expr returns [Expr e]
	@init {
		e = null;
		AdditiveExpr.Operator op = null;
	}
	:
		lhs=multiplicative_expr { e = lhs; }
		( 
			( '+' { op = AdditiveExpr.PLUS; }
			| '-' { op = AdditiveExpr.MINUS; }
			) 
			rhs=multiplicative_expr 
			{ e = new AdditiveExpr( e, rhs, op ); }
		)*
		{System.err.println( "add_expr returns " + e ); }
	;

multiplicative_expr returns [Expr e]
	@init {
		e = null;
		MultiplicativeExpr.Operator op = null;
	}
	:
		lhs=atom { e = lhs; }
		(
			( '*' { op = MultiplicativeExpr.MULT; } 
			| '/' { op = MultiplicativeExpr.DIV; }
			) 
			rhs=atom 
			{ e = new MultiplicativeExpr( e, rhs, op ); }
		)*
		{System.err.println( "mult_expr returns " + e ); }
	;
	
atom returns [Expr e]
	@init{
		e = null;
	}
	:
		(	i=INTEGER { e = factory.createLiteral( java.lang.Integer.class, i.getText() ); }
		|	s=STRING  { e = factory.createLiteral( java.lang.String.class,  s.getText().substring( 1, s.getText().length()-1 ) ); }
		|	f=FLOAT   { e = factory.createLiteral( java.lang.Double.class,   f.getText() ); }
		|	'true'    { e = factory.createLiteral( java.lang.Boolean.class, "true" ); }
		|	'false'   { e = factory.createLiteral( java.lang.Boolean.class, "false" ); }
		|	'(' ex=expr ')' { e = ex; }
		|	ex=object_expr  { e = ex; }
		)
		{System.err.println( "atom returns " + e ); }
	;
	
arg_list returns [List args]
	@init {
		args = new ArrayList();
	}
	:	
		first=expr { args.add( first ); } 
		( 	',' other=expr
			 { args.add( other ); }
		)*
	;
	
object_expr returns [Expr e]
	@init {
		e = null;
		Expr[] paramExprs = new Expr[0];
	}
	:
		i=IDENT { e = factory.createExternalVariable( i.getText() ); }
		(	'[' expr ']'
		|	( '.' IDENT '(' )=> 
			'.' m=IDENT '('
				(	a=arg_list
					{
						paramExprs = new Expr[ a.size() ];
						for ( int j = 0 ; j < paramExprs.length ; ++j ) {
							paramExprs[j] = (Expr) a.get( j );
						} 
					}
				)? ')' 
			{
				e = new MethodCall( e, m.getText(), paramExprs );
				paramExprs = new Expr[0];
			}
		)*
	;
	


map returns [AnonMapValue m]
	@init {
		m = null;
		List pairs = new ArrayList();
	}
	:
		'{'
			(	k=expr '=>' v=expr 
				{
					pairs.add( new AnonMapValue.KeyValuePair( k, v ) );
				}
				(	',' 
					k=expr '=>' v=expr 
				)*
				','? 
			)?
		'}'
		{
			m = new AnonMapValue( (AnonMapValue.KeyValuePair[]) pairs.toArray( new AnonMapValue.KeyValuePair[ pairs.size() ] ) );
		}
	;

/*	
array 
	:
		'[' ( expr ( ',' expr )* ','? )? ']'
	;
	
*/
	
	
IDENT
	:	
		('a'..'z'|'A'..'Z'|'_'|'$')('a'..'z'|'A'..'Z'|'_'|'0'..'9')* 
	;
	
INTEGER
	:
		(	('1'..'9')('0'..'9')*
		|	'0x' ('0'..'9'|'A'..'F'|'a'..'f')+
		|	'0' ('0'..'7')+
		)
	;
	
STRING
	:
		'"' ~'"'+ '"'
	;
	
FLOAT
	:
		('0'..'9')+'.'('0'..'9')+
	;

	
