package com.example.secret.a2danim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomeAnimActivity extends AppCompatActivity {
    Button btn;
    CustomAnim ca = new CustomAnim();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome_anim);

        btn = (Button) findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ca.setDuration(1000);
                btn.startAnimation(ca);
            }
        });
    }
}
