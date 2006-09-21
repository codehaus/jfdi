package org.codehaus.jfdi.interpreter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This creates value handers to attach to nodes in the AST.
 * This is an abstract factory, of which there will be a Drools implementation 
 * (but could also be a stand alone one).
 * 
 * @author Michael Neale
 */
public abstract class ValueHandlerFactory
    implements
    Serializable {

    private static final long serialVersionUID = 320L;
    
    /** the type parameter is one of the following constants */
    /** Obviously if it was in quotes, its a string literal (which could be anything) */
    public static final int   STRING           = 1;
    /** Means true integer, not Javas interpretation of it */
    public static final int   INTEGRAL         = 2;

    /** Means a decimal number, which may or may not be floating */
    public static final int   DECIMAL          = 4;
    public static final int   BOOLEAN          = 16;
    public static final int   NULL             = 32;
    public static final int   MAP              = 64;
    public static final int   LIST             = 128;

    public ValueHandler createLiteral(int type, Object obj) {
        //TODO: convert type appropriately?
        return new LiteralValue(obj);
    }
    
    /** To be implemented by the concrete factory */
    public abstract ValueHandler createLocalVariable(int type, boolean isFinal, Object object);
    
    /** To be implemented byt eh concrete factory */
    public abstract ValueHandler createExternalVariable(String identifier);
   

    public static class MapValue {

        private List list;

        public MapValue() {
            list = new ArrayList();
        }

        public void add(KeyValuePair pair) {
            this.list.add( pair );
        }

        public KeyValuePair[] getKeyValuePairs() {
            return ( KeyValuePair[] ) this.list.toArray( new KeyValuePair[ this.list.size() ] );
        }
    }

    public static class KeyValuePair {
        private ValueHandler key;
        private ValueHandler value;

        public KeyValuePair(ValueHandler key,
                            ValueHandler value) {
            this.key = key;
            this.value = value;
        }

        public ValueHandler getKey() {
            return this.key;
        }

        public ValueHandler getValue() {
            return this.value;
        }                
    }

}
