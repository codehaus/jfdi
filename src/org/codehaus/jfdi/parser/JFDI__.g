lexer grammar JFDI;
@header {
	package org.codehaus.jfdi.parser;
}

T8 : ';' ;
T9 : '{' ;
T10 : '}' ;
T11 : 'for' ;
T12 : 'in' ;
T13 : '=' ;
T14 : '||' ;
T15 : '&&' ;
T16 : '+' ;
T17 : '-' ;
T18 : '*' ;
T19 : '/' ;
T20 : '==' ;
T21 : '!=' ;
T22 : '>=' ;
T23 : '>' ;
T24 : '<=' ;
T25 : '<' ;
T26 : 'true' ;
T27 : 'false' ;
T28 : '(' ;
T29 : ')' ;
T30 : ',' ;
T31 : '[' ;
T32 : ']' ;
T33 : '.' ;
T34 : '=>' ;

// $ANTLR src "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g" 290
IDENT
	:	
		('a'..'z'|'A'..'Z'|'_'|'$')('a'..'z'|'A'..'Z'|'_'|'0'..'9')* 
	;
	
// $ANTLR src "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g" 295
INTEGER
	:
		(	('1'..'9')('0'..'9')*
		|	'0x' ('0'..'9'|'A'..'F'|'a'..'f')+
		|	'0' ('0'..'7')+
		)
	;
	
// $ANTLR src "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g" 303
STRING
	:
		( ('"' ~'"'+ '"') | ('\'' ~'\'' + '\'') )
	;
	
// $ANTLR src "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/JFDI.g" 308
FLOAT
	:
		('0'..'9')+'.'('0'..'9')+
	;

	
