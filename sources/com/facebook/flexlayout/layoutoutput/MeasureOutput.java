package com.facebook.flexlayout.layoutoutput;

import X.C023109s;
import X.C90484aE;

public class MeasureOutput {
    public float[] arr;
    public Object measureResult;

    public MeasureOutput(float f, float f2, float f3, Object obj) {
        float[] fArr = new float[C023109s.A00(3).length];
        this.arr = fArr;
        C90484aE.A1O(fArr, f, f2);
        fArr[2] = Float.NaN;
        this.measureResult = obj;
    }
}
