package com.xworkz.interfaces.inner.defaultt;

public interface Petrol {
    void fill();
    void burn();
    void checkLevel();
    default void money(){
        System.out.println("money");
    }
}
