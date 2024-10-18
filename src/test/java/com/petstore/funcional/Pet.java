package com.petstore.funcional;

import com.petstore.baseTeste.BaseTest;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_CREATED;

public class Pet extends BaseTest {


    private static final String BASE_URL = "https://petstore.swagger.io";
    private static final String PATH_URI_ADD_NOTIFICATION = "/v2/pet";
    String finalUrl = BASE_URL + PATH_URI_ADD_NOTIFICATION;


    @Test
    public void petPost() throws Exception {
        given()
                .spec(build())
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .log().all()
                .when()
                .post(finalUrl)
                .then()
                .assertThat()
                .statusCode(SC_CREATED);

    }
}