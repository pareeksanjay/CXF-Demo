package com.demo.cxf.rs.movie;

import java.io.InputStream;
import java.net.URL;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.io.CachedOutputStream;
public class Client {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9000/movieservice/movie/1002");
        try (InputStream instream = url.openStream();
             CachedOutputStream outstream = new CachedOutputStream()) {
            IOUtils.copy(instream, outstream);
            String str = outstream.getOut().toString();
            System.out.println(str);
        }
    }
}