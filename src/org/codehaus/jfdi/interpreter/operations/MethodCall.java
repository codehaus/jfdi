package org.codehaus.jfdi.interpreter.operations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.codehaus.jfdi.interpreter.MethodInvoker;
import org.codehaus.jfdi.interpreter.MethodResolver;

public class MethodCall implements Expr {

	private Expr obj;
	private String name;
	private Expr[] params;

	public MethodCall(Expr obj, String name, Expr[] params) {
		this.obj = obj;
		this.name = name;
		this.params = params;
	}

	public Object getValue() {
		Object thisObj = obj.getValue();
		Object[] paramObjs = new Object[ params.length ];
		
		for ( int i = 0 ; i < params.length ; ++i ) {
			paramObjs[i] = params[i].getValue();
		}
		
		Method method = MethodResolver.getInstance().resolveMethod( thisObj.getClass(), name, paramObjs );
		MethodInvoker invoker = new MethodInvoker(  method, false, paramObjs );
		try {
			return invoker.invoke( thisObj );
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
