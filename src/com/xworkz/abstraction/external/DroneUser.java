package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Drone;

public class DroneUser {

    private Drone drone;

    public DroneUser(Drone drone) {
        this.drone = drone;
        System.out.println("Using Drone in DroneUser class");
    }

    public void execute() {
        System.out.println("Executing Drone in DroneUser...");
        if (this.drone != null) {
            this.drone.operateDrone();
        } else {
            System.err.println("Drone is null");
        }
    }
}
