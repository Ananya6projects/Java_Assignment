package com.xworkz.interfaces.inner.defaultt;

public interface Connect {
    void establish();
    void maintain();
    void terminate();
    default void people(){
        System.out.println("people");
    }
}
