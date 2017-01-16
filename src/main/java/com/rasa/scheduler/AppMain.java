package com.rasa.scheduler;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rasa LV
 */
public class AppMain {

    public static void main(String args[]) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("quartz-context.xml");
    }

}
