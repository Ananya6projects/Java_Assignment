package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Flashlight;

public class FlashlightUser {

    private Flashlight flashlight;

    public FlashlightUser(Flashlight flashlight) {
        this.flashlight = flashlight;
        System.out.println("Using Flashlight in FlashlightUser class");
    }

    public void execute() {
        System.out.println("Executing Flashlight in FlashlightUser...");
        if (this.flashlight != null) {
            this.flashlight.operateFlashlight();
        } else {
            System.err.println("Flashlight is null");
        }
    }
}
