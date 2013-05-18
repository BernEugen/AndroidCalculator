package com.example.CalculatorAndroid.Logic.Input.CalculateOperations;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 16.05.13
 * Time: 21:07
 */
public class AddOperator implements BasicOperator {
    @Override
    public double compute(double... args) {
        return args[0] + args[1];
    }
}
