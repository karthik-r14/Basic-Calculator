package com.example.basiccalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

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
        String number1 = editText1.getText().toString();

        if (number1.trim().equals("")) {
            Toast.makeText(getApplicationContext(), R.string.enter_number1, LENGTH_SHORT).show();
            return 0;

        }

        return Integer.parseInt(number1);
    }

    private int getNumberTwo() {
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String number2 = editText2.getText().toString();

        if (number2.trim().equals("")) {
            Toast.makeText(getApplicationContext(), R.string.enter_number2, LENGTH_SHORT).show();
            return 0;
        }

        return Integer.parseInt(number2);
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

        float result = calculator.divide(number1, number2);
        updateAnswer(result);
    }
}
