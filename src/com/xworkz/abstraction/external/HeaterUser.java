package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Heater;

public class HeaterUser {

    private Heater heater;

    public HeaterUser(Heater heater) {
        this.heater = heater;
        System.out.println("Using Heater in HeaterUser class");
    }

    public void execute() {
        System.out.println("Executing Heater in HeaterUser...");
        if (this.heater != null) {
            this.heater.operateHeater();
        } else {
            System.err.println("Heater is null");
        }
    }
}
