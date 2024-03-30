package X;

import java.io.OutputStream;
import java.util.Objects;

/* renamed from: X.AaS  reason: case insensitive filesystem */
public class C21795AaS implements B22 {
    public final byte[] A00;
    public final byte[] A01;

    public byte[] A00(String str, int i, int i2) {
        Objects.requireNonNull(str, "'str' cannot be null");
        if (i2 < 0 || i > str.length() - i2) {
            throw C165617ti.A0W("invalid offset and/or length specified");
        } else if ((i2 & 1) == 0) {
            int i3 = i2 >>> 1;
            byte[] bArr = new byte[i3];
            int i4 = 0;
            while (i4 < i3) {
                byte[] bArr2 = this.A00;
                int i5 = i + 1;
                byte b = bArr2[str.charAt(i)];
                i = i5 + 1;
                byte b2 = (b << 4) | bArr2[str.charAt(i5)];
                if (b2 >= 0) {
                    i4 = C165617ti.A07(bArr, b2, i4);
                } else {
                    throw C90524aI.A0X("invalid characters encountered in Hex string");
                }
            }
            return bArr;
        } else {
            throw C90524aI.A0X("a hexadecimal encoding must have an even number of characters");
        }
    }

    public int B56(OutputStream outputStream, String str) {
        byte[] bArr = new byte[36];
        int length = str.length();
        while (length > 0) {
            char charAt = str.charAt(length - 1);
            if (charAt != 10 && charAt != 13 && charAt != 9 && charAt != ' ') {
                break;
            }
            length--;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 != 10 && charAt2 != 13 && charAt2 != 9 && charAt2 != ' ') {
                    break;
                }
                i++;
            }
            byte[] bArr2 = this.A00;
            int i4 = i + 1;
            byte b = bArr2[str.charAt(i)];
            while (i4 < length) {
                char charAt3 = str.charAt(i4);
                if (charAt3 != 10 && charAt3 != 13 && charAt3 != 9 && charAt3 != ' ') {
                    break;
                }
                i4++;
            }
            i = i4 + 1;
            byte b2 = bArr2[str.charAt(i4)];
            if ((b | b2) >= 0) {
                int i5 = i2 + 1;
                C165587tf.A1T(bArr, b << 4, b2, i2);
                if (i5 == 36) {
                    outputStream.write(bArr);
                    i2 = 0;
                } else {
                    i2 = i5;
                }
                i3++;
            } else {
                throw C90524aI.A0X("invalid characters encountered in Hex string");
            }
        }
        if (i2 > 0) {
            outputStream.write(bArr, 0, i2);
        }
        return i3;
    }

    public int B6S(OutputStream outputStream, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[72];
        while (i2 > 0) {
            int min = Math.min(36, i2);
            int i3 = min + i;
            int i4 = 0;
            for (int i5 = i; i5 < i3; i5++) {
                byte b = bArr[i5] & 255;
                int i6 = i4 + 1;
                byte[] bArr3 = this.A01;
                C165617ti.A0h(bArr3, bArr2, b >>> 4, i4);
                i4 = i6 + 1;
                C165617ti.A0h(bArr3, bArr2, b & 15, i6);
            }
            outputStream.write(bArr2, 0, i4);
            i += min;
            i2 -= min;
        }
        return i2 * 2;
    }

    public C21795AaS() {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        this.A01 = bArr;
        byte[] bArr2 = new byte[128];
        this.A00 = bArr2;
        int i = 0;
        int i2 = 0;
        do {
            bArr2[i2] = -1;
            i2++;
        } while (i2 < 128);
        do {
            bArr2[bArr[i]] = (byte) i;
            i++;
        } while (i < 16);
        bArr2[65] = bArr2[97];
        bArr2[66] = bArr2[98];
        bArr2[67] = bArr2[99];
        bArr2[68] = bArr2[100];
        bArr2[69] = bArr2[101];
        bArr2[70] = bArr2[102];
    }
}
