package com.xworkz.interfaces.inner.file;

public class RadioImpli implements Radio {
    @Override
    public void tune() {
        System.out.println("Radio is tuning channels");
    }

    @Override
    public void playMusic() {
        System.out.println("Radio is playing music");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing radio volume");
    }
}
