package X;

/* renamed from: X.0Ui  reason: invalid class name */
public abstract class AnonymousClass0Ui {
    public int A00;
    public int[] A01 = C05840Rg.A00;
    public long[] A02 = C05860Ri.A00;

    /* JADX WARNING: type inference failed for: r25v0, types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        if (X.AnonymousClass000.A0O(r2) != 0) goto L_0x0098;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r25) {
        /*
            r24 = this;
            r13 = r25
            r23 = 1
            r1 = r24
            if (r13 == r1) goto L_0x0099
            boolean r0 = r13 instanceof X.AnonymousClass0Ui
            r22 = 0
            if (r0 == 0) goto L_0x0098
            X.0Ui r13 = (X.AnonymousClass0Ui) r13
            int[] r0 = r1.A01
            r21 = r0
            long[] r14 = r1.A02
            int r0 = r14.length
            int r12 = r0 + -2
            if (r12 < 0) goto L_0x0099
            r11 = 0
        L_0x001c:
            r19 = r14[r11]
            long r3 = X.AnonymousClass000.A0Q(r19)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0093
            int r0 = r11 - r12
            int r0 = ~r0
            int r0 = r0 >>> 31
            r10 = 8
            int r9 = 8 - r0
            r8 = 0
        L_0x0036:
            if (r8 >= r9) goto L_0x0091
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r19
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0079
            int r0 = r11 << 3
            int r0 = r0 + r8
            r7 = r21[r0]
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r7
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r6 = r1 & 127(0x7f, float:1.78E-43)
            int r5 = r13.A00
            int r4 = r1 >>> 7
            r4 = r4 & r5
            r18 = 0
        L_0x0057:
            long[] r0 = r13.A02
            long r2 = X.AnonymousClass000.A0S(r0, r4)
            long r0 = X.AnonymousClass000.A0N(r6, r2)
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r15
        L_0x0067:
            r16 = 0
            int r15 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r15 == 0) goto L_0x0083
            int r16 = X.AnonymousClass000.A06(r4, r5, r0)
            int[] r15 = r13.A01
            r15 = r15[r16]
            if (r15 != r7) goto L_0x007e
            if (r16 < 0) goto L_0x0098
        L_0x0079:
            long r19 = r19 >> r10
            int r8 = r8 + 1
            goto L_0x0036
        L_0x007e:
            long r0 = X.AnonymousClass000.A0P(r0)
            goto L_0x0067
        L_0x0083:
            long r1 = X.AnonymousClass000.A0O(r2)
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0098
            int r18 = r18 + 8
            int r4 = r4 + r18
            r4 = r4 & r5
            goto L_0x0057
        L_0x0091:
            if (r9 != r10) goto L_0x0099
        L_0x0093:
            if (r11 == r12) goto L_0x0099
            int r11 = r11 + 1
            goto L_0x001c
        L_0x0098:
            return r22
        L_0x0099:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Ui.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int[] iArr = this.A01;
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
                            i += iArr[(i2 << 3) + i4];
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
        int[] iArr = this.A01;
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
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 == -1) {
                                A0u.append("...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                A0u.append(", ");
                            }
                            A0u.append(i5);
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
}
