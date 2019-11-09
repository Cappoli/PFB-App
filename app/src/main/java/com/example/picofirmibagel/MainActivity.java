package com.example.picofirmibagel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int a = 0;
    int b = 0;
    int c = 0;

    int guessA = 0;
    int guessB = 0;
    int guessC = 0;
    int guessCheck = 0;
    int correctAnswer = 0;

    boolean picoYes;
    boolean firmiYes;

    String outcomeA;
    String outcomeB;
    String outcomeC;

    String pico = "Pico";
    String firmi = "Firmi";
    String bagel = "Bagel";

    EditText inputA;
    EditText inputB;
    EditText inputC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randomNumbers() {

        a = (int) (Math.random() * (10));
        b = (int) (Math.random() * (10));
        c = (int) (Math.random() * (10));

    }

    public void comparator(View view) {

        firmiYes = false;
        picoYes = false;

        //check that all three digits have been guessed
        //any digit the was not entered is equal to 0

        //Equate guessA to value of inputA
        //Equate guessB to value of inputB
        //Equate guessC to value of inputC

        if (guessA == a || guessB == b || guessC == c) {
            firmiYes = true;
        }
        if (guessA == b || guessA == c || guessB == a || guessB == c || guessC == a || guessC == b) {
            picoYes = true;
        }

        //Post both guess and results to the text view within the scroller
        //clear the previous guess

    }
}
