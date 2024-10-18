package com.petstore.baseTeste;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BaseTest {

    private String finalUrl;

    public String getBaseUrl() {
        return baseUrl();
    }

    public String baseUrl() {
        return this.finalUrl;
    }

    public RequestSpecification build() throws Exception {

        boolean test = true;
        if (test) return new RequestSpecBuilder()
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "special-key")
                .addHeader("accept", "*/*")
                .build()
                .log().all();
        else {
            return new RequestSpecBuilder()
                    .addHeader("Content-Type", "application/json")
                    .addHeader("accept", "*/*")
                    .build()
                    .log().all();
        }
    }
}
