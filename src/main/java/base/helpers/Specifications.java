package helpers;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static base.helpers.Constants.BASE_URL_2;

public class Specifications {
    public static RequestSpecification requestSpecification( String url) {
        return new RequestSpecBuilder()
                .addFilter(new AllureRestAssured())
                .setBaseUri(BASE_URL_2 +url)
                .setContentType(ContentType.JSON)
                .build();
    }
    public static ResponseSpecification requestSpecification(int statusCode) {
        return new ResponseSpecBuilder()
                .expectStatusCode(statusCode)
                .build();
    }
    public static void getSpecifications(
            RequestSpecification requestSpecification, ResponseSpecification responseSpecification
    ) {

        RestAssured.requestSpecification = requestSpecification;
        RestAssured.responseSpecification = responseSpecification;

    }
}
