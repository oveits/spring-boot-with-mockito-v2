package com.vocon_it.spring_boot_with_mockito.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private SmokeTest controller;

    /**
     *
     * @throws Exception
     */
    @Test
    public void runContext_controllerIsValid() throws Exception {
        assertThat(controller).isNotNull();
    }

}
