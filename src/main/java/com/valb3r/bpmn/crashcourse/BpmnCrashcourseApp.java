package com.valb3r.bpmn.crashcourse;

import org.flowable.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

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
        var pi = runtimeService.startProcessInstanceByKey("going-to-work");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            var messageName = scanner.nextLine();
            try {
                var execution = runtimeService.createExecutionQuery().processInstanceId(pi.getProcessInstanceId())
                        .messageEventSubscriptionName(messageName).singleResult();
                runtimeService.messageEventReceived(messageName, execution.getId());
            } catch (Throwable ex) {
                System.out.println("Wrong input: " + messageName);
            }
        }
    }
}