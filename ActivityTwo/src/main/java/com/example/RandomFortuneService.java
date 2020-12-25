package com.example;
import com.example.FortuneService;

public class RandomFortuneService implements FortuneService{
    private String[] randomFortunes;
    public RandomFortuneService() {
        randomFortunes = new String[] {"Just Do It", "Dont Waste Your Time", "Be Positive"};
    }
    @Override
    public String getFortune() {
        return this.randomFortunes[(int)Math.ceil(Math.random() * 2)];
    }
}
