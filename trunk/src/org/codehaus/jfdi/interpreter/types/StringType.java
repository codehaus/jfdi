package org.codehaus.jfdi.interpreter.types;

import org.codehaus.jfdi.SymbolTable;

public class StringType extends Type {
	
	private String value;

	public StringType(String value) {
		this.value = value;
	}

	public Object evaluate(SymbolTable symbolTable) {
		return  value;
	}

}
