package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Projector;

public class ProjectorUser {

    private Projector projector;

    public ProjectorUser(Projector projector) {
        this.projector = projector;
        System.out.println("Using Projector in ProjectorUser class");
    }

    public void execute() {
        System.out.println("Executing Projector in ProjectorUser...");
        if (this.projector != null) {
            this.projector.operateProjector();
        } else {
            System.err.println("Projector is null");
        }
    }
}
