package main.java.com.nexient.cart.api.base;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiCore {
    private static String baseUri = "";
    private static String contentType = "application/json";

    public static Response getProductId(String pathParameterName, String pathParameterValue, String getResource) {
        Response response = given().baseUri(baseUri).pathParam(pathParameterName, pathParameterValue).log().all()
                .when().get(getResource).andReturn();
        return response;
    }
}
