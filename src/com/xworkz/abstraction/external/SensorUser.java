package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Sensor;

public class SensorUser {

    private Sensor sensor;

    public SensorUser(Sensor sensor) {
        this.sensor = sensor;
        System.out.println("Using Sensor in SensorUser class");
    }

    public void execute() {
        System.out.println("Executing Sensor in SensorUser...");
        if (this.sensor != null) {
            this.sensor.operateSensor();
        } else {
            System.err.println("Sensor is null");
        }
    }
}
