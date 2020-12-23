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
        CricketCoach coach = context.getBean("myCoach", CricketCoach.class);
        //call methods on the bean
        System.out.println(coach.getDailyWorkout());
        // call the daily fortune from the coach
        System.out.println(coach.getDailyFortune());
        System.out.println("Contact details of the coach: ");
        System.out.println(coach.getEmail() + "\n" + coach.getTeam());
        //close the context
        context.close();
    }
}
