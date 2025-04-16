package com.xworkz.interfaces.inner.file;

public class LeaveImpli implements Leave {
    @Override
    public void apply() {
        System.out.println("Leave applied");
    }

    @Override
    public void approve() {
        System.out.println("Leave approved");
    }

    @Override
    public void reject() {
        System.out.println("Leave rejected");
    }
}
