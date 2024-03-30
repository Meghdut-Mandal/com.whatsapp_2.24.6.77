package X;

/* renamed from: X.0V0  reason: invalid class name */
public abstract class AnonymousClass0V0 {
    public int A00;
    public int A01;
    public long[] A02 = C05860Ri.A00;
    public Object[] A03;
    public Object[] A04;

    public final boolean A03(Object obj) {
        int A042 = AnonymousClass000.A04(AnonymousClass000.A0J(obj));
        int i = A042 & 127;
        int i2 = this.A00;
        int i3 = (A042 >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long A0S = AnonymousClass000.A0S(this.A02, i3);
            for (long A0N = AnonymousClass000.A0N(i, A0S) & -9187201950435737472L; A0N != 0; A0N = AnonymousClass000.A0P(A0N)) {
                int A06 = AnonymousClass000.A06(i3, i2, A0N);
                if (AnonymousClass00C.A0J(this.A03[A06], obj)) {
                    return A06 >= 0;
                }
            }
            if (AnonymousClass000.A0O(A0S) != 0) {
                return false;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r11 = r19
            r17 = 1
            r2 = r18
            if (r11 == r2) goto L_0x006d
            boolean r0 = r11 instanceof X.AnonymousClass0V0
            r16 = 0
            if (r0 == 0) goto L_0x005c
            X.0V0 r11 = (X.AnonymousClass0V0) r11
            int r1 = r11.A01
            int r0 = r2.A01
            if (r1 != r0) goto L_0x005c
            java.lang.Object[] r10 = r2.A03
            java.lang.Object[] r9 = r2.A04
            long[] r8 = r2.A02
            int r0 = r8.length
            int r7 = r0 + -2
            if (r7 < 0) goto L_0x006d
            r6 = 0
        L_0x0022:
            r14 = r8[r6]
            long r3 = X.AnonymousClass000.A0Q(r14)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0068
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L_0x003c:
            if (r3 >= r4) goto L_0x0066
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r14
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0062
            int r0 = r6 << 3
            int r0 = r0 + r3
            r2 = r10[r0]
            r1 = r9[r0]
            java.lang.Object r0 = r11.A02(r2)
            if (r1 != 0) goto L_0x005d
            if (r0 != 0) goto L_0x005c
            boolean r0 = r11.A03(r2)
        L_0x005a:
            if (r0 != 0) goto L_0x0062
        L_0x005c:
            return r16
        L_0x005d:
            boolean r0 = r1.equals(r0)
            goto L_0x005a
        L_0x0062:
            long r14 = r14 >> r5
            int r3 = r3 + 1
            goto L_0x003c
        L_0x0066:
            if (r4 != r5) goto L_0x006d
        L_0x0068:
            if (r6 == r7) goto L_0x006d
            int r6 = r6 + 1
            goto L_0x0022
        L_0x006d:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0V0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = this.A03;
        Object[] objArr2 = this.A04;
        long[] jArr = this.A02;
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
                            Object obj = objArr[i5];
                            i += AnonymousClass000.A0J(objArr2[i5]) ^ AnonymousClass000.A0J(obj);
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
        Object[] objArr = this.A03;
        Object[] objArr2 = this.A04;
        long[] jArr = this.A02;
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
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            A0u.append(obj);
                            A0u.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            A0u.append(obj2);
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

    public AnonymousClass0V0() {
        Object[] objArr = AnonymousClass009.A02;
        this.A03 = objArr;
        this.A04 = objArr;
    }

    public final Object A02(Object obj) {
        int A042 = AnonymousClass000.A04(AnonymousClass000.A0J(obj));
        int i = A042 & 127;
        int i2 = this.A00;
        int i3 = (A042 >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long A0S = AnonymousClass000.A0S(this.A02, i3);
            long A0N = AnonymousClass000.A0N(i, A0S) & -9187201950435737472L;
            while (A0N != 0) {
                int A06 = AnonymousClass000.A06(i3, i2, A0N);
                if (!AnonymousClass00C.A0J(this.A03[A06], obj)) {
                    A0N = AnonymousClass000.A0P(A0N);
                } else if (A06 >= 0) {
                    return this.A04[A06];
                } else {
                    return null;
                }
            }
            if (AnonymousClass000.A0O(A0S) != 0) {
                return null;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }
}
