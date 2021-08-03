package com.epam.testautomation;


import com.epam.testautomation.impl.Calculator;
import com.epam.testautomation.impl.ScientificCalculator;

public class Main {
    public static void main (String[] args) {
        double a = 3;
        double b = 2;

        Calculator calc = new Calculator();
        System.out.println("Addition: " + a + " + " + b + " = " + calc.addition(a, b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + calc.subtraction(a, b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + calc.multiplication(a, b));
        System.out.println("Division: " + a + " / " + b + " = " + calc.division(a, b));

        ScientificCalculator scientificCalc = new ScientificCalculator();
        System.out.println("Power: " + a + " / " + b + " = " + scientificCalc.power(a, b));
    }
}
