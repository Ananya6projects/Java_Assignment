package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.PowerBank;

public class PowerBankUser {

    private PowerBank powerbank;

    public PowerBankUser(PowerBank powerbank) {
        this.powerbank = powerbank;
        System.out.println("Using PowerBank in PowerBankUser class");
    }

    public void execute() {
        System.out.println("Executing PowerBank in PowerBankUser...");
        if (this.powerbank != null) {
            this.powerbank.operatePowerBank();
        } else {
            System.err.println("PowerBank is null");
        }
    }
}
