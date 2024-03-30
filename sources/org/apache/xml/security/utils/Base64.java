package org.apache.xml.security.utils;

import X.AnonymousClass000;
import X.C165607th;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Base64 {
    public static final byte[] a;
    public static final char[] b;

    static {
        int i;
        int i2;
        byte[] bArr = new byte[255];
        a = bArr;
        char[] cArr = new char[64];
        b = cArr;
        int i3 = 0;
        int i4 = 0;
        do {
            bArr[i4] = -1;
            i4++;
        } while (i4 < 255);
        int i5 = 90;
        do {
            bArr[i5] = (byte) (i5 - 65);
            i5--;
        } while (i5 >= 65);
        int i6 = 122;
        do {
            bArr[i6] = (byte) ((i6 - 97) + 26);
            i6--;
            i = 26;
        } while (i6 >= 97);
        int i7 = 57;
        do {
            bArr[i7] = (byte) ((i7 - 48) + 52);
            i7--;
            i2 = 52;
        } while (i7 >= 48);
        bArr[43] = 62;
        bArr[47] = 63;
        int i8 = 0;
        do {
            cArr[i8] = (char) (i8 + 65);
            i8++;
        } while (i8 <= 25);
        int i9 = 0;
        do {
            cArr[i] = (char) (i9 + 97);
            i++;
            i9++;
        } while (i <= 51);
        do {
            cArr[i2] = (char) (i3 + 48);
            i2++;
            i3++;
        } while (i2 <= 61);
        cArr[62] = '+';
        cArr[63] = '/';
    }

    public static final int a(String str, byte[] bArr) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            byte charAt = (byte) str.charAt(i2);
            if (!a(charAt)) {
                bArr[i] = charAt;
                i++;
            }
        }
        return i;
    }

    public static final String a(byte[] bArr, int i) {
        int i2 = i;
        if (i2 < 4) {
            i2 = Integer.MAX_VALUE;
        }
        byte[] bArr2 = bArr;
        if (bArr == null) {
            return null;
        }
        int length = bArr2.length * 8;
        if (length == 0) {
            return "";
        }
        int i3 = length % 24;
        int i4 = length / 24;
        int i5 = i4;
        if (i3 != 0) {
            i5 = i4 + 1;
        }
        int i6 = (i5 - 1) / (i2 / 4);
        char[] cArr = new char[((i5 * 4) + i6)];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i7 < i6) {
            int i11 = 0;
            do {
                int i12 = i10 + 1;
                byte b2 = bArr2[i10];
                int i13 = i12 + 1;
                byte b3 = bArr2[i12];
                i10 = i13 + 1;
                byte b4 = bArr2[i13];
                byte b5 = (byte) (b3 & 15);
                byte b6 = (byte) (b2 & 3);
                int i14 = b2 >> 2;
                if ((b2 & Byte.MIN_VALUE) != 0) {
                    i14 ^= 192;
                }
                byte b7 = (byte) i14;
                int i15 = b3 >> 4;
                if ((b3 & Byte.MIN_VALUE) != 0) {
                    i15 ^= 240;
                }
                byte b8 = (byte) i15;
                int i16 = b4 >> 6;
                if ((b4 & Byte.MIN_VALUE) != 0) {
                    i16 ^= 252;
                }
                int i17 = i9 + 1;
                char[] cArr2 = b;
                cArr[i9] = cArr2[b7];
                int i18 = i17 + 1;
                cArr[i17] = cArr2[(b6 << 4) | b8];
                int i19 = i18 + 1;
                cArr[i18] = cArr2[((byte) i16) | (b5 << 2)];
                i9 = i19 + 1;
                cArr[i19] = cArr2[b4 & 63];
                i8++;
                i11++;
            } while (i11 < 19);
            cArr[i9] = 10;
            i7++;
            i9++;
        }
        while (i8 < i4) {
            int i20 = i10 + 1;
            byte b9 = bArr2[i10];
            int i21 = i20 + 1;
            byte b10 = bArr2[i20];
            i10 = i21 + 1;
            byte b11 = bArr2[i21];
            byte b12 = (byte) (b10 & 15);
            byte b13 = (byte) (b9 & 3);
            int i22 = b9 >> 2;
            if ((b9 & Byte.MIN_VALUE) != 0) {
                i22 ^= 192;
            }
            byte b14 = (byte) i22;
            int i23 = b10 >> 4;
            if ((b10 & Byte.MIN_VALUE) != 0) {
                i23 ^= 240;
            }
            byte b15 = (byte) i23;
            int i24 = b11 >> 6;
            if ((b11 & Byte.MIN_VALUE) != 0) {
                i24 ^= 252;
            }
            int i25 = i9 + 1;
            char[] cArr3 = b;
            cArr[i9] = cArr3[b14];
            int i26 = i25 + 1;
            cArr[i25] = cArr3[b15 | (b13 << 4)];
            int i27 = i26 + 1;
            cArr[i26] = cArr3[(b12 << 2) | ((byte) i24)];
            i9 = i27 + 1;
            cArr[i27] = cArr3[b11 & 63];
            i8++;
        }
        if (i3 == 8) {
            byte b16 = bArr2[i10];
            byte b17 = (byte) (b16 & 3);
            int i28 = b16 >> 2;
            if ((b16 & Byte.MIN_VALUE) != 0) {
                i28 ^= 192;
            }
            int i29 = i9 + 1;
            char[] cArr4 = b;
            cArr[i9] = cArr4[(byte) i28];
            int i30 = i29 + 1;
            cArr[i29] = cArr4[b17 << 4];
            cArr[i30] = '=';
            cArr[i30 + 1] = '=';
        } else if (i3 == 16) {
            byte b18 = bArr2[i10];
            byte b19 = bArr2[i10 + 1];
            byte b20 = (byte) (b19 & 15);
            byte b21 = (byte) (b18 & 3);
            int i31 = b18 >> 2;
            if ((b18 & Byte.MIN_VALUE) != 0) {
                i31 ^= 192;
            }
            byte b22 = (byte) i31;
            byte b23 = b19 & Byte.MIN_VALUE;
            int i32 = b19 >> 4;
            if (b23 != 0) {
                i32 ^= 240;
            }
            byte b24 = (byte) i32;
            int i33 = i9 + 1;
            char[] cArr5 = b;
            cArr[i9] = cArr5[b22];
            int i34 = i33 + 1;
            cArr[i33] = cArr5[b24 | (b21 << 4)];
            cArr[i34] = cArr5[b20 << 2];
            cArr[i34 + 1] = '=';
        }
        return new String(cArr);
    }

    public static final void a(String str, OutputStream outputStream) {
        byte[] bArr = new byte[str.length()];
        a(bArr, outputStream, a(str, bArr));
    }

    public static final void a(byte[] bArr, OutputStream outputStream) {
        a(bArr, outputStream, -1);
    }

    public static final boolean a(byte b2) {
        return b2 == 32 || b2 == 13 || b2 == 10 || b2 == 9;
    }

    public static final byte[] a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[str.length()];
        return b(bArr, a(str, bArr));
    }

    public static final byte[] a(byte[] bArr) {
        return b(bArr, -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] b(byte[] r14, int r15) {
        /*
            r3 = -1
            if (r15 != r3) goto L_0x0007
            int r15 = c(r14)
        L_0x0007:
            int r0 = r15 % 4
            if (r0 != 0) goto L_0x00f9
            int r0 = r15 / 4
            r4 = 0
            if (r0 != 0) goto L_0x0013
            byte[] r0 = new byte[r4]
            return r0
        L_0x0013:
            int r13 = r0 + -1
            int r0 = r13 * 4
            int r11 = r13 * 3
            byte[] r12 = a
            int r2 = r0 + 1
            byte r0 = r14[r0]
            byte r1 = r12[r0]
            int r5 = r2 + 1
            byte r0 = r14[r2]
            byte r10 = r12[r0]
            java.lang.String r2 = "decoding.general"
            if (r1 == r3) goto L_0x00f3
            if (r10 == r3) goto L_0x00f3
            int r0 = r5 + 1
            byte r5 = r14[r5]
            byte r6 = r12[r5]
            byte r7 = r14[r0]
            byte r9 = r12[r7]
            if (r6 == r3) goto L_0x009e
            if (r9 == r3) goto L_0x009e
            int r0 = r11 + 3
            byte[] r5 = new byte[r0]
            int r8 = r11 + 1
            int r1 = r1 << 2
            int r0 = r10 >> 4
            X.C165587tf.A1T(r5, r1, r0, r11)
            int r7 = r8 + 1
            r0 = r10 & 15
            int r1 = r0 << 4
            int r0 = r6 >> 2
            r0 = r0 & 15
            X.C165587tf.A1T(r5, r1, r0, r8)
            int r0 = r6 << 6
            r0 = r0 | r9
            byte r0 = (byte) r0
        L_0x0059:
            r5[r7] = r0
        L_0x005b:
            r10 = 0
        L_0x005c:
            if (r13 <= 0) goto L_0x00e0
            int r1 = r4 + 1
            byte r0 = r14[r4]
            byte r6 = r12[r0]
            int r4 = r1 + 1
            byte r0 = r14[r1]
            byte r11 = r12[r0]
            int r1 = r4 + 1
            byte r0 = r14[r4]
            byte r9 = r12[r0]
            int r4 = r1 + 1
            byte r0 = r14[r1]
            byte r8 = r12[r0]
            if (r6 == r3) goto L_0x00da
            if (r11 == r3) goto L_0x00da
            if (r9 == r3) goto L_0x00da
            if (r8 == r3) goto L_0x00da
            int r7 = r10 + 1
            int r1 = r6 << 2
            int r0 = r11 >> 4
            X.C165587tf.A1T(r5, r1, r0, r10)
            int r6 = r7 + 1
            r0 = r11 & 15
            int r1 = r0 << 4
            int r0 = r9 >> 2
            r0 = r0 & 15
            X.C165587tf.A1T(r5, r1, r0, r7)
            int r10 = r6 + 1
            int r0 = r9 << 6
            X.C165587tf.A1T(r5, r8, r0, r6)
            int r13 = r13 + -1
            goto L_0x005c
        L_0x009e:
            r0 = 61
            boolean r5 = X.AnonymousClass000.A1S(r5, r0)
            boolean r0 = X.AnonymousClass000.A1S(r7, r0)
            if (r5 == 0) goto L_0x00bc
            if (r0 == 0) goto L_0x00ed
            r0 = r10 & 15
            if (r0 != 0) goto L_0x00e1
            int r0 = r11 + 1
            byte[] r5 = new byte[r0]
            int r1 = r1 << 2
            int r0 = r10 >> 4
            X.C165587tf.A1T(r5, r1, r0, r11)
            goto L_0x005b
        L_0x00bc:
            if (r0 == 0) goto L_0x00ed
            r0 = r6 & 3
            if (r0 != 0) goto L_0x00e7
            int r0 = r11 + 2
            byte[] r5 = new byte[r0]
            int r7 = r11 + 1
            int r1 = r1 << 2
            int r0 = r10 >> 4
            X.C165587tf.A1T(r5, r1, r0, r11)
            r0 = r10 & 15
            int r1 = r0 << 4
            int r0 = r6 >> 2
            r0 = r0 & 15
            r1 = r1 | r0
            byte r0 = (byte) r1
            goto L_0x0059
        L_0x00da:
            org.apache.xml.security.exceptions.Base64DecodingException r0 = new org.apache.xml.security.exceptions.Base64DecodingException
            r0.<init>(r2)
            throw r0
        L_0x00e0:
            return r5
        L_0x00e1:
            org.apache.xml.security.exceptions.Base64DecodingException r0 = new org.apache.xml.security.exceptions.Base64DecodingException
            r0.<init>(r2)
            throw r0
        L_0x00e7:
            org.apache.xml.security.exceptions.Base64DecodingException r0 = new org.apache.xml.security.exceptions.Base64DecodingException
            r0.<init>(r2)
            throw r0
        L_0x00ed:
            org.apache.xml.security.exceptions.Base64DecodingException r0 = new org.apache.xml.security.exceptions.Base64DecodingException
            r0.<init>(r2)
            throw r0
        L_0x00f3:
            org.apache.xml.security.exceptions.Base64DecodingException r0 = new org.apache.xml.security.exceptions.Base64DecodingException
            r0.<init>(r2)
            throw r0
        L_0x00f9:
            java.lang.String r1 = "decoding.divisible.four"
            org.apache.xml.security.exceptions.Base64DecodingException r0 = new org.apache.xml.security.exceptions.Base64DecodingException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.Base64.b(byte[], int):byte[]");
    }

    public static final int c(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i = 0;
        for (byte b2 : bArr) {
            if (!a(b2)) {
                bArr[i] = b2;
                i++;
            }
        }
        return i;
    }

    public static final void a(InputStream inputStream, OutputStream outputStream) {
        int i;
        int i2;
        byte b2;
        byte[] bArr = new byte[4];
        loop0:
        while (true) {
            int i3 = 0;
            while (true) {
                int read = inputStream.read();
                if (read <= 0) {
                    break loop0;
                }
                byte b3 = (byte) read;
                if (!a(b3)) {
                    boolean A1S = AnonymousClass000.A1S(b3, 61);
                    int i4 = i3 + 1;
                    bArr[i3] = b3;
                    if (A1S) {
                        if (i4 == 3) {
                            bArr[i4] = (byte) inputStream.read();
                        }
                    } else if (b3 != -1) {
                        if (i4 == 4) {
                            break;
                        }
                        i3 = i4;
                    } else {
                        throw new Base64DecodingException("decoding.general");
                    }
                }
            }
            byte[] bArr2 = a;
            byte b4 = bArr2[bArr[0]];
            byte b5 = bArr2[bArr[1]];
            byte b6 = bArr2[bArr[2]];
            byte b7 = bArr2[bArr[3]];
            C165607th.A1I(outputStream, b4 << 2, b5 >> 4);
            C165607th.A1I(outputStream, (b5 & 15) << 4, (b6 >> 2) & 15);
            C165607th.A1I(outputStream, b7, b6 << 6);
        }
        byte b8 = bArr[0];
        byte b9 = bArr[1];
        byte b10 = bArr[2];
        byte b11 = bArr[3];
        byte[] bArr3 = a;
        byte b12 = bArr3[b8];
        byte b13 = bArr3[b9];
        byte b14 = bArr3[b10];
        byte b15 = bArr3[b11];
        if (b14 == -1 || b15 == -1) {
            boolean A1S2 = AnonymousClass000.A1S(b10, 61);
            boolean A1S3 = AnonymousClass000.A1S(b11, 61);
            if (A1S2) {
                if (A1S3) {
                    if ((b13 & 15) == 0) {
                        i = b12 << 2;
                        i2 = b13 >> 4;
                    } else {
                        throw new Base64DecodingException("decoding.general");
                    }
                }
                throw new Base64DecodingException("decoding.general");
            }
            if (A1S3) {
                if ((b14 & 3) == 0) {
                    C165607th.A1I(outputStream, b12 << 2, b13 >> 4);
                    i = (b13 & 15) << 4;
                    i2 = (b14 >> 2) & 15;
                } else {
                    throw new Base64DecodingException("decoding.general");
                }
            }
            throw new Base64DecodingException("decoding.general");
            b2 = i | i2;
        } else {
            C165607th.A1I(outputStream, b12 << 2, b13 >> 4);
            C165607th.A1I(outputStream, (b13 & 15) << 4, (b14 >> 2) & 15);
            b2 = (b14 << 6) | b15;
        }
        outputStream.write((byte) b2);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r7v0, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r5v0, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r2v1, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r3v1, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v1, types: [byte] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(byte[] r11, java.io.OutputStream r12, int r13) {
        /*
            r8 = -1
            if (r13 != r8) goto L_0x0007
            int r13 = c(r11)
        L_0x0007:
            int r0 = r13 % 4
            if (r0 != 0) goto L_0x00d6
            int r0 = r13 / 4
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r10 = 0
            int r9 = r0 + -1
        L_0x0013:
            java.lang.String r6 = "decoding.general"
            if (r9 <= 0) goto L_0x0059
            byte[] r7 = a
            int r1 = r10 + 1
            byte r0 = r11[r10]
            byte r5 = r7[r0]
            int r2 = r1 + 1
            byte r0 = r11[r1]
            byte r4 = r7[r0]
            int r1 = r2 + 1
            byte r0 = r11[r2]
            byte r3 = r7[r0]
            int r10 = r1 + 1
            byte r0 = r11[r1]
            byte r2 = r7[r0]
            if (r5 == r8) goto L_0x0053
            if (r4 == r8) goto L_0x0053
            if (r3 == r8) goto L_0x0053
            if (r2 == r8) goto L_0x0053
            int r1 = r5 << 2
            int r0 = r4 >> 4
            X.C165607th.A1I(r12, r1, r0)
            r0 = r4 & 15
            int r1 = r0 << 4
            int r0 = r3 >> 2
            r0 = r0 & 15
            X.C165607th.A1I(r12, r1, r0)
            int r0 = r3 << 6
            X.C165607th.A1I(r12, r0, r2)
            int r9 = r9 + -1
            goto L_0x0013
        L_0x0053:
            org.apache.xml.security.exceptions.Base64DecodingException r0 = new org.apache.xml.security.exceptions.Base64DecodingException
            r0.<init>(r6)
            throw r0
        L_0x0059:
            byte[] r3 = a
            int r2 = r10 + 1
            byte r0 = r11[r10]
            byte r7 = r3[r0]
            int r1 = r2 + 1
            byte r0 = r11[r2]
            byte r5 = r3[r0]
            if (r7 == r8) goto L_0x00d0
            if (r5 == r8) goto L_0x00d0
            int r0 = r1 + 1
            byte r1 = r11[r1]
            byte r2 = r3[r1]
            byte r4 = r11[r0]
            byte r3 = r3[r4]
            if (r2 == r8) goto L_0x0091
            if (r3 == r8) goto L_0x0091
            int r1 = r7 << 2
            int r0 = r5 >> 4
            X.C165607th.A1I(r12, r1, r0)
            r0 = r5 & 15
            int r1 = r0 << 4
            int r0 = r2 >> 2
            r0 = r0 & 15
            X.C165607th.A1I(r12, r1, r0)
            int r1 = r2 << 6
        L_0x008d:
            X.C165607th.A1I(r12, r1, r3)
            return
        L_0x0091:
            r0 = 61
            boolean r1 = X.AnonymousClass000.A1S(r1, r0)
            boolean r0 = X.AnonymousClass000.A1S(r4, r0)
            if (r1 == 0) goto L_0x00a8
            if (r0 == 0) goto L_0x00ca
            r0 = r5 & 15
            if (r0 != 0) goto L_0x00be
            int r1 = r7 << 2
            int r3 = r5 >> 4
            goto L_0x008d
        L_0x00a8:
            if (r0 == 0) goto L_0x00ca
            r0 = r2 & 3
            if (r0 != 0) goto L_0x00c4
            int r1 = r7 << 2
            int r0 = r5 >> 4
            X.C165607th.A1I(r12, r1, r0)
            r0 = r5 & 15
            int r1 = r0 << 4
            int r0 = r2 >> 2
            r3 = r0 & 15
            goto L_0x008d
        L_0x00be:
            org.apache.xml.security.exceptions.Base64DecodingException r0 = new org.apache.xml.security.exceptions.Base64DecodingException
            r0.<init>(r6)
            throw r0
        L_0x00c4:
            org.apache.xml.security.exceptions.Base64DecodingException r0 = new org.apache.xml.security.exceptions.Base64DecodingException
            r0.<init>(r6)
            throw r0
        L_0x00ca:
            org.apache.xml.security.exceptions.Base64DecodingException r0 = new org.apache.xml.security.exceptions.Base64DecodingException
            r0.<init>(r6)
            throw r0
        L_0x00d0:
            org.apache.xml.security.exceptions.Base64DecodingException r0 = new org.apache.xml.security.exceptions.Base64DecodingException
            r0.<init>(r6)
            throw r0
        L_0x00d6:
            java.lang.String r1 = "decoding.divisible.four"
            org.apache.xml.security.exceptions.Base64DecodingException r0 = new org.apache.xml.security.exceptions.Base64DecodingException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.utils.Base64.a(byte[], java.io.OutputStream, int):void");
    }

    public static final byte[] a(Element element) {
        StringBuffer A0x = C165607th.A0x();
        for (Node firstChild = element.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 3) {
                A0x.append(((CharacterData) firstChild).getData());
            }
        }
        return a(A0x.toString());
    }

    public static final String b(byte[] bArr) {
        int i = 76;
        if (XMLUtils.c) {
            i = Integer.MAX_VALUE;
        }
        return a(bArr, i);
    }

    public static final boolean b(byte b2) {
        return AnonymousClass000.A1S(b2, 61);
    }
}
