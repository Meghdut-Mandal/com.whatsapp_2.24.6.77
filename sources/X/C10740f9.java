package X;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0f9  reason: invalid class name and case insensitive filesystem */
public final class C10740f9 implements Closeable {
    public C06100Sh A00;
    public final C07130Wl A01 = new C07130Wl();
    public final InputStream A02;
    public final byte[] A03 = new byte[8];

    private final void A03(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.A02.read(bArr, i2, i - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        }
        this.A00 = null;
    }

    public static final long A00(C10740f9 r18) {
        long j;
        long j2;
        C10740f9 r4 = r18;
        C06100Sh r6 = r4.A00;
        byte b = r6.A01;
        if (b < 24) {
            long j3 = (long) b;
            r4.A00 = null;
            return j3;
        } else if (b == 24) {
            int read = r4.A02.read();
            if (read != -1) {
                r4.A00 = null;
                return ((long) read) & 255;
            }
            throw new EOFException();
        } else {
            if (b == 25) {
                byte[] bArr = r4.A03;
                r4.A03(bArr, 2);
                j2 = (((long) bArr[0]) & 255) << 8;
                j = ((long) bArr[1]) & 255;
            } else if (b == 26) {
                byte[] bArr2 = r4.A03;
                r4.A03(bArr2, 4);
                long j4 = (long) bArr2[0];
                long j5 = (long) bArr2[1];
                long j6 = (long) bArr2[2];
                long j7 = (j5 & 255) << 16;
                return (((long) bArr2[3]) & 255) | j7 | ((j4 & 255) << 24) | ((j6 & 255) << 8);
            } else if (b == 27) {
                byte[] bArr3 = r4.A03;
                r4.A03(bArr3, 8);
                long j8 = (long) bArr3[0];
                long j9 = (long) bArr3[1];
                long j10 = (long) bArr3[2];
                long j11 = (long) bArr3[3];
                long j12 = (long) bArr3[4];
                long j13 = (long) bArr3[5];
                long j14 = (((long) bArr3[6]) & 255) << 8;
                j = j14 | ((j10 & 255) << 40) | ((j8 & 255) << 56) | ((j9 & 255) << 48) | ((j11 & 255) << 32) | ((j12 & 255) << 24) | ((j13 & 255) << 16);
                j2 = ((long) bArr3[7]) & 255;
            } else {
                Object[] objArr = new Object[2];
                objArr[0] = Byte.valueOf(b);
                AnonymousClass000.A1L(objArr, (r6.A00 >> 5) & 7, 1);
                throw new IOException(String.format("invalid additional information %s for major type %s", objArr));
            }
            return j2 | j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C06100Sh A05() {
        /*
            r10 = this;
            X.0Sh r0 = r10.A00
            if (r0 != 0) goto L_0x0100
            java.io.InputStream r0 = r10.A02
            int r2 = r0.read()
            r0 = -1
            if (r2 != r0) goto L_0x0014
            X.0Wl r0 = r10.A01
            r0.A01()
            r0 = 0
            return r0
        L_0x0014:
            X.0Sh r1 = new X.0Sh
            r1.<init>(r2)
            r10.A00 = r1
            byte r3 = r1.A00
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r3 == r0) goto L_0x00bd
            r0 = -96
            if (r3 == r0) goto L_0x00bd
            r0 = -64
            if (r3 == r0) goto L_0x00bd
            r0 = -32
            if (r3 == r0) goto L_0x0089
            if (r3 == 0) goto L_0x00bd
            r0 = 32
            if (r3 == r0) goto L_0x00bd
            r0 = 64
            if (r3 == r0) goto L_0x006d
            r0 = 96
            if (r3 != r0) goto L_0x0072
            X.0Wl r1 = r10.A01
            r4 = -2
        L_0x003f:
            long r2 = X.C07130Wl.A00(r1)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            r8 = -1
            r6 = -2
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00e5
            r2 = -2
        L_0x0055:
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            r0 = 0
            X.AnonymousClass000.A1M(r1, r0, r4)
            r0 = 1
            X.AnonymousClass000.A1M(r1, r0, r2)
            java.lang.String r0 = "expected non-string scope or scope %s but found %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x006d:
            X.0Wl r1 = r10.A01
            r4 = -1
            goto L_0x003f
        L_0x0072:
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r1 = 0
            int r0 = r3 >> 5
            r0 = r0 & 7
            X.AnonymousClass000.A1L(r2, r0, r1)
            java.lang.String r0 = "invalid major type: %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0089:
            byte r1 = r1.A01
            r0 = 31
            if (r1 != r0) goto L_0x00bd
            X.0Wl r1 = r10.A01
            long r2 = X.C07130Wl.A00(r1)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a9
            r4 = -5
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0123
            java.lang.String r1 = "expected a value for dangling key in indefinite-length map"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x00a9:
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            r0 = 0
            X.AnonymousClass000.A1M(r1, r0, r2)
            java.lang.String r0 = "expected indefinite length scope but found %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x00bd:
            X.0Wl r1 = r10.A01
            long r2 = X.C07130Wl.A00(r1)
            r6 = -2
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00d1
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00e5
            r2 = -2
        L_0x00d1:
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            r0 = 0
            X.AnonymousClass000.A1M(r1, r0, r2)
            java.lang.String r0 = "expected non-string scope but found %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x00e5:
            long r6 = X.C07130Wl.A00(r1)
            r2 = 1
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0123
            if (r0 <= 0) goto L_0x0103
            r2 = -1
            long r6 = r6 + r2
            java.util.Deque r1 = r1.A00
            r1.pop()
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
        L_0x00fd:
            r1.push(r0)
        L_0x0100:
            X.0Sh r0 = r10.A00
            return r0
        L_0x0103:
            r4 = -5
            r2 = -4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0115
            java.util.Deque r1 = r1.A00
            r1.pop()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            goto L_0x00fd
        L_0x0115:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0100
            java.util.Deque r1 = r1.A00
            r1.pop()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x00fd
        L_0x0123:
            java.util.Deque r0 = r1.A00
            r0.pop()
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10740f9.A05():X.0Sh");
    }

    public final void close() {
        this.A02.close();
        this.A01.A01();
    }

    public C10740f9(InputStream inputStream) {
        this.A02 = inputStream;
    }

    public static final void A01(C10740f9 r3) {
        r3.A05();
        byte b = r3.A00.A01;
        if (b == 31) {
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = Byte.valueOf(b);
            throw AnonymousClass001.A09(String.format("expected definite length but found %s", A0L));
        }
    }

    public static final void A02(C10740f9 r3, byte b) {
        r3.A05();
        byte b2 = r3.A00.A00;
        if (b2 != b) {
            Object[] A0M = AnonymousClass001.A0M();
            AnonymousClass000.A1L(A0M, (b >> 5) & 7, 0);
            AnonymousClass000.A1L(A0M, (b2 >> 5) & 7, 1);
            throw AnonymousClass001.A09(String.format("expected major type %s but found %s", A0M));
        }
    }

    public static final byte[] A04(C10740f9 r5) {
        A01(r5);
        long A002 = A00(r5);
        if (A002 < 0 || A002 > 2147483647L) {
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L, Integer.MAX_VALUE, 0);
            throw AnonymousClass001.A0E(String.format("the maximum supported byte/text string length is %s bytes", A0L));
        } else if (((long) r5.A02.available()) >= A002) {
            int i = (int) A002;
            byte[] bArr = new byte[i];
            r5.A03(bArr, i);
            return bArr;
        } else {
            throw new EOFException();
        }
    }
}
