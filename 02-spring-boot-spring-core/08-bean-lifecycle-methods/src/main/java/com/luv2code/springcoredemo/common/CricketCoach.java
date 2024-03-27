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

    // Init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }

    // Destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }

    // Coach interface method
    @Override
    public String getDailyWorkout() {
        return "Practice 15 pushups per day!!!!! NOW-:";
    }
}
