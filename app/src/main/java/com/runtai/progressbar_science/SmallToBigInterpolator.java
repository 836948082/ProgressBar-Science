package com.runtai.progressbar_science;

import android.view.animation.Interpolator;

public class SmallToBigInterpolator implements Interpolator {
    public SmallToBigInterpolator() {
    }

    @Override
    public float getInterpolation(float input) {
        if (input > 0.5) {
            return input;
        } else {
            return 0;
        }
    }
}
