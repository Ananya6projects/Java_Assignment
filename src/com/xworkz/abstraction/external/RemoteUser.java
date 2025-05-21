package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Remote;

public class RemoteUser {

    private Remote remote;

    public RemoteUser(Remote remote) {
        this.remote = remote;
        System.out.println("Using Remote in RemoteUser class");
    }

    public void execute() {
        System.out.println("Executing Remote in RemoteUser...");
        if (this.remote != null) {
            this.remote.operateRemote();
        } else {
            System.err.println("Remote is null");
        }
    }
}
