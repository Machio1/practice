package com.practice.project;

import com.practice.project.services.PracticeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.logging.Logger;

@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {
        PracticeService practiceService = new PracticeService();
        Logger logger = Logger.getLogger(PracticeApplication.class.getName());
        logger.info(practiceService.getGreeting());
        SpringApplication.run(PracticeApplication.class, args);
    }

}
