package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy


public class TrackCooach implements Coach{
    public TrackCooach(){
        System.out.println("in constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "RUN a HARD 5K";
    }
}
