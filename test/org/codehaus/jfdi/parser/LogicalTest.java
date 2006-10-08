package org.codehaus.jfdi.parser;

import org.codehaus.jfdi.interpreter.operations.Expr;

public class LogicalTest extends JfdiParserTestCase {
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testAnd_Atomic() throws Exception {
		JFDIParser parser = createParser( "true" );
		
		Expr result = parser.logical_and_expr();
		assertEquals( Boolean.TRUE, result.getValue() );
	}

	public void testAnd_NoShortCircuit() throws Exception {
		JFDIParser parser = createParser( "true && false" );
		
		Expr result = parser.logical_and_expr();
		assertEquals( Boolean.FALSE, result.getValue() );
	}
	
	public void testAnd_WithShortCircuit() throws Exception {
		JFDIParser parser = createParser( "false && true" );
		
		Expr result = parser.logical_and_expr();
		assertEquals( Boolean.FALSE, result.getValue() );
	}
	
	public void testOr_NoShortCircuit() throws Exception {
		JFDIParser parser = createParser( "false || true" );
		
		Expr result = parser.logical_or_expr();
		assertEquals( Boolean.TRUE, result.getValue() );
	}
	
	public void testOr_WithShortCircuit() throws Exception {
		JFDIParser parser = createParser( "true || false" );
		
		Expr result = parser.logical_or_expr();
		assertEquals( Boolean.TRUE, result.getValue() );
	}

}
