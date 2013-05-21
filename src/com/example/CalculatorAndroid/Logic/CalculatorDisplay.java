package com.example.CalculatorAndroid.Logic;

import com.example.CalculatorAndroid.Logic.Input.CalculateOperations.CalculateOperator;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 12.05.13
 * Time: 16:39
 */
public class CalculatorDisplay implements Calculator {

    private String displayText = "0";
    private String operator;
    private boolean isOperatorPressed;
    private boolean isSeparatorPressed;
    CalculateOperator calculateOperator;

    public CalculatorDisplay() {
        calculateOperator = new CalculateOperator();
    }

    @Override
    public void zero() {
        setNumber("0");
    }

    @Override
    public void one() {
        setNumber("1");
    }

    @Override
    public void two() {
        setNumber("2");
    }

    @Override
    public void three() {
        setNumber("3");
    }

    @Override
    public void four() {
        setNumber("4");
    }

    @Override
    public void five() {
        setNumber("5");
    }

    @Override
    public void six() {
        setNumber("6");
    }

    @Override
    public void seven() {
        setNumber("7");
    }

    @Override
    public void eight() {
        setNumber("8");
    }

    @Override
    public void nine() {
        setNumber("9");
    }

    public void setNumber(String number) {
        if (displayText.equals("0")) {
            displayText = number;
        } else {
            displayText += number;
        }
    }

    @Override
    public void subtract() {
        setOperator("-");
    }

    @Override
    public void add() {
        setOperator("+");
    }

    @Override
    public void multiply() {
        setOperator("*");
    }

    @Override
    public void divide() {
        setOperator("/");
    }

    public void setOperator(String operator) {
        this.operator = operator;
        if (!displayText.equals("0")) {
            if (!isOperatorPressed) {
                displayText += operator;
                isOperatorPressed = true;
                isSeparatorPressed = false;
            }
        }
    }

    @Override
    public void ce() {
        displayText = "0";
        isOperatorPressed = false;
        isSeparatorPressed = false;
    }

    @Override
    public void sqrt() {
        displayText = calculateOperator.countSqrt(displayText);
    }

    @Override
    public void fraction() {
        displayText = calculateOperator.countFract(displayText);
    }

    @Override
    public void separator() {
        if (!isSeparatorPressed) {
            displayText += ".";
            isSeparatorPressed = true;
        }
    }

    @Override
    public void back() {
        if (displayText.isEmpty()) {
            displayText = "0";
        } else {
            displayText = displayText.substring(0, displayText.length() - 1);
        }
    }

    @Override
    public void equal() {
        displayText = calculateOperator.calculate(displayText, operator);
        isOperatorPressed = false;
        isSeparatorPressed = true;
    }

    @Override
    public String getDisplay() {
        return displayText;
    }

}

















