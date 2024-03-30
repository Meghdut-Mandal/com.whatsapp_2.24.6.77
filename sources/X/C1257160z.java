package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.60z  reason: invalid class name and case insensitive filesystem */
public abstract class C1257160z {
    public Object A00;

    public static AnonymousClass011 A02(JSONArray jSONArray, int i) {
        JSONObject jSONObject = jSONArray.getJSONObject(i);
        AnonymousClass00C.A08(jSONObject);
        return new AnonymousClass011(Boolean.valueOf(jSONObject.getJSONArray("waffle_xss").getJSONObject(0).getBoolean("waffle_iaxe")), jSONObject.getString("waffle_di"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.5AA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: X.5A6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: X.5A7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: X.5A8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: X.5A9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: X.5AA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: X.50C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: X.5AA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: X.5AA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v56, resolved type: X.6PC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: X.6PC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v58, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: X.5AA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: X.5AA} */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05f6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05fd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0600, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0604, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06dd, code lost:
        if (r0 != null) goto L_0x06df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06e5, code lost:
        if (r19 == null) goto L_0x06e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06e7, code lost:
        r19 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06e9, code lost:
        if (r0 == null) goto L_0x06f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06eb, code lost:
        r20 = r0.getString("favorites_empty_state_template_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x06f1, code lost:
        if (r20 != null) goto L_0x06f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x06f3, code lost:
        r20 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x06f5, code lost:
        r0 = r5.opt("sticker_pack_dynamic_icon");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06fd, code lost:
        if ((r0 instanceof org.json.JSONObject) == false) goto L_0x0707;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x06ff, code lost:
        r0 = (org.json.JSONObject) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0701, code lost:
        if (r0 == null) goto L_0x0707;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0703, code lost:
        r11 = X.AnonymousClass5AB.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0707, code lost:
        r8 = r5.getJSONArray("stickers");
        r7 = X.AnonymousClass001.A0I();
        r5 = r8.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0713, code lost:
        if (r4 >= r5) goto L_0x0726;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0715, code lost:
        r0 = r8.getJSONObject(r4);
        X.AnonymousClass00C.A08(r0);
        r7.add(X.AnonymousClass5AB.A00(r1, r0));
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0726, code lost:
        X.AnonymousClass00C.A0B(r12);
        X.AnonymousClass00C.A0B(r13);
        r1.A00 = new X.C134846bh(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, X.C36441kJ.A15(r7));
        r0 = X.AnonymousClass0AJ.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011b, code lost:
        if (r0 == 0) goto L_0x011d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x08f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(org.json.JSONObject r36, long r37) {
        /*
            r35 = this;
            r1 = r35
            boolean r0 = r1 instanceof X.AnonymousClass5A9
            r4 = r36
            if (r0 == 0) goto L_0x0088
            X.5A9 r1 = (X.AnonymousClass5A9) r1
            r10 = 0
            X.AnonymousClass00C.A0D(r4, r10)
            java.lang.String r0 = "whatsapp_crossposting_eligibility"
            org.json.JSONObject r2 = r4.getJSONObject(r0)
            java.lang.String r0 = "whatsapp_status_unique_fbids"
            org.json.JSONArray r8 = r2.getJSONArray(r0)
            java.lang.String r0 = "purpose_public_keys"
            org.json.JSONObject r5 = r2.getJSONObject(r0)
            java.lang.String r0 = "whatsapp_status_has_crossposted_state"
            org.json.JSONArray r9 = r2.getJSONArray(r0)
            int r2 = r9.length()
            r0 = 1
            if (r2 != r0) goto L_0x0080
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            int r6 = r8.length()
            r7 = 0
            r4 = 0
        L_0x0037:
            if (r4 >= r6) goto L_0x004c
            java.lang.String r2 = r8.getString(r4)
            X.AnonymousClass00C.A0B(r2)
            X.1UJ r0 = r1.A00
            X.6bk r0 = X.AnonymousClass6Y4.A01(r0, r2)
            r3.add(r0)
            int r4 = r4 + 1
            goto L_0x0037
        L_0x004c:
            org.json.JSONObject r2 = r9.getJSONObject(r10)
            java.lang.String r0 = "waffle_hcbc"
            org.json.JSONArray r6 = r2.getJSONArray(r0)
            int r2 = r6.length()
            int r0 = r8.length()
            if (r2 != r0) goto L_0x0078
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            int r4 = r6.length()
        L_0x0068:
            if (r7 >= r4) goto L_0x0cc5
            boolean r0 = r6.getBoolean(r7)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.add(r0)
            int r7 = r7 + 1
            goto L_0x0068
        L_0x0078:
            java.lang.String r1 = "Error: unexpected hasCrosspostBeenCreated length"
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x0080:
            java.lang.String r1 = "Error: unexpected crossposted state length"
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x0088:
            boolean r0 = r1 instanceof X.AnonymousClass5A8
            if (r0 == 0) goto L_0x0101
            X.5A8 r1 = (X.AnonymousClass5A8) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.String r0 = "xfb_whatsapp_crossposting"
            org.json.JSONObject r2 = r4.getJSONObject(r0)
            java.lang.String r0 = "status_crosspost_results"
            org.json.JSONArray r9 = r2.getJSONArray(r0)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            int r4 = r9.length()
            r3 = 0
        L_0x00b3:
            if (r3 >= r4) goto L_0x00fa
            org.json.JSONObject r2 = r9.getJSONObject(r3)
            java.lang.String r0 = "wa_status_id"
            java.lang.String r11 = r2.getString(r0)
            java.lang.String r0 = "response_code"
            int r10 = r2.getInt(r0)
            if (r10 == 0) goto L_0x00ed
            r0 = 2
            if (r10 == r0) goto L_0x00e0
            r2 = 3
            X.AnonymousClass00C.A0B(r11)
            X.1UJ r0 = r1.A00
            X.6bk r0 = X.AnonymousClass6Y4.A01(r0, r11)
            if (r10 == r2) goto L_0x00dc
            r7.add(r0)
        L_0x00d9:
            int r3 = r3 + 1
            goto L_0x00b3
        L_0x00dc:
            r5.add(r0)
            goto L_0x00d9
        L_0x00e0:
            X.AnonymousClass00C.A0B(r11)
            X.1UJ r0 = r1.A00
            X.6bk r0 = X.AnonymousClass6Y4.A01(r0, r11)
            r6.add(r0)
            goto L_0x00d9
        L_0x00ed:
            X.AnonymousClass00C.A0B(r11)
            X.1UJ r0 = r1.A00
            X.6bk r0 = X.AnonymousClass6Y4.A01(r0, r11)
            r8.add(r0)
            goto L_0x00d9
        L_0x00fa:
            X.6Cb r0 = new X.6Cb
            r0.<init>(r8, r7, r6, r5)
            goto L_0x0cff
        L_0x0101:
            boolean r0 = r1 instanceof X.AnonymousClass5A5
            if (r0 == 0) goto L_0x0125
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.String r0 = "xfb_web_auth_linking_access_token_exchange"
            org.json.JSONObject r2 = r4.getJSONObject(r0)
            java.lang.String r0 = "access_token"
            java.lang.String r5 = r2.getString(r0)
            if (r5 == 0) goto L_0x011d
            int r0 = r5.length()
            if (r0 != 0) goto L_0x0617
        L_0x011d:
            java.lang.String r1 = "WebAuthAccessTokenFetchGraphQLDataProcessor/missing return access token"
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x0125:
            boolean r0 = r1 instanceof X.AnonymousClass5A4
            if (r0 == 0) goto L_0x015c
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.String r0 = "xfb_whatsapp_xfamily_access_token_exchange"
            org.json.JSONObject r2 = r4.getJSONObject(r0)
            java.lang.String r0 = "access_token"
            java.lang.String r5 = r2.getString(r0)
            if (r5 == 0) goto L_0x04b4
            int r0 = r5.length()
            if (r0 == 0) goto L_0x04b4
            X.6vT r4 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r0 = "XFamilyFbAccessTokenForCrossposting"
            X.6c7 r3 = new X.6c7
            r3.<init>(r4, r2, r5, r0)
            r2 = 2
            X.6bk r0 = new X.6bk
            r0.<init>(r3, r2)
            X.694 r2 = new X.694
            r2.<init>(r0)
        L_0x0159:
            r1.A00 = r2
            return
        L_0x015c:
            boolean r0 = r1 instanceof X.AnonymousClass5A3
            if (r0 == 0) goto L_0x01e7
            r15 = 0
            X.AnonymousClass00C.A0D(r4, r15)
            java.lang.String r0 = "waffle_xe_root"
            org.json.JSONObject r8 = r4.getJSONObject(r0)
            java.lang.String r0 = "waffle_d"
            org.json.JSONArray r13 = r8.getJSONArray(r0)
            int r0 = r13.length()
            if (r0 == 0) goto L_0x05d5
            java.util.ArrayList r21 = X.AnonymousClass001.A0I()
            int r12 = r13.length()
            r11 = 0
        L_0x017f:
            java.lang.String r10 = "S"
            java.lang.String r9 = "waffle_xs"
            java.lang.String r7 = "waffle_xan"
            java.lang.String r6 = "waffle_xas"
            java.lang.String r5 = "I"
            java.lang.String r4 = "F"
            java.lang.String r3 = "Error: unexpected response"
            if (r11 >= r12) goto L_0x04ca
            org.json.JSONObject r2 = r13.getJSONObject(r11)
            java.lang.String r0 = "waffle_di"
            java.lang.String r14 = r2.getString(r0)
            org.json.JSONObject r0 = r2.getJSONObject(r6)
            java.lang.String r2 = r0.getString(r7)
            java.lang.String r6 = r0.getString(r9)
            boolean r0 = X.AnonymousClass00C.A0J(r2, r4)
            if (r0 != 0) goto L_0x01b1
            boolean r0 = X.AnonymousClass00C.A0J(r2, r5)
            if (r0 == 0) goto L_0x04c4
        L_0x01b1:
            boolean r0 = X.AnonymousClass00C.A0J(r6, r10)
            if (r0 == 0) goto L_0x04c4
            if (r14 == 0) goto L_0x05d5
            int r0 = r14.length()
            if (r0 == 0) goto L_0x05d5
            X.AnonymousClass00C.A0B(r2)
            X.AnonymousClass00C.A0D(r2, r15)
            X.5Tq[] r6 = X.C108475Tq.values()
            int r5 = r6.length
            r4 = 0
        L_0x01cb:
            if (r4 >= r5) goto L_0x04bc
            r3 = r6[r4]
            java.lang.String r0 = r3.gqlValue
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)
            if (r0 == 0) goto L_0x01e4
            X.6Ak r2 = new X.6Ak
            r2.<init>(r3, r14)
            r0 = r21
            r0.add(r2)
            int r11 = r11 + 1
            goto L_0x017f
        L_0x01e4:
            int r4 = r4 + 1
            goto L_0x01cb
        L_0x01e7:
            boolean r0 = r1 instanceof X.AnonymousClass5A2
            if (r0 == 0) goto L_0x0254
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.String r0 = "waffle_fx_service_data"
            org.json.JSONObject r2 = r4.optJSONObject(r0)
            r3 = 0
            if (r2 == 0) goto L_0x060c
            java.lang.String r0 = "services"
            org.json.JSONObject r2 = r2.optJSONObject(r0)
            if (r2 == 0) goto L_0x060c
            java.lang.String r0 = "waffle_sxs"
            org.json.JSONArray r9 = r2.optJSONArray(r0)
            if (r9 == 0) goto L_0x060c
            int r8 = r9.length()
            r4 = r3
            r7 = 0
            r6 = 0
            r5 = 0
        L_0x0210:
            if (r7 >= r8) goto L_0x05e5
            org.json.JSONObject r0 = r9.getJSONObject(r7)
            java.lang.String r10 = "waffle_da"
            java.lang.String r2 = r0.getString(r10)
            java.lang.String r0 = "I"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0235
            X.011 r2 = A02(r9, r7)
            java.lang.Object r0 = r2.first
            boolean r5 = X.AnonymousClass000.A1X(r0)
            java.lang.Object r4 = r2.second
            java.lang.String r4 = (java.lang.String) r4
        L_0x0232:
            int r7 = r7 + 1
            goto L_0x0210
        L_0x0235:
            org.json.JSONObject r0 = r9.getJSONObject(r7)
            java.lang.String r2 = r0.getString(r10)
            java.lang.String r0 = "F"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x0232
            X.011 r2 = A02(r9, r7)
            java.lang.Object r0 = r2.first
            boolean r6 = X.AnonymousClass000.A1X(r0)
            java.lang.Object r3 = r2.second
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0232
        L_0x0254:
            boolean r0 = r1 instanceof X.AnonymousClass5A1
            if (r0 == 0) goto L_0x0299
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.String r0 = "waffle_get_pre_consent_bloks_layout"
            org.json.JSONObject r2 = r4.optJSONObject(r0)
            java.lang.String r5 = ""
            if (r2 == 0) goto L_0x0617
            java.lang.String r0 = "payload"
            java.lang.String r2 = r2.optString(r0, r5)
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r2, r0)
            java.io.ByteArrayInputStream r5 = X.C90524aI.A0P(r0)     // Catch:{ IOException -> 0x0605 }
            java.util.zip.InflaterInputStream r4 = new java.util.zip.InflaterInputStream     // Catch:{ all -> 0x05fe }
            r4.<init>(r5)     // Catch:{ all -> 0x05fe }
            java.io.ByteArrayOutputStream r3 = X.C90524aI.A0Q()     // Catch:{ all -> 0x05f7 }
            X.AnonymousClass6YY.A0J(r4, r3)     // Catch:{ all -> 0x05f0 }
            java.nio.charset.Charset r0 = X.C19430v1.A0D     // Catch:{ all -> 0x05f0 }
            java.lang.String r0 = r0.name()     // Catch:{ all -> 0x05f0 }
            java.lang.String r2 = r3.toString(r0)     // Catch:{ all -> 0x05f0 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x05f0 }
            r3.close()     // Catch:{ all -> 0x05f7 }
            r4.close()     // Catch:{ all -> 0x05fe }
            r5.close()     // Catch:{ IOException -> 0x0605 }
            goto L_0x0159
        L_0x0299:
            boolean r0 = r1 instanceof X.AnonymousClass5AB
            if (r0 == 0) goto L_0x02b2
            X.5AB r1 = (X.AnonymousClass5AB) r1
            java.lang.String r10 = "revision_id"
            java.lang.String r7 = "stickers"
            java.lang.String r11 = "sticker_pack_id"
            java.lang.String r5 = "fetch__WAAvatar"
            java.lang.String r8 = "id"
            java.lang.String r3 = "invalid_json_response"
            r6 = 41
            r2 = 1
            if (r36 != 0) goto L_0x0622
            goto L_0x061a
        L_0x02b2:
            boolean r0 = r1 instanceof X.AnonymousClass5A7
            if (r0 == 0) goto L_0x02ef
            X.5A7 r1 = (X.AnonymousClass5A7) r1
            if (r36 == 0) goto L_0x0d01
            java.lang.String r2 = "fetch__WAAvatar"
            boolean r0 = r4.has(r2)
            java.lang.String r6 = "malformed_profile_pictures_json_response"
            r5 = 1
            if (r0 != 0) goto L_0x02cd
            X.1Ae r1 = r1.A00
            java.lang.String r0 = "missing envelope (fetch__WAAvatar)"
        L_0x02c9:
            r1.A02(r5, r6, r0)
            return
        L_0x02cd:
            org.json.JSONObject r3 = r4.getJSONObject(r2)
            java.lang.String r2 = "wa_stickers_v2"
            boolean r0 = r3.has(r2)
            if (r0 != 0) goto L_0x02de
            X.1Ae r1 = r1.A00
            java.lang.String r0 = "missing key (wa_stickers)"
            goto L_0x02c9
        L_0x02de:
            org.json.JSONObject r3 = r3.getJSONObject(r2)
            java.lang.String r2 = "stickers"
            boolean r0 = r3.has(r2)
            if (r0 != 0) goto L_0x079a
            X.1Ae r1 = r1.A00
            java.lang.String r0 = "missing key (stickers)"
            goto L_0x02c9
        L_0x02ef:
            boolean r0 = r1 instanceof X.AnonymousClass5A0
            if (r0 == 0) goto L_0x0320
            if (r36 == 0) goto L_0x0d01
            java.lang.String r2 = "fetch__WAAvatar"
            boolean r0 = r4.has(r2)
            if (r0 == 0) goto L_0x0d01
            org.json.JSONObject r3 = r4.getJSONObject(r2)
            java.lang.String r2 = "wa_full_preview"
            boolean r0 = r3.has(r2)
            if (r0 == 0) goto L_0x0d01
            org.json.JSONObject r3 = r3.getJSONObject(r2)
            java.lang.String r2 = "url"
            boolean r0 = r3.has(r2)
            if (r0 == 0) goto L_0x0d01
            java.lang.String r0 = r3.getString(r2)
            X.6b7 r2 = new X.6b7
            r2.<init>(r0)
            goto L_0x0159
        L_0x0320:
            boolean r0 = r1 instanceof X.AnonymousClass5A6
            if (r0 == 0) goto L_0x0374
            X.5A6 r1 = (X.AnonymousClass5A6) r1
            X.0yC r2 = r1.A00
            r0 = 7405(0x1ced, float:1.0377E-41)
            boolean r0 = r2.A0E(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0369
            if (r36 == 0) goto L_0x035f
            java.lang.String r0 = "avatar_dynamic_user_config"
            org.json.JSONObject r2 = r4.getJSONObject(r0)
            if (r2 == 0) goto L_0x035f
            java.lang.String r0 = "config_source"
            java.lang.String r3 = r2.getString(r0)
            if (r3 == 0) goto L_0x035f
            int r2 = r3.hashCode()
            r0 = 2402104(0x24a738, float:3.366065E-39)
            if (r2 == r0) goto L_0x035f
            r0 = 443840354(0x1a747762, float:5.0554454E-23)
            if (r2 == r0) goto L_0x0366
            r0 = 1621408307(0x60a4ba33, float:9.495885E19)
            if (r2 != r0) goto L_0x035f
            java.lang.String r0 = "STATIC_CONFIG"
        L_0x0358:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x035f
            r5 = 1
        L_0x035f:
            X.6bG r0 = new X.6bG
            r0.<init>(r5)
            goto L_0x0cff
        L_0x0366:
            java.lang.String r0 = "DYNAMIC_CONFIG"
            goto L_0x0358
        L_0x0369:
            if (r36 == 0) goto L_0x035f
            java.lang.String r0 = "avatar_static_config"
            boolean r0 = r4.isNull(r0)
            r5 = r0 ^ 1
            goto L_0x035f
        L_0x0374:
            boolean r0 = r1 instanceof X.C1045159z
            if (r0 == 0) goto L_0x037e
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            goto L_0x07f4
        L_0x037e:
            boolean r0 = r1 instanceof X.C1045059y
            if (r0 == 0) goto L_0x039f
            java.lang.String r3 = "metadata"
            if (r36 == 0) goto L_0x0d01
            java.lang.String r2 = "xwa_ai_stickers"
            boolean r0 = r4.has(r2)
            if (r0 == 0) goto L_0x0d01
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            org.json.JSONObject r2 = r4.getJSONObject(r2)
            java.lang.String r0 = "stickers"
            org.json.JSONArray r4 = r2.getJSONArray(r0)
            r13 = 0
            goto L_0x08c1
        L_0x039f:
            boolean r0 = r1 instanceof X.C1044959x
            if (r0 == 0) goto L_0x040b
            r7 = 0
            X.AnonymousClass00C.A0D(r4, r7)
            java.lang.String r0 = "xwa_extensions_get_flow_data"
            org.json.JSONObject r6 = r4.getJSONObject(r0)
            X.AnonymousClass00C.A0B(r6)
            X.AnonymousClass00C.A0D(r6, r7)
            java.lang.String r0 = "extensions_flow_data"
            org.json.JSONArray r5 = r6.optJSONArray(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            if (r5 == 0) goto L_0x03d6
            r3 = 0
            int r2 = r5.length()
        L_0x03c4:
            if (r3 >= r2) goto L_0x03d6
            org.json.JSONObject r0 = r5.optJSONObject(r3)
            if (r0 == 0) goto L_0x03d3
            X.6Di r0 = X.C110815bH.A00(r0)
            r4.add(r0)
        L_0x03d3:
            int r3 = r3 + 1
            goto L_0x03c4
        L_0x03d6:
            java.lang.String r0 = "compatibility"
            org.json.JSONObject r2 = r6.optJSONObject(r0)
            java.lang.String r0 = "endpoint_public_key"
            org.json.JSONObject r6 = r6.optJSONObject(r0)
            java.util.List r5 = X.C007103b.A0Y(r4)
            r4 = 0
            if (r2 == 0) goto L_0x0409
            X.6SY r0 = X.AnonymousClass6PG.A03
            X.6PG r3 = r0.A02(r2)
        L_0x03ef:
            if (r6 == 0) goto L_0x0402
            java.lang.String r0 = "key"
            java.lang.String r2 = X.C63893Lv.A00(r0, r6, r7)
            java.lang.String r0 = "signature"
            java.lang.String r0 = X.C63893Lv.A00(r0, r6, r7)
            X.6AF r4 = new X.6AF
            r4.<init>(r2, r0)
        L_0x0402:
            X.6BQ r2 = new X.6BQ
            r2.<init>(r3, r4, r5)
            goto L_0x0159
        L_0x0409:
            r3 = r4
            goto L_0x03ef
        L_0x040b:
            boolean r0 = r1 instanceof X.C1044859w
            if (r0 == 0) goto L_0x0429
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.String r0 = "whatsapp_extensions_assets_getpubkeys"
            org.json.JSONObject r0 = r4.optJSONObject(r0)
            if (r0 == 0) goto L_0x0954
            X.5zq r2 = X.AnonymousClass6PF.A03
            java.lang.String r0 = r0.toString()
            X.6PF r2 = r2.A00(r0)
            if (r2 == 0) goto L_0x0954
            goto L_0x0159
        L_0x0429:
            boolean r0 = r1 instanceof X.AnonymousClass5AC
            if (r0 == 0) goto L_0x043d
            X.5AC r1 = (X.AnonymousClass5AC) r1
            java.lang.String r11 = "context"
            java.lang.String r10 = "session_id"
            java.lang.String r9 = "query"
            if (r36 == 0) goto L_0x0d01
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            goto L_0x095c
        L_0x043d:
            boolean r0 = r1 instanceof X.C1044759v
            if (r0 == 0) goto L_0x0447
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            goto L_0x09b3
        L_0x0447:
            boolean r0 = r1 instanceof X.C1044659u
            if (r0 == 0) goto L_0x0451
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            goto L_0x0adc
        L_0x0451:
            boolean r0 = r1 instanceof X.C1044559t
            if (r0 == 0) goto L_0x045b
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            goto L_0x0b01
        L_0x045b:
            boolean r0 = r1 instanceof X.C1044459s
            if (r0 == 0) goto L_0x0b3a
            r5 = 0
            X.AnonymousClass00C.A0D(r4, r5)
            java.lang.String r0 = "xwa_popular_businesses"
            org.json.JSONObject r2 = r4.getJSONObject(r0)
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "popular_businesses"
            org.json.JSONArray r4 = r2.getJSONArray(r0)
            int r3 = r4.length()
            r2 = 0
        L_0x0478:
            if (r2 >= r3) goto L_0x04ad
            org.json.JSONObject r7 = r4.getJSONObject(r2)
            java.lang.String r0 = "id"
            java.lang.String r13 = r7.getString(r0)
            java.lang.String r0 = "jid"
            java.lang.String r14 = r7.getString(r0)
            java.lang.String r0 = "name"
            java.lang.String r15 = r7.getString(r0)
            X.C90474aD.A1A(r13, r14, r15)
            r8 = 0
            X.09w r19 = X.C023409w.A00
            X.6E6 r7 = new X.6E6
            r10 = r8
            r11 = r8
            r12 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r20 = 0
            r9 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r6.add(r7)
            int r2 = r2 + 1
            goto L_0x0478
        L_0x04ad:
            X.69o r2 = new X.69o
            r2.<init>(r6, r5)
            goto L_0x0159
        L_0x04b4:
            java.lang.String r1 = "NativeAuthTokenExchangeDataProcessor/missing return access token"
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x04bc:
            java.lang.String r1 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x04c4:
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r3)
            throw r0
        L_0x04ca:
            java.lang.String r0 = "waffle_unique_ids"
            org.json.JSONArray r20 = r8.getJSONArray(r0)
            int r0 = r20.length()
            if (r0 == 0) goto L_0x05cf
            java.util.ArrayList r19 = X.AnonymousClass001.A0I()
            int r12 = r20.length()
            r11 = 0
        L_0x04df:
            if (r11 >= r12) goto L_0x04ea
            r2 = r20
            r0 = r19
            int r11 = X.C90484aE.A0E(r0, r2, r11)
            goto L_0x04df
        L_0x04ea:
            java.lang.String r0 = "waffle_xps"
            org.json.JSONArray r18 = r8.getJSONArray(r0)
            int r0 = r18.length()
            if (r0 == 0) goto L_0x05c9
            java.util.LinkedHashMap r17 = X.C36431kI.A1G()
            int r16 = r18.length()
            r11 = 0
        L_0x04ff:
            r0 = r16
            if (r11 >= r0) goto L_0x057e
            r0 = r18
            org.json.JSONObject r2 = r0.getJSONObject(r11)
            org.json.JSONObject r0 = r2.getJSONObject(r6)
            java.lang.String r14 = r0.getString(r7)
            java.lang.String r12 = r0.getString(r9)
            boolean r0 = X.AnonymousClass00C.A0J(r14, r4)
            if (r0 != 0) goto L_0x0521
            boolean r0 = X.AnonymousClass00C.A0J(r14, r5)
            if (r0 == 0) goto L_0x0578
        L_0x0521:
            boolean r0 = X.AnonymousClass00C.A0J(r12, r10)
            if (r0 == 0) goto L_0x0578
            java.lang.String r0 = "waffle_hcbc"
            org.json.JSONArray r15 = r2.getJSONArray(r0)
            int r2 = r15.length()
            int r0 = r20.length()
            if (r2 != r0) goto L_0x0572
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            int r13 = r15.length()
            r2 = 0
        L_0x0540:
            if (r2 >= r13) goto L_0x0550
            boolean r0 = r15.getBoolean(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12.add(r0)
            int r2 = r2 + 1
            goto L_0x0540
        L_0x0550:
            X.AnonymousClass00C.A0B(r14)
            boolean r0 = X.AnonymousClass00C.A0J(r14, r4)
            if (r0 == 0) goto L_0x0563
            X.5Tq r2 = X.C108475Tq.FACEBOOK
        L_0x055b:
            r0 = r17
            r0.put(r2, r12)
            int r11 = r11 + 1
            goto L_0x04ff
        L_0x0563:
            boolean r0 = X.AnonymousClass00C.A0J(r14, r5)
            if (r0 == 0) goto L_0x056c
            X.5Tq r2 = X.C108475Tq.INSTAGRAM
            goto L_0x055b
        L_0x056c:
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r3)
            throw r0
        L_0x0572:
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r3)
            throw r0
        L_0x0578:
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r3)
            throw r0
        L_0x057e:
            java.lang.String r0 = "purpose_public_keys"
            org.json.JSONObject r3 = r8.getJSONObject(r0)
            java.lang.String r0 = "purpose_public_ik"
            java.lang.String r0 = r3.getString(r0)
            r2 = 8
            byte[] r7 = android.util.Base64.decode(r0, r2)
            java.lang.String r0 = "purpose_public_ik_sig"
            java.lang.String r4 = r3.getString(r0)
            java.lang.String r0 = "purpose_public_ik_enc_certificate"
            java.lang.String r5 = r3.getString(r0)
            java.lang.String r0 = "purpose_public_ek"
            byte[] r6 = X.C90514aH.A1b(r0, r3, r2)
            java.lang.String r0 = "purpose_dummy_ciphertext"
            byte[] r8 = X.C90514aH.A1b(r0, r3, r2)
            java.lang.String r0 = "purpose_dummy_nonce"
            byte[] r9 = X.C90514aH.A1b(r0, r3, r2)
            r10 = 1
            X.C90474aD.A1A(r6, r7, r4)
            X.C90474aD.A1A(r5, r8, r9)
            X.6Dk r3 = new X.6Dk
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.6D5 r5 = new X.6D5
            r6 = r3
            r7 = r21
            r8 = r19
            r9 = r17
            r5.<init>(r6, r7, r8, r9, r10)
            r1.A00 = r5
            return
        L_0x05c9:
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r3)
            throw r0
        L_0x05cf:
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r3)
            throw r0
        L_0x05d5:
            X.09w r12 = X.C023409w.A00
            X.00f r14 = X.C000400e.A0D()
            r11 = 0
            X.6D5 r10 = new X.6D5
            r13 = r12
            r10.<init>(r11, r12, r13, r14, r15)
            r1.A00 = r10
            return
        L_0x05e5:
            X.6Oy r0 = new X.6Oy
            r0.<init>(r6, r5)
            X.6PC r5 = new X.6PC
            r5.<init>(r0, r3, r4)
            goto L_0x0617
        L_0x05f0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05f2 }
        L_0x05f2:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x05f7 }
            throw r0     // Catch:{ all -> 0x05f7 }
        L_0x05f7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05f9 }
        L_0x05f9:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x05fe }
            throw r0     // Catch:{ all -> 0x05fe }
        L_0x05fe:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0600 }
        L_0x0600:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ IOException -> 0x0605 }
            throw r0     // Catch:{ IOException -> 0x0605 }
        L_0x0605:
            r1 = move-exception
            X.19b r0 = new X.19b
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x060c:
            r2 = 0
            X.6Oy r0 = new X.6Oy
            r0.<init>(r2, r2)
            X.6PC r5 = new X.6PC
            r5.<init>(r0, r3, r3)
        L_0x0617:
            r1.A00 = r5
            return
        L_0x061a:
            X.1Ae r4 = r1.A00     // Catch:{ all -> 0x077c }
            java.lang.String r0 = "received null JSON"
            r4.A02(r2, r3, r0)     // Catch:{ all -> 0x077c }
            return
        L_0x0622:
            boolean r0 = r4.has(r5)     // Catch:{ all -> 0x077c }
            if (r0 != 0) goto L_0x0630
            X.1Ae r4 = r1.A00     // Catch:{ all -> 0x077c }
            java.lang.String r0 = "missing envelope (fetch__WAAvatar)"
            r4.A02(r2, r3, r0)     // Catch:{ all -> 0x077c }
            return
        L_0x0630:
            org.json.JSONObject r5 = r4.getJSONObject(r5)     // Catch:{ all -> 0x077c }
            boolean r0 = r5.has(r8)     // Catch:{ all -> 0x077c }
            java.lang.String r4 = "wa_stickers_v2"
            if (r0 == 0) goto L_0x0756
            boolean r0 = r5.has(r4)     // Catch:{ all -> 0x077c }
            if (r0 == 0) goto L_0x0756
            java.lang.String r12 = r5.getString(r8)     // Catch:{ all -> 0x077c }
            org.json.JSONObject r5 = r5.getJSONObject(r4)     // Catch:{ all -> 0x077c }
            java.lang.String[] r0 = new java.lang.String[]{r11, r7, r10}     // Catch:{ all -> 0x077c }
            java.util.List r9 = X.C90494aF.A0j(r0)     // Catch:{ all -> 0x077c }
            boolean r0 = r9 instanceof java.util.Collection     // Catch:{ all -> 0x077c }
            r4 = 0
            if (r0 == 0) goto L_0x0668
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x077c }
            if (r0 == 0) goto L_0x0668
        L_0x065d:
            X.AnonymousClass00C.A0B(r5)     // Catch:{ all -> 0x077c }
            X.AnonymousClass00C.A0D(r5, r4)     // Catch:{ all -> 0x077c }
            java.lang.String r14 = X.C63893Lv.A00(r11, r5, r4)     // Catch:{ all -> 0x077c }
            goto L_0x069b
        L_0x0668:
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x077c }
        L_0x066c:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x077c }
            if (r0 == 0) goto L_0x065d
            java.lang.String r0 = X.AnonymousClass001.A0C(r8)     // Catch:{ all -> 0x077c }
            boolean r0 = r5.has(r0)     // Catch:{ all -> 0x077c }
            if (r0 != 0) goto L_0x066c
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x077c }
            java.util.Iterator r7 = r9.iterator()     // Catch:{ all -> 0x077c }
        L_0x0684:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x077c }
            if (r0 == 0) goto L_0x073a
            java.lang.Object r4 = r7.next()     // Catch:{ all -> 0x077c }
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x077c }
            boolean r0 = r5.has(r0)     // Catch:{ all -> 0x077c }
            if (r0 != 0) goto L_0x0684
            r8.add(r4)     // Catch:{ all -> 0x077c }
            goto L_0x0684
        L_0x069b:
            if (r14 != 0) goto L_0x069f
            java.lang.String r14 = "meta-avatar"
        L_0x069f:
            java.lang.String r13 = r5.getString(r10)     // Catch:{ all -> 0x077c }
            java.lang.String r0 = "sticker_pack_description"
            java.lang.String r15 = X.C63893Lv.A00(r0, r5, r4)     // Catch:{ all -> 0x077c }
            java.lang.String r9 = ""
            if (r15 != 0) goto L_0x06ae
            r15 = r9
        L_0x06ae:
            java.lang.String r0 = "sticker_pack_publisher"
            java.lang.String r17 = X.C63893Lv.A00(r0, r5, r4)     // Catch:{ all -> 0x077c }
            if (r17 != 0) goto L_0x06b8
            java.lang.String r17 = "Meta"
        L_0x06b8:
            java.lang.String r0 = "sticker_pack_name"
            java.lang.String r16 = X.C63893Lv.A00(r0, r5, r4)     // Catch:{ all -> 0x077c }
            if (r16 != 0) goto L_0x06c2
            java.lang.String r16 = "Avatars"
        L_0x06c2:
            java.lang.String r0 = "default_templates_info"
            java.lang.Object r0 = r5.opt(r0)     // Catch:{ all -> 0x077c }
            boolean r8 = r0 instanceof org.json.JSONObject     // Catch:{ all -> 0x077c }
            r11 = 0
            if (r8 == 0) goto L_0x06da
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x077c }
            if (r0 == 0) goto L_0x06db
            java.lang.String r8 = "sticker_pack_tray_icon_template_id"
            java.lang.String r18 = r0.getString(r8)     // Catch:{ all -> 0x077c }
            if (r18 != 0) goto L_0x06df
            goto L_0x06db
        L_0x06da:
            r0 = r11
        L_0x06db:
            r18 = r9
            if (r0 == 0) goto L_0x06e7
        L_0x06df:
            java.lang.String r8 = "recents_empty_state_template_id"
            java.lang.String r19 = r0.getString(r8)     // Catch:{ all -> 0x077c }
            if (r19 != 0) goto L_0x06eb
        L_0x06e7:
            r19 = r9
            if (r0 == 0) goto L_0x06f3
        L_0x06eb:
            java.lang.String r8 = "favorites_empty_state_template_id"
            java.lang.String r20 = r0.getString(r8)     // Catch:{ all -> 0x077c }
            if (r20 != 0) goto L_0x06f5
        L_0x06f3:
            r20 = r9
        L_0x06f5:
            java.lang.String r0 = "sticker_pack_dynamic_icon"
            java.lang.Object r0 = r5.opt(r0)     // Catch:{ all -> 0x077c }
            boolean r8 = r0 instanceof org.json.JSONObject     // Catch:{ all -> 0x077c }
            if (r8 == 0) goto L_0x0707
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x077c }
            if (r0 == 0) goto L_0x0707
            X.6bg r11 = X.AnonymousClass5AB.A00(r1, r0)     // Catch:{ all -> 0x077c }
        L_0x0707:
            org.json.JSONArray r8 = r5.getJSONArray(r7)     // Catch:{ all -> 0x077c }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x077c }
            int r5 = r8.length()     // Catch:{ all -> 0x077c }
        L_0x0713:
            if (r4 >= r5) goto L_0x0726
            org.json.JSONObject r0 = r8.getJSONObject(r4)     // Catch:{ all -> 0x077c }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x077c }
            X.6bg r0 = X.AnonymousClass5AB.A00(r1, r0)     // Catch:{ all -> 0x077c }
            r7.add(r0)     // Catch:{ all -> 0x077c }
            int r4 = r4 + 1
            goto L_0x0713
        L_0x0726:
            X.AnonymousClass00C.A0B(r12)     // Catch:{ all -> 0x077c }
            X.AnonymousClass00C.A0B(r13)     // Catch:{ all -> 0x077c }
            java.util.ArrayList r21 = X.C36441kJ.A15(r7)     // Catch:{ all -> 0x077c }
            X.6bh r10 = new X.6bh     // Catch:{ all -> 0x077c }
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x077c }
            r1.A00 = r10     // Catch:{ all -> 0x077c }
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x077c }
            goto L_0x0781
        L_0x073a:
            r5 = 0
            java.lang.String r4 = ", "
            java.lang.String r0 = ""
            java.lang.String r7 = X.C007103b.A0Q(r4, r0, r0, r8, r5)     // Catch:{ all -> 0x077c }
            X.1Ae r5 = r1.A00     // Catch:{ all -> 0x077c }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x077c }
            java.lang.String r0 = "missing mandatory fields ("
            X.C90464aC.A1J(r0, r7, r4, r6)     // Catch:{ all -> 0x077c }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x077c }
            r5.A02(r2, r3, r0)     // Catch:{ all -> 0x077c }
            return
        L_0x0756:
            boolean r8 = r5.has(r8)     // Catch:{ all -> 0x077c }
            boolean r7 = r5.has(r4)     // Catch:{ all -> 0x077c }
            X.1Ae r5 = r1.A00     // Catch:{ all -> 0x077c }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x077c }
            java.lang.String r0 = "missing envelope (has id: "
            r4.append(r0)     // Catch:{ all -> 0x077c }
            r4.append(r8)     // Catch:{ all -> 0x077c }
            java.lang.String r0 = " , has stickerpack: "
            r4.append(r0)     // Catch:{ all -> 0x077c }
            r4.append(r7)     // Catch:{ all -> 0x077c }
            java.lang.String r0 = X.AnonymousClass000.A0t(r4, r6)     // Catch:{ all -> 0x077c }
            r5.A02(r2, r3, r0)     // Catch:{ all -> 0x077c }
            return
        L_0x077c:
            r0 = move-exception
            X.03N r0 = X.C90524aI.A0t(r0)
        L_0x0781:
            java.lang.Throwable r5 = X.AnonymousClass0AK.A00(r0)
            if (r5 == 0) goto L_0x0d01
            X.1Ae r4 = r1.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "error caught parsing JSON ("
            X.C90474aD.A1K(r0, r1, r5)
            java.lang.String r0 = X.AnonymousClass000.A0t(r1, r6)
            r4.A02(r2, r3, r0)
            throw r5
        L_0x079a:
            org.json.JSONArray r9 = r3.getJSONArray(r2)
            int r0 = r9.length()
            if (r0 != 0) goto L_0x07ae
            X.1Ae r2 = r1.A00
            java.lang.String r1 = "empty_profile_pictures_response"
            java.lang.String r0 = "Empty profile picture sticker list"
            r2.A02(r5, r1, r0)
            return
        L_0x07ae:
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            r7 = 0
            int r6 = r9.length()
        L_0x07b7:
            if (r7 >= r6) goto L_0x07ed
            org.json.JSONObject r2 = r9.getJSONObject(r7)
            java.lang.String r0 = "url"
            java.lang.String r5 = X.C90474aD.A0e(r0, r2)
            java.lang.String r0 = "emojis"
            org.json.JSONArray r4 = r2.getJSONArray(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            int r2 = r4.length()
            r0 = 0
        L_0x07d2:
            if (r0 >= r2) goto L_0x07d9
            int r0 = X.C90484aE.A0E(r3, r4, r0)
            goto L_0x07d2
        L_0x07d9:
            java.lang.String r0 = " "
            java.lang.String r2 = android.text.TextUtils.join(r0, r3)
            X.AnonymousClass00C.A08(r2)
            X.6bN r0 = new X.6bN
            r0.<init>(r5, r2)
            r8.add(r0)
            int r7 = r7 + 1
            goto L_0x07b7
        L_0x07ed:
            X.6bH r0 = new X.6bH
            r0.<init>(r8)
            goto L_0x0cff
        L_0x07f4:
            java.lang.String r2 = "aim_model_batched_manifest"
            org.json.JSONObject r2 = r4.optJSONObject(r2)     // Catch:{ JSONException -> 0x08b6 }
            if (r2 == 0) goto L_0x0d01
            java.lang.String r3 = "models"
            org.json.JSONArray r12 = r2.getJSONArray(r3)     // Catch:{ JSONException -> 0x08b6 }
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x08b6 }
            r4 = 0
            int r11 = r12.length()     // Catch:{ JSONException -> 0x08b6 }
        L_0x080b:
            if (r4 >= r11) goto L_0x088e
            org.json.JSONObject r5 = r12.getJSONObject(r4)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r3 = "assets"
            org.json.JSONArray r10 = r5.getJSONArray(r3)     // Catch:{ JSONException -> 0x08b6 }
            X.AnonymousClass00C.A0B(r10)     // Catch:{ JSONException -> 0x08b6 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x08b6 }
            int r9 = r10.length()     // Catch:{ JSONException -> 0x08b6 }
            r3 = 0
        L_0x0823:
            if (r3 >= r9) goto L_0x0876
            org.json.JSONObject r6 = r10.getJSONObject(r3)     // Catch:{ JSONException -> 0x08b6 }
            X.AnonymousClass00C.A0B(r6)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r8 = "name"
            X.AnonymousClass00C.A0D(r6, r0)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r15 = X.C63893Lv.A00(r8, r6, r0)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r8 = "id"
            java.lang.String r16 = X.C63893Lv.A00(r8, r6, r0)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r8 = "cache_key"
            java.lang.String r17 = X.C63893Lv.A00(r8, r6, r0)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r8 = "source_content_hash"
            java.lang.String r18 = X.C63893Lv.A00(r8, r6, r0)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r8 = "md5_hash"
            java.lang.String r19 = X.C63893Lv.A00(r8, r6, r0)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r8 = "asset_handle"
            java.lang.String r20 = X.C63893Lv.A00(r8, r6, r0)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r8 = "creation_time"
            java.lang.String r21 = X.C63893Lv.A00(r8, r6, r0)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r8 = "url"
            java.lang.String r22 = X.C63893Lv.A00(r8, r6, r0)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r8 = "filesize_bytes"
            int r24 = r6.getInt(r8)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r8 = "compression_type"
            java.lang.String r23 = X.C63893Lv.A00(r8, r6, r0)     // Catch:{ JSONException -> 0x08b6 }
            X.6Dv r14 = new X.6Dv     // Catch:{ JSONException -> 0x08b6 }
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ JSONException -> 0x08b6 }
            r7.add(r14)     // Catch:{ JSONException -> 0x08b6 }
            int r3 = r3 + 1
            goto L_0x0823
        L_0x0876:
            java.lang.String r3 = "name"
            java.lang.String r6 = X.C63893Lv.A00(r3, r5, r0)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r3 = "version"
            int r5 = r5.getInt(r3)     // Catch:{ JSONException -> 0x08b6 }
            X.6BZ r3 = new X.6BZ     // Catch:{ JSONException -> 0x08b6 }
            r3.<init>(r7, r5, r6)     // Catch:{ JSONException -> 0x08b6 }
            r13.add(r3)     // Catch:{ JSONException -> 0x08b6 }
            int r4 = r4 + 1
            goto L_0x080b
        L_0x088e:
            java.lang.String r3 = "entry_point"
            java.lang.String r4 = X.C63893Lv.A00(r3, r2, r0)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r3 = "asset_count"
            int r8 = r2.getInt(r3)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r3 = "model_count"
            int r9 = r2.getInt(r3)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r3 = "status"
            java.lang.String r5 = X.C63893Lv.A00(r3, r2, r0)     // Catch:{ JSONException -> 0x08b6 }
            java.lang.String r3 = "status_details"
            java.lang.String r6 = X.C63893Lv.A00(r3, r2, r0)     // Catch:{ JSONException -> 0x08b6 }
            X.6DK r0 = new X.6DK     // Catch:{ JSONException -> 0x08b6 }
            r3 = r0
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x08b6 }
            r1.A00 = r0     // Catch:{ JSONException -> 0x08b6 }
            return
        L_0x08b6:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MLModelMetadataGraphqlDataProcessor/processResponse failed to parse parameters json: "
            X.C36321k7.A1J(r2, r0, r1)
            return
        L_0x08c1:
            boolean r0 = r2.has(r3)     // Catch:{ Exception -> 0x08e8 }
            if (r0 == 0) goto L_0x08e6
            boolean r0 = r2.isNull(r3)     // Catch:{ Exception -> 0x08e8 }
            if (r0 != 0) goto L_0x08e6
            org.json.JSONObject r7 = r2.getJSONObject(r3)     // Catch:{ Exception -> 0x08e8 }
            java.lang.String r0 = "step1_d"
            long r2 = r7.getLong(r0)     // Catch:{ Exception -> 0x08e8 }
            java.lang.Long r6 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x08e8 }
            java.lang.String r0 = "step2_d"
            long r2 = r7.getLong(r0)     // Catch:{ Exception -> 0x08e9 }
            java.lang.Long r13 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x08e9 }
            goto L_0x08e9
        L_0x08e6:
            r14 = r13
            goto L_0x08eb
        L_0x08e8:
            r6 = r13
        L_0x08e9:
            r14 = r13
            r13 = r6
        L_0x08eb:
            int r3 = r4.length()
            r2 = 0
        L_0x08f0:
            if (r2 >= r3) goto L_0x0951
            org.json.JSONObject r7 = r4.getJSONObject(r2)
            X.AnonymousClass00C.A0B(r7)
            java.lang.String r12 = "image_uri"
            java.lang.String r11 = "request_id"
            java.lang.String r10 = "response_id"
            java.lang.String r9 = "prompt"
            java.lang.String r6 = "integrity_image_key"
            java.lang.String[] r0 = new java.lang.String[]{r12, r11, r10, r9, r6}
            java.util.List r8 = X.C90494aF.A0j(r0)
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L_0x093c
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x093c
        L_0x0915:
            java.lang.String r17 = r7.getString(r12)
            java.lang.String r20 = r7.getString(r11)
            java.lang.String r21 = r7.getString(r10)
            java.lang.String r16 = r7.getString(r9)
            java.lang.String r0 = "media_type"
            java.lang.String r15 = r7.getString(r0)
            java.lang.String r18 = r7.getString(r6)
            r19 = 0
            X.6bq r12 = new X.6bq
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r5.add(r12)
        L_0x0939:
            int r2 = r2 + 1
            goto L_0x08f0
        L_0x093c:
            java.util.Iterator r8 = r8.iterator()
        L_0x0940:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0915
            java.lang.String r0 = X.AnonymousClass001.A0C(r8)
            boolean r0 = r7.has(r0)
            if (r0 != 0) goto L_0x0940
            goto L_0x0939
        L_0x0951:
            r1.A00 = r5
            return
        L_0x0954:
            java.lang.String r1 = "Asset verification response is not in expected format."
            org.json.JSONException r0 = new org.json.JSONException
            r0.<init>(r1)
            throw r0
        L_0x095c:
            java.lang.String r0 = r1.A00     // Catch:{ JSONException -> 0x09ab }
            org.json.JSONObject r2 = r4.getJSONObject(r0)     // Catch:{ JSONException -> 0x09ab }
            java.lang.String r0 = "suggestions"
            org.json.JSONArray r12 = r2.getJSONArray(r0)     // Catch:{ JSONException -> 0x09ab }
            r7 = 0
            int r6 = r12.length()     // Catch:{ JSONException -> 0x09ab }
        L_0x096d:
            if (r7 >= r6) goto L_0x09a8
            org.json.JSONObject r2 = r12.getJSONObject(r7)     // Catch:{ JSONException -> 0x09ab }
            boolean r0 = r2.has(r9)     // Catch:{ JSONException -> 0x09ab }
            r5 = 0
            if (r0 == 0) goto L_0x09a3
            java.lang.String r4 = r2.getString(r9)     // Catch:{ JSONException -> 0x09ab }
        L_0x097e:
            boolean r0 = r2.has(r10)     // Catch:{ JSONException -> 0x09ab }
            if (r0 == 0) goto L_0x09a1
            java.lang.String r3 = r2.getString(r10)     // Catch:{ JSONException -> 0x09ab }
        L_0x0988:
            boolean r0 = r2.has(r11)     // Catch:{ JSONException -> 0x09ab }
            if (r0 == 0) goto L_0x0992
            java.lang.String r5 = r2.getString(r11)     // Catch:{ JSONException -> 0x09ab }
        L_0x0992:
            java.lang.String r0 = "suggestion"
            java.lang.String r2 = X.C90474aD.A0e(r0, r2)     // Catch:{ JSONException -> 0x09ab }
            X.6ba r0 = new X.6ba     // Catch:{ JSONException -> 0x09ab }
            r0.<init>(r2, r4, r3, r5)     // Catch:{ JSONException -> 0x09ab }
            r8.add(r0)     // Catch:{ JSONException -> 0x09ab }
            goto L_0x09a5
        L_0x09a1:
            r3 = r5
            goto L_0x0988
        L_0x09a3:
            r4 = r5
            goto L_0x097e
        L_0x09a5:
            int r7 = r7 + 1
            goto L_0x096d
        L_0x09a8:
            r8.isEmpty()     // Catch:{ JSONException -> 0x09ab }
        L_0x09ab:
            X.6bE r0 = new X.6bE
            r0.<init>(r8)
            r1.A00 = r0
            return
        L_0x09b3:
            java.lang.String r0 = "ar_effect_collection"
            org.json.JSONArray r20 = r4.getJSONArray(r0)     // Catch:{ JSONException -> 0x0ad1 }
            X.AnonymousClass00C.A0B(r20)     // Catch:{ JSONException -> 0x0ad1 }
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x0ad1 }
            int r19 = r20.length()     // Catch:{ JSONException -> 0x0ad1 }
            r2 = 0
        L_0x09c5:
            r0 = r19
            if (r2 >= r0) goto L_0x0ac9
            r0 = r20
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r0 = "ar_effects"
            org.json.JSONObject r11 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r0 = "nodes"
            org.json.JSONArray r18 = r11.getJSONArray(r0)     // Catch:{ JSONException -> 0x0ad1 }
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x0ad1 }
            int r17 = r18.length()     // Catch:{ JSONException -> 0x0ad1 }
            r0 = 0
        L_0x09e4:
            r3 = r17
            if (r0 >= r3) goto L_0x0aa7
            r3 = r18
            org.json.JSONObject r8 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0ad1 }
            X.AnonymousClass00C.A08(r8)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r3 = "best_instance"
            org.json.JSONObject r3 = r8.getJSONObject(r3)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r4 = "thumbnail"
            org.json.JSONObject r16 = r8.getJSONObject(r4)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r4 = "packaged_file"
            org.json.JSONObject r5 = r3.getJSONObject(r4)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r4 = "capabilities_min_version_models"
            org.json.JSONArray r15 = r3.getJSONArray(r4)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r7 = "id"
            java.lang.String r14 = X.C90474aD.A0e(r7, r8)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r4 = "name"
            java.lang.String r13 = X.C90474aD.A0e(r4, r8)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r30 = X.C90474aD.A0e(r7, r3)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r31 = X.C90474aD.A0e(r4, r3)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r4 = "required_sdk_version"
            java.lang.String r32 = X.C90474aD.A0e(r4, r3)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r22 = X.C90474aD.A0e(r7, r5)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r4 = "filename"
            java.lang.String r23 = X.C90474aD.A0e(r4, r5)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r4 = "uri"
            java.lang.String r24 = X.C90474aD.A0e(r4, r5)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r7 = "md5_hash"
            java.lang.String r25 = X.C90474aD.A0e(r7, r5)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r7 = "filesize_bytes"
            int r28 = r5.getInt(r7)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r7 = "uncompressed_filesize_bytes"
            int r29 = r5.optInt(r7)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r7 = "compression_type"
            java.lang.String r26 = X.C90474aD.A0e(r7, r5)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r7 = "cache_key"
            java.lang.String r27 = X.C90474aD.A0e(r7, r5)     // Catch:{ JSONException -> 0x0ad1 }
            X.6Dg r21 = new X.6Dg     // Catch:{ JSONException -> 0x0ad1 }
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r5 = "manifest_json"
            java.lang.String r33 = X.C90474aD.A0e(r5, r3)     // Catch:{ JSONException -> 0x0ad1 }
            X.AnonymousClass00C.A0B(r15)     // Catch:{ JSONException -> 0x0ad1 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x0ad1 }
            int r9 = r15.length()     // Catch:{ JSONException -> 0x0ad1 }
            r8 = 0
        L_0x0a68:
            if (r8 >= r9) goto L_0x0a85
            org.json.JSONObject r5 = r15.getJSONObject(r8)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r3 = "capability_name"
            java.lang.String r7 = X.C90474aD.A0e(r3, r5)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r3 = "min_version"
            int r5 = r5.getInt(r3)     // Catch:{ JSONException -> 0x0ad1 }
            X.69r r3 = new X.69r     // Catch:{ JSONException -> 0x0ad1 }
            r3.<init>(r7, r5)     // Catch:{ JSONException -> 0x0ad1 }
            r10.add(r3)     // Catch:{ JSONException -> 0x0ad1 }
            int r8 = r8 + 1
            goto L_0x0a68
        L_0x0a85:
            X.6DC r3 = new X.6DC     // Catch:{ JSONException -> 0x0ad1 }
            r28 = r3
            r29 = r21
            r34 = r10
            r28.<init>(r29, r30, r31, r32, r33, r34)     // Catch:{ JSONException -> 0x0ad1 }
            r5 = r16
            java.lang.String r4 = X.C90474aD.A0e(r4, r5)     // Catch:{ JSONException -> 0x0ad1 }
            X.68j r5 = new X.68j     // Catch:{ JSONException -> 0x0ad1 }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x0ad1 }
            X.6CC r4 = new X.6CC     // Catch:{ JSONException -> 0x0ad1 }
            r4.<init>(r5, r3, r14, r13)     // Catch:{ JSONException -> 0x0ad1 }
            r6.add(r4)     // Catch:{ JSONException -> 0x0ad1 }
            int r0 = r0 + 1
            goto L_0x09e4
        L_0x0aa7:
            java.lang.String r0 = "page_info"
            org.json.JSONObject r3 = r11.getJSONObject(r0)     // Catch:{ JSONException -> 0x0ad1 }
            java.lang.String r0 = "end_cursor"
            java.lang.String r3 = X.C90474aD.A0e(r0, r3)     // Catch:{ JSONException -> 0x0ad1 }
            X.68m r0 = new X.68m     // Catch:{ JSONException -> 0x0ad1 }
            r0.<init>(r3)     // Catch:{ JSONException -> 0x0ad1 }
            X.69t r3 = new X.69t     // Catch:{ JSONException -> 0x0ad1 }
            r3.<init>(r0, r6)     // Catch:{ JSONException -> 0x0ad1 }
            X.68n r0 = new X.68n     // Catch:{ JSONException -> 0x0ad1 }
            r0.<init>(r3)     // Catch:{ JSONException -> 0x0ad1 }
            r12.add(r0)     // Catch:{ JSONException -> 0x0ad1 }
            int r2 = r2 + 1
            goto L_0x09c5
        L_0x0ac9:
            X.68o r0 = new X.68o     // Catch:{ JSONException -> 0x0ad1 }
            r0.<init>(r12)     // Catch:{ JSONException -> 0x0ad1 }
            r1.A00 = r0     // Catch:{ JSONException -> 0x0ad1 }
            return
        L_0x0ad1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PersonalizedAvatarGetMetadataDataProcessor/processResponse failed to parse parameters json: "
            X.C36321k7.A1J(r2, r0, r1)
            return
        L_0x0adc:
            java.lang.String r0 = "xwa_delete__WAAvatarArtifacts"
            org.json.JSONObject r2 = r4.getJSONObject(r0)     // Catch:{ JSONException -> 0x0af6 }
            java.lang.String r0 = "avatar_id"
            java.lang.String r3 = r2.getString(r0)     // Catch:{ JSONException -> 0x0af6 }
            java.lang.String r0 = "deletion_detail"
            java.lang.String r2 = r2.optString(r0)     // Catch:{ JSONException -> 0x0af6 }
            X.69s r0 = new X.69s     // Catch:{ JSONException -> 0x0af6 }
            r0.<init>(r3, r2)     // Catch:{ JSONException -> 0x0af6 }
            r1.A00 = r0     // Catch:{ JSONException -> 0x0af6 }
            return
        L_0x0af6:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PersonalizedAvatarDeleteEffectDataProcessor/processResponse failed to parse parameters json: "
            X.C36321k7.A1J(r2, r0, r1)
            return
        L_0x0b01:
            java.lang.String r0 = "arclass_lookup"
            org.json.JSONObject r2 = r4.getJSONObject(r0)     // Catch:{ JSONException -> 0x0b2f }
            java.lang.String r0 = "values"
            org.json.JSONArray r5 = r2.getJSONArray(r0)     // Catch:{ JSONException -> 0x0b2f }
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x0b2f }
            r3 = 0
            int r2 = r5.length()     // Catch:{ JSONException -> 0x0b2f }
        L_0x0b16:
            if (r3 >= r2) goto L_0x0b22
            int r0 = r5.getInt(r3)     // Catch:{ JSONException -> 0x0b2f }
            X.AnonymousClass000.A1F(r4, r0)     // Catch:{ JSONException -> 0x0b2f }
            int r3 = r3 + 1
            goto L_0x0b16
        L_0x0b22:
            X.68k r2 = new X.68k     // Catch:{ JSONException -> 0x0b2f }
            r2.<init>(r4)     // Catch:{ JSONException -> 0x0b2f }
            X.68l r0 = new X.68l     // Catch:{ JSONException -> 0x0b2f }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x0b2f }
            r1.A00 = r0     // Catch:{ JSONException -> 0x0b2f }
            return
        L_0x0b2f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PersonalizedAvatarGetARClassDataProcessor/processResponse Failed to process response: "
            X.C36321k7.A1J(r2, r0, r1)
            return
        L_0x0b3a:
            boolean r0 = r1 instanceof X.C1044359r
            if (r0 == 0) goto L_0x0c8d
            r8 = 0
            X.AnonymousClass00C.A0D(r4, r8)
            java.lang.String r0 = "xwa_search_businesses"
            org.json.JSONObject r2 = r4.getJSONObject(r0)
            java.lang.String r0 = "see_more"
            boolean r20 = r2.optBoolean(r0, r8)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "businesses"
            org.json.JSONArray r19 = r2.getJSONArray(r0)
            int r15 = r19.length()
        L_0x0b5c:
            if (r8 >= r15) goto L_0x0c83
            r0 = r19
            org.json.JSONObject r9 = r0.getJSONObject(r8)
            java.lang.String r0 = "id"
            java.lang.String r14 = r9.getString(r0)
            java.lang.String r0 = "jid"
            java.lang.String r13 = r9.getString(r0)
            java.lang.String r0 = "name"
            java.lang.String r12 = r9.getString(r0)
            java.lang.String r0 = "business_ranking_id"
            java.lang.String r32 = r9.optString(r0)
            java.lang.String r0 = "verified_level"
            int r18 = r9.optInt(r0)
            java.lang.String r0 = "ui_data"
            org.json.JSONObject r3 = r9.optJSONObject(r0)
            java.lang.String r0 = "ig_follower_count"
            java.lang.Object r6 = r9.opt(r0)
            if (r6 == 0) goto L_0x0c80
            java.lang.Object r0 = org.json.JSONObject.NULL
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0c80
            java.lang.Integer r6 = (java.lang.Integer) r6
        L_0x0b9a:
            java.lang.String r0 = "fb_follower_count"
            java.lang.Object r5 = r9.opt(r0)
            if (r5 == 0) goto L_0x0c7d
            java.lang.Object r0 = org.json.JSONObject.NULL
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0c7d
            java.lang.Integer r5 = (java.lang.Integer) r5
        L_0x0bac:
            java.lang.String r0 = "is_welcome_banner_eligible"
            boolean r34 = r9.optBoolean(r0)
            java.lang.String r0 = "biz_creation_date"
            java.lang.Object r10 = r9.opt(r0)
            if (r10 == 0) goto L_0x0c7a
            java.lang.Object r0 = org.json.JSONObject.NULL
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0c7a
            java.lang.String r10 = (java.lang.String) r10
        L_0x0bc4:
            r30 = 0
            if (r10 == 0) goto L_0x0bef
            X.660 r0 = X.AnonymousClass6XI.A01     // Catch:{ ParseException -> 0x0bdd }
            java.lang.Object r0 = r0.A01()     // Catch:{ ParseException -> 0x0bdd }
            java.text.DateFormat r0 = (java.text.DateFormat) r0     // Catch:{ ParseException -> 0x0bdd }
            java.util.Date r0 = r0.parse(r10)     // Catch:{ ParseException -> 0x0bdd }
            long r16 = r0.getTime()     // Catch:{ ParseException -> 0x0bdd }
            java.lang.String r30 = java.lang.String.valueOf(r16)     // Catch:{ ParseException -> 0x0bdd }
            goto L_0x0bef
        L_0x0bdd:
            r4 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Date string '"
            r2.append(r0)
            r2.append(r10)
            java.lang.String r0 = "' not in format of <yyyy-MM-dd>"
            X.C36351kA.A1Q(r0, r2, r4)
        L_0x0bef:
            if (r3 == 0) goto L_0x0c56
            java.lang.String r0 = "subtitle"
            r31 = 0
            java.lang.String r2 = r3.optString(r0)
            if (r2 == 0) goto L_0x0c0b
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0c0b
            java.lang.String r0 = "null"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0c0b
            r31 = r2
        L_0x0c0b:
            java.lang.String r0 = "location"
            org.json.JSONObject r2 = r9.optJSONObject(r0)
            if (r2 == 0) goto L_0x0c51
            java.lang.String r0 = "latitude"
            java.lang.Double r22 = X.C90504aG.A0b(r0, r2)
            java.lang.String r0 = "longitude"
            java.lang.Double r23 = X.C90504aG.A0b(r0, r2)
        L_0x0c1f:
            if (r3 == 0) goto L_0x0c4f
            java.lang.String r0 = "verified_name_highlight_ranges"
            org.json.JSONArray r9 = r3.optJSONArray(r0)
        L_0x0c27:
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            if (r9 == 0) goto L_0x0c59
            r4 = 0
            int r10 = r9.length()
        L_0x0c32:
            if (r4 >= r10) goto L_0x0c59
            org.json.JSONObject r2 = r9.getJSONObject(r4)
            java.lang.String r0 = "start"
            int r3 = r2.getInt(r0)
            java.lang.String r0 = "end"
            int r2 = r2.getInt(r0)
            X.69n r0 = new X.69n
            r0.<init>(r3, r2)
            r11.add(r0)
            int r4 = r4 + 1
            goto L_0x0c32
        L_0x0c4f:
            r9 = 0
            goto L_0x0c27
        L_0x0c51:
            r22 = 0
            r23 = 0
            goto L_0x0c1f
        L_0x0c56:
            r31 = 0
            goto L_0x0c0b
        L_0x0c59:
            X.C90474aD.A1A(r14, r13, r12)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r18)
            X.6E6 r0 = new X.6E6
            r25 = r6
            r26 = r5
            r27 = r14
            r28 = r13
            r29 = r12
            r33 = r11
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r7.add(r0)
            int r8 = r8 + 1
            goto L_0x0b5c
        L_0x0c7a:
            r10 = 0
            goto L_0x0bc4
        L_0x0c7d:
            r5 = 0
            goto L_0x0bac
        L_0x0c80:
            r6 = 0
            goto L_0x0b9a
        L_0x0c83:
            X.69o r2 = new X.69o
            r0 = r20
            r2.<init>(r7, r0)
            r1.A00 = r2
            return
        L_0x0c8d:
            boolean r0 = r1 instanceof X.AnonymousClass5AA
            if (r0 == 0) goto L_0x0d02
            X.5AA r1 = (X.AnonymousClass5AA) r1
            boolean r0 = r1 instanceof X.AnonymousClass50C
            if (r0 == 0) goto L_0x0cb4
            X.50C r1 = (X.AnonymousClass50C) r1
            java.lang.String r0 = "whatsapp_galaxy_forward_flow_data_response"
            org.json.JSONObject r4 = r4.getJSONObject(r0)
            java.lang.String r0 = "status_code"
            int r3 = r4.optInt(r0)
            r2 = 200(0xc8, float:2.8E-43)
            r0 = 1
            if (r3 != r2) goto L_0x0cab
            r0 = 0
        L_0x0cab:
            r1.A00 = r0
            java.lang.String r0 = "payload"
            java.lang.String r0 = r4.getString(r0)
            goto L_0x0cff
        L_0x0cb4:
            r2 = r37
            java.lang.String r0 = r1.A04(r2)
            org.json.JSONObject r2 = r4.getJSONObject(r0)
            java.lang.String r0 = "payload"
            java.lang.String r0 = r2.getString(r0)
            goto L_0x0cff
        L_0x0cc5:
            java.lang.String r0 = "purpose_public_ek"
            java.lang.String r0 = r5.getString(r0)
            r4 = 8
            byte[] r8 = android.util.Base64.decode(r0, r4)
            java.lang.String r0 = "purpose_public_ik"
            byte[] r9 = X.C90514aH.A1b(r0, r5, r4)
            java.lang.String r0 = "purpose_public_ik_sig"
            java.lang.String r6 = r5.getString(r0)
            java.lang.String r0 = "purpose_public_ik_enc_certificate"
            java.lang.String r7 = r5.getString(r0)
            java.lang.String r0 = "purpose_dummy_ciphertext"
            byte[] r10 = X.C90514aH.A1b(r0, r5, r4)
            java.lang.String r0 = "purpose_dummy_nonce"
            byte[] r11 = X.C90514aH.A1b(r0, r5, r4)
            X.C90474aD.A1A(r8, r9, r6)
            X.C90474aD.A1A(r7, r10, r11)
            X.6Dl r5 = new X.6Dl
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.6Bo r0 = new X.6Bo
            r0.<init>(r5, r3, r2)
        L_0x0cff:
            r1.A00 = r0
        L_0x0d01:
            return
        L_0x0d02:
            boolean r0 = r1 instanceof X.C1044259q
            if (r0 == 0) goto L_0x0d2e
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.String r0 = "ar_scripting_modules_package_download"
            org.json.JSONObject r2 = r4.getJSONObject(r0)     // Catch:{ JSONException -> 0x0d27 }
            java.lang.String r0 = "revision"
            int r3 = r2.getInt(r0)     // Catch:{ JSONException -> 0x0d27 }
            java.lang.String r0 = "cdn_uri"
            java.lang.String r2 = r2.getString(r0)     // Catch:{ JSONException -> 0x0d27 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ JSONException -> 0x0d27 }
            X.69a r0 = new X.69a     // Catch:{ JSONException -> 0x0d27 }
            r0.<init>(r3, r2)     // Catch:{ JSONException -> 0x0d27 }
            r1.A00 = r0     // Catch:{ JSONException -> 0x0d27 }
            return
        L_0x0d27:
            r1 = move-exception
            java.lang.String r0 = "ARDGetScriptingMetadataDataProcessor/processResponse Failed to parse data"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0d2e:
            r15 = 0
            X.AnonymousClass00C.A0D(r4, r15)
            java.lang.String r0 = "aim_model_batched_manifest"
            org.json.JSONObject r0 = r4.getJSONObject(r0)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r2 = "models"
            org.json.JSONArray r21 = r0.getJSONArray(r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.util.ArrayList r20 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            int r19 = r21.length()     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r6 = 0
        L_0x0d4a:
            r2 = r19
            if (r6 >= r2) goto L_0x0e95
            r2 = r21
            org.json.JSONObject r5 = r2.getJSONObject(r6)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.AnonymousClass00C.A0B(r5)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r2 = "assets"
            org.json.JSONArray r18 = r5.getJSONArray(r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            int r17 = r18.length()     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r4 = 0
            r3 = 0
        L_0x0d67:
            r2 = r17
            if (r3 >= r2) goto L_0x0e41
            r2 = r18
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "delta_cache"
            org.json.JSONArray r12 = r2.getJSONArray(r8)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.util.ArrayList r16 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            int r11 = r12.length()     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r14 = 0
            r10 = 0
        L_0x0d84:
            if (r10 >= r11) goto L_0x0da6
            org.json.JSONObject r9 = r12.getJSONObject(r10)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.AnonymousClass00C.A0B(r9)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "base_md5"
            java.lang.String r13 = X.C90474aD.A0e(r8, r9)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "delta_url"
            java.lang.String r8 = X.C90474aD.A0e(r8, r9)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.69X r9 = new X.69X     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r9.<init>(r13, r8)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r8 = r16
            r8.add(r9)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            int r10 = r10 + 1
            goto L_0x0d84
        L_0x0da6:
            X.5Tl[] r13 = X.C108425Tl.values()     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            int r12 = r13.length     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
        L_0x0dab:
            if (r14 >= r12) goto L_0x0e8d
            r24 = r13[r14]     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r11 = r24.name()     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "name"
            java.lang.String r10 = X.C90474aD.A0e(r8, r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r9 = "_"
            java.lang.String r8 = ""
            java.lang.String r8 = X.AnonymousClass098.A05(r10, r9, r8, r15)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            if (r11 == 0) goto L_0x0e39
            boolean r8 = r11.equalsIgnoreCase(r8)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            if (r8 == 0) goto L_0x0e39
            java.lang.String r8 = "id"
            java.lang.String r26 = X.C90474aD.A0e(r8, r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "cache_key"
            java.lang.String r27 = X.C90474aD.A0e(r8, r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "source_content_hash"
            java.lang.String r28 = X.C90474aD.A0e(r8, r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "md5_hash"
            java.lang.String r29 = X.C90474aD.A0e(r8, r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "asset_handle"
            java.lang.String r30 = X.C90474aD.A0e(r8, r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "creation_time"
            java.lang.String r31 = X.C90474aD.A0e(r8, r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "url"
            java.lang.String r32 = X.C90474aD.A0e(r8, r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "filesize_bytes"
            int r34 = r2.getInt(r8)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "compression_type"
            java.lang.String r8 = r2.getString(r8)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r23 = com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod.fromString(r8)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.AnonymousClass00C.A08(r23)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "metadata"
            org.json.JSONObject r2 = r2.getJSONObject(r8)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.AnonymousClass00C.A08(r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "bytecode_version"
            int r8 = r2.optInt(r8)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "file_name"
            java.lang.String r9 = X.C90474aD.A0e(r8, r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r8 = "operators"
            java.lang.String r2 = X.C90474aD.A0e(r8, r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.6B3 r8 = new X.6B3     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r8.<init>(r10, r9, r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.6E2 r2 = new X.6E2     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r22 = r2
            r25 = r8
            r33 = r16
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r7.add(r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            goto L_0x0e3d
        L_0x0e39:
            int r14 = r14 + 1
            goto L_0x0dab
        L_0x0e3d:
            int r3 = r3 + 1
            goto L_0x0d67
        L_0x0e41:
            java.lang.String r2 = "properties"
            org.json.JSONArray r11 = r5.getJSONArray(r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            int r10 = r11.length()     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
        L_0x0e4f:
            if (r4 >= r10) goto L_0x0e6f
            org.json.JSONObject r3 = r11.getJSONObject(r4)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.AnonymousClass00C.A0B(r3)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r2 = "name"
            java.lang.String r9 = X.C90474aD.A0e(r2, r3)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r2 = "value"
            java.lang.String r3 = X.C90474aD.A0e(r2, r3)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.69Y r2 = new X.69Y     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r2.<init>(r9, r3)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r8.add(r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            int r4 = r4 + 1
            goto L_0x0e4f
        L_0x0e6f:
            java.lang.String r2 = "name"
            java.lang.String r2 = X.C90474aD.A0e(r2, r5)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            com.facebook.cameracore.ardelivery.model.VersionedCapability r4 = com.facebook.cameracore.ardelivery.model.VersionedCapability.valueOf(r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r2 = "version"
            int r2 = r5.getInt(r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.6C4 r3 = new X.6C4     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r3.<init>(r4, r7, r8, r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r2 = r20
            r2.add(r3)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            int r6 = r6 + 1
            goto L_0x0d4a
        L_0x0e8d:
            java.lang.String r1 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            throw r0     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
        L_0x0e95:
            java.lang.String r2 = "entry_point"
            java.lang.String r2 = X.C90474aD.A0e(r2, r0)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.5St r3 = X.C108245St.valueOf(r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r2 = "asset_count"
            int r7 = r0.getInt(r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r2 = "model_count"
            int r8 = r0.getInt(r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r2 = "status"
            java.lang.String r2 = X.C90474aD.A0e(r2, r0)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.5Rd r4 = X.C107855Rd.valueOf(r2)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            java.lang.String r2 = "status_details"
            java.lang.String r5 = X.C90474aD.A0e(r2, r0)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            X.6D8 r2 = new X.6D8     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r6 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            r1.A00 = r2     // Catch:{ JSONException -> 0x0ec9, IllegalArgumentException -> 0x0ec5, NoSuchElementException -> 0x0ecd }
            return
        L_0x0ec5:
            r1 = move-exception
            java.lang.String r0 = "ARDGetModelMetadataDataProcessor/processResponse Likely invalid enum value"
            goto L_0x0ed0
        L_0x0ec9:
            r1 = move-exception
            java.lang.String r0 = "ARDGetModelMetadataDataProcessor/processResponse Failed to parse data"
            goto L_0x0ed0
        L_0x0ecd:
            r1 = move-exception
            java.lang.String r0 = "ARDGetModelMetadataDataProcessor/processResponse Invalid enum value"
        L_0x0ed0:
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1257160z.A03(org.json.JSONObject, long):void");
    }
}
