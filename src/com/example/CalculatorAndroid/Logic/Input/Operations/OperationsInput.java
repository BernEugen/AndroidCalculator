package com.example.CalculatorAndroid.Logic.Input.Operations;

import android.widget.TextView;
import com.example.CalculatorAndroid.Logic.Actions;
import com.example.CalculatorAndroid.Logic.Calculator;

import java.util.Enumeration;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 12.05.13
 * Time: 18:25
 */
public abstract class OperationsInput implements Actions {

    abstract void executeOperation(Calculator calculator);

    @Override
    public void setDisplayInput(Calculator calculator, TextView display) {
        executeOperation(calculator);
        display.setText(calculator.getDisplay());
    }
}
