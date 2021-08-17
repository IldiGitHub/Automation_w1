package com.epam.testautomation;

import exceptions.DivideByZeroException;

public interface BaseCalculatorInterface {
    double addition(double a, double b);

    double subtraction(double a, double b);

    double multiplication(double a, double b);

    double division(double a, double b) throws DivideByZeroException;
}

