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
    private String[] resultParser;

    public String calculate(String displayText, String operator) {

        resultParser = displayText.split("[-+*/]");

        argument1 = Double.valueOf(resultParser[0]);
        argument2 = Double.valueOf(resultParser[1]);

        compute = new Compute();
        basicOperator = compute.computing(operator);
        double result = basicOperator.compute(argument1, argument2);
        return String.valueOf(result);
    }
}
