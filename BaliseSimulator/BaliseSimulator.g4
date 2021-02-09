grammar  BaliseSimulator;


script : command *;

command : call | assign;
call : ID '.' ID '('arg*')' ';';
assign: ID '=' value ';';
arg : ID ':' value ',';
value: NB|SYMBOL;

NB : [0-9]+ ;
ID : [a-zA-Z][a-zA-Z0-9]* ;
SYMBOL : '#' ID;
