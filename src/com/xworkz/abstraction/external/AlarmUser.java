package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Alarm;

public class AlarmUser {

    private Alarm alarm;

    public AlarmUser(Alarm alarm) {
        this.alarm = alarm;
        System.out.println("Using Alarm in AlarmUser class");
    }

    public void execute() {
        System.out.println("Executing Alarm in AlarmUser...");
        if (this.alarm != null) {
            this.alarm.operateAlarm();
        } else {
            System.err.println("Alarm is null");
        }
    }
}
