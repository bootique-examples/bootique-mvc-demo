package io.bootique.mvc.demo.contoller;

import io.bootique.mvc.demo.model.User;
import io.bootique.mvc.demo.view.PageView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class BootiqueController {

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Hello, bootique!!";
    }

    @GET
    public PageView home() {
        User user = new User("user","password","bootique");
        return new PageView("page.mustache", user);
    }
}