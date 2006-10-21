package org.codehaus.jfdi.parser;

import java.util.Map;

import org.codehaus.jfdi.interpreter.AnonMapValue;

public class MapTest extends JfdiParserTestCase {
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSimpleLiterals() throws Exception {
		JFDIParser parser = createParser( "{" +
				" \"cheese\" => \"cheddar\", " + 
				" 42 => 84 " + 
				"}");
		
		AnonMapValue anonMap = parser.map();
		
		Map map = (Map) anonMap.getValue();
		
		assertNotNull( map );
		
		assertEquals( 2, map.size() );
		
		assertEquals( "cheddar", map.get( "cheese" ) );
		assertEquals( new Integer( 84 ), map.get( new Integer( 42 ) ) );
	}
	
	public void testComplexLiterals() throws Exception {
		JFDIParser parser = createParser( "{" +
				" \"chee\" + \"se\" => \"che\" + \"ddar\", " + 
				" 20 + 22 => 40 + 44, " + 
				"}");
		
		AnonMapValue anonMap = parser.map();
		
		Map map = (Map) anonMap.getValue();
		
		assertNotNull( map );
		
		assertEquals( 2, map.size() );
		
		assertEquals( "cheddar", map.get( "cheese" ) );
		assertEquals( new Integer( 84 ), map.get( new Integer( 42 ) ) );
	}
	
	public void testEmptyMap() throws Exception {
		JFDIParser parser = createParser( "{}" );
		
		AnonMapValue anonMap = parser.map();
		
		Map map = (Map) anonMap.getValue();
		
		assertEquals( 0, map.size() );
	}
	
	public void testTrailingComma() throws Exception {
		JFDIParser parser = createParser( "{" +
				" \"cheese\" => \"cheddar\", " + 
				" 42 => 84, " + 
				"}");
		
		AnonMapValue anonMap = parser.map();
		
		Map map = (Map) anonMap.getValue();
		
		assertNotNull( map );
		
		assertEquals( 2, map.size() );
		
		assertEquals( "cheddar", map.get( "cheese" ) );
		assertEquals( new Integer( 84 ), map.get( new Integer( 42 ) ) );
		
	}

}
