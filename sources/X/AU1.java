package X;

import java.io.Closeable;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

public final class AU1 implements Closeable, C23125B6g, WritableByteChannel, Flushable, Cloneable, ByteChannel {
    public static final byte[] A02;
    public long A00;
    public C200069gY A01;

    public int A02(byte[] bArr, int i, int i2) {
        C1902797o.A00((long) bArr.length, (long) i, (long) i2);
        C200069gY r6 = this.A01;
        if (r6 == null) {
            return -1;
        }
        int i3 = r6.A00;
        int i4 = r6.A01;
        int min = Math.min(i2, i3 - i4);
        System.arraycopy(r6.A06, i4, bArr, i, min);
        int i5 = r6.A01 + min;
        r6.A01 = i5;
        this.A00 -= (long) min;
        if (i5 == r6.A00) {
            C200069gY.A00(this, r6);
        }
        return min;
    }

    public void A05(int i) {
        C200069gY A04 = A04(4);
        byte[] bArr = A04.A06;
        int i2 = A04.A00;
        int i3 = i2 + 1;
        C165597tg.A1N(bArr, i >>> 24, i2);
        int i4 = i3 + 1;
        C165597tg.A1N(bArr, i >>> 16, i3);
        int i5 = i4 + 1;
        C165597tg.A1N(bArr, i >>> 8, i4);
        C165597tg.A1N(bArr, i, i5);
        A04.A00 = i5 + 1;
        this.A00 += 4;
    }

    public void A07(String str, int i, int i2) {
        int i3;
        long j;
        long j2;
        long j3;
        long j4;
        char c;
        if (i < 0) {
            throw AnonymousClass000.A0d("beginIndex < 0: ", AnonymousClass000.A0u(), i);
        } else if (i2 >= i) {
            int length = str.length();
            if (i2 > length) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("endIndex > string.length: ");
                A0u.append(i2);
                throw AnonymousClass000.A0d(" > ", A0u, length);
            }
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C200069gY A04 = A04(1);
                    byte[] bArr = A04.A06;
                    int i4 = A04.A00 - i;
                    int min = Math.min(i2, 8192 - i4);
                    i3 = i + 1;
                    bArr[i + i4] = (byte) charAt;
                    while (i3 < min) {
                        char charAt2 = str.charAt(i3);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i3 + i4] = (byte) charAt2;
                        i3++;
                    }
                    int i5 = A04.A00;
                    int i6 = (i4 + i3) - i5;
                    A04.A00 = i5 + i6;
                    j = this.A00;
                    j2 = (long) i6;
                } else {
                    if (charAt < 2048) {
                        C200069gY A042 = A04(2);
                        byte[] bArr2 = A042.A06;
                        int i7 = A042.A00;
                        C165577te.A1S(bArr2, charAt, C165617ti.A07(bArr2, (charAt >> 6) | 192, i7));
                        A042.A00 = i7 + 2;
                        j3 = this.A00;
                        j4 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        C200069gY A043 = A04(3);
                        byte[] bArr3 = A043.A06;
                        int i8 = A043.A00;
                        C165587tf.A1T(bArr3, 63 & (charAt >> 6), 128, C165617ti.A07(bArr3, (charAt >> 12) | 224, i8));
                        C165577te.A1S(bArr3, charAt, i8 + 2);
                        A043.A00 = i8 + 3;
                        j3 = this.A00;
                        j4 = 3;
                    } else {
                        i3 = i + 1;
                        if (i3 < i2) {
                            c = str.charAt(i3);
                        } else {
                            c = 0;
                        }
                        if (charAt > 56319 || 56320 > c || 57343 < c) {
                            C200069gY A044 = A04(1);
                            byte[] bArr4 = A044.A06;
                            int i9 = A044.A00;
                            A044.A00 = i9 + 1;
                            bArr4[i9] = (byte) 63;
                            j = this.A00;
                            j2 = 1;
                        } else {
                            int i10 = (((charAt & 1023) << 10) | (c & 1023)) + 0;
                            C200069gY A045 = A04(4);
                            byte[] bArr5 = A045.A06;
                            int i11 = A045.A00;
                            C165577te.A1S(bArr5, i10 >> 12, C165617ti.A07(bArr5, (i10 >> 18) | 240, i11));
                            C165577te.A1S(bArr5, i10 >> 6, i11 + 2);
                            C165577te.A1S(bArr5, i10, i11 + 3);
                            A045.A00 = i11 + 4;
                            this.A00 += 4;
                            i += 2;
                        }
                    }
                    this.A00 = j3 + j4;
                    i++;
                }
                this.A00 = j + j2;
                i = i3;
            }
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("endIndex < beginIndex: ");
            A0u2.append(i2);
            throw AnonymousClass000.A0d(" < ", A0u2, i);
        }
    }

    public void close() {
    }

    public void flush() {
    }

    public boolean isOpen() {
        return true;
    }

    public int read(ByteBuffer byteBuffer) {
        AnonymousClass00C.A0C(byteBuffer, 0);
        C200069gY r6 = this.A01;
        if (r6 == null) {
            return -1;
        }
        int remaining = byteBuffer.remaining();
        int i = r6.A00;
        int i2 = r6.A01;
        int min = Math.min(remaining, i - i2);
        byteBuffer.put(r6.A06, i2, min);
        int i3 = r6.A01 + min;
        r6.A01 = i3;
        this.A00 -= (long) min;
        if (i3 == r6.A00) {
            C200069gY.A00(this, r6);
        }
        return min;
    }

    public int write(ByteBuffer byteBuffer) {
        AnonymousClass00C.A0C(byteBuffer, 0);
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C200069gY A04 = A04(1);
            int i2 = A04.A00;
            int min = Math.min(i, 8192 - i2);
            byteBuffer.get(A04.A06, i2, min);
            i -= min;
            A04.A00 += min;
        }
        this.A00 += (long) remaining;
        return remaining;
    }

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AnonymousClass0S4.A05);
        AnonymousClass00C.A04(bytes);
        A02 = bytes;
    }

    public byte A00() {
        long j = this.A00;
        if (j != 0) {
            C200069gY r7 = this.A01;
            if (r7 == null) {
                throw C165567td.A0T();
            }
            int i = r7.A01;
            int i2 = r7.A00;
            int i3 = i + 1;
            byte b = r7.A06[i];
            this.A00 = j - 1;
            if (i3 == i2) {
                C200069gY.A00(this, r7);
                return b;
            }
            r7.A01 = i3;
            return b;
        }
        throw C165617ti.A0T();
    }

    public final byte A01(long j) {
        C1902797o.A00(this.A00, j, 1);
        C200069gY r7 = this.A01;
        if (r7 != null) {
            long j2 = this.A00;
            if (j2 - j >= j) {
                long j3 = 0;
                while (true) {
                    int i = r7.A00;
                    int i2 = r7.A01;
                    long j4 = ((long) (i - i2)) + j3;
                    if (j4 > j) {
                        return r7.A06[(int) ((((long) i2) + j) - j3)];
                    }
                    r7 = r7.A02;
                    if (r7 == null) {
                        throw C165567td.A0T();
                    }
                    j3 = j4;
                }
            } else {
                while (j2 > j) {
                    r7 = r7.A03;
                    if (r7 == null) {
                        throw C165567td.A0T();
                    }
                    j2 -= (long) (r7.A00 - r7.A01);
                }
                return r7.A06[(int) ((((long) r7.A01) + j) - j2)];
            }
        } else {
            throw C165567td.A0T();
        }
    }

    public String A03(Charset charset, long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0 || j > ((long) Integer.MAX_VALUE)) {
            throw AnonymousClass001.A08(C36381kD.A0z("byteCount: ", AnonymousClass000.A0u(), j));
        } else if (this.A00 < j) {
            throw C165617ti.A0T();
        } else if (i == 0) {
            return "";
        } else {
            C200069gY r4 = this.A01;
            if (r4 == null) {
                throw C165567td.A0T();
            }
            int i2 = r4.A01;
            if (((long) i2) + j > ((long) r4.A00)) {
                return new String(A08(j), charset);
            }
            int i3 = (int) j;
            String str = new String(r4.A06, i2, i3, charset);
            int i4 = r4.A01 + i3;
            r4.A01 = i4;
            this.A00 -= j;
            if (i4 == r4.A00) {
                C200069gY.A00(this, r4);
            }
            return str;
        }
    }

    public final C200069gY A04(int i) {
        C200069gY r0 = this.A01;
        if (r0 == null) {
            C200069gY A002 = C201909kh.A00();
            this.A01 = A002;
            A002.A03 = A002;
            A002.A02 = A002;
            return A002;
        }
        C200069gY r1 = r0.A03;
        if (r1 == null) {
            throw C165567td.A0T();
        } else if (r1.A00 + i <= 8192 && r1.A04) {
            return r1;
        } else {
            C200069gY A003 = C201909kh.A00();
            r1.A03(A003);
            return A003;
        }
    }

    public void A06(long j) {
        while (j > 0) {
            C200069gY r7 = this.A01;
            if (r7 != null) {
                int i = r7.A00;
                int i2 = r7.A01;
                int min = (int) Math.min(j, (long) (i - i2));
                long j2 = (long) min;
                this.A00 -= j2;
                j -= j2;
                int i3 = i2 + min;
                r7.A01 = i3;
                if (i3 == i) {
                    C200069gY.A00(this, r7);
                }
            } else {
                throw C165617ti.A0T();
            }
        }
    }

    public byte[] A08(long j) {
        if (j < 0 || j > ((long) Integer.MAX_VALUE)) {
            throw AnonymousClass001.A08(C36381kD.A0z("byteCount: ", AnonymousClass000.A0u(), j));
        } else if (this.A00 >= j) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int A022 = A02(bArr, i2, i - i2);
                if (A022 != -1) {
                    i2 += A022;
                } else {
                    throw C165617ti.A0T();
                }
            }
            return bArr;
        } else {
            throw C165617ti.A0T();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Bmp(X.AU1 r15, long r16) {
        /*
            r14 = this;
            r12 = r16
            r0 = 0
            X.AnonymousClass00C.A0C(r15, r0)
            r10 = 0
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x010f
            long r8 = r14.A00
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            r0 = -1
            return r0
        L_0x0015:
            int r0 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x001a
            r12 = r8
        L_0x001a:
            r0 = r12
            if (r14 == r15) goto L_0x0108
            X.C1902797o.A00(r8, r10, r12)
        L_0x0020:
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0063
            X.9gY r6 = r14.A01
            if (r6 != 0) goto L_0x002d
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x002d:
            int r7 = r6.A00
            int r2 = r6.A01
            int r7 = r7 - r2
            long r2 = (long) r7
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x009f
            X.9gY r2 = r15.A01
            if (r2 == 0) goto L_0x0067
            X.9gY r8 = r2.A03
            if (r8 == 0) goto L_0x0067
            boolean r2 = r8.A04
            if (r2 == 0) goto L_0x0067
            int r2 = r8.A00
            long r2 = (long) r2
            long r2 = r2 + r0
            boolean r4 = r8.A05
            if (r4 == 0) goto L_0x0064
            r4 = 0
        L_0x004c:
            long r4 = (long) r4
            long r2 = r2 - r4
            r4 = 8192(0x2000, float:1.14794E-41)
            long r4 = (long) r4
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0067
            int r2 = (int) r0
            r6.A04(r8, r2)
            long r2 = r14.A00
            long r2 = r2 - r0
            r14.A00 = r2
            long r2 = r15.A00
            long r2 = r2 + r0
            r15.A00 = r2
        L_0x0063:
            return r12
        L_0x0064:
            int r4 = r8.A01
            goto L_0x004c
        L_0x0067:
            int r8 = (int) r0
            if (r8 <= 0) goto L_0x00fa
            if (r8 > r7) goto L_0x00fa
            r2 = 1024(0x400, float:1.435E-42)
            if (r8 < r2) goto L_0x0087
            X.9gY r7 = r6.A02()
        L_0x0074:
            int r2 = r7.A01
            int r2 = r2 + r8
            r7.A00 = r2
            int r2 = r6.A01
            int r2 = r2 + r8
            r6.A01 = r2
            X.9gY r2 = r6.A03
            if (r2 != 0) goto L_0x0099
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x0087:
            X.9gY r7 = X.C201909kh.A00()
            byte[] r5 = r6.A06
            int r4 = r6.A01
            byte[] r3 = r7.A06
            r2 = 0
            X.AnonymousClass00C.A0C(r5, r2)
            java.lang.System.arraycopy(r5, r4, r3, r2, r8)
            goto L_0x0074
        L_0x0099:
            r2.A03(r7)
            r6 = r7
            r14.A01 = r7
        L_0x009f:
            int r3 = r6.A00
            int r2 = r6.A01
            int r3 = r3 - r2
            long r4 = (long) r3
            X.9gY r2 = r6.A01()
            r14.A01 = r2
            X.9gY r2 = r15.A01
            if (r2 != 0) goto L_0x00c2
            r15.A01 = r6
            r6.A03 = r6
            r6.A02 = r6
        L_0x00b5:
            long r2 = r14.A00
            long r2 = r2 - r4
            r14.A00 = r2
            long r2 = r15.A00
            long r2 = r2 + r4
            r15.A00 = r2
            long r0 = r0 - r4
            goto L_0x0020
        L_0x00c2:
            X.9gY r2 = r2.A03
            if (r2 != 0) goto L_0x00cb
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x00cb:
            r2.A03(r6)
            X.9gY r9 = r6.A03
            r8 = 0
            if (r9 == r6) goto L_0x0101
            if (r9 != 0) goto L_0x00da
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x00da:
            boolean r2 = r9.A04
            if (r2 == 0) goto L_0x00b5
            int r7 = r6.A00
            int r2 = r6.A01
            int r7 = r7 - r2
            int r2 = r9.A00
            int r3 = 8192 - r2
            boolean r2 = r9.A05
            if (r2 != 0) goto L_0x00ed
            int r8 = r9.A01
        L_0x00ed:
            int r3 = r3 + r8
            if (r7 > r3) goto L_0x00b5
            r6.A04(r9, r7)
            r6.A01()
            X.C201909kh.A01(r6)
            goto L_0x00b5
        L_0x00fa:
            java.lang.String r0 = "byteCount out of range"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0101:
            java.lang.String r0 = "cannot compact"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0108:
            java.lang.String r0 = "source == this"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x010f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r0 = X.C36381kD.A0z(r0, r1, r12)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AU1.Bmp(X.AU1, long):long");
    }

    public /* bridge */ /* synthetic */ Object clone() {
        AU1 au1 = new AU1();
        if (this.A00 != 0) {
            C200069gY r0 = this.A01;
            if (r0 != null) {
                C200069gY A022 = r0.A02();
                au1.A01 = A022;
                A022.A03 = A022;
                A022.A02 = A022;
                C200069gY r2 = this.A01;
                if (r2 != null) {
                    while (true) {
                        r2 = r2.A02;
                        if (r2 == this.A01) {
                            au1.A00 = this.A00;
                            break;
                        }
                        C200069gY r02 = au1.A01;
                        if (r02 == null) {
                            throw C165567td.A0T();
                        }
                        C200069gY r1 = r02.A03;
                        if (r1 == null) {
                            throw C165567td.A0T();
                        } else if (r2 == null) {
                            throw C165567td.A0T();
                        } else {
                            r1.A03(r2.A02());
                        }
                    }
                } else {
                    throw C165567td.A0T();
                }
            } else {
                throw C165567td.A0T();
            }
        }
        return au1;
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r18
            r16 = 1
            r3 = r17
            if (r3 == r6) goto L_0x007f
            boolean r0 = r6 instanceof X.AU1
            r15 = 0
            if (r0 == 0) goto L_0x007e
            long r4 = r3.A00
            X.AU1 r6 = (X.AU1) r6
            long r1 = r6.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x007f
            X.9gY r9 = r3.A01
            if (r9 != 0) goto L_0x0026
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x0026:
            X.9gY r8 = r6.A01
            if (r8 != 0) goto L_0x002f
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x002f:
            int r1 = r9.A01
            int r10 = r8.A01
            r13 = 0
        L_0x0035:
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x007f
            int r2 = r9.A00
            int r2 = r2 - r1
            int r0 = r8.A00
            int r0 = r0 - r10
            int r0 = java.lang.Math.min(r2, r0)
            long r2 = (long) r0
            r11 = 0
        L_0x0046:
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x005e
            byte[] r0 = r9.A06
            int r7 = r1 + 1
            byte r1 = r0[r1]
            byte[] r0 = r8.A06
            int r6 = r10 + 1
            byte r0 = r0[r10]
            if (r1 != r0) goto L_0x007e
            r0 = 1
            long r11 = r11 + r0
            r1 = r7
            r10 = r6
            goto L_0x0046
        L_0x005e:
            int r0 = r9.A00
            if (r1 != r0) goto L_0x006d
            X.9gY r9 = r9.A02
            if (r9 != 0) goto L_0x006b
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x006b:
            int r1 = r9.A01
        L_0x006d:
            int r0 = r8.A00
            if (r10 != r0) goto L_0x007c
            X.9gY r8 = r8.A02
            if (r8 != 0) goto L_0x007a
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x007a:
            int r10 = r8.A01
        L_0x007c:
            long r13 = r13 + r2
            goto L_0x0035
        L_0x007e:
            return r15
        L_0x007f:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AU1.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C200069gY r5 = this.A01;
        C200069gY r4 = r5;
        if (r5 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = r5.A00;
            for (int i3 = r5.A01; i3 < i2; i3++) {
                i = (i * 31) + r5.A06[i3];
            }
            r5 = r5.A02;
            if (r5 == null) {
                throw C165567td.A0T();
            }
        } while (r5 != r4);
        return i;
    }

    public String toString() {
        long j = this.A00;
        if (j <= ((long) Integer.MAX_VALUE)) {
            int i = (int) j;
            Object obj = C21671AUq.A02;
            if (i != 0) {
                C1902797o.A00(j, 0, (long) i);
                C200069gY r3 = this.A01;
                C200069gY r8 = r3;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i3 < i) {
                    if (r3 == null) {
                        throw C165567td.A0T();
                    } else if (r3.A00 != r3.A01) {
                        i3 += r3.A00 - r3.A01;
                        i4++;
                        r3 = r3.A02;
                    } else {
                        throw C90524aI.A0Y("s.limit == s.pos");
                    }
                }
                byte[][] bArr = new byte[i4][];
                int[] iArr = new int[(i4 * 2)];
                int i5 = 0;
                while (i2 < i) {
                    if (r8 == null) {
                        throw C165567td.A0T();
                    }
                    bArr[i5] = r8.A06;
                    int i6 = r8.A00;
                    int i7 = r8.A01;
                    i2 += i6 - i7;
                    iArr[i5] = Math.min(i2, i);
                    iArr[i4 + i5] = i7;
                    r8.A05 = true;
                    i5++;
                    r8 = r8.A02;
                }
                obj = new C22579Ap8(iArr, bArr);
            }
            return obj.toString();
        }
        throw AnonymousClass001.A09(C36381kD.A0z("size > Integer.MAX_VALUE: ", AnonymousClass000.A0u(), j));
    }

    public long BKH(C21671AUq aUq) {
        throw null;
    }

    public boolean BoJ(long j) {
        throw null;
    }
}
