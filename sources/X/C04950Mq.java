package X;

/* renamed from: X.0Mq  reason: invalid class name and case insensitive filesystem */
public final class C04950Mq extends C04960Mr {
    public final char[] A00;

    public C04950Mq(AnonymousClass0XB r6) {
        super(r6, (Character) null);
        char[] cArr = new char[512];
        this.A00 = cArr;
        char[] cArr2 = r6.A07;
        int i = 0;
        if (cArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        do {
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
            i++;
        } while (i < 256);
    }

    public final void A01(Appendable appendable, byte[] bArr, int i, int i2) {
        C07320Xe.A02(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i3] & 255;
            char[] cArr = this.A00;
            appendable.append(cArr[b]);
            appendable.append(cArr[b | 256]);
        }
    }

    public final AnonymousClass0X2 A02(AnonymousClass0XB r2, Character ch) {
        return new C04950Mq(r2);
    }
}
