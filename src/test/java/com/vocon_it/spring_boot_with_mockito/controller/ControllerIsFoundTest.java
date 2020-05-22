package com.vocon_it.spring_boot_with_mockito.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ControllerIsFoundTest: Tests that the (Home) controller is found and valid.
 */
@SpringBootTest
public class ControllerIsFoundTest {

    @Autowired
    private HomeController controller;

    /**
     *
     * @throws Exception
     */
    @Test
    public void runContext_controllerIsValid() throws Exception {
        assertThat(controller).isNotNull();
    }

}
