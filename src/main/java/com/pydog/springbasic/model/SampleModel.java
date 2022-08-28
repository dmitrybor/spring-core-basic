package com.pydog.springbasic.model;

import org.springframework.stereotype.Component;

@Component
public class SampleModel {
    private final static String testString = "Hello World";

    public SampleModel() {
    }

    public String getTestString() {
        return testString;
    }
}
