package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    // Constructor
    public CricketCoach() {
        System.out.println("in constructor:" + getClass().getSimpleName());
    }
    // Coach interface method
    @Override
    public String getDailyWorkout() {
        return "Practice 15 pushups per day!!!!! NOW-:";
    }
}
