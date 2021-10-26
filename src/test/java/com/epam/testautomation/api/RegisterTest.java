package com.epam.testautomation.api;

import com.epam.testautomation.impl.api.LoginData;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RegisterTest {
    private final String POST_CREATE_URL = "https://reqres.in/api/register";

    @Test
    public void registerFail() {
        Gson gson = new Gson();
        LoginData loginData = new LoginData();
        loginData.setEmail("sydney@fife");
        String requestBody = gson.toJson(loginData);
        int statusCode = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(POST_CREATE_URL)
                .then()
                .extract().statusCode();
        assertThat(statusCode).isEqualTo(400);
    }
}
