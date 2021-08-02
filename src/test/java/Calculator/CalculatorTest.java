package Calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void CalculatorTest(){
        Calculator calc = new Calculator();
        double a = 3;
        double b= 2;
        Assert.assertEquals(calc.addition(a, b), 5);
        Assert.assertEquals(calc.subtraction(a, b), 1);
        Assert.assertEquals(calc.multiplication(a, b), 6);
        Assert.assertEquals(calc.division(a, b), 1.5);
    }

}
