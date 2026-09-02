package com.practice.project.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PracticeServiceTest {

    @Test
    void getGreeting_returnsString() {
        PracticeService practiceService = new PracticeService();
        assertEquals("Hello, World!", practiceService.getGreeting());
    }

}