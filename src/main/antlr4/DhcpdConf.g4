grammar DhcpdConf;

@header {
package edu.aast.cndc.dhcpd.antlr;
}

/* =======================
   Parser rules
   ======================= */

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
  | emptyStmt
  ;
  
emptyStmt
  : SEMI
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

/* =======================
   REQUIRED parser wrappers
   ======================= */

identifier
  : IDENT
  | INCLUDE
  | SUBNET
  | POOL
  | HOST
  | GROUP
  | SHARED_NETWORK
  | CLASS
  | SUBCLASS
  | ZONE
  | KEY
  ;
  
stringLiteral
  : STRING
  ;

ipAddress
  : IPV4
  ;

number
  : NUMBER
  ;

rangeLiteral
  : IPV4 IPV4
  ;

/* =======================
   Lexer rules
   ======================= */

/* Keywords */
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

/* Symbols */
LBRACE : '{';
RBRACE : '}';
SEMI   : ';';
COMMA  : ',';
COLON  : ':';
SLASH  : '/';

/* Operators */
OP
  : '=' | '==' | '!=' | '<' | '>' | '<=' | '>='
  | 'and' | 'or' | 'not'
  ;

/* FIX: ignore dash-only separator lines */
DASH_LINE
  : '-' '-' '-' '-' '-' '-'* -> skip
  ;

/* Literals */
STRING
  : '"' ( '\\' . | ~["\\] )* '"'
  ;

IPV4
  : DIGIT+ '.' DIGIT+ '.' DIGIT+ '.' DIGIT+
  ;

NUMBER
  : DIGIT+
  ;

/* Identifiers (ISC DHCP style) */
IDENT
  : [-a-zA-Z_][a-zA-Z0-9_\\-\\.]*
  ;

/* MAC address */
MAC
  : HEX HEX ':' HEX HEX ':' HEX HEX ':' HEX HEX ':' HEX HEX ':' HEX HEX
  ;

/* Comments & whitespace */
LINE_COMMENT
  : '#' ~[\r\n]* -> skip
  ;

BLOCK_COMMENT
  : '/*' .*? '*/' -> skip
  ;

WS
  : [ \t\r\n]+ -> skip
  ;

/* Fragments */
fragment DIGIT : [0-9];
fragment HEX   : [0-9a-fA-F];
