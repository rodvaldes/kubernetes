package com.cybersyn.rest.client;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CountriesResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/country/name/chile")
          .then()
             .statusCode(200)
                .body("$.size()", is(1),
                        "[0].alpha2Code", is("CL"),
                        "[0].capital", is("Santiago"),
                        "[0].currencies.size()", is(1),
                        "[0].currencies[0].name", is("CLP")
    }

    @Test
    public void testCountryEndpoint(){

    }

}