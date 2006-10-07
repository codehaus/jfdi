grammar JFDIParser; 

@parser::header {
	package org.codehaus.jfdi.parser;
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

expr
	:
		logical_or_expr
	;
	
logical_or_expr
	:
		logical_and_expr ( '||' logical_and_expr )*
	;
	
logical_and_expr
	:
		additive_expr ( '&&' additive_expr )*
	;
	
	
additive_expr
	:
		multiplicative_expr ( ( '+' | '-' ) multiplicative_expr )*
	;

multiplicative_expr
	:
		atom ( ( '*' | '/' ) atom )*
	;
	
atom returns [Object atom]
	@init{
		atom = null;
	}
	:
		(	i=INTEGER { atom = new Integer( i.getText() ); }
		|	s=STRING  { atom = s.getText(); }
		|	f=FLOAT   { atom = new Double( f.getText() ); }
		|	'(' expr ')'
		|	object_expr
		)
	;
	
arg_list
	:	
		(	IDENT '=' expr ( ',' IDENT '=' expr )+ ','?
		|	expr ( ',' expr )*
		|	/* empty production */
		)
	;
	
object_expr
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
	
	
