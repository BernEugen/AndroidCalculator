package com.example.CalculatorAndroid.Logic.Input.Numbers;

import com.example.CalculatorAndroid.Logic.Calculator;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 12.05.13
 * Time: 17:26
 */
public class OneInput extends NumbersInput {

    @Override
    void executeNumber(Calculator calculator) {
        calculator.one();
    }
}
