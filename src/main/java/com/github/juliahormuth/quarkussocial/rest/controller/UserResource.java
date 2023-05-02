package com.github.juliahormuth.quarkussocial.rest.controller;

import com.github.juliahormuth.quarkussocial.rest.dto.CreateUserRequest;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @POST
    public Response createUser(CreateUserRequest createUserRequest) {

        return Response.ok(createUserRequest).build();
    }

    @GET
    public Responsee listAllUser() {
        return Respose.ok().build();
    }
}
