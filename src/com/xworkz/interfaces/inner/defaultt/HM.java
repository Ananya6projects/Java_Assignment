package com.xworkz.interfaces.inner.defaultt;

public interface HM {
    void design();
    void trend();
    void sell();
    default void brand(){
        System.out.println("brand");
    }
}
