package com.xworkz.interfaces.inner.defaultt;

public interface Saturn {
    void rotate();
    void hasRings();
    void attractMoons();
    default void planet(){
        System.out.println("planet");
    }
}
