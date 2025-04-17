package com.xworkz.interfaces.inner.defaultt;

public interface Fan {
    void rotate();
    void coolAir();
    void changeSpeed();
    default void must(){
        System.out.println("must");
    }
}
