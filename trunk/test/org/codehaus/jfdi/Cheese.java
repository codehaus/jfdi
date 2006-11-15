package org.codehaus.jfdi;

/*
 * Copyright 2005 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.math.BigDecimal;

public class Cheese {
    private String type;
    private Mouse mouse = new Mouse();
    private int    price;
    private String param;
    private BigDecimal big = new BigDecimal("42.42");
    
    public Cheese(final String type,
                  final int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return this.type;
    }

    public BigDecimal getBigDecimal() {
        return big;
    }
    
    public int getPrice() {
        return this.price;
    }

    public Mouse getMouse() {
        return mouse;
    }
    
    public Mouse someMethod (String param) {
        this.param = param;
        return mouse;        
    }
    
    public Mouse anotherMethod(String p1, long p2) {
        return mouse;
    }
    
    /**
     * @param price the price to set
     */
    public void setPrice(final int price) {
        this.price = price;
    }

    /**
     * @param type the type to set
     */
    public void setType(final String type) {
        this.type = type;
    }

    public String toString() {
        return "Cheese type='" + this.type + "' price='" + this.price + "'";
    }

    public int hashCode() {
        //like org.apache.commons.lang.builder.HashCodeBuilder
        int hashCode = 17;
        hashCode = hashCode * 37 + this.price;
        hashCode = hashCode * 37 + (this.type == null ? 0 : this.type.hashCode());
        return hashCode;
    }

    public boolean equals(final Object object) {
        if ( object == this ) {
            return true;
        }

        if ( object == null || !(object instanceof Cheese) ) {
            return false;
        }

        final Cheese other = (Cheese) object;

        return (this.type.equals( other.getType() ) && this.price == other.getPrice());
    }

    public static int getIndex(final Class clazz,
                               final String name) throws IntrospectionException {
        final PropertyDescriptor[] descriptors = Introspector.getBeanInfo( clazz ).getPropertyDescriptors();
        for ( int i = 0; i < descriptors.length; i++ ) {
            if ( descriptors[i].getName().equals( name ) ) {
                return i;
            }
        }
        return -1;
    }

    public Object getParam() {
        
        return param;
    }
}