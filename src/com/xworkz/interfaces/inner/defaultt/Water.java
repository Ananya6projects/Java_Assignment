package com.xworkz.interfaces.inner.defaultt;

public interface Water {
    void drink();
    void boil();
    void flow();
    default void cost(){
        System.out.println("cost");
    }
}
