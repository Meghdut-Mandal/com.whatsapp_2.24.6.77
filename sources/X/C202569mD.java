package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.9mD  reason: invalid class name and case insensitive filesystem */
public final class C202569mD {
    public int A00;
    public AnonymousClass8D7 A01;
    public final ByteBuffer A02;

    public C202569mD(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        this.A02 = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static int A00(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static final void A01(C202569mD r1, int i) {
        byte b = (byte) i;
        ByteBuffer byteBuffer = r1.A02;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b);
            return;
        }
        throw new C187248xV(byteBuffer.position(), byteBuffer.limit());
    }

    public static final void A02(C202569mD r1, int i) {
        while ((i & -128) != 0) {
            A01(r1, (i & 127) | 128);
            i >>>= 7;
        }
        A01(r1, i);
    }

    public final void A04(long j) {
        while (true) {
            int i = (int) j;
            if ((-128 & j) == 0) {
                A01(this, i);
                return;
            } else {
                A01(this, (i & 127) | 128);
                j >>>= 7;
            }
        }
    }

    public final void A03(int i, byte[] bArr) {
        A02(this, (i << 3) | 2);
        int length = bArr.length;
        A02(this, length);
        ByteBuffer byteBuffer = this.A02;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new C187248xV(byteBuffer.position(), byteBuffer.limit());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C23118B5x r8, int r9) {
        /*
            r7 = this;
            X.8D7 r0 = r7.A01
            if (r0 != 0) goto L_0x009d
            java.nio.ByteBuffer r5 = r7.A02
            boolean r0 = X.AnonymousClass8D7.A01
            boolean r0 = r5.hasArray()
            if (r0 == 0) goto L_0x007f
            X.8D5 r0 = new X.8D5
            r0.<init>(r5)
        L_0x0013:
            r7.A01 = r0
        L_0x0015:
            int r0 = r5.position()
            r7.A00 = r0
        L_0x001b:
            X.8D7 r6 = r7.A01
            X.C194279Ox.A04(r6, r9)
            r2 = r8
            X.8DG r2 = (X.AnonymousClass8DG) r2
            int r1 = r2.zzjq
            r0 = -1
            if (r1 != r0) goto L_0x0032
            X.B3S r0 = X.C165597tg.A0J(r2)
            int r1 = r0.Byv(r2)
            r2.zzjq = r1
        L_0x0032:
            r6.A03(r1)
            X.B3S r1 = X.C165597tg.A0J(r8)
            X.A3g r0 = r6.A00
            if (r0 != 0) goto L_0x0042
            X.A3g r0 = new X.A3g
            r0.<init>(r6)
        L_0x0042:
            r1.ByM(r0, r8)
            boolean r0 = r6 instanceof X.AnonymousClass8D6
            if (r0 == 0) goto L_0x005d
            X.8D6 r6 = (X.AnonymousClass8D6) r6
            java.nio.ByteBuffer r4 = r6.A04
            long r2 = r6.A00
            long r0 = r6.A01
            long r2 = r2 - r0
            int r0 = (int) r2
            r4.position(r0)
        L_0x0056:
            int r0 = r5.position()
            r7.A00 = r0
            return
        L_0x005d:
            boolean r0 = r6 instanceof X.AnonymousClass8D4
            if (r0 == 0) goto L_0x006f
            X.8D4 r6 = (X.AnonymousClass8D4) r6
            java.nio.ByteBuffer r1 = r6.A00
            java.nio.ByteBuffer r0 = r6.A01
            int r0 = r0.position()
            r1.position(r0)
            goto L_0x0056
        L_0x006f:
            X.8D5 r6 = (X.AnonymousClass8D5) r6
            java.nio.ByteBuffer r3 = r6.A04
            int r2 = r6.A01
            int r1 = r6.A00
            int r0 = r6.A03
            int r1 = r1 - r0
            int r2 = r2 + r1
            r3.position(r2)
            goto L_0x0056
        L_0x007f:
            boolean r0 = r5.isDirect()
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r5.isReadOnly()
            if (r0 != 0) goto L_0x00bb
            boolean r0 = X.C203609oO.A07
            if (r0 == 0) goto L_0x0096
            X.8D6 r0 = new X.8D6
            r0.<init>(r5)
            goto L_0x0013
        L_0x0096:
            X.8D4 r0 = new X.8D4
            r0.<init>(r5)
            goto L_0x0013
        L_0x009d:
            int r1 = r7.A00
            java.nio.ByteBuffer r5 = r7.A02
            int r0 = r5.position()
            if (r1 == r0) goto L_0x001b
            X.8D7 r4 = r7.A01
            byte[] r3 = r5.array()
            int r2 = r7.A00
            int r1 = r5.position()
            int r0 = r7.A00
            int r1 = r1 - r0
            r4.A0E(r3, r2, r1)
            goto L_0x0015
        L_0x00bb:
            java.lang.String r0 = "ByteBuffer is read-only"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202569mD.A05(X.B5x, int):void");
    }
}
