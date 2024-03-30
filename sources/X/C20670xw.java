package X;

import android.os.Build;

/* renamed from: X.0xw  reason: invalid class name and case insensitive filesystem */
public class C20670xw implements AnonymousClass00M {
    public final C19630wG A00;
    public final AnonymousClass17X A01;
    public final AnonymousClass12P A02;
    public final AnonymousClass12U A03;
    public final AnonymousClass1CR A04;

    public String A00(AnonymousClass11F r4, boolean z) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        C47192dt r2 = (C47192dt) AnonymousClass1CR.A02(this.A04, r4.getRawString());
        boolean equalsIgnoreCase = "Silent".equalsIgnoreCase(r2.A07());
        if (z || equalsIgnoreCase) {
            return r2.A0F();
        }
        return r2.A0E();
    }

    public C20670xw(C19630wG r1, AnonymousClass17X r2, AnonymousClass12P r3, AnonymousClass12U r4, AnonymousClass1CR r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
