package com.epam.testautomation.api;

import com.epam.testautomation.impl.api.ReqResUser;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.time.Clock;
import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateUserTest {
    private final String POST_CREATE_URL = "https://reqres.in/api/users";
    private final String name = "morpheus";
    private final String job = "leader";


    public String createUserBody() {
        Gson gson = new Gson();
        ReqResUser reqResUser = new ReqResUser(name, job);
        String responseBody = gson.toJson(reqResUser);
        return responseBody;
    }

    public ReqResUser createUserResponse(String requestBody, int statusCode) {
        ReqResUser createUserResponse = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post()
                .then()
                .statusCode(statusCode)
                .extract().body().as(ReqResUser.class);
        return createUserResponse;
    }

    @Test
    public void postCreateUserTest() {
        ReqResUser createUserResponse = createUserResponse(createUserBody(), 201);
        assertThat(createUserResponse.getName()).isEqualTo(name);
        assertThat(createUserResponse.getJob()).isEqualTo(job);
        assertThat(createUserResponse.getId()).isNotNull();
        Instant utcTime = Clock.systemUTC().instant();
        assertThat(createUserResponse.getCreatedAt()).isBetween(utcTime.minusSeconds(10).toString(), utcTime.toString());
    }
    
}