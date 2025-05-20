package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Charger;

public class ChargerUser {

    private Charger charger;

    public ChargerUser(Charger charger) {
        this.charger = charger;
        System.out.println("Using Charger in ChargerUser class");
    }

    public void execute() {
        System.out.println("Executing Charger in ChargerUser...");
        if (this.charger != null) {
            this.charger.operateCharger();
        } else {
            System.err.println("Charger is null");
        }
    }
}
