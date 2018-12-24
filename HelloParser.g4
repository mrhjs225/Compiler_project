/**
 * Define a grammar called Hello
 */
parser grammar HelloParser;
options {
	tokenVocab=HelloLexer;
}
prog 	: 	vtype Blank Word Obracket words Cbracket block ;
decls 	: 	decls decl 
		| ;
decl 	: 	vtype Blank words Semicolone Linechange;
words	:	words Spot Word 
  		| 	Word ;
vtype 	: 	Int | Char 
		| ;
block	:	Ombracket Linechange decls slist Cmbracket Linechange
		| ;
slist 	: 	stat+ statb;
stat 	: 	If Obracket cond Cbracket Then block Else block
		| 	While Obracket cond Cbracket block
		| 	Word Esign expr Semicolone Linechange
		|	Word Obracket words Cbracket Semicolone Linechange
		| 	Return Blank Word Semicolone Linechange;
statb 	: 	If Obracket cond Cbracket Then block Else block
		| 	While Obracket cond Cbracket block
		| 	Word Esign expr Semicolone Linechange
		|	Word Obracket words Cbracket Semicolone Linechange
		| 	Return Blank Word Semicolone Linechange
		| ;
cond 	: 	expr Iesign expr
		| 	expr Equal expr ;
expr 	: 	term
		| 	term Psign term ;	
term 	: 	fact
		|	fact Msign fact ;
fact 	: 	Num
		| 	Word ;
