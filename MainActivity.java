package com.example.mobilecomputingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.animation.ScaleAnimation;//for stars (str)
import android.view.animation.RotateAnimation;//for stars (str)
import android.view.animation.AlphaAnimation;//for stars (str)
import android.view.animation.TranslateAnimation;//for stars (str)
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton; //Image buttons
import android.widget.ImageView;//images:stars and plate
import android.widget.TextView;//question box
import java.util.Random;
import android.content.Intent; //start activity

public class MainActivity extends AppCompatActivity {

    TextView Maths_question;
    ImageView app1, app2, app3, app4,app5,app6,app7,app8,app9,app10;
    ImageButton but0, but1, but2, but3, but4, but5, but6, but7,but8, but9, buttonstart; //Button
    ImageView str1,str2,str3,str4,str5;
    ImageView bk_plate;
    int Number1, Number2, Solve;
    RotateAnimation rAnimation; /// for stars (rotate)
    TranslateAnimation tAnimation;/// for stars (translate)
    String question;
    AlphaAnimation aAnimation;//for stars (alpha)
    ScaleAnimation sAnimation;//for stars (scale)

    // drag and drop for apples
    public View.OnTouchListener handleTouch = new View.OnTouchListener() {
        float dX, dY;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouch(View view, MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                dX = view.getX() - event.getRawX();
                dY = view.getY() - event.getRawY();
                break;
            case MotionEvent.ACTION_MOVE:
                view.animate()
                        .x(event.getRawX() + dX)
                        .y(event.getRawY() + dY)
                        .setDuration(0)
                        .start();
                break;
            default:
                return false;}

        return true;
    }

    };

    @SuppressLint("ClickableViewAccessibility")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //buttons
        //button 0
        but0 = findViewById(R.id.but0);

        //button 1
        but1 = findViewById(R.id.but1);

        //button 2
        but2 = findViewById(R.id.but2);

        //button 3
        but3 = findViewById(R.id.but3);

        //button 4
        but4 = findViewById(R.id.but4);

        //button 5
        but5 = findViewById(R.id.but5);

        //button 6
        but6 = findViewById(R.id.but6);

        //button 7
        but7 = findViewById(R.id.but7);

        //button 8
        but8 = findViewById(R.id.but8);

        //button 9
        but9 = findViewById(R.id.but9);

        //startbutton
        buttonstart =findViewById(R.id.buttonstart);

        //Apples
        //apple 1
        app1 = (ImageView) findViewById(R.id.app1);
        //apple 2
        app2 = (ImageView) findViewById(R.id.app2);
        //apple 3
        app3 = (ImageView) findViewById(R.id.app3);
        //apple 4
        app4 = (ImageView) findViewById(R.id.app4);
        //apple 5
        app5 = (ImageView) findViewById(R.id.app5);
        //apple 6
        app6 = (ImageView) findViewById(R.id.app6);
        //apple 7
        app7 = (ImageView) findViewById(R.id.app7);
        //apple 8
        app8 = (ImageView) findViewById(R.id.app8);
        //apple 9
        app9 = (ImageView) findViewById(R.id.app9);
        //apple 10
        app10 = (ImageView) findViewById(R.id.app10);

        //drag apple (app)
        app1.setOnTouchListener(handleTouch);
        app2.setOnTouchListener(handleTouch);
        app3.setOnTouchListener(handleTouch);
        app4.setOnTouchListener(handleTouch);
        app5.setOnTouchListener(handleTouch);
        app6.setOnTouchListener(handleTouch);
        app7.setOnTouchListener(handleTouch);
        app8.setOnTouchListener(handleTouch);
        app9.setOnTouchListener(handleTouch);
        app10.setOnTouchListener(handleTouch);

        // Plate for apples
        bk_plate = (ImageView) findViewById(R.id.bk_plate);
        bk_plate.setOnTouchListener(handleTouch);

        //Stars
        str1 = findViewById(R.id.str1);
        str2 = findViewById(R.id.str2);
        str3 = findViewById(R.id.str3);
        str4 = findViewById(R.id.str4);
        str5 = findViewById(R.id.str5);

//question that will be displayed on the start view

        Maths_question = findViewById(R.id.Maths_question);
        Random rand = new Random();
        Number1 = rand.nextInt(4) + 1;
        Number2 = rand.nextInt(4) + 1;
        this.question = (Number1) + " + " + (Number2) + " = ";
        Maths_question = (TextView) findViewById(R.id.Maths_question);
        Maths_question.setText(question);
        this.Solve = this.Number1 + this.Number2;
    }

    //resets game from finished view
    public void Startpressed(View v) {
        Random rand = new Random();
        Number1 = rand.nextInt(4) + 1;
        Number1 = rand.nextInt(4) + 1;
        this.question = (Number1) + " + " + (Number2) + " = ";
        Maths_question = (TextView) findViewById(R.id.Maths_question);
        Maths_question.setText(question);
        this.Solve = this.Number1 + this.Number2;

        ImageButton buttonstart = (ImageButton) v;
        buttonstart.setVisibility(View.INVISIBLE);



//buttons and apples visible
        but0.setVisibility(View.VISIBLE);
        but1.setVisibility(View.VISIBLE);
        but2.setVisibility(View.VISIBLE);
        but3.setVisibility(View.VISIBLE);
        but4.setVisibility(View.VISIBLE);
        but5.setVisibility(View.VISIBLE);
        but6.setVisibility(View.VISIBLE);
        but7.setVisibility(View.VISIBLE);
        but8.setVisibility(View.VISIBLE);
        but9.setVisibility(View.VISIBLE);
        app1.setVisibility(View.VISIBLE);
        app2.setVisibility(View.VISIBLE);
        app3.setVisibility(View.VISIBLE);
        app4.setVisibility(View.VISIBLE);
        app5.setVisibility(View.VISIBLE);
        app6.setVisibility(View.VISIBLE);
        app7.setVisibility(View.VISIBLE);
        app8.setVisibility(View.VISIBLE);
        app9.setVisibility(View.VISIBLE);
        app10.setVisibility(View.VISIBLE);
        bk_plate.setVisibility(View.VISIBLE);


//stars invisible
        str1.setVisibility(View.INVISIBLE);
        str2.setVisibility(View.INVISIBLE);
        str3.setVisibility(View.INVISIBLE);
        str4.setVisibility(View.INVISIBLE);
        str5.setVisibility(View.INVISIBLE);


    }
    @SuppressLint("SetTextI18n")
    public void onPress_btn0 (View v) {
        but0 = findViewById(R.id.but0);
        int btn_0value = 0;
        if (Solve == btn_0value) {
            Maths_question.setText("Well done!");
            ImageButton button_start = (ImageButton) v;
            buttonstart.setVisibility(View.VISIBLE);


//when answer is right make sure the buttons are invisible.
            but0.setVisibility(View.INVISIBLE);
            but1.setVisibility(View.INVISIBLE);
            but2.setVisibility(View.INVISIBLE);
            but3.setVisibility(View.INVISIBLE);
            but4.setVisibility(View.INVISIBLE);
            but5.setVisibility(View.INVISIBLE);
            but6.setVisibility(View.INVISIBLE);
            but7.setVisibility(View.INVISIBLE);
            but8.setVisibility(View.INVISIBLE);
            but9.setVisibility(View.INVISIBLE);
            bk_plate.setVisibility(View.INVISIBLE);


// when the answer is right make sure that the stars are visible
            str1.setVisibility(View.VISIBLE);
            str2.setVisibility(View.VISIBLE);
            str3.setVisibility(View.VISIBLE);
            str4.setVisibility(View.VISIBLE);
            str5.setVisibility(View.VISIBLE);

// when the stars are visble make sure that there is animation and the answer is correct.

            rAnimation = new RotateAnimation(0, 3500);
            rAnimation.setDuration(2500);
            str1.startAnimation(rAnimation);

            //star2
            sAnimation = new ScaleAnimation(0, 4, 0, 4);
            rAnimation.setDuration(1500);
            str2.startAnimation(rAnimation);


            //star3
            sAnimation = new ScaleAnimation(0, 4, 0, 4);
            sAnimation.setDuration(1500);
            str3.startAnimation(sAnimation);


            //star5
            aAnimation= new AlphaAnimation(0, 2);
            aAnimation.setDuration(1800);
            str4.startAnimation(aAnimation);

            //star4
            tAnimation = new TranslateAnimation(0, 200, 0, 100);
            tAnimation.setDuration(1600);
            str5.startAnimation(tAnimation);


            //if the question is wrong, the user should retry the game.

        } else {
            Maths_question.setText("Try again");
            Maths_question.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Maths_question.setText(question);
                }
            }, 2000);
        }


} }