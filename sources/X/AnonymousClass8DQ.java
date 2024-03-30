package X;

import java.util.Arrays;

/* renamed from: X.8DQ  reason: invalid class name */
public final class AnonymousClass8DQ extends AnonymousClass8DR implements Cloneable {
    public int A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03;
    public AnonymousClass8DE A04;
    public AnonymousClass8DD A05;
    public boolean A06;
    public byte[] A07;
    public byte[] A08;
    public byte[] A09;
    public int[] A0A;
    public AnonymousClass8DP[] A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a8, code lost:
        if (r1.length != 0) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r9 = 1
            if (r11 == r10) goto L_0x00c1
            boolean r0 = r11 instanceof X.AnonymousClass8DQ
            r8 = 0
            if (r0 == 0) goto L_0x00c0
            X.8DQ r11 = (X.AnonymousClass8DQ) r11
            long r3 = r10.A01
            long r1 = r11.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            long r3 = r10.A02
            long r1 = r11.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            int r1 = r10.A00
            int r0 = r11.A00
            if (r1 != r0) goto L_0x00c0
            X.8DP[] r7 = r10.A0B
            X.8DP[] r6 = r11.A0B
            if (r7 != 0) goto L_0x0070
            r5 = 0
        L_0x0027:
            if (r6 != 0) goto L_0x006e
            r4 = 0
        L_0x002a:
            r3 = 0
            r2 = 0
        L_0x002c:
            if (r3 >= r5) goto L_0x0035
            r0 = r7[r3]
            if (r0 != 0) goto L_0x0035
            int r3 = r3 + 1
            goto L_0x002c
        L_0x0035:
            if (r2 >= r4) goto L_0x003e
            r0 = r6[r2]
            if (r0 != 0) goto L_0x003e
            int r2 = r2 + 1
            goto L_0x0035
        L_0x003e:
            boolean r1 = X.C36371kC.A1T(r3, r5)
            boolean r0 = X.C36371kC.A1T(r2, r4)
            if (r1 == 0) goto L_0x005d
            if (r0 == 0) goto L_0x00c0
            byte[] r1 = r10.A07
            byte[] r0 = r11.A07
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x00c0
            X.8DE r1 = r10.A04
            X.8DE r0 = r11.A04
            if (r1 != 0) goto L_0x0072
            if (r0 == 0) goto L_0x0079
            return r8
        L_0x005d:
            if (r1 != r0) goto L_0x00c0
            r1 = r7[r3]
            r0 = r6[r2]
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c0
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L_0x002c
        L_0x006e:
            int r4 = r6.length
            goto L_0x002a
        L_0x0070:
            int r5 = r7.length
            goto L_0x0027
        L_0x0072:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0079
            return r8
        L_0x0079:
            byte[] r1 = r10.A08
            byte[] r0 = r11.A08
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x00c0
            long r3 = r10.A03
            long r1 = r11.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            byte[] r1 = r10.A09
            byte[] r0 = r11.A09
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x00c0
            int[] r2 = r10.A0A
            int[] r1 = r11.A0A
            if (r2 == 0) goto L_0x00a5
            int r0 = r2.length
            if (r0 == 0) goto L_0x00a5
            boolean r0 = java.util.Arrays.equals(r2, r1)
            if (r0 != 0) goto L_0x00aa
            return r8
        L_0x00a5:
            if (r1 == 0) goto L_0x00aa
            int r0 = r1.length
            if (r0 != 0) goto L_0x00c0
        L_0x00aa:
            X.8DD r1 = r10.A05
            X.8DD r0 = r11.A05
            if (r1 != 0) goto L_0x00b3
            if (r0 == 0) goto L_0x00ba
            return r8
        L_0x00b3:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ba
            return r8
        L_0x00ba:
            boolean r1 = r10.A06
            boolean r0 = r11.A06
            if (r1 == r0) goto L_0x00c1
        L_0x00c0:
            return r8
        L_0x00c1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8DQ.equals(java.lang.Object):boolean");
    }

    public AnonymousClass8DQ() {
        if (AnonymousClass8DP.A00 == null) {
            synchronized (C190879Ar.A00) {
                if (AnonymousClass8DP.A00 == null) {
                    AnonymousClass8DP.A00 = new AnonymousClass8DP[0];
                }
            }
        }
        this.A0B = AnonymousClass8DP.A00;
        byte[] bArr = AnonymousClass9AU.A00;
        this.A07 = bArr;
        this.A04 = null;
        this.A08 = bArr;
        this.A03 = 180000;
        this.A09 = bArr;
        this.A0A = AnonymousClass9AU.A01;
        this.A05 = null;
        this.A06 = false;
        this.A00 = -1;
    }

    public final /* synthetic */ Object clone() {
        int length;
        try {
            AnonymousClass8DQ r3 = (AnonymousClass8DQ) super.A05();
            AnonymousClass8DP[] r0 = this.A0B;
            if (r0 != null && (length = r0.length) > 0) {
                r3.A0B = new AnonymousClass8DP[length];
                int i = 0;
                while (true) {
                    AnonymousClass8DP[] r1 = this.A0B;
                    if (i >= r1.length) {
                        break;
                    } else if (r1[i] != null) {
                        throw AnonymousClass001.A0A("clone");
                    } else {
                        i++;
                    }
                }
            }
            AnonymousClass8DE r02 = this.A04;
            if (r02 != null) {
                r3.A04 = r02;
            }
            int[] iArr = this.A0A;
            if (iArr != null && iArr.length > 0) {
                r3.A0A = (int[]) iArr.clone();
            }
            AnonymousClass8DD r03 = this.A05;
            if (r03 != null) {
                r3.A05 = r03;
            }
            return r3;
        } catch (CloneNotSupportedException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public final int hashCode() {
        int length;
        int i;
        int i2 = 1237;
        int A042 = ((((C165577te.A04(this.A02, C165577te.A04(this.A01, (AnonymousClass000.A0k(this).hashCode() + 527) * 31)) * 31 * 31) + this.A00) * 31 * 31 * 31) + 1237) * 31;
        AnonymousClass8DP[] r4 = this.A0B;
        if (r4 == null) {
            length = 0;
        } else {
            length = r4.length;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            AnonymousClass8DP r1 = r4[i4];
            if (r1 != null) {
                i3 = C36401kF.A02(r1, i3 * 31);
            }
        }
        int A043 = ((C165577te.A04(this.A03, (((((((A042 + i3) * 31) + Arrays.hashCode(this.A07)) * 31) + AnonymousClass000.A0H(this.A04)) * 31) + Arrays.hashCode(this.A08)) * 31 * 31 * 31 * 31 * 31) * 31) + Arrays.hashCode(this.A09)) * 31 * 31 * 31;
        int[] iArr = this.A0A;
        if (iArr == null || iArr.length == 0) {
            i = 0;
        } else {
            i = Arrays.hashCode(iArr);
        }
        int A0H = (((A043 + i) * 31 * 31) + AnonymousClass000.A0H(this.A05)) * 31;
        if (this.A06) {
            i2 = 1231;
        }
        return (A0H + i2) * 31;
    }
}
