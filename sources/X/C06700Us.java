package X;

/* renamed from: X.0Us  reason: invalid class name and case insensitive filesystem */
public abstract class C06700Us {
    public int A00;
    public int A01;
    public int[] A02 = C05840Rg.A00;
    public long[] A03 = C05860Ri.A00;
    public Object[] A04 = AnonymousClass009.A02;

    /* JADX WARNING: type inference failed for: r20v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r20) {
        /*
            r19 = this;
            r12 = r20
            r18 = 1
            r2 = r19
            if (r12 == r2) goto L_0x007e
            boolean r0 = r12 instanceof X.C06700Us
            r17 = 0
            if (r0 == 0) goto L_0x005a
            X.0Us r12 = (X.C06700Us) r12
            int r1 = r12.A01
            int r0 = r2.A01
            if (r1 != r0) goto L_0x005a
            java.lang.Object[] r11 = r2.A04
            int[] r10 = r2.A02
            long[] r9 = r2.A03
            int r0 = r9.length
            int r8 = r0 + -2
            if (r8 < 0) goto L_0x007e
            r7 = 0
        L_0x0022:
            r15 = r9[r7]
            long r3 = X.AnonymousClass000.A0Q(r15)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            int r0 = r7 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r6 = 8
            int r5 = 8 - r0
            r4 = 0
        L_0x003c:
            if (r4 >= r5) goto L_0x005f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r15
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005b
            int r0 = r7 << 3
            int r0 = r0 + r4
            r3 = r11[r0]
            r2 = r10[r0]
            int r1 = r12.A03(r3)
            if (r1 < 0) goto L_0x0066
            int[] r0 = r12.A02
            r0 = r0[r1]
            if (r2 == r0) goto L_0x005b
        L_0x005a:
            return r17
        L_0x005b:
            long r15 = r15 >> r6
            int r4 = r4 + 1
            goto L_0x003c
        L_0x005f:
            if (r5 != r6) goto L_0x007e
        L_0x0061:
            if (r7 == r8) goto L_0x007e
            int r7 = r7 + 1
            goto L_0x0022
        L_0x0066:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "There is no key "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " in the map"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x007e:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06700Us.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = this.A04;
        int[] iArr = this.A02;
        long[] jArr = this.A03;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            i += iArr[i5] ^ AnonymousClass000.A0J(objArr[i5]);
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public String toString() {
        if (this.A01 == 0) {
            return "{}";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append('{');
        Object[] objArr = this.A04;
        int[] iArr = this.A02;
        long[] jArr = this.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            A0u.append(obj);
                            A0u.append("=");
                            A0u.append(i6);
                            i2++;
                            AnonymousClass000.A1E(A0u, i2, this.A01);
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        String A0s = AnonymousClass000.A0s(A0u);
        AnonymousClass00C.A08(A0s);
        return A0s;
    }

    public final int A03(Object obj) {
        int A042 = AnonymousClass000.A04(AnonymousClass000.A0J(obj));
        int i = A042 & 127;
        int i2 = this.A00;
        int i3 = (A042 >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long A0S = AnonymousClass000.A0S(this.A03, i3);
            for (long A0N = AnonymousClass000.A0N(i, A0S) & -9187201950435737472L; A0N != 0; A0N = AnonymousClass000.A0P(A0N)) {
                int A06 = AnonymousClass000.A06(i3, i2, A0N);
                if (AnonymousClass00C.A0J(this.A04[A06], obj)) {
                    return A06;
                }
            }
            if (AnonymousClass000.A0O(A0S) != 0) {
                return -1;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }
}
