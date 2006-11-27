package org.codehaus.jfdi.interpreter;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jfdi.Cheese;

import junit.framework.TestCase;

public class DefaultExternalVariableTest extends TestCase {
    public void testDefaultExternalVariable() throws Exception {
        Cheese stilton = new Cheese( "stilton",
                                     20 );

        Map context = new HashMap();
        context.put( "stilton",
                     stilton );

        DefaultExternalVariable valueHandler = new DefaultExternalVariable( "stilton",
                                                                            context );
        assertSame( stilton,
                    valueHandler.getValue() );
    }
}
