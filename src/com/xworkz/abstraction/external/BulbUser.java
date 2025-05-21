package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Bulb;

public class BulbUser {

    private Bulb bulb;

    public BulbUser(Bulb bulb) {
        this.bulb = bulb;
        System.out.println("Using Bulb in BulbUser class");
    }

    public void execute() {
        System.out.println("Executing Bulb in BulbUser...");
        if (this.bulb != null) {
            this.bulb.operateBulb();
        } else {
            System.err.println("Bulb is null");
        }
    }
}
