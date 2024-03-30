package X;

public final class ABV implements C22938Ayo, C22942Ays, C17740rx {
    public final C20810yC A00;

    public ABV(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B24(X.C196159Xy r12, X.AnonymousClass3T1 r13) {
        /*
            r11 = this;
            X.C36321k7.A0w(r13, r12)
            boolean r0 = r13 instanceof X.AnonymousClass2bY
            if (r0 == 0) goto L_0x0099
            X.3Qa r10 = r13.A1J
            X.AnonymousClass00C.A07(r10)
            X.2bY r13 = (X.AnonymousClass2bY) r13
            int r9 = r13.A00
            long r0 = r13.A01
            long r4 = X.C36391kE.A0B(r0)
            int r8 = r13.A00
            int r7 = r13.A04
            java.lang.Boolean r6 = r13.A0d
            X.8NL r3 = r12.A00
            X.8NE r2 = X.C170918Hz.A0J(r3)
            X.8Hz r0 = r2.A00
            X.8SQ r0 = (X.AnonymousClass8SQ) r0
            X.8SW r0 = r0.key_
            if (r0 != 0) goto L_0x002c
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x002c:
            X.8NG r1 = X.C170918Hz.A0Q(r0)
            X.11F r0 = r10.A00
            X.AnonymousClass8NG.A01(r0, r1, r10)
            r2.A0V(r1)
            X.8SQ r1 = X.AnonymousClass8NN.A0A(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.ephemeralExpiration_ = r9
            X.8SQ r1 = X.AnonymousClass8NN.A0A(r2)
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.ephemeralSettingTimestamp_ = r4
            X.8SK r0 = X.AnonymousClass8SK.DEFAULT_INSTANCE
            X.8NN r1 = r0.A0p()
            X.8NB r1 = (X.AnonymousClass8NB) r1
            if (r8 == 0) goto L_0x0096
            r0 = 1
            if (r8 == r0) goto L_0x0093
            r0 = 2
            if (r8 != r0) goto L_0x0096
            X.90o r0 = X.C1887490o.INITIATED_BY_OTHER
        L_0x0062:
            r1.A0U(r0)
            X.919 r0 = X.AnonymousClass9Zc.A01(r7)
            r1.A0V(r0)
            if (r6 == 0) goto L_0x0075
            boolean r0 = r6.booleanValue()
            r1.A0W(r0)
        L_0x0075:
            X.8Hz r0 = r1.A0R()
            X.8SK r0 = (X.AnonymousClass8SK) r0
            X.8SQ r1 = X.AnonymousClass8NN.A0A(r2)
            r0.getClass()
            r1.disappearingMode_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            X.91G r0 = X.AnonymousClass91G.EPHEMERAL_SYNC_RESPONSE
            r2.A0U(r0)
            r3.A0c(r2)
            return
        L_0x0093:
            X.90o r0 = X.C1887490o.INITIATED_BY_ME
            goto L_0x0062
        L_0x0096:
            X.90o r0 = X.C1887490o.CHANGED_IN_CHAT
            goto L_0x0062
        L_0x0099:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageEphemeralSyncResponseProtobuf not supported message: "
            java.lang.IllegalArgumentException r0 = X.C165567td.A0N(r13, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ABV.B24(X.9Xy, X.3T1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        if (r1 == 2) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 BlH(X.AnonymousClass9YL r11) {
        /*
            r10 = this;
            X.8SX r1 = X.AnonymousClass9YL.A00(r11)
            boolean r0 = r1.A0y()
            if (r0 == 0) goto L_0x009d
            X.8SQ r0 = r1.protocolMessage_
            r4 = r0
            r1 = r0
            if (r0 != 0) goto L_0x0012
            X.8SQ r0 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x0012:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x009d
            if (r4 != 0) goto L_0x001c
            X.8SQ r1 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x001c:
            X.91G r1 = X.C170918Hz.A0K(r1)
            X.91G r0 = X.AnonymousClass91G.EPHEMERAL_SYNC_RESPONSE
            if (r1 != r0) goto L_0x009d
            r9 = 0
            if (r4 != 0) goto L_0x0029
            X.8SQ r4 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x0029:
            X.3Qa r2 = r11.A0C
            long r0 = r11.A04
            X.2bY r3 = new X.2bY
            r3.<init>(r2, r0)
            long r5 = r4.ephemeralSettingTimestamp_
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r0 = 2010(0x7da, float:2.817E-42)
            r2 = 1
            r1.set(r0, r2, r2)
            long r7 = r1.getTimeInMillis()
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0049
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
        L_0x0049:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r3.A15(r0)
            int r0 = r4.ephemeralExpiration_
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A1X(r0)
            X.8SK r0 = r4.disappearingMode_
            if (r0 != 0) goto L_0x005f
            X.8SK r0 = X.AnonymousClass8SK.DEFAULT_INSTANCE
        L_0x005f:
            X.90o r0 = r0.A0u()
            int r0 = r0.value
            r3.A00 = r0
            X.0yC r1 = r10.A00
            r0 = 5309(0x14bd, float:7.44E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x009c
            X.8SK r0 = r4.disappearingMode_
            if (r0 != 0) goto L_0x0077
            X.8SK r0 = X.AnonymousClass8SK.DEFAULT_INSTANCE
        L_0x0077:
            int r0 = r0.trigger_
            X.919 r0 = X.AnonymousClass919.A00(r0)
            if (r0 != 0) goto L_0x0081
            X.919 r0 = X.AnonymousClass919.UNKNOWN
        L_0x0081:
            int r1 = X.AnonymousClass9Zc.A00(r0)
            r3.A04 = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r3.A0d = r0
            if (r1 != 0) goto L_0x009c
            int r1 = r3.A00
            r0 = 2
            if (r1 == 0) goto L_0x009a
            if (r1 == r2) goto L_0x0099
            r2 = 0
            if (r1 != r0) goto L_0x009a
        L_0x0099:
            r2 = 2
        L_0x009a:
            r3.A04 = r2
        L_0x009c:
            return r3
        L_0x009d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ABV.BlH(X.9YL):X.3T1");
    }
}
