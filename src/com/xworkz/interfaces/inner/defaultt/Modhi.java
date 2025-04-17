package com.xworkz.interfaces.inner.defaultt;

public interface Modhi {
    void leadCountry();
    void speak();
    void visitState();
    default void pm(){
        System.out.println("pm");
    }
}
