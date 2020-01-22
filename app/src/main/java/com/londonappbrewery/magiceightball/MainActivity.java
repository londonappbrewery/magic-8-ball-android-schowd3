package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Links the image views in the layout xml to the java code
        final ImageView ballDisplay=findViewById(R.id.image_eightBall);

        //Store the drawable image in an array(collection)
        final int[] ballArray= new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        //Links the button in the layout xml to the java code
        Button myButton=findViewById(R.id.askButton);

        //Tells the button to listen for clicks
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creates a random number generator
                Random randomNumberGenerator=new Random();

                //Generated a new number with upper bound 5
                int number=randomNumberGenerator.nextInt(5);

                //Displays the number on ballDisplay image
                ballDisplay.setImageResource(ballArray[number]);

            }
        });
    }
}
