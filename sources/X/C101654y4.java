package X;

/* renamed from: X.4y4  reason: invalid class name and case insensitive filesystem */
public final class C101654y4 extends C101664y5 {
    public final /* synthetic */ C19970wo A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C132346Te A03;

    public C101654y4(C132346Te r1, C19970wo r2, long j, long j2) {
        this.A01 = j;
        this.A00 = r2;
        this.A03 = r1;
        this.A02 = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0134, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        X.C05600Qi.A00(r11, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A01(int r18) {
        /*
            r17 = this;
            r6 = r17
            long r4 = r6.A01
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r0
            long r2 = r2.toSeconds(r4)
        L_0x0015:
            X.6Te r8 = r6.A03
            long r0 = r6.A02
            java.lang.String r4 = "gdrive-api-v2/backup/beginTransaction failed with exception"
            X.6Xi r7 = r8.A08
            boolean r5 = r7.A0D()
            if (r5 != 0) goto L_0x0186
            java.lang.String r5 = r8.A00
            r6 = 1
            if (r5 != 0) goto L_0x017e
            r5 = 13
            android.net.TrafficStats.setThreadStatsTag(r5)
            r9 = 0
            java.lang.String r11 = "POST"
            java.lang.StringBuilder r10 = X.C101664y5.A00(r8)     // Catch:{ IOException -> 0x015a, JSONException -> 0x0157, all -> 0x0155 }
            java.lang.String r5 = ":beginTransaction"
            java.lang.String r5 = X.AnonymousClass000.A0q(r5, r10)     // Catch:{ IOException -> 0x015a, JSONException -> 0x0157, all -> 0x0155 }
            java.lang.String r13 = "application/json; charset=UTF-8"
            X.AnonymousClass00C.A0D(r5, r6)     // Catch:{ IOException -> 0x015a, JSONException -> 0x0157, all -> 0x0155 }
            r15 = 1
            r12 = r5
            r14 = r9
            r10 = r7
            javax.net.ssl.HttpsURLConnection r5 = r10.A09(r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x015a, JSONException -> 0x0157, all -> 0x0155 }
            java.io.OutputStream r11 = r5.getOutputStream()     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            X.0yC r10 = r8.A09     // Catch:{ all -> 0x0132 }
            X.1Cn r13 = r8.A07     // Catch:{ all -> 0x0132 }
            boolean r16 = X.AnonymousClass6YN.A0A(r13, r10)     // Catch:{ all -> 0x0132 }
            boolean r15 = X.AnonymousClass000.A1P(r16)
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0132 }
            java.lang.String r12 = ",\"axolotlMode\":\""
            r14.append(r12)     // Catch:{ all -> 0x0132 }
            r14.append(r15)     // Catch:{ all -> 0x0132 }
            r15 = 34
            java.lang.String r14 = X.AnonymousClass000.A0t(r14, r15)     // Catch:{ all -> 0x0132 }
            if (r16 == 0) goto L_0x007c
            boolean r12 = r13.A08()     // Catch:{ all -> 0x0132 }
            if (r12 != 0) goto L_0x007c
            X.00T r12 = r13.A01     // Catch:{ all -> 0x0132 }
            android.content.SharedPreferences$Editor r13 = X.C36351kA.A0A(r12)     // Catch:{ all -> 0x0132 }
            java.lang.String r12 = "backup_enforcement_flag_sent_to_google"
            X.C36331k8.A0w(r13, r12, r6)     // Catch:{ all -> 0x0132 }
        L_0x007c:
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0132 }
            java.lang.String r12 = "gdrive-api-v2/beginTransaction/extraOptions: "
            X.C36321k7.A1Q(r12, r14, r13)     // Catch:{ all -> 0x0132 }
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0132 }
            java.lang.String r13 = "{\"options\":{\"mode\":\"READ_WRITE\",\"estimatedDeltaBytes\":\""
            r12.append(r13)     // Catch:{ all -> 0x0132 }
            r12.append(r0)     // Catch:{ all -> 0x0132 }
            r12.append(r15)     // Catch:{ all -> 0x0132 }
            r12.append(r14)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "},\"retryCount\":\""
            r12.append(r0)     // Catch:{ all -> 0x0132 }
            r0 = r18
            r12.append(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "\",\"deadline\":\""
            r12.append(r0)     // Catch:{ all -> 0x0132 }
            r13 = 0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ae
            r2 = 0
        L_0x00ae:
            r12.append(r2)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "s\"}"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r12)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ all -> 0x0132 }
            X.AnonymousClass00C.A09(r0)     // Catch:{ all -> 0x0132 }
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ all -> 0x0132 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0132 }
            byte[] r0 = X.C36371kC.A1Z(r1, r0)     // Catch:{ all -> 0x0132 }
            r11.write(r0)     // Catch:{ all -> 0x0132 }
            r11.close()     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            int r1 = r5.getResponseCode()     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x011a
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x0114
            r0 = 429(0x1ad, float:6.01E-43)
            java.lang.String r2 = "gdrive-api-v2/backup/begin-transaction/failed "
            if (r1 == r0) goto L_0x0139
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x0103
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x00ff
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r2)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            int r0 = r5.getResponseCode()     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            X.C36351kA.A1R(r1, r0)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r2)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            java.lang.String r0 = X.C90474aD.A0h(r5)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            goto L_0x0180
        L_0x00ff:
            r7.A0C()     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            goto L_0x0180
        L_0x0103:
            java.lang.String r2 = X.C90474aD.A0h(r5)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            X.0wN r1 = r8.A06     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            java.lang.String r0 = "gdrive-api-v2/backup/begin-transaction"
            r1.A0E(r0, r2, r6)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            X.4yG r1 = new X.4yG     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            goto L_0x0150
        L_0x0114:
            X.4yH r1 = new X.4yH     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            r1.<init>()     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            goto L_0x0150
        L_0x011a:
            java.io.InputStream r0 = r5.getInputStream()     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            org.json.JSONObject r1 = X.AnonymousClass14X.A01(r0)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            if (r1 == 0) goto L_0x012d
            java.lang.String r0 = "id"
            java.lang.String r0 = X.AnonymousClass6HO.A01(r0, r9, r1)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            r8.A00 = r0     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            goto L_0x0178
        L_0x012d:
            java.lang.IllegalArgumentException r1 = X.C36381kD.A0k()     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            goto L_0x0150
        L_0x0132:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            X.C05600Qi.A00(r11, r0)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            goto L_0x0150
        L_0x0139:
            r0 = 916(0x394, float:1.284E-42)
            boolean r2 = r10.A0E(r0)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            java.lang.String r1 = "begin-transaction"
            X.5Ae r0 = new X.5Ae     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            X.AnonymousClass6UB.A00(r0, r1, r2)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
        L_0x0150:
            throw r1     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
        L_0x0151:
            r1 = move-exception
            goto L_0x0165
        L_0x0153:
            r1 = move-exception
            goto L_0x015c
        L_0x0155:
            r0 = move-exception
            goto L_0x0174
        L_0x0157:
            r1 = move-exception
            r5 = r9
            goto L_0x0165
        L_0x015a:
            r1 = move-exception
            r5 = r9
        L_0x015c:
            com.whatsapp.util.Log.e(r4, r1)     // Catch:{ all -> 0x016e }
            X.4yS r0 = new X.4yS     // Catch:{ all -> 0x016e }
            r0.<init>(r1)     // Catch:{ all -> 0x016e }
            goto L_0x016d
        L_0x0165:
            com.whatsapp.util.Log.e(r4, r1)     // Catch:{ all -> 0x016e }
            X.4yS r0 = new X.4yS     // Catch:{ all -> 0x016e }
            r0.<init>(r1)     // Catch:{ all -> 0x016e }
        L_0x016d:
            throw r0     // Catch:{ all -> 0x016e }
        L_0x016e:
            r0 = move-exception
            if (r5 == 0) goto L_0x0174
            r5.disconnect()
        L_0x0174:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0178:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x017e:
            r1 = 1
            goto L_0x0187
        L_0x0180:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x0186:
            r1 = 0
        L_0x0187:
            r0 = 0
            if (r1 == 0) goto L_0x018e
            java.lang.Boolean r0 = X.C36371kC.A0m()
        L_0x018e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101654y4.A01(int):java.lang.Object");
    }
}
