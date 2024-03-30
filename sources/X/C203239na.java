package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.9na  reason: invalid class name and case insensitive filesystem */
public abstract class C203239na {
    public static int A00(byte[] bArr) {
        return (bArr[2] & 255) | C165597tg.A08(bArr, 1, (bArr[0] & 255) << 16);
    }

    public static byte[] A02(int i) {
        byte[] bArr = new byte[4];
        bArr[3] = (byte) i;
        bArr[2] = (byte) (i >> 8);
        bArr[1] = (byte) (i >> 16);
        bArr[0] = (byte) (i >> 24);
        return bArr;
    }

    public static byte[] A03(int i) {
        byte[] bArr = new byte[3];
        bArr[2] = (byte) i;
        bArr[1] = (byte) (i >> 8);
        bArr[0] = (byte) (i >> 16);
        return bArr;
    }

    public static byte[][] A06(byte[] bArr, int i, int i2) {
        byte[][] bArr2 = new byte[2][];
        bArr2[0] = new byte[i];
        C165587tf.A1K(bArr, bArr2, i, i2);
        return bArr2;
    }

    public static byte[][] A07(byte[] bArr, int i, int i2, int i3) {
        if (i2 >= 0 && i3 >= 0) {
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
        throw new ParseException(AnonymousClass000.A0q(C196879ag.A00(bArr), A0u), 0);
    }

    public static byte[][] A08(byte[] bArr, byte[] bArr2) {
        return A06(AnonymousClass6R0.A02(bArr, bArr2, (byte[]) null, 64), 32, 32);
    }

    public static int A01(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | C165597tg.A08(bArr, i + 2, C165607th.A0B(bArr, i + 1, (bArr[i] & 255) << 24));
    }

    public static byte[] A04(Collection collection) {
        try {
            ByteArrayOutputStream A0Q = C90524aI.A0Q();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                A0Q.write((byte[]) it.next());
            }
            return A0Q.toByteArray();
        } catch (IOException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public static byte[] A05(byte[]... bArr) {
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
