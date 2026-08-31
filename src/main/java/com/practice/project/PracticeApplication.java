package com.practice.project;

import com.practice.project.services.PracticeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {
        PracticeService practiceService = new PracticeService();
        String greeting = practiceService.getGreeting();
        System.out.println(greeting);
        SpringApplication.run(PracticeApplication.class, args);
    }

}
