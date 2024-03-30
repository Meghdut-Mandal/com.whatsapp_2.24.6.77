package X;

/* renamed from: X.4tJ  reason: invalid class name and case insensitive filesystem */
public final class C99404tJ extends C99414tK {
    public final char[] A00 = new char[512];

    public C99404tJ(AnonymousClass6DS r6) {
        super(r6, (Character) null);
        char[] cArr = r6.A06;
        int i = 0;
        C20740y5.A06(AnonymousClass000.A1S(cArr.length, 16));
        do {
            char[] cArr2 = this.A00;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
            i++;
        } while (i < 256);
    }
}
