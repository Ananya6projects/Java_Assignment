package com.xworkz.interfaces.inner.defaultt;

public interface Tomato {
    void isRed();
    void juicy();
    void usedInCurry();
    default void vegetable(){
        System.out.println("vegetable");
    }
}
