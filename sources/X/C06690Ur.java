package X;

/* renamed from: X.0Ur  reason: invalid class name and case insensitive filesystem */
public abstract class C06690Ur {
    public int A00;
    public int A01;
    public int[] A02 = C05840Rg.A00;
    public long[] A03 = C05860Ri.A00;
    public Object[] A04 = AnonymousClass009.A02;

    /* JADX WARNING: type inference failed for: r26v0, types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        if (X.AnonymousClass000.A0O(r2) != 0) goto L_0x00b4;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r26) {
        /*
            r25 = this;
            r11 = r26
            r24 = 1
            r2 = r25
            if (r11 == r2) goto L_0x00b5
            boolean r0 = r11 instanceof X.C06690Ur
            r23 = 0
            if (r0 == 0) goto L_0x00b4
            X.0Ur r11 = (X.C06690Ur) r11
            int r1 = r11.A01
            int r0 = r2.A01
            if (r1 != r0) goto L_0x00b4
            int[] r0 = r2.A02
            r22 = r0
            java.lang.Object[] r0 = r2.A04
            r21 = r0
            long[] r13 = r2.A03
            int r0 = r13.length
            int r12 = r0 + -2
            if (r12 < 0) goto L_0x00b5
            r10 = 0
        L_0x0026:
            r19 = r13[r10]
            long r3 = X.AnonymousClass000.A0Q(r19)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ae
            int r0 = r10 - r12
            int r0 = ~r0
            int r0 = r0 >>> 31
            r9 = 8
            int r8 = 8 - r0
            r7 = 0
        L_0x0040:
            if (r7 >= r8) goto L_0x00ac
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r19
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x008d
            int r0 = r10 << 3
            int r0 = r0 + r7
            r14 = r22[r0]
            r1 = r21[r0]
            java.lang.Object r0 = r11.A02(r14)
            if (r1 != 0) goto L_0x00a5
            if (r0 != 0) goto L_0x00b4
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r14
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r6 = r1 & 127(0x7f, float:1.78E-43)
            int r5 = r11.A00
            int r4 = r1 >>> 7
            r4 = r4 & r5
            r18 = 0
        L_0x006b:
            long[] r0 = r11.A03
            long r2 = X.AnonymousClass000.A0S(r0, r4)
            long r0 = X.AnonymousClass000.A0N(r6, r2)
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r15
        L_0x007b:
            r16 = 0
            int r15 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r15 == 0) goto L_0x0097
            int r16 = X.AnonymousClass000.A06(r4, r5, r0)
            int[] r15 = r11.A02
            r15 = r15[r16]
            if (r15 != r14) goto L_0x0092
            if (r16 < 0) goto L_0x00b4
        L_0x008d:
            long r19 = r19 >> r9
            int r7 = r7 + 1
            goto L_0x0040
        L_0x0092:
            long r0 = X.AnonymousClass000.A0P(r0)
            goto L_0x007b
        L_0x0097:
            long r1 = X.AnonymousClass000.A0O(r2)
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00b4
            int r18 = r18 + 8
            int r4 = r4 + r18
            r4 = r4 & r5
            goto L_0x006b
        L_0x00a5:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008d
            return r23
        L_0x00ac:
            if (r8 != r9) goto L_0x00b5
        L_0x00ae:
            if (r10 == r12) goto L_0x00b5
            int r10 = r10 + 1
            goto L_0x0026
        L_0x00b4:
            return r23
        L_0x00b5:
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06690Ur.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int[] iArr = this.A02;
        Object[] objArr = this.A04;
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
                            i += AnonymousClass000.A0J(objArr[i5]) ^ iArr[i5];
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
        int[] iArr = this.A02;
        Object[] objArr = this.A04;
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
                            int i6 = iArr[i5];
                            Object obj = objArr[i5];
                            A0u.append(i6);
                            A0u.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            A0u.append(obj);
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

    public final Object A02(int i) {
        int i2 = -862048943 * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & 127;
        int i5 = this.A00;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long A0S = AnonymousClass000.A0S(this.A03, i6);
            long A0N = AnonymousClass000.A0N(i4, A0S) & -9187201950435737472L;
            while (A0N != 0) {
                int A06 = AnonymousClass000.A06(i6, i5, A0N);
                if (this.A02[A06] != i) {
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
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }
}
