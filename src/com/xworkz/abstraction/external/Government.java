package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Constitution;

public class Government {
    private Constitution constitution;

    public Government(Constitution constitution){
        this.constitution=constitution;
        System.out.println("Running government...");
    }
    public void execute(){
        System.out.println("Executing the constitution");
        if(constitution!=null){
            constitution.followLaws();
        } else {
            System.out.println("Constitutionis null");
}
}
}
