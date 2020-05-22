package com.vocon_it.spring_boot_with_mockito.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class GreetingServiceTest {

    static final String EXPECTED_RESPONSE = "Hello, GreetingService\n";
    static final String EXPECTED_SUBSTRING = "Hello, GreetingService";
    static final String WRONG_SUBSTRING = "BLA BLUB";

    @Autowired
    private GreetingService greetingService;

    @Test
    public void greetingServiceGreet_getCorrectResponse() {

        // given
        String responseString = greetingService.greet();

        // Spring Asserts:
        Assert.isTrue(responseString.equals(EXPECTED_RESPONSE), responseString + " should be equal the EXPECTED_RESPONSE = \"" + EXPECTED_RESPONSE + "\"");
        Assert.isTrue(responseString.contains(EXPECTED_SUBSTRING), responseString + " should match EXPECTED_SUBSTRING = \"" + EXPECTED_SUBSTRING + "\"");
        Assert.isTrue(!responseString.contains(WRONG_SUBSTRING), responseString + " should not match WRONG_SUBSTRING = \"" + WRONG_SUBSTRING + "\"");

        // Same with JUnit Jupiter:
        assertEquals(EXPECTED_RESPONSE, responseString);
        assertThat(responseString).contains(EXPECTED_SUBSTRING);
        assertThat(responseString).doesNotContain(WRONG_SUBSTRING);

        // Beware: the following parenthesis are wrong, leading to false negatives:
        // assertThat(responseString.contains(EXPECTED_SUBSTRING));  // <--- wrong!

    }
}