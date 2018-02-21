package com.example.healthmonitoring;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.util.Log;

public class Nutrition extends AppCompatActivity {

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
        ShowContentView2();
    }


    private void ShowContentView1() {
        setContentView(R.layout.activity_nutrition);
        final Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ShowContentView2();
            }
        });

        final Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ShowContentView3();
            }
        });
    }

    public void ShowContentView2() {
        setContentView(R.layout.activity_bmimale);
        final Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ShowContentView1();
            }
        });

        final Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (v.getId() == R.id.button2) {

                    weightText = (EditText) findViewById(R.id.editText1);
                    heightText = (EditText) findViewById(R.id.editText2);
                    ageText = (EditText) findViewById(R.id.editText3);
                    resultText = (TextView) findViewById(R.id.editText4);

                    weight = Float.parseFloat(weightText.getText().toString());
                    height = Float.parseFloat(heightText.getText().toString());
                    age = Float.parseFloat(ageText.getText().toString());

                    bmrValue = (Float) calculateBMR(weight, height, age);

                    resultText.setText("" + bmrValue);
                }
            }

            private float calculateBMR(float weight2, float height2, float age2) {
                return (float) (66 + ((13.75 * weight)) + (5 * height) - (6.8 * age));
            }
        });
        }


    public void ShowContentView3() {
        setContentView(R.layout.female);
        final Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ShowContentView1();
            }
        });

        final Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (v.getId() == R.id.button2) {

                    weightText = (EditText) findViewById(R.id.editText1);
                    heightText = (EditText) findViewById(R.id.editText2);
                    ageText = (EditText) findViewById(R.id.editText3);
                    resultText = (TextView) findViewById(R.id.editText4);

                    weight = Float.parseFloat(weightText.getText().toString());
                    height = Float.parseFloat(heightText.getText().toString());
                    age = Float.parseFloat(ageText.getText().toString());

                    bmrValue = (Float) calculateBMR(weight, height, age);

                    resultText.setText("" + bmrValue);
                }
            }

            private float calculateBMR(float weight2, float height2, float age2) {
                return (float) (665 + ((9.6 * weight)) + (1.8 * height) - (4.7 * age));
            }
        });
    }



}




