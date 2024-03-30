package X;

/* renamed from: X.6XT  reason: invalid class name */
public abstract class AnonymousClass6XT {
    public static final boolean A04(C94214hq r3) {
        C109285Wz.A00(r3, new C152037Iy(r3));
        int A00 = C94214hq.A00(r3);
        if (A00 != 1 && A00 != 3) {
            return true;
        }
        r3.A0J(AnonymousClass5U8.Active);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x005c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0111 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A05(X.C94214hq r12, X.C94214hq r13) {
        /*
            r5 = 1024(0x400, float:1.435E-42)
            X.6gq r1 = r13.A03
            boolean r0 = r1.A08
            java.lang.String r11 = "visitAncestors called on an unattached node"
            if (r0 == 0) goto L_0x016d
            X.6gq r10 = r1.A04
            X.6gp r9 = X.AnonymousClass6VZ.A02(r13)
        L_0x0010:
            r4 = 0
            r3 = 1
            r6 = 0
            if (r9 == 0) goto L_0x006e
            int r0 = X.AnonymousClass6XQ.A00(r9, r5)
            if (r0 == 0) goto L_0x005f
        L_0x001b:
            if (r10 == 0) goto L_0x005f
            int r0 = r10.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x005c
            r8 = r10
            r7 = r4
        L_0x0024:
            boolean r0 = r8 instanceof X.C94214hq
            if (r0 != 0) goto L_0x006f
            int r0 = r8.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0052
            boolean r0 = r8 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0052
            r0 = r8
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x0037:
            if (r2 == 0) goto L_0x0057
            int r0 = r2.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0043
            int r1 = r1 + 1
            if (r1 != r3) goto L_0x0046
            r8 = r2
        L_0x0043:
            X.6gq r2 = r2.A02
            goto L_0x0037
        L_0x0046:
            X.76e r7 = X.C90464aC.A0G(r7)
            X.6gq r8 = X.C90524aI.A0D(r7, r8)
            r7.A0D(r2)
            goto L_0x0043
        L_0x0052:
            X.6gq r8 = X.AnonymousClass6VZ.A00(r7)
            goto L_0x0059
        L_0x0057:
            if (r1 != r3) goto L_0x0052
        L_0x0059:
            if (r8 == 0) goto L_0x005c
            goto L_0x0024
        L_0x005c:
            X.6gq r10 = r10.A04
            goto L_0x001b
        L_0x005f:
            X.6gp r9 = r9.A0A()
            if (r9 == 0) goto L_0x006c
            X.6XQ r0 = r9.A0R
            if (r0 == 0) goto L_0x006c
            X.6gq r10 = r0.A05
            goto L_0x0010
        L_0x006c:
            r10 = r4
            goto L_0x0010
        L_0x006e:
            r8 = r4
        L_0x006f:
            boolean r0 = X.AnonymousClass00C.A0J(r8, r12)
            if (r0 == 0) goto L_0x0166
            int r1 = X.C94214hq.A00(r12)
            if (r1 == r6) goto L_0x015c
            r0 = 2
            if (r1 == r0) goto L_0x015a
            if (r1 == r3) goto L_0x013d
            r0 = 3
            if (r1 != r0) goto L_0x0138
            X.6gq r1 = r12.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0133
            X.6gq r9 = r1.A04
            X.6gp r8 = X.AnonymousClass6VZ.A02(r12)
            if (r8 == 0) goto L_0x00a5
        L_0x0091:
            int r0 = X.AnonymousClass6XQ.A00(r8, r5)
            if (r0 == 0) goto L_0x0114
        L_0x0097:
            if (r9 == 0) goto L_0x0114
            int r0 = r9.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0111
            r7 = r9
            r6 = r4
        L_0x00a0:
            boolean r0 = r7 instanceof X.C94214hq
            if (r0 == 0) goto L_0x00dd
            r4 = r7
        L_0x00a5:
            X.4hq r4 = (X.C94214hq) r4
            if (r4 != 0) goto L_0x00c5
            X.4iy r0 = r12.A05
            if (r0 == 0) goto L_0x0125
            X.6gp r0 = r0.A0G
            if (r0 == 0) goto L_0x0125
            X.7mZ r0 = r0.A09
            if (r0 == 0) goto L_0x0125
            boolean r0 = r0.requestFocus()
            if (r0 == 0) goto L_0x015a
            X.5U8 r0 = X.AnonymousClass5U8.Active
            r12.A0J(r0)
            boolean r3 = A05(r12, r13)
        L_0x00c4:
            return r3
        L_0x00c5:
            boolean r0 = A05(r4, r12)
            if (r0 == 0) goto L_0x015a
            boolean r3 = A05(r12, r13)
            X.5U8 r1 = r12.A0G()
            X.5U8 r0 = X.AnonymousClass5U8.ActiveParent
            if (r1 != r0) goto L_0x012c
            if (r3 == 0) goto L_0x00c4
            X.AnonymousClass6QT.A02(r4)
            return r3
        L_0x00dd:
            int r0 = r7.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0107
            boolean r0 = r7 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0107
            r0 = r7
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x00ec:
            if (r2 == 0) goto L_0x010c
            int r0 = r2.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x00f8
            int r1 = r1 + 1
            if (r1 != r3) goto L_0x00fb
            r7 = r2
        L_0x00f8:
            X.6gq r2 = r2.A02
            goto L_0x00ec
        L_0x00fb:
            X.76e r6 = X.C90464aC.A0G(r6)
            X.6gq r7 = X.C90524aI.A0D(r6, r7)
            r6.A0D(r2)
            goto L_0x00f8
        L_0x0107:
            X.6gq r7 = X.AnonymousClass6VZ.A00(r6)
            goto L_0x010e
        L_0x010c:
            if (r1 != r3) goto L_0x0107
        L_0x010e:
            if (r7 == 0) goto L_0x0111
            goto L_0x00a0
        L_0x0111:
            X.6gq r9 = r9.A04
            goto L_0x0097
        L_0x0114:
            X.6gp r8 = r8.A0A()
            if (r8 == 0) goto L_0x00a5
            X.6XQ r0 = r8.A0R
            if (r0 == 0) goto L_0x0122
            X.6gq r9 = r0.A05
            goto L_0x0091
        L_0x0122:
            r9 = r4
            goto L_0x0091
        L_0x0125:
            java.lang.String r0 = "Owner not initialized."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x012c:
            java.lang.String r0 = "Deactivated node is focused"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0133:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r11)
            throw r0
        L_0x0138:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x013d:
            X.4hq r0 = X.AnonymousClass6U1.A01(r12)
            if (r0 == 0) goto L_0x0153
            X.4hq r0 = X.AnonymousClass6U1.A01(r12)
            if (r0 == 0) goto L_0x014f
            boolean r0 = A06(r0, r6, r3)
            if (r0 == 0) goto L_0x015a
        L_0x014f:
            A04(r13)
            return r3
        L_0x0153:
            java.lang.String r0 = "ActiveParent with no focused child"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x015a:
            r3 = 0
            return r3
        L_0x015c:
            boolean r3 = A04(r13)
            X.5U8 r0 = X.AnonymousClass5U8.ActiveParent
            r12.A0J(r0)
            return r3
        L_0x0166:
            java.lang.String r0 = "Non child node cannot request focus."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x016d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XT.A05(X.4hq, X.4hq):boolean");
    }

    public static final Integer A00(C94214hq r3, int i) {
        Integer num;
        int A00 = C94214hq.A00(r3);
        if (A00 != 0) {
            if (A00 == 2) {
                return C023109s.A01;
            }
            if (A00 == 1) {
                C94214hq A01 = AnonymousClass6U1.A01(r3);
                if (A01 != null) {
                    Integer A002 = A00(A01, i);
                    Integer num2 = C023109s.A00;
                    if (A002 != num2) {
                        return A002;
                    }
                    if (!r3.A02) {
                        r3.A02 = true;
                        try {
                            AnonymousClass6MR r1 = (AnonymousClass6MR) r3.A0F().A09.invoke(new C131226Of(i));
                            if (r1 != AnonymousClass6MR.A02) {
                                if (r1 == AnonymousClass6MR.A01) {
                                    num = C023109s.A01;
                                } else if (r1.A00()) {
                                    num = C023109s.A0C;
                                } else {
                                    num = C023109s.A0G;
                                }
                                return num;
                            }
                            r3.A02 = false;
                        } finally {
                            r3.A02 = false;
                        }
                    }
                    return num2;
                }
                throw AnonymousClass001.A08("ActiveParent with no focused child");
            } else if (A00 != 3) {
                throw C36441kJ.A18();
            }
        }
        return C023109s.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:99:0x0068 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A01(X.C94214hq r12, int r13) {
        /*
            int r0 = X.C94214hq.A00(r12)
            r5 = 1
            r2 = 0
            if (r0 == r2) goto L_0x00f9
            r8 = 2
            if (r0 == r8) goto L_0x00f9
            if (r0 == r5) goto L_0x00e7
            r7 = 3
            if (r0 != r7) goto L_0x00e2
            r9 = 1024(0x400, float:1.435E-42)
            X.6gq r1 = r12.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x00db
            X.6gq r10 = r1.A04
            X.6gp r6 = X.AnonymousClass6VZ.A02(r12)
        L_0x001e:
            r12 = 0
            if (r6 == 0) goto L_0x007a
            int r0 = X.AnonymousClass6XQ.A00(r6, r9)
            if (r0 == 0) goto L_0x006b
        L_0x0027:
            if (r10 == 0) goto L_0x006b
            int r0 = r10.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0068
            r3 = r10
            r11 = r12
        L_0x0030:
            boolean r0 = r3 instanceof X.C94214hq
            if (r0 != 0) goto L_0x007b
            int r0 = r3.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x005e
            boolean r0 = r3 instanceof X.C94114hf
            if (r0 == 0) goto L_0x005e
            r0 = r3
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r4 = r0.A00
            r1 = 0
        L_0x0043:
            if (r4 == 0) goto L_0x0063
            int r0 = r4.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x004f
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x0052
            r3 = r4
        L_0x004f:
            X.6gq r4 = r4.A02
            goto L_0x0043
        L_0x0052:
            X.76e r11 = X.C90464aC.A0F(r11)
            X.6gq r3 = X.C90524aI.A0D(r11, r3)
            r11.A0D(r4)
            goto L_0x004f
        L_0x005e:
            X.6gq r3 = X.AnonymousClass6VZ.A00(r11)
            goto L_0x0065
        L_0x0063:
            if (r1 != r5) goto L_0x005e
        L_0x0065:
            if (r3 == 0) goto L_0x0068
            goto L_0x0030
        L_0x0068:
            X.6gq r10 = r10.A04
            goto L_0x0027
        L_0x006b:
            X.6gp r6 = r6.A0A()
            if (r6 == 0) goto L_0x0078
            X.6XQ r0 = r6.A0R
            if (r0 == 0) goto L_0x0078
            X.6gq r10 = r0.A05
            goto L_0x001e
        L_0x0078:
            r10 = r12
            goto L_0x001e
        L_0x007a:
            r3 = r12
        L_0x007b:
            X.4hq r3 = (X.C94214hq) r3
            if (r3 == 0) goto L_0x00f9
            int r0 = X.C94214hq.A00(r3)
            if (r0 == r2) goto L_0x0095
            if (r0 == r8) goto L_0x00d8
            if (r0 == r5) goto L_0x00d3
            if (r0 != r7) goto L_0x00ce
            java.lang.Integer r1 = A01(r3, r13)
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 == r0) goto L_0x0095
            if (r1 != 0) goto L_0x00cd
        L_0x0095:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x00cb
            r3.A01 = r5
            X.6g0 r0 = r3.A0F()     // Catch:{ all -> 0x00c5 }
            X.02t r1 = r0.A08     // Catch:{ all -> 0x00c5 }
            X.6Of r0 = new X.6Of     // Catch:{ all -> 0x00c5 }
            r0.<init>(r13)     // Catch:{ all -> 0x00c5 }
            java.lang.Object r1 = r1.invoke(r0)     // Catch:{ all -> 0x00c5 }
            X.6MR r1 = (X.AnonymousClass6MR) r1     // Catch:{ all -> 0x00c5 }
            X.6MR r0 = X.AnonymousClass6MR.A02     // Catch:{ all -> 0x00c5 }
            if (r1 == r0) goto L_0x00c9
            X.6MR r0 = X.AnonymousClass6MR.A01     // Catch:{ all -> 0x00c5 }
            if (r1 != r0) goto L_0x00b7
            java.lang.Integer r1 = X.C023109s.A01     // Catch:{ all -> 0x00c5 }
            goto L_0x00c2
        L_0x00b7:
            boolean r0 = r1.A00()     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00c0
            java.lang.Integer r1 = X.C023109s.A0C     // Catch:{ all -> 0x00c5 }
            goto L_0x00c2
        L_0x00c0:
            java.lang.Integer r1 = X.C023109s.A0G     // Catch:{ all -> 0x00c5 }
        L_0x00c2:
            r3.A01 = r2
            return r1
        L_0x00c5:
            r0 = move-exception
            r3.A01 = r2
            throw r0
        L_0x00c9:
            r3.A01 = r2
        L_0x00cb:
            java.lang.Integer r1 = X.C023109s.A00
        L_0x00cd:
            return r1
        L_0x00ce:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x00d3:
            java.lang.Integer r1 = A01(r3, r13)
            return r1
        L_0x00d8:
            java.lang.Integer r1 = X.C023109s.A01
            return r1
        L_0x00db:
            java.lang.String r0 = "visitAncestors called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x00e2:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x00e7:
            X.4hq r0 = X.AnonymousClass6U1.A01(r12)
            if (r0 == 0) goto L_0x00f2
            java.lang.Integer r0 = A00(r0, r13)
            return r0
        L_0x00f2:
            java.lang.String r0 = "ActiveParent with no focused child"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x00f9:
            java.lang.Integer r0 = X.C023109s.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XT.A01(X.4hq, int):java.lang.Integer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b3, code lost:
        if (r0 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0095 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(X.C94214hq r11) {
        /*
            int r1 = X.C94214hq.A00(r11)
            r3 = 0
            r8 = 1
            if (r1 == r3) goto L_0x00b8
            r0 = 2
            if (r1 == r0) goto L_0x00b8
            r7 = 0
            if (r1 == r8) goto L_0x00a9
            r0 = 3
            if (r1 != r0) goto L_0x00c8
            r9 = 1024(0x400, float:1.435E-42)
            X.6gq r1 = r11.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x00c1
            X.6gq r10 = r1.A04
            X.6gp r6 = X.AnonymousClass6VZ.A02(r11)
            if (r6 == 0) goto L_0x0035
        L_0x0021:
            int r0 = X.AnonymousClass6XQ.A00(r6, r9)
            if (r0 == 0) goto L_0x0098
        L_0x0027:
            if (r10 == 0) goto L_0x0098
            int r0 = r10.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0095
            r5 = r7
            r4 = r10
        L_0x0030:
            boolean r0 = r4 instanceof X.C94214hq
            if (r0 == 0) goto L_0x0061
            r7 = r4
        L_0x0035:
            X.4hq r7 = (X.C94214hq) r7
            if (r7 == 0) goto L_0x0050
            X.5U8 r1 = r7.A0G()
            boolean r3 = A05(r7, r11)
            if (r3 == 0) goto L_0x004f
            X.5U8 r0 = r7.A0G()
            if (r1 == r0) goto L_0x004c
            X.AnonymousClass6QT.A02(r7)
        L_0x004c:
            X.AnonymousClass6QT.A02(r11)
        L_0x004f:
            return r3
        L_0x0050:
            X.4iy r0 = r11.A05
            if (r0 == 0) goto L_0x00ba
            X.6gp r0 = r0.A0G
            if (r0 == 0) goto L_0x00ba
            X.7mZ r0 = r0.A09
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r0.requestFocus()
            goto L_0x00b3
        L_0x0061:
            int r0 = r4.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x008b
            boolean r0 = r4 instanceof X.C94114hf
            if (r0 == 0) goto L_0x008b
            r0 = r4
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x0070:
            if (r2 == 0) goto L_0x0090
            int r0 = r2.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x007c
            int r1 = r1 + 1
            if (r1 != r8) goto L_0x007f
            r4 = r2
        L_0x007c:
            X.6gq r2 = r2.A02
            goto L_0x0070
        L_0x007f:
            X.76e r5 = X.C90464aC.A0F(r5)
            X.6gq r4 = X.C90524aI.A0D(r5, r4)
            r5.A0D(r2)
            goto L_0x007c
        L_0x008b:
            X.6gq r4 = X.AnonymousClass6VZ.A00(r5)
            goto L_0x0092
        L_0x0090:
            if (r1 != r8) goto L_0x008b
        L_0x0092:
            if (r4 == 0) goto L_0x0095
            goto L_0x0030
        L_0x0095:
            X.6gq r10 = r10.A04
            goto L_0x0027
        L_0x0098:
            X.6gp r6 = r6.A0A()
            if (r6 == 0) goto L_0x0035
            X.6XQ r0 = r6.A0R
            if (r0 == 0) goto L_0x00a6
            X.6gq r10 = r0.A05
            goto L_0x0021
        L_0x00a6:
            r10 = r7
            goto L_0x0021
        L_0x00a9:
            X.4hq r0 = X.AnonymousClass6U1.A01(r11)
            if (r0 == 0) goto L_0x00b5
            boolean r0 = A06(r0, r3, r8)
        L_0x00b3:
            if (r0 == 0) goto L_0x004f
        L_0x00b5:
            A04(r11)
        L_0x00b8:
            r3 = 1
            goto L_0x004c
        L_0x00ba:
            java.lang.String r0 = "Owner not initialized."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x00c1:
            java.lang.String r0 = "visitAncestors called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x00c8:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XT.A02(X.4hq):boolean");
    }

    public static final boolean A03(C94214hq r5) {
        AnonymousClass6S2 r4 = AnonymousClass6VZ.A01(r5).A05;
        try {
            if (r4.A00) {
                AnonymousClass6S2.A00(r4);
            }
            r4.A00 = true;
            int intValue = A01(r5, 7).intValue();
            boolean z = true;
            if (intValue == 0) {
                z = A02(r5);
            } else if (intValue != 2) {
                if (intValue == 1 || intValue == 3) {
                    z = false;
                } else {
                    throw C36441kJ.A18();
                }
            }
            return z;
        } finally {
            AnonymousClass6S2.A01(r4);
        }
    }

    public static final boolean A06(C94214hq r2, boolean z, boolean z2) {
        int A00 = C94214hq.A00(r2);
        if (A00 != 0) {
            if (A00 != 2) {
                if (A00 != 1) {
                    if (A00 != 3) {
                        throw C36441kJ.A18();
                    }
                    return true;
                }
                C94214hq A01 = AnonymousClass6U1.A01(r2);
                if (A01 != null && !A06(A01, z, z2)) {
                    return false;
                }
            } else if (!z) {
                return z;
            } else {
                r2.A0J(AnonymousClass5U8.Inactive);
                if (!z2) {
                    return z;
                }
                AnonymousClass6QT.A02(r2);
                return z;
            }
        }
        r2.A0J(AnonymousClass5U8.Inactive);
        if (z2) {
            AnonymousClass6QT.A02(r2);
        }
        return true;
    }
}
