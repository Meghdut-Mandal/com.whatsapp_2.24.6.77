package X;

/* renamed from: X.6fC  reason: invalid class name and case insensitive filesystem */
public final class C136886fC implements C161237mQ {
    public static final C136886fC A00 = new C136886fC();

    public static final float A00(long j) {
        long j2 = C133336Xx.A01;
        AnonymousClass6FX r5 = C114185go.A0K[(int) (j & 63)];
        long j3 = r5.A01;
        if (j3 == AnonymousClass6J1.A01) {
            C157667du r2 = ((C94564iQ) r5).A02;
            float BKs = (float) ((r2.BKs((double) C133336Xx.A04(j)) * 0.2126d) + (r2.BKs((double) C133336Xx.A03(j)) * 0.7152d) + (r2.BKs((double) C133336Xx.A02(j)) * 0.0722d));
            if (BKs <= 0.0f) {
                return 0.0f;
            }
            if (BKs >= 1.0f) {
                return 1.0f;
            }
            return BKs;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("The specified color must be encoded in an RGB color space. The supplied color space is ");
        A0u.append(AnonymousClass6J1.A00(j3));
        throw AnonymousClass000.A0b(A0u);
    }

    public long B5A(C161337ma r3, int i) {
        r3.Bum(2042140174);
        long j = C133336Xx.A01;
        A00(j);
        C136916fF.A0N(r3);
        return j;
    }

    public C128296Br Boq(C161337ma r6, int i) {
        C128296Br r0;
        r6.Bum(-1629816343);
        if (((double) A00(C133336Xx.A01)) > 0.5d) {
            r0 = C113795g8.A00;
        } else {
            r0 = C113795g8.A01;
        }
        C136916fF.A0N(r6);
        return r0;
    }
}
