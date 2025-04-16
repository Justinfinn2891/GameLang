package gamelang;
import gamelang.AST.AddExp;
import gamelang.AST.BlockExp;
import gamelang.AST.CompareExp;
import gamelang.AST.DefineDecl;
import gamelang.AST.DivExp;
import gamelang.AST.ExitGameExp;
import gamelang.AST.Exp;
import gamelang.AST.IfExp;
import gamelang.AST.MultExp;
import gamelang.AST.NegExp;
import gamelang.AST.NumExp;
import gamelang.AST.Order;
import gamelang.AST.PowExp;
import gamelang.AST.PrintExp;
import gamelang.AST.Program;
import gamelang.AST.RollExp;
import gamelang.AST.StrLitExp;
import gamelang.AST.SubExp;
import gamelang.AST.UnitExp;
import gamelang.AST.VarExp;
import gamelang.AST.Visitor;
import gamelang.AST.WhileExp;
import gamelang.Env.GlobalEnv;
import gamelang.Value.NumVal;
import gamelang.Value.StrVal;
import gamelang.Value.UnitVal;
import java.util.List;

public class Evaluator implements Visitor<Value> {
	
	Env initEnv = new GlobalEnv(); //New for gamelang
	
	Value valueOf(Program p) {
		return (Value) p.accept(this, initEnv);
	}
	
	@Override
	public Value visit(AddExp e, Env env) {
		List<Exp> operands = e.all();
		double result = 0;
		for(Exp exp: operands) {
			NumVal intermediate = (NumVal) exp.accept(this, env); // Dynamic type-checking
			result += intermediate.v(); //Semantics of AddExp in terms of the target language.
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(NumExp e, Env env) {
		return new NumVal(e.v());
	}

	@Override
	public Value visit(UnitExp e, Env env) {
		return new UnitVal();
	}

	@Override
	public Value visit(DivExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v(); 
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = result / rVal.v();
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(MultExp e, Env env) {
		List<Exp> operands = e.all();
		double result = 1;
		for(Exp exp: operands) {
			NumVal intermediate = (NumVal) exp.accept(this, env); // Dynamic type-checking
			result *= intermediate.v(); //Semantics of MultExp.
		}
		return new NumVal(result);
	}
	@Override
	public Value visit(PowExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v();
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = Math.pow(result, rVal.v());
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(NegExp e, Env env) {
		NumVal rVal = (NumVal) e.getExp().accept(this, env);
		return new NumVal(-rVal.v());
	}

	@Override
	public Value visit(Program p, Env env) {
		for(DefineDecl d: p.decls())
			d.accept(this, initEnv);
		return (Value) p.e().accept(this, initEnv);
	}

	@Override
	public Value visit(SubExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v();
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = result - rVal.v();
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(VarExp e, Env env) {
		Value value = env.get(e.name());
		if (value == null) {
			throw new RuntimeException("Variable " + e.name() + " is not initialized.");
		}
		return value;
	}
	
	
	@Override
	public Value visit(DefineDecl d, Env env) { // New for gamelang.
		String name = d.name();
		Exp value_exp = d.value_exp();
		Value value = (Value) value_exp.accept(this, env);
		((GlobalEnv) initEnv).extend(name, value);
		return new Value.UnitVal();		
	}	
	@Override
	public Value visit(PrintExp e, Env env) {
		StringBuilder sb = new StringBuilder();
		for (Exp part : e.getParts()) {
			Value val = part.accept(this, env);
			// If value is null, print "null", else print the value
			if (val == null) {
				sb.append("null");
			} else {
				sb.append(val.toString());
			}
		}
	
		// Log the value we are printing (optional)
		System.out.println("PRINT: " + sb.toString());
	
		return new UnitVal();  // Do not print "unit" or any value.
	}
	
	@Override
	public Value visit(StrLitExp e, Env env) {
	return new StrVal(e.value());
	}

	@Override
	public Value visit(RollExp e, Env env) {
	int result = 1 + (int)(Math.random() * 6); // Generates a value from 1 to 6
	return new Value.NumVal(result);
	}

	@Override
	public Value visit(ExitGameExp e, Env env) {	
	System.out.println("Exiting game. Goodbye!");
	System.exit(0);
	return null; // this line is never reached, but needed for return type
	}

	
	@Override
public Value visit(IfExp e, Env env) {
    // Evaluate the condition
    Value condVal = e.condition().accept(this, env);
    
    // Log the value of the condition
    System.out.println("Condition value: " + condVal);

    // Ensure condition is a numeric value
    if (!(condVal instanceof NumVal)) {
        throw new RuntimeException("Condition must be a number (treated as boolean)");
    }

    double cond = ((NumVal) condVal).v();

    // Log whether the condition is true or false
    System.out.println("Condition evaluated to: " + cond);

    // If condition is true (non-zero), execute the 'thenBranch' block
    if (cond != 0) {
        System.out.println("Executing thenBranch...");
        e.thenBranch().accept(this, env);
    } else {
        System.out.println("Condition is false, skipping thenBranch.");
    }

    // Ensure program flow continues after the `if` block
    System.out.println("Flow continues after if statement.");
    
    return new UnitVal();  // Ensures program flow continues normally
}
	@Override
public Value visit(WhileExp e, Env env) {
    while (true) {
        // Evaluate the condition
        Value condVal = e.condition().accept(this, env);

        if (!(condVal instanceof NumVal)) {
            throw new RuntimeException("Condition must be a number (treated as boolean)");
        }

        // Get the condition value
        double cond = ((NumVal) condVal).v();
        
        // If condition is 0 (false), break the loop
        if (cond == 0) {
            break;
        }

        // Evaluate the body of the loop
        // This will loop through multiple expressions if grouped with brackets
        e.body().accept(this, env);  // Here, the body can now be a block with multiple statements
    }

    return null; // Return Unit value to signify no meaningful return
}
	@Override
	public Value visit(CompareExp e, Env env) {
	double l = ((NumVal) e.left().accept(this, env)).v();
	double r = ((NumVal) e.right().accept(this, env)).v();
	boolean result;

	switch (e.op()) {
		case ">": result = l > r; break;
		case "<": result = l < r; break;
		case ">=": result = l >= r; break;
		case "<=": result = l <= r; break;
		case "==": result = l == r; break;
		case "!=": result = l != r; break;
		default: throw new RuntimeException("Unknown operator: " + e.op());
	}

		return new Value.NumVal(result ? 1 : 0); // return 1 for true, 0 for false
	}

	@Override
	public Value visit(BlockExp e, Env env) {
		Value result = new UnitVal();
		for (Exp exp : e.getExpressions()) {
			System.out.println("Evaluating block expression: " + exp.getClass().getSimpleName());
			result = exp.accept(this, env);
		}
		return result;
	}


	@Override
	public Value visit(Order e, Env env) {	
		String[] crawlText = {
            "A long time ago in a galaxy far, far away....",
            "",
            "Episode III",
            "Revenge of the Sith",
            "",
			"War!",
			"The Republic is crumbling under attack by the ruthless Sith Lord, Darth Sidious.",
			"There are heroes on both sides.",
			"Evil is everywhere.",
			"In a stunning move, the ruthless Sith Lord Darth Sidious has secretly ordered the Jedi to be exterminated.",
			"With the help of his new apprentice, Count Dooku, the Jedi rescue a kidnapped senator from the clutches of the evil Sith Lord, Darth Sidious.",
			"As the Clone Wars reach their height, the Jedi rescue the Senator and uncover a sinister plot to control the galaxy...",
			"-----------------------------------------------",
			"-----------------------------------------------",
			"-----------------------------------------------"
        };

		String[] diaText = {
			"It's over Anakin, I have the high ground! -Obi-Wan",
			"You underestimate my power! -Anakin",
			"Don't try it -Obi-Wan.",
			"**Anakin jumps**",
			"**Obi-Wan cuts off Anakin's legs and left arm**",
			"You were the chosen one! It was said that you would destroy the Sith, not join them! Bring balance to the Force, not leave it in darkness! -Obi-Wan",
			"I HATE YOU! -Anakin!",
			"You were my brother Anakin! I loved you! -Obi-Wan"
		};

		

		for (int i = 0; i < 10; i++) {
			System.out.println();
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
		
		for (String line : crawlText) {
			System.out.println(line);
			try {
				Thread.sleep(400);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}

		for (String line : diaText) {
			System.out.println(line);
			try {
				Thread.sleep(800);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}

	





	return null; // this line is never reached, but needed for return type
	}

}
