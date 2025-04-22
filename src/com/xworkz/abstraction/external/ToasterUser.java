package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Toaster;

public class ToasterUser {

    private Toaster toaster;

    public ToasterUser(Toaster toaster) {
        this.toaster = toaster;
        System.out.println("Using Toaster in ToasterUser class");
    }

    public void execute() {
        System.out.println("Executing Toaster in ToasterUser...");
        if (this.toaster != null) {
            this.toaster.operateToaster();
        } else {
            System.err.println("Toaster is null");
        }
    }
}
