package com.xworkz.interfaces.inner.defaultt;

public interface Bluetooth {
    void pairDevice();
    void sendFile();
    void unpair();
    default void connect(){
        System.out.println("connect");
    }
}
