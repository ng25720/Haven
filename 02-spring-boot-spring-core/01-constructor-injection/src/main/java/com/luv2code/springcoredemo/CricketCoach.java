package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;
@Component

public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "parctice 15 pushups per day!!!!!NOWs";
    }
}
