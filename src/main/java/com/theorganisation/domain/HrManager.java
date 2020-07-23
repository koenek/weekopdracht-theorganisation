package com.theorganisation.domain;

import javax.persistence.Entity;

@Entity
public class HrManager extends Employee implements MeetingLeader {
    @Override
    public void startMeeting() {
        System.out.println("You see this message because the method startMeeting has been called");
    }
}
