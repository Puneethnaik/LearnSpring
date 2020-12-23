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

    
}
