grammar CGPL;

// Lexer rules
AND: 'and';
OR: 'or';
NOT: 'not';

RETURN: 'return';
PRINT: 'print';
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
DECK: 'Deck';
PLAYER: 'Player';
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
	: vardcl CRLF
	| function
	| ifstmt
	| forstmt
	| whilestmt
	| switchstmt
	| deckfunction CRLF
	| listfunction CRLF
	| playerfunction CRLF
	| card CRLF
	| returnstmt CRLF
	| breakstmt CRLF
	| printstmt CRLF
	| assignment CRLF
	| increment CRLF
	| decrement CRLF
	| functionCall CRLF
	;
vardcl: (VAR|KONST) IDENTIFIER ('=' value)?;
assignment: IDENTIFIER '=' value;
returnstmt: RETURN value;
breakstmt: BREAK;
printstmt: PRINT LPAREN value RPAREN;
functionBody: instruction*;
ifstmt: IF boolExpr LCURLY instruction* RCURLY (ELSE LCURLY instruction* RCURLY | ELSE ifstmt)?;
forstmt
	: FOR LPAREN vardcl CRLF boolExpr CRLF (assignment|increment|decrement) RPAREN LCURLY instruction* RCURLY 
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
	| comparisonExpr 
	| arthexp
	| listfunction
	| list
	| deckfunction
	| deck
	| cardfunction
	| card
	| functionCall
	| stringConcat
	| playerfunction
	| player
	;

stringConcat: (STRING | IDENTIFIER) (OP_ADD (STRING | IDENTIFIER))+;

boolvalue
	: LPAREN boolExpr RPAREN
	| BOOLEAN
	| IDENTIFIER
	; 
andExpr: boolvalue (AND boolvalue)*;
orExpr: andExpr (OR andExpr)*;
boolExpr: comparisonExpr | orExpr;

factor
	: NUMBER 
	| IDENTIFIER 
	| BOOLEAN
	| functionCall
	| cardfunction
	| deckfunction
	| listfunction
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
listfunction: IDENTIFIER '.' listfunctionname LPAREN (value)? RPAREN;
listfunctionname
	: 'add' 
	| 'remove' 
	| 'get'
	| 'size'
	;

deck: DECK;
deckfunction: IDENTIFIER '.' deckfunctionname LPAREN (value)? RPAREN;
deckfunctionname
	: 'shuffle'
	| 'draw'
	| 'addCard'
	| 'removeCard'
	;

card: cardvalue 'of' suit;
cardfunction: IDENTIFIER '.' cardfunctionname LPAREN RPAREN;
cardfunctionname
	: 'value' 
	| 'suit' 
	| 'color' 
	| 'name'
	;
suit
	: 'hearts' 
	| 'diamonds' 
	| 'clubs' 
	| 'spades'
	;
cardvalue
	: NUMBER 
	| 'jack' 
	| 'queen' 
	| 'king' 
	| 'ace'
	;

player: PLAYER;
playerfunction: IDENTIFIER '.' playerfunctionname LPAREN (value)? RPAREN;
playerfunctionname
    : 'drawCard'
    | 'discardCard'
    | 'shuffleHand'
    | 'getHand'
    | 'getScore'
    | 'increaseScore'
    | 'decreaseScore'
    | 'getHandSize'
    ;


switchstmt
    : 'switch' LPAREN value RPAREN LCURLY casestmt+ RCURLY
    ;

casestmt
    : ('case' value | 'default')':'
    instruction*
    (BREAK CRLF)?
    ;