package com.example.CalculatorAndroid.Logic;

import android.widget.Toast;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 12.05.13
 * Time: 16:39
 */
public class CalculatorDisplay implements Calculator {

    private String displayText = "0";
    private String argument1;

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
        if (!displayText.equals("0")) {
            displayText += "-";
        }
    }

    @Override
    public void add() {
        if (!displayText.equals("0")) {
            displayText += "+";
        }
    }

    @Override
    public void multiply() {
        if (!displayText.equals("0")) {
            displayText += "*";
        }
    }

    @Override
    public void divide() {
        if (!displayText.equals("0")) {
            displayText += "/";
        }
    }

    @Override
    public void ce() {
        displayText = "0";
    }

    @Override
    public void equal() {

    }

    @Override
    public String getDisplay() {
        return displayText;
    }

}
