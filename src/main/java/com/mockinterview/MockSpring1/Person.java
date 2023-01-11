package com.mockinterview.MockSpring1;

public class Person {
    private String name;
    private long aadharNumber;

    public Person() {
    }

    public Person(String name, long aadharNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
    }

    // Only getters were required rest was not needed
    public long getAadharNumber() {
        return aadharNumber;
    }

    public String getName() {
        return name;
    }
}
