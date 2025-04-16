package com.xworkz.interfaces.inner.file;

public class TomatoImpli implements Tomato {
    @Override
    public void isRed() {
        System.out.println("Tomato is red");
    }

    @Override
    public void juicy() {
        System.out.println("Tomato is juicy");
    }

    @Override
    public void usedInCurry() {
        System.out.println("Tomato used in curry");
    }
}
