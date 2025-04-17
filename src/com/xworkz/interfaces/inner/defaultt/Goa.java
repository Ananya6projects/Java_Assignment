package com.xworkz.interfaces.inner.defaultt;

public interface Goa {
    void enjoyBeach();
    void party();
    void exploreChurches();
    default void place(){
        System.out.println("place");
    }
}
