package com.demo.cxf.jaxws.helloworld;

import javax.xml.ws.Endpoint;
import org.apache.cxf.ext.logging.LoggingFeature;
public class Server {
    public static void main(String[] args) throws Exception {
        HelloWorld implementor = new HelloWorldImpl();
        Endpoint.publish("http://localhost:9090/HelloServerPort",
                implementor,
                new LoggingFeature());
        System.out.println("Server ready...");
        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting ...");
        System.exit(0);
    }
}