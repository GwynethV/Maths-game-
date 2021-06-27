package com.example.mathsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView problem;
    ImageView app1, app2, app3, app4, app5, app6, app7, app8, app9;
    Button but0, but1, but2, but3, but4, but5, but6, but7,but8, but9; //Button
    ImageView str1, str2,str3,str4,str5;
    ImageView bkplate;

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

    //Apples
        //apple 1
        ImageView app1 = (ImageView) findViewById(R.id.app1);
        //apple 2
        ImageView app2 = (ImageView) findViewById(R.id.app2);
        //apple 3
        ImageView app3 = (ImageView) findViewById(R.id.app3);
        //apple 4
        ImageView app4 = (ImageView) findViewById(R.id.app4);
        //apple 5
        ImageView app5 = (ImageView) findViewById(R.id.app5);
        //apple 6
        ImageView app6 = (ImageView) findViewById(R.id.app6);
        //apple 7
        ImageView app7 = (ImageView) findViewById(R.id.app7);
        //apple 8
        ImageView app8 = (ImageView) findViewById(R.id.app8);
        //apple 9
        ImageView app9 = (ImageView) findViewById(R.id.app9);
        //apple 10
        ImageView app10 = (ImageView) findViewById(R.id.app10);

        //drag
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

        // Plate
        ImageView plate = (ImageView) findViewById(R.id.bkplate);
        bkplate.setOnTouchListener(handleTouch);

        //Stars
        str1 = findViewById(R.id.str1);
        str2 = findViewById(R.id.str2);
        str3 = findViewById(R.id.str3);
        str4 = findViewById(R.id.str4);
        str5 = findViewById(R.id.str5);

}}