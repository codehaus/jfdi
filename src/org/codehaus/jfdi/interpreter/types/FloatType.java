package org.codehaus.jfdi.interpreter.types;

import org.codehaus.jfdi.SymbolTable;

public class FloatType extends Type {
	
	private Double value;
	
	public FloatType(Double value) {
		this.value = value;
	}

	public Object evaluate(SymbolTable symbolTable) {
		return value;
	}

}
