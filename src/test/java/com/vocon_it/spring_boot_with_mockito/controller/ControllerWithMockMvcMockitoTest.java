package com.vocon_it.spring_boot_with_mockito.controller;

import com.vocon_it.spring_boot_with_mockito.service.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 *  ControllerWithMockMvcMockitoTest: does not start the server, but directly attaches to the controller via MockMVC.
 *
 *  The test does not call the GreetingService. Instead, Mockito is intercepting the service call.
 */
@SpringBootTest
@AutoConfigureMockMvc
public class ControllerWithMockMvcMockitoTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GreetingService service;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        when(service.greet()).thenReturn("Hello, Mock");

        this.mockMvc.perform(
                get("/greeting"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, Mock"))
                );
    }

}
