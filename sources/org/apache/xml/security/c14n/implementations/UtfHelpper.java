package org.apache.xml.security.c14n.implementations;

import X.C165577te;
import X.C165617ti;
import java.io.OutputStream;
import java.util.Map;

public class UtfHelpper {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(char r4, java.io.OutputStream r5) {
        /*
            r3 = 128(0x80, float:1.794E-43)
            if (r4 < r3) goto L_0x002e
            r0 = 55296(0xd800, float:7.7486E-41)
            r1 = 63
            if (r4 < r0) goto L_0x0019
            r0 = 56319(0xdbff, float:7.892E-41)
            if (r4 <= r0) goto L_0x0015
            r0 = 57343(0xdfff, float:8.0355E-41)
            if (r4 > r0) goto L_0x0032
        L_0x0015:
            r5.write(r1)
            return
        L_0x0019:
            r0 = 2047(0x7ff, float:2.868E-42)
            if (r4 > r0) goto L_0x0032
            r2 = 192(0xc0, float:2.69E-43)
            r1 = 31
        L_0x0021:
            int r0 = r4 >>> 6
            char r0 = (char) r0
            if (r0 <= 0) goto L_0x0028
            r1 = r1 & r0
            r2 = r2 | r1
        L_0x0028:
            r5.write(r2)
            r4 = r4 & 63
            r4 = r4 | r3
        L_0x002e:
            r5.write(r4)
            return
        L_0x0032:
            int r0 = r4 >>> 12
            char r0 = (char) r0
            r1 = 224(0xe0, float:3.14E-43)
            if (r0 <= 0) goto L_0x003c
            r0 = r0 & 15
            r1 = r1 | r0
        L_0x003c:
            r5.write(r1)
            r2 = 128(0x80, float:1.794E-43)
            r1 = 63
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.c14n.implementations.UtfHelpper.a(char, java.io.OutputStream):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(java.lang.String r7, java.io.OutputStream r8) {
        /*
            int r5 = r7.length()
            r0 = 0
        L_0x0005:
            if (r0 >= r5) goto L_0x0050
            int r6 = r0 + 1
            char r0 = r7.charAt(r0)
            r4 = 128(0x80, float:1.794E-43)
            if (r0 < r4) goto L_0x003c
            r1 = 55296(0xd800, float:7.7486E-41)
            r3 = 63
            if (r0 < r1) goto L_0x0027
            r1 = 56319(0xdbff, float:7.892E-41)
            if (r0 <= r1) goto L_0x0022
            r1 = 57343(0xdfff, float:8.0355E-41)
            if (r0 > r1) goto L_0x0040
        L_0x0022:
            r8.write(r3)
        L_0x0025:
            r0 = r6
            goto L_0x0005
        L_0x0027:
            r1 = 2047(0x7ff, float:2.868E-42)
            if (r0 > r1) goto L_0x0040
            r2 = 192(0xc0, float:2.69E-43)
            r3 = 31
        L_0x002f:
            int r1 = r0 >>> 6
            char r1 = (char) r1
            if (r1 <= 0) goto L_0x0036
            r3 = r3 & r1
            r2 = r2 | r3
        L_0x0036:
            r8.write(r2)
            r0 = r0 & 63
            r0 = r0 | r4
        L_0x003c:
            r8.write(r0)
            goto L_0x0025
        L_0x0040:
            int r1 = r0 >>> 12
            char r1 = (char) r1
            r2 = 224(0xe0, float:3.14E-43)
            if (r1 <= 0) goto L_0x004a
            r1 = r1 & 15
            r2 = r2 | r1
        L_0x004a:
            r8.write(r2)
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x002f
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.c14n.implementations.UtfHelpper.a(java.lang.String, java.io.OutputStream):void");
    }

    public static final void a(String str, OutputStream outputStream, Map map) {
        byte[] A0j = C165617ti.A0j(str, map);
        if (A0j == null) {
            A0j = a(str);
            map.put(str, A0j);
        }
        outputStream.write(A0j);
    }

    public static final byte[] a(String str) {
        int i;
        byte b;
        int i2;
        int length = str.length();
        byte[] bArr = new byte[length];
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (i3 < length) {
            int i5 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                i2 = i4 + 1;
                bArr[i4] = (byte) charAt;
            } else {
                char c = '?';
                if (charAt < 55296 || (charAt > 56319 && charAt > 57343)) {
                    if (!z) {
                        byte[] bArr2 = new byte[(length * 3)];
                        System.arraycopy(bArr, 0, bArr2, 0, i4);
                        bArr = bArr2;
                        z = true;
                    }
                    if (charAt > 2047) {
                        char c2 = (char) (charAt >>> 12);
                        byte b2 = -32;
                        if (c2 > 0) {
                            b2 = (byte) ((c2 & 15) | 65504);
                        }
                        i = i4 + 1;
                        bArr[i4] = b2;
                        b = Byte.MIN_VALUE;
                    } else {
                        c = 31;
                        i = i4;
                        b = -64;
                    }
                    char c3 = (char) (charAt >>> 6);
                    if (c3 > 0) {
                        b = (byte) (b | (c & c3));
                    }
                    int i6 = i + 1;
                    bArr[i] = b;
                    i4 = i6 + 1;
                    C165577te.A1S(bArr, charAt, i6);
                    i3 = i5;
                } else {
                    i2 = i4 + 1;
                    bArr[i4] = 63;
                }
            }
            i3 = i5;
            i4 = i2;
        }
        if (!z) {
            return bArr;
        }
        byte[] bArr3 = new byte[i4];
        System.arraycopy(bArr, 0, bArr3, 0, i4);
        return bArr3;
    }
}
