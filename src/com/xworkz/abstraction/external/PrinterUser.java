package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Printer;

public class PrinterUser {

    private Printer printer;

    public PrinterUser(Printer printer) {
        this.printer = printer;
        System.out.println("Using Printer in PrinterUser class");
    }

    public void execute() {
        System.out.println("Executing Printer in PrinterUser...");
        if (this.printer != null) {
            this.printer.print();
        } else {
            System.err.println("Printer is null");
        }
    }
}
