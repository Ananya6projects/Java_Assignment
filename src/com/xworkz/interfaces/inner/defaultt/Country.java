package com.xworkz.interfaces.inner.defaultt;

public interface Country {
    void develop();
    void maintainLaw();
    void representCulture();
    default void india(){
        System.out.println("india");
    }
}
