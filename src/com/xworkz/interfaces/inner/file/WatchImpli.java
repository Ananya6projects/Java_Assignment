package com.xworkz.interfaces.inner.file;

public class WatchImpli implements Watch {
    @Override
    public void showTime() {
        System.out.println("Watch shows time");
    }

    @Override
    public void setAlarm() {
        System.out.println("Alarm is set on watch");
    }

    @Override
    public void waterproof() {
        System.out.println("Watch is waterproof");
    }
}
