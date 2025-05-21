package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Scanner;

public class ScannerUser {

    private Scanner scanner;

    public ScannerUser(Scanner scanner) {
        this.scanner = scanner;
        System.out.println("Using Scanner in ScannerUser class");
    }

    public void execute() {
        System.out.println("Executing Scanner in ScannerUser...");
        if (this.scanner != null) {
            this.scanner.scan();
        } else {
            System.err.println("Scanner is null");
        }
    }
}
