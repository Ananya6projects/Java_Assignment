package com.xworkz.interfaces.inner.defaultt;

public interface Trunk {
    void open();
    void putItems();
    void close();
    default void elephant(){
        System.out.println("ele");
    }
}
