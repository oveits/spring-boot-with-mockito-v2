package com.vocon_it.spring_boot_with_mockito.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    static final String RESPONSE = "Hello, GreetingService";

    public String greet() {
        return RESPONSE;
    }
}
