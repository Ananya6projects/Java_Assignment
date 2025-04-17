package com.xworkz.interfaces.inner.defaultt;

public interface Hospital {
    void admitPatient();
    void provideTreatment();
    void dischargePatient();
    default void emergency(){
        System.out.println("hospital emergency");
    }
}
