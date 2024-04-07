grammar Compilator;
prog: ( stat? NEWLINE )* ;

stat: ID '=' expr0          #write
    | ID '=' array_int      #arrayint
    | ID '=' array_real     #arrayreal
    | ID '=' array_string   #arraystring
    | ID '=' STRING         #string
    | PRINT ID              #print
    | READ ID               #read
;

expr0:  expr1			    #single0
      | expr1 ADD expr1	    #add
      | expr1 SUB expr1	    #sub
;

expr1:  expr2			    #single1
      | expr2 MULT expr2	#mult
      | expr2 DIV expr2	    #div
;

expr2:   INT			    #int
       | REAL			    #real
       | TOINT expr2		#toint
       | TOREAL expr2		#toreal
       | '(' expr0 ')'		#par
;
array_int: '[' INT ( ',' INT )* ']';
array_real: '[' REAL ( ',' REAL )* ']';
array_string: '[' STRING ( ',' STRING )* ']';

PRINT:	'print ';
READ: 'read ';
TOINT: '(int)';
TOREAL: '(real)';
ADD: '+';
SUB: '-';
MULT: '*';
DIV: '/';
REAL: '0'..'9'+'.''0'..'9'+;
INT: '0'..'9'+;
ID:   ('a'..'z'|'A'..'Z')+;
STRING :  '"' ( ~('\\'|'"') )* '"';
NEWLINE:	'\r'? '\n';
WS:   (' '|'\t')+ { skip(); };