package com.xworkz.interfaces.inner.defaultt;

public interface School {
    void conductClass();
    void giveHomework();
    void takeAttendance();
    default void place(){
        System.out.println("place");
    }
}
