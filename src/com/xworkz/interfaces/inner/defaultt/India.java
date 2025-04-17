package com.xworkz.interfaces.inner.defaultt;

public interface India {
    void showCulture();
    void celebrateFestival();
    void growEconomy();
    default void country(){
        System.out.println("country");
    }
}
