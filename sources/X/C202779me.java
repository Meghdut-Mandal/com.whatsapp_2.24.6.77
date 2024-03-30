package X;

/* renamed from: X.9me  reason: invalid class name and case insensitive filesystem */
public abstract class C202779me {
    public static int A01(byte[] bArr, int[] iArr, int i, int i2, int i3) {
        iArr[i2] = i;
        return A00(bArr, i3);
    }

    public static void A02(byte[] bArr, int i, int i2) {
        C165607th.A15(i >>> 8, bArr, C165617ti.A07(bArr, i >>> 16, C165617ti.A07(bArr, i >>> 24, i2)), i);
    }

    public static int A00(byte[] bArr, int i) {
        return C165577te.A0B(bArr, i);
    }

    public static void A03(byte[] bArr, int i, long j) {
        A02(bArr, C90514aH.A0D(j), i);
        A02(bArr, (int) (j & 4294967295L), i + 4);
    }

    public static void A04(byte[] bArr, int i, long j) {
        C165587tf.A1S(bArr, (int) (4294967295L & j), i);
        C165587tf.A1S(bArr, C90514aH.A0D(j), i + 4);
    }
}
