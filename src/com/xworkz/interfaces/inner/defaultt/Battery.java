package com.xworkz.interfaces.inner.defaultt;

public interface Battery {
    void storePower();
    void discharge();
    void isRechargeable();

    default void percentage(){
        System.out.println("percentage");
    }
}
