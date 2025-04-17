package com.xworkz.interfaces.inner.defaultt;

public interface Money {
    void spend();
    void save();
    void invest();
    default void must(){
        System.out.println("must");
    }
}
