package org.codehaus.jfdi.interpreter.operations;

import org.codehaus.jfdi.SymbolTable;

public class AdditiveExpr extends Expr {
	
	private Expr lhs;
	private Expr rhs;

	public AdditiveExpr(Expr lhs, Expr rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	public Object evaluate(SymbolTable symbolTable) {
		return null;
	}

}
