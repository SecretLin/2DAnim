package com.example.secret.a2danim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class AlphaAnimActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha_anim);
        btn = (Button) findViewById(R.id.btnAlphaAnim);
        findViewById(R.id.btnAlphaAnim).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//               //透明动画效果需设置从什么透明度变化到什么透明度
//                AlphaAnimation aa = new AlphaAnimation(0,1);
//                aa.setDuration(1000);
//                btn.startAnimation(aa);

                //以下是使用xml文件来写的
                btn.startAnimation(AnimationUtils.loadAnimation(AlphaAnimActivity.this,R.anim.alpha));
            }
        });
    }
}
