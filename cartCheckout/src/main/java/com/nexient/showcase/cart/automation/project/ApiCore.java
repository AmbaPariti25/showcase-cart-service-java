package com.nexient.showcase.cart.automation.project;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class piCore {
    private static String baseUri = "";
    private static String contentType = "application/json";

    public static Response getProductId(String pathParameterName, String pathParameterValue, String getResource) {
        Response response = given().baseUri(baseUri).pathParam(pathParameterName, pathParameterValue).log().all()
                .when().get(getResource).andReturn();
        return response;
    }
}
