package com.xworkz.interfaces.inner.defaultt;

public interface Pluto {
    void revolve();
    void rotate();
    void hasIce();
    default void planet(){
        System.out.println("planet");
    }
}
