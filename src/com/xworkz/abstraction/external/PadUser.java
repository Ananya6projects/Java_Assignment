package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Pad;

public class PadUser {

    private Pad pad;

    public PadUser(Pad pad) {
        this.pad = pad;
        System.out.println("Using Pad in PadUser class");
    }

    public void execute() {
        System.out.println("Executing Pad in PadUser...");
        if (this.pad != null) {
            this.pad.operatePad();
        } else {
            System.err.println("Pad is null");
        }
    }
}
