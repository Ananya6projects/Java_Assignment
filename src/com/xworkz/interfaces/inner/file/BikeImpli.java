package com.xworkz.interfaces.inner.file;

public class BikeImpli implements Bike {
    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void ride() {
        System.out.println("Riding bike");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}
