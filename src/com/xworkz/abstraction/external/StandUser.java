package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Stand;

public class StandUser {

    private Stand stand;

    public StandUser(Stand stand) {
        this.stand = stand;
        System.out.println("Using Stand in StandUser class");
    }

    public void execute() {
        System.out.println("Executing Stand in StandUser...");
        if (this.stand != null) {
            this.stand.operateStand();
        } else {
            System.err.println("Stand is null");
        }
    }
}
