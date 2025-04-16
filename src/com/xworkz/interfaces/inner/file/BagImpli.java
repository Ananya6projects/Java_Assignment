package com.xworkz.interfaces.inner.file;

public class BagImpli implements Bag{

    @Override
    public void closeJip() {
        System.out.println("close zip");
    }

    @Override
    public void keepSafe() {
        System.out.println("keep safe");

    }

    @Override
    public void size() {
        System.out.println("bag size");

    }
}
