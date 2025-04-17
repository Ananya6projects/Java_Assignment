package com.xworkz.interfaces.inner.defaultt;

public interface Chair {
    void sitOn();
    void hasLegs();
    void isComfortable();
    default void plastic(){
        System.out.println("plastic");
    }
}
