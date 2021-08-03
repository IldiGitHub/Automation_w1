package calculator;

import calculator.Interface.ScientificCalculatorInterface;

public class ScientificCalculator extends Calculator implements ScientificCalculatorInterface {
    /**
     * Power is an expression that describes repeated multiplication of the same number.
     * @param a - base
     * @param b - exponent
     * @return - power
     */
    public double power(double a, double b) {
        double x = Math.pow(a, b);
        return x;
    }
}
