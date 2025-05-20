package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Tripod;

public class TripodUser {

    private Tripod tripod;

    public TripodUser(Tripod tripod) {
        this.tripod = tripod;
        System.out.println("Using Tripod in TripodUser class");
    }

    public void execute() {
        System.out.println("Executing Tripod in TripodUser...");
        if (this.tripod != null) {
            this.tripod.operateTripod();
        } else {
            System.err.println("Tripod is null");
        }
    }
}
