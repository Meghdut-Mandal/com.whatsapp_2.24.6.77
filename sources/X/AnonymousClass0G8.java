package X;

/* renamed from: X.0G8  reason: invalid class name */
public final class AnonymousClass0G8 extends C06660Un {
    public int A00;

    public static final int A00(AnonymousClass0G8 r7, int i) {
        int i2 = r7.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long A0R = AnonymousClass000.A0R(AnonymousClass000.A0S(r7.A03, i3));
            if (A0R != 0) {
                return AnonymousClass000.A07(i3, i2, A0R);
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public AnonymousClass0G8(int i) {
        AnonymousClass0GA r0 = C05860Ri.A01;
        A01(this, i + ((i - 1) / 7));
    }

    public static final void A01(AnonymousClass0G8 r3, int i) {
        int A03 = AnonymousClass000.A03(i);
        r3.A00 = A03;
        long[] A1a = AnonymousClass000.A1a(A03);
        r3.A03 = A1a;
        AnonymousClass000.A1H(A1a, A03);
        int i2 = r3.A00;
        AnonymousClass0GA r0 = C05860Ri.A01;
        r3.A00 = AnonymousClass000.A02(i2) - r3.A01;
        r3.A02 = new long[A03];
    }

    public AnonymousClass0G8() {
        this(6);
    }
}
