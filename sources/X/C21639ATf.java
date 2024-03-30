package X;

/* renamed from: X.ATf  reason: case insensitive filesystem */
public final class C21639ATf implements B0B {
    public final C202109l3 A00;
    public final C19970wo A01;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r3 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        switch(r3.hashCode()) {
            case -1806407742: goto L_0x0080;
            case -526668609: goto L_0x009a;
            case 851903629: goto L_0x00ae;
            case 1832379851: goto L_0x00c0;
            default: goto L_0x007f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r3.equals("SECONDS_SINCE_LESS_THAN") == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        r2 = ((java.lang.System.currentTimeMillis() - r9.A00.A04(r1, r2)) > (r7 * ((long) 1000)) ? 1 : ((java.lang.System.currentTimeMillis() - r9.A00.A04(r1, r2)) == (r7 * ((long) 1000)) ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
        if (r3.equals("COUNT_AT_MOST") == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        r2 = (((long) r9.A00.A03(r1, r2)) > r7 ? 1 : (((long) r9.A00.A03(r1, r2)) == r7 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ab, code lost:
        if (r2 > 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        if (r3.equals("COUNT_AT_LEAST") == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        r0 = (((long) r9.A00.A03(r1, r2)) > r7 ? 1 : (((long) r9.A00.A03(r1, r2)) == r7 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c6, code lost:
        if (r3.equals("SECONDS_SINCE_GREATER_THAN") == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c8, code lost:
        r0 = ((java.lang.System.currentTimeMillis() - r9.A00.A04(r1, r2)) > (r7 * ((long) 1000)) ? 1 : ((java.lang.System.currentTimeMillis() - r9.A00.A04(r1, r2)) == (r7 * ((long) 1000)) ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d9, code lost:
        if (r0 < 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean B1C(X.C193229Kn r10, X.C16540pP r11, X.C87374On r12) {
        /*
            r9 = this;
            r0 = 1
            X.AnonymousClass00C.A0D(r10, r0)
            java.util.Map r5 = r10.A01
            java.lang.String r0 = "promo_id"
            java.lang.Object r2 = r5.get(r0)
            if (r2 == 0) goto L_0x00e2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "event_count"
            java.lang.String r0 = X.C36431kI.A1A(r0, r5)
            if (r0 == 0) goto L_0x0048
            long r7 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = "event"
            java.lang.String r1 = X.C36431kI.A1A(r0, r5)
            r3 = 0
            if (r1 == 0) goto L_0x00dd
            java.util.Locale r0 = java.util.Locale.US
            X.AnonymousClass00C.A09(r0)
            java.lang.String r4 = X.C165607th.A0v(r0, r1)
        L_0x002e:
            java.lang.String r0 = "metric"
            java.lang.String r1 = X.C36431kI.A1A(r0, r5)
            if (r1 == 0) goto L_0x003f
            java.util.Locale r0 = java.util.Locale.US
            X.AnonymousClass00C.A09(r0)
            java.lang.String r3 = X.C165607th.A0v(r0, r1)
        L_0x003f:
            if (r4 == 0) goto L_0x0048
            int r0 = r4.hashCode()
            switch(r0) {
                case -1413131469: goto L_0x004b;
                case -1395292287: goto L_0x0056;
                case -956430933: goto L_0x0061;
                case 605715977: goto L_0x006c;
                default: goto L_0x0048;
            }
        L_0x0048:
            boolean r0 = r10.A02
            return r0
        L_0x004b:
            java.lang.String r0 = "PRIMARY_ACTION"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0048
            X.8zX r1 = X.C188408zX.PRIMARY_ACTION
            goto L_0x0076
        L_0x0056:
            java.lang.String r0 = "SECONDARY_ACTION"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0048
            X.8zX r1 = X.C188408zX.SECONDARY_ACTION
            goto L_0x0076
        L_0x0061:
            java.lang.String r0 = "DISMISS_ACTION"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0048
            X.8zX r1 = X.C188408zX.DISMISS_ACTION
            goto L_0x0076
        L_0x006c:
            java.lang.String r0 = "IMPRESSION"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0048
            X.8zX r1 = X.C188408zX.IMPRESSION
        L_0x0076:
            if (r3 == 0) goto L_0x0048
            int r0 = r3.hashCode()
            switch(r0) {
                case -1806407742: goto L_0x0080;
                case -526668609: goto L_0x009a;
                case 851903629: goto L_0x00ae;
                case 1832379851: goto L_0x00c0;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x0048
        L_0x0080:
            java.lang.String r0 = "SECONDS_SINCE_LESS_THAN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0048
            X.9l3 r0 = r9.A00
            long r5 = r0.A04(r1, r2)
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r7 = r7 * r0
            long r3 = r3 - r5
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            goto L_0x00ab
        L_0x009a:
            java.lang.String r0 = "COUNT_AT_MOST"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0048
            X.9l3 r0 = r9.A00
            int r0 = r0.A03(r1, r2)
            long r0 = (long) r0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
        L_0x00ab:
            if (r2 > 0) goto L_0x00e0
            goto L_0x00db
        L_0x00ae:
            java.lang.String r0 = "COUNT_AT_LEAST"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0048
            X.9l3 r0 = r9.A00
            int r0 = r0.A03(r1, r2)
            long r1 = (long) r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            goto L_0x00d9
        L_0x00c0:
            java.lang.String r0 = "SECONDS_SINCE_GREATER_THAN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0048
            X.9l3 r0 = r9.A00
            long r4 = r0.A04(r1, r2)
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r7 = r7 * r0
            long r2 = r2 - r4
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
        L_0x00d9:
            if (r0 < 0) goto L_0x00e0
        L_0x00db:
            r0 = 1
            return r0
        L_0x00dd:
            r4 = r3
            goto L_0x002e
        L_0x00e0:
            r0 = 0
            return r0
        L_0x00e2:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21639ATf.B1C(X.9Kn, X.0pP, X.4On):boolean");
    }

    public C21639ATf(C19970wo r1, C202109l3 r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
