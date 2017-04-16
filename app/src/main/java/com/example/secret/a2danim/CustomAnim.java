package com.example.secret.a2danim;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by Secret on 2017/4/16.
 */

public class CustomAnim extends Animation {

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {

        t.getMatrix().setTranslate((float) (Math.sin(interpolatedTime*20)*10),0);

        super.applyTransformation(interpolatedTime, t);
    }
}
