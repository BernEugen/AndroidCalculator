package com.example.CalculatorAndroid.Logic;

import com.example.CalculatorAndroid.Logic.Input.CalculateOperations.BasicOperator;
import com.example.CalculatorAndroid.Logic.Input.CalculateOperations.Compute;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 12.05.13
 * Time: 16:39
 */
public class CalculatorDisplay implements Calculator {

    private String displayText = "0";
    private double argument1;
    private double argument2;
    private String operator;
    private Compute compute;
    private BasicOperator basicOperator;
    private String[] resultParser;

    @Override
    public void zero() {
        if (!displayText.equals("0")) {
            displayText += "0";
        }
    }

    @Override
    public void one() {
        if (displayText.equals("0")) {
            displayText = "1";
        } else {
            displayText += "1";
        }
    }

    @Override
    public void two() {
        if (displayText.equals("0")) {
            displayText = "2";
        } else {
            displayText += "2";
        }
    }

    @Override
    public void three() {
        if (displayText.equals("0")) {
            displayText = "3";
        } else {
            displayText += "3";
        }
    }

    @Override
    public void four() {
        if (displayText.equals("0")) {
            displayText = "4";
        } else {
            displayText += "4";
        }
    }

    @Override
    public void five() {
        if (displayText.equals("0")) {
            displayText = "5";
        } else {
            displayText += "5";
        }
    }

    @Override
    public void six() {
        if (displayText.equals("0")) {
            displayText = "6";
        } else {
            displayText += "6";
        }
    }

    @Override
    public void seven() {
        if (displayText.equals("0")) {
            displayText = "7";
        } else {
            displayText += "7";
        }
    }

    @Override
    public void eight() {
        if (displayText.equals("0")) {
            displayText = "8";
        } else {
            displayText += "8";
        }
    }

    @Override
    public void nine() {
        if (displayText.equals("0")) {
            displayText = "9";
        } else {
            displayText += "9";
        }
    }

    @Override
    public void subtract() {

        operator = "-";

        if (!displayText.equals("0")) {
            displayText += "-";
        }
    }

    @Override
    public void add() {

        operator = "+";

        if (!displayText.equals("0")) {
            displayText += "+";
        }
    }

    @Override
    public void multiply() {

        operator = "*";

        if (!displayText.equals("0")) {
            displayText += "*";
        }
    }

    @Override
    public void divide() {

        operator = "/";

        if (!displayText.equals("0")) {
            displayText += "/";
        }
    }

    @Override
    public void ce() {
        displayText = "0";
    }

    @Override
    public void addSub() {
        if (displayText.startsWith("-")) {
            displayText = displayText.substring(1, displayText.length());
        } else {
            displayText = "-" + displayText;
        }
    }

    @Override
    public void separator() {
        displayText += ".";
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

        resultParser = displayText.split("[-+*/]");

        argument1 = Double.valueOf(resultParser[0]);
        argument2 = Double.valueOf(resultParser[1]);

        compute = new Compute();
        basicOperator = compute.computing(operator);
        double result = basicOperator.compute(argument1, argument2);

        displayText = String.valueOf(result);
    }

    @Override
    public String getDisplay() {
        return displayText;
    }
}
