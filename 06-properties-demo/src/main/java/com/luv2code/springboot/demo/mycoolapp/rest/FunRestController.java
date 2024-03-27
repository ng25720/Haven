package com.luv2code.springboot.demo.mycoolapp.rest;// Import necessary classes from the Spring Framework
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Define a REST controller class
@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    @GetMapping("/teamInfo")
    public String getTeamInfo(){
        return "coach: " +coachName + ",Team name:" + teamName;
    }

    // Define a handler method for the default endpoint "/"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // Define a handler method for the "/workout" endpoint
    @GetMapping("/workout")
    public String getDailyWorkOut() {
        return "Run a hard 5k!";
    }

    // Define a handler method for the "/fortune" endpoint
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}

