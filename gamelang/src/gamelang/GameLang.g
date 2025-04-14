grammar GameLang;

// We are redefining programs to be zero or more define declarations 
// followed by an optional expression.
program returns [Program ast]        
    locals [ArrayList<DefineDecl> defs, Exp expr]
    @init { $defs = new ArrayList<DefineDecl>(); $expr = new UnitExp(); } :
    (def=definedecl { $defs.add($def.ast); })* (e=exp { $expr = $e.ast; })? 
    { $ast = new Program($defs, $expr); }
;

// New declaration for global definitions.
definedecl returns [DefineDecl ast] :
    id=Identifier '=' e=exp
    { $ast = new DefineDecl($id.text, $e.ast); }
    ;
 
 exp returns [Exp ast]:
        '(' e=exp ')' { $ast = $e.ast; } 
		| v=varexp { $ast = $v.ast; }
		| n=numexp { $ast = $n.ast; }
        | a=addexp { $ast = $a.ast; }
        | s=subexp { $ast = $s.ast; }
        | m=multexp { $ast = $m.ast; }
        | d=divexp { $ast = $d.ast; }
        | l=letexp { $ast = $l.ast; }
		| neg=negexp { $ast = $neg.ast; }
		| in=infixaddsubt { $ast = $in.ast;}
		| inm=infixmuldiv { $ast = $inm.ast;}
		| inp = infixpower {$ast = $inp.ast;}
        ;

 numexp returns [NumExp ast]:
 		n0=Number { $ast = new NumExp(Integer.parseInt($n0.text)); } 
  		| '-' n0=Number { $ast = new NumExp(-Integer.parseInt($n0.text)); }
  		| n0=Number Dot n1=Number { $ast = new NumExp(Double.parseDouble($n0.text+"."+$n1.text)); }
  		| '-' n0=Number Dot n1=Number { $ast = new NumExp(Double.parseDouble("-" + $n0.text+"."+$n1.text)); }
  		;		

 addexp returns [AddExp ast]
        locals [ArrayList<Exp> list]
 		@init { $list = new ArrayList<Exp>(); } :
 		'(' '+'
 		    e=exp { $list.add($e.ast); } 
 		    ( e=exp { $list.add($e.ast); } )+
 		')' { $ast = new AddExp($list); }
 		;

 subexp returns [SubExp ast]  
        locals [ArrayList<Exp> list]
 		@init { $list = new ArrayList<Exp>(); } :
 		'(' '-'
 		    e=exp { $list.add($e.ast); } 
 		    ( e=exp { $list.add($e.ast); } )+ 
 		')' { $ast = new SubExp($list); }
 		;

 multexp returns [MultExp ast] 
        locals [ArrayList<Exp> list]
 		@init { $list = new ArrayList<Exp>(); } :
 		'(' '*'
 		    e=exp { $list.add($e.ast); } 
 		    ( e=exp { $list.add($e.ast); } )+ 
 		')' { $ast = new MultExp($list); }
 		;
 
 divexp returns [DivExp ast] 
        locals [ArrayList<Exp> list]
 		@init { $list = new ArrayList<Exp>(); } :
 		'(' '/'
 		    e=exp { $list.add($e.ast); } 
 		    ( e=exp { $list.add($e.ast); } )+ 
 		')' { $ast = new DivExp($list); }
 		;

 negexp returns [NegExp ast]:
		'(' '-' e=exp ')' { $ast=new NegExp($e.ast); }
		;
// COPIED FROM INFIX
infixaddsubt returns [Exp ast]
    @init { $ast = null; ArrayList<Exp> list = new ArrayList<Exp>(); }
    :
    l=infixmuldiv { $ast = $l.ast; }
    (('+' r=infixmuldiv { 
                          list = new ArrayList<Exp>();
                          list.add($ast);
                          list.add($r.ast);
                          $ast = new AddExp(list);
                        })
    | ('-' r=infixmuldiv { 
                          list = new ArrayList<Exp>();
                          list.add($ast);
                          list.add($r.ast);
                          $ast = new SubExp(list);
                        })
    )*
    ;

// Multiplication and Division - Higher Precedence than Addition
infixmuldiv returns [Exp ast]
    @init { $ast = null; ArrayList<Exp> list = new ArrayList<Exp>(); }
    :
    l=infixpower { $ast = $l.ast; } 
    (('*' r=infixpower { 
                     list = new ArrayList<Exp>();
                     list.add($ast);
                     list.add($r.ast);
                     $ast = new MultExp(list);
                   }) 
    | ('/' r=infixpower { 
                     list = new ArrayList<Exp>();
                     list.add($ast);
                     list.add($r.ast);
                     $ast = new DivExp(list);
                   })
    )*
    ;

// Exponentiation - Highest Precedence and Right-Associative
infixpower returns [Exp ast]
    :
    l=varexp { $ast = $l.ast; }
    ('^' exponent=infixpower {  // Right-associative exponentiation
                          ArrayList<Exp> list = new ArrayList<Exp>();
                          list.add($ast);
                          list.add($exponent.ast);
                          $ast = new PowExp(list);
                        }
    )*
    ;

// COPIED FROM INFIX
varexp returns [Exp ast] : 
    id=Identifier { $ast = new VarExp($id.text); }          // Variable case (like `a`, `b`)
    | n=numexp { $ast = $n.ast; }                            // Numeric case (like `3`, `-5`)
    ;

 letexp  returns [LetExp ast] 
        locals [ArrayList<String> names, ArrayList<Exp> value_exps]
 		@init { $names = new ArrayList<String>(); $value_exps = new ArrayList<Exp>(); } :
 		'(' Let 
 			'(' ( '(' id=Identifier e=exp ')' { $names.add($id.text); $value_exps.add($e.ast); } )+  ')'
 			body=exp 
 			')' { $ast = new LetExp($names, $value_exps, $body.ast); }
 		;

 // Lexical Specification of this Programming Language
 //  - lexical specification rules start with uppercase
 
 Define : 'define' ;
 Let : 'let' ;
 Dot : '.' ;

 Number : DIGIT+ ;

 Identifier :   Letter LetterOrDigit*;

 Letter :   [a-zA-Z$_]
	|   ~[\u0000-\u00FF\uD800-\uDBFF] 
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|   [\uD800-\uDBFF] [\uDC00-\uDFFF] 
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}? ;

 LetterOrDigit: [a-zA-Z0-9$_]
	|   ~[\u0000-\u00FF\uD800-\uDBFF] 
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|    [\uD800-\uDBFF] [\uDC00-\uDFFF] 
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?;

 fragment DIGIT: ('0'..'9');

 AT : '@';
 ELLIPSIS : '...';
 WS  :  [ \t\r\n\u000C]+ -> skip;
 Comment :   '/*' .*? '*/' -> skip;
 Line_Comment :   '//' ~[\r\n]* -> skip;
 