package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Animation animation;
    Button move,blink,bounce,fadein,fadeout,rotate,seq,slidedown,tog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        move=findViewById(R.id.move);
        blink=findViewById(R.id.blink);
        bounce=findViewById(R.id.bounce);
        fadein=findViewById(R.id.fadein);
        fadeout=findViewById(R.id.fadeout);
        rotate=findViewById(R.id.rotate);
        seq=findViewById(R.id.seq);
        slidedown=findViewById(R.id.slidedown);
        tog=findViewById(R.id.tog);


        //animation= AnimationUtils.loadAnimation(this,R.anim.move);
        //imageView.setAnimation(animation);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.move);
                    imageView.startAnimation(animation);
            }
        });

        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.blink);
                imageView.startAnimation(animation);
            }
        });

        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
                imageView.startAnimation(animation);
            }
        });

        fadein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadein);
                imageView.startAnimation(animation);
            }
        });

        fadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadeout);
                imageView.startAnimation(animation);
            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                imageView.startAnimation(animation);
            }
        });

        seq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.sequential);
                imageView.startAnimation(animation);
            }
        });

        slidedown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.slidedown);
                imageView.startAnimation(animation);
            }
        });

        tog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.together);
                imageView.startAnimation(animation);
            }
        });
    }
}