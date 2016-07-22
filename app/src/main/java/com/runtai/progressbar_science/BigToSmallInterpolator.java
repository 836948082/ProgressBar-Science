package com.runtai.progressbar_science;

import android.view.animation.Interpolator;

public class BigToSmallInterpolator implements Interpolator {
    public BigToSmallInterpolator() {
    }

    @Override
    public float getInterpolation(float input) {
        if (input <= 0.5) {
            return input * 2;
        } else {
            return (2 - 2 * input);
        }
    }
}
