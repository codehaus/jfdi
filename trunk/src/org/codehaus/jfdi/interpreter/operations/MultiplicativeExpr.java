package org.codehaus.jfdi.interpreter.operations;

import org.codehaus.jfdi.SymbolTable;

public class MultiplicativeExpr extends Expr {
	
	private Expr lhs;
	private Expr rhs;

	public MultiplicativeExpr(Expr lhs, Expr rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	public Object evaluate(SymbolTable symbolTable) {
		return null;
	}

}
