package org.codehaus.jfdi.interpreter.operations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;

import org.codehaus.jfdi.interpreter.Coercion;

public class CollectionIndexExpr implements Expr {
	
	private Expr lhs;
	private Expr index;

	public CollectionIndexExpr(Expr lhs, Expr index) {
		this.lhs = lhs;
		this.index = index;
	}

	public Object getValue() {
		Object lhsObj = lhs.getValue();
		Object indexObj = index.getValue();
		
		if ( lhsObj instanceof Map ) {
			return ((Map)lhsObj).get( indexObj );
		} 
		
		if ( lhsObj instanceof List ) {
			return ((List)lhsObj).get( Coercion.toInteger( indexObj ) );
		}
		
		if ( lhsObj.getClass().isArray() ) {
			return ((Object[])lhsObj)[ Coercion.toInteger( indexObj ) ];
		}
		
		Method[] methods = lhsObj.getClass().getMethods();
		
		for ( int i = 0 ; i < methods.length ; ++i ) {
			if ( methods[i].getName() == "get" ) {
				if ( methods[i].getParameterTypes().length == 1 ) {
					int modifiers = methods[i].getModifiers();
					if ( Modifier.isPublic( modifiers ) && ! Modifier.isStatic( modifiers ) ) {
						if ( methods[i].getParameterTypes()[0].isAssignableFrom( indexObj.getClass() ) ) {
							try {
								return methods[i].invoke( lhsObj, new Object[]{ indexObj } );
							} catch (IllegalArgumentException e) {
								// ignore
							} catch (IllegalAccessException e) {
								// ignore
							} catch (InvocationTargetException e) {
								// ignore
							}
						}
					}
				}
			}
		}
		
		throw new RuntimeException( "Unable to index " + lhsObj + " using " + indexObj );
	}
	
	public Class getType() {
		return Object.class;
	}

}
