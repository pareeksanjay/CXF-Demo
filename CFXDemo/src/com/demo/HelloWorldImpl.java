package com.demo;

//HelloWorldImpl.java
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String greetings(String text) {
        return "Hi "+ text;
    }
}
