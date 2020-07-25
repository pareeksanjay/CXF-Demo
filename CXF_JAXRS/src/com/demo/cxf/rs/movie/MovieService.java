package com.demo.cxf.rs.movie;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/movieservice/")
@Produces("text/xml")
public class MovieService {
    Map<Long, Movie> movies = new HashMap<>();
    public MovieService() {
        init();
    }
    @GET
    @Path("/movie/{id}/")
    public Movie getMovie(@PathParam("id") String id) {
        long idNumber = Long.parseLong(id);
        return movies.get(idNumber);
    }
    final void init() {
        Movie c1 = new Movie();
        c1.setName("Aquaman");
        c1.setId(1001);
        movies.put(c1.getId(), c1);

        Movie c2 = new Movie();
        c2.setName("Mission Imposssible");
        c2.setId(1002);
        movies.put(c2.getId(), c2);

        Movie c3 = new Movie();
        c3.setName("Black Panther");
        c3.setId(1003);
        movies.put(c3.getId(), c3);

        Movie c4 = new Movie();
        c4.setName("A Star is Born");
        c4.setId(1004);
        movies.put(c4.getId(), c4);

        Movie c5 = new Movie();
        c5.setName("The Meg");
        c5.setId(1005);
        movies.put(c5.getId(), c5);
    }
}