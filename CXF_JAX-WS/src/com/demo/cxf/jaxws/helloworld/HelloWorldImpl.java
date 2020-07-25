package com.demo.cxf.jaxws.helloworld;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public String greetings(String name) {
        return ("hi " + name);
    }
}