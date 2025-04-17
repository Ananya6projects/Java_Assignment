package com.xworkz.interfaces.inner.defaultt;

public interface Silver {
    void usedInUtensils();
    void polish();
    void reflectLight();
    default void metal(){
        System.out.println("metal");
    }
}
