grammar JFDIParser; 

@parser::header {
	package org.codehaus.jfdi.parser;
	import org.codehaus.jfdi.interpreter.*;
	import org.codehaus.jfdi.interpreter.operations.*;
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
	
arg_list
	:	
		(	IDENT '=' expr ( ',' IDENT '=' expr )+ ','?
		|	expr ( ',' expr )*
		|	/* empty production */
		)
	;
	
object_expr returns [Expr e]
	@init {
		e = null;
	}
	:
		i=IDENT { e = factory.createExternalVariable( i.getText() ); }
		(	'[' expr ']'
		| ('.' IDENT '(')=> '.' IDENT ('(' arg_list ')')
		)*
	;
	

/*	
map
	:
		'{'
		'}'
	;
	
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

	
