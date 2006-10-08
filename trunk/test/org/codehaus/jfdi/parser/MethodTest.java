package org.codehaus.jfdi.parser;

import org.codehaus.jfdi.interpreter.operations.Expr;

public class MethodTest extends JfdiParserTestCase {
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testMethodNoParams() throws Exception {
		addVariable( "foo", "BobMcWhirter" );
		JFDIParser parser = createParser( "foo.length()" );
		
		Expr expr = (Expr) parser.atom();
		
		assertEquals( 12, ((Integer)expr.getValue()).intValue() );
	}
	

}
