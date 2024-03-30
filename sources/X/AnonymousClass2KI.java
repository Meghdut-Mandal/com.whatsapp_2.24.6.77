package X;

import android.app.Activity;

/* renamed from: X.2KI  reason: invalid class name */
public final class AnonymousClass2KI extends C196209Yd {
    public final C25791Hr A00;
    public final C25121Fb A01;
    public final C194729Qz A02;
    public final AnonymousClass00T A03;
    public final AnonymousClass00T A04;
    public final AnonymousClass3CV A05;

    public String A05() {
        return "cta_catalog";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r1 == 0) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A06(android.content.Context r6, X.C206969uL r7) {
        /*
            r5 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            if (r7 == 0) goto L_0x000c
            java.lang.String r0 = r7.A01
        L_0x0008:
            r4 = 0
            if (r0 == 0) goto L_0x0029
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x0008
        L_0x000e:
            org.json.JSONObject r1 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x0019 }
            java.lang.String r0 = "catalog_product_id"
            java.lang.String r4 = r1.getString(r0)     // Catch:{ JSONException -> 0x0019 }
            goto L_0x0029
        L_0x0019:
            X.00T r0 = r5.A03
            java.lang.Object r3 = r0.getValue()
            X.0wN r3 = (X.C19700wN) r3
            r2 = 0
            java.lang.String r1 = "CatalogCtaAction/extractProductId"
            java.lang.String r0 = "malformed json"
            r3.A0E(r1, r0, r2)
        L_0x0029:
            if (r4 == 0) goto L_0x0034
            int r1 = r4.length()
            r0 = 2131895671(0x7f122577, float:1.9426182E38)
            if (r1 != 0) goto L_0x0037
        L_0x0034:
            r0 = 2131895670(0x7f122576, float:1.942618E38)
        L_0x0037:
            java.lang.String r0 = r6.getString(r0)
            X.AnonymousClass00C.A0B(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2KI.A06(android.content.Context, X.9uL):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cb, code lost:
        if (r5.length() == 0) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r3.length() != 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.app.Activity r14, X.AnonymousClass3T1 r15, X.C206969uL r16, int r17) {
        /*
            r13 = this;
            r4 = 0
            r10 = r15
            r0 = r16
            X.C36321k7.A16(r14, r15, r0, r4)
            java.lang.String r7 = r0.A01
            java.lang.String r2 = "CatalogCtaAction/extractBizPhone"
            r6 = 0
            r8 = r13
            if (r7 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r3 = r6
            goto L_0x0024
        L_0x0012:
            org.json.JSONObject r1 = X.C36441kJ.A1C(r7)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r0 = "business_phone_number"
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x0033 }
            if (r3 == 0) goto L_0x0024
            int r0 = r3.length()     // Catch:{ JSONException -> 0x0033 }
            if (r0 != 0) goto L_0x0031
        L_0x0024:
            X.00T r0 = r13.A03     // Catch:{ JSONException -> 0x0033 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ JSONException -> 0x0033 }
            X.0wN r1 = (X.C19700wN) r1     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r0 = "malformed phone number"
            r1.A0E(r2, r0, r4)     // Catch:{ JSONException -> 0x0033 }
        L_0x0031:
            r6 = r3
            goto L_0x0040
        L_0x0033:
            X.00T r0 = r13.A03
            java.lang.Object r1 = r0.getValue()
            X.0wN r1 = (X.C19700wN) r1
            java.lang.String r0 = "malformed json"
            r1.A0E(r2, r0, r4)
        L_0x0040:
            r5 = 0
            if (r7 == 0) goto L_0x005d
            org.json.JSONObject r1 = X.C36441kJ.A1C(r7)     // Catch:{ JSONException -> 0x004e }
            java.lang.String r0 = "catalog_product_id"
            java.lang.String r5 = r1.getString(r0)     // Catch:{ JSONException -> 0x004e }
            goto L_0x005d
        L_0x004e:
            X.00T r0 = r13.A03
            java.lang.Object r2 = r0.getValue()
            X.0wN r2 = (X.C19700wN) r2
            java.lang.String r1 = "CatalogCtaAction/extractProductId"
            java.lang.String r0 = "malformed json"
            r2.A0E(r1, r0, r4)
        L_0x005d:
            r3 = 0
            if (r7 == 0) goto L_0x007a
            org.json.JSONObject r1 = X.C36441kJ.A1C(r7)     // Catch:{ JSONException -> 0x006b }
            java.lang.String r0 = "message_origin"
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x006b }
            goto L_0x007a
        L_0x006b:
            X.00T r0 = r13.A03
            java.lang.Object r2 = r0.getValue()
            X.0wN r2 = (X.C19700wN) r2
            java.lang.String r1 = "CatalogCtaAction/extractMessageSource"
            java.lang.String r0 = "malformed json"
            r2.A0E(r1, r0, r4)
        L_0x007a:
            if (r6 == 0) goto L_0x0114
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0114
            if (r5 == 0) goto L_0x010a
            int r0 = r5.length()
            if (r0 == 0) goto L_0x010a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "/p/"
            r1.append(r0)
            r1.append(r5)
            r0 = 47
            r1.append(r0)
        L_0x009b:
            java.lang.String r0 = X.AnonymousClass000.A0q(r6, r1)
            X.3N4 r0 = X.AnonymousClass3N4.A00(r0)
            android.net.Uri r0 = r0.A00
            java.lang.String r0 = r0.toString()
            android.net.Uri r2 = android.net.Uri.parse(r0)
            X.00T r0 = r13.A04
            java.lang.Object r1 = r0.getValue()
            X.1e2 r1 = (X.C32691e2) r1
            r0 = 0
            r1.Bp7(r14, r2, r0)
        L_0x00b9:
            r1 = 4194304(0x400000, float:5.877472E-39)
            int r0 = r15.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x00ea
            if (r5 == 0) goto L_0x00cd
            int r0 = r5.length()
            r11 = 4
            if (r0 != 0) goto L_0x00ce
        L_0x00cd:
            r11 = 3
        L_0x00ce:
            X.1Fb r2 = r13.A01
            r0 = 2
            X.1Fa[] r1 = new X.C25111Fa[r0]
            X.1Fa r0 = X.C25111Fa.SKIP_ADDONS
            r1[r4] = r0
            X.1Fa r0 = X.C25111Fa.SKIP_THUMBNAILS
            r12 = 1
            r1[r12] = r0
            X.3IP r0 = X.AnonymousClass3IP.A00(r1)
            X.3wn r7 = new X.3wn
            r9 = r17
            r7.<init>((java.lang.Object) r8, (int) r9, (java.lang.Object) r10, (int) r11, (int) r12)
            r2.A01(r0, r15, r7)
        L_0x00ea:
            com.whatsapp.jid.UserJid r2 = r15.A0L()
            if (r2 == 0) goto L_0x00f6
            X.1Hr r1 = r13.A00
            r0 = 4
            r1.A01(r2, r15, r0)
        L_0x00f6:
            java.lang.String r0 = "ctwa_auto_reply"
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0109
            X.3CV r2 = r13.A05
            com.whatsapp.jid.UserJid r1 = r15.A0L()
            java.lang.String r0 = "cta_catalog"
            r2.A00(r1, r0)
        L_0x0109:
            return
        L_0x010a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "c/"
            r1.append(r0)
            goto L_0x009b
        L_0x0114:
            X.00T r0 = r13.A03
            java.lang.Object r2 = r0.getValue()
            X.0wN r2 = (X.C19700wN) r2
            java.lang.String r1 = "CatalogCtaAction/execute"
            java.lang.String r0 = "malformed phone passed through"
            r2.A0E(r1, r0, r4)
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2KI.A08(android.app.Activity, X.3T1, X.9uL, int):void");
    }

    public boolean A0B(C20810yC r2, AnonymousClass8SX r3) {
        AnonymousClass00C.A0D(r2, 1);
        return !r2.A0E(4957);
    }

    public boolean A0C(C20810yC r2, AnonymousClass8SX r3) {
        AnonymousClass00C.A0D(r2, 1);
        return !r2.A0E(4957);
    }

    public void A09(Activity activity, AnonymousClass3T1 r3, C206969uL r4, Class cls) {
        throw new UnsupportedOperationException();
    }

    public AnonymousClass2KI(C25791Hr r3, AnonymousClass3CV r4, C25121Fb r5, C194729Qz r6, AnonymousClass005 r7, AnonymousClass005 r8) {
        C36321k7.A11(r7, r8, r5);
        AnonymousClass00C.A0D(r3, 5);
        this.A01 = r5;
        this.A02 = r6;
        this.A00 = r3;
        this.A05 = r4;
        this.A03 = C36431kI.A1I(new C53082qk(r7, 10));
        this.A04 = C36431kI.A1I(new C53082qk(r8, 11));
    }
}
