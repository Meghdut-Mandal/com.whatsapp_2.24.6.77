package X;

import java.util.Arrays;

/* renamed from: X.4iS  reason: invalid class name and case insensitive filesystem */
public final class C94584iS extends C132646Uq {
    public final C94564iQ A00;
    public final C94564iQ A01;
    public final float[] A02;

    public C94584iS(C94564iQ r10, C94564iQ r11) {
        super(r10, r11, r10, r11);
        float[] A04;
        this.A01 = r10;
        this.A00 = r11;
        AnonymousClass6EN r1 = r10.A07;
        AnonymousClass6EN r8 = r11.A07;
        if (AnonymousClass6VY.A02(r1, r8)) {
            A04 = AnonymousClass6VY.A04(r11.A0B, r10.A0D);
        } else {
            float[] fArr = r10.A0D;
            float[] fArr2 = r11.A0B;
            float[] A002 = r1.A00();
            float[] A003 = r8.A00();
            AnonymousClass6EN r5 = C114055gZ.A01;
            if (!AnonymousClass6VY.A02(r1, r5)) {
                float[] fArr3 = C197469bl.A01.A00;
                float[] copyOf = Arrays.copyOf(C114055gZ.A04, 3);
                AnonymousClass00C.A08(copyOf);
                fArr = AnonymousClass6VY.A04(AnonymousClass6VY.A05(fArr3, A002, copyOf), fArr);
            }
            if (!AnonymousClass6VY.A02(r8, r5)) {
                float[] fArr4 = C197469bl.A01.A00;
                float[] copyOf2 = Arrays.copyOf(C114055gZ.A04, 3);
                AnonymousClass00C.A08(copyOf2);
                fArr2 = AnonymousClass6VY.A03(AnonymousClass6VY.A04(AnonymousClass6VY.A05(fArr4, A003, copyOf2), r11.A0D));
            }
            A04 = AnonymousClass6VY.A04(fArr2, fArr);
        }
        this.A02 = A04;
    }
}
