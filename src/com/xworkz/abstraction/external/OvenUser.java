package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Oven;

public class OvenUser {

    private Oven oven;

    public OvenUser(Oven oven) {
        this.oven = oven;
        System.out.println("Using Oven in OvenUser class");
    }

    public void execute() {
        System.out.println("Executing Oven in OvenUser...");
        if (this.oven != null) {
            this.oven.operateOven();
        } else {
            System.err.println("Oven is null");
        }
    }
}
