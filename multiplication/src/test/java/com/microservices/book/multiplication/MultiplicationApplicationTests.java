package com.microservices.book.multiplication;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.microservices.book.domain.Multiplication;
import com.microservices.book.service.MultiplicationService;
import com.microservices.book.service.RandomGeneratorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class MultiplicationApplicationTests {

    @MockBean
    private RandomGeneratorService randomGeneratorService;

    @Autowired
    private MultiplicationService multiplicationService;
    
    @Test
    public void contextLoads() {
        assertEquals(50, 50);

    }
}
