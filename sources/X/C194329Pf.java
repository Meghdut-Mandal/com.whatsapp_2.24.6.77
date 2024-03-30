package X;

/* renamed from: X.9Pf  reason: invalid class name and case insensitive filesystem */
public final class C194329Pf {
    public C176428c6 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010c, code lost:
        if (r3 > Float.MAX_VALUE) goto L_0x010e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.app.Activity r11, X.AnonymousClass9V8 r12, X.C21010yW r13) {
        /*
            r10 = this;
            r0 = 1
            int r3 = X.C36361kB.A04(r13, r11, r0)
            X.8c6 r1 = new X.8c6
            r1.<init>()
            X.B5N r8 = X.AnonymousClass96Z.A00(r12)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            if (r8 == 0) goto L_0x0068
            X.9xj r8 = (X.C208149xj) r8
            X.9dq r7 = r8.A01
            X.9dq r0 = X.C198599dq.A01
            boolean r4 = X.AnonymousClass00C.A0J(r7, r0)
            r0 = r9
            if (r4 == 0) goto L_0x0026
            r0 = r2
        L_0x0026:
            r1.A04 = r0
            X.1R6 r6 = r8.A00
            int r5 = r6.A02
            int r0 = r6.A01
            int r5 = r5 - r0
            int r4 = r6.A00
            int r0 = r6.A03
            int r4 = r4 - r0
            if (r5 <= r4) goto L_0x0110
            X.9dp r6 = X.C198589dp.A01
        L_0x0038:
            X.9dp r5 = X.C198589dp.A01
            boolean r4 = X.AnonymousClass00C.A0J(r6, r5)
            r0 = r9
            if (r4 == 0) goto L_0x0042
            r0 = r2
        L_0x0042:
            r1.A03 = r0
            X.9dr r4 = r8.A02
            X.9dr r0 = X.C198609dr.A02
            boolean r0 = X.AnonymousClass00C.A0J(r4, r0)
            if (r0 != 0) goto L_0x005e
            X.9dr r0 = X.C198609dr.A01
            boolean r0 = X.AnonymousClass00C.A0J(r4, r0)
            if (r0 == 0) goto L_0x0068
            X.9dq r0 = X.C198599dq.A02
            boolean r0 = X.AnonymousClass00C.A0J(r7, r0)
            if (r0 == 0) goto L_0x0068
        L_0x005e:
            boolean r4 = X.AnonymousClass00C.A0J(r6, r5)
            r0 = r9
            if (r4 == 0) goto L_0x0066
            r0 = r2
        L_0x0066:
            r1.A02 = r0
        L_0x0068:
            boolean r0 = X.C19550w8.A02()
            if (r0 == 0) goto L_0x0078
            boolean r0 = r11.isInMultiWindowMode()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
        L_0x0078:
            android.content.res.Configuration r0 = X.AnonymousClass000.A0U(r11)
            int r0 = r0.orientation
            if (r0 == r3) goto L_0x0081
            r2 = r9
        L_0x0081:
            r1.A05 = r2
            android.content.Context r0 = r11.getApplicationContext()
            X.AnonymousClass00C.A08(r0)
            X.1Lw r0 = X.C25961Ii.A02(r0)
            if (r0 == 0) goto L_0x00a9
            int r2 = r0.A01
            int r0 = r0.A02
            float r3 = (float) r0
            float r0 = (float) r2
            float r3 = r3 / r0
            r2 = 1
            r0 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00ff
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00ff
        L_0x00a3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A01 = r0
        L_0x00a9:
            X.8c6 r4 = r10.A00
            r3 = 0
            java.lang.Integer r2 = r1.A02
            if (r4 == 0) goto L_0x00fd
            java.lang.Integer r0 = r4.A02
        L_0x00b2:
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0114
            java.lang.Integer r2 = r1.A05
            if (r4 == 0) goto L_0x00fb
            java.lang.Integer r0 = r4.A05
        L_0x00be:
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0114
            java.lang.Integer r2 = r1.A01
            if (r4 == 0) goto L_0x00f9
            java.lang.Integer r0 = r4.A01
        L_0x00ca:
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0114
            java.lang.Integer r2 = r1.A03
            if (r4 == 0) goto L_0x00f7
            java.lang.Integer r0 = r4.A03
        L_0x00d6:
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0114
            java.lang.Integer r2 = r1.A04
            if (r4 == 0) goto L_0x00f5
            java.lang.Integer r0 = r4.A04
        L_0x00e2:
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0114
            java.lang.Boolean r0 = r1.A00
            if (r4 == 0) goto L_0x00ee
            java.lang.Boolean r3 = r4.A00
        L_0x00ee:
            boolean r0 = X.AnonymousClass00C.A0J(r0, r3)
            if (r0 == 0) goto L_0x0114
            return
        L_0x00f5:
            r0 = r3
            goto L_0x00e2
        L_0x00f7:
            r0 = r3
            goto L_0x00d6
        L_0x00f9:
            r0 = r3
            goto L_0x00ca
        L_0x00fb:
            r0 = r3
            goto L_0x00be
        L_0x00fd:
            r0 = r3
            goto L_0x00b2
        L_0x00ff:
            r0 = 1068121457(0x3faa3d71, float:1.33)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x010e
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r2 = 3
            if (r0 <= 0) goto L_0x00a3
        L_0x010e:
            r2 = 2
            goto L_0x00a3
        L_0x0110:
            X.9dp r6 = X.C198589dp.A02
            goto L_0x0038
        L_0x0114:
            r10.A00 = r1
            r13.Bly(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194329Pf.A00(android.app.Activity, X.9V8, X.0yW):void");
    }
}
