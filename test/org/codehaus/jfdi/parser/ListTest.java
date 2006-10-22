package org.codehaus.jfdi.parser;

import java.util.List;

import org.codehaus.jfdi.interpreter.AnonListValue;

public class ListTest extends JfdiParserTestCase {
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSimpleLiterals() throws Exception {
		JFDIParser parser = createParser( "[" +
				" \"cheese\", " +
				" 42 " +
				"]");
		
		AnonListValue anonList = parser.list();
		
		List list = (List) anonList.getValue();
		
		assertEquals( 2, list.size() );
		
		assertEquals( "cheese", list.get( 0 ) );
		
		assertEquals( new Integer( 42 ), list.get( 1 ) );
	}
	
	public void testComplexLiterals() throws Exception {
		
		JFDIParser parser = createParser( "[" +
				" \"che\" + \"ese\", " +
				" 20 + 22 " +
				"]");
		
		AnonListValue anonList = parser.list();
		
		List list = (List) anonList.getValue();
		
		assertEquals( 2, list.size() );
		
		assertEquals( "cheese", list.get( 0 ) );
		
		assertEquals( new Integer( 42 ), list.get( 1 ) );
	}
	
	public void testEmptyList() throws Exception {
		
		JFDIParser parser = createParser( "[ ]" );
		
		AnonListValue anonList = parser.list();
		
		List list = (List) anonList.getValue();
		
		assertTrue( list.isEmpty() );
		
	}
}