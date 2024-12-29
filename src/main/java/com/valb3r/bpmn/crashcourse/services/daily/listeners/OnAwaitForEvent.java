package com.valb3r.bpmn.crashcourse.services.daily.listeners;

import org.springframework.stereotype.Service;

@Service
public class OnAwaitForEvent {

    public void awaitForTaxiFound() {
        System.out.println("Type 'taxiFound' and hit enter if taxi was found");
    }

    public void awaitForTaxiArrived() {
        System.out.println("Type 'taxiArrived' and hit enter if taxi has arrived");
    }

    public void awaitForArrivedToJob() {
        System.out.println("Type 'arrivedToJob' and hit enter if you arrived to job");
    }
}
