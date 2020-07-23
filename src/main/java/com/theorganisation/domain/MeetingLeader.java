package com.theorganisation.domain;

public interface MeetingLeader {
    void startMeeting();
    static void bookConferenceRoom(){
        System.out.println("You see this message because the method bookConferenceRoom has been called");
    };
}
