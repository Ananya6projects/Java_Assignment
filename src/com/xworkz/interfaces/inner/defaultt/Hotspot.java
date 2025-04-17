package com.xworkz.interfaces.inner.defaultt;

public interface Hotspot {
    void turnOn();
    void connectDevice();
    void turnOff();
    default void connect(){
        System.out.println("connect");
    }
}
