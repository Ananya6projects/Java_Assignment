package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Robot;

public class RobotUser {

    private Robot robot;

    public RobotUser(Robot robot) {
        this.robot = robot;
        System.out.println("Using Robot in RobotUser class");
    }

    public void execute() {
        System.out.println("Executing Robot in RobotUser...");
        if (this.robot != null) {
            this.robot.operateRobot();
        } else {
            System.err.println("Robot is null");
        }
    }
}
