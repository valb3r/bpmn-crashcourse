package com.valb3r.bpmn.crashcourse;

import org.flowable.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BpmnCrashcourseApp implements CommandLineRunner {

    @Autowired
    private RuntimeService runtimeService;


    public static void main(String[] args) {
        SpringApplication.run(BpmnCrashcourseApp.class, args);
    }
 
    @Override
    public void run(String... args) {
        System.out.println("Starting daily routine");
        runtimeService.startProcessInstanceByKey("going-to-work");
    }
}