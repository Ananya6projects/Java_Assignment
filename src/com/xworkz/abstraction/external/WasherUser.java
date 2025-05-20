package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Washer;

public class WasherUser {

    private Washer washer;

    public WasherUser(Washer washer) {
        this.washer = washer;
        System.out.println("Using Washer in WasherUser class");
    }

    public void execute() {
        System.out.println("Executing Washer in WasherUser...");
        if (this.washer != null) {
            this.washer.operateWasher();
        } else {
            System.err.println("Washer is null");
        }
    }
}
