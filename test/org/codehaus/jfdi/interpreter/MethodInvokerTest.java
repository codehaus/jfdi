package org.codehaus.jfdi.interpreter;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

public class MethodInvokerTest extends TestCase {

    public void testMethodCall() throws Exception {
        Map context = new HashMap();
        context.put( "a1",
                     "v1" );

        context.put( "foo",
                     TestVariable.class );

        DefaultExternalVariable variableHandler = new DefaultExternalVariable( "a1",
                                                                               context );

        LiteralValue literal = new LiteralValue( new Integer( 5 ) );

        List listHandlers = new ArrayList();
        listHandlers.add( new LiteralValue( "l1" ) );
        listHandlers.add( new LiteralValue( "l2" ) );
        listHandlers.add( new LiteralValue( "l3" ) );

        AnonListValue listValue = new AnonListValue( listHandlers );

        ValueHandler[] params = new ValueHandler[]{variableHandler, literal, listValue};

        Method method = MethodResolver.getInstance().resolveMethod( TestVariable.class,
                                                                    "helloWorld1",
                                                                    params );
        assertNotNull( method );
        
		Object[] paramObjs = new Object[ params.length ];
		
		for ( int i = 0 ; i < params.length ; ++i ) {
			paramObjs[i] = params[i].getValue();
		}

        MethodInvoker invoker = new MethodInvoker( method,
                                                   true,
                                                   paramObjs );
        
        TestVariable instance = new TestVariable();
        instance.setObject( "string" );
        
        assertEquals( "v15l1l2l3string",
                      invoker.invoke( instance ) );
    }
    
    public void testFunctionCall() throws Exception {
        Map context = new HashMap();
        context.put( "a1",
                     "v1" );

        context.put( "foo",
                     TestVariable.class );

        DefaultExternalVariable variableHandler = new DefaultExternalVariable( "a1",
                                                                               context );

        LiteralValue literal = new LiteralValue( new Integer( 5 ) );

        List listHandlers = new ArrayList();
        listHandlers.add( new LiteralValue( "l1" ) );
        listHandlers.add( new LiteralValue( "l2" ) );
        listHandlers.add( new LiteralValue( "l3" ) );

        AnonListValue listValue = new AnonListValue( listHandlers );

        ValueHandler[] params = new ValueHandler[]{variableHandler, literal, listValue};

        Method method = MethodResolver.getInstance().resolveMethod( TestVariable.class,
                                                                    "helloWorld2",
                                                                    params );
        assertNotNull( method );
        
        Object[] paramObjs = new Object[ params.length ];
		
		for ( int i = 0 ; i < params.length ; ++i ) {
			paramObjs[i] = params[i].getValue();
		}

        MethodInvoker invoker = new MethodInvoker( method,
                                                   true,
                                                   paramObjs );

        assertEquals( "v15l1l2l3",
                      invoker.invoke( null ) );
    }
}
