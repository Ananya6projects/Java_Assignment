package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.AC;

public class ACUser {

    private AC ac;

    public ACUser(AC ac) {
        this.ac = ac;
        System.out.println("Using AC in ACUser class");
    }

    public void execute() {
        System.out.println("Executing AC in ACUser...");
        if (this.ac != null) {
            this.ac.operateAC();
        } else {
            System.err.println("AC is null");
        }
    }
}
