package com.example.CalculatorAndroid.Logic.Input.Operations;

import com.example.CalculatorAndroid.Logic.Calculator;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 19.05.13
 * Time: 12:32
 */
public class FractionInput extends OperationsInput {

    @Override
    void executeOperation(Calculator calculator) {
        calculator.fraction();
    }
}
