
/** 

 */
grammar YAPL;

/*------------------------------------------------------------------
* REGLAS DEL LEXER - Definicion de Tokens
*------------------------------------------------------------------*/
// LETTER: [a-zA-Z] ; 
// DIGIT: [0-9] ; 
fragment LETTER: ('A'..'Z' | 'a' .. 'z') ; 
fragment DIGIT: '0' .. '9' ; 

ID : LETTER (LETTER | DIGIT)* ; // match IDentifiers 
NUM : DIGIT (DIGIT)* ; // match integers 
CHAR : LETTER ; 

// Parametros para evitar errores en espacios en blanco y comentarios
COMMENTS: '//' ~('\r' | '\n')*  -> channel(HIDDEN);
COMMENT : '/*' .*? '*/'         -> skip;
WS: [ \t\r\n\f]+                -> channel(HIDDEN);


/*------------------------------------------------------------------
* REGLAS DEL PARSER - definicion de funciones, tipos y mas
*------------------------------------------------------------------*/
program             : 'class' 'CBarrios' '{' (declaration)* '}' ;

declaration         : structDeclaration
                    | varDeclaration
                    | methodDeclaration
                    ;

varDeclaration      : varType ID ';' | varType ID '[' NUM ']' ';' ;

structDeclaration   : 'struct' ID '{' (varDeclaration)* '}' ;

varType             : 'int'
                    | 'char'
                    | 'boolean'
                    | 'struct' ID
                    | structDeclaration
                    | 'void'
                    ;

methodDeclaration   :  methodType ID '(' (parameter (',')? )* ')' block ;
methodType          : 'int'
                    | 'char'
                    | 'boolean'
                    | 'void'
                    ;

parameter           : parameterType ID
                    | parameterType ID '[' ']'
                    ;

parameterType       : 'int'
                    | 'char'
                    | 'boolean'
                    ;

block               : '{' (varDeclaration)* (statement)* '}' ;

statement           : 'if' '(' expression ')' block ('else' block)?
                    | 'while' '(' expression ')' block
                    | 'return' (expression)? ';'
                    | methodCall ';'
                    | block
                    | location '=' expression
                    | (expression)? ';'
                    ;

location            : (ID | ID '[' expression ']') ( '.' location )? ;
expression          : location
                    | methodCall
                    | literal
                    | expression op expression
                    | '-' expression
                    | '!' expression
                    | '(' expression ')'
                    ;

methodCall          : ID '(' (arg (',')?)* ')' ;
arg                 : expression ;
op                  : arith_op | rel_op | eq_op | cond_op ;

arith_op            : '+' | '-' | '*' | '/' | '%' ;
rel_op              : '<' | '>' | '<=' | '>=' ;
eq_op               : '==' | '!=' ;
cond_op             : '&&' | '||' ;
literal             : int_literal | char_literal | bool_literal ;
int_literal         : NUM ;
char_literal        : '"' CHAR '"' | '\'' CHAR '\'';
bool_literal        : 'true' | 'false' ;