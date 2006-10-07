package org.codehaus.jfdi.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jfdi.Cheese;

import junit.framework.TestCase;

public class ListValueTest extends TestCase {

    public void testList() throws Exception {
        Map externals = new HashMap();
        
        Cheese cheddar = new Cheese("cheddar", 25);
        externals.put( "cheddar",
                        cheddar );        
        
        LiteralValue literal = new LiteralValue( "literal" );        
        
        ValueHandler external = new DefaultExternalVariable( "cheddar", externals );
        
        LiteralValue literalKey = new LiteralValue( "literalKey" );
        LiteralValue literalValue = new LiteralValue( "literalValue" );
        MapValue.KeyValuePair literalPair = new MapValue.KeyValuePair( literalKey,
                                                                       literalValue );
        
        AnonMapValue mapValue = new AnonMapValue( new AnonMapValue.KeyValuePair[]{literalPair} );
        
        List listValueHandlers = new ArrayList();
        listValueHandlers.add( literal );
        listValueHandlers.add( external );
        listValueHandlers.add( mapValue );
        
        AnonListValue listValue = new AnonListValue( listValueHandlers );
        
        List values = ( List ) listValue.getValue( );
        assertEquals( "literal", values.get( 0 ) );
        assertEquals( cheddar, values.get( 1 ) );

        Map map = ( Map ) values.get( 2 );
        assertEquals( "literalValue", map.get( "literalKey" ) );                       
    }
    
    public void testNestedList() {        
        LiteralValue literal = new LiteralValue( "literal" );
        List nestedListValueHandlers = new ArrayList();
        nestedListValueHandlers.add(  literal );
        AnonListValue nestedListValue = new AnonListValue( nestedListValueHandlers );
        
        List listValueHandlers = new ArrayList();
        listValueHandlers.add(  nestedListValue );
        AnonListValue listValue = new AnonListValue( listValueHandlers );
        
        
        List list = ( List ) listValue.getValue( );
        assertEquals( 1, list.size() );
        
        List nestedList = ( List ) list.get( 0 );
        
        assertEquals( 1, nestedList.size() );
        
        assertEquals( "literal", nestedList.get( 0 ) );        
    }
}
