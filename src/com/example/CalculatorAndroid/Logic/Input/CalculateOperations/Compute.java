package com.example.CalculatorAndroid.Logic.Input.CalculateOperations;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 08.04.13
 * Time: 21:23
 */
public class Compute {
    private Map<String, BasicOperator> operations;

    public Compute() {
        operations = new HashMap<String, BasicOperator>();
        operations.put("-", new SubOperator());
        operations.put("+", new AddOperator());
        operations.put("/", new DivOperator());
        operations.put("*", new MultiOperator());
    }

    public BasicOperator computing(String sign) {
        return operations.get(sign);
    }
}
