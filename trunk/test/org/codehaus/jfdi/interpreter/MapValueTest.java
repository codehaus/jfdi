package org.codehaus.jfdi.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jfdi.Cheese;

import junit.framework.TestCase;

public class MapValueTest extends TestCase {
    public void testFlatMap() throws Exception {
        Map externals = new HashMap();

        Cheese externalCheddar = new Cheese( "cheddar",
                                     25 );
        externals.put( "cheddar",
                       externalCheddar );

        // Make a literal key/value pair
        LiteralValue literalKey = new LiteralValue( "literalKey1" );
        LiteralValue literalValue = new LiteralValue( "literalValue" );
        MapValue.KeyValuePair literalPair = new MapValue.KeyValuePair( literalKey,
                                                                       literalValue );

        // Make a local/literal key/value pair
        Cheese localBrie = new Cheese( "brie",
                                       55 );
        LocalVariable local = new LocalVariable( "brie",
                                                 Cheese.class,
                                                 true );
        local.setValue( localBrie );
        MapValue.KeyValuePair localLiteralPair = new MapValue.KeyValuePair( local,
                                                                            literalValue );

        // Make a literal/local key/value pair
        LiteralValue literalKey2 = new LiteralValue( "literalKey2" );
        MapValue.KeyValuePair literalLocalPair = new MapValue.KeyValuePair( literalKey2,
                                                                            local );

        // Make a external/local key/value pair
        ValueHandler external = new DefaultExternalVariable( "cheddar",
                                                                    externals );
        MapValue.KeyValuePair externalLocalPair = new MapValue.KeyValuePair( external,
                                                                             local );

        // Make a literal/external key/value pair
        LiteralValue literalKey3 = new LiteralValue( "literalKey3" );
        MapValue.KeyValuePair LiteraExternalPair = new MapValue.KeyValuePair( literalKey3,
                                                                              external );
        
        // Make a literal/list key/value pair
        LiteralValue literalKey4 = new LiteralValue( "literalKey4" );
        List listValueHandlers = new ArrayList();
        listValueHandlers.add(  new LiteralValue( "listValue" ) );
        AnonListValue listValue = new AnonListValue( listValueHandlers );        
        MapValue.KeyValuePair LiteraListPair = new MapValue.KeyValuePair( literalKey4,
                                                                          listValue );        

        AnonMapValue mapValue = new AnonMapValue( new AnonMapValue.KeyValuePair[]{literalPair, localLiteralPair, literalLocalPair, externalLocalPair, LiteraExternalPair, LiteraListPair} );

        Map map = (Map) mapValue.getValue();
        assertEquals( "literalValue",
                      map.get( "literalKey1" ) );
        assertEquals( "literalValue",
                      map.get( localBrie ) );
        assertEquals( localBrie,
                      map.get( "literalKey2" ) );
        assertEquals( localBrie,
                      map.get( externalCheddar ) );
        assertEquals( externalCheddar,
                      map.get( "literalKey3" ) );
        List list = ( List ) map.get( "literalKey4" );
        assertEquals( "listValue", list.get( 0 ) );
        
    }

        public void testNestedMap() {
    
            // Make a literal key/value pair
            LiteralValue literalKey1 = new LiteralValue( "literalKey1" );
            LiteralValue literalValue1 = new LiteralValue( "literalValue1" );
            MapValue.KeyValuePair literalPair = new MapValue.KeyValuePair( literalKey1,
                                                                           literalValue1 );
            AnonMapValue nestedMapValue = new AnonMapValue( new AnonMapValue.KeyValuePair[]{literalPair} );
    
            LiteralValue literalKey2 = new LiteralValue( "literalKey2" );
            MapValue.KeyValuePair nestedMapPair = new MapValue.KeyValuePair( literalKey2,
                                                                             nestedMapValue );
    
            AnonMapValue mapValue = new AnonMapValue( new AnonMapValue.KeyValuePair[]{nestedMapPair} );
    
            Map map = (Map) mapValue.getValue( );
    
            Map nestedMap = (Map) map.get( "literalKey2" );
            assertEquals( "literalValue1",
                          nestedMap.get( "literalKey1" ) );
        }
}
