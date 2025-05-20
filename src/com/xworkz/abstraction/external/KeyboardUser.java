package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Keyboard;

public class KeyboardUser {

    private Keyboard keyboard;

    public KeyboardUser(Keyboard keyboard) {
        this.keyboard = keyboard;
        System.out.println("Using Keyboard in KeyboardUser class");
    }

    public void execute() {
        System.out.println("Executing Keyboard in KeyboardUser...");
        if (this.keyboard != null) {
            this.keyboard.operateKeyboard();
        } else {
            System.err.println("Keyboard is null");
        }
    }
}
