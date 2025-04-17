package com.xworkz.interfaces.inner.defaultt;

public interface Home {
   abstract void slipperOutSide();
   abstract void sleepEarly();
   abstract boolean speakLoud();
   default void place(){
      System.out.println("place");
   }
}
