package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Smartwatch;

public class SmartwatchUser {

    private Smartwatch smartwatch;

    public SmartwatchUser(Smartwatch smartwatch) {
        this.smartwatch = smartwatch;
        System.out.println("Using Smartwatch in SmartwatchUser class");
    }

    public void execute() {
        System.out.println("Executing Smartwatch in SmartwatchUser...");
        if (this.smartwatch != null) {
            this.smartwatch.operateSmartwatch();
        } else {
            System.err.println("Smartwatch is null");
        }
    }
}
