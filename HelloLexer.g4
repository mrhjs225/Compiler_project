/**
 * Define a grammar called Hello
 */
lexer grammar HelloLexer;

If: 'if';
Then: 'then';
Else: 'else';
While: 'while';
Return: 'return';
Int: 'int';
Char: 'char';
Obracket:  '(';
Cbracket:  ')';
Semicolone: ';';
Spot: ',';
Ombracket: '{';
Cmbracket: '}';
Esign: '=';
Iesign: '>';
Equal: '==';
Psign: '+';
Msign: '*';
Linechange: '\r\n';
Blank: ' ';
Word: ([a-z] | [A-Z])+;
Num:	[0-9]+;