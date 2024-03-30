package X;

/* renamed from: X.8a0  reason: invalid class name and case insensitive filesystem */
public final class C175198a0 extends C196209Yd {
    public final AnonymousClass00T A00;
    public final AnonymousClass00T A01;
    public final AnonymousClass00T A02;
    public final AnonymousClass00T A03;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (X.AnonymousClass098.A06(r3) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.C175198a0 r6, java.lang.String r7) {
        /*
            java.lang.String r4 = "ViewCatalogAction/extractBizPhone"
            r5 = 0
            if (r7 == 0) goto L_0x0010
            org.json.JSONObject r1 = X.C36441kJ.A1C(r7)     // Catch:{ JSONException -> 0x002c }
            java.lang.String r0 = "business_phone_number"
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x002c }
            goto L_0x0011
        L_0x0010:
            r3 = r5
        L_0x0011:
            r2 = 0
            if (r3 == 0) goto L_0x001b
            boolean r1 = X.AnonymousClass098.A06(r3)     // Catch:{ JSONException -> 0x002c }
            r0 = 0
            if (r1 == 0) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x003b
            X.00T r0 = r6.A01     // Catch:{ JSONException -> 0x002c }
            java.lang.Object r1 = r0.getValue()     // Catch:{ JSONException -> 0x002c }
            X.0wN r1 = (X.C19700wN) r1     // Catch:{ JSONException -> 0x002c }
            java.lang.String r0 = "business_phone_number in params json is either null or incorrect phone number"
            r1.A0E(r4, r0, r2)     // Catch:{ JSONException -> 0x002c }
            return r3
        L_0x002c:
            r2 = move-exception
            X.00T r0 = r6.A01
            java.lang.Object r1 = r0.getValue()
            X.0wN r1 = (X.C19700wN) r1
            java.lang.String r0 = "action param is invalid json"
            r1.A0D(r4, r0, r2)
            return r5
        L_0x003b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175198a0.A00(X.8a0, java.lang.String):java.lang.String");
    }

    public C175198a0(AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5) {
        C36321k7.A18(r2, r3, r4, r5);
        this.A02 = C196209Yd.A02(r2, 8);
        this.A01 = C196209Yd.A02(r3, 7);
        this.A00 = C196209Yd.A02(r4, 6);
        this.A03 = C196209Yd.A02(r5, 9);
    }
}
