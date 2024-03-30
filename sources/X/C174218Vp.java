package X;

/* renamed from: X.8Vp  reason: invalid class name and case insensitive filesystem */
public final class C174218Vp extends ACQ {
    public final AnonymousClass9E4 A00;
    public final C22944Ayu A01;
    public final C22944Ayu A02;
    public final AnonymousClass00T A03;
    public final AnonymousClass9E5 A04;
    public final AnonymousClass9E6 A05;
    public final AnonymousClass964 A06;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.9tx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: X.9tx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: X.9te} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.9tx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: X.9tx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: X.9te} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: X.9te} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: X.9tx} */
    /* JADX WARNING: type inference failed for: r1v36, types: [X.9te] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A02(org.json.JSONObject r39, long r40) {
        /*
            r38 = this;
            java.lang.String r3 = "id"
            java.lang.String r2 = "name"
            java.lang.String r4 = "media"
            java.lang.String[] r1 = new java.lang.String[]{r3, r2, r4}
            r0 = r39
            boolean r1 = X.AnonymousClass9ZU.A03(r0, r1)
            r14 = 0
            if (r1 == 0) goto L_0x01bd
            java.lang.String r18 = X.AnonymousClass9ZU.A00(r3, r0)
            X.C18740tg.A06(r18)
            java.lang.String r19 = X.AnonymousClass9ZU.A00(r2, r0)
            X.C18740tg.A06(r19)
            java.lang.String r1 = "description"
            java.lang.String r20 = X.AnonymousClass9ZU.A00(r1, r0)
            java.lang.String r2 = "currency"
            boolean r1 = r0.has(r2)
            if (r1 == 0) goto L_0x00c6
            java.lang.String r3 = X.AnonymousClass9ZU.A00(r2, r0)
            if (r3 == 0) goto L_0x00c6
            int r2 = r3.length()
            r1 = 3
            if (r2 != r1) goto L_0x00c6
            X.6Tk r2 = new X.6Tk
            r2.<init>(r3)
        L_0x0041:
            java.lang.String r3 = "price"
            boolean r1 = r0.has(r3)
            if (r1 == 0) goto L_0x00c4
            java.lang.String r1 = X.AnonymousClass9ZU.A00(r3, r0)
            if (r1 == 0) goto L_0x00c4
            java.lang.String r1 = X.AnonymousClass9ZU.A00(r3, r0)
        L_0x0053:
            r10 = r38
            java.math.BigDecimal r24 = r10.A03(r2, r1)
            java.lang.String r1 = "sale_price"
            org.json.JSONObject r5 = r0.optJSONObject(r1)
            r8 = r40
            if (r2 == 0) goto L_0x00c2
            if (r5 == 0) goto L_0x00c2
            X.9ZL r3 = new X.9ZL
            r3.<init>()
            X.8Vm r1 = new X.8Vm
            r1.<init>(r3, r2)
            java.lang.Object r15 = r1.B3d(r5, r8)
            X.6bV r15 = (X.C134726bV) r15
        L_0x0075:
            java.lang.String r1 = "url"
            java.lang.String r21 = X.AnonymousClass9ZU.A00(r1, r0)
            java.lang.String r1 = "retailer_id"
            java.lang.String r22 = X.AnonymousClass9ZU.A00(r1, r0)
            org.json.JSONObject r1 = r0.optJSONObject(r4)
            java.lang.String r3 = "status_info"
            org.json.JSONObject r5 = r0.optJSONObject(r3)
            r3 = 99
            java.lang.String r6 = "max_available"
            long r27 = r0.optLong(r6, r3)
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            if (r1 == 0) goto L_0x00c9
            java.lang.String r3 = "images"
            boolean r4 = X.AnonymousClass9ZU.A01(r3, r1)
            if (r4 == 0) goto L_0x00c9
            org.json.JSONArray r4 = r1.optJSONArray(r3)
            if (r4 == 0) goto L_0x00c9
            r3 = 0
            int r7 = r4.length()
        L_0x00ac:
            if (r3 >= r7) goto L_0x00c9
            org.json.JSONObject r1 = r4.optJSONObject(r3)
            if (r1 == 0) goto L_0x00bf
            X.Ayu r6 = r10.A01
            java.lang.Object r1 = r6.B3d(r1, r8)
            if (r1 == 0) goto L_0x00bf
            r11.add(r1)
        L_0x00bf:
            int r3 = r3 + 1
            goto L_0x00ac
        L_0x00c2:
            r15 = 0
            goto L_0x0075
        L_0x00c4:
            r1 = 0
            goto L_0x0053
        L_0x00c6:
            r2 = 0
            goto L_0x0041
        L_0x00c9:
            if (r5 == 0) goto L_0x00d3
            X.Ayu r1 = r10.A02
            java.lang.Object r14 = r1.B3d(r5, r8)
            X.9tw r14 = (X.C206769tw) r14
        L_0x00d3:
            java.lang.String r1 = "image_fetch_status"
            java.lang.String r23 = X.AnonymousClass9ZU.A00(r1, r0)
            java.lang.String r1 = "product_availability"
            java.lang.String r3 = X.AnonymousClass9ZU.A00(r1, r0)
            java.lang.String r1 = "OUT_OF_STOCK"
            r26 = 1
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto L_0x00f3
            java.lang.String r1 = "AVAILABLE_FOR_ANOTHER_POSTCODE"
            boolean r1 = r1.equalsIgnoreCase(r3)
            int r26 = X.C165587tf.A03(r1)
        L_0x00f3:
            java.lang.String r1 = "is_hidden"
            java.lang.String r3 = X.AnonymousClass9ZU.A00(r1, r0)
            java.lang.String r1 = "ISHIDDEN_TRUE"
            boolean r30 = r1.equalsIgnoreCase(r3)
            java.lang.String r1 = "compliance_category"
            java.lang.String r6 = X.AnonymousClass9ZU.A00(r1, r0)
            java.lang.String r1 = "compliance_info"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            r13 = 0
            if (r1 == 0) goto L_0x0153
            java.lang.String r3 = "country_code_origin"
            java.lang.String r5 = X.AnonymousClass9ZU.A00(r3, r1)
            java.lang.String r3 = "importer_name"
            java.lang.String r4 = X.AnonymousClass9ZU.A00(r3, r1)
            java.lang.String r3 = "importer_address"
            org.json.JSONObject r1 = r1.optJSONObject(r3)
            if (r1 == 0) goto L_0x014d
            java.lang.String r3 = "street1"
            java.lang.String r32 = X.AnonymousClass9ZU.A00(r3, r1)
            java.lang.String r3 = "street2"
            java.lang.String r33 = X.AnonymousClass9ZU.A00(r3, r1)
            java.lang.String r3 = "postal_code"
            java.lang.String r34 = X.AnonymousClass9ZU.A00(r3, r1)
            java.lang.String r3 = "city"
            java.lang.String r35 = X.AnonymousClass9ZU.A00(r3, r1)
            java.lang.String r3 = "region"
            java.lang.String r36 = X.AnonymousClass9ZU.A00(r3, r1)
            java.lang.String r3 = "country_code"
            java.lang.String r37 = X.AnonymousClass9ZU.A00(r3, r1)
            X.9tx r13 = new X.9tx
            r31 = r13
            r31.<init>(r32, r33, r34, r35, r36, r37)
        L_0x014d:
            X.9te r1 = new X.9te
            r1.<init>(r13, r5, r4)
            r13 = r1
        L_0x0153:
            java.lang.String r1 = "COMPLIANCECATEGORY_COUNTRYORIGINEXEMPT"
            boolean r1 = r1.equalsIgnoreCase(r6)
            if (r1 == 0) goto L_0x0163
            java.lang.String r3 = "N/A"
            r1 = 0
            X.9te r13 = new X.9te
            r13.<init>(r1, r3, r1)
        L_0x0163:
            java.lang.String r1 = "variant_info"
            org.json.JSONObject r5 = r0.optJSONObject(r1)
            X.8Vh r4 = new X.8Vh
            r4.<init>(r2)
            X.8Va r1 = new X.8Va
            r1.<init>()
            X.8Vi r3 = new X.8Vi
            r3.<init>(r1)
            X.8Vb r6 = new X.8Vb
            r6.<init>()
            X.8Vn r1 = new X.8Vn
            r1.<init>(r3, r6, r4)
            if (r5 == 0) goto L_0x01af
            java.lang.Object r1 = r1.B3d(r5, r8)
            X.6bW r1 = (X.C134736bW) r1
        L_0x018a:
            X.AnonymousClass00C.A0B(r18)
            X.AnonymousClass00C.A0B(r19)
            r29 = 1
            X.9up r12 = new X.9up
            r25 = r11
            r17 = r2
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30)
            java.lang.String r1 = "belongsTo"
            java.lang.String r1 = X.AnonymousClass9ZU.A00(r1, r0)
            if (r1 == 0) goto L_0x01b1
            boolean r0 = java.lang.Boolean.parseBoolean(r1)
            X.8VY r14 = new X.8VY
            r14.<init>(r12, r0)
            return r14
        L_0x01af:
            r1 = 0
            goto L_0x018a
        L_0x01b1:
            X.00T r1 = r10.A03
            java.lang.Object r1 = r1.getValue()
            X.9QY r1 = (X.AnonymousClass9QY) r1
            r1.A00(r12, r0)
            return r12
        L_0x01bd:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174218Vp.A02(org.json.JSONObject, long):java.lang.Object");
    }

    public C174218Vp(AnonymousClass9E4 r1, AnonymousClass9E5 r2, AnonymousClass9E6 r3, AnonymousClass964 r4, C22944Ayu ayu, C22944Ayu ayu2, AnonymousClass00T r7) {
        C36331k8.A1H(r1, r2);
        C36321k7.A10(r3, r7);
        this.A02 = ayu;
        this.A01 = ayu2;
        this.A06 = r4;
        this.A00 = r1;
        this.A04 = r2;
        this.A05 = r3;
        this.A03 = r7;
    }
}
