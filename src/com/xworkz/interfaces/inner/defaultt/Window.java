package com.xworkz.interfaces.inner.defaultt;

public interface Window {
    void open();
    void close();
    void allowAir();
    default void light(){
        System.out.println("light");
    }
}
