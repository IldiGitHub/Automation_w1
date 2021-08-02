package Calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ScientificCalculatorTest {

    @Test
    public void ScientificCalculatorTest(){
        ScientificCalculator scientificCalc = new ScientificCalculator();
        double a = 6;
        double b= 3;
        Assert.assertEquals(scientificCalc.addition(a, b), 9);
        Assert.assertEquals(scientificCalc.subtraction(a, b), 3);
        Assert.assertEquals(scientificCalc.multiplication(a, b), 18);
        Assert.assertEquals(scientificCalc.division(a, b), 2);
        Assert.assertEquals(scientificCalc.power(a, b), 216);
    }
}
