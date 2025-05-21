package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Valve;

public class ValveUser {

    private Valve valve;

    public ValveUser(Valve valve) {
        this.valve = valve;
        System.out.println("Using Valve in ValveUser class");
    }

    public void execute() {
        System.out.println("Executing Valve in ValveUser...");
        if (this.valve != null) {
            this.valve.operateValve();
        } else {
            System.err.println("Valve is null");
        }
    }
}
