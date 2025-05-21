package com.xworkz.abstraction.internal;

public class LockImpl implements Lock {
    @Override
    public void operateLock() {
        System.out.println("Operating LockImpl...");
    }
}
