package com.xworkz.interfaces.inner.defaultt;

public interface People {
    void talk();
    void walk();
    void help();
    default void dull(){
        System.out.println("dull");
    }
}
