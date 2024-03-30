package X;

import android.view.ViewConfiguration;

/* renamed from: X.6h6  reason: invalid class name */
public final class AnonymousClass6h6 implements C159887k5 {
    public final ViewConfiguration A00;

    public float BDx() {
        return (float) this.A00.getScaledMaximumFlingVelocity();
    }

    public /* synthetic */ long BEJ() {
        float f = (float) 48;
        long A0B = C90464aC.A0B(f, f);
        long j = C113625fq.A01;
        return A0B;
    }

    public float BIT() {
        return (float) this.A00.getScaledTouchSlop();
    }

    public AnonymousClass6h6(ViewConfiguration viewConfiguration) {
        this.A00 = viewConfiguration;
    }
}
