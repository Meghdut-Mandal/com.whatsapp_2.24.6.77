package X;

import java.util.Random;

/* renamed from: X.1b3  reason: invalid class name and case insensitive filesystem */
public final class C30961b3 {
    public final C20810yC A00;
    public final C25811Ht A01;
    public final C21010yW A02;

    public C30961b3(C20810yC r2, C25811Ht r3, C21010yW r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r4, 2);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final void A01(AnonymousClass11F r9) {
        A00(r9, this, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 1);
    }

    public final void A02(AnonymousClass11F r10, int i) {
        AnonymousClass00C.A0D(r10, 0);
        A00(r10, this, Integer.valueOf(i), (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2);
    }

    public final void A03(AnonymousClass11F r9, int i, int i2) {
        AnonymousClass11F r0 = r9;
        if (r9 != null) {
            A00(r0, this, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(i), Integer.valueOf(i2), 7);
        }
    }

    public static final void A00(AnonymousClass11F r4, C30961b3 r5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i) {
        if (C20800yB.A01(C21000yV.A02, r5.A00, 6034)) {
            AnonymousClass2S3 r3 = new AnonymousClass2S3();
            r3.A06 = 1;
            r3.A01 = Integer.valueOf(i);
            C25811Ht r2 = r5.A01;
            r3.A08 = AnonymousClass17V.A00(r2.A05(new Random()), r4.getRawString());
            r3.A05 = num;
            r3.A00 = num2;
            r3.A04 = num3;
            r3.A07 = 1L;
            r3.A03 = num4;
            r3.A02 = num5;
            r5.A02.Bly(r3);
        }
    }
}
