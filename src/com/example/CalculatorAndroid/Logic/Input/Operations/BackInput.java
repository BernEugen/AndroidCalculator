package com.example.CalculatorAndroid.Logic.Input.Operations;

import com.example.CalculatorAndroid.Logic.Calculator;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 17.05.13
 * Time: 22:40
 */
public class BackInput extends OperationsInput {

    @Override
    void executeOperation(Calculator calculator) {
        calculator.back();
    }
}
