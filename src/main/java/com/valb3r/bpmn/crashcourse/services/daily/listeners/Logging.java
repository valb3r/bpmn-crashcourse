package com.valb3r.bpmn.crashcourse.services.daily.listeners;

import org.springframework.stereotype.Service;

@Service
public class Logging {

    public void logWeekend() {
        System.out.println("=== Today is weekend ===");
    }

    public void logWorkingDay() {
        System.out.println("=== Today is working day ===");
    }
}
