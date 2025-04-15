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
    'STAT' id=Identifier '=' e=exp
    { $ast = new DefineDecl($id.text, $e.ast); }
    ;
 
 exp returns [Exp ast]:
        '(' e=exp ')' { $ast = $e.ast; } 
        | v=varexp { $ast = $v.ast; }
        | n=numexp { $ast = $n.ast; }
        | in=infixaddsubt { $ast = $in.ast;}
        | inm=infixmuldiv { $ast = $inm.ast;}
        | inp = infixpower { $ast = $inp.ast; }
        | p=printexp { $ast = $p.ast; }
        | r=rollexp { $ast = $r.ast; }
        ;


 numexp returns [NumExp ast]:
 		n0=Number { $ast = new NumExp(Integer.parseInt($n0.text)); } 
  		| '-' n0=Number { $ast = new NumExp(-Integer.parseInt($n0.text)); }
  		| n0=Number Dot n1=Number { $ast = new NumExp(Double.parseDouble($n0.text+"."+$n1.text)); }
  		| '-' n0=Number Dot n1=Number { $ast = new NumExp(Double.parseDouble("-" + $n0.text+"."+$n1.text)); }
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


printexp returns [Exp ast]
@init {
    List<Exp> parts = new ArrayList<Exp>();
}
    : 'PRINT'
      (
          (s=STRING {
              String raw = $s.text;
              parts.add(new StrLitExp(raw.substring(1, raw.length() - 1)));
          }
          | e=exp { parts.add($e.ast); }
          )
      )+
      {
          $ast = new PrintExp(parts);
      }
    ;

    rollexp returns [Exp ast]
    : 'ROLL' { $ast = new RollExp(); }
    ;

 // Lexical Specification of this Programming Language
 //  - lexical specification rules start with uppercase
 
 Define : 'define' ;
 Print : 'PRINT';
 Roll : 'ROLL';
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
 STRING : '"' (~["\\] | '\\' .)* '"' ;
 