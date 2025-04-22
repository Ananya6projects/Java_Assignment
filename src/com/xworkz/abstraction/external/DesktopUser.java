package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Desktop;

public class DesktopUser {

    private Desktop desktop;

    public DesktopUser(Desktop desktop) {
        this.desktop = desktop;
        System.out.println("Using Desktop in DesktopUser class");
    }

    public void execute() {
        System.out.println("Executing Desktop in DesktopUser...");
        if (this.desktop != null) {
            this.desktop.operateDesktop();
        } else {
            System.err.println("Desktop is null");
        }
    }
}
