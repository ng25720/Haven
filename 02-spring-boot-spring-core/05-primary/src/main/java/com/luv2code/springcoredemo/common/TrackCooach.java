package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class TrackCooach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "RUN a HARD 5K";
    }
}
