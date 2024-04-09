grammar Compilator;
prog: ( stat? NEWLINE )*
;

stat:	WRITE ID		#write
	| READ ID   		#read
 	| ID '=' expr0      #assign0
;
expr0:  expr1			        #single0
      | expr1 ADD expr0	    #add
      | expr1 SUB expr0	    #sub
;

expr1:  expr2			        #single1
      | expr2 MULT expr1	    #mult
      | expr2 DIV expr1         #div
;

expr2:   value              #val
       | '(' expr0 ')'		#par
;

value: ID
       | INT
       | STRING
       | REAL
;

WRITE:	'print ';
READ:	'read ' ;
ID:   ('a'..'z'|'A'..'Z')+;
REAL: '0'..'9'+'.''0'..'9'+;
INT:   '0'..'9'+;
ADD: '+';
SUB: '-';
MULT: '*';
DIV: '/';
STRING :  '"' ( ~('\\'|'"') )* '"';
NEWLINE:	'\r'? '\n';
WS:   (' '|'\t')+ { skip(); };