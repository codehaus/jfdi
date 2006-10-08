package org.codehaus.jfdi.interpreter;

public class Coercion {
	
	public static boolean toBoolean(Object obj) {
		if ( obj instanceof Boolean ) {
			return ((Boolean)obj).booleanValue();
		}
		
		throw new CoercionException( obj, "boolean" );
	}
	
	public static int toInteger(Object obj) {
		if ( obj instanceof Number ) {
			return ((Number)obj).intValue();
		}
		throw new CoercionException( obj, "integer" );
	}
	
	public static double toFloat(Object obj) {
		if ( obj instanceof Number ) {
			return ((Number)obj).doubleValue();
		}
		throw new CoercionException( obj, "floating-point" );
	}
}
	
