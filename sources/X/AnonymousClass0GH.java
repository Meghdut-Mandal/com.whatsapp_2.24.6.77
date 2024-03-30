package X;

/* renamed from: X.0GH  reason: invalid class name */
public class AnonymousClass0GH extends AnonymousClass0GK {
    public int A00 = 0;
    public int A01 = 0;
    public boolean A02 = true;

    public boolean A0G() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r18.A06() != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        if (r17.A06() != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r2 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fa, code lost:
        if (r3 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0102, code lost:
        if (r2 != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0104, code lost:
        r16 = 5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(X.AnonymousClass0B3 r20) {
        /*
            r19 = this;
            r8 = r19
            X.0Az[] r3 = r8.A0n
            X.0Az r10 = r8.A0W
            r7 = 0
            r3[r7] = r10
            X.0Az r6 = r8.A0Y
            r12 = 2
            r3[r12] = r6
            X.0Az r0 = r8.A0X
            r18 = r0
            r11 = 1
            r3[r11] = r0
            X.0Az r0 = r8.A0S
            r17 = r0
            r0 = 3
            r3[r0] = r17
            r2 = 0
        L_0x001d:
            int r0 = r3.length
            r9 = r20
            if (r2 >= r0) goto L_0x002d
            r1 = r3[r2]
            X.0B4 r0 = r9.A09(r1)
            r1.A02 = r0
            int r2 = r2 + 1
            goto L_0x001d
        L_0x002d:
            int r4 = r8.A00
            if (r4 < 0) goto L_0x013e
            r5 = 4
            if (r4 >= r5) goto L_0x013e
            r13 = r3[r4]
            r3 = 0
        L_0x0037:
            int r0 = r8.A00
            if (r3 >= r0) goto L_0x004c
            X.0Aq[] r0 = r8.A01
            r2 = r0[r3]
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x004e
            boolean r0 = r2.A0G()
            if (r0 != 0) goto L_0x004e
        L_0x0049:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x004c:
            r1 = 0
            goto L_0x0067
        L_0x004e:
            if (r4 == 0) goto L_0x0107
            if (r4 == r11) goto L_0x0107
            java.lang.Integer[] r0 = r2.A0q
            r1 = r0[r11]
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 != r0) goto L_0x0049
            X.0Az r0 = r2.A0Y
            X.0Az r0 = r0.A03
            if (r0 == 0) goto L_0x0049
            X.0Az r0 = r2.A0S
        L_0x0062:
            X.0Az r0 = r0.A03
            if (r0 == 0) goto L_0x0049
            r1 = 1
        L_0x0067:
            boolean r0 = r10.A06()
            if (r0 != 0) goto L_0x0074
            boolean r0 = r18.A06()
            r3 = 0
            if (r0 == 0) goto L_0x0075
        L_0x0074:
            r3 = 1
        L_0x0075:
            boolean r0 = r6.A06()
            if (r0 != 0) goto L_0x0082
            boolean r0 = r17.A06()
            r2 = 0
            if (r0 == 0) goto L_0x0083
        L_0x0082:
            r2 = 1
        L_0x0083:
            if (r1 != 0) goto L_0x008d
            int r1 = r8.A00
            if (r1 == 0) goto L_0x00fa
            if (r1 != r12) goto L_0x00fd
            if (r2 != 0) goto L_0x0104
        L_0x008d:
            r16 = 4
        L_0x008f:
            r4 = 0
        L_0x0090:
            int r0 = r8.A00
            if (r4 >= r0) goto L_0x0119
            X.0Aq[] r0 = r8.A01
            r1 = r0[r4]
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r1.A0G()
            if (r0 != 0) goto L_0x00a5
        L_0x00a2:
            int r4 = r4 + 1
            goto L_0x0090
        L_0x00a5:
            X.0Az[] r1 = r1.A0n
            int r0 = r8.A00
            r0 = r1[r0]
            X.0B4 r3 = r9.A09(r0)
            int r14 = r8.A00
            r1 = r1[r14]
            r1.A02 = r3
            X.0Az r0 = r1.A03
            if (r0 == 0) goto L_0x00f8
            X.0Aq r0 = r0.A05
            if (r0 != r8) goto L_0x00f8
            int r2 = r1.A01
        L_0x00bf:
            if (r14 == 0) goto L_0x00e4
            if (r14 == r12) goto L_0x00e4
            X.0B4 r0 = r13.A02
            r15 = r0
            int r14 = r8.A01
            int r14 = r14 + r2
            X.0B6 r1 = r9.A06()
            X.0B4 r0 = r9.A07()
            r0.A05 = r7
            r1.A04(r15, r3, r0, r14)
        L_0x00d6:
            r9.A0B(r1)
            X.0B4 r14 = r13.A02
            int r1 = r8.A01
            int r1 = r1 + r2
            r0 = r16
            r9.A0D(r14, r3, r1, r0)
            goto L_0x00a2
        L_0x00e4:
            X.0B4 r0 = r13.A02
            r15 = r0
            int r14 = r8.A01
            int r14 = r14 - r2
            X.0B6 r1 = r9.A06()
            X.0B4 r0 = r9.A07()
            r0.A05 = r7
            r1.A05(r15, r3, r0, r14)
            goto L_0x00d6
        L_0x00f8:
            r2 = 0
            goto L_0x00bf
        L_0x00fa:
            if (r3 != 0) goto L_0x0104
            goto L_0x008d
        L_0x00fd:
            if (r1 == r11) goto L_0x00fa
            r0 = 3
            if (r1 != r0) goto L_0x008d
            if (r2 == 0) goto L_0x008d
        L_0x0104:
            r16 = 5
            goto L_0x008f
        L_0x0107:
            java.lang.Integer[] r0 = r2.A0q
            r1 = r0[r7]
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 != r0) goto L_0x0049
            X.0Az r0 = r2.A0W
            X.0Az r0 = r0.A03
            if (r0 == 0) goto L_0x0049
            X.0Az r0 = r2.A0X
            goto L_0x0062
        L_0x0119:
            int r1 = r8.A00
            r2 = 8
            if (r1 != 0) goto L_0x013f
            r0 = r18
            X.0B4 r1 = r0.A02
            X.0B4 r0 = r10.A02
            r9.A0D(r1, r0, r7, r2)
            X.0B4 r1 = r10.A02
            X.0Aq r0 = r8.A0Z
            X.0Az r0 = r0.A0X
            X.0B4 r0 = r0.A02
            r9.A0D(r1, r0, r7, r5)
            X.0B4 r1 = r10.A02
            X.0Aq r0 = r8.A0Z
            X.0Az r0 = r0.A0W
        L_0x0139:
            X.0B4 r0 = r0.A02
            r9.A0D(r1, r0, r7, r7)
        L_0x013e:
            return
        L_0x013f:
            if (r1 != r11) goto L_0x015c
            X.0B4 r1 = r10.A02
            r0 = r18
            X.0B4 r0 = r0.A02
            r9.A0D(r1, r0, r7, r2)
            X.0B4 r1 = r10.A02
            X.0Aq r0 = r8.A0Z
            X.0Az r0 = r0.A0W
            X.0B4 r0 = r0.A02
            r9.A0D(r1, r0, r7, r5)
            X.0B4 r1 = r10.A02
            X.0Aq r0 = r8.A0Z
            X.0Az r0 = r0.A0X
            goto L_0x0139
        L_0x015c:
            if (r1 != r12) goto L_0x0179
            r0 = r17
            X.0B4 r1 = r0.A02
            X.0B4 r0 = r6.A02
            r9.A0D(r1, r0, r7, r2)
            X.0B4 r1 = r6.A02
            X.0Aq r0 = r8.A0Z
            X.0Az r0 = r0.A0S
            X.0B4 r0 = r0.A02
            r9.A0D(r1, r0, r7, r5)
            X.0B4 r1 = r6.A02
            X.0Aq r0 = r8.A0Z
            X.0Az r0 = r0.A0Y
            goto L_0x0139
        L_0x0179:
            r0 = 3
            if (r1 != r0) goto L_0x013e
            X.0B4 r1 = r6.A02
            r0 = r17
            X.0B4 r0 = r0.A02
            r9.A0D(r1, r0, r7, r2)
            X.0B4 r1 = r6.A02
            X.0Aq r0 = r8.A0Z
            X.0Az r0 = r0.A0Y
            X.0B4 r0 = r0.A02
            r9.A0D(r1, r0, r7, r5)
            X.0B4 r1 = r6.A02
            X.0Aq r0 = r8.A0Z
            X.0Az r0 = r0.A0S
            goto L_0x0139
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GH.A0J(X.0B3):void");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[Barrier] ");
        A0u.append(this.A0f);
        String A0q = AnonymousClass000.A0q(" {", A0u);
        for (int i = 0; i < this.A00; i++) {
            C02500Aq r2 = this.A01[i];
            if (i > 0) {
                A0q = AnonymousClass000.A0q(", ", AnonymousClass000.A0v(A0q));
            }
            A0q = AnonymousClass000.A0q(r2.A0f, AnonymousClass000.A0v(A0q));
        }
        return AnonymousClass000.A0q("}", AnonymousClass000.A0v(A0q));
    }
}
