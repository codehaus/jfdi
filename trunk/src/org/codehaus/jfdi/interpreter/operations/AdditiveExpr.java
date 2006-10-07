package org.codehaus.jfdi.interpreter.operations;

public class AdditiveExpr implements Expr {
	
	public static class Operator { }
	public static final Operator PLUS = new Operator();
	public static final Operator MINUS = new Operator();
	
	private Expr lhs;
	private Expr rhs;
	private Operator op;

	public AdditiveExpr(Expr lhs, Expr rhs, Operator op) {
		this.lhs = lhs;
		this.rhs = rhs;
		this.op  = op;
	}

	public Object getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
