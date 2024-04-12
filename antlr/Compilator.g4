grammar Compilator;
prog: ( stat? NEWLINE )*
;

stat:	WRITE expr0		                #write
	| READSTRING ID   		            #readstring
	| READINT ID   		                #readint
	| READREAL ID   		            #readreal
 	| ID '=' expr0                      #assign0
;

expr0:  expr0 OR expr1		            #or
      | expr1			                #singleOr
;

expr1:  expr1 AND expr2		            #and
      | expr2			                #singleAnd
;

expr2:  expr2 XOR expr3		            #xor
      | expr3			                #singleXor
;

expr3:  NEG expr4		                #neg
      | expr4			                #singleNeg
;

expr4:  expr4 ADD expr5		            #add
      | expr4 SUB expr5		            #sub
      | expr5			                #singleAddSub
;

expr5:  expr5 MULT expr6		        #mult
      | expr5 DIV expr6                 #div
      | expr6			                #singleMultDiv
;

expr6:  '(' expr0 ')'		            #par
      | value			                #val
;

value: ID
       | INT
       | STRING
       | REAL
       | BOOL                            #boolVal
;

WRITE:	'print ';
READREAL:	'readr ' ;
READINT:	'readi ' ;
READSTRING:	'reads ' ;
ID:   ('a'..'z'|'A'..'Z')+;
REAL: '0'..'9'+'.''0'..'9'+;
INT:   '0'..'9'+;
STRING :  '"' ( ~('\\'|'"') )* '"';
BOOL:  'true' | 'false';
ADD: '+';
SUB: '-';
MULT: '*';
DIV: '/';
OR: '||';
AND: '&&';
XOR: '^';
NEG: '!';
NEWLINE:	'\r'? '\n';
WS:   (' '|'\t')+ -> skip;
