package org.codehaus.jfdi.interpreter.operations;

import org.codehaus.jfdi.SymbolTable;

public class MultiplicativeExpr implements Expr {
	
	public static class Operator { }
	public static final Operator MULT = new Operator();
	public static final Operator DIV = new Operator();
	
	private Expr lhs;
	private Expr rhs;
	private Object op;

	public MultiplicativeExpr(Expr lhs, Expr rhs, Operator op) {
		this.lhs = lhs;
		this.rhs = rhs;
		this.op = op;
	}

	public Object getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
