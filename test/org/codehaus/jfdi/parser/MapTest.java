package org.codehaus.jfdi.parser;

import org.codehaus.jfdi.interpreter.AnonMapValue;

public class MapTest extends JfdiParserTestCase {
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSimpleLiterals() throws Exception {
		JFDIParser parser = createParser( "{ \"cheese\" => \"cheddar\" }");
		
		AnonMapValue map = parser.map();
		
		System.err.println( map );
	}

}
