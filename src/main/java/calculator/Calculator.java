package calculator;

import calculator.Interface.BaseCalculatorInterface;

public class Calculator implements BaseCalculatorInterface {

    /**
     * Addition is a basic operations of arithmetic.
     * The addition of two whole numbers results in the total amount or sum of those values combined.
     * @param a - augend
     * @param b - addend
     * @return - sum
     */
    public double addition(double a, double b) {
        double x = a + b;
        return x;
    }

    /**
     * Subtraction is a basic operations of arithmetic.
     * Subtraction is an operation used to find the difference between numbers.
     * @param a - minuend
     * @param b - subtrahend
     * @return - difference
     */
    public double subtraction(double a, double b) {
        double x = a - b;
        return x;
    }

    /**
     * Multiplication is a basic operations of arithmetic.
     * Multiplication is adding a number with respect to another number, repeatedly.
     * @param a - multiplier
     * @param b - multiplicand
     * @return - product
     */
    public double multiplication(double a, double b) {
        double x = a * b;
        return x;
    }

    /**
     * Division is a basic operations of arithmetic.
     * Division is the process of calculating the number of times one number is contained within another.
     * @param a - dividend
     * @param b - divisor
     * @return - quotient
     */
    public double division(double a, double b) {
        double x = a / b;
        return x;
    }
}
