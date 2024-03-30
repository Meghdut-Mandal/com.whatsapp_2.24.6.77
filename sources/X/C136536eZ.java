package X;

/* renamed from: X.6eZ  reason: invalid class name and case insensitive filesystem */
public final class C136536eZ implements C161157mH {
    public final AnonymousClass7dW A00 = C129896Iw.A00;

    public float B2E(float f, float f2, float f3) {
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        if (Math.abs(f) >= Math.abs(f5)) {
            return f5;
        }
        return f;
    }
}
