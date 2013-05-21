package com.example.CalculatorAndroid.Logic.Input.CalculateOperations;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 19.05.13
 * Time: 12:46
 */
public class CalculateOperator {

    private double argument1;
    private double argument2;
    private Compute compute;
    private BasicOperator basicOperator;
    private double result;
    private String[] resultParser;

    public String calculate(String displayText, String operator) {

        try {
            resultParser = displayText.split("[-+*/]");
            argument1 = Double.valueOf(resultParser[0]);
            argument2 = Double.valueOf(resultParser[1]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            return argument1 + "";
        }

        compute = new Compute();
        basicOperator = compute.computing(operator);
        result = basicOperator.compute(argument1, argument2);
        return result + "";
    }

    public String countFract(String displayText) {
        result = Double.valueOf(displayText);
        return (1 / result) + "";
    }

    public String countSqrt(String displayText) {
        result = Double.valueOf(displayText);
        return Math.sqrt(result) + "";
    }
}
