package com.xworkz.interfaces.inner.file;

public class PetrolImpli implements Petrol {
    @Override
    public void fill() {
        System.out.println("Petrol filled");
    }

    @Override
    public void burn() {
        System.out.println("Petrol burning in engine");
    }

    @Override
    public void checkLevel() {
        System.out.println("Petrol level checked");
    }
}
