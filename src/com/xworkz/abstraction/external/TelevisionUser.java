package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Television;

public class TelevisionUser {

    private Television television;

    public TelevisionUser(Television television) {
        this.television = television;
        System.out.println("Using Television in TelevisionUser class");
    }

    public void execute() {
        System.out.println("Executing Television in TelevisionUser...");
        if (this.television != null) {
            this.television.operateTelevision();
        } else {
            System.err.println("Television is null");
        }
    }
}
