package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Fan;

public class FanUser {

    private Fan fan;

    public FanUser(Fan fan) {
        this.fan = fan;
        System.out.println("Using Fan in FanUser class");
    }

    public void execute() {
        System.out.println("Executing Fan in FanUser...");
        if (this.fan != null) {
            this.fan.operateFan();
        } else {
            System.err.println("Fan is null");
        }
    }
}
