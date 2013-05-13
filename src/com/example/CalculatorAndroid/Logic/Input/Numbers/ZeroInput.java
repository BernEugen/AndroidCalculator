package com.example.CalculatorAndroid.Logic.Input.Numbers;

import com.example.CalculatorAndroid.Logic.Calculator;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 12.05.13
 * Time: 16:33
 */
public class ZeroInput extends NumbersInput {

    @Override
    void executeNumber(Calculator calculator) {
        calculator.zero();
    }
}
