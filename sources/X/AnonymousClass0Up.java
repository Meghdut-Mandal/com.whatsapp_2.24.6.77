package X;

import android.view.animation.Interpolator;

/* renamed from: X.0Up  reason: invalid class name */
public abstract class AnonymousClass0Up {
    public float A00;
    public final int A01;
    public final long A02;
    public final Interpolator A03;

    public float A05() {
        Interpolator interpolator = this.A03;
        float f = this.A00;
        if (interpolator != null) {
            return interpolator.getInterpolation(f);
        }
        return f;
    }

    public AnonymousClass0Up(int i, Interpolator interpolator, long j) {
        this.A01 = i;
        this.A03 = interpolator;
        this.A02 = j;
    }

    public void A08(float f) {
        this.A00 = f;
    }

    public int A06() {
        return this.A01;
    }

    public long A07() {
        return this.A02;
    }
}
