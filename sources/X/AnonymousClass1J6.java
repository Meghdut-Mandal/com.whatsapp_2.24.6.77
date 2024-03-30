package X;

/* renamed from: X.1J6  reason: invalid class name */
public class AnonymousClass1J6 {
    public final C21010yW A00;
    public final C21390zA A01;
    public final AnonymousClass19J A02;
    public final C20810yC A03;

    public static void A00(AnonymousClass1J6 r6, int i, int i2, int i3, int i4, long j, boolean z, boolean z2) {
        AnonymousClass2SK r3 = new AnonymousClass2SK();
        r3.A08 = Long.valueOf(j);
        r3.A04 = Integer.valueOf(i);
        r3.A07 = Long.valueOf((long) i3);
        r3.A05 = Integer.valueOf(i2);
        if (r6.A01.A00) {
            r3.A03 = 1;
        } else {
            r3.A03 = 2;
        }
        boolean z3 = false;
        if (r6.A02.A04 == 2) {
            z3 = true;
        }
        r3.A02 = Boolean.valueOf(z3);
        r3.A01 = Boolean.valueOf(z);
        r3.A09 = Long.valueOf((long) i4);
        if (z2) {
            r3.A06 = 0;
        } else {
            r3.A06 = 1;
        }
        if (C20800yB.A01(C21000yV.A02, r6.A03, 3157)) {
            r3.A00 = true;
            r6.A00.Bls(r3, new C18950u5(1, 1), true);
            return;
        }
        r6.A00.Bly(r3);
    }

    public void A01(int i, long j, long j2, long j3) {
        AnonymousClass58N r4 = new AnonymousClass58N();
        r4.A04 = Integer.valueOf(i);
        r4.A05 = Long.valueOf(j);
        r4.A07 = Long.valueOf(j2);
        r4.A06 = Long.valueOf(j3);
        if (this.A01.A00) {
            r4.A02 = 1;
        } else {
            r4.A02 = 2;
        }
        boolean z = false;
        if (this.A02.A04 == 2) {
            z = true;
        }
        r4.A01 = Boolean.valueOf(z);
        r4.A03 = 1;
        this.A00.Bly(r4);
    }

    public AnonymousClass1J6(C21390zA r1, AnonymousClass19J r2, C20810yC r3, C21010yW r4) {
        this.A00 = r4;
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
    }
}
