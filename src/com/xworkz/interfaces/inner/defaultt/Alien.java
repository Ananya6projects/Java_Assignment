package com.xworkz.interfaces.inner.defaultt;

public interface Alien {
    void comeFromSpace();
    void hasBigEyes();
    void communicate();

    default void ugly(){
        System.out.println("Aliean is ugly");
    }
}
