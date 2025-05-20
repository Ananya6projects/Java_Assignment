package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Wheel;

public class WheelUser {

    private Wheel wheel;

    public WheelUser(Wheel wheel) {
        this.wheel = wheel;
        System.out.println("Using Wheel in WheelUser class");
    }

    public void execute() {
        System.out.println("Executing Wheel in WheelUser...");
        if (this.wheel != null) {
            this.wheel.operateWheel();
        } else {
            System.err.println("Wheel is null");
        }
    }
}
