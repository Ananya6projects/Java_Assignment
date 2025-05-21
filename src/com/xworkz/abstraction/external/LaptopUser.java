package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Laptop;

public class LaptopUser {

    private Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Using Laptop in LaptopUser class");
    }

    public void execute() {
        System.out.println("Executing Laptop in LaptopUser...");
        if (this.laptop != null) {
            this.laptop.operateLaptop();
        } else {
            System.err.println("Laptop is null");
        }
    }
}
