package com.xworkz.interfaces.inner.file;

public class KidImpli implements Kid {
    @Override
    public void play() {
        System.out.println("Kid is playing");
    }

    @Override
    public void learn() {
        System.out.println("Kid is learning");
    }

    @Override
    public void eat() {
        System.out.println("Kid is eating");
    }
}
