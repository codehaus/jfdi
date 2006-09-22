package org.codehaus.jfdi.interpreter;

import org.codehaus.jfdi.Cheese;

import junit.framework.TestCase;

public class LiteralValueTest extends TestCase {
    public void testLiteral() throws Exception {        
        LiteralValue literal = new LiteralValue( new Integer( 5 ) );
        
        try {
            literal.setValue( "var" );
            fail( "cannot set a literal" );
        } catch( Exception e ) {
            
        }

        assertEquals( new Integer( 5 ),
                     literal.getValue() );
    }
}
