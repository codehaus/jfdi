package org.codehaus.jfdi.interpreter;

import java.util.HashMap;
import java.util.Map;

public class DefaultValueHandlerFactory extends AbstractValueHandlerFactory {
    public Map variables = new HashMap();

    public DefaultValueHandlerFactory(TypeResolver typeResolver) {
        super( typeResolver );
    }

    public void addVariable(String identifier,
                            Object instance) {
        this.variables.put( identifier,
                            instance );
    }

    public void removeVariable(String identifier) {
        this.variables.remove( identifier );
    }

    public ValueHandler createExternalVariable(String identifier) {
        VariableValueHandler handler = new DefaultExternalVariable( identifier,
                                                                    this.variables );
        return handler;
    }

}
