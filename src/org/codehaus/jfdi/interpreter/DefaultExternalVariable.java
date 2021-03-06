package org.codehaus.jfdi.interpreter;

import java.util.Map;

public class DefaultExternalVariable
    implements
    VariableValueHandler {
    
	private DefaultValueHandlerFactory factory;
      
    private String identifer;
    private Class type;
    
    public DefaultExternalVariable(String identifier,
    							   DefaultValueHandlerFactory factory) {
        this.identifer = identifier;
        this.factory = factory;
    }
    
    public String getIdentifier() {
        return this.identifer;
    }

    public Class getType() {
        return getValue().getClass();
    }

    public Object getValue() {
        return this.factory.get( this.identifer );
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

    public void setValue(Object value) {
        throw new UnsupportedOperationException( "External Variable identifer='" + this.identifer + "' type='" + this.type + "' is final, it cannot be set" );
    }

}
