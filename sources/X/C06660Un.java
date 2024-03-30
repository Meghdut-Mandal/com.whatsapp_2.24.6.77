package X;

/* renamed from: X.0Un  reason: invalid class name and case insensitive filesystem */
public abstract class C06660Un {
    public int A00;
    public int A01;
    public long[] A02 = C05850Rh.A00;
    public long[] A03 = C05860Ri.A00;

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r10 = r18
            r16 = 1
            r2 = r17
            if (r10 == r2) goto L_0x005b
            boolean r0 = r10 instanceof X.C06660Un
            r15 = 0
            if (r0 == 0) goto L_0x004f
            X.0Un r10 = (X.C06660Un) r10
            int r1 = r10.A01
            int r0 = r2.A01
            if (r1 != r0) goto L_0x004f
            long[] r9 = r2.A02
            long[] r8 = r2.A03
            int r0 = r8.length
            int r7 = r0 + -2
            if (r7 < 0) goto L_0x005b
            r6 = 0
        L_0x001f:
            r13 = r8[r6]
            long r3 = X.AnonymousClass000.A0Q(r13)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L_0x0039:
            if (r3 >= r4) goto L_0x0054
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0050
            int r0 = r6 << 3
            int r0 = r0 + r3
            r0 = r9[r0]
            boolean r0 = r10.A02(r0)
            if (r0 != 0) goto L_0x0050
        L_0x004f:
            return r15
        L_0x0050:
            long r13 = r13 >> r5
            int r3 = r3 + 1
            goto L_0x0039
        L_0x0054:
            if (r4 != r5) goto L_0x005b
        L_0x0056:
            if (r6 == r7) goto L_0x005b
            int r6 = r6 + 1
            goto L_0x001f
        L_0x005b:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06660Un.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long[] jArr = this.A02;
        long[] jArr2 = this.A03;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            i += AnonymousClass000.A08(jArr[(i2 << 3) + i4]);
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
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[");
        long[] jArr = this.A02;
        long[] jArr2 = this.A03;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0:
            while (true) {
                long j = jArr2[i];
                if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            long j2 = jArr[(i << 3) + i4];
                            if (i2 == -1) {
                                A0u.append("...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                A0u.append(", ");
                            }
                            A0u.append(j2);
                            i2++;
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
        A0u.append("]");
        String obj = A0u.toString();
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public final boolean A02(long j) {
        int A04 = AnonymousClass000.A04(AnonymousClass000.A08(j));
        int i = A04 & 127;
        int i2 = this.A00;
        int i3 = (A04 >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long A0S = AnonymousClass000.A0S(this.A03, i3);
            long A0N = AnonymousClass000.A0N(i, A0S) & -9187201950435737472L;
            while (A0N != 0) {
                int A06 = AnonymousClass000.A06(i3, i2, A0N);
                if (this.A02[A06] != j) {
                    A0N = AnonymousClass000.A0P(A0N);
                } else if (A06 >= 0) {
                    return true;
                } else {
                    return false;
                }
            }
            if (AnonymousClass000.A0O(A0S) != 0) {
                return false;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }
}
