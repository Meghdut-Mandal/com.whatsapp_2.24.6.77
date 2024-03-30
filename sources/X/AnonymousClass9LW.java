package X;

/* renamed from: X.9LW  reason: invalid class name */
public final class AnonymousClass9LW {
    public final int A00;
    public final B63 A01;
    public final String A02;
    public final Object[] A03;

    public AnonymousClass9LW(B63 b63, String str, Object[] objArr) {
        char charAt;
        this.A01 = b63;
        this.A02 = str;
        this.A03 = objArr;
        char A002 = C165597tg.A00(str);
        if (A002 >= 55296) {
            int i = A002 & 8191;
            int i2 = 13;
            int i3 = 1;
            while (true) {
                int i4 = i3 + 1;
                charAt = str.charAt(i3);
                if (charAt < 55296) {
                    break;
                }
                i = C165597tg.A04(charAt, i2, i);
                i2 += 13;
                i3 = i4;
            }
            A002 = i | (charAt << i2);
        }
        this.A00 = A002;
    }
}
