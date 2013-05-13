package com.example.CalculatorAndroid.Logic.Input.Operations;

import com.example.CalculatorAndroid.Logic.Calculator;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 12.05.13
 * Time: 18:41
 */
public class MultiplyInput extends OperationsInput {
    @Override
    void executeOperation(Calculator calculator) {
        calculator.multiply();
    }
}
