package gamelang;
import static gamelang.AST.*;
import static gamelang.Value.*;

import java.util.List;
import java.util.ArrayList;

import gamelang.AST.AddExp;
import gamelang.AST.DefineDecl;
import gamelang.AST.DivExp;
import gamelang.AST.Exp;
import gamelang.AST.MultExp;
import gamelang.AST.NegExp;
import gamelang.AST.NumExp;
import gamelang.AST.PowExp;
import gamelang.AST.PrintExp;
import gamelang.AST.Program;
import gamelang.AST.RollExp;
import gamelang.AST.StrLitExp;
import gamelang.AST.SubExp;
import gamelang.AST.UnitExp;
import gamelang.AST.VarExp;
import gamelang.AST.Visitor;
import gamelang.Env.*;
import gamelang.Value.NumVal;
import gamelang.Value.StrVal;
import gamelang.Value.UnitVal;

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
		// Previously, all variables had value 42. New semantics.
		return env.get(e.name());
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
		sb.append(val.toString());
	}
	System.out.println(sb.toString());
	return new UnitVal();
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

}
