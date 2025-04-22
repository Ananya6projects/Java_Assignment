package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Monitor;

public class MonitorUser {

    private Monitor monitor;

    public MonitorUser(Monitor monitor) {
        this.monitor = monitor;
        System.out.println("Using Monitor in MonitorUser class");
    }

    public void execute() {
        System.out.println("Executing Monitor in MonitorUser...");
        if (this.monitor != null) {
            this.monitor.display();
        } else {
            System.err.println("Monitor is null");
        }
    }
}
