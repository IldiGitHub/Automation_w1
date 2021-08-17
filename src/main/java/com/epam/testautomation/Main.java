package com.epam.testautomation;


import com.epam.testautomation.impl.Calculator;
import com.epam.testautomation.impl.ScientificCalculator;
import exceptions.DivideByZeroException;

public class Main {

    /**
     * Used for putting the result of addition, subtraction, multiplication, division and power of two numbers
     * using Calculator and ScientificCalculator classes.
     *
     * @param args
     */

    public static void main(String[] args) throws DivideByZeroException {
        double a = 3;
        double b = 2;

        Calculator calc = new Calculator();
        System.out.println(String.format("Addition: %.2f + %.2f = %.2f", a, b, calc.addition(a, b)));
        System.out.println(String.format("Subtraction: %.2f - %.2f = %.2f", a, b, calc.subtraction(a, b)));
        System.out.println(String.format("Multiplication: %.2f * %.2f = %.2f", a, b, calc.multiplication(a, b)));
        System.out.println(String.format("Division: %.2f / %.2f = %.2f", a, b, calc.division(a, b)));

        ScientificCalculator scientificCalc = new ScientificCalculator();
        System.out.println(String.format("Power: %.2f ^ %.2f = %.2f", a, b, scientificCalc.power(a, b)));
    }
}
