package com.epam.testautomation;

import com.epam.testautomation.impl.Calculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    private TestSteps testSteps;

    @BeforeClass
    public void setup() {
        testSteps = new TestSteps();
    }


    @Test(description = "Testing the Basic calculator")
    public void CalculatorTest() {
        Calculator calc = new Calculator();
        double a = 3;
        double b = 2;
        testSteps.checkEquals(calc.addition(a, b), 5);
        testSteps.checkEquals(calc.subtraction(a, b), 1);
        testSteps.checkEquals(calc.multiplication(a, b), 6);
        testSteps.checkEquals(calc.division(a, b), 1.5);
    }
}
