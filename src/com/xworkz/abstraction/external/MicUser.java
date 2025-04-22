package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Mic;

public class MicUser {

    private Mic mic;

    public MicUser(Mic mic) {
        this.mic = mic;
        System.out.println("Using Mic in MicUser class");
    }

    public void execute() {
        System.out.println("Executing Mic in MicUser...");
        if (this.mic != null) {
            this.mic.operateMic();
        } else {
            System.err.println("Mic is null");
        }
    }
}
