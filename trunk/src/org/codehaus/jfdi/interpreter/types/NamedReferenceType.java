package org.codehaus.jfdi.interpreter.types;

import org.codehaus.jfdi.SymbolTable;


public class NamedReferenceType extends Type {
	
	private String name;

	public NamedReferenceType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public Object evaluate(SymbolTable symbolTable) {
		return symbolTable.get( name );
	}

}
