package X;

import java.io.InputStream;

/* renamed from: X.9iI  reason: invalid class name and case insensitive filesystem */
public class C200819iI {
    public static final byte[] A01 = {71, 79, 65};
    public final InputStream A00;

    public static void A00(C200819iI r4, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int read = r4.A00.read(bArr, i, length);
            if (read != -1) {
                i += read;
                length -= read;
            } else {
                throw C90524aI.A0X("Closed before read completed!");
            }
        }
    }

    public C200819iI(InputStream inputStream) {
        this.A00 = inputStream;
    }
}
