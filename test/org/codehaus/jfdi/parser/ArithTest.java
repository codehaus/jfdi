package org.codehaus.jfdi.parser;

import org.codehaus.jfdi.interpreter.operations.Expr;

public class ArithTest extends JfdiParserTestCase {
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testAdd_Integers() throws Exception {
		JFDIParser parser = createParser( "4+8" );
		
		Expr result = parser.additive_expr();
		assertEquals( 12, ((Integer)result.getValue()).intValue() );
	}
	
	public void testAdd_Floats() throws Exception {
		JFDIParser parser = createParser( "4.2+8.2" );
		
		Expr result = parser.additive_expr();
		assertEquals( 12.4, ((Double)result.getValue()).doubleValue(),0.05 );
	}
	
	public void testAdd_Mixed() throws Exception {
		JFDIParser parser = createParser( "4.2+8" );
		
		Expr result = parser.additive_expr();
		assertEquals( 12, ((Integer)result.getValue()).intValue() );
	}
	
	public void testSubtract_Integers() throws Exception {
		JFDIParser parser = createParser( "4-8" );
		
		Expr result = parser.additive_expr();
		assertEquals( -4, ((Integer)result.getValue()).intValue() );
	}
	
	public void testSubtract_Floats() throws Exception {
		JFDIParser parser = createParser( "4.2-8.8" );
		
		Expr result = parser.additive_expr();
		assertEquals( -4.6, ((Double)result.getValue()).doubleValue(),0.05 );
	}
	
	public void testSubtract_Mixed() throws Exception {
		JFDIParser parser = createParser( "4.2-8" );
		
		Expr result = parser.additive_expr();
		assertEquals( -4, ((Integer)result.getValue()).intValue() );
	}
	

	public void testMult_Integers() throws Exception {
		JFDIParser parser = createParser( "4*8" );
		
		Expr result = parser.additive_expr();
		assertEquals( 32, ((Integer)result.getValue()).intValue() );
	}
	
	public void testMult_Floats() throws Exception {
		JFDIParser parser = createParser( "4.2*8.8" );
		
		Expr result = parser.additive_expr();
		assertEquals( 36.96, ((Double)result.getValue()).doubleValue(),0.05 );
	}
	
	public void testMult_Mixed() throws Exception {
		JFDIParser parser = createParser( "4.2*8" );
		
		Expr result = parser.additive_expr();
		assertEquals( 32, ((Integer)result.getValue()).intValue() );
	}
	
	
	public void testDiv_Integers() throws Exception {
		JFDIParser parser = createParser( "32/8" );
		
		Expr result = parser.additive_expr();
		assertEquals( 4, ((Integer)result.getValue()).intValue() );
	}
	
	public void testDiv_Floats() throws Exception {
		JFDIParser parser = createParser( "34.2/8.8" );
		
		Expr result = parser.additive_expr();
		assertEquals( 3.88, ((Double)result.getValue()).doubleValue(),0.05 );
	}
	
	public void testDiv_Mixed() throws Exception {
		JFDIParser parser = createParser( "32.2/8" );
		
		Expr result = parser.additive_expr();
		assertEquals( 4, ((Integer)result.getValue()).intValue() );
	}	
	
	
	
}