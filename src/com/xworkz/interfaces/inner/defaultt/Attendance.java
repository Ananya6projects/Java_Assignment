package com.xworkz.interfaces.inner.defaultt;

public interface Attendance {
    void markPresent();
    void isLate();
    void calculatePercentage();
    default void mandatory(){
        System.out.println("mandatory");
    }
}
