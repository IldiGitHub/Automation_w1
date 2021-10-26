package com.epam.testautomation.api;

import com.epam.testautomation.impl.api.Data;
import com.epam.testautomation.impl.api.User;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
    private final String GET_USER_URL = "https://reqres.in/api/users/";

    public String setGetUserUrl(String parameter) {
        return GET_USER_URL + parameter;
    }

    @BeforeTest
    public void setBaseUri() {
        RestAssured.baseURI = GET_USER_URL;
    }

    @Test
    public void getUserTest() {
        User user = RestAssured
                .given()
                .when()
                .get("2")
                .then()
                .statusCode(200)
                .extract().body().as(User.class);

        Data data = user.getData();
        assertThat(data.getEmail()).isEqualTo("janet.weaver@reqres.in");
        assertThat(data.getFirst_name()).isEqualTo("Janet");
        assertThat(data.getLast_name()).isEqualTo("Weaver");
    }

    @Test
    public void getUserNotExisting() {
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("23");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 404);
    }
}
