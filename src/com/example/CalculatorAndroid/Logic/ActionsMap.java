package com.example.CalculatorAndroid.Logic;

import com.example.CalculatorAndroid.Logic.Input.Numbers.*;
import com.example.CalculatorAndroid.Logic.Input.Operations.*;
import com.example.CalculatorAndroid.R;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Eugen
 * Date: 12.05.13
 * Time: 16:29
 */
public class ActionsMap {

    private Map<Integer, Actions> map;

    public ActionsMap() {

        map = new HashMap<Integer, Actions>();

        map.put(R.id.button0, new ZeroInput());
        map.put(R.id.button1, new OneInput());
        map.put(R.id.button2, new TwoInput());
        map.put(R.id.button3, new ThreeInput());
        map.put(R.id.button4, new FourInput());
        map.put(R.id.button5, new FiveInput());
        map.put(R.id.button6, new SixInput());
        map.put(R.id.button7, new SevenInput());
        map.put(R.id.button8, new EightInput());
        map.put(R.id.button9, new NineInput());
        map.put(R.id.buttonSub, new SubtractInput());
        map.put(R.id.buttonAdd, new AddInput());
        map.put(R.id.buttonMultiply, new MultiplyInput());
        map.put(R.id.buttonDiv, new DivideInput());
        map.put(R.id.buttonEqual, new EqualInput());
        map.put(R.id.buttonCE, new CEInput());
    }

    public Actions getButtonId(int buttonId) {
        return map.get(buttonId);
    }
}
