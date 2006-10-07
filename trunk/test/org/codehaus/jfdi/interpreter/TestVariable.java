package org.codehaus.jfdi.interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestVariable {
    private Object object;
    
    public void setObject(Object object) {
        this.object = object;
    }
    
    public Object getObject() {
        return this.object;
    }
    
    public String helloWorld1(String a1, int a2, List list) {
        String string = "";
        for ( Iterator  it = list.iterator(); it.hasNext() ; ) {
            string += it.next();
        }
        return a1 + a2 + string + object;
    }
    
    public static String helloWorld2(String a1, int a2, List list) {
        String string = "";
        for ( Iterator  it = list.iterator(); it.hasNext() ; ) {
            string += it.next();
        }
        return a1 + a2 + string;
    }    
 
}
