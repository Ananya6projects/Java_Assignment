package com.xworkz.interfaces.inner.defaultt;

public interface Chain {
    void lock();
    void wear();
    void shine();
    default void dog(){
        System.out.println("dog");
    }
}
