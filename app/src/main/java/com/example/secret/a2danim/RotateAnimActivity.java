package com.example.secret.a2danim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class RotateAnimActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    ImageView iv;
    private RotateAnimation ra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate_anim);

        iv = (ImageView) findViewById(R.id.iv);
        //从按钮的中心位置进行旋转。
        ra = new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
        ra.setDuration(1000);

        findViewById(R.id.accelerate_decelerate_interpolator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.startAnimation(AnimationUtils.loadAnimation(RotateAnimActivity.this,R.anim.acceleratedecelerateinterpolator));
            }
        });

        findViewById(R.id.accelerate_interpolator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.startAnimation(AnimationUtils.loadAnimation(RotateAnimActivity.this,R.anim.accelerateinterpolator));
            }
        });

        findViewById(R.id.anticipate_interpolator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.startAnimation(AnimationUtils.loadAnimation(RotateAnimActivity.this,R.anim.anticipateinterpolator));
            }
        });

        findViewById(R.id.anticipate_overshoot_interpolator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.startAnimation(AnimationUtils.loadAnimation(RotateAnimActivity.this, R.anim.anticipateovershootinterpolator));

            }
        });

        findViewById(R.id.bounce_interpolator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.startAnimation(AnimationUtils.loadAnimation(RotateAnimActivity.this,R.anim.bounceinterpolator));
            }
        });

        findViewById(R.id.cycle_interpolator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.startAnimation(AnimationUtils.loadAnimation(RotateAnimActivity.this,R.anim.cycleinterpolator));
            }
        });

        findViewById(R.id.decelerate_interpolator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.startAnimation(AnimationUtils.loadAnimation(RotateAnimActivity.this,R.anim.decelerateinterpolator));
            }
        });

        findViewById(R.id.linear_interpolator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.startAnimation(AnimationUtils.loadAnimation(RotateAnimActivity.this,R.anim.linearinterpolator));
            }
        });

        findViewById(R.id.overshoot_interpolator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.startAnimation(AnimationUtils.loadAnimation(RotateAnimActivity.this,R.anim.overshootinterpolator));
            }
        });


    }
}
