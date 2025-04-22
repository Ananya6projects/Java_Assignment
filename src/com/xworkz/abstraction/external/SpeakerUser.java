package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Speaker;

public class SpeakerUser {

    private Speaker speaker;

    public SpeakerUser(Speaker speaker) {
        this.speaker = speaker;
        System.out.println("Using Speaker in SpeakerUser class");
    }

    public void execute() {
        System.out.println("Executing Speaker in SpeakerUser...");
        if (this.speaker != null) {
            this.speaker.operateSpeaker();
        } else {
            System.err.println("Speaker is null");
        }
    }
}
