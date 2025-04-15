package gamelang;

import java.util.List;

import gamelang.AST.NegExp;
import gamelang.AST.PowExp;
import gamelang.AST.UnitExp;

public class Printer {
	public void print(Value v) {
		System.out.println(v.toString());
	}
	public void print(Exception e) {
		System.out.println(e.getMessage());
	}
	
	public static class Formatter implements AST.Visitor<String> {
		
		public String visit(AST.AddExp e, Env env) {
			String result = "(+ ";
			for(AST.Exp exp : e.all()) 
				result += exp.accept(this, env) + " ";
			return result + ")";
		}
		
		public String visit(AST.NumExp e, Env env) {
			return "" + e.v();
		}
		
		@Override
		public String visit(UnitExp e, Env env) {
			return "unit";
		}

		public String visit(AST.DivExp e, Env env) {
			String result = "(/ ";
			for(AST.Exp exp : e.all()) 
				result += exp.accept(this, env) + " ";
			return result + ")";
		}
		
		public String visit(AST.MultExp e, Env env) {
			String result = "(* ";
			for(AST.Exp exp : e.all()) 
				result += exp.accept(this, env) + " ";
			return result + ")";
		}
		
		public String visit(AST.Program p, Env env) {
			return "" + p.e().accept(this, env);
		}
		
		public String visit(AST.SubExp e, Env env) {
			String result = "(- ";
			for(AST.Exp exp : e.all()) 
				result += exp.accept(this, env) + " ";
			return result + ")";
		}
		
		public String visit(PowExp e, Env env) {
			String result = "(^";
			for(AST.Exp exp : e.all()) 
				result += " " + exp.accept(this, env);
			return result + ")";
		}

		public String visit(NegExp e, Env env) {
			String result = "(-";
			result += " " + e.getExp().accept(this, env);
			return result + ")";
		}

		public String visit(AST.VarExp e, Env env) {
			return "" + e.name();
		}
		
		
		public String visit(AST.DefineDecl d, Env env) {
			String result = "(define ";
			result += d.name() + " ";
			result += d.value_exp().accept(this, env);
			return result + ")";
		}

		@Override
		public String visit(AST.PrintExp e, Env env) {
			StringBuilder sb = new StringBuilder();
			sb.append("(PRINT");
			for (AST.Exp part : e.getParts()) {
				sb.append(" ").append(part.accept(this, env));
			}
			sb.append(")");
			return sb.toString();
		}


		public String visit(AST.StrLitExp e, Env env) {
            return e.value(); // Just return the string literal value
        }


        public String visit(AST.RollExp e, Env env) {
            return "Roll"; // Or something like: String.valueOf((int)(Math.random() * 6 + 1));
        }

		public String visit(AST.Order e, Env env) {
            return "Roll"; // Or something like: String.valueOf((int)(Math.random() * 6 + 1));
        }

        public String visit(AST.ExitGameExp e, Env env) {
            return "ExitGame"; // Or handle game exit behavior however you want
        }
		
	}

}
