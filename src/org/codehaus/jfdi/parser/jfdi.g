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
		|	assignment_statement
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
	
atom
	:
		(	INTEGER
		|	STRING
		|	FLOAT
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
		|	'.' IDENT ('(' arg_list ')')?
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
	
	
