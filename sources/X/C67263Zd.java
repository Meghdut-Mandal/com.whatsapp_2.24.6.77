package X;

import android.view.animation.Interpolator;

/* renamed from: X.3Zd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67263Zd implements Interpolator {
    public static final /* synthetic */ C67263Zd A00 = new C67263Zd();

    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
