package com.xworkz.interfaces.inner.defaultt;

public interface Sun {
    void rise();
    void set();
    void giveLight();
    default void bright(){
        System.out.println("bright");
    }
}
