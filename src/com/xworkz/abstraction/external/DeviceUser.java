package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Device;

public class DeviceUser {

    private Device device;

    public DeviceUser(Device device) {
        this.device = device;
        System.out.println("Using Device in DeviceUser class");
    }

    public void execute() {
        System.out.println("Executing Device in DeviceUser...");
        if (this.device != null) {
            this.device.operateDevice();
        } else {
            System.err.println("Device is null");
        }
    }
}
