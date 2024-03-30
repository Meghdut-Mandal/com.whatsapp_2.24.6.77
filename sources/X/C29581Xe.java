package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.1Xe  reason: invalid class name and case insensitive filesystem */
public final class C29581Xe {
    public static final long A06 = TimeUnit.MINUTES.toMillis(30);
    public final C19730wQ A00;
    public final C19970wo A01;
    public final C20810yC A02;
    public final C29601Xg A03;
    public final C29591Xf A04;
    public final AnonymousClass1DW A05;

    public C29581Xe(C19730wQ r2, C29601Xg r3, C29591Xf r4, C19970wo r5, AnonymousClass1DW r6, C20810yC r7) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r4, 5);
        this.A01 = r5;
        this.A02 = r7;
        this.A00 = r2;
        this.A05 = r6;
        this.A04 = r4;
        this.A03 = r3;
    }

    public final void A00(AnonymousClass2bT r4, String str, C006302t r6) {
        AnonymousClass00C.A0D(r4, 0);
        C35491im r2 = new C35491im(r6, r4, str, 6);
        if (C29591Xf.A00(r4, 93)) {
            this.A03.A01(r4, r2, 93);
        } else {
            r2.run();
        }
    }

    public final boolean A01(AnonymousClass2bT r7) {
        String str = r7.A04;
        if (str == null || str.length() == 0 || !this.A05.A0F(str) || r7.A00 - C19970wo.A00(this.A01) > A06) {
            return false;
        }
        return true;
    }
}
