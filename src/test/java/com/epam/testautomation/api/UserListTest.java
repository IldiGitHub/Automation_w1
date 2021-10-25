package com.epam.testautomation.api;

import com.epam.testautomation.impl.api.Data;
import com.epam.testautomation.impl.api.UserList;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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
        boolean containsJanetWeaversData = false;
        for (Data d : data) {
            if (d.getEmail().equals("janet.weaver@reqres.in") && d.getFirst_name().equals("Janet") && d.getLast_name().equals("Weaver"))
                containsJanetWeaversData = true;
        }
        Assert.assertEquals(containsJanetWeaversData, true);
    }

}
