package com.xworkz.interfaces.inner.file;

public class BluetoothImpli implements Bluetooth {
    @Override
    public void pairDevice() {
        System.out.println("Bluetooth pairing device");
    }

    @Override
    public void sendFile() {
        System.out.println("Bluetooth sending file");
    }

    @Override
    public void unpair() {
        System.out.println("Bluetooth unpaired device");
    }
}
