package X;

/* renamed from: X.1Fk  reason: invalid class name and case insensitive filesystem */
public final class C25211Fk {
    public final AnonymousClass17S A00;
    public final C20810yC A01;
    public final C21010yW A02;
    public final AnonymousClass17V A03;

    public C25211Fk(AnonymousClass17S r2, C20810yC r3, C21010yW r4, AnonymousClass17V r5) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r2, 4);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
    }

    public static final int A00(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 4 : 3;
        }
        return 2;
    }

    public final void A01(AnonymousClass11F r5, Integer num) {
        AnonymousClass00C.A0D(r5, 0);
        if (C20800yB.A01(C21000yV.A02, this.A01, 5580)) {
            C45712Sk r2 = new C45712Sk();
            r2.A08 = 2;
            r2.A0D = this.A03.A03(r5.getRawString());
            r2.A00 = Boolean.valueOf(AnonymousClass143.A0G(r5));
            if (num != null) {
                r2.A07 = num;
            }
            this.A02.Bly(r2);
        }
    }

    public final void A02(AnonymousClass11F r6, Integer num) {
        if (C20800yB.A01(C21000yV.A02, this.A01, 5580)) {
            AnonymousClass2T1 r4 = new AnonymousClass2T1();
            r4.A08 = 2;
            r4.A0G = Long.valueOf(((long) this.A00.A03(r6.getRawString())) + 1);
            r4.A0J = this.A03.A03(r6.getRawString());
            r4.A00 = Boolean.valueOf(AnonymousClass143.A0G(r6));
            r4.A07 = num;
            this.A02.Bly(r4);
        }
    }
}
