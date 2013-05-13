package com.example.CalculatorAndroid.Logic.Input.Numbers;

import android.widget.TextView;
import com.example.CalculatorAndroid.Logic.Actions;
import com.example.CalculatorAndroid.Logic.Calculator;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 12.05.13
 * Time: 16:25
 */
public abstract class NumbersInput implements Actions {

    abstract void executeNumber(Calculator calculator);

    @Override
    public void setDisplayInput(Calculator calculator, TextView display) {
        executeNumber(calculator);
        display.setText(calculator.getDisplay());
    }
}
