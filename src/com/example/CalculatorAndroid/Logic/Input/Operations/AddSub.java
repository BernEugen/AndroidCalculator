package com.example.CalculatorAndroid.Logic.Input.Operations;

import com.example.CalculatorAndroid.Logic.Calculator;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 17.05.13
 * Time: 8:14
 */
public class AddSub extends OperationsInput {

    @Override
    void executeOperation(Calculator calculator) {
        calculator.addSub();
    }
}
