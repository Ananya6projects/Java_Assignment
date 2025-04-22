package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Keypad;

public class KeypadUser {

    private Keypad keypad;

    public KeypadUser(Keypad keypad) {
        this.keypad = keypad;
        System.out.println("Using Keypad in KeypadUser class");
    }

    public void execute() {
        System.out.println("Executing Keypad in KeypadUser...");
        if (this.keypad != null) {
            this.keypad.operateKeypad();
        } else {
            System.err.println("Keypad is null");
        }
    }
}
