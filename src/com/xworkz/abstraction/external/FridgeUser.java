package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Fridge;

public class FridgeUser {

    private Fridge fridge;

    public FridgeUser(Fridge fridge) {
        this.fridge = fridge;
        System.out.println("Using Fridge in FridgeUser class");
    }

    public void execute() {
        System.out.println("Executing Fridge in FridgeUser...");
        if (this.fridge != null) {
            this.fridge.operateFridge();
        } else {
            System.err.println("Fridge is null");
        }
    }
}
