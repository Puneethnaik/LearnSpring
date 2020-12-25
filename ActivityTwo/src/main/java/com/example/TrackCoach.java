package com.example;

public class TrackCoach implements Coach {
    FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k.";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it" + fortuneService.getFortune();
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
        System.out.println("Inside no arg constructor");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside the setter method setFortuneService");
        this.fortuneService = fortuneService;
    }

    
}
