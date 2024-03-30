package X;

/* renamed from: X.A3u  reason: case insensitive filesystem */
public final class C21031A3u implements C22807AwI {
    public final int A00;
    public final C23119B5y A01;
    public final String A02;
    public final Object[] A03;

    public C21031A3u(C23119B5y b5y, String str, Object[] objArr) {
        char charAt;
        this.A01 = b5y;
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
