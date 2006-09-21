package org.codehaus.jfdi.interpreter;

/**
 * This specifies a container for a variable that will be used at runtime. 
 * The runtime will call this when executing.
 */
public interface ValueHandler {
    Object getValue();
    void setValue(Object variable);
    
    boolean isLocal();
    boolean isFinal();
    boolean isLiteral();
    
    Class getType();
}
