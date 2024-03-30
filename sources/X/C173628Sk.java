package X;

/* renamed from: X.8Sk  reason: invalid class name and case insensitive filesystem */
public final class C173628Sk extends AnonymousClass9VP {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public C173628Sk(int i, int[] iArr, int i2) {
        super(i, i2);
        this.A01 = i;
        this.A00 = i2;
        int i3 = 0;
        int i4 = i * i2;
        byte[] bArr = new byte[i4];
        this.A02 = bArr;
        while (i3 < i4) {
            int i5 = iArr[i3];
            i3 = C165617ti.A07(bArr, ((((i5 >> 16) & 255) + ((i5 >> 7) & 510)) + (i5 & 255)) / 4, i3);
        }
    }
}
