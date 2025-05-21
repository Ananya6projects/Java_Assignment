package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Switch;

public class SwitchUser {

    private Switch switch1;

    public SwitchUser(Switch switch1 ) {
        this.switch1 = switch1;
        System.out.println("Using Switch in SwitchUser class");
    }

    public void execute() {
        System.out.println("Executing Switch in SwitchUser...");
        if (this.switch1 != null) {
            this.switch1.operateSwitch();
        } else {
            System.err.println("Switch is null");
        }
    }
}
