package com.example.nelsonle;

import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalTime;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    
    @GetMapping("/")
    public String welcome() {
        LocalTime currentTime = LocalTime.now();
        String greeting = (currentTime.isBefore(LocalTime.NOON)) 
            ? "Good morning, Nelson, Welcome to COMP367"
            : "Good afternoon, Nelson, Welcome to COMP367";
        return greeting;
    }
}
