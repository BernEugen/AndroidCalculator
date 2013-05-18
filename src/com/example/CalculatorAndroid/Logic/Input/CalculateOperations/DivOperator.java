package com.example.CalculatorAndroid.Logic.Input.CalculateOperations;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 16.05.13
 * Time: 23:44
 */
public class DivOperator implements BasicOperator {

    @Override
    public double compute(double... args) {
        if (args[1] == 0) {
            return 0;
        }
        return args[0] / args[1];
    }
}
