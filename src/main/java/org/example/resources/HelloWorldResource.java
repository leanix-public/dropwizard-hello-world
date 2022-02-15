package org.example.resources;

import org.example.core.model.HelloWorld;
import org.example.core.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/")
@Produces(APPLICATION_JSON)
public class HelloWorldResource {

    private final UserService userServiceImpl;

    @Inject
    public HelloWorldResource(UserService userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GET
    public HelloWorld getHello() {
        System.out.println(userServiceImpl.getUser());
        return HelloWorld.builder()
                .message("Hello world!")
                .build();
    }
}
