package com.example.CalculatorAndroid.Logic.Input.CalculateOperations;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 09.04.13
 * Time: 0:48
 */
public class SubOperator implements BasicOperator {

    @Override
    public double compute(double... args) {
        return args[0] - args[1];
    }

}
