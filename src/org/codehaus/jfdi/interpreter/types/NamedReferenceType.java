package org.codehaus.jfdi.interpreter.types;


public class NamedReferenceType implements Type {
	
	private String name;

	public NamedReferenceType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
