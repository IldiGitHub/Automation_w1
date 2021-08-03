package Calculator;

import Calculator.Interface.BaseCalculatorInterface;
import Calculator.Interface.ScientificCalculatorInterface;

public class ScientificCalculator extends Calculator implements ScientificCalculatorInterface {
    public double power(double a, double b) {
        double x = Math.pow(a, b);
        return x;
    }
}
