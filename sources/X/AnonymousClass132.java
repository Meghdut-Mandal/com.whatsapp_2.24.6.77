package X;

/* renamed from: X.132  reason: invalid class name */
public class AnonymousClass132 {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036 A[Catch:{ IllegalArgumentException | JSONException -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003b A[Catch:{ IllegalArgumentException | JSONException -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e A[Catch:{ IllegalArgumentException | JSONException -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0043 A[Catch:{ IllegalArgumentException | JSONException -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0049 A[Catch:{ IllegalArgumentException | JSONException -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x007b A[Catch:{ IllegalArgumentException | JSONException -> 0x0081 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C1264463z A00(org.json.JSONArray r12) {
        /*
            int r0 = r12.length()
            r6 = 2
            r5 = 0
            if (r0 >= r6) goto L_0x0009
            return r5
        L_0x0009:
            r0 = 0
            int r11 = r12.getInt(r0)     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            r0 = 1
            java.lang.String r4 = r12.getString(r0)     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            if (r11 == 0) goto L_0x0016
            goto L_0x001b
        L_0x0016:
            java.lang.String r3 = r12.getString(r6)     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            goto L_0x001e
        L_0x001b:
            if (r11 == r6) goto L_0x0016
            r3 = r5
        L_0x001e:
            r2 = 3
            if (r11 != r6) goto L_0x0022
            goto L_0x0027
        L_0x0022:
            r1 = r5
            if (r11 == r6) goto L_0x002b
            r7 = r5
            goto L_0x0030
        L_0x0027:
            java.lang.String r1 = r12.getString(r2)     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
        L_0x002b:
            r0 = 4
            java.lang.String r7 = r12.getString(r0)     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
        L_0x0030:
            byte[] r8 = android.util.Base64.decode(r4, r2)     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            if (r3 == 0) goto L_0x003b
            byte[] r9 = android.util.Base64.decode(r3, r2)     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            goto L_0x003c
        L_0x003b:
            r9 = r5
        L_0x003c:
            if (r1 == 0) goto L_0x0043
            byte[] r10 = android.util.Base64.decode(r1, r2)     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            goto L_0x0044
        L_0x0043:
            r10 = r5
        L_0x0044:
            if (r8 == 0) goto L_0x007b
            int r0 = r8.length     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            if (r0 <= 0) goto L_0x007b
            X.63z r6 = new X.63z     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            int r1 = r6.A00     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            if (r1 != 0) goto L_0x005a
            byte[] r0 = r6.A03     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            if (r0 == 0) goto L_0x0074
            int r0 = r0.length     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            if (r0 <= 0) goto L_0x0074
            return r6
        L_0x005a:
            r0 = 2
            if (r1 != r0) goto L_0x007a
            byte[] r0 = r6.A03     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            if (r0 == 0) goto L_0x0074
            int r0 = r0.length     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            if (r0 <= 0) goto L_0x0074
            byte[] r0 = r6.A04     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            if (r0 == 0) goto L_0x0074
            int r0 = r0.length     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            if (r0 <= 0) goto L_0x0074
            java.lang.String r0 = r6.A01     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            if (r0 != 0) goto L_0x0074
            return r6
        L_0x0074:
            java.lang.String r0 = "KeyData/failed to parse json/key data not valid"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            return r5
        L_0x007a:
            return r6
        L_0x007b:
            java.lang.String r0 = "KeyData/failed to parse json/wrong data"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0083, IllegalArgumentException -> 0x0081 }
            return r5
        L_0x0081:
            r1 = move-exception
            goto L_0x0084
        L_0x0083:
            r1 = move-exception
        L_0x0084:
            java.lang.String r0 = "KeyData/failed to parse json"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass132.A00(org.json.JSONArray):X.63z");
    }
}
