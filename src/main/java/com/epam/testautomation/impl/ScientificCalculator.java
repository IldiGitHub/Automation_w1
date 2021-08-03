package com.epam.testautomation.impl;


import com.epam.testautomation.ScientificCalculatorInterface;


public class ScientificCalculator extends Calculator implements ScientificCalculatorInterface {
    public double power(double a, double b) {
        double x = Math.pow(a, b);
        return x;
    }
}
