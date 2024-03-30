package X;

public class ATQ implements C23059B2f {
    public final /* synthetic */ C180918md A00;

    public ATQ(C180918md r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r0 > 0) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0148, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0149, code lost:
        r5 = r15.A00;
        r5.A02.A00.A0D("StatusGraphql", "exception in handle iq response", r3);
        r5.A01(200, 417, (java.lang.String) null, 0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0167, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[ExcHandler: IllegalAccessException | NoSuchMethodException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:23:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0148 A[ExcHandler: NullPointerException | JSONException (r3v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BJS(X.C186198vZ r16) {
        /*
            r15 = this;
            r4 = 200(0xc8, float:2.8E-43)
            r0 = r16
            java.lang.String r0 = r0.A01     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            org.json.JSONObject r7 = X.C36441kJ.A1C(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            java.lang.String r0 = "errors"
            org.json.JSONArray r1 = r7.optJSONArray(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            java.lang.String r6 = "data"
            org.json.JSONObject r0 = r7.optJSONObject(r6)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            if (r1 != 0) goto L_0x001d
            if (r0 == 0) goto L_0x0043
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x003a
        L_0x001d:
            int r0 = r1.length()     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            if (r0 <= 0) goto L_0x0043
            r0 = 0
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            if (r1 == 0) goto L_0x0043
            java.lang.String r0 = "extensions"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            if (r1 == 0) goto L_0x0043
            java.lang.String r0 = "error_code"
            int r0 = r1.optInt(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            if (r0 <= 0) goto L_0x0043
        L_0x003a:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            boolean r14 = X.C36381kD.A1U(r0, r4)
            goto L_0x0054
        L_0x0043:
            X.8md r0 = r15.A00     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            X.9Nj r0 = r0.A02     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            X.0wN r3 = r0.A00     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            r2 = 1
            java.lang.String r1 = "StatusGraphql"
            java.lang.String r0 = "response object is null"
            r3.A0E(r1, r0, r2)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            r0 = 417(0x1a1, float:5.84E-43)
            goto L_0x003a
        L_0x0054:
            r11 = 0
            r12 = 0
            if (r14 != 0) goto L_0x00fb
            r5 = 0
            org.json.JSONObject r1 = r7.getJSONObject(r6)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            r8 = 0
            java.lang.Class<com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince> r2 = com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl.Xwa2UsersUpdatesSince.class
            java.lang.String r0 = "xwa2_users_updates_since"
            org.json.JSONArray r7 = r1.optJSONArray(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            if (r7 == 0) goto L_0x0105
            r6 = 1
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0105, NullPointerException | JSONException -> 0x0148 }
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r1[r5] = r0     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0105, NullPointerException | JSONException -> 0x0148 }
            java.lang.reflect.Constructor r3 = r2.getConstructor(r1)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0105, NullPointerException | JSONException -> 0x0148 }
            X.8Hc r2 = new X.8Hc     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0105, NullPointerException | JSONException -> 0x0148 }
            r2.<init>()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0105, NullPointerException | JSONException -> 0x0148 }
            r1 = 0
        L_0x007a:
            int r0 = r7.length()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0105, NullPointerException | JSONException -> 0x0148 }
            if (r1 >= r0) goto L_0x0094
            org.json.JSONObject r9 = r7.optJSONObject(r1)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0105, NullPointerException | JSONException -> 0x0148 }
            if (r9 == 0) goto L_0x0091
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ InstantiationException | InvocationTargetException -> 0x0091, IllegalAccessException | NoSuchMethodException -> 0x0105 }
            r0[r5] = r9     // Catch:{ InstantiationException | InvocationTargetException -> 0x0091, IllegalAccessException | NoSuchMethodException -> 0x0105 }
            java.lang.Object r0 = r3.newInstance(r0)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0091, IllegalAccessException | NoSuchMethodException -> 0x0105 }
            r2.add((java.lang.Object) r0)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0091, IllegalAccessException | NoSuchMethodException -> 0x0105 }
        L_0x0091:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x0094:
            X.1Ak r8 = r2.build()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x0105, NullPointerException | JSONException -> 0x0148 }
            if (r8 == 0) goto L_0x0105
            int r0 = r8.size()     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            if (r0 <= r5) goto L_0x0105
            java.lang.Object r2 = r8.get(r5)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince r2 = (com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl.Xwa2UsersUpdatesSince) r2     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince$Updates> r1 = com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl.Xwa2UsersUpdatesSince.Updates.class
            java.lang.String r0 = "updates"
            X.1Ak r1 = r2.A04(r1, r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            if (r1 == 0) goto L_0x00fb
            int r0 = r1.size()     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            if (r0 <= r5) goto L_0x00fb
            java.lang.Object r0 = r1.get(r5)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince$Updates r0 = (com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl.Xwa2UsersUpdatesSince.Updates) r0     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            if (r0 == 0) goto L_0x0105
            org.json.JSONObject r2 = r0.A00     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            java.lang.String r0 = "__typename"
            java.lang.String r0 = r2.optString(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            int r1 = r0.hashCode()     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            r0 = 1315213878(0x4e649236, float:9.5869683E8)
            if (r1 != r0) goto L_0x00fb
            com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince$Updates$InlineXWA2UserStatusUpdate r1 = new com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl$Xwa2UsersUpdatesSince$Updates$InlineXWA2UserStatusUpdate     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            r1.<init>(r2)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            java.lang.String r0 = "dhash"
            java.lang.String r0 = r1.A07(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            long r12 = X.AnonymousClass6R8.A01(r0, r12)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            java.lang.String r0 = "text"
            java.lang.String r11 = r1.A07(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            if (r0 == 0) goto L_0x00fb
            X.8md r0 = r15.A00     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            X.9Nj r0 = r0.A02     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            X.0wG r0 = r0.A01     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            android.content.res.Resources r1 = X.C36421kH.A0B(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            r0 = 2131888648(0x7f120a08, float:1.9411937E38)
            java.lang.String r11 = r1.getString(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
        L_0x00fb:
            X.8md r8 = r15.A00     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            r8.A01(r9, r10, r11, r12, r14)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            return
        L_0x0105:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            java.lang.String r0 = "Unable to find status update at ("
            r2.append(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            r2.append(r5)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            java.lang.String r0 = ","
            r2.append(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            r2.append(r5)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            java.lang.String r0 = ") in response data. "
            r2.append(r0)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            if (r8 == 0) goto L_0x0121
            goto L_0x0124
        L_0x0121:
            java.lang.String r0 = "updateSince object is null."
            goto L_0x012c
        L_0x0124:
            int r0 = r8.size()     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            if (r0 <= r5) goto L_0x0136
            java.lang.String r0 = ""
        L_0x012c:
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r2)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            r0.<init>(r1)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            throw r0     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
        L_0x0136:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            java.lang.String r0 = "updateSince list size <= "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r5)     // Catch:{ NullPointerException | JSONException -> 0x0148, all -> 0x0141 }
            goto L_0x012c
        L_0x0141:
            r1 = move-exception
            X.19b r0 = new X.19b
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0148:
            r3 = move-exception
            X.8md r5 = r15.A00
            X.9Nj r0 = r5.A02
            X.0wN r2 = r0.A00
            java.lang.String r1 = "StatusGraphql"
            java.lang.String r0 = "exception in handle iq response"
            r2.A0D(r1, r0, r3)
            r11 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r0 = 417(0x1a1, float:5.84E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r8 = 0
            r9 = 0
            r5.A01(r6, r7, r8, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ATQ.BJS(X.8vZ):void");
    }

    public void BJT(C186278vh r3) {
        this.A00.A00(AnonymousClass3ME.A00(r3.A00));
    }

    public void BJU(C186118vR r3) {
        this.A00.A00(AnonymousClass3ME.A00(r3.A00));
    }
}
