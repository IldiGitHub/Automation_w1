package com.epam.testautomation.api;

import com.epam.testautomation.impl.api.Data;
import com.epam.testautomation.impl.api.UserList;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class UserListTest {
    private static final String GET_USERLIST_URL = "https://reqres.in/api/users?page=1";

    @Test
    public void getUserList() {
        UserList userList = RestAssured
                .given()
                .when()
                .get(GET_USERLIST_URL)
                .then()
                .statusCode(200)
                .extract().body().as(UserList.class);

        List<Data> data = userList.getData();
        assertThat(data).hasSize(6);
        boolean containsJanetWeaversData = false;
        for (Data d : data) {
            if ("janet.weaver@reqres.in".equals(d.getEmail()) && "Janet".equals(d.getFirst_name()) && "Weaver".equals(d.getLast_name())) {
                containsJanetWeaversData = true;
            }
        }
        assertThat(containsJanetWeaversData).isTrue();
    }

}
