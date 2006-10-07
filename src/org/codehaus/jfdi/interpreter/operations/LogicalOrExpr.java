package org.codehaus.jfdi.interpreter.operations;

import org.codehaus.jfdi.SymbolTable;

public class LogicalOrExpr implements Expr {
	
	private Expr lhs;
	private Expr rhs;

	public LogicalOrExpr(Expr lhs, Expr rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	public Object evaluate(SymbolTable symbolTable) {
		return null;
	}

}
