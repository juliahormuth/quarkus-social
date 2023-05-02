package com.github.juliahormuth.quarkussocial.rest.controller;

import com.github.juliahormuth.quarkussocial.domain.model.User;
import com.github.juliahormuth.quarkussocial.rest.dto.CreateUserRequest;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.transaction.Transactional;
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
    @Transactional
    public Response createUser(CreateUserRequest createUserRequest) {

        User user = new User();
        user.setName(createUserRequest.getName());
        user.setAge(createUserRequest.getAge());

        user.persist();

        return Response.ok(user).build();
    }

    @GET
    public Response listAllUser() {
        PanacheQuery<PanacheEntityBase> query = User.findAll();
        return Respose.ok(query.list()).build();
    }
}
