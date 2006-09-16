package org.codehaus.jfdi.interpreter.operations;

import org.codehaus.jfdi.SymbolTable;

public abstract class Statement {
	
	public abstract void execute(SymbolTable symbolTable);

}
