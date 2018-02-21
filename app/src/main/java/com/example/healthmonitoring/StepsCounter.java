package com.example.healthmonitoring;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.util.Log;

public class StepsCounter extends AppCompatActivity {

    private EditText heightText;
    private EditText weightText;
    private EditText ageText;
    private TextView resultText;

    private float weight;
    private float height;
    private float age;
    private float bmrValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps_counter);
        weightText = (EditText) findViewById(R.id.editText1);
        heightText = (EditText) findViewById(R.id.editText2);
        ageText = (EditText) findViewById(R.id.editText3);
        resultText = (TextView) findViewById(R.id.editText4);

    }

    public void calculateBMR(View v) {
        weight = Float.parseFloat(weightText.getText().toString());
        height = Float.parseFloat(heightText.getText().toString());
        age = Float.parseFloat(ageText.getText().toString());

        bmrValue = (Float) calculateBMR(weight, height, age);

        resultText.setText("" + bmrValue);
    }

            private float calculateBMR(float weight2, float height2, float age2) {
                return (float) (66 + ((13.75 * weight)) + (5 * height) - (6.8 * age));
            }
        }







