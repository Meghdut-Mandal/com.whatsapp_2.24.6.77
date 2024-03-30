package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.8I9  reason: invalid class name */
public final class AnonymousClass8I9 extends C200279h2 {
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final InputStream A06;
    public final byte[] A07;

    public AnonymousClass8I9(InputStream inputStream) {
        Charset charset = AnonymousClass9BD.A04;
        Objects.requireNonNull(inputStream, "input");
        this.A06 = inputStream;
        this.A07 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        this.A00 = 0;
        this.A03 = 0;
        this.A04 = 0;
    }

    public static void A01(AnonymousClass8I9 r3) {
        int i = r3.A00 + r3.A05;
        r3.A00 = i;
        int i2 = r3.A04 + i;
        int i3 = r3.A01;
        if (i2 > i3) {
            int i4 = i2 - i3;
            r3.A05 = i4;
            r3.A00 = i - i4;
            return;
        }
        r3.A05 = 0;
    }

    public static boolean A03(AnonymousClass8I9 r8, int i) {
        int i2 = r8.A03;
        int i3 = i2 + i;
        int i4 = r8.A00;
        if (i3 > i4) {
            int i5 = r8.A04;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= r8.A01) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = r8.A07;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    i5 = r8.A04 + i2;
                    r8.A04 = i5;
                    i4 = r8.A00 - i2;
                    r8.A00 = i4;
                    r8.A03 = 0;
                }
                InputStream inputStream = r8.A06;
                try {
                    int read = inputStream.read(r8.A07, i4, Math.min(ZipDecompressor.UNZIP_BUFFER_SIZE - i4, (Integer.MAX_VALUE - i5) - i4));
                    if (read == 0 || read < -1 || read > 4096) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append(inputStream.getClass());
                        A0u.append("#read(byte[]) returned invalid result: ");
                        A0u.append(read);
                        throw AnonymousClass000.A0g("\nThe InputStream implementation is buggy.", A0u);
                    } else if (read > 0) {
                        r8.A00 += read;
                        A01(r8);
                        if (r8.A00 >= i) {
                            return true;
                        }
                        return A03(r8, i);
                    }
                } catch (AnonymousClass186 e) {
                    e.wasThrownFromInputStream = true;
                    throw e;
                }
            }
            return false;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("refillBuffer() called when ");
        A0u2.append(i);
        throw AnonymousClass000.A0g(" bytes were already available in buffer", A0u2);
    }

    public static byte[] A05(AnonymousClass8I9 r5, int i) {
        if (i >= 0) {
            int i2 = r5.A04;
            int i3 = r5.A03;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE <= 0) {
                int i5 = r5.A01;
                if (i4 <= i5) {
                    int i6 = r5.A00 - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > r5.A06.available()) {
                                return null;
                            }
                        } catch (AnonymousClass186 e) {
                            e.wasThrownFromInputStream = true;
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(r5.A07, r5.A03, bArr, 0, i6);
                    r5.A04 += r5.A00;
                    r5.A03 = 0;
                    r5.A00 = 0;
                    while (i6 < i) {
                        int read = r5.A06.read(bArr, i6, i - i6);
                        if (read != -1) {
                            r5.A04 += read;
                            i6 += read;
                        } else {
                            throw C165587tf.A0J();
                        }
                    }
                    return bArr;
                }
                r5.A0b((i5 - i2) - i3);
                throw C165587tf.A0J();
            }
            throw C165617ti.A0L("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw C165597tg.A0L();
    }

    public int A0W() {
        int i = this.A03;
        if (this.A00 - i < 4) {
            A02(this, 4);
            i = this.A03;
        }
        byte[] bArr = this.A07;
        this.A03 = i + 4;
        return C165567td.A04(bArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r4[r2] < 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0X() {
        /*
            r5 = this;
            int r0 = r5.A03
            int r1 = r5.A00
            if (r1 == r0) goto L_0x003c
            byte[] r4 = r5.A07
            int r2 = r0 + 1
            byte r3 = r4[r0]
            if (r3 < 0) goto L_0x005d
            r5.A03 = r2
            return r3
        L_0x0011:
            int r2 = r1 + 1
            byte r1 = r4[r1]
            int r0 = r1 << 28
            r3 = r3 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r3 = r3 ^ r0
            if (r1 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
        L_0x003c:
            long r1 = r5.A0Y()
            int r0 = (int) r1
            return r0
        L_0x0042:
            int r2 = r1 + 1
            byte r0 = r4[r1]
            int r0 = r0 << 14
            r3 = r3 ^ r0
            if (r3 < 0) goto L_0x004f
            r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
        L_0x004d:
            r1 = r2
            goto L_0x006d
        L_0x004f:
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 21
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0011
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r3 ^ r0
            goto L_0x006d
        L_0x005d:
            int r1 = r1 - r2
            r0 = 9
            if (r1 < r0) goto L_0x003c
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 7
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0042
            r3 = r3 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x006d:
            r5.A03 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8I9.A0X():int");
    }

    public long A0Y() {
        long j = 0;
        int i = 0;
        do {
            if (this.A03 == this.A00) {
                A02(this, 1);
            }
            byte[] bArr = this.A07;
            int i2 = this.A03;
            this.A03 = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & Byte.MAX_VALUE)) << i;
            if ((b & 128) == 0) {
                return j;
            }
            i += 7;
        } while (i < 64);
        throw C165617ti.A0L("CodedInputStream encountered a malformed varint.");
    }

    public long A0Z() {
        int i = this.A03;
        if (this.A00 - i < 8) {
            A02(this, 8);
            i = this.A03;
        }
        byte[] bArr = this.A07;
        this.A03 = i + 8;
        return C200279h2.A06(bArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (((long) r5[r9]) < 0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0a() {
        /*
            r10 = this;
            int r0 = r10.A03
            int r3 = r10.A00
            if (r3 == r0) goto L_0x0027
            byte[] r5 = r10.A07
            int r1 = r0 + 1
            byte r2 = r5[r0]
            if (r2 < 0) goto L_0x007c
            r10.A03 = r1
            long r0 = (long) r2
            return r0
        L_0x0012:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r3 = X.C165587tf.A0A(r0, r3)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x008d
        L_0x0027:
            long r0 = r10.A0Y()
            return r0
        L_0x002c:
            long r3 = (long) r2
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r1 = (long) r0
            r0 = 28
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0042
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x003f:
            long r3 = r3 ^ r0
        L_0x0040:
            r6 = r9
            goto L_0x008d
        L_0x0042:
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            r0 = 35
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0056
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x0054:
            long r3 = r3 ^ r0
            goto L_0x008d
        L_0x0056:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r1 = (long) r0
            r0 = 42
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0069
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x003f
        L_0x0069:
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            r0 = 49
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x0054
        L_0x007c:
            int r3 = r3 - r1
            r0 = 9
            if (r3 < r0) goto L_0x0027
            int r6 = r1 + 1
            byte r0 = r5[r1]
            int r0 = r0 << 7
            r2 = r2 ^ r0
            if (r2 >= 0) goto L_0x0090
            r2 = r2 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x008c:
            long r3 = (long) r2
        L_0x008d:
            r10.A03 = r6
            return r3
        L_0x0090:
            int r1 = r6 + 1
            byte r0 = r5[r6]
            int r0 = r0 << 14
            r2 = r2 ^ r0
            if (r2 < 0) goto L_0x009e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            long r3 = (long) r0
            r6 = r1
            goto L_0x008d
        L_0x009e:
            int r6 = r1 + 1
            byte r0 = r5[r1]
            int r0 = r0 << 21
            r2 = r2 ^ r0
            if (r2 >= 0) goto L_0x002c
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r2 = r2 ^ r0
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8I9.A0a():long");
    }

    public void A0b(int i) {
        int i2 = this.A00;
        int i3 = this.A03;
        int i4 = i2 - i3;
        if (i <= i4) {
            if (i >= 0) {
                this.A03 = i3 + i;
                return;
            }
        } else if (i >= 0) {
            int i5 = this.A04;
            int i6 = i5 + i3;
            int i7 = i6 + i;
            int i8 = this.A01;
            if (i7 <= i8) {
                this.A04 = i6;
                this.A00 = 0;
                this.A03 = 0;
                while (i4 < i) {
                    int i9 = i - i4;
                    try {
                        InputStream inputStream = this.A06;
                        long j = (long) i9;
                        long skip = inputStream.skip(j);
                        int i10 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i10 >= 0 && skip <= j) {
                            if (i10 == 0) {
                                break;
                            }
                            i4 += (int) skip;
                        } else {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append(inputStream.getClass());
                            A0u.append("#skip returned invalid result: ");
                            A0u.append(skip);
                            throw AnonymousClass000.A0g("\nThe InputStream implementation is buggy.", A0u);
                        }
                    } catch (AnonymousClass186 e) {
                        e.wasThrownFromInputStream = true;
                        throw e;
                    } catch (Throwable th) {
                        this.A04 += i4;
                        A01(this);
                        throw th;
                    }
                }
                this.A04 += i4;
                A01(this);
                if (i4 < i) {
                    int i11 = this.A00;
                    int i12 = i11 - this.A03;
                    this.A03 = i11;
                    while (true) {
                        A02(this, 1);
                        int i13 = i - i12;
                        int i14 = this.A00;
                        if (i13 > i14) {
                            i12 += i14;
                            this.A03 = i14;
                        } else {
                            this.A03 = i13;
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                A0b((i8 - i5) - i3);
                throw C165587tf.A0J();
            }
        }
        throw C165597tg.A0L();
    }

    public static ArrayList A00(AnonymousClass8I9 r6, int i) {
        ArrayList A0I = AnonymousClass001.A0I();
        while (i > 0) {
            int min = Math.min(i, ZipDecompressor.UNZIP_BUFFER_SIZE);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = r6.A06.read(bArr, i2, min - i2);
                if (read != -1) {
                    r6.A04 += read;
                    i2 += read;
                } else {
                    throw C165587tf.A0J();
                }
            }
            i -= min;
            A0I.add(bArr);
        }
        return A0I;
    }

    public static void A02(AnonymousClass8I9 r2, int i) {
        if (A03(r2, i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - r2.A04) - r2.A03) {
            throw C165617ti.A0L("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw C165587tf.A0J();
    }

    public static byte[] A04(AnonymousClass8I9 r6, int i) {
        byte[] A052 = A05(r6, i);
        if (A052 != null) {
            return A052;
        }
        int i2 = r6.A03;
        int i3 = r6.A00;
        int i4 = i3 - i2;
        r6.A04 += i3;
        r6.A03 = 0;
        r6.A00 = 0;
        ArrayList A002 = A00(r6, i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(r6.A07, i2, bArr, 0, i4);
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }
}
