package com.example.CalculatorAndroid.Logic.Input.Operations;

import com.example.CalculatorAndroid.Logic.Calculator;
import com.example.CalculatorAndroid.Logic.Input.Numbers.NumbersInput;
import com.example.CalculatorAndroid.Logic.Input.Operations.OperationsInput;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 13.05.13
 * Time: 18:30
 */
public class EqualInput extends OperationsInput {

    @Override
    void executeOperation(Calculator calculator) {
        calculator.equal();
    }
}
