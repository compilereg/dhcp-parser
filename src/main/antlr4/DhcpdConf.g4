grammar DhcpdConf;
@header {
package edu.aast.cndc.dhcpd.antlr;
}
config
  : element* EOF
  ;

element
  : statement
  | block
  ;

statement
  : includeStmt
  | simpleStmt
  ;

includeStmt
  : INCLUDE stringLiteral SEMI
  ;

simpleStmt
  : stmtHead stmtBody? SEMI
  ;

stmtHead
  : identifier
  ;

stmtBody
  : stmtItem+
  ;

stmtItem
  : identifier
  | ipAddress
  | number
  | stringLiteral
  | rangeLiteral
  | MAC
  | OP
  | COMMA
  | COLON
  | SLASH
  ;

block
  : blockHead blockParams? LBRACE element* RBRACE
  ;

blockHead
  : SUBNET
  | POOL
  | HOST
  | GROUP
  | SHARED_NETWORK
  | CLASS
  | SUBCLASS
  | ZONE
  | KEY
  | identifier
  ;

blockParams
  : stmtItem+
  ;

INCLUDE        : 'include';
SUBNET         : 'subnet';
POOL           : 'pool';
HOST           : 'host';
GROUP          : 'group';
SHARED_NETWORK : 'shared-network';
CLASS          : 'class';
SUBCLASS       : 'subclass';
ZONE           : 'zone';
KEY            : 'key';

LBRACE : '{';
RBRACE : '}';
SEMI   : ';';
COMMA  : ',';
COLON  : ':';
SLASH  : '/';

OP
  : '=' | '==' | '!=' | '<' | '>' | '<=' | '>='
  | 'and' | 'or' | 'not'
  ;

stringLiteral
  : STRING
  ;

identifier
  : IDENT
  ;

ipAddress
  : IPV4
  ;

rangeLiteral
  : IPV4 IPV4
  ;

MAC
  : HEX HEX ':' HEX HEX ':' HEX HEX ':' HEX HEX ':' HEX HEX ':' HEX HEX
  ;

number
  : NUMBER
  ;

STRING
  : '"' ( '\\' . | ~["\\] )* '"'
  ;

IPV4
  : DIGIT+ '.' DIGIT+ '.' DIGIT+ '.' DIGIT+
  ;

IDENT
  : [a-zA-Z_][a-zA-Z0-9_\\-\\.]*
  ;

NUMBER
  : DIGIT+
  ;

fragment DIGIT : [0-9];
fragment HEX   : [0-9a-fA-F];

LINE_COMMENT
  : '#' ~[\r\n]* -> skip
  ;

BLOCK_COMMENT
  : '/*' .*? '*/' -> skip
  ;

WS
  : [ \t\r\n]+ -> skip
  ;
