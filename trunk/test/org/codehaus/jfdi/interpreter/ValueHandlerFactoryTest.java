package org.codehaus.jfdi.interpreter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jfdi.Cheese;

import junit.framework.TestCase;

public class ValueHandlerFactoryTest extends TestCase {
    DefaultValueHandlerFactory factory;
    ClassTypeResolver typeResolver;
    
    public void setUp() {
        List list = new ArrayList();
        list.add( "org.codehaus.jfdi.Cheese" );
        this.typeResolver = new ClassTypeResolver( list );
        this.factory =  new DefaultValueHandlerFactory( typeResolver );        
    }
    
    public void testIntegerLiteral(){
        ValueHandler literal =factory.createLiteral( Integer.class, "2" );
        assertEquals(  new Integer( "2" ),
                       literal.getValue() );
    }
    
    public void testLongLiteral(){
        ValueHandler literal =factory.createLiteral( Long.class, "2" );
        assertEquals(  new Long( "2" ),
                       literal.getValue() );
    }    
    
    public void testFloatLiteral(){
        ValueHandler literal =factory.createLiteral( Float.class, "2" );
        assertEquals(  new Float( "2" ),
                       literal.getValue() );
    }
    
    public void testDoubleLiteral(){
        ValueHandler literal =factory.createLiteral( Double.class, "2" );
        assertEquals(  new Double( "2" ),
                       literal.getValue() );
    }  
    
    public void testBigDecimalLiteral(){
        ValueHandler literal =factory.createLiteral( BigDecimal.class, "2" );
        assertEquals(  new BigDecimal( "2" ),
                       literal.getValue() );
    }      
    
    public void testBigIntegerLiteral(){
        ValueHandler literal =factory.createLiteral( BigInteger.class, "2" );
        assertEquals(  new BigInteger( "2" ),
                       literal.getValue() );
    }    
    
    public void testLocalVariable() {
        ValueHandler valueHandler = factory.createLocalVariable( "brie", "Cheese", true );
        
        Cheese brie = new Cheese("brie", 45);
        
        valueHandler.setValue( brie );
        
        assertSame( brie, valueHandler.getValue() );                        
    }
    
    public void testExternalVariable() {      
        Cheese stilton = new Cheese("stilton", 45);
        factory.addVariable( "stilton", stilton );
        ValueHandler valueHandler = factory.createExternalVariable( "stilton" );        
        
        assertSame( stilton, valueHandler.getValue() );    
        
        // External variables are final
        try  {
            valueHandler.setValue( new  Cheese( "goude", 90) );
            fail( "Default External variables are final, you should not be able to set their values" );
        } catch ( Exception e) {
            
        }
        
        assertTrue(this.factory.isValidVariable( "stilton" ));
        assertFalse(this.factory.isValidVariable( "pornstar" ));
    }    
}
