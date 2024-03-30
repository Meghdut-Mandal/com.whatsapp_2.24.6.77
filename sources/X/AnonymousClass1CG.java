package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.1CG  reason: invalid class name */
public final class AnonymousClass1CG {
    public int A00;
    public int A01 = 65536;
    public long A02;
    public byte[] A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass1CE A06;
    public final AnonymousClass1CC A07;
    public final C20900yL A08;
    public final boolean A09;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r3.A09 != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1CG(X.AnonymousClass1CC r4, X.C20900yL r5, java.io.RandomAccessFile r6, int r7, int r8, boolean r9) {
        /*
            r3 = this;
            r1 = 2
            r3.<init>()
            r2 = 65536(0x10000, float:9.18355E-41)
            r3.A01 = r2
            r3.A07 = r4
            r3.A05 = r7
            byte[][] r0 = X.AnonymousClass1CI.A00
            r0 = r0[r1]
            r3.A03 = r0
            r3.A04 = r8
            r3.A08 = r5
            r3.A09 = r9
            r1 = 0
            X.1CE r0 = new X.1CE
            r0.<init>(r5, r6, r1, r2)
            r3.A06 = r0
            if (r8 == 0) goto L_0x0031
            r0 = 1
            if (r8 != r0) goto L_0x002a
            r1 = 16384(0x4000, float:2.2959E-41)
        L_0x0027:
            r3.A00 = r1
            return
        L_0x002a:
            boolean r0 = r3.A09
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0027
        L_0x0031:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CG.<init>(X.1CC, X.0yL, java.io.RandomAccessFile, int, int, boolean):void");
    }

    public static long A00(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        long j = (long) byteBuffer.getInt();
        if (0 > j) {
            return j + 4294967296L;
        }
        return j;
    }

    public static void A01(AnonymousClass1CG r8, int i, int i2) {
        AnonymousClass1CD r7;
        AnonymousClass1CE r3 = r8.A06;
        ByteBuffer byteBuffer = r3.A02;
        byteBuffer.clear();
        r3.A01 = 0;
        r3.A03.reset();
        r3.A00 = 0;
        byteBuffer.put(AnonymousClass1CI.A00(i));
        if (i != 0) {
            byteBuffer.putInt(i2);
        }
        byteBuffer.putInt(r8.A01);
        byteBuffer.putInt(r8.A00);
        AnonymousClass1CC r4 = r8.A07;
        byteBuffer.putInt(r4.A01);
        if (i >= 2) {
            byteBuffer.putInt(r4.A00);
            byteBuffer.put(r4.A04 ? (byte) 1 : 0);
            r3.A05(r4.A03);
            byteBuffer.putInt(r4.A02);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            AnonymousClass1CD[] r1 = r4.A05;
            if (i3 < r1.length) {
                r7 = r1[i3];
            } else {
                r7 = new AnonymousClass1CD(r8.A04);
            }
            byteBuffer.putInt(r7.A01);
            r3.A05(r7.A04);
            if (i >= 2) {
                byteBuffer.putInt(r7.A02);
                byteBuffer.putInt(r7.A00);
            }
            r3.A05(r7.A03);
        }
        long A012 = r3.A01();
        r8.A02 = A012;
        r3.A05(A012);
    }
}
