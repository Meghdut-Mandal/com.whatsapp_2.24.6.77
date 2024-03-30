package X;

/* renamed from: X.124  reason: invalid class name */
public abstract class AnonymousClass124 {
    public static int A00(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static boolean A01(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (bArr == bArr2) {
            return true;
        }
        int length = bArr.length;
        byte b = length;
        int length2 = bArr2.length;
        if (length >= length2) {
            length = length2;
        }
        byte b2 = b ^ length2;
        for (int i = 0; i != length; i++) {
            b2 |= bArr[i] ^ bArr2[i];
        }
        while (length < length2) {
            byte b3 = bArr2[length];
            b2 |= b3 ^ (~b3);
            length++;
        }
        return b2 == 0;
    }

    public static byte[] A02(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static char[] A03(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return (char[]) cArr.clone();
    }
}
