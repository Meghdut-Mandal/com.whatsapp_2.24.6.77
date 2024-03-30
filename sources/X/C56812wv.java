package X;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: X.2wv  reason: invalid class name and case insensitive filesystem */
public abstract class C56812wv {
    public static final Interpolator A00;
    public static final Interpolator A01;
    public static final Interpolator A02;

    static {
        PathInterpolator A002 = C017907q.A00(0.65f, 0.0f, 0.35f, 1.0f);
        AnonymousClass00C.A08(A002);
        A00 = A002;
        PathInterpolator A003 = C017907q.A00(0.45f, 0.0f, 0.55f, 1.0f);
        AnonymousClass00C.A08(A003);
        A02 = A003;
        PathInterpolator A004 = C017907q.A00(0.87f, 0.0f, 0.13f, 1.0f);
        AnonymousClass00C.A08(A004);
        A01 = A004;
    }
}
