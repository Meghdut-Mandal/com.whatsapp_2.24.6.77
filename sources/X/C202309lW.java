package X;

import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.9lW  reason: invalid class name and case insensitive filesystem */
public final class C202309lW {
    public int A00;
    public int A01;
    public byte[] A02;

    public String A0B() {
        int i = this.A00;
        int i2 = this.A01;
        if (i - i2 == 0) {
            return null;
        }
        int i3 = i2;
        while (i3 < i && this.A02[i3] != 0) {
            i3++;
        }
        String str = new String(this.A02, i2, i3 - i2, C114085gc.A05);
        this.A01 = i3;
        if (i3 >= this.A00) {
            return str;
        }
        this.A01 = i3 + 1;
        return str;
    }

    public static int A00(C202309lW r1) {
        r1.A0I(8);
        return (r1.A03() >> 24) & 255;
    }

    public int A03() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i2 + 1;
        this.A01 = i3;
        int A0B = C165607th.A0B(bArr, i2, (bArr[i] & 255) << 24);
        int i4 = i3 + 1;
        this.A01 = i4;
        int A08 = C165597tg.A08(bArr, i3, A0B);
        this.A01 = i4 + 1;
        return (bArr[i4] & 255) | A08;
    }

    public int A04() {
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return bArr[i] & 255;
    }

    public int A06() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.A01 = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    public long A07() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        this.A01 = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    public long A08() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        int i5 = i4 + 1;
        this.A01 = i5;
        int i6 = i5 + 1;
        this.A01 = i6;
        int i7 = i6 + 1;
        this.A01 = i7;
        int i8 = i7 + 1;
        this.A01 = i8;
        this.A01 = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public long A09() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        this.A01 = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (r5 == r3) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0C() {
        /*
            r6 = this;
            int r2 = r6.A00
            int r3 = r6.A01
            int r0 = r2 - r3
            if (r0 != 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            r5 = r3
        L_0x000b:
            if (r5 >= r2) goto L_0x001c
            byte[] r0 = r6.A02
            byte r1 = r0[r5]
            r0 = 10
            if (r1 == r0) goto L_0x001c
            r0 = 13
            if (r1 == r0) goto L_0x001c
            int r5 = r5 + 1
            goto L_0x000b
        L_0x001c:
            int r1 = r5 - r3
            r0 = 3
            if (r1 < r0) goto L_0x003d
            byte[] r2 = r6.A02
            byte r1 = r2[r3]
            r0 = -17
            if (r1 != r0) goto L_0x003d
            int r0 = r3 + 1
            byte r1 = r2[r0]
            r0 = -69
            if (r1 != r0) goto L_0x003d
            int r0 = r3 + 2
            byte r1 = r2[r0]
            r0 = -65
            if (r1 != r0) goto L_0x003d
            int r3 = r3 + 3
            r6.A01 = r3
        L_0x003d:
            byte[] r2 = r6.A02
            int r1 = r5 - r3
            java.nio.charset.Charset r0 = X.C114085gc.A05
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2, r3, r1, r0)
            r6.A01 = r5
            int r3 = r6.A00
            if (r5 == r3) goto L_0x005c
            byte[] r2 = r6.A02
            byte r1 = r2[r5]
            r0 = 13
            if (r1 != r0) goto L_0x005d
            int r5 = r5 + 1
            r6.A01 = r5
            if (r5 != r3) goto L_0x005d
        L_0x005c:
            return r4
        L_0x005d:
            byte r1 = r2[r5]
            r0 = 10
            if (r1 != r0) goto L_0x005c
            int r0 = r5 + 1
            r6.A01 = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202309lW.A0C():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r5.A02[r1] != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0D(int r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0005
            java.lang.String r0 = ""
            return r0
        L_0x0005:
            int r4 = r5.A01
            int r0 = r4 + r6
            int r1 = r0 + -1
            int r0 = r5.A00
            if (r1 >= r0) goto L_0x0017
            byte[] r0 = r5.A02
            byte r0 = r0[r1]
            int r3 = r6 + -1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r3 = r6
        L_0x0018:
            byte[] r2 = r5.A02
            java.nio.charset.Charset r0 = X.C114085gc.A05
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r4, r3, r0)
            int r0 = r5.A01
            int r0 = r0 + r6
            r5.A01 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202309lW.A0D(int):java.lang.String");
    }

    public String A0E(int i) {
        String str = new String(this.A02, this.A01, i, C114085gc.A05);
        this.A01 += i;
        return str;
    }

    public short A0F() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.A01 = i2 + 1;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public void A0G(int i) {
        byte[] bArr = this.A02;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        this.A02 = bArr;
        this.A00 = i;
        this.A01 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r3 > r2.A02.length) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L_0x0008
            byte[] r0 = r2.A02
            int r1 = r0.length
            r0 = 1
            if (r3 <= r1) goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            X.C200319h9.A01(r0)
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202309lW.A0H(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r3 > r2.A00) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L_0x0007
            int r1 = r2.A00
            r0 = 1
            if (r3 <= r1) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            X.C200319h9.A01(r0)
            r2.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202309lW.A0I(int):void");
    }

    public void A0J(int i) {
        A0I(this.A01 + i);
    }

    public void A0K(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A02, this.A01, bArr, i, i2);
        this.A01 += i2;
    }

    public C202309lW(byte[] bArr, int i) {
        this.A02 = bArr;
        this.A00 = i;
    }

    public static int A01(C202309lW r0, int i) {
        r0.A0J(i);
        return r0.A04();
    }

    public static int A02(C202309lW r0, int i) {
        r0.A0I(i);
        return r0.A03();
    }

    public int A05() {
        int A03 = A03();
        if (A03 >= 0) {
            return A03;
        }
        throw C90464aC.A0R("Top bit not zero: ", AnonymousClass000.A0u(), A03);
    }

    public long A0A() {
        long A08 = A08();
        if (A08 >= 0) {
            return A08;
        }
        throw AnonymousClass001.A09(C36381kD.A0z("Top bit not zero: ", AnonymousClass000.A0u(), A08));
    }

    public C202309lW(int i) {
        this.A02 = new byte[i];
        this.A00 = i;
    }

    public C202309lW(byte[] bArr) {
        this.A02 = bArr;
        this.A00 = bArr.length;
    }

    public C202309lW() {
        this.A02 = Util.A08;
    }
}
