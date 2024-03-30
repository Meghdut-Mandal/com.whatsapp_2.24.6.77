package X;

import android.animation.TimeInterpolator;

/* renamed from: X.6Yf  reason: invalid class name and case insensitive filesystem */
public class C133386Yf implements TimeInterpolator {
    public final AnonymousClass5VT A00;

    public float getInterpolation(float f) {
        if (((double) f) > 0.5d) {
            return Math.min(f, (float) AnonymousClass5VT.A00(this.A00));
        }
        return 0.0f;
    }

    public C133386Yf(AnonymousClass5VT r1) {
        this.A00 = r1;
    }
}
