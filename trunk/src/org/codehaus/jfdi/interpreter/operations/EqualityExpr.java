package org.codehaus.jfdi.interpreter.operations;

public class EqualityExpr implements Expr {
	
	public static class Operator { 
		private String str;
		public Operator(String str) {
			this.str = str;
		}
		
		public String toString() {
			return str;
		}
	}
	
	public static final Operator IS_EQUAL              = new Operator( "==" );
	public static final Operator IS_NOT_EQUAL          = new Operator( "!=" );
	public static final Operator IS_LESS_THAN          = new Operator( "<" );
	public static final Operator IS_LESS_THAN_EQUAL    = new Operator( "<=" );
	public static final Operator IS_GREATER_THAN       = new Operator( ">" );
	public static final Operator IS_GREATER_THAN_EQUAL = new Operator( ">=" );
	
	private Expr lhs;
	private Expr rhs;
	private Object op;

	public EqualityExpr(Expr lhs, Expr rhs, Operator op) {
		this.lhs = lhs;
		this.rhs = rhs;
		this.op = op;
	}

	public Object getValue() {
		Object lhsObj = lhs.getValue();
		Object rhsObj = rhs.getValue();
		
		if ( lhsObj == null || rhsObj == null ) {
			throw new NullPointerException();
		}
		
		if ( op == IS_EQUAL ) {
			return ( lhsObj.equals( rhsObj ) ? Boolean.TRUE : Boolean.FALSE );
		} else if ( op == IS_NOT_EQUAL ) {
			return ( lhsObj.equals( rhsObj ) ? Boolean.FALSE : Boolean.TRUE );
		} else if ( lhsObj instanceof Comparable && rhsObj instanceof Comparable ) {
			Comparable lhsCmp = (Comparable) lhsObj;
			Comparable rhsCmp = (Comparable) rhsObj;
			if ( op == IS_LESS_THAN ) {
				return ( lhsCmp.compareTo( rhsCmp ) < 0 ? Boolean.TRUE : Boolean.FALSE );
			} else if ( op == IS_LESS_THAN_EQUAL ) {
				return ( lhsCmp.compareTo( rhsCmp ) <= 0 ? Boolean.TRUE : Boolean.FALSE );
			} else if ( op == IS_GREATER_THAN ) {
				return ( lhsCmp.compareTo( rhsCmp ) > 0 ? Boolean.TRUE : Boolean.FALSE );
			} else if ( op == IS_GREATER_THAN_EQUAL ) {
				return ( lhsCmp.compareTo( rhsCmp ) >= 0 ? Boolean.TRUE : Boolean.FALSE );
			}
		} else {
			throw new RuntimeException( "Boolean inequality operator only supported for Comparable" );
		}
		
		throw new RuntimeException( "Invalid boolean operator: " + op );
	}
	
	public Class getType() {
		return Boolean.class;
	}
	

}
