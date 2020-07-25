package com.demo.cxf.rs.movie;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
public class Server {
    public static void main(String[] args) throws Exception {
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
        factory.setResourceClasses(Movie.class);
        factory.setResourceClasses(MovieService.class);
        factory.setResourceProvider(MovieService.class,
                new SingletonResourceProvider(new MovieService()));
        factory.setAddress("http://localhost:9000/");
        factory.create();

        System.out.println("Server ready...");
        Thread.sleep(5 * 60 * 1000);

        System.out.println("Server exiting ...");
        System.exit(0);
    }
}
