package com.xworkz.interfaces.inner.defaultt;

public interface Star {
    void shine();
    void twinkle();
    void visibleAtNight();
    default void planet(){
        System.out.println("planet");
    }
}
