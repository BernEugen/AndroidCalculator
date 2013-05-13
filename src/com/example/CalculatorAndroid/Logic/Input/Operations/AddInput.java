package com.example.CalculatorAndroid.Logic.Input.Operations;

import com.example.CalculatorAndroid.Logic.Calculator;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 12.05.13
 * Time: 18:39
 */
public class AddInput extends OperationsInput {
    @Override
    void executeOperation(Calculator calculator) {
        calculator.add();
    }
}
