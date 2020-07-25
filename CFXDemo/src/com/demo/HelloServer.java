package com.demo;


import org.apache.cxf.frontend.ServerFactoryBean;

public class HelloServer {
    protected HelloServer() throws Exception {
        ServerFactoryBean factory = new ServerFactoryBean();
        factory.setServiceClass(HelloWorld.class);
        factory.setAddress("http://localhost:5000/Hello");
        factory.setServiceBean(new HelloWorldImpl());
        factory.create();
    }
    public static void main(String[] args) throws Exception {
        new HelloServer();
        System.out.println("Listening on port 5000 ...");
        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting ...");
        System.exit(0);
    }
}