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
T19 : '(' ;
T20 : ')' ;
T21 : ',' ;
T22 : '[' ;
T23 : ']' ;
T24 : '.' ;

// $ANTLR src "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g" 141
IDENT
	:	
		('a'..'z'|'A'..'Z'|'_'|'$')('a'..'z'|'A'..'Z'|'_'|'0'..'9')* 
	;
	
// $ANTLR src "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g" 146
INTEGER
	:
		(	('1'..'9')('0'..'9')*
		|	'0x' ('0'..'9'|'A'..'F'|'a'..'f')+
		|	'0' ('0'..'7')+
		)
	;
	
// $ANTLR src "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g" 154
STRING
	:
		'"' ~'"'+ '"'
	;
	
// $ANTLR src "/Users/bob/checkouts/jfdi/src/org/codehaus/jfdi/parser/jfdi.g" 159
FLOAT
	:
		('0'..'9')+'.'('0'..'9')+
	;
	
	
