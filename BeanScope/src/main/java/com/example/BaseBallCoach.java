package com.example;

public class BaseBallCoach implements Coach {
    FortuneService fortuneService;
    
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }

    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    public BaseBallCoach() {
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}