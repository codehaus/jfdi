package org.codehaus.jfdi.interpreter.operations;

import org.codehaus.jfdi.SymbolTable;

public abstract class Expr extends Statement {
	
	public abstract Object evaluate(SymbolTable symbolTable);

	public void execute(SymbolTable symbolTable) {
		evaluate( symbolTable );
	}
	

}
