package com.xworkz.interfaces.inner.defaultt;

public interface Bet {
    void place();
    void win();
    void lose();
    default void notGood(){
        System.out.println("not good");
    }
}
