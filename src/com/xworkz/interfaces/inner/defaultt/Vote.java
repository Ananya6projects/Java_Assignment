package com.xworkz.interfaces.inner.defaultt;

public interface Vote {
    void castVote();
    void verifyVoter();
    void countVote();
    default void right(){
        System.out.println("right");
    }
}
