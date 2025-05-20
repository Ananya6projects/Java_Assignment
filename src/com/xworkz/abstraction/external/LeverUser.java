package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Lever;

public class LeverUser {

    private Lever lever;

    public LeverUser(Lever lever) {
        this.lever = lever;
        System.out.println("Using Lever in LeverUser class");
    }

    public void execute() {
        System.out.println("Executing Lever in LeverUser...");
        if (this.lever != null) {
            this.lever.operateLever();
        } else {
            System.err.println("Lever is null");
        }
    }
}
