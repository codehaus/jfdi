/**
 * 
 */
package org.codehaus.jfdi.interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnonListValue
    implements
    ValueHandler {
    
    private static final long serialVersionUID = 320L;

    private final List list;
    
    private Object cachedValue = null;

    public AnonListValue(final List list) {
        this.list = list;
    }

    public Object getValue() {
        if ( this.cachedValue == null ) {        
            final List resolvedList = new ArrayList( this.list.size() );
    
            for ( final Iterator it = this.list.iterator(); it.hasNext(); ) {
                resolvedList.add( ((ValueHandler) it.next()).getValue( ) );
            }
            
            this.cachedValue = resolvedList;
        }
        return this.cachedValue;
    }
    
    public Class getExtractToClass() {
        return List.class;
    }    
    
    public void reset() {
        this.cachedValue = null;
    }
    
    public String toString() {
        return "[ListValue list=" + this.list + "]";
    }

    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + this.list.hashCode();
        return result;
    }

    public boolean equals(Object object) {
        if ( this == object ) {
            return true;
        }
        
        if ( object == null || getClass() != object.getClass()) {
            return false;
        }
        
        final AnonListValue other = (AnonListValue) object;
        return this.list.equals( other.list );
    }


    public Class getType() {        
        return List.class;
    }

    public boolean isFinal() {
        return true;
    }

    public boolean isLiteral() {
        return false;
    }

    public boolean isLocal() {
        return false;
    }

    public void setValue(Object variable) {
        throw new UnsupportedOperationException("Not allowed to set the value of a list.");
    }
      
}