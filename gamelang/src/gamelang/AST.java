package gamelang;

import java.util.ArrayList;
import java.util.List;

import gamelang.AST.ASTNode;
import gamelang.AST.CompoundArithExp;
import gamelang.AST.DefineDecl;
import gamelang.AST.Exp;

/**
 * This class hierarchy represents expressions in the abstract syntax tree
 * manipulated by this interpreter.
 * 
 * @author hridesh
 * 
 */
public interface AST {
	public static abstract class ASTNode implements AST {
		public abstract <T> T accept(Visitor<T> visitor, Env env);
	}
	public static class Program extends ASTNode {
		List<DefineDecl> _decls;
		Exp _e;

		public Program(List<DefineDecl>decls, Exp e) {
			_decls = decls;
			_e = e;
		}

		public Exp e() {
			return _e;
		}
		
		public List<DefineDecl> decls() {
			return _decls;
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}
	public static abstract class Exp extends ASTNode {

	}

	public static class VarExp extends Exp {
		String _name;

		public VarExp(String name) {
			_name = name;
		}

		public String name() {
			return _name;
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class NumExp extends Exp {
		double _val;

		public NumExp(double v) {
			_val = v;
		}

		public double v() {
			return _val;
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}
	
	public static class UnitExp extends Exp {
		
		public UnitExp() {}

		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}

	}

	public static abstract class CompoundArithExp extends Exp {
		List<Exp> _rest;

		public CompoundArithExp() {
			_rest = new ArrayList<Exp>();
		}

		public CompoundArithExp(Exp fst) {
			_rest = new ArrayList<Exp>();
			_rest.add(fst);
		}

		public CompoundArithExp(List<Exp> args) {
			_rest = new ArrayList<Exp>();
			for (Exp e : args)
				_rest.add((Exp) e);
		}

		public CompoundArithExp(Exp fst, List<Exp> rest) {
			_rest = new ArrayList<Exp>();
			_rest.add(fst);
			_rest.addAll(rest);
		}

		public CompoundArithExp(Exp fst, Exp second) {
			_rest = new ArrayList<Exp>();
			_rest.add(fst);
			_rest.add(second);
		}

		public Exp fst() {
			return _rest.get(0);
		}

		public Exp snd() {
			return _rest.get(1);
		}

		public List<Exp> all() {
			return _rest;
		}

		public void add(Exp e) {
			_rest.add(e);
		}
		
	}

	public static class AddExp extends CompoundArithExp {
		public AddExp(Exp fst) {
			super(fst);
		}

		public AddExp(List<Exp> args) {
			super(args);
		}

		public AddExp(Exp fst, List<Exp> rest) {
			super(fst, rest);
		}

		public AddExp(Exp left, Exp right) {
			super(left, right);
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class SubExp extends CompoundArithExp {

		public SubExp(Exp fst) {
			super(fst);
		}

		public SubExp(List<Exp> args) {
			super(args);
		}

		public SubExp(Exp fst, List<Exp> rest) {
			super(fst, rest);
		}

		public SubExp(Exp left, Exp right) {
			super(left, right);
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class DivExp extends CompoundArithExp {
		public DivExp(Exp fst) {
			super(fst);
		}

		public DivExp(List<Exp> args) {
			super(args);
		}

		public DivExp(Exp fst, List<Exp> rest) {
			super(fst, rest);
		}

		public DivExp(Exp left, Exp right) {
			super(left, right);
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class MultExp extends CompoundArithExp {
		public MultExp(Exp fst) {
			super(fst);
		}

		public MultExp(List<Exp> args) {
			super(args);
		}

		public MultExp(Exp fst, List<Exp> rest) {
			super(fst, rest);
		}

		public MultExp(Exp left, Exp right) {
			super(left, right);
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class PowExp extends CompoundArithExp {
		public PowExp(Exp fst) {
			super(fst);
		}

		public PowExp(List<Exp> args) {
			super(args);
		}

		public PowExp(Exp fst, List<Exp> rest) {
			super(fst, rest);
		}

		public PowExp(Exp left, Exp right) {
			super(left, right);
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class NegExp extends Exp {
		private Exp e;

		public NegExp(Exp e) {
			this.e = e;
		}

		public Exp getExp() {
			return e;
		}

		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}


	
	/**
	 * A define declaration has the syntax 
	 * 
	 *  (define name expression)
	 *  
	 * @author hridesh
	 *
	 */
	public static class DefineDecl extends Exp {
		String _name;
		Exp _value_exp; 
		
		public DefineDecl(String name, Exp value_exp) {
			_name = name;
			_value_exp = value_exp;
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
		
		public String name() { return _name; }
		
		public Exp value_exp() { return _value_exp; }

	}

	public static class PrintExp extends Exp {
		private final List<Exp> parts;
	
		public PrintExp(List<Exp> parts) {
			this.parts = parts;
		}
	
		public List<Exp> getParts() {
			return parts;
		}
	
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class StrLitExp extends Exp {
		private final String value;
	
		public StrLitExp(String value) {
			this.value = value;
		}
	
		public String value() {
			return value;
		}
	
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}
	
	public static class RollExp extends Exp {
		public RollExp() {}
	
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}
	
	public static class ExitGameExp extends Exp {
		public ExitGameExp() {}
	
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	    public static class Order extends Exp {
        public Order() {}
    
        public <T> T accept(Visitor<T> visitor, Env env) {
            return visitor.visit(this, env);
        }
    }

	public static class IfExp extends Exp {
		private final Exp condition;
		private final Exp thenBranch;
	
		public IfExp(Exp condition, Exp thenBranch) {
			this.condition = condition;
			this.thenBranch = thenBranch;
		}
	
		public Exp condition() {
			return condition;
		}
	
		public Exp thenBranch() {
			return thenBranch;
		}
	
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class CompareExp extends Exp {
		private final Exp left, right;
		private final String op;
	
		public CompareExp(Exp left, Exp right, String op) {
			this.left = left;
			this.right = right;
			this.op = op;
		}
	
		public Exp left() { return left; }
		public Exp right() { return right; }
		public String op() { return op; }
	
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public interface Visitor <T> {
		// This interface should contain a signature for each concrete AST node.
		public T visit(AST.AddExp e, Env env);
		public T visit(AST.NumExp e, Env env);
		public T visit(AST.UnitExp e, Env env);
		public T visit(AST.DivExp e, Env env);
		public T visit(AST.MultExp e, Env env);
		public T visit(AST.Program p, Env env);
		public T visit(AST.PowExp p, Env env);
		public T visit(AST.NegExp e, Env env);
		public T visit(AST.SubExp e, Env env);
		public T visit(AST.VarExp e, Env env);
		public T visit(AST.DefineDecl d, Env env); // New for the gamelang
		public T visit(AST.PrintExp e, Env env); // New for the gamelang
		public T visit(AST.StrLitExp e, Env env);
		public T visit(AST.RollExp e, Env env);
		public T visit(AST.ExitGameExp e, Env env);
		public T visit(AST.Order e, Env env);
		public T visit(AST.IfExp e, Env env);
		public T visit(AST.CompareExp e, Env env);
	}	
}

// b = 5
// x = 2+3*2