package com.example.CalculatorAndroid.Logic.Input.Operations;

import com.example.CalculatorAndroid.Logic.Calculator;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 13.05.13
 * Time: 20:39
 */
public class CEInput extends OperationsInput {
    @Override
    void executeOperation(Calculator calculator) {
        calculator.ce();
    }
}
