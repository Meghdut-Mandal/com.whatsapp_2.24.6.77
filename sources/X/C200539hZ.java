package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;

/* renamed from: X.9hZ  reason: invalid class name and case insensitive filesystem */
public abstract class C200539hZ {
    public static byte[][] A01(byte[] bArr, int i, int i2) {
        byte[][] bArr2 = new byte[2][];
        bArr2[0] = new byte[i];
        C165587tf.A1K(bArr, bArr2, i, i2);
        return bArr2;
    }

    public static byte[][] A02(byte[] bArr, int i, int i2, int i3) {
        String obj;
        if (bArr != null && i2 >= 0) {
            int i4 = i + i2;
            if (bArr.length >= i4 + i3) {
                byte[][] bArr2 = new byte[3][];
                bArr2[0] = new byte[i];
                C165587tf.A1K(bArr, bArr2, i, i2);
                bArr2[2] = new byte[i3];
                System.arraycopy(bArr, i4, bArr2[2], 0, i3);
                return bArr2;
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Input too small: ");
        if (bArr == null) {
            obj = null;
        } else {
            StringBuffer A0x = C165607th.A0x();
            for (byte b : bArr) {
                A0x.append("(byte)0x");
                char[] cArr = AnonymousClass9A9.A00;
                A0x.append(cArr[(b >> 4) & 15]);
                A0x.append(cArr[b & 15]);
                A0x.append(", ");
            }
            obj = A0x.toString();
        }
        throw new ParseException(AnonymousClass000.A0q(obj, A0u), 0);
    }

    public static byte[] A00(byte[]... bArr) {
        try {
            ByteArrayOutputStream A0Q = C90524aI.A0Q();
            for (byte[] write : bArr) {
                A0Q.write(write);
            }
            return A0Q.toByteArray();
        } catch (IOException e) {
            throw C90524aI.A0Y(e);
        }
    }
}
