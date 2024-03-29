package now.example.picofirmibagel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


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

    String inA;
    String inB;
    String inC;
    String outCome;

    String pico = "Pico";
    String firmi = "Firmi";
    String bagel = "Bagel";
    String tracker;

    EditText inputA;
    EditText inputB;
    EditText inputC;
    TextView results;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randomNumbers(View view) {

        a = (int) (Math.random() * (10));
        b = (int) (Math.random() * (10));
        c = (int) (Math.random() * (10));

        System.out.println(" A: " + a + " B: " + b + " C: " + c);

        tracker = "";

        results = findViewById(R.id.textView2);
        results.setText(tracker);

    }

    public void comparator(View view) {

        firmiYes = false;
        picoYes = false;

        //check that all three digits have been guessed
        //any digit the was not entered is equal to 0

        //Equate guessA to value of inputA
        inputA = findViewById(R.id.editText5);
        inA = inputA.getText().toString();
        guessA = Integer.parseInt(inA);

        //Equate guessB to value of inputB
        inputB = findViewById(R.id.editText2);
        inB = inputB.getText().toString();
        guessB = Integer.parseInt(inB);

        //Equate guessC to value of inputC
        inputC = findViewById(R.id.editText4);
        inC = inputC.getText().toString();
        guessC = Integer.parseInt(inC);

        if(guessA == a && guessB == b && guessC == c) {
            System.out.println("WINNER!!!");

            a = (int) (Math.random() * (10));
            b = (int) (Math.random() * (10));
            c = (int) (Math.random() * (10));

            System.out.println(" A: " + a + " B: " + b + " C: " + c);

            tracker = "";

            results = findViewById(R.id.textView2);
            results.setText(tracker);

        }
        else {if (guessA == a || guessB == b || guessC == c) {
            firmiYes = true;
        }

        if (guessA == b || guessA == c || guessB == a || guessB == c || guessC == a || guessC == b) {
            picoYes = true;
        }

        outCome = "Result: " + guessA + " " + guessB + " " + guessC + "---";

        if(!picoYes && !firmiYes){
            System.out.println("Bagel");
            outCome = outCome + "Bagel";

        }
        if (picoYes){
            System.out.println("Pico!");
            outCome = outCome + " Pico";
        }
        if (firmiYes){
            System.out.println("Firmi");
            outCome = outCome + " Firmi";
        }



        tracker = outCome + System.getProperty("line.separator") + tracker;

        results = findViewById(R.id.textView2);
        results.setText(tracker);

        //Post both guess and results to the text view within the scroller
        //clear the previous guess

    }
    }
}
