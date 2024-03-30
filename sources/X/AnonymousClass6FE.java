package X;

/* renamed from: X.6FE  reason: invalid class name */
public class AnonymousClass6FE {
    public final C1506776e A00 = C1506776e.A02(new C94684ic[16]);

    public final void A01() {
        int i = 0;
        while (true) {
            C1506776e r2 = this.A00;
            if (i < r2.A00) {
                C94684ic r1 = (C94684ic) r2.A01[i];
                if (!r1.A06.A08) {
                    r2.A04(i);
                    r1.A00();
                } else {
                    i++;
                    r1.A01();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ef, code lost:
        if (r0 != false) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[LOOP:2: B:21:0x0062->B:25:0x0071, LOOP_START, PHI: r5 r7 
      PHI: (r5v2 X.76e) = (r5v1 X.76e), (r5v6 X.76e) binds: [B:20:0x0060, B:25:0x0071] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r7v1 X.6gq) = (r7v0 X.6gq), (r7v6 X.6gq) binds: [B:20:0x0060, B:25:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C000700i r16, X.AnonymousClass61T r17, X.C160787la r18, boolean r19) {
        /*
            r15 = this;
            r14 = r15
            boolean r0 = r15 instanceof X.C94684ic
            r9 = r19
            r10 = r17
            if (r0 == 0) goto L_0x00d5
            X.4ic r14 = (X.C94684ic) r14
            X.00i r13 = r14.A05
            int r0 = r13.A00()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r1 = 0
            r8 = 1
            if (r0 != 0) goto L_0x00d4
            X.6gq r7 = r14.A06
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x00d4
            X.5rt r6 = r14.A00
            X.AnonymousClass00C.A0B(r6)
            X.7la r0 = r14.A01
            X.AnonymousClass00C.A0B(r0)
            long r3 = r0.BHd()
            r12 = r7
            r5 = 0
            r11 = r5
        L_0x0030:
            boolean r0 = r12 instanceof X.C161847nZ
            if (r0 == 0) goto L_0x00a3
            X.7nZ r12 = (X.C161847nZ) r12
            X.5Rl r0 = X.C107935Rl.Initial
            r12.Bcv(r6, r0, r3)
        L_0x003b:
            X.6gq r12 = X.AnonymousClass6VZ.A00(r11)
        L_0x003f:
            if (r12 != 0) goto L_0x0030
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x005e
            X.76e r0 = r14.A00
            int r12 = r0.A00
            if (r12 <= 0) goto L_0x005e
            java.lang.Object[] r11 = r0.A01
            r2 = 0
        L_0x004e:
            r1 = r11[r2]
            X.6FE r1 = (X.AnonymousClass6FE) r1
            X.7la r0 = r14.A01
            X.AnonymousClass00C.A0B(r0)
            r1.A04(r13, r10, r0, r9)
            int r2 = r2 + 1
            if (r2 < r12) goto L_0x004e
        L_0x005e:
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x00d3
        L_0x0062:
            boolean r0 = r7 instanceof X.C161847nZ
            if (r0 == 0) goto L_0x0074
            X.7nZ r7 = (X.C161847nZ) r7
            X.5Rl r0 = X.C107935Rl.Main
            r7.Bcv(r6, r0, r3)
        L_0x006d:
            X.6gq r7 = X.AnonymousClass6VZ.A00(r5)
        L_0x0071:
            if (r7 == 0) goto L_0x00d3
            goto L_0x0062
        L_0x0074:
            int r0 = r7.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x006d
            boolean r0 = r7 instanceof X.C94114hf
            if (r0 == 0) goto L_0x006d
            r0 = r7
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x0084:
            if (r2 == 0) goto L_0x00a0
            int r0 = r2.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0091
            int r1 = r1 + 1
            if (r1 != r8) goto L_0x0094
            r7 = r2
        L_0x0091:
            X.6gq r2 = r2.A02
            goto L_0x0084
        L_0x0094:
            X.76e r5 = X.C90464aC.A0G(r5)
            X.6gq r7 = X.C90524aI.A0D(r5, r7)
            r5.A0D(r2)
            goto L_0x0091
        L_0x00a0:
            if (r1 != r8) goto L_0x006d
            goto L_0x0071
        L_0x00a3:
            int r0 = r12.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x003b
            boolean r0 = r12 instanceof X.C94114hf
            if (r0 == 0) goto L_0x003b
            r0 = r12
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x00b3:
            if (r2 == 0) goto L_0x00cf
            int r0 = r2.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x00c0
            int r1 = r1 + 1
            if (r1 != r8) goto L_0x00c3
            r12 = r2
        L_0x00c0:
            X.6gq r2 = r2.A02
            goto L_0x00b3
        L_0x00c3:
            X.76e r11 = X.C90464aC.A0G(r11)
            X.6gq r12 = X.C90524aI.A0D(r11, r12)
            r11.A0D(r2)
            goto L_0x00c0
        L_0x00cf:
            if (r1 != r8) goto L_0x003b
            goto L_0x003f
        L_0x00d3:
            r1 = 1
        L_0x00d4:
            return r1
        L_0x00d5:
            X.76e r0 = r15.A00
            int r4 = r0.A00
            r3 = 0
            if (r4 <= 0) goto L_0x00f6
            java.lang.Object[] r2 = r0.A01
            r1 = 0
        L_0x00df:
            r0 = r2[r1]
            X.6FE r0 = (X.AnonymousClass6FE) r0
            r5 = r18
            r6 = r16
            boolean r0 = r0.A04(r6, r10, r5, r9)
            if (r0 != 0) goto L_0x00f1
            r0 = r3
            r3 = 0
            if (r0 == 0) goto L_0x00f2
        L_0x00f1:
            r3 = 1
        L_0x00f2:
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x00df
        L_0x00f6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FE.A04(X.00i, X.61T, X.7la, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a0, code lost:
        if (r0 != false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(X.AnonymousClass61T r14) {
        /*
            r13 = this;
            r5 = r13
            boolean r0 = r13 instanceof X.C94684ic
            if (r0 == 0) goto L_0x008a
            X.4ic r5 = (X.C94684ic) r5
            X.00i r8 = r5.A05
            int r0 = r8.A00()
            if (r0 == 0) goto L_0x0088
            r7 = 1
            r6 = 0
            X.6gq r12 = r5.A06
            boolean r0 = r12.A08
            if (r0 == 0) goto L_0x0088
            X.5rt r11 = r5.A00
            X.AnonymousClass00C.A0B(r11)
            X.7la r0 = r5.A01
            X.AnonymousClass00C.A0B(r0)
            long r1 = r0.BHd()
            r10 = r12
            r9 = 0
        L_0x0027:
            boolean r0 = r10 instanceof X.C161847nZ
            if (r0 == 0) goto L_0x0059
            X.7nZ r10 = (X.C161847nZ) r10
            X.5Rl r0 = X.C107935Rl.Final
            r10.Bcv(r11, r0, r1)
        L_0x0032:
            X.6gq r10 = X.AnonymousClass6VZ.A00(r9)
        L_0x0036:
            if (r10 != 0) goto L_0x0027
            boolean r0 = r12.A08
            if (r0 == 0) goto L_0x004f
            X.76e r0 = r5.A00
            int r2 = r0.A00
            if (r2 <= 0) goto L_0x004f
            java.lang.Object[] r1 = r0.A01
        L_0x0044:
            r0 = r1[r6]
            X.6FE r0 = (X.AnonymousClass6FE) r0
            r0.A05(r14)
            int r6 = r6 + 1
            if (r6 < r2) goto L_0x0044
        L_0x004f:
            r5.A02(r14)
            r8.A07()
            r0 = 0
            r5.A01 = r0
            return r7
        L_0x0059:
            int r0 = r10.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0032
            boolean r0 = r10 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0032
            r0 = r10
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r4 = r0.A00
            r3 = 0
        L_0x0069:
            if (r4 == 0) goto L_0x0085
            int r0 = r4.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0076
            int r3 = r3 + 1
            if (r3 != r7) goto L_0x0079
            r10 = r4
        L_0x0076:
            X.6gq r4 = r4.A02
            goto L_0x0069
        L_0x0079:
            X.76e r9 = X.C90464aC.A0G(r9)
            X.6gq r10 = X.C90524aI.A0D(r9, r10)
            r9.A0D(r4)
            goto L_0x0076
        L_0x0085:
            if (r3 != r7) goto L_0x0032
            goto L_0x0036
        L_0x0088:
            r7 = 0
            goto L_0x004f
        L_0x008a:
            X.76e r0 = r13.A00
            int r4 = r0.A00
            r3 = 0
            if (r4 <= 0) goto L_0x00a7
            java.lang.Object[] r2 = r0.A01
            r1 = 0
        L_0x0094:
            r0 = r2[r1]
            X.6FE r0 = (X.AnonymousClass6FE) r0
            boolean r0 = r0.A05(r14)
            if (r0 != 0) goto L_0x00a2
            r0 = r3
            r3 = 0
            if (r0 == 0) goto L_0x00a3
        L_0x00a2:
            r3 = 1
        L_0x00a3:
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x0094
        L_0x00a7:
            r13.A02(r14)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FE.A05(X.61T):boolean");
    }

    public void A00() {
        if (this instanceof C94684ic) {
            C94684ic r4 = (C94684ic) this;
            C1506776e r0 = r4.A00;
            int i = r0.A00;
            if (i > 0) {
                Object[] objArr = r0.A01;
                int i2 = 0;
                do {
                    ((AnonymousClass6FE) objArr[i2]).A00();
                    i2++;
                } while (i2 < i);
            }
            C137856gq r42 = r4.A06;
            C1506776e r3 = null;
            while (r42 != null) {
                if (r42 instanceof C161847nZ) {
                    ((C161847nZ) r42).BT3();
                } else if ((r42.A01 & 16) != 0 && (r42 instanceof C94114hf)) {
                    int i3 = 0;
                    for (C137856gq r2 = ((C94114hf) r42).A00; r2 != null; r2 = r2.A02) {
                        if ((r2.A01 & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                r42 = r2;
                            } else {
                                r3 = C90464aC.A0G(r3);
                                r42 = C90524aI.A0D(r3, r42);
                                r3.A0D(r2);
                            }
                        }
                    }
                    if (i3 == 1) {
                    }
                }
                r42 = AnonymousClass6VZ.A00(r3);
            }
            return;
        }
        C1506776e r02 = this.A00;
        int i4 = r02.A00;
        if (i4 > 0) {
            int i5 = 0;
            Object[] objArr2 = r02.A01;
            do {
                ((AnonymousClass6FE) objArr2[i5]).A00();
                i5++;
            } while (i5 < i4);
        }
    }

    public void A02(AnonymousClass61T r4) {
        C1506776e r2 = this.A00;
        int i = r2.A00;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((C94684ic) r2.A01[i]).A07.A00 == 0) {
                r2.A04(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.C000700i r6, X.AnonymousClass61T r7, X.C160787la r8, boolean r9) {
        /*
            r5 = this;
            X.76e r0 = r5.A00
            int r4 = r0.A00
            r3 = 0
            if (r4 <= 0) goto L_0x001d
            java.lang.Object[] r2 = r0.A01
            r1 = 0
        L_0x000a:
            r0 = r2[r1]
            X.6FE r0 = (X.AnonymousClass6FE) r0
            boolean r0 = r0.A03(r6, r7, r8, r9)
            if (r0 != 0) goto L_0x0018
            r0 = r3
            r3 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r3 = 1
        L_0x0019:
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x000a
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FE.A03(X.00i, X.61T, X.7la, boolean):boolean");
    }
}
