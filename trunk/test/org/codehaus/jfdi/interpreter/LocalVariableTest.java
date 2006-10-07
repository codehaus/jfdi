package org.codehaus.jfdi.interpreter;
import org.codehaus.jfdi.Cheese;

import junit.framework.TestCase;

public class LocalVariableTest extends TestCase {
    public void testLocalVariable() throws Exception {
        LocalVariable local = new LocalVariable( "brie",
                                                 Cheese.class,
                                                 true );
        local.setValue( new Cheese("brie", 55) );
        
        assertEquals( new Cheese("brie", 55), local.getValue() );
   }
    
}
