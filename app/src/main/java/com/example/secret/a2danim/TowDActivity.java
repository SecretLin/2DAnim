package com.example.secret.a2danim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class TowDActivity extends AppCompatActivity {
    private ImageView iv1;
    private ImageView iv2;
    private ScaleAnimation sa = new ScaleAnimation(1, 0, 1, 1, Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_PARENT, 0.5f);
    private ScaleAnimation sa1 = new ScaleAnimation(0, 1, 1, 1, Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_PARENT, 0.5f);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);
        init();
        findViewById(R.id.frame).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (iv1.getVisibility() == View.VISIBLE){
                    iv1.startAnimation(sa);
                }else {
                    iv2.startAnimation(sa);
                }

//
            }
        });
    }

    private void showA() {
        iv1.setVisibility(View.VISIBLE);
        iv2.setVisibility(View.GONE);
    }

    private void showB() {
        iv2.setVisibility(View.VISIBLE);
        iv1.setVisibility(View.GONE);
    }

    private void init() {
        showA();
        sa.setDuration(500);
        sa1.setDuration(500);

        sa.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
               if (iv1.getVisibility()==View.VISIBLE){
                   iv1.setAnimation(null);
                   showB();
                   iv2.startAnimation(sa1);
               }else {
                   iv2.setAnimation(null);
                   showA();
                   iv1.startAnimation(sa1);
               }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
