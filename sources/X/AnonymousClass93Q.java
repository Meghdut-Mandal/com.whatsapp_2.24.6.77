package X;

import java.io.OutputStream;

/* renamed from: X.93Q  reason: invalid class name */
public abstract class AnonymousClass93Q {
    public static void A00(OutputStream outputStream, int i) {
        A01(outputStream, 2, (long) i);
    }

    public static void A01(OutputStream outputStream, int i, long j) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            i2 = C165617ti.A07(bArr, (int) ((j >> (i2 * 8)) & 255), i2);
        }
        outputStream.write(bArr);
    }
}
