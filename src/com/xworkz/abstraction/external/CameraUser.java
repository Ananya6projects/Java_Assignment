package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Camera;

public class CameraUser {

    private Camera camera;

    public CameraUser(Camera camera) {
        this.camera = camera;
        System.out.println("Using Camera in CameraUser class");
    }

    public void execute() {
        System.out.println("Executing Camera in CameraUser...");
        if (this.camera != null) {
            this.camera.operateCamera();
        } else {
            System.err.println("Camera is null");
        }
    }
}
