grammar CGPL;

// Lexer rules
AND: 'and';
OR: 'or';
NOT: 'not';

RETURN: 'return';
FUNCTION: 'function';
LCURLY: '{';
RCURLY: '}';
LPAREN: '(';
RPAREN: ')';
IF: 'if';
ELSE: 'else';
VAR: 'var';
FOR: 'for';
WHILE: 'while';
IN: 'in';
NUMBER: ([1-9][0-9]* | [0-9]);
STRING: '"' (~[\r\n"])* '"';
BOOLEAN: 'true' | 'false';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

EQUAL: '==';
LT: '<';
GT: '>';
LT_OR_EQUAL: '<=';
GT_OR_EQUAL: '>=';

OP_INC: '++';
OP_DEC: '--';

OP_DIV: '/';
OP_MULT: '*';
OP_MOD: '%';

OP_ADD: '+';
OP_SUB: '-';

CRLF: ';';
WS: [ \t\r\n]+ -> skip;

// Parser rules
program: instruction* EOF;
instruction
	: vardcl 
	| function 
	| ifstmt 
	| forstmt 
	| returnstmt 
	| assignment 
	| increment 
	| decrement
	;
vardcl: VAR IDENTIFIER ('=' value)? CRLF;
assignment: IDENTIFIER '=' value CRLF;
returnstmt: RETURN value CRLF;
functionBody: instruction*;
ifstmt: IF value instruction (ELSE instruction)?;
forstmt: FOR LPAREN vardcl boolvalue arthexp RPAREN LCURLY instruction* RCURLY | FOR LPAREN IDENTIFIER IN value RPAREN LCURLY instruction* RCURLY;
whilestmt: WHILE LPAREN boolvalue RPAREN LCURLY instruction* RCURLY;
function:
	FUNCTION IDENTIFIER LPAREN IDENTIFIER RPAREN LCURLY functionBody RCURLY;

value
	: NUMBER 
	| STRING
	| boolExpr 
	| arthexp 
	| IDENTIFIER 
	| list
	;

boolvalue
	: LPAREN boolExpr RPAREN
	| BOOLEAN
	| IDENTIFIER
	; 
andExpr: boolvalue (AND boolvalue)*;
orExpr: andExpr (OR andExpr)*;
boolExpr: orExpr;
factor
	: NUMBER 
	| IDENTIFIER 
	| LPAREN arthexp RPAREN
	;
arthexp: factor (arth_op factor)*;
increment: IDENTIFIER OP_INC;
decrement: IDENTIFIER OP_DEC;

comparison
	: LT 
	| GT 
	| LT_OR_EQUAL 
	| GT_OR_EQUAL 
	| EQUAL
	;
arth_op
	: OP_ADD 
	| OP_SUB 
	| OP_DIV 
	| OP_MULT 
	| OP_MOD
	;

list: '[' value (',' value)* ']' | '[' ']';