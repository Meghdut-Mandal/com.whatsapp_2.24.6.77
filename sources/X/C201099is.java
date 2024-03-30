package X;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: X.9is  reason: invalid class name and case insensitive filesystem */
public class C201099is {
    public final int A00;
    public final short A01;
    public final String[] A02;

    public static C201099is A01(String[] strArr) {
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            try {
                int length2 = strArr[i].getBytes(C19430v1.A0B).length;
                if (length2 <= 63) {
                    i2 += length2 + 1;
                    i++;
                } else {
                    throw AnonymousClass001.A09("token may not be longer than 63 bytes");
                }
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        return new C201099is(strArr, i2 + 1, 0);
    }

    public static C201099is A00(byte[] bArr, int i) {
        short s;
        int i2;
        Objects.requireNonNull(bArr, "bytes may not be null");
        int length = bArr.length;
        if (length >= 1) {
            ArrayList A0I = AnonymousClass001.A0I();
            StringBuilder A0u = AnonymousClass000.A0u();
            int i3 = i;
            while (true) {
                if (bArr[i3] == 0 || (bArr[i3] & 192) != 0) {
                    byte b = bArr[i3];
                } else {
                    byte b2 = (byte) (bArr[i3] & 63);
                    int i4 = i3 + 1;
                    i3 = i4 + b2;
                    if (length >= i3 + 1) {
                        A0u.setLength(0);
                        for (byte b3 = 0; b3 < b2; b3 = (byte) (b3 + 1)) {
                            A0u.append((char) bArr[i4 + b3]);
                        }
                        A0I.add(A0u.toString());
                    } else {
                        throw new C221212y("bytes is incomplete");
                    }
                }
            }
            byte b4 = bArr[i3];
            if (b4 == 0) {
                i2 = i3 + 1;
                s = 0;
            } else {
                s = (short) (((((byte) (b4 & 63)) << 8) & 65280) | (bArr[i3 + 1] & 255));
                i2 = i3 + 2;
            }
            return new C201099is(C36371kC.A1b(A0I, 0), i2 - i, s);
        }
        throw new C221212y("insufficient data");
    }

    public void A02(OutputStream outputStream) {
        String[] strArr = this.A02;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            byte[] bytes = strArr[i].getBytes(C19430v1.A0B);
            int length2 = bytes.length;
            if (length2 <= 63) {
                outputStream.write(length2);
                outputStream.write(bytes);
                i++;
            } else {
                throw AnonymousClass001.A09("token may not be longer than 63 bytes");
            }
        }
        short s = this.A01;
        if (s != 0) {
            outputStream.write(((s >>> 8) & 63) | 192);
            outputStream.write(s & 255);
            return;
        }
        outputStream.write(0);
    }

    public C201099is(String[] strArr, int i, short s) {
        this.A02 = strArr;
        this.A01 = s;
        this.A00 = i;
    }
}
