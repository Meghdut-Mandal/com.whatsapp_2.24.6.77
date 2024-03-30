package X;

/* renamed from: X.1Xw  reason: invalid class name and case insensitive filesystem */
public final class C29761Xw {
    public Long A00;
    public final C20810yC A01;
    public final C21010yW A02;
    public final C29741Xu A03;
    public final C29561Xc A04;
    public final C29771Xx A05 = new C29771Xx();
    public final AnonymousClass005 A06;
    public final AnonymousClass00T A07 = new AnonymousClass00U(new C29781Xy(this));

    public C29761Xw(C20810yC r3, C21010yW r4, C29741Xu r5, C29561Xc r6, AnonymousClass005 r7) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r7, 5);
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A06 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r3 == 11) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A01(java.lang.Integer r5) {
        /*
            r1 = 4
            r4 = 5
            if (r5 == 0) goto L_0x004b
            int r3 = r5.intValue()
            if (r3 == r4) goto L_0x0046
            r2 = 1
            if (r3 == r1) goto L_0x0016
            r0 = 10
            if (r3 == r0) goto L_0x0016
            r0 = 11
            r1 = 0
            if (r3 != r0) goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            r0 = 3
            if (r1 == 0) goto L_0x001f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x001f:
            r1 = 2
            if (r3 == r0) goto L_0x0046
            r0 = 13
            if (r3 != r0) goto L_0x002b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            return r0
        L_0x002b:
            r0 = 7
            if (r3 == r0) goto L_0x0041
            r0 = 9
            if (r3 == r0) goto L_0x0041
            r0 = 12
            if (r3 == r0) goto L_0x0041
            r0 = 6
            if (r3 == r0) goto L_0x0041
            if (r3 == r1) goto L_0x0041
            if (r3 == r2) goto L_0x0041
            r0 = 8
            if (r3 != r0) goto L_0x004b
        L_0x0041:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        L_0x0046:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x004b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29761Xw.A01(java.lang.Integer):java.lang.Integer");
    }

    public final void A03(AnonymousClass3T1 r5, String str, long j) {
        String str2 = str;
        boolean equals = str.equals("success");
        if (equals || str.equals("request")) {
            str2 = null;
        }
        int i = 12;
        switch (str.hashCode()) {
            case -1867169789:
                if (equals) {
                    i = 14;
                    break;
                }
                break;
            case 1095692943:
                if (str.equals("request")) {
                    i = 13;
                    break;
                }
                break;
        }
        A02(r5, this, Long.valueOf(j), str2, i);
    }

    public static final AnonymousClass2SV A00(C29761Xw r4) {
        AnonymousClass2SV r3 = new AnonymousClass2SV();
        if (r4.A00 == null) {
            C29741Xu r2 = r4.A03;
            if (r2.A00 == null) {
                r2.A00 = Long.valueOf(r2.A01.nextLong());
            }
        }
        Long l = r4.A03.A00;
        if (l == null) {
            l = r4.A00;
        }
        r3.A08 = l;
        r4.A00 = l;
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r3 == 1) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass3T1 r10, X.C29761Xw r11, java.lang.Long r12, java.lang.String r13, int r14) {
        /*
            X.3GP r0 = r10.A0c
            X.3XT r4 = r0.A01
            r1 = 0
            if (r4 == 0) goto L_0x00ac
            int r3 = r4.A00
            r2 = 1
            if (r3 == 0) goto L_0x00a6
            r0 = 1
            r2 = 3
            if (r3 == r0) goto L_0x00a6
            r2 = 2
            if (r3 == r2) goto L_0x00a6
            r8 = 0
        L_0x0014:
            boolean r7 = r4.A03
        L_0x0016:
            int r3 = r10.A1I
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r9 = 0
            r2 = 2
            if (r0 == 0) goto L_0x0032
            if (r3 == 0) goto L_0x002e
            r0 = 3
            r2 = 4
            if (r3 == r0) goto L_0x002e
            r0 = 13
            r2 = 5
            if (r3 == r0) goto L_0x002e
            r2 = 1
            if (r3 != r2) goto L_0x0032
        L_0x002e:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
        L_0x0032:
            X.1Xc r0 = r11.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x007b
            X.2SV r2 = A00(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r2.A03 = r0
            boolean r0 = r10 instanceof X.AnonymousClass2bO
            if (r0 == 0) goto L_0x0051
            r0 = r10
            X.2bO r0 = (X.AnonymousClass2bO) r0
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r0.A01
            if (r0 != 0) goto L_0x0055
        L_0x0051:
            X.3Qa r0 = r10.A1J
            java.lang.String r0 = r0.A01
        L_0x0055:
            r2.A09 = r0
            int r0 = r10.A09
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = A01(r0)
            r2.A02 = r0
            r2.A01 = r9
            r2.A0A = r13
            r2.A05 = r12
            int r0 = r10.A0B
            if (r0 == 0) goto L_0x0072
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0072:
            r2.A06 = r1
            r2.A04 = r8
            X.0yW r0 = r11.A02
            r0.Blw(r2)
        L_0x007b:
            X.00T r0 = r11.A07
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x011b
            X.005 r0 = r11.A06
            java.lang.Object r5 = r0.get()
            X.64q r5 = (X.C1265964q) r5
            X.3Qa r0 = r10.A1J
            java.lang.String r1 = r0.A01
            X.AnonymousClass00C.A07(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            java.lang.Long r0 = r5.A00
            if (r0 == 0) goto L_0x011b
            long r2 = r0.longValue()
            r4 = 0
            goto L_0x00b0
        L_0x00a6:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            goto L_0x0014
        L_0x00ac:
            r8 = r1
            r7 = 0
            goto L_0x0016
        L_0x00b0:
            X.1UP r6 = r5.A01     // Catch:{ IllegalArgumentException -> 0x0111 }
            java.lang.String r0 = "status_id"
            r6.flowAnnotate((long) r2, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x0111 }
            if (r9 == 0) goto L_0x00c4
            java.lang.String r1 = r9.toString()     // Catch:{ IllegalArgumentException -> 0x0111 }
            if (r1 == 0) goto L_0x00c4
            java.lang.String r0 = "content_type"
            r6.flowAnnotate((long) r2, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x0111 }
        L_0x00c4:
            if (r10 == 0) goto L_0x00cf
            java.lang.String r0 = r10.toString()     // Catch:{ IllegalArgumentException -> 0x0111 }
            if (r0 == 0) goto L_0x00cf
            r6.flowMarkPoint(r2, r0)     // Catch:{ IllegalArgumentException -> 0x0111 }
        L_0x00cf:
            java.lang.String r9 = "is_fb_auto_crossposting_enabled_end"
            X.1UM r1 = r5.A02     // Catch:{ IllegalArgumentException -> 0x0111 }
            X.1US r0 = X.AnonymousClass1US.STATUS_LOGGING     // Catch:{ IllegalArgumentException -> 0x0111 }
            java.lang.Boolean r1 = r1.A01(r0)     // Catch:{ IllegalArgumentException -> 0x0111 }
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0111 }
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0111 }
            r6.flowAnnotate((long) r2, (java.lang.String) r9, (boolean) r0)     // Catch:{ IllegalArgumentException -> 0x0111 }
            if (r8 == 0) goto L_0x00f2
            java.lang.String r1 = r8.toString()     // Catch:{ IllegalArgumentException -> 0x0111 }
            if (r1 == 0) goto L_0x00f2
            java.lang.String r0 = "status_privacy_type"
            r6.flowAnnotate((long) r2, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x0111 }
        L_0x00f2:
            java.lang.String r0 = "is_fb_crosspost"
            r6.flowAnnotate((long) r2, (java.lang.String) r0, (boolean) r7)     // Catch:{ IllegalArgumentException -> 0x0111 }
            r0 = 14
            if (r10 == 0) goto L_0x011b
            int r1 = r10.intValue()     // Catch:{ IllegalArgumentException -> 0x0111 }
            if (r1 != r0) goto L_0x0107
            r6.flowEndSuccess(r2)     // Catch:{ IllegalArgumentException -> 0x0111 }
            r5.A00 = r4     // Catch:{ IllegalArgumentException -> 0x0111 }
            return
        L_0x0107:
            r0 = 12
            if (r1 != r0) goto L_0x011b
            r6.flowEndFail(r2, r13, r4)     // Catch:{ IllegalArgumentException -> 0x0111 }
            r5.A00 = r4     // Catch:{ IllegalArgumentException -> 0x0111 }
            return
        L_0x0111:
            r0 = move-exception
            X.1UP r1 = r5.A01
            java.lang.String r0 = r0.getMessage()
            r1.flowEndFail(r2, r0, r4)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29761Xw.A02(X.3T1, X.1Xw, java.lang.Long, java.lang.String, int):void");
    }
}
