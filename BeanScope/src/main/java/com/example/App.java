package com.example;

import java.io.File;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {        
        //load the spring configuration file
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("./applicationContext.xml");
        //retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);
        //call methods on the bean
        System.out.println(coach.getDailyWorkout());
        // call the daily fortune from the coach
        for(int i = 0 ; i < 4 ; i++) {
            System.out.println("Fortune " + (i + 1) + coach.getDailyFortune());
        }
        
        //close the context
        context.close();
    }
}
