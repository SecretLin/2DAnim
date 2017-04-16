package com.example.secret.a2danim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class TranslateActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);

        btn  = (Button) findViewById(R.id.btnTranslate);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //-200代表往左移200
                //100表示整个按钮先移动了100再进行移动动画。0的话为当前位置
                //以下是在activity里面写的。
//                TranslateAnimation ta = new TranslateAnimation(0,-200,100,200);
//                ta.setDuration(1000);
//                btn.startAnimation(ta);

                //以下是在xml里面写的。
                btn.startAnimation(AnimationUtils.loadAnimation(TranslateActivity.this,R.anim.translate));
            }
        });
    }
}
