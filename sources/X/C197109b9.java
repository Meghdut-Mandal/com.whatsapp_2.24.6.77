package X;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9b9  reason: invalid class name and case insensitive filesystem */
public abstract class C197109b9 {
    public static final Runnable A00;
    public static final Runnable A01;
    public static final ConcurrentHashMap A02 = C90524aI.A0s();
    public static final AtomicInteger A03 = new AtomicInteger(0);
    public static final AtomicInteger A04 = new AtomicInteger(0);
    public static final AtomicInteger A05 = new AtomicInteger(0);
    public static final AnonymousClass00T A06;

    static {
        AnonymousClass00U A1I = C36431kI.A1I(C153807Pt.A00);
        A06 = A1I;
        AWA awa = AWA.A00;
        A00 = awa;
        AW9 aw9 = AW9.A00;
        A01 = aw9;
        ((Handler) A1I.getValue()).post(awa);
        ((Handler) A06.getValue()).post(aw9);
    }

    public static final void A00(C192189Ga r5, int i) {
        int i2 = r5.A00;
        float f = ((float) i2) * 0.5f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        int i3 = (int) f;
        A1J a1j = r5.A01;
        int i4 = a1j.A00;
        int A022 = C15040mb.A02(i4 + i, i3, i2);
        if (A022 != i4 && A022 != a1j.A00) {
            a1j.A00 = C15040mb.A02(A022, 1, a1j.A02);
            A1J.A01(a1j).A04(a1j.A00);
        }
    }
}
