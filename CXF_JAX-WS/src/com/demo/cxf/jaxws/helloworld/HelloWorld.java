package com.demo.cxf.jaxws.helloworld;

//HelloWorld.java
import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String greetings(String text);
}