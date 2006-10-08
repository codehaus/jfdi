lexer grammar JFDIParserLexer;
@header {
	package org.codehaus.jfdi.parser;
}

T8 : '{' ;
T9 : '}' ;
T10 : 'for' ;
T11 : 'in' ;
T12 : '=' ;
T13 : '||' ;
T14 : '&&' ;
T15 : '+' ;
T16 : '-' ;
T17 : '*' ;
T18 : '/' ;
T19 : 'true' ;
T20 : 'false' ;
T21 : '(' ;
T22 : ')' ;
T23 : ',' ;
T24 : '[' ;
T25 : ']' ;
T26 : '.' ;

// $ANTLR src "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g" 196
IDENT
	:	
		('a'..'z'|'A'..'Z'|'_'|'$')('a'..'z'|'A'..'Z'|'_'|'0'..'9')* 
	;
	
// $ANTLR src "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g" 201
INTEGER
	:
		(	('1'..'9')('0'..'9')*
		|	'0x' ('0'..'9'|'A'..'F'|'a'..'f')+
		|	'0' ('0'..'7')+
		)
	;
	
// $ANTLR src "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g" 209
STRING
	:
		'"' ~'"'+ '"'
	;
	
// $ANTLR src "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g" 214
FLOAT
	:
		('0'..'9')+'.'('0'..'9')+
	;

	
