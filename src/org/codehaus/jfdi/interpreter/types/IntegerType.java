package org.codehaus.jfdi.interpreter.types;

import org.codehaus.jfdi.SymbolTable;


public class IntegerType extends Type {
	
	private Integer value;

	public IntegerType(Integer value) {
		this.value = value;
	}

	public Object evaluate(SymbolTable symbolTable) {
		return value;
	}

}
