package com.example.edt19;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //public static String BIKE_HEADER = "com.eample"
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageViewBike1;
    private ImageView imageViewBike2;
    private ImageView imageViewBike3;
    private ImageView imageViewBike4;
    private TextView textView1;

    private LinearLayout layout1;
    private LinearLayout layout2;
    private RelativeLayout bikesLayout;


    private ObjectAnimator objectAnimator1;
    private ObjectAnimator objectAnimator2;
    private ObjectAnimator objectAnimator3;
    private ObjectAnimator objectAnimator4;
    private ObjectAnimator objectAnimator5;
    private ObjectAnimator objectAnimator6;
    private ObjectAnimator objectAnimator7;
    private ObjectAnimator objectAnimator8;
    private ObjectAnimator objectAnimator9;
    private ObjectAnimator objectAnimator10;
    private ObjectAnimator objectAnimator11;
    private ObjectAnimator objectAnimator12;
    private ObjectAnimator objectAnimator13;
    private ObjectAnimator objectAnimator14;
    private ObjectAnimator objectAnimator15;
    private ObjectAnimator objectAnimator16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hook

        imageView1 = findViewById(R.id.imagOrigin1);
        imageView2 = findViewById(R.id.imageOrigin2);
        imageView3 = findViewById(R.id.imageOrigin3);
        //textView1 = findViewById(R.id.)
        layout1 = (LinearLayout) findViewById(R.id.layoutStart1);
        layout2 = (LinearLayout) findViewById(R.id.layoutStartHead);
        bikesLayout = findViewById(R.id.layoutBikes);

        imageViewBike1 = findViewById(R.id.imageView4);
        imageViewBike2 = findViewById(R.id.imageView5);
        imageViewBike3 = findViewById(R.id.imageView6);
        imageViewBike4 = findViewById(R.id.imageView7);

        objectAnimator1 = ObjectAnimator.ofFloat(imageView1, "translationY", 0f, -2400f);
        objectAnimator1.setStartDelay(700);
        objectAnimator1.setDuration(800);

        objectAnimator2 = ObjectAnimator.ofFloat(imageView2, "translationX", 0f, -500f);
        objectAnimator2.setStartDelay(700);
        objectAnimator2.setDuration(800);

        objectAnimator3 = ObjectAnimator.ofFloat(layout1, "translationY", 0f, -1000f);
        objectAnimator3.setStartDelay(700);
        objectAnimator3.setDuration(800);
        objectAnimator4 = ObjectAnimator.ofFloat(layout1, "translationX", 0f, -300f);
        objectAnimator4.setStartDelay(700);
        objectAnimator4.setDuration(800);


        objectAnimator6 = ObjectAnimator.ofFloat(imageView3, "translationX", 410f, 0f);
        objectAnimator6.setStartDelay(700);
        objectAnimator6.setDuration(800);

        objectAnimator7 = ObjectAnimator.ofFloat(imageView3, "alpha", 0f, 1f);
        objectAnimator7.setStartDelay(600);
        objectAnimator7.setDuration(400);

        objectAnimator5 = ObjectAnimator.ofFloat(layout1, "alpha", 1f, 0f);
        objectAnimator5.setStartDelay(600);
        objectAnimator5.setDuration(800);

        objectAnimator8 = ObjectAnimator.ofFloat(layout2, "alpha", 0f, 1f);
        objectAnimator8.setStartDelay(1500);
        objectAnimator8.setDuration(800);

        objectAnimator9 = ObjectAnimator.ofFloat(layout2, "rotation", 180f, 360f);
        objectAnimator9.setStartDelay(1500);
        objectAnimator9.setDuration(600);

        objectAnimator16 = ObjectAnimator.ofFloat(layout2, "pivotX", 0f,1f);
        objectAnimator16.setStartDelay(1200);
        objectAnimator16.setDuration(900);

        objectAnimator10 = ObjectAnimator.ofFloat(bikesLayout, "translationY", 100f, -50f);
        objectAnimator10.setStartDelay(1500);
        objectAnimator10.setDuration(800);

        objectAnimator11 = ObjectAnimator.ofFloat(bikesLayout, "alpha", 0f, 1f);
        objectAnimator11.setStartDelay(1500);
        objectAnimator11.setDuration(800);

        //bike images
        objectAnimator12 = ObjectAnimator.ofFloat(imageViewBike1, "rotation", 0f, 360f);
        objectAnimator12.setDuration(800);
        objectAnimator13 = ObjectAnimator.ofFloat(imageViewBike2, "rotation", 0f, 360f);
        objectAnimator13.setDuration(800);
        objectAnimator14 = ObjectAnimator.ofFloat(imageViewBike3, "rotation", 0f, 360f);
        objectAnimator14.setDuration(800);
        objectAnimator15 = ObjectAnimator.ofFloat(imageViewBike4, "rotation", 0f, 360f);
        objectAnimator15.setDuration(800);


        AnimatorSet animatorSet = new AnimatorSet();

        animatorSet.playTogether(objectAnimator1, objectAnimator2, objectAnimator3, objectAnimator4, objectAnimator5, objectAnimator6, objectAnimator7
                , objectAnimator8, objectAnimator9, objectAnimator10, objectAnimator11,objectAnimator16);
        animatorSet.start();

        imageViewBike1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                objectAnimator12.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }
                }, 1000);
            }
        });
        imageViewBike2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                objectAnimator13.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }
                }, 1000);
            }
        });
        imageViewBike3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                objectAnimator14.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }
                }, 1000);
            }
        });
        imageViewBike4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                objectAnimator15.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }
                }, 1000);
            }
        });
    }
}