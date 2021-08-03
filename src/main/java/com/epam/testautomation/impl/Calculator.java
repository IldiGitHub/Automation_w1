package com.epam.testautomation.impl;


import com.epam.testautomation.BaseCalculatorInterface;

public class Calculator implements BaseCalculatorInterface {

    public double addition(double a, double b) {
        double x = a + b;
        return x;
    }

    public double subtraction(double a, double b) {
        double x = a - b;
        return x;
    }

    public double multiplication(double a, double b) {
        double x = a * b;
        return x;
    }

    public double division(double a, double b) {
        double x = a / b;
        return x;
    }
}
