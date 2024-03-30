package X;

/* renamed from: X.1Xg  reason: invalid class name and case insensitive filesystem */
public class C29601Xg {
    public final C29591Xf A00;
    public final AnonymousClass1G5 A01;
    public final AnonymousClass16J A02;
    public final C26171Jd A03;
    public final C19930wk A04;
    public final AnonymousClass17Y A05;
    public final C20810yC A06;

    public static void A00(C29601Xg r7, AnonymousClass3T1 r8, Runnable runnable, int i, boolean z, boolean z2) {
        C29601Xg r3 = r7;
        AnonymousClass3T1 r5 = r8;
        r7.A05.A0H(new C35361iZ((Object) r3, (Object) runnable, (Object) r5, i, 1, z));
        if (z2) {
            r3.A04.execute(new C35261iP((Object) r3, i, 2, (Object) r5));
        }
    }

    public void A01(AnonymousClass3T1 r9, Runnable runnable, int i) {
        AnonymousClass3T1 r3 = r9;
        boolean A012 = this.A01.A00().A01(r9.A1J.A00);
        int i2 = i;
        Runnable runnable2 = runnable;
        if (C29591Xf.A00(r9, i)) {
            this.A04.execute(new C35361iZ((Object) this, (Object) r3, (Object) runnable2, i2, 0, A012));
        } else {
            A00(this, r3, runnable2, i2, false, A012);
        }
    }

    public C29601Xg(AnonymousClass17Y r3, C29591Xf r4, AnonymousClass1G5 r5, AnonymousClass16J r6, C26171Jd r7, C20810yC r8, C19770wU r9) {
        this.A06 = r8;
        this.A05 = r3;
        this.A02 = r6;
        this.A03 = r7;
        this.A01 = r5;
        this.A04 = new C19930wk(r9, true);
        this.A00 = r4;
    }
}
