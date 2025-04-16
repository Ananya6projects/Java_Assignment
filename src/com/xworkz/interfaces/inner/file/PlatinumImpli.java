package com.xworkz.interfaces.inner.file;

public class PlatinumImpli implements Platinum {
    @Override
    public void rareMetal() {
        System.out.println("Platinum is a rare metal");
    }

    @Override
    public void usedInRings() {
        System.out.println("Platinum is used in rings");
    }

    @Override
    public void doesNotTarnish() {
        System.out.println("Platinum does not tarnish");
    }
}
