package com.example.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator();
    }

    private int getNumberOne() {
        EditText editText1 = (EditText) findViewById(R.id.editText);
        return Integer.parseInt(editText1.getText().toString());

    }

    private int getNumberTwo() {
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        return Integer.parseInt(editText2.getText().toString());
    }

    private void updateAnswer(float result) {
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(Float.toString(result));

    }

    public void onAddButtonClick(View view) {
        int number1 = getNumberOne();
        int number2 = getNumberTwo();

        int result = calculator.add(number1, number2);

        updateAnswer(result);
    }

    public void onSubtractButtonClick(View view) {
        int number1 = getNumberOne();
        int number2 = getNumberTwo();

        int result = calculator.subtract(number1, number2);
        updateAnswer(result);
    }

    public void onMultiplyButtonClick(View view) {
        int number1 = getNumberOne();
        int number2 = getNumberTwo();

        int result = calculator.multiply(number1, number2);
        updateAnswer(result);
    }

    public void onDivisionButtonClick(View view) {
        int number1 = getNumberOne();
        int number2 = getNumberTwo();

        float result = (float) number1 / number2;
        updateAnswer(result);
    }
}
