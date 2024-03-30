package X;

/* renamed from: X.9YH  reason: invalid class name */
public final class AnonymousClass9YH {
    public final C200059gX A00;
    public final int[] A01;

    public int A00(int i) {
        if (i == 0) {
            int[] iArr = this.A01;
            return iArr[iArr.length - 1];
        }
        int[] iArr2 = this.A01;
        if (i == 1) {
            int i2 = 0;
            for (int i3 : iArr2) {
                i2 ^= i3;
            }
            return i2;
        }
        int i4 = iArr2[0];
        int length = iArr2.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = this.A00.A01(i, i4) ^ iArr2[i5];
        }
        return i4;
    }

    public AnonymousClass9YH A01(int i) {
        if (i == 0) {
            return this.A00.A01;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.A01;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = this.A00.A01(iArr[i2], i);
        }
        return new AnonymousClass9YH(this.A00, iArr2);
    }

    public AnonymousClass9YH A02(int i, int i2) {
        if (i < 0) {
            throw C165617ti.A0U();
        } else if (i2 == 0) {
            return this.A00.A01;
        } else {
            int[] iArr = this.A01;
            int length = iArr.length;
            int[] iArr2 = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr2[i3] = this.A00.A01(iArr[i3], i2);
            }
            return new AnonymousClass9YH(this.A00, iArr2);
        }
    }

    public AnonymousClass9YH A03(AnonymousClass9YH r10) {
        C200059gX r8 = this.A00;
        if (r8.equals(r10.A00)) {
            int[] iArr = this.A01;
            if (iArr[0] == 0) {
                return r10;
            }
            int[] iArr2 = r10.A01;
            if (iArr2[0] == 0) {
                return this;
            }
            int[] iArr3 = iArr;
            if (iArr.length <= iArr2.length) {
                iArr3 = iArr2;
                iArr2 = iArr;
            }
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int length2 = length - iArr2.length;
            System.arraycopy(iArr3, 0, iArr4, 0, length2);
            for (int i = length2; i < length; i++) {
                iArr4[i] = iArr2[i - length2] ^ iArr3[i];
            }
            return new AnonymousClass9YH(r8, iArr4);
        }
        throw AnonymousClass001.A08("GenericGFPolys do not have same GenericGF field");
    }

    public AnonymousClass9YH A04(AnonymousClass9YH r13) {
        C200059gX r10 = this.A00;
        if (r10.equals(r13.A00)) {
            int[] iArr = this.A01;
            if (iArr[0] != 0) {
                int[] iArr2 = r13.A01;
                if (iArr2[0] != 0) {
                    int length = iArr.length;
                    int length2 = iArr2.length;
                    int[] iArr3 = new int[((length + length2) - 1)];
                    for (int i = 0; i < length; i++) {
                        int i2 = iArr[i];
                        for (int i3 = 0; i3 < length2; i3++) {
                            int i4 = i + i3;
                            iArr3[i4] = iArr3[i4] ^ r10.A01(i2, iArr2[i3]);
                        }
                    }
                    return new AnonymousClass9YH(r10, iArr3);
                }
            }
            return r10.A01;
        }
        throw AnonymousClass001.A08("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064 A[EDGE_INSN: B:32:0x0064->B:28:0x0064 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            int[] r5 = r7.A01
            int r0 = r5.length
            int r6 = r0 + -1
            int r0 = r6 * 8
            java.lang.StringBuilder r4 = X.C90524aI.A0h(r0)
            r3 = r6
        L_0x000c:
            if (r3 < 0) goto L_0x0064
            int r0 = r6 - r3
            r1 = r5[r0]
            if (r1 == 0) goto L_0x0039
            if (r1 >= 0) goto L_0x0053
            java.lang.String r0 = " - "
            r4.append(r0)
            int r1 = -r1
        L_0x001c:
            r2 = 1
            if (r3 == 0) goto L_0x0021
            if (r1 == r2) goto L_0x0032
        L_0x0021:
            X.9gX r0 = r7.A00
            if (r1 == 0) goto L_0x005f
            int[] r0 = r0.A03
            r1 = r0[r1]
            if (r1 != 0) goto L_0x0045
            r0 = 49
        L_0x002d:
            r4.append(r0)
        L_0x0030:
            if (r3 == 0) goto L_0x0064
        L_0x0032:
            if (r3 != r2) goto L_0x003c
            r0 = 120(0x78, float:1.68E-43)
            r4.append(r0)
        L_0x0039:
            int r3 = r3 + -1
            goto L_0x000c
        L_0x003c:
            java.lang.String r0 = "x^"
            r4.append(r0)
            r4.append(r3)
            goto L_0x0039
        L_0x0045:
            if (r1 != r2) goto L_0x004a
            r0 = 97
            goto L_0x002d
        L_0x004a:
            java.lang.String r0 = "a^"
            r4.append(r0)
            r4.append(r1)
            goto L_0x0030
        L_0x0053:
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x001c
            java.lang.String r0 = " + "
            r4.append(r0)
            goto L_0x001c
        L_0x005f:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        L_0x0064:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9YH.toString():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011 A[LOOP:0: B:7:0x0011->B:10:0x0017, LOOP_START, PHI: r1 
      PHI: (r1v1 int) = (r1v0 int), (r1v3 int) binds: [B:6:0x0010, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9YH(X.C200059gX r6, int[] r7) {
        /*
            r5 = this;
            r5.<init>()
            int r4 = r7.length
            if (r4 == 0) goto L_0x002f
            r5.A00 = r6
            r3 = 1
            if (r4 <= r3) goto L_0x002c
            r2 = 0
            r0 = r7[r2]
            if (r0 != 0) goto L_0x002c
            r1 = 1
        L_0x0011:
            r0 = r7[r1]
            if (r0 != 0) goto L_0x001a
            int r1 = r1 + 1
            if (r1 >= r4) goto L_0x001a
            goto L_0x0011
        L_0x001a:
            if (r1 != r4) goto L_0x0023
            int[] r0 = new int[r3]
            r0[r2] = r2
            r5.A01 = r0
            return
        L_0x0023:
            int r4 = r4 - r1
            int[] r0 = new int[r4]
            r5.A01 = r0
            java.lang.System.arraycopy(r7, r1, r0, r2, r4)
            return
        L_0x002c:
            r5.A01 = r7
            return
        L_0x002f:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9YH.<init>(X.9gX, int[]):void");
    }
}
