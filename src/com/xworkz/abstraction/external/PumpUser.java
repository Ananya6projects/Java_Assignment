package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Pump;

public class PumpUser {

    private Pump pump;

    public PumpUser(Pump pump) {
        this.pump = pump;
        System.out.println("Using Pump in PumpUser class");
    }

    public void execute() {
        System.out.println("Executing Pump in PumpUser...");
        if (this.pump != null) {
            this.pump.operatePump();
        } else {
            System.err.println("Pump is null");
        }
    }
}
