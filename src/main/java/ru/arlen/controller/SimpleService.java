package ru.arlen.controller;

import ru.arlen.dao.DAO;
import ru.arlen.dao.DAOImpl;
import ru.arlen.entity.LocationInfo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;

@Path("/")
public class SimpleService {
    DAO dao = new DAOImpl();

    @GET
    @Path("/login/{recordId}")
    @Produces(MediaType.APPLICATION_JSON)
    public LocationInfo sayHello(@PathParam("recordId") int recordId) {
        return dao.getLocationInfo(recordId);
    }
}