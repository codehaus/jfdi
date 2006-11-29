package org.codehaus.jfdi.parser;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jfdi.Cheese;
import org.codehaus.jfdi.interpreter.AnonListValue;
import org.codehaus.jfdi.interpreter.operations.Expr;

/**
 * This is a pretty important test suite, as in OO pretty much everything is
 * methods. Some of these may be broken out into an higher level test suite,
 * but, whatever.
 */
public class MethodTest extends JfdiParserTestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMethodNoParams() throws Exception {
		addVariable("foo", "BobMcWhirter");
		JFDIParser parser = createParser("foo.length()");

		Expr expr = (Expr) parser.atom();

		assertEquals(12, ((Integer) expr.getValue()).intValue());
	}

	public void testMethodWithParams() throws Exception {
		addVariable("foo", "BobMcWhirter");
		JFDIParser parser = createParser("foo.substring(1,3)");

		Expr expr = (Expr) parser.atom();

		assertEquals("ob", expr.getValue());
	}

	public void testMethodChained() throws Exception {
		addVariable("foo", "BobMcWhirter");
		JFDIParser parser = createParser("foo.substring(1,3).length()");

		Expr expr = (Expr) parser.atom();

		assertEquals(2, ((Integer) expr.getValue()).intValue());
	}

	public void testMethodNested() throws Exception {
		addVariable("foo", "BobMcWhirter");
		JFDIParser parser = createParser("foo.substring(1,foo.length()-1)");

		Expr expr = (Expr) parser.atom();

		assertEquals("obMcWhirte", expr.getValue());
	}

	public void testCheesePrice() throws Exception {
		Cheese cheese = new Cheese("stilton", 42);

		JFDIParser parser = createParser("c.getPrice()");
		addVariable("c", cheese);
		Expr expr = (Expr) parser.atom();

		assertEquals(new Integer(42), expr.getValue());
	}

	public void testCheesePriceAdditionExpression() throws Exception {
		Cheese cheese = new Cheese("stilton", 42);

		JFDIParser parser = createParser("c.getPrice() + 42");
		addVariable("c", cheese);
		Expr expr = (Expr) parser.expr();

		assertEquals(new Integer(84), expr.getValue());
	}

	public void testInlineArraySimple() throws Exception {
		JFDIParser parser = createParser( "[\"a\", \"b\"]" );
		
		AnonListValue listValue = (AnonListValue) parser.list();
		
		List list = (List) listValue.getValue();
		
		assertEquals( 2, list.size() );
		assertEquals( "a", list.get( 0 ) );
		assertEquals( "b", list.get( 1 ) );
	}

	public void testInlineArray() throws Exception {
		Cheese cheese = new Cheese("stilton", 42);

		addVariable("c", cheese);
		JFDIParser parser = createParser("c.someList( [\"a\",\"b\"] )");
		Expr expr = (Expr) parser.object_expr();

		System.err.println("A");

		expr.getValue();
		System.err.println("B");

		assertEquals("a", cheese.getSomeList().get( 0 ) );
		System.err.println("C");
		assertEquals("b", cheese.getSomeList().get( 1 ) );
		System.err.println("D");
	}

	public void testInlineMap() throws Exception {
		Cheese cheese = new Cheese("stilton", 42);

		JFDIParser parser = createParser("c.someMap( {'a' => 42,'b' => 84} )");
		addVariable("c", cheese);
		Expr expr = (Expr) parser.atom();

		expr.getValue();

		Map m = cheese.getSomeMap();

		assertEquals(new Integer(42), m.get("a"));
		assertEquals(new Integer(84), m.get("b"));

	}

	/**
	 * This should work as property notation should work
	 * 
	 * @throws Exception
	 */
	public void testCheesePriceProperty() throws Exception {
		Cheese cheese = new Cheese("stilton", 42);

		JFDIParser parser = createParser("c.price");
		addVariable("c", cheese);
		Expr expr = (Expr) parser.expr();

		assertEquals(new Integer(42), expr.getValue());
	}

	public void testCheeseNested() throws Exception {
		Cheese cheese = new Cheese("stilton", 42);

		JFDIParser parser = createParser("c.getMouse().getName()");
		addVariable("c", cheese);
		Expr expr = (Expr) parser.atom();

		assertEquals("mickey", expr.getValue());
	}

	public void testCheeseNestedProperty() throws Exception {
		Cheese cheese = new Cheese("stilton", 42);

		JFDIParser parser = createParser("c.mouse.name");
		addVariable("c", cheese);
		Expr expr = (Expr) parser.atom();

		assertEquals("mickey", expr.getValue());
	}

	public void testCheeseMethodWithArg() throws Exception {
		Cheese cheese = new Cheese("stilton", 42);

		JFDIParser parser = createParser("c.someMethod(\"blah\").getName()");
		addVariable("c", cheese);
		Expr expr = (Expr) parser.atom();

		assertEquals("mickey", expr.getValue());
		assertEquals("blah", cheese.getParam());
	}

	public void testCheeseMethodWithArgSingleQuotes() throws Exception {
		Cheese cheese = new Cheese("stilton", 42);

		JFDIParser parser = createParser("c.someMethod('blah').getName()");
		addVariable("c", cheese);
		Expr expr = (Expr) parser.atom();

		assertEquals("mickey", expr.getValue());
		assertEquals("blah", cheese.getParam());
	}

	public void testCheeseReturnMouse() throws Exception {
		Cheese cheese = new Cheese("stilton", 42);

		JFDIParser parser = createParser("c.someMethod(\"blah\")");
		addVariable("c", cheese);
		Expr expr = (Expr) parser.atom();

		assertEquals(cheese.getMouse(), expr.getValue());
		assertEquals("blah", cheese.getParam());
	}

	/**
	 * Would like to have ruby style optional brackets for method invocation
	 * (not nesting or anything fancy)
	 * 
	 * BOB: nope, not this week.
	 * 
	 * @throws Exception
	 */
	public void testOptionalBrackets() throws Exception {
        fail("Bob is slacking, will get around to this eventually...");
		Cheese cheese = new Cheese("stilton", 42);

		JFDIParser parser = createParser("c.someMethod \"blah\", 42");
		addVariable("c", cheese);
		Expr expr = (Expr) parser.atom();

		assertEquals(cheese.getMouse(), expr.getValue());

	}

	/**
	 * This shows the "cool setter" stuff.
	 */
	public void testPropertySetter() throws Exception {
		Cheese cheese = new Cheese("stilton", 42);

		JFDIParser parser = createParser("c.price = 52");
		addVariable("c", cheese);
		Expr expr = (Expr) parser.atom();
		expr.getValue();

		assertEquals(52, cheese.getPrice());
	}

	/**
	 * This shows the other "cool setter" stuff.
	 */
	public void testCoolSetter() throws Exception {
		Cheese cheese = new Cheese("stilton", 42);

		JFDIParser parser = createParser("c(price = 52, type = 'cheddar')");
		addVariable("c", cheese);
		Expr expr = (Expr) parser.atom();

		expr.getValue();

		assertEquals(52, cheese.getPrice());
		assertEquals("cheddar", cheese.getType());
	}

	/**
	 * This test an expression that involves a big decimal (could also be in a
	 * method call, but I thought I would do it as an expression).
	 * 
	 * This can use BigDecimalOverloader (and the OperatorOverloader interface).
	 * 
	 */
	public void testCheesePriceBigDecimal() throws Exception {
		Cheese cheese = new Cheese("stilton", 42);

		JFDIParser parser = createParser("c.getBigDecimal() + 42.00");
		addVariable("c", cheese);
		Expr expr = (Expr) parser.expr();

		assertEquals(new BigDecimal("84.42"), expr.getValue());
	}
    
    /**
     * We want double equals to use equals() like in groovy. No one cares about
     * instance equals in the rules world, OO is dead man. 
     */
    public void testEquality() throws Exception {
        Cheese cheese1 = new Cheese("stilton", 42);
        Cheese cheese2 = new Cheese("stilton", 42);
       
        
        assertTrue(cheese1.equals( cheese2 ));
        assertFalse(cheese1 == cheese2);
        
        JFDIParser parser = createParser("c1 == c2");
        addVariable("c1", cheese1);
        addVariable("c2", cheese2);
        Expr expr = (Expr) parser.expr();       
        
        assertEquals(new Boolean(true), expr.getValue());
        
    }
    
    /**
     * We want double equals to use equals() like in groovy. No one cares about
     * instance equals in the rules world, OO is dead man. 
     */
    public void testInEquality() throws Exception {
        Cheese cheese1 = new Cheese("stilton", 42);
        Cheese cheese2 = new Cheese("stilton", 43);
        
        assertFalse(cheese1.equals( cheese2 ));
        
        JFDIParser parser = createParser("c1 == c2");
        addVariable("c1", cheese1);
        addVariable("c2", cheese2);
        Expr expr = (Expr) parser.expr();       
        
        assertEquals(new Boolean(false), expr.getValue());
    }    
    
    /**
     * We want double equals to use equals() like in groovy. No one cares about
     * instance equals in the rules world, OO is dead man. 
     */
    public void testNotEquals() throws Exception {
        Cheese cheese1 = new Cheese("stilton", 42);
        Cheese cheese2 = new Cheese("stilton", 43);
       
        
        assertFalse(cheese1.equals( cheese2 ));
       
        
        JFDIParser parser = createParser("c1 != c2");
        addVariable("c1", cheese1);
        addVariable("c2", cheese2);
        Expr expr = (Expr) parser.expr();       
        
        assertEquals(new Boolean(true), expr.getValue());
        
    }    

    public void testArrayAccess() throws Exception {
        Cheese cheese1 = new Cheese("stilton", 42);
        Cheese cheese2 = new Cheese("stilton", 43);
       
        Cheese[] arr = new Cheese[2];
        arr[0] = cheese1;
        arr[1] = cheese2;
       
        
        
        JFDIParser parser = createParser("c[1]");
        addVariable("c", arr);
        
        Expr expr = (Expr) parser.expr();       
        
        assertEquals(cheese2, expr.getValue());
        
    }
    
    public void testMapAccess() throws Exception {
        Cheese cheese1 = new Cheese("stilton", 42);
        Cheese cheese2 = new Cheese("stilton", 43);
        
        Map m = new HashMap();
        m.put( "boo", cheese1 );
        m.put( "ya", cheese2 );
        JFDIParser parser = createParser("c['boo']");
        addVariable( "c", m );

        Expr expr = (Expr) parser.expr();       
        
        assertEquals(cheese1, expr.getValue());

        
    }
    

}
