package X;

import java.util.List;

/* renamed from: X.4xz  reason: invalid class name and case insensitive filesystem */
public final class C101604xz extends C101614y0 {
    public final /* synthetic */ C132346Te A00;
    public final /* synthetic */ C133226Xi A01;
    public final /* synthetic */ List A02;

    public C101604xz(C132346Te r1, C133226Xi r2, List list) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0140, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0144, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0147, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A01(int r15) {
        /*
            r14 = this;
            X.6Xi r8 = r14.A01
            X.6Te r7 = r14.A00
            java.util.List r2 = r14.A02
            java.lang.String r6 = "status"
            r13 = 1
            X.AnonymousClass00C.A0D(r2, r13)
            java.lang.String r4 = "GoogleBackupApi/delete-files "
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0198
            int r1 = r2.size()
            r0 = 2500(0x9c4, float:3.503E-42)
            if (r1 > r0) goto L_0x0182
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            r12 = 0
            java.lang.String r9 = "POST"
            java.lang.StringBuilder r1 = X.C101664y5.A00(r7)     // Catch:{ IOException -> 0x0171 }
            java.lang.String r0 = ":batchDeleteFiles"
            java.lang.String r10 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ IOException -> 0x0171 }
            java.lang.String r11 = "application/json; charset=UTF-8"
            X.AnonymousClass00C.A0D(r10, r13)     // Catch:{ IOException -> 0x0171 }
            javax.net.ssl.HttpsURLConnection r12 = r8.A09(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x0171 }
            java.io.OutputStream r3 = r12.getOutputStream()     // Catch:{ IOException -> 0x0171 }
            java.lang.String r1 = X.C19430v1.A0B     // Catch:{ all -> 0x0145 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0145 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0145 }
            android.util.JsonWriter r5 = new android.util.JsonWriter     // Catch:{ all -> 0x0145 }
            r5.<init>(r0)     // Catch:{ all -> 0x0145 }
            android.util.JsonWriter r1 = r5.beginObject()     // Catch:{ all -> 0x013e }
            java.lang.String r0 = "transactionId"
            android.util.JsonWriter r1 = r1.name(r0)     // Catch:{ all -> 0x013e }
            monitor-enter(r7)     // Catch:{ all -> 0x013e }
            java.lang.String r0 = r7.A00     // Catch:{ all -> 0x013b }
            monitor-exit(r7)     // Catch:{ all -> 0x013e }
            android.util.JsonWriter r1 = r1.value(r0)     // Catch:{ all -> 0x013e }
            java.lang.String r0 = "fileIds"
            android.util.JsonWriter r0 = r1.name(r0)     // Catch:{ all -> 0x013e }
            r0.beginArray()     // Catch:{ all -> 0x013e }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x013e }
        L_0x0066:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x013e }
            X.6Pk r0 = (X.C131526Pk) r0     // Catch:{ all -> 0x013e }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x013e }
            r5.value(r0)     // Catch:{ all -> 0x013e }
            goto L_0x0066
        L_0x0078:
            android.util.JsonWriter r0 = r5.endArray()     // Catch:{ all -> 0x013e }
            android.util.JsonWriter r0 = r0.endObject()     // Catch:{ all -> 0x013e }
            r0.flush()     // Catch:{ all -> 0x013e }
            r5.close()     // Catch:{ all -> 0x0145 }
            if (r3 == 0) goto L_0x008b
            r3.close()     // Catch:{ IOException -> 0x0171 }
        L_0x008b:
            int r5 = r12.getResponseCode()     // Catch:{ IOException -> 0x0171 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 == r0) goto L_0x00c5
            r0 = 401(0x191, float:5.62E-43)
            if (r5 == r0) goto L_0x00c1
            r0 = 403(0x193, float:5.65E-43)
            if (r5 == r0) goto L_0x00ba
            r1 = 429(0x1ad, float:6.01E-43)
            java.lang.String r2 = " statusLine "
            java.lang.String r0 = "GoogleBackupApi/delete-files status of the response is "
            java.lang.String r3 = "delete-files"
            if (r5 == r1) goto L_0x00a7
            goto L_0x014c
        L_0x00a7:
            X.0yC r1 = r8.A07     // Catch:{ IOException -> 0x0171 }
            r0 = 916(0x394, float:1.284E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ IOException -> 0x0171 }
            X.AnonymousClass6UB.A02(r3, r12, r0)     // Catch:{ IOException -> 0x0171 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x0171 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)     // Catch:{ IOException -> 0x0171 }
            throw r1     // Catch:{ IOException -> 0x0171 }
        L_0x00ba:
            X.4yH r0 = new X.4yH     // Catch:{ IOException -> 0x0171 }
            r0.<init>()     // Catch:{ IOException -> 0x0171 }
            goto L_0x0170
        L_0x00c1:
            r8.A0C()     // Catch:{ IOException -> 0x0171 }
            goto L_0x0133
        L_0x00c5:
            java.io.InputStream r0 = r12.getInputStream()     // Catch:{ IOException -> 0x012e }
            java.lang.String r3 = X.AnonymousClass14X.A00(r0)     // Catch:{ IOException -> 0x012e }
            if (r3 == 0) goto L_0x012e
            int r0 = r3.length()     // Catch:{ IOException -> 0x0171 }
            if (r0 == 0) goto L_0x012e
            org.json.JSONObject r1 = X.C36441kJ.A1C(r3)     // Catch:{ JSONException -> 0x0123 }
            boolean r0 = r1.has(r6)     // Catch:{ JSONException -> 0x0123 }
            if (r0 == 0) goto L_0x0133
            org.json.JSONObject r4 = r1.getJSONObject(r6)     // Catch:{ JSONException -> 0x0123 }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ JSONException -> 0x0123 }
        L_0x00e7:
            boolean r0 = r5.hasNext()     // Catch:{ JSONException -> 0x0123 }
            if (r0 == 0) goto L_0x0192
            java.lang.Object r0 = r5.next()     // Catch:{ JSONException -> 0x0123 }
            X.6Pk r0 = (X.C131526Pk) r0     // Catch:{ JSONException -> 0x0123 }
            java.lang.String r2 = r0.A06     // Catch:{ JSONException -> 0x0123 }
            boolean r0 = r4.has(r2)     // Catch:{ JSONException -> 0x0123 }
            if (r0 != 0) goto L_0x0105
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x0123 }
            java.lang.String r0 = "GoogleBackupApi/delete-files no status for "
            X.C36321k7.A1R(r0, r2, r1)     // Catch:{ JSONException -> 0x0123 }
            goto L_0x00e7
        L_0x0105:
            java.lang.String r1 = r4.getString(r2)     // Catch:{ JSONException -> 0x0123 }
            java.lang.String r0 = "OK"
            boolean r0 = r0.equals(r1)     // Catch:{ JSONException -> 0x0123 }
            if (r0 != 0) goto L_0x00e7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x0123 }
            java.lang.String r0 = "GoogleBackupApi/delete-files failed to delete "
            r1.append(r0)     // Catch:{ JSONException -> 0x0123 }
            r1.append(r2)     // Catch:{ JSONException -> 0x0123 }
            java.lang.String r0 = " status "
            X.C36321k7.A1L(r4, r0, r1)     // Catch:{ JSONException -> 0x0123 }
            goto L_0x00e7
        L_0x0123:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0171 }
            java.lang.String r0 = "GoogleBackupApi/delete-files malformed response"
            X.C90464aC.A1L(r0, r3, r1, r2)     // Catch:{ IOException -> 0x0171 }
            goto L_0x0133
        L_0x012e:
            java.lang.String r0 = "GoogleBackupApi/delete-files empty response"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0171 }
        L_0x0133:
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r1 = 0
            goto L_0x0199
        L_0x013b:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x013e }
            throw r0     // Catch:{ all -> 0x013e }
        L_0x013e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0140 }
        L_0x0140:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0145 }
            throw r0     // Catch:{ all -> 0x0145 }
        L_0x0145:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0147 }
        L_0x0147:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ IOException -> 0x0171 }
            goto L_0x0170
        L_0x014c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0171 }
            X.C36351kA.A1M(r0, r2, r1, r5)     // Catch:{ IOException -> 0x0171 }
            java.lang.String r0 = r12.getResponseMessage()     // Catch:{ IOException -> 0x0171 }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ IOException -> 0x0171 }
            java.lang.String r2 = X.C90474aD.A0h(r12)     // Catch:{ IOException -> 0x0171 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0171 }
            X.C36321k7.A1Q(r4, r2, r0)     // Catch:{ IOException -> 0x0171 }
            X.0wN r0 = r8.A03     // Catch:{ IOException -> 0x0171 }
            X.C109805Ze.A00(r0, r3, r5)     // Catch:{ IOException -> 0x0171 }
            r1 = -1
            X.4yS r0 = new X.4yS     // Catch:{ IOException -> 0x0171 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0171 }
        L_0x0170:
            throw r0     // Catch:{ IOException -> 0x0171 }
        L_0x0171:
            r1 = move-exception
            X.4yS r0 = new X.4yS     // Catch:{ all -> 0x0178 }
            r0.<init>(r1)     // Catch:{ all -> 0x0178 }
            throw r0     // Catch:{ all -> 0x0178 }
        L_0x0178:
            r0 = move-exception
            if (r12 == 0) goto L_0x017e
            r12.disconnect()
        L_0x017e:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0182:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Batch too big "
            X.C36371kC.A1R(r0, r1, r2)
            java.lang.String r0 = " max allowed 2500"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)
            throw r0
        L_0x0192:
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x0198:
            r1 = 1
        L_0x0199:
            r0 = 0
            if (r1 == 0) goto L_0x01a0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
        L_0x01a0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101604xz.A01(int):java.lang.Object");
    }
}
