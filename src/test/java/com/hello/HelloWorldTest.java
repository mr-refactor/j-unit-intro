package com.hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    private final HelloWorld helloWorld = new HelloWorld();

    @Test
    void greetingTest() {
        String greeting = HelloWorld.greeting();
        assertEquals("Hello World!", greeting);
    }
}