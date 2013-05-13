package com.example.CalculatorAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.example.CalculatorAndroid.Logic.ActionsMap;
import com.example.CalculatorAndroid.Logic.Calculator;
import com.example.CalculatorAndroid.Logic.CalculatorDisplay;

public class MyActivity extends Activity implements OnClickListener {

    private TextView display;
    private Calculator calculator;
    private ActionsMap actionsMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        display = (TextView) findViewById(R.id.displayView);
        calculator = new CalculatorDisplay();
        actionsMap = new ActionsMap();
        display.setText("0");
    }

    @Override
    public void onClick(View v) {
        actionsMap.getButtonId(v.getId()).setDisplayInput(calculator, display);
    }
}
