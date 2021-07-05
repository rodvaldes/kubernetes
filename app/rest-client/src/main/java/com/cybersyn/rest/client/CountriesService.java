package com.cybersyn.rest.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Set;

@Path("/v2")
@RegisterRestClient(configKey="country-api")
public interface CountriesService {
    @GET
    @Path("/name/{name}")
    Set<Country> getByName(@PathParam String name);

    @GET
    @Path("/name/{region}")
    Set<Country> getByRegion(@PathParam String region, @QueryParam("city") String city);
}
