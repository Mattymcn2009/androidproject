package com.example.healthmonitoring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private static Button button_1;
    private static Button button_2;
    private static Button button_3;
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.v(TAG, "Activity Main: onCreate() called");
    }

    public void clickWelcome(View view){

        Log.v(TAG, "ActivityMain: clickWelcome Button() called");


        Intent intent = new Intent(this, activity_welcome.class);
        startActivity(intent);
        finish();
    }

    public void clickBMIAndCalories (View view) {

        Log.v(TAG, "ActivityMain: clickBMIAndCalories Button() called");

        Intent intent = new Intent(this, BMIAndCalories.class);
        startActivity(intent);
        finish();
    }

    public void clickStepsCounter(View view){

        Log.v(TAG, "ActivityMain: clickStepsCounter Button() called");


        Intent intent = new Intent(this, StepsCounter.class);
        startActivity(intent);
        finish();
    }

    public void clickNutrition(View view){

        Log.v(TAG, "ActivityMain: clickNutrition Button() called");


        Intent intent = new Intent(this, Nutrition.class);
        startActivity(intent);
        finish();
    }

    public void clickFitnessExercises(View view){

        Log.v(TAG, "ActivityMain: clickFitnessExercises Button() called");


        Intent intent = new Intent(this, FitnessExamples.class);
        startActivity(intent);
        finish();
    }

    public void clickTopGymsInArea(View view){

        Log.v(TAG, "ActivityMain: clickTopGymsInArea Button() called");


        Intent intent = new Intent(this, TopGymsInArea.class);
        startActivity(intent);
        finish();
    }


    protected void onStart(){

        super.onStart();
    }

    protected void onResume(){

        super.onResume();
    }

    protected void onPause(){

        super.onPause();
    }

    protected void onStop(){

        super.onStop();
    }

    protected void onDestroy(){

        super.onDestroy();
    }

    protected void onRestart(){

        super.onRestart();
    }



}
