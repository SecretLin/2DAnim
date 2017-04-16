package com.example.secret.a2danim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

public class ScaleAnimActivity extends AppCompatActivity {
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_anim);

        iv = (ImageView) findViewById(R.id.iv);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //0仍然是代表起始位置
                //前两个0.5f是代表缩放比例
                //Animation.RELATIVE_TO_SELF是代表相对于自身的，0.5f则是从中心。所以这个也就是从自身的中心点进行缩放
//                ScaleAnimation sa = new ScaleAnimation(0,0.5f,0,0.5f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
//                sa.setDuration(1000);
//                iv.startAnimation(sa);

                iv.startAnimation(AnimationUtils.loadAnimation(ScaleAnimActivity.this,R.anim.scale));
            }
        });
    }
}
