package org.codehaus.jfdi.parser;

import org.codehaus.jfdi.interpreter.ValueHandler;

public class AtomTest extends JfdiParserTestCase {
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testInteger() throws Exception {
		JFDIParser parser = createParser( "test_Atom_Integer.jfdi" );
		
		ValueHandler result = (ValueHandler) parser.atom();
		
		assertEquals( 442, ((Integer)result.getValue()).intValue() );
	}
	
	public void testFloat() throws Exception {
		JFDIParser parser = createParser( "test_Atom_Float.jfdi" );
		
		ValueHandler result = (ValueHandler) parser.atom();
		
		assertEquals( 442.42, ((Double)result.getValue()).doubleValue(), 0.05 );
	}
	
	public void testString() throws Exception {
		JFDIParser parser = createParser( "test_Atom_String.jfdi" );
		
		ValueHandler result = (ValueHandler) parser.atom();
		
		assertEquals( "442.42", result.getValue() );
	}
	
	public void testBooleanTrue() throws Exception {
		JFDIParser parser = createParser( "test_Atom_BooleanTrue.jfdi" );
		
		ValueHandler result = (ValueHandler) parser.atom();
		
		assertEquals( Boolean.TRUE, result.getValue() );
	}
	
	public void testVariable() throws Exception {
		addVariable( "foo", new Integer(42) );
		JFDIParser parser = createParser( "foo" );
		
		ValueHandler result = (ValueHandler) parser.atom();
		
		assertEquals( 42, ((Integer)result.getValue()).intValue() );
	}
	

}
