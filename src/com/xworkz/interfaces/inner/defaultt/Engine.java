package com.xworkz.interfaces.inner.defaultt;

public interface Engine {
    void start();
    void consumeFuel();
    void stop();
    default void repair(){
        System.out.println("repair");
    }
}
