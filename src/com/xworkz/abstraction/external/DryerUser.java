package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Dryer;

public class DryerUser {

    private Dryer dryer;

    public DryerUser(Dryer dryer) {
        this.dryer = dryer;
        System.out.println("Using Dryer in DryerUser class");
    }

    public void execute() {
        System.out.println("Executing Dryer in DryerUser...");
        if (this.dryer != null) {
            this.dryer.operateDryer();
        } else {
            System.err.println("Dryer is null");
        }
    }
}
