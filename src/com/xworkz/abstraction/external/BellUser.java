package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Bell;

public class BellUser {

    private Bell bell;

    public BellUser(Bell bell) {
        this.bell = bell;
        System.out.println("Using Bell in BellUser class");
    }

    public void execute() {
        System.out.println("Executing Bell in BellUser...");
        if (this.bell != null) {
            this.bell.operateBell();
        } else {
            System.err.println("Bell is null");
        }
    }
}
