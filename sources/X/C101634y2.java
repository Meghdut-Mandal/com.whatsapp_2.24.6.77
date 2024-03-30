package X;

import java.util.Map;

/* renamed from: X.4y2  reason: invalid class name and case insensitive filesystem */
public final class C101634y2 extends C101664y5 {
    public final /* synthetic */ C132346Te A00;
    public final /* synthetic */ Map A01;

    public C101634y2(C132346Te r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fb, code lost:
        com.whatsapp.util.Log.e("gdrive-api-v2/processCommitTransactionSuccess/unexpected value of accountStorageBand");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0139, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013d, code lost:
        if (r0 == null) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013f, code lost:
        r8 = r0.intValue();
        r7 = r6.A07;
        r5 = r7.A01;
        r0 = X.C36411kG.A0E(r5).getInt("backup_account_storage_band", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0151, code lost:
        if (r8 == r0) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0155, code lost:
        if (r8 != 2) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0157, code lost:
        if (r0 >= r8) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015a, code lost:
        if (r8 != 3) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015c, code lost:
        if (r0 >= r8) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015e, code lost:
        X.C109775Zb.A00(r7, r6.A09, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0164, code lost:
        X.C109775Zb.A00(r7, r6.A09, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0169, code lost:
        X.C36341k9.A0v(X.C36351kA.A0A(r5), "backup_account_storage_band", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x017a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x017e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0181, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        X.C05600Qi.A00(r4, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A01(int r16) {
        /*
            r15 = this;
            X.6Te r6 = r15.A00
            java.util.Map r7 = r15.A01
            java.lang.String r2 = "metadata"
            X.6Xi r9 = r6.A08
            boolean r0 = r9.A0D()
            r1 = 0
            if (r0 != 0) goto L_0x01c6
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x01b9
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            r13 = 0
            java.lang.String r10 = "POST"
            java.lang.StringBuilder r3 = X.C101664y5.A00(r6)     // Catch:{ IOException -> 0x01a4, all -> 0x01a2 }
            java.lang.String r0 = ":commit"
            java.lang.String r11 = X.AnonymousClass000.A0q(r0, r3)     // Catch:{ IOException -> 0x01a4, all -> 0x01a2 }
            java.lang.String r12 = "application/json; charset=UTF-8"
            r14 = 1
            X.AnonymousClass00C.A0D(r11, r14)     // Catch:{ IOException -> 0x01a4, all -> 0x01a2 }
            javax.net.ssl.HttpsURLConnection r3 = r9.A09(r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x01a4, all -> 0x01a2 }
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ IOException -> 0x01a0 }
            java.lang.String r5 = X.C19430v1.A0B     // Catch:{ all -> 0x017f }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x017f }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x017f }
            android.util.JsonWriter r5 = new android.util.JsonWriter     // Catch:{ all -> 0x017f }
            r5.<init>(r0)     // Catch:{ all -> 0x017f }
            android.util.JsonWriter r8 = r5.beginObject()     // Catch:{ all -> 0x0178 }
            java.lang.String r0 = "transactionId"
            android.util.JsonWriter r8 = r8.name(r0)     // Catch:{ all -> 0x0178 }
            java.lang.String r0 = r6.A00     // Catch:{ all -> 0x0178 }
            r8.value(r0)     // Catch:{ all -> 0x0178 }
            if (r7 == 0) goto L_0x0073
            java.lang.String r0 = "updateMask"
            android.util.JsonWriter r0 = r5.name(r0)     // Catch:{ all -> 0x0178 }
            android.util.JsonWriter r8 = r0.value(r2)     // Catch:{ all -> 0x0178 }
            java.lang.String r0 = "backup"
            android.util.JsonWriter r0 = r8.name(r0)     // Catch:{ all -> 0x0178 }
            android.util.JsonWriter r0 = r0.beginObject()     // Catch:{ all -> 0x0178 }
            android.util.JsonWriter r2 = r0.name(r2)     // Catch:{ all -> 0x0178 }
            java.lang.String r0 = X.AnonymousClass6YN.A03(r7)     // Catch:{ all -> 0x0178 }
            android.util.JsonWriter r0 = r2.value(r0)     // Catch:{ all -> 0x0178 }
            r0.endObject()     // Catch:{ all -> 0x0178 }
        L_0x0073:
            android.util.JsonWriter r0 = r5.endObject()     // Catch:{ all -> 0x0178 }
            r0.flush()     // Catch:{ all -> 0x0178 }
            r5.close()     // Catch:{ all -> 0x017f }
            if (r4 == 0) goto L_0x0082
            r4.close()     // Catch:{ IOException -> 0x01a0 }
        L_0x0082:
            int r4 = r3.getResponseCode()     // Catch:{ IOException -> 0x01a0 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 == r0) goto L_0x00d2
            r0 = 403(0x193, float:5.65E-43)
            if (r4 == r0) goto L_0x00cb
            r0 = 429(0x1ad, float:6.01E-43)
            java.lang.String r2 = "gdrive-api-v2/commit-transaction/failed "
            if (r4 == r0) goto L_0x0186
            r0 = 400(0x190, float:5.6E-43)
            if (r4 == r0) goto L_0x00b9
            r0 = 401(0x191, float:5.62E-43)
            if (r4 == r0) goto L_0x00b4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r2)     // Catch:{ IOException -> 0x01a0 }
            int r0 = r3.getResponseCode()     // Catch:{ IOException -> 0x01a0 }
            X.C36351kA.A1R(r1, r0)     // Catch:{ IOException -> 0x01a0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r2)     // Catch:{ IOException -> 0x01a0 }
            java.lang.String r0 = X.C90474aD.A0h(r3)     // Catch:{ IOException -> 0x01a0 }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ IOException -> 0x01a0 }
            goto L_0x01c0
        L_0x00b4:
            r9.A0C()     // Catch:{ IOException -> 0x01a0 }
            goto L_0x01c0
        L_0x00b9:
            java.lang.String r2 = X.C90474aD.A0h(r3)     // Catch:{ IOException -> 0x01a0 }
            X.0wN r1 = r6.A06     // Catch:{ IOException -> 0x01a0 }
            java.lang.String r0 = "gdrive-api-v2/backup/commit-transaction"
            r1.A0E(r0, r2, r14)     // Catch:{ IOException -> 0x01a0 }
            X.4yG r1 = new X.4yG     // Catch:{ IOException -> 0x01a0 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01a0 }
            goto L_0x019f
        L_0x00cb:
            X.4yH r1 = new X.4yH     // Catch:{ IOException -> 0x01a0 }
            r1.<init>()     // Catch:{ IOException -> 0x01a0 }
            goto L_0x019f
        L_0x00d2:
            r6.A00 = r13     // Catch:{ IOException -> 0x01a0 }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ IOException -> 0x01a0 }
            java.lang.String r2 = X.AnonymousClass14X.A00(r0)     // Catch:{ IOException -> 0x01a0 }
            if (r2 == 0) goto L_0x0170
            int r0 = r2.length()     // Catch:{ IOException -> 0x01a0 }
            if (r0 == 0) goto L_0x0170
            org.json.JSONObject r4 = X.C36441kJ.A1C(r2)     // Catch:{ IOException -> 0x01a0 }
            java.lang.String r2 = "accountStorageBand"
            boolean r0 = r4.has(r2)     // Catch:{ IOException -> 0x01a0 }
            if (r0 == 0) goto L_0x0170
            java.lang.String r2 = X.C90474aD.A0e(r2, r4)     // Catch:{ IOException -> 0x01a0 }
            int r0 = r2.hashCode()     // Catch:{ IOException -> 0x01a0 }
            switch(r0) {
                case -1944125597: goto L_0x0101;
                case -965313033: goto L_0x010e;
                case -265801760: goto L_0x0117;
                case 377804822: goto L_0x0120;
                case 1649830023: goto L_0x0129;
                default: goto L_0x00fb;
            }     // Catch:{ IOException -> 0x01a0 }
        L_0x00fb:
            java.lang.String r0 = "gdrive-api-v2/processCommitTransactionSuccess/unexpected value of accountStorageBand"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x01a0 }
            goto L_0x0170
        L_0x0101:
            java.lang.String r0 = "ACCOUNT_STORAGE_BAND_UNSPECIFIED"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x01a0 }
            if (r0 == 0) goto L_0x00fb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x01a0 }
            goto L_0x013f
        L_0x010e:
            java.lang.String r0 = "ACCOUNT_STORAGE_PERCENT_100_AND_ABOVE"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x01a0 }
            if (r0 == 0) goto L_0x00fb
            goto L_0x0132
        L_0x0117:
            java.lang.String r0 = "ACCOUNT_STORAGE_PERCENT_FROM_90_BELOW_100"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x01a0 }
            if (r0 == 0) goto L_0x00fb
            goto L_0x0134
        L_0x0120:
            java.lang.String r0 = "ACCOUNT_STORAGE_PERCENT_BELOW_80"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x01a0 }
            if (r0 == 0) goto L_0x00fb
            goto L_0x0136
        L_0x0129:
            java.lang.String r0 = "ACCOUNT_STORAGE_PERCENT_FROM_80_BELOW_90"
            boolean r0 = r2.equals(r0)     // Catch:{ IOException -> 0x01a0 }
            if (r0 == 0) goto L_0x00fb
            goto L_0x0138
        L_0x0132:
            r0 = 4
            goto L_0x0139
        L_0x0134:
            r0 = 3
            goto L_0x0139
        L_0x0136:
            r0 = 1
            goto L_0x0139
        L_0x0138:
            r0 = 2
        L_0x0139:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01a0 }
            if (r0 == 0) goto L_0x0170
        L_0x013f:
            int r8 = r0.intValue()     // Catch:{ IOException -> 0x01a0 }
            X.1Cn r7 = r6.A07     // Catch:{ IOException -> 0x01a0 }
            X.00T r5 = r7.A01     // Catch:{ IOException -> 0x01a0 }
            android.content.SharedPreferences r0 = X.C36411kG.A0E(r5)     // Catch:{ IOException -> 0x01a0 }
            java.lang.String r4 = "backup_account_storage_band"
            int r0 = r0.getInt(r4, r1)     // Catch:{ IOException -> 0x01a0 }
            if (r8 == r0) goto L_0x0170
            r2 = 3
            r1 = 2
            if (r8 != r1) goto L_0x015a
            if (r0 >= r8) goto L_0x0169
            goto L_0x0164
        L_0x015a:
            if (r8 != r2) goto L_0x0169
            if (r0 >= r8) goto L_0x0169
            X.0yC r0 = r6.A09     // Catch:{ IOException -> 0x01a0 }
            X.C109775Zb.A00(r7, r0, r1)     // Catch:{ IOException -> 0x01a0 }
            goto L_0x0169
        L_0x0164:
            X.0yC r0 = r6.A09     // Catch:{ IOException -> 0x01a0 }
            X.C109775Zb.A00(r7, r0, r2)     // Catch:{ IOException -> 0x01a0 }
        L_0x0169:
            android.content.SharedPreferences$Editor r0 = X.C36351kA.A0A(r5)     // Catch:{ IOException -> 0x01a0 }
            X.C36341k9.A0v(r0, r4, r8)     // Catch:{ IOException -> 0x01a0 }
        L_0x0170:
            r3.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r1 = 1
            goto L_0x01c7
        L_0x0178:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x017a }
        L_0x017a:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x017f }
            throw r0     // Catch:{ all -> 0x017f }
        L_0x017f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0181 }
        L_0x0181:
            r1 = move-exception
            X.C05600Qi.A00(r4, r0)     // Catch:{ IOException -> 0x01a0 }
            goto L_0x019f
        L_0x0186:
            X.0yC r1 = r6.A09     // Catch:{ IOException -> 0x01a0 }
            r0 = 916(0x394, float:1.284E-42)
            boolean r2 = r1.A0E(r0)     // Catch:{ IOException -> 0x01a0 }
            java.lang.String r1 = "commit-transaction"
            X.5Ae r0 = new X.5Ae     // Catch:{ IOException -> 0x01a0 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x01a0 }
            X.AnonymousClass6UB.A00(r0, r1, r2)     // Catch:{ IOException -> 0x01a0 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x01a0 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)     // Catch:{ IOException -> 0x01a0 }
        L_0x019f:
            throw r1     // Catch:{ IOException -> 0x01a0 }
        L_0x01a0:
            r1 = move-exception
            goto L_0x01a6
        L_0x01a2:
            r0 = move-exception
            goto L_0x01b5
        L_0x01a4:
            r1 = move-exception
            r3 = r13
        L_0x01a6:
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x01af }
            X.4yS r0 = new X.4yS     // Catch:{ all -> 0x01af }
            r0.<init>(r1)     // Catch:{ all -> 0x01af }
            throw r0     // Catch:{ all -> 0x01af }
        L_0x01af:
            r0 = move-exception
            if (r3 == 0) goto L_0x01b5
            r3.disconnect()
        L_0x01b5:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x01b9:
            java.lang.String r0 = "No transaction to commit"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x01c0:
            r3.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x01c6:
            r1 = 0
        L_0x01c7:
            r0 = 0
            if (r1 == 0) goto L_0x01ce
            java.lang.Boolean r0 = X.C36371kC.A0m()
        L_0x01ce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101634y2.A01(int):java.lang.Object");
    }
}
