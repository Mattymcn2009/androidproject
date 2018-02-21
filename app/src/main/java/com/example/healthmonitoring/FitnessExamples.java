package com.example.healthmonitoring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FitnessExamples extends AppCompatActivity {

    private static Button button_1;
    private static Button button_2;
    private static Button button_3;
    private static final String TAG = "FitnessExamples";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_examples);

        Log.v(TAG, "FitnessExamples: onCreate() called");
    }

    public void clickEasy (View view) {

        Log.v(TAG, "FitnessExamples: clickEasy Button() called");

        Intent intent = new Intent(this, FitnessExamplesEasy.class);
        startActivity(intent);
        finish();
    }

    public void clickMedium (View view) {

        Log.v(TAG, "FitnessExamples: clickMedium Button() called");

        Intent intent = new Intent(this, FitnessExamplesMedium.class);
        startActivity(intent);
        finish();
    }

    public void clickHard (View view) {

        Log.v(TAG, "FitnessExamples: clickHard Button() called");

        Intent intent = new Intent(this, FitnessExamplesHard.class);
        startActivity(intent);
        finish();
    }



}
