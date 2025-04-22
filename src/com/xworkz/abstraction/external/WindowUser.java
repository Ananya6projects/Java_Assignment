package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Window;

public class WindowUser {

    private Window window;

    public WindowUser(Window window) {
        this.window = window;
        System.out.println("Using Window in WindowUser class");
    }

    public void execute() {
        System.out.println("Executing Window in WindowUser...");
        if (this.window != null) {
            this.window.operateWindow();
        } else {
            System.err.println("Window is null");
        }
    }
}
