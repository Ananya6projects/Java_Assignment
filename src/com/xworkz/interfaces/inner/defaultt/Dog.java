package com.xworkz.interfaces.inner.defaultt;

public interface Dog {
    void bark();
    void run();
    void wagTail();
    default void cute(){
        System.out.println("dog");
    }
}
