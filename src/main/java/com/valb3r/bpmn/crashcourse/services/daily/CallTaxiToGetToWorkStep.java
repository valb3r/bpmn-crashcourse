package com.valb3r.bpmn.crashcourse.services.daily;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service
public class CallTaxiToGetToWorkStep implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("Calling taxi to get to work");
    }
}
