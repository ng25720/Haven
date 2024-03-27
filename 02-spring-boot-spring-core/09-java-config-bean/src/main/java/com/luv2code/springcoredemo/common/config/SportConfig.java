package com.luv2code.springcoredemo.common.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach; // Corrected class name
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    // Bean definition for swimCoach
    @Bean("acquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
