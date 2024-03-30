package X;

import java.util.List;

/* renamed from: X.4ic  reason: invalid class name and case insensitive filesystem */
public final class C94684ic extends AnonymousClass6FE {
    public C120675rt A00;
    public C160787la A01;
    public boolean A02 = true;
    public boolean A03 = true;
    public boolean A04;
    public final C000700i A05 = new C000700i(2);
    public final C137856gq A06;
    public final AnonymousClass61U A07 = new AnonymousClass61U();
    public final C1506776e A08 = C1506776e.A02(new Long[16]);

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010c, code lost:
        if (r1 == 1) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.C000700i r39, X.AnonymousClass61T r40, X.C160787la r41, boolean r42) {
        /*
            r38 = this;
            r4 = r38
            r8 = r39
            r14 = r40
            r7 = r41
            r19 = r42
            r0 = r19
            boolean r18 = super.A03(r8, r14, r7, r0)
            X.6gq r9 = r4.A06
            boolean r0 = r9.A08
            r5 = 1
            if (r0 == 0) goto L_0x021c
            r6 = 0
        L_0x0018:
            boolean r0 = r9 instanceof X.C161847nZ
            if (r0 == 0) goto L_0x00de
            X.4iy r0 = X.C137856gq.A06(r9)
            r4.A01 = r0
        L_0x0022:
            X.6gq r9 = X.AnonymousClass6VZ.A00(r6)
        L_0x0026:
            r3 = 0
            if (r9 != 0) goto L_0x0018
            int r17 = r8.A00()
        L_0x002d:
            r0 = r17
            if (r3 >= r0) goto L_0x0110
            long r5 = r8.A02(r3)
            java.lang.Object r2 = r8.A04(r3)
            X.6E5 r2 = (X.AnonymousClass6E5) r2
            X.61U r12 = r4.A07
            int r11 = r12.A00
            r1 = 0
        L_0x0040:
            if (r1 >= r11) goto L_0x00da
            long[] r0 = r12.A01
            r9 = r0[r1]
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0083
            java.util.List r11 = r2.A02
            if (r11 != 0) goto L_0x0050
            X.09w r11 = X.C023409w.A00
        L_0x0050:
            java.util.ArrayList r13 = X.C36361kB.A0r(r11)
            int r12 = r11.size()
            r10 = 0
        L_0x0059:
            if (r10 >= r12) goto L_0x0086
            java.lang.Object r9 = r11.get(r10)
            X.62N r9 = (X.AnonymousClass62N) r9
            long r0 = r9.A02
            r25 = r0
            X.7la r15 = r4.A01
            X.AnonymousClass00C.A0B(r15)
            long r0 = r9.A01
            long r23 = r15.BOR(r7, r0)
            long r15 = r9.A00
            X.62N r0 = new X.62N
            r21 = r25
            r25 = r15
            r20 = r0
            r20.<init>(r21, r23, r25)
            r13.add(r0)
            int r10 = r10 + 1
            goto L_0x0059
        L_0x0083:
            int r1 = r1 + 1
            goto L_0x0040
        L_0x0086:
            X.00i r10 = r4.A05
            X.7la r9 = r4.A01
            X.AnonymousClass00C.A0B(r9)
            long r0 = r2.A07
            long r31 = r9.BOR(r7, r0)
            X.7la r9 = r4.A01
            X.AnonymousClass00C.A0B(r9)
            long r0 = r2.A06
            long r27 = r9.BOR(r7, r0)
            long r0 = r2.A05
            r25 = r0
            long r0 = r2.A0A
            r29 = r0
            boolean r0 = r2.A0B
            r35 = r0
            long r15 = r2.A08
            boolean r0 = r2.A0C
            r36 = r0
            int r0 = r2.A04
            r22 = r0
            long r11 = r2.A09
            float r0 = r2.A03
            r20 = r0
            long r0 = r2.A00
            r37 = 0
            X.6E5 r9 = new X.6E5
            r21 = r20
            r23 = r25
            r25 = r29
            r29 = r15
            r33 = r11
            r20 = r9
            r20.<init>(r21, r22, r23, r25, r27, r29, r31, r33, r35, r36, r37)
            r9.A02 = r13
            r9.A00 = r0
            X.6Jc r0 = r2.A01
            r9.A01 = r0
            r10.A0A(r5, r9)
        L_0x00da:
            int r3 = r3 + 1
            goto L_0x002d
        L_0x00de:
            int r0 = r9.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0022
            boolean r0 = r9 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0022
            r0 = r9
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x00ee:
            if (r2 == 0) goto L_0x010c
            int r0 = r2.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x00fb
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x00fe
            r9 = r2
        L_0x00fb:
            X.6gq r2 = r2.A02
            goto L_0x00ee
        L_0x00fe:
            X.76e r6 = X.C90464aC.A0G(r6)
            if (r9 == 0) goto L_0x0108
            r6.A0D(r9)
            r9 = 0
        L_0x0108:
            r6.A0D(r2)
            goto L_0x00fb
        L_0x010c:
            if (r1 != r5) goto L_0x0022
            goto L_0x0026
        L_0x0110:
            X.00i r6 = r4.A05
            int r0 = r6.A00()
            if (r0 != 0) goto L_0x0124
            X.61U r1 = r4.A07
            r0 = 0
            r1.A00 = r0
            X.76e r0 = r4.A00
            r0.A06()
            r0 = 1
            return r0
        L_0x0124:
            r0 = 1
            X.61U r10 = r4.A07
            int r9 = r10.A00
            int r9 = r9 - r0
        L_0x012a:
            r0 = -1
            if (r0 >= r9) goto L_0x0152
            long[] r0 = r10.A01
            r0 = r0[r9]
            int r0 = r8.A01(r0)
            if (r0 >= 0) goto L_0x014f
            r11 = r9
            int r7 = r10.A00
            if (r9 >= r7) goto L_0x014f
            r0 = 1
            int r5 = r7 - r0
        L_0x013f:
            if (r11 >= r5) goto L_0x014b
            long[] r3 = r10.A01
            int r2 = r11 + 1
            r0 = r3[r2]
            r3[r11] = r0
            r11 = r2
            goto L_0x013f
        L_0x014b:
            int r0 = r7 + -1
            r10.A00 = r0
        L_0x014f:
            int r9 = r9 + -1
            goto L_0x012a
        L_0x0152:
            int r0 = r6.A00()
            java.util.ArrayList r5 = X.C36441kJ.A14(r0)
            int r2 = r6.A00()
            r1 = 0
        L_0x015f:
            if (r1 >= r2) goto L_0x016b
            java.lang.Object r0 = r6.A04(r1)
            r5.add(r0)
            int r1 = r1 + 1
            goto L_0x015f
        L_0x016b:
            X.5rt r3 = new X.5rt
            r3.<init>(r14, r5)
            java.util.List r2 = r3.A02
            int r7 = r2.size()
            r6 = 0
        L_0x0177:
            if (r6 >= r7) goto L_0x018b
            java.lang.Object r5 = r2.get(r6)
            r0 = r5
            X.6E5 r0 = (X.AnonymousClass6E5) r0
            long r0 = r0.A05
            boolean r0 = r14.A00(r0)
            if (r0 != 0) goto L_0x018c
            int r6 = r6 + 1
            goto L_0x0177
        L_0x018b:
            r5 = 0
        L_0x018c:
            X.6E5 r5 = (X.AnonymousClass6E5) r5
            if (r5 == 0) goto L_0x01ab
            if (r42 != 0) goto L_0x01f9
            r0 = 0
            r4.A02 = r0
            r7 = 0
        L_0x0196:
            boolean r6 = r4.A04
            if (r7 == r6) goto L_0x01e2
            int r1 = r3.A00
            r0 = 3
            if (r1 == r0) goto L_0x01a5
            r0 = 4
            if (r1 == r0) goto L_0x01a5
            r0 = 5
            if (r1 != r0) goto L_0x01e2
        L_0x01a5:
            r0 = 5
            if (r7 == 0) goto L_0x01a9
            r0 = 4
        L_0x01a9:
            r3.A00 = r0
        L_0x01ab:
            if (r18 != 0) goto L_0x0217
            int r1 = r3.A00
            r0 = 3
            if (r1 != r0) goto L_0x0217
            X.5rt r0 = r4.A00
            if (r0 == 0) goto L_0x0217
            java.util.List r11 = r0.A02
            int r1 = r11.size()
            int r0 = r2.size()
            if (r1 != r0) goto L_0x0217
            int r10 = r2.size()
            r9 = 0
        L_0x01c7:
            if (r9 >= r10) goto L_0x0219
            java.lang.Object r1 = r11.get(r9)
            X.6E5 r1 = (X.AnonymousClass6E5) r1
            java.lang.Object r0 = r2.get(r9)
            X.6E5 r0 = (X.AnonymousClass6E5) r0
            long r7 = r1.A06
            long r5 = r0.A06
            long r0 = X.C133206Xf.A03
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0217
            int r9 = r9 + 1
            goto L_0x01c7
        L_0x01e2:
            int r1 = r3.A00
            r0 = 4
            if (r1 != r0) goto L_0x01ef
            if (r6 == 0) goto L_0x01ab
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x01ab
        L_0x01ed:
            r0 = 3
            goto L_0x01a9
        L_0x01ef:
            r0 = 5
            if (r1 != r0) goto L_0x01ab
            if (r7 == 0) goto L_0x01ab
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x01ab
            goto L_0x01ed
        L_0x01f9:
            boolean r7 = r4.A02
            if (r7 != 0) goto L_0x0196
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0205
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x0196
        L_0x0205:
            X.7la r0 = r4.A01
            X.AnonymousClass00C.A0B(r0)
            long r0 = r0.BHd()
            boolean r0 = X.AnonymousClass6G7.A00(r5, r0)
            r7 = r0 ^ 1
            r4.A02 = r7
            goto L_0x0196
        L_0x0217:
            r5 = 1
            goto L_0x021a
        L_0x0219:
            r5 = 0
        L_0x021a:
            r4.A00 = r3
        L_0x021c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94684ic.A03(X.00i, X.61T, X.7la, boolean):boolean");
    }

    public C94684ic(C137856gq r3) {
        this.A06 = r3;
    }

    public void A02(AnonymousClass61T r15) {
        super.A02(r15);
        C120675rt r8 = this.A00;
        if (r8 != null) {
            this.A04 = this.A02;
            List list = r8.A02;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass6E5 r2 = (AnonymousClass6E5) list.get(i);
                if (!r2.A0B && (!r15.A00(r2.A05) || !this.A02)) {
                    AnonymousClass61U r10 = this.A07;
                    long j = r2.A05;
                    int i2 = r10.A00;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            break;
                        }
                        long[] jArr = r10.A01;
                        if (j != jArr[i3]) {
                            i3++;
                        } else if (i3 < i2) {
                            int i4 = i2 - 1;
                            while (i3 < i4) {
                                int i5 = i3 + 1;
                                jArr[i3] = jArr[i5];
                                i3 = i5;
                            }
                            r10.A00 = i2 - 1;
                        }
                    }
                }
            }
            this.A02 = false;
            this.A03 = AnonymousClass000.A1S(r8.A00, 5);
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Node(pointerInputFilter=");
        A0u.append(this.A06);
        A0u.append(", children=");
        A0u.append(this.A00);
        A0u.append(", pointerIds=");
        return AnonymousClass000.A0m(this.A07, A0u);
    }
}
