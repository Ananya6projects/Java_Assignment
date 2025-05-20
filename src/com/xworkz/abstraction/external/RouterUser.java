package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Router;

public class RouterUser {

    private Router router;

    public RouterUser(Router router) {
        this.router = router;
        System.out.println("Using Router in RouterUser class");
    }

    public void execute() {
        System.out.println("Executing Router in RouterUser...");
        if (this.router != null) {
            this.router.operateRouter();
        } else {
            System.err.println("Router is null");
        }
    }
}
