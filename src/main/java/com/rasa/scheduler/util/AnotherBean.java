/**
 * File Name：AnotherBean.java
 *
 * Copyright Defonds Corporation 2015 
 * All Rights Reserved
 *
 */
package com.rasa.scheduler.util;

import org.springframework.stereotype.Component;

/**
 * @author Rasa LV
 */
@Component("anotherBean")
public class AnotherBean {
     
    public void printAnotherMessage(){
        System.out.println("I am AnotherBean. I am called by Quartz jobBean using CronTriggerFactoryBean");
    }
     
}
