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
    }}