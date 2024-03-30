package X;

/* renamed from: X.8I7  reason: invalid class name */
public final class AnonymousClass8I7 extends C200279h2 {
    public int A00 = Integer.MAX_VALUE;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final byte[] A06;

    public static void A00(AnonymousClass8I7 r3) {
        int i = r3.A02 + r3.A05;
        r3.A02 = i;
        int i2 = i - r3.A04;
        int i3 = r3.A00;
        if (i2 > i3) {
            int i4 = i2 - i3;
            r3.A05 = i4;
            r3.A02 = i - i4;
            return;
        }
        r3.A05 = 0;
    }

    public int A0W() {
        int i = this.A03;
        if (this.A02 - i >= 4) {
            byte[] bArr = this.A06;
            this.A03 = i + 4;
            return C165567td.A04(bArr, i);
        }
        throw C165587tf.A0J();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r4[r2] < 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0X() {
        /*
            r5 = this;
            int r0 = r5.A03
            int r1 = r5.A02
            if (r1 == r0) goto L_0x003c
            byte[] r4 = r5.A06
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8I7.A0X():int");
    }

    public long A0Y() {
        long j = 0;
        int i = 0;
        do {
            int i2 = this.A03;
            if (i2 != this.A02) {
                byte[] bArr = this.A06;
                this.A03 = i2 + 1;
                byte b = bArr[i2];
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
                i += 7;
            } else {
                throw C165587tf.A0J();
            }
        } while (i < 64);
        throw C165617ti.A0L("CodedInputStream encountered a malformed varint.");
    }

    public long A0Z() {
        int i = this.A03;
        if (this.A02 - i >= 8) {
            byte[] bArr = this.A06;
            this.A03 = i + 8;
            return C200279h2.A06(bArr, i);
        }
        throw C165587tf.A0J();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (((long) r5[r9]) < 0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0a() {
        /*
            r10 = this;
            int r0 = r10.A03
            int r3 = r10.A02
            if (r3 == r0) goto L_0x0027
            byte[] r5 = r10.A06
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8I7.A0a():long");
    }

    public AnonymousClass8I7(byte[] bArr, int i, int i2) {
        this.A06 = bArr;
        this.A02 = i2 + i;
        this.A03 = i;
        this.A04 = i;
    }
}
