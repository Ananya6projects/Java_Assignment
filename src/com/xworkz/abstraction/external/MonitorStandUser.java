package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.MonitorStand;

public class MonitorStandUser {

    private MonitorStand monitorstand;

    public MonitorStandUser(MonitorStand monitorstand) {
        this.monitorstand = monitorstand;
        System.out.println("Using MonitorStand in MonitorStandUser class");
    }

    public void execute() {
        System.out.println("Executing MonitorStand in MonitorStandUser...");
        if (this.monitorstand != null) {
            this.monitorstand.operateMonitorStand();
        } else {
            System.err.println("MonitorStand is null");
        }
    }
}
