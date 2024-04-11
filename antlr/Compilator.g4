grammar Compilator;
prog: ( stat? NEWLINE )*
;

stat:	WRITE expr0		        #write
	| READSTRING ID   		    #readstring
	| READINT ID   		        #readint
	| READREAL ID   		    #readreal
 	| ID '=' expr0              #assign0
;

expr0:  expr1			        #single0
      | expr1 ADD expr0	        #add
      | expr1 SUB expr0	        #sub
;

expr1:  expr2			        #single1
      | expr2 MULT expr1	    #mult
      | expr2 DIV expr1         #div
;

expr2:   value                  #val
       | '(' expr0 ')'		    #par
;

value: ID
       | INT
       | STRING
       | REAL
;

WRITE:	'print ';
READREAL:	'readr ' ;
READINT:	'readi ' ;
READSTRING:	'reads ' ;
ID:   ('a'..'z'|'A'..'Z')+;
REAL: '0'..'9'+'.''0'..'9'+;
INT:   '0'..'9'+;
ADD: '+';
SUB: '-';
MULT: '*';
DIV: '/';
STRING :  '"' ( ~('\\'|'"') )* '"';
NEWLINE:	'\r'? '\n';
WS:   (' '|'\t')+ -> skip;
