package X;

import android.view.animation.Interpolator;

/* renamed from: X.02J  reason: invalid class name */
public abstract class AnonymousClass02J implements Interpolator {
    public final float A00 = (1.0f / ((float) 200));
    public final float[] A01;

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.A01;
        int min = Math.min((int) (((float) 200) * f), 199);
        float f2 = this.A00;
        float f3 = fArr[min];
        return f3 + (((f - (((float) min) * f2)) / f2) * (fArr[min + 1] - f3));
    }

    public AnonymousClass02J(float[] fArr) {
        this.A01 = fArr;
    }
}
