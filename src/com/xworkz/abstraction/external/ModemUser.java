package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Modem;

public class ModemUser {

    private Modem modem;

    public ModemUser(Modem modem) {
        this.modem = modem;
        System.out.println("Using Modem in ModemUser class");
    }

    public void execute() {
        System.out.println("Executing Modem in ModemUser...");
        if (this.modem != null) {
            this.modem.operateModem();
        } else {
            System.err.println("Modem is null");
        }
    }
}
