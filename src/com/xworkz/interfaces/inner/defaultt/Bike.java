package com.xworkz.interfaces.inner.defaultt;

public interface Bike {
    void start();
    void ride();
    void stop();
    default void wheel(){
        System.out.println("wheel");
    }
}
