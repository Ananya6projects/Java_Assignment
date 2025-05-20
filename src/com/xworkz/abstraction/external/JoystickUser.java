package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Joystick;

public class JoystickUser {

    private Joystick joystick;

    public JoystickUser(Joystick joystick) {
        this.joystick = joystick;
        System.out.println("Using Joystick in JoystickUser class");
    }

    public void execute() {
        System.out.println("Executing Joystick in JoystickUser...");
        if (this.joystick != null) {
            this.joystick.operateJoystick();
        } else {
            System.err.println("Joystick is null");
        }
    }
}
