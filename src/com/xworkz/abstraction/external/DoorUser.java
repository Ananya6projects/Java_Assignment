package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Door;

public class DoorUser {

    private Door door;

    public DoorUser(Door door) {
        this.door = door;
        System.out.println("Using Door in DoorUser class");
    }

    public void execute() {
        System.out.println("Executing Door in DoorUser...");
        if (this.door != null) {
            this.door.operateDoor();
        } else {
            System.err.println("Door is null");
        }
    }
}
