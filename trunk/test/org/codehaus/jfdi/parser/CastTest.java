package org.codehaus.jfdi.parser;

import org.codehaus.jfdi.interpreter.operations.Expr;

public class CastTest extends JfdiParserTestCase {
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testCast() throws Exception {
		addVariable( "foo", "BobMcWhirter" );
		JFDIParser parser = createParser( "(Object) foo.substring(1,3)" );
		
		Expr expr = (Expr) parser.expr();
		
		System.err.println( "---" );
		System.err.println( expr );
		System.err.println( "---" );
		assertEquals( "ob", expr.getValue() );
		assertEquals( Object.class, expr.getType() );
	}

}
