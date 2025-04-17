package com.xworkz.interfaces.inner.defaultt;

public class TrunkImpli implements Trunk {
    @Override
    public void open() {
        System.out.println("Trunk is open");
    }

    @Override
    public void putItems() {
        System.out.println("Items placed in trunk");
    }

    @Override
    public void close() {
        System.out.println("Trunk is closed");
    }

    @Override
    public void elephant() {
        System.out.println("animal have");
    }
}
