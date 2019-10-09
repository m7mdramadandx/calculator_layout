package com.example.ramadan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView input;
    TextView output;
    String input_one, input_two;
    float reslut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_linear);
        input = (TextView) findViewById(R.id.input);
        output = (TextView) findViewById(R.id.output);
    }


    public void zero(View view) {
        input.append("0");
    }

    public void one(View view) {
        input.append("1");
    }

    public void two(View view) {
        input.append("2");

    }

    public void three(View view) {
        input.append("3");

    }

    public void four(View view) {
        input.append("4");

    }

    public void five(View view) {
        input.append("5");

    }

    public void six(View view) {
        input.append("6");

    }

    public void seven(View view) {
        input.append("7");
    }

    public void eight(View view) {
        input.append("8");

    }

    public void nine(View view) {
        input.append("9");

    }

    public void dot(View view) {
        input.append(".");

    }

    public void equal(View view) {
        input_two = input.getText().toString();
        System.out.println(input_two);
        reslut = Float.sum(Float.parseFloat(input_one),Float.parseFloat(input_two));
        output.setText(String.valueOf(reslut));
    }

    public void delete(View view) {
        input.setText(null);

    }

    public void divided(View view) {
    }

    public void multiply(View view) {
    }

    public void minus(View view) {
    }

    public void plus(View view) {
        input_one = input.getText().toString();
        System.out.println(input_one);
        input.setText(null);



    }
}
