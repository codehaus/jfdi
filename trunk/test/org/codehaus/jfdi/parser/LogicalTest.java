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
		JFDIParser parser = createParser( "test_Logical_And_Atomic.jfdi");
		
		Expr result = parser.logical_and_expr();
		assertEquals( Boolean.TRUE, result.getValue() );
	}

	public void testAnd_NoShortCircuit() throws Exception {
		JFDIParser parser = createParser( "test_Logical_And_NoShortCircuit.jfdi");
		
		Expr result = parser.logical_and_expr();
		assertEquals( Boolean.TRUE, result.getValue() );
	}
	
	public void testAnd_WithShortCircuit() throws Exception {
		JFDIParser parser = createParser( "test_Logical_And_WithShortCircuit.jfdi");
		
		Expr result = parser.logical_and_expr();
		assertEquals( Boolean.FALSE, result.getValue() );
	}

}
