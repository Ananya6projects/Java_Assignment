package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Mouse;

public class MouseUser {

    private Mouse mouse;

    public MouseUser(Mouse mouse) {
        this.mouse = mouse;
        System.out.println("Using Mouse in MouseUser class");
    }

    public void execute() {
        System.out.println("Executing Mouse in MouseUser...");
        if (this.mouse != null) {
            this.mouse.operateMouse();
        } else {
            System.err.println("Mouse is null");
        }
    }
}
