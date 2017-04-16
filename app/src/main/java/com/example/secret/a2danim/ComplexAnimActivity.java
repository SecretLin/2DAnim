package com.example.secret.a2danim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class ComplexAnimActivity extends AppCompatActivity {
    Button btn;
    AnimationSet as;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complex_anim);

        //多种动画效果的情况下使用AnimationSet，然后使用哪种动画效果再添加进去就行了。
//        as = new AnimationSet(true);
//        as.setDuration(1000);
//
//        AlphaAnimation aa = new AlphaAnimation(0,1);
//        aa.setDuration(1000);
//        as.addAnimation(aa);
//
//        TranslateAnimation ta = new TranslateAnimation(200,0,200,0);
//        ta.setDuration(1000);
//        as.addAnimation(ta);

        final Animation a = AnimationUtils.loadAnimation(ComplexAnimActivity.this,R.anim.complex);

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//               btn.startAnimation(as);


                btn.startAnimation(a);
                a.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        btn.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                            btn.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }
}
