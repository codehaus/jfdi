grammar JFDIParser; 

@parser::header {
	package org.codehaus.jfdi.parser;
	import org.codehaus.jfdi.interpreter.*;
	import org.codehaus.jfdi.interpreter.operations.*;
}

@parser::members {
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
		logical_or_expr
	;
	
logical_or_expr returns [Expr e]
	@init {
		e = null;
	}
	:
		logical_and_expr ( '||' logical_and_expr )*
	;
	
logical_and_expr returns [Expr e]
	@init {
		e = null;
	}
	:
		additive_expr ( '&&' additive_expr )*
	;
	
	
additive_expr returns [Expr e]
	@init {
		e = null;
	}
	:
		multiplicative_expr ( ( '+' | '-' ) multiplicative_expr )*
	;

multiplicative_expr returns [Expr e]
	@init {
		e = null;
	}
	:
		atom ( ( '*' | '/' ) atom )*
	;
	
atom returns [Expr e]
	@init{
		e = null;
	}
	:
		(	i=INTEGER { e = new LiteralValue( new Integer( i.getText() ) ); }
		|	s=STRING  { e = new LiteralValue( s.getText().substring( 1, s.getText().length()-1 ) ); }
		|	f=FLOAT   { e = new LiteralValue( new Double( f.getText() ) ); }
		|	'(' ex=expr ')' { e = ex; }
		|	ex=object_expr  { e = ex; }
		)
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
		IDENT
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
	
	
