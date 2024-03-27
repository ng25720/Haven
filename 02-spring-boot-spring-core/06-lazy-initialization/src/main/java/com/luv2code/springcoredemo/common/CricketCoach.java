package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("in constructor:"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 15 pushups per day!!!!! NOW-:";
    }
}
