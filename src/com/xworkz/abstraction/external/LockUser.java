package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Lock;

public class LockUser {

    private Lock lock;

    public LockUser(Lock lock) {
        this.lock = lock;
        System.out.println("Using Lock in LockUser class");
    }

    public void execute() {
        System.out.println("Executing Lock in LockUser...");
        if (this.lock != null) {
            this.lock.operateLock();
        } else {
            System.err.println("Lock is null");
        }
    }
}
