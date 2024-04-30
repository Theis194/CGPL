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
KONST: 'const';
FOR: 'for';
WHILE: 'while';
IN: 'in';
NUMBER: ([1-9][0-9]* | [0-9]);
STRING: '"' (~[\r\n"])* '"';
BOOLEAN: 'true' | 'false';
BREAK: 'break';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
DECK: 'deck';


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
	: vardcl CRLF
	| function
	| ifstmt 
	| forstmt
	| whilestmt
	| switchstmt
	| deckfunction CRLF
	| listfunction CRLF
	| card CRLF
	| returnstmt CRLF
	| assignment CRLF
	| increment CRLF
	| decrement CRLF
	| functionCall CRLF
	;
vardcl: (VAR|KONST) IDENTIFIER ('=' value)?;
assignment: IDENTIFIER '=' value;
returnstmt: RETURN value;
functionBody: instruction*;
ifstmt: IF value LCURLY instruction* RCURLY (ELSE LCURLY instruction* RCURLY)?;
forstmt
	: FOR LPAREN vardcl CRLF boolExpr CRLF (instruction|increment|decrement) RPAREN LCURLY instruction* RCURLY 
	| FOR LPAREN IDENTIFIER IN value RPAREN LCURLY instruction* RCURLY;
whilestmt: WHILE LPAREN boolExpr RPAREN LCURLY instruction* RCURLY;
functionCall: IDENTIFIER LPAREN ((value)? | value (',' value)+) RPAREN;
function:
	FUNCTION IDENTIFIER LPAREN ((IDENTIFIER | value)? |(IDENTIFIER | value) (',' (IDENTIFIER | value))*) RPAREN LCURLY functionBody RCURLY;

value
	: NUMBER
	| IDENTIFIER
	| STRING
	| boolExpr 
	| arthexp
	| list
	| listfunction
	| deck
	| deckfunction
	| card
	| functionCall
	| stringConcat
	;

stringConcat: (STRING | IDENTIFIER) (OP_ADD (STRING | IDENTIFIER))+;

boolvalue
	: LPAREN boolExpr RPAREN
	| BOOLEAN
	| IDENTIFIER
	; 
andExpr: boolvalue (AND boolvalue)*;
orExpr: andExpr (OR andExpr)*;
boolExpr: orExpr | comparisonExpr;

factor
	: NUMBER 
	| IDENTIFIER 
	| LPAREN arthexp RPAREN
	| functionCall
	;
arthexp: factor (arth_op factor)*;

increment: IDENTIFIER OP_INC;
decrement: IDENTIFIER OP_DEC;

comparisonExpr: arthexp comparison arthexp;
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
listfunction: IDENTIFIER '.' ('add' | 'remove' | 'get') LPAREN value RPAREN;

deck: DECK;
deckfunction: IDENTIFIER '.' ('shuffle' | 'draw' | 'add' | 'remove') LPAREN (value)? RPAREN;

card: IDENTIFIER '.' ('value' | 'suit' | 'color' | 'name');

switchstmt
    : 'switch' LPAREN value RPAREN LCURLY casestmt+ RCURLY
    ;

casestmt
    : ('case' value | 'default')':'
    instruction*
    (BREAK CRLF)?
    ;