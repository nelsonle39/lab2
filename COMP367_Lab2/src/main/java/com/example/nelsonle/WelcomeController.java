package com.example.nelsonle;

import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalTime;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	//Adding this comment to test auto trigger
	@GetMapping("/")
	public String welcome() {
	    LocalTime currentTime = LocalTime.now();
	    String greeting = (currentTime.isBefore(LocalTime.NOON)) 
	        ? "Good morning, Nelson, Welcome to COMP367"
	        : "Good afternoon, Nelson, Welcome to COMP367";
	    return greeting;
	}

<<<<<<< HEAD
	@GetMapping("/")
	public String welcome() {
	    LocalTime currentTime = LocalTime.now();
	    String greeting = (currentTime.isBefore(LocalTime.NOON)) 
	        ? "Good morning, Nelson, Welcome to COMP367"
	        : "Good afternoon, Nelson, Welcome to COMP367";
	    return greeting;
	}
=======
	
>>>>>>> branch 'master' of https://github.com/nelsonle39/lab2.git
}
