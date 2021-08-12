package com.epam.testautomation;

import io.qameta.allure.Step;
import org.testng.Assert;

public class TestSteps {

    @Step("Verifying that the {0} and {1} are equal")
    public void checkEquals(double a, double b) {
        Assert.assertEquals(a, b);
    }
}
