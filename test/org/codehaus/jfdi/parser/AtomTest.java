package org.codehaus.jfdi.parser;

public class AtomTest extends JfdiParserTestCase {
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testInteger() throws Exception {
		JFDIParser parser = createParser( "test_Atom_Integer.jfdi" );
		
		Integer result = (Integer) parser.atom();
		
		assertEquals( 442, result.intValue() );
	}
	

}
