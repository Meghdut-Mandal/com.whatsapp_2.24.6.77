package com.facebook.flexlayout;

import com.facebook.flexlayout.layoutoutput.LayoutOutput;
import com.facebook.flexlayout.styles.FlexItemCallback;
import com.facebook.soloader.SoLoader;

public class FlexLayoutNative {
    public static native void jni_calculateLayout(float[] fArr, float[][] fArr2, float f, float f2, float f3, float f4, float f5, float f6, LayoutOutput layoutOutput, FlexItemCallback[] flexItemCallbackArr);

    static {
        SoLoader.A06("flexlayout");
    }
}
