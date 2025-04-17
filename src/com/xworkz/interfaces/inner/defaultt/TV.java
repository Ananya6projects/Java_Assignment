package com.xworkz.interfaces.inner.defaultt;

public interface TV {
    void powerOn();
    void changeChannel();
    void increaseVolume();
    default void watch(){
        System.out.println("watch");
    }
}
