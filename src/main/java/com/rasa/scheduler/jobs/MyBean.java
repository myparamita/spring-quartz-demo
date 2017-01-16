package com.rasa.scheduler.jobs;

import org.springframework.stereotype.Component;

/**
 * @author Rasa LV
 */
@Component("myBean")
public class MyBean {
 
    public void printMessage() {
        System.out.println("I am MyBean. I am called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
    }
     
}
