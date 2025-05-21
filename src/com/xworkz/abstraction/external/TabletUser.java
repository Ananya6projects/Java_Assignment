package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Tablet;

public class TabletUser {

    private Tablet tablet;

    public TabletUser(Tablet tablet) {
        this.tablet = tablet;
        System.out.println("Using Tablet in TabletUser class");
    }

    public void execute() {
        System.out.println("Executing Tablet in TabletUser...");
        if (this.tablet != null) {
            this.tablet.operateTablet();
        } else {
            System.err.println("Tablet is null");
        }
    }
}
