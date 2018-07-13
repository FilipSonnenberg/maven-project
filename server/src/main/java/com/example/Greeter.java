package com.example;

/**
 * This is a class.
 */
public class Greeter {

    /**
     * This is a constructor.
     */
    public Greeter() {
    }

    /**
     * @param someone
     * @return string with greetings and someone's name
     */
    public final String greet(final String someone) {
        return String.format("Hello, %s!", someone);
    }
}
