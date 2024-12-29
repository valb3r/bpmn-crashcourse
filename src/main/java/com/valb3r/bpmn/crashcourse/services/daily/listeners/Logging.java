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

    public void logWaitingForTaxiToArrive() {
        System.out.println("=== Waiting for taxi to arrive ===");
    }

    public void logTaxiTookTooLong() {
        System.out.println("=== Searching for taxi took too long ===");
    }

    public void logEnded() {
        System.out.println("=== The process has ended. Hope you had a nice day ===");
    }
}
