package apiTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.createUser.CreateUserRequest;
import pojos.createUser.CreateUserResponse;
import pojos.createUser.LoginUser;

import static helpers.Specifications.getSpecifications;
import static helpers.Specifications.requestSpecification;
import static io.restassured.RestAssured.given;

public class BaseApiTest {
    @Test(groups = "regression", priority = 1, description = "API:Check user can create account")
    public void createUser() {
        getSpecifications(requestSpecification("/users"), requestSpecification(201));
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUsername("bfdbbfdttdfb47");
        createUserRequest.setPassword("Luda1996@");
        CreateUserResponse createUserResponse = given()
                .body(createUserRequest)
                .when()
                .post()
                .then()
                .log().body()
                .log().status()
                .extract()
                .as(CreateUserResponse.class);
       Assert.assertNotNull(createUserResponse);

       Assert.assertEquals(createUserRequest.getUsername(), createUserResponse.getUsername());
    }
    @Test(groups = "regression", priority = 1, description = "API:Check user can login")
    public void authCreate() {

        LoginUser loginUser = new LoginUser("bfdbbfdttdfb47", "Luda1996@");
        getSpecifications(requestSpecification("/auth"), requestSpecification(200));
        String accessToken = given()
                .body(loginUser)
                .when()
                .post()
                .then()
                .log().body()
                .extract()
                .path("access");

        Assert.assertNotNull(accessToken, "Token should not be null!");
        System.out.println("TOKEN: " + accessToken);


        getSpecifications(requestSpecification("/auth"), requestSpecification(200));
        CreateUserResponse createUserResponse = new CreateUserResponse();
        getSpecifications(requestSpecification("/auth/me"), requestSpecification(200));
        CreateUserResponse userInfo = given()
                .header("Authorization", "Bearer " + accessToken)
                .when()
                .get()
                .then()
                .log().body()
                .extract()
                .as(CreateUserResponse.class);
        Assert.assertNotNull(accessToken, "Token should not be null!");


    }


}
