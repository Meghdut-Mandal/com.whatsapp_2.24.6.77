package X;

/* renamed from: X.0Uo  reason: invalid class name and case insensitive filesystem */
public abstract class C06670Uo {
    public int A00;
    public int A01;
    public long[] A02 = C05860Ri.A00;
    public Object[] A03 = AnonymousClass009.A02;

    public final boolean A03(Object obj) {
        int A04 = AnonymousClass000.A04(AnonymousClass000.A0J(obj));
        int i = A04 & 127;
        int i2 = this.A00;
        int i3 = (A04 >>> 7) & i2;
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

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r12 = r18
            r16 = 1
            r2 = r17
            if (r12 == r2) goto L_0x005b
            boolean r0 = r12 instanceof X.C06670Uo
            r15 = 0
            if (r0 == 0) goto L_0x004f
            X.0Uo r12 = (X.C06670Uo) r12
            int r1 = r12.A01
            int r0 = r2.A01
            if (r1 != r0) goto L_0x004f
            java.lang.Object[] r11 = r2.A03
            long[] r10 = r2.A02
            int r0 = r10.length
            int r9 = r0 + -2
            if (r9 < 0) goto L_0x005b
            r8 = 0
        L_0x001f:
            r13 = r10[r8]
            long r3 = X.AnonymousClass000.A0Q(r13)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
            int r0 = r8 - r9
            int r0 = ~r0
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L_0x0039:
            if (r5 >= r6) goto L_0x0054
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0050
            int r0 = r8 << 3
            int r0 = r0 + r5
            r0 = r11[r0]
            boolean r0 = r12.A03(r0)
            if (r0 != 0) goto L_0x0050
        L_0x004f:
            return r15
        L_0x0050:
            long r13 = r13 >> r7
            int r5 = r5 + 1
            goto L_0x0039
        L_0x0054:
            if (r6 != r7) goto L_0x005b
        L_0x0056:
            if (r8 == r9) goto L_0x005b
            int r8 = r8 + 1
            goto L_0x001f
        L_0x005b:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06670Uo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = this.A03;
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
                            i += AnonymousClass000.A0J(objArr[(i2 << 3) + i4]);
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
        C14560lp r12 = new C14560lp(this);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[");
        Object[] objArr = this.A03;
        long[] jArr = this.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0:
            while (true) {
                long j = jArr[i];
                if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                A0u.append("...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                A0u.append(", ");
                            }
                            A0u.append((CharSequence) r12.invoke(obj));
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
        String obj2 = A0u.toString();
        AnonymousClass00C.A08(obj2);
        return obj2;
    }
}