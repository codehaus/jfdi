package org.codehaus.jfdi.interpreter;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
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

    /**
     * This is for creating a literal "value handler"
     */
    public ValueHandler createLiteral(int type, String val) {
        if (type == STRING) {
            return new LiteralValue(val);
        } else {
            Class cls = determineLiteralType( val );
            Object objectValue = null;
            try {
                objectValue = cls.getDeclaredConstructor( new Class[] { String.class } ).newInstance( new Object[] { val } );
            } catch ( Exception e ) {
                throw new RuntimeException( e );
            }
            return new LiteralValue( objectValue );
        }
    }

    /** 
     * A local variable requires a type of some form (class).
     */
    public ValueHandler createLocalVariable(String identifier, Class type, boolean isFinal) {
        return new LocalVariable(identifier, type, isFinal);
    }
    
    
    private Class determineLiteralType(String val) {
        
        if ( Character.getType( val.charAt( 0 ) ) == Character.DECIMAL_DIGIT_NUMBER ) {
            // we have a number

            char c = val.charAt( val.length() - 1 );
            if ( val.indexOf( '.' ) == -1 ) {
                /// we have an integral
                if ( Character.getType( c ) != Character.DECIMAL_DIGIT_NUMBER ) {
                    switch ( c ) {
                        case 'l' :
                        case 'L' :
                            return Long.class;
                            
                        case 'f' :
                        case 'F' :
                            return Float.class;
                            
                        case 'd' :
                        case 'D' :
                            return Double.class;
                            
                        default :
                            throw new IllegalArgumentException( "invalid type identifier '" + c + "' used with number [" + val + "]" );
                    }
                } else {
                    return Integer.class;
                }
            } else {
                // we have a decimal
                if ( Character.getType( c ) != Character.DECIMAL_DIGIT_NUMBER ) {
                    switch ( c ) {
                        case 'l' :
                        case 'L' :
                            throw new IllegalArgumentException( "invalid type identifier '" + c + "' used with number [" + val + "]" );
                        case 'f' :
                        case 'F' :
                            return Float.class;                            
                        case 'd' :
                        case 'D' :
                            return Double.class;
                        default :
                            throw new IllegalArgumentException( "invalid type identifier '" + c + "' used with number [" + val + "]" );
                    }
                } else {
                    return Float.class;
                }
            }
        } else {
            throw new IllegalArgumentException("Unable to work out type for literal : " + val);
        }
    }
    
    /** 
     * To be implemented by the concrete factory.
     * External variables will be provided to the parser ahead of time.
     */
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
