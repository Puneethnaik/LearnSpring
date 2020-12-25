package com.example;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    private String email;
    private String team;


    
    @Override
    public String getDailyWorkout() {
        return "Practice batting for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It : " + fortuneService.getFortune();
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside the setter method setFortuneService");
        this.fortuneService = fortuneService;
    }
    
}
