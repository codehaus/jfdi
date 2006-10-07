package org.codehaus.jfdi.interpreter;

public class Coercion {
	
	public static boolean toBoolean(Object obj) {
		if ( obj instanceof Boolean ) {
			return ((Boolean)obj).booleanValue();
		}
		
		throw new CoercionException( obj, "boolean" );
	}

}
