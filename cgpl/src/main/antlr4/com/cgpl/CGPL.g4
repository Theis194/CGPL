grammar CGPL;

program: instruction* EOF;
instruction: (
		| vardcl
		| function
		| ifstmt
		| forstmt
		| RETURN value
	) CRLF;
function:
	FUNCTION IDENTIFIER (IDENTIFIER) LCURLY functionBody RCURLY;
functionBody: instruction*;
vardcl: VAR IDENTIFIER ('=' value)? CRLF;
ifstmt: IF value instruction (ELSE instruction)?;
forstmt: FOR IDENTIFIER IN value instruction;

boolexp:
	value comparison value
	| BOOLEAN logical BOOLEAN
	| BOOLEAN comparison BOOLEAN
	| NUMBER comparison NUMBER
	| LPAREN boolexp RPAREN;
factor: NUMBER | IDENTIFIER | LPAREN arthexp RPAREN;
arthexp: factor (arth_op factor)*;
increment: IDENTIFIER OP_INC;
decrement: IDENTIFIER OP_DEC;

logical: AND | OR | NOT | EQUAL;
comparison: LT | GT | LT_OR_EQUAL | GT_OR_EQUAL | EQUAL;
arth_op: OP_ADD | OP_SUB | OP_DIV | OP_MULT | OP_MOD;

value: NUMBER | STRING | BOOLEAN | IDENTIFIER | list;
list: '[' value (',' value)* ']' | '[' ']';

NUMBER: ([1-9][0-9]* | [0-9]);
STRING: '"' (~[\r\n"])* '"';
BOOLEAN: 'true' | 'false';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
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
IN: 'in';

EQUAL: '==';
LT: '<';
GT: '>';
LT_OR_EQUAL: '<=';
GT_OR_EQUAL: '>=';
AND: 'and';
OR: 'or';
NOT: 'not';

OP_ADD: '+';
OP_SUB: '-';
OP_DIV: '/';
OP_MULT: '*';
OP_MOD: '%';
OP_INC: '++';
OP_DEC: '--';

CRLF: '\r'? '\n' | '\r';