package X;

/* renamed from: X.5Zy  reason: invalid class name and case insensitive filesystem */
public abstract class C110005Zy {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        r10.setSpan(r6, r1, r1 + r13, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass07P r19, X.C1271967i r20, X.C140456lc r21, X.C132376Ti r22) {
        /*
            java.lang.String r2 = "WaTextWithEntitiesComponentBinder"
            r0 = 43
            r4 = r19
            r3 = r20
            r5 = r21
            java.lang.Object r6 = X.C140456lc.A0I(r5, r0)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0166 }
            r0 = 42
            java.util.List r1 = r5.A0d(r0)     // Catch:{ JSONException -> 0x0166 }
            r0 = 35
            java.util.List r17 = r5.A0d(r0)     // Catch:{ JSONException -> 0x0166 }
            r0 = 38
            java.util.List r16 = r5.A0d(r0)     // Catch:{ JSONException -> 0x0166 }
            r0 = 41
            java.util.List r15 = r5.A0d(r0)     // Catch:{ JSONException -> 0x0166 }
            r11 = 0
            X.7qy r9 = new X.7qy     // Catch:{ JSONException -> 0x0166 }
            r9.<init>(r3, r5, r11)     // Catch:{ JSONException -> 0x0166 }
            r4.getContext()     // Catch:{ JSONException -> 0x0166 }
            android.content.Context r8 = r3.A00     // Catch:{ JSONException -> 0x0166 }
            if (r6 == 0) goto L_0x0178
            android.text.SpannableStringBuilder r10 = X.C36441kJ.A0P(r6)     // Catch:{ JSONException -> 0x0166 }
            if (r1 == 0) goto L_0x00ae
            java.util.Iterator r14 = r1.iterator()     // Catch:{ JSONException -> 0x0166 }
        L_0x003f:
            boolean r0 = r14.hasNext()     // Catch:{ JSONException -> 0x0166 }
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = X.AnonymousClass001.A0C(r14)     // Catch:{ JSONException -> 0x0166 }
            org.json.JSONObject r7 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r0 = "offset"
            int r1 = r7.getInt(r0)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r0 = "length"
            int r13 = r7.getInt(r0)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r6 = "inline_style"
            boolean r0 = r7.has(r6)     // Catch:{ JSONException -> 0x0166 }
            if (r0 != 0) goto L_0x0063
            java.lang.String r6 = "style"
        L_0x0063:
            java.lang.String r6 = r7.getString(r6)     // Catch:{ JSONException -> 0x0166 }
            int r0 = r6.hashCode()     // Catch:{ JSONException -> 0x0166 }
            r12 = 2
            r7 = 1
            switch(r0) {
                case -2125451728: goto L_0x007f;
                case 2044549: goto L_0x008d;
                case 1759631020: goto L_0x009b;
                case 2143721139: goto L_0x0071;
                default: goto L_0x0070;
            }     // Catch:{ JSONException -> 0x0166 }
        L_0x0070:
            goto L_0x003f
        L_0x0071:
            java.lang.String r0 = "STRIKETHROUGH"
            boolean r0 = r6.equals(r0)     // Catch:{ JSONException -> 0x0166 }
            if (r0 == 0) goto L_0x003f
            android.text.style.StrikethroughSpan r6 = new android.text.style.StrikethroughSpan     // Catch:{ JSONException -> 0x0166 }
            r6.<init>()     // Catch:{ JSONException -> 0x0166 }
            goto L_0x00a8
        L_0x007f:
            java.lang.String r0 = "ITALIC"
            boolean r0 = r6.equals(r0)     // Catch:{ JSONException -> 0x0166 }
            if (r0 == 0) goto L_0x003f
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan     // Catch:{ JSONException -> 0x0166 }
            r6.<init>(r12)     // Catch:{ JSONException -> 0x0166 }
            goto L_0x00a8
        L_0x008d:
            java.lang.String r0 = "BOLD"
            boolean r0 = r6.equals(r0)     // Catch:{ JSONException -> 0x0166 }
            if (r0 == 0) goto L_0x003f
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan     // Catch:{ JSONException -> 0x0166 }
            r6.<init>(r7)     // Catch:{ JSONException -> 0x0166 }
            goto L_0x00a8
        L_0x009b:
            java.lang.String r0 = "UNDERLINE"
            boolean r0 = r6.equals(r0)     // Catch:{ JSONException -> 0x0166 }
            if (r0 == 0) goto L_0x003f
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan     // Catch:{ JSONException -> 0x0166 }
            r6.<init>()     // Catch:{ JSONException -> 0x0166 }
        L_0x00a8:
            int r0 = r1 + r13
            r10.setSpan(r6, r1, r0, r11)     // Catch:{ JSONException -> 0x0166 }
            goto L_0x003f
        L_0x00ae:
            if (r17 == 0) goto L_0x00f0
            java.util.Iterator r13 = r17.iterator()     // Catch:{ JSONException -> 0x0166 }
        L_0x00b4:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x0166 }
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = X.AnonymousClass001.A0C(r13)     // Catch:{ JSONException -> 0x0166 }
            org.json.JSONObject r12 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r0 = "offset"
            int r6 = r12.getInt(r0)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r0 = "length"
            int r7 = r12.getInt(r0)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r1 = "hex_rgb_color_with_pound_key"
            boolean r0 = r12.has(r1)     // Catch:{ JSONException -> 0x0166 }
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = r12.getString(r1)     // Catch:{ JSONException -> 0x0166 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ JSONException -> 0x0166 }
        L_0x00de:
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan     // Catch:{ JSONException -> 0x0166 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0166 }
            int r0 = r6 + r7
            r10.setSpan(r1, r6, r0, r11)     // Catch:{ JSONException -> 0x0166 }
            goto L_0x00b4
        L_0x00e9:
            java.lang.String r0 = "color"
            int r0 = r12.getInt(r0)     // Catch:{ JSONException -> 0x0166 }
            goto L_0x00de
        L_0x00f0:
            if (r16 == 0) goto L_0x0134
            java.util.Iterator r14 = r16.iterator()     // Catch:{ JSONException -> 0x0166 }
        L_0x00f6:
            boolean r0 = r14.hasNext()     // Catch:{ JSONException -> 0x0166 }
            if (r0 == 0) goto L_0x0134
            java.lang.String r0 = X.AnonymousClass001.A0C(r14)     // Catch:{ JSONException -> 0x0166 }
            org.json.JSONObject r0 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x0166 }
            X.5sy r13 = new X.5sy     // Catch:{ JSONException -> 0x0166 }
            r13.<init>(r0)     // Catch:{ JSONException -> 0x0166 }
            r0 = r22
            X.17Y r12 = r0.A01     // Catch:{ JSONException -> 0x0166 }
            X.0yb r7 = r0.A05     // Catch:{ JSONException -> 0x0166 }
            X.1Du r1 = r0.A00     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r0 = r13.A02     // Catch:{ JSONException -> 0x0166 }
            X.21s r6 = new X.21s     // Catch:{ JSONException -> 0x0166 }
            r19 = r12
            r20 = r7
            r21 = r0
            r16 = r6
            r17 = r8
            r18 = r1
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ JSONException -> 0x0166 }
            X.6op r0 = new X.6op     // Catch:{ JSONException -> 0x0166 }
            r0.<init>(r9, r13)     // Catch:{ JSONException -> 0x0166 }
            r6.A02 = r0     // Catch:{ JSONException -> 0x0166 }
            int r1 = r13.A01     // Catch:{ JSONException -> 0x0166 }
            int r0 = r13.A00     // Catch:{ JSONException -> 0x0166 }
            int r0 = r0 + r1
            r10.setSpan(r6, r1, r0, r11)     // Catch:{ JSONException -> 0x0166 }
            goto L_0x00f6
        L_0x0134:
            if (r15 == 0) goto L_0x0175
            java.util.Iterator r12 = r15.iterator()     // Catch:{ JSONException -> 0x0166 }
        L_0x013a:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x0166 }
            if (r0 == 0) goto L_0x0175
            java.lang.String r0 = X.AnonymousClass001.A0C(r12)     // Catch:{ JSONException -> 0x0166 }
            org.json.JSONObject r1 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r0 = "offset"
            int r9 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r0 = "length"
            int r8 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r0 = "scale"
            double r6 = r1.getDouble(r0)     // Catch:{ JSONException -> 0x0166 }
            float r0 = (float) r6     // Catch:{ JSONException -> 0x0166 }
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan     // Catch:{ JSONException -> 0x0166 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0166 }
            int r0 = r9 + r8
            r10.setSpan(r1, r9, r0, r11)     // Catch:{ JSONException -> 0x0166 }
            goto L_0x013a
        L_0x0166:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "bind/exception parsing formatted string: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r6, r0, r1)
            X.AnonymousClass6RS.A01(r2, r0)
            goto L_0x0178
        L_0x0175:
            r4.setText(r10)
        L_0x0178:
            r0 = 44
            java.lang.Object r0 = X.C140456lc.A0I(r5, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0190
            int r0 = X.AnonymousClass6Y7.A06(r0)     // Catch:{ 5R5 -> 0x018a }
            r4.setGravity(r0)     // Catch:{ 5R5 -> 0x018a }
            goto L_0x0190
        L_0x018a:
            r1 = move-exception
            java.lang.String r0 = "Failed to parse textAlign"
            X.AnonymousClass6RS.A00(r3, r2, r0, r1)
        L_0x0190:
            r0 = 45
            java.lang.Object r0 = X.C140456lc.A0I(r5, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x01a8
            float r0 = X.AnonymousClass6Y7.A02(r0)     // Catch:{ 5R5 -> 0x01a2 }
            r4.setTextSize(r0)     // Catch:{ 5R5 -> 0x01a2 }
            goto L_0x01a8
        L_0x01a2:
            r1 = move-exception
            java.lang.String r0 = "Failed to parse text size"
            X.AnonymousClass6RS.A00(r3, r2, r0, r1)
        L_0x01a8:
            java.lang.String r0 = X.C140456lc.A0K(r5)
            if (r0 == 0) goto L_0x01bd
            float r0 = X.AnonymousClass6Y7.A01(r0)     // Catch:{ 5R5 -> 0x01b7 }
            int r0 = (int) r0     // Catch:{ 5R5 -> 0x01b7 }
            r4.setLineHeight(r0)     // Catch:{ 5R5 -> 0x01b7 }
            return
        L_0x01b7:
            r1 = move-exception
            java.lang.String r0 = "Failed to parse line height pixel value"
            X.AnonymousClass6RS.A00(r3, r2, r0, r1)
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110005Zy.A00(X.07P, X.67i, X.6lc, X.6Ti):void");
    }
}
