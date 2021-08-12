package calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScientificCalculatorTest {

    ScientificCalculator scientificCalc;
    double a;
    double b;

    @BeforeTest
    public void setup() {
        scientificCalc = new ScientificCalculator();
        a = 6;
        b = 3;
    }

    @Test
    public void scientificCalculatorTest() {
        Assert.assertEquals(scientificCalc.addition(a, b), 9);
        Assert.assertEquals(scientificCalc.subtraction(a, b), 3);
        Assert.assertEquals(scientificCalc.multiplication(a, b), 18);
        Assert.assertEquals(scientificCalc.division(a, b), 2);
        Assert.assertEquals(scientificCalc.power(a, b), 216);
    }

    @Test
    public void negativeTestCases() {
        Assert.assertNotEquals(scientificCalc.addition(a, b), 7);
        Assert.assertNotEquals(scientificCalc.subtraction(a, b), 4);
    }

    @Test
    public void failByDesign() {
        Assert.assertNotEquals(scientificCalc.addition(a, b), 9);
    }

    @Test(expectedExceptions = java.lang.NullPointerException.class)
    public void expectedExceptionTest() {
        ScientificCalculator scientificCalc2 = null;
        Assert.assertEquals(scientificCalc2.division(a, b), 2);
    }
}
