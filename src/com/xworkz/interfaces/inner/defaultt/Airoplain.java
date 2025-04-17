package com.xworkz.interfaces.inner.defaultt;

public interface Airoplain {
    void fly();
    void land();
    void carryPassengers();

    default void costly(){
        System.out.println("Airoplain is costly");
    }
}
