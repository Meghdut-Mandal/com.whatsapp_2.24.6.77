package X;

/* renamed from: X.5zi  reason: invalid class name and case insensitive filesystem */
public abstract class C125315zi {
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x022c, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        X.C05600Qi.A00(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0237, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0239, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        com.whatsapp.util.Log.e("gdrive-api-v2/backup/rename failed with exception", r1);
        r0 = new X.C101894yS(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0243, code lost:
        com.whatsapp.util.Log.e("gdrive-api-v2/backup/rename failed with exception", r1);
        r0 = new X.C101894yS(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x024b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02e0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02e3, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02e4, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x03e6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x03e7, code lost:
        if (r13 != null) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x03e9, code lost:
        r13.disconnect();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:23:0x0087, B:130:0x0252] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0237 A[ExcHandler: JSONException (r1v26 'e' org.json.JSONException A[CUSTOM_DECLARE]), Splitter:B:23:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0239 A[ExcHandler: IOException (r1v25 'e' java.io.IOException A[CUSTOM_DECLARE]), PHI: r13 
      PHI: (r13v2 javax.net.ssl.HttpsURLConnection) = (r13v1 javax.net.ssl.HttpsURLConnection), (r13v3 javax.net.ssl.HttpsURLConnection), (r13v3 javax.net.ssl.HttpsURLConnection), (r13v3 javax.net.ssl.HttpsURLConnection), (r13v3 javax.net.ssl.HttpsURLConnection), (r13v3 javax.net.ssl.HttpsURLConnection), (r13v3 javax.net.ssl.HttpsURLConnection), (r13v3 javax.net.ssl.HttpsURLConnection) binds: [B:23:0x0087, B:25:0x009b, B:119:0x022d, B:29:0x00c4, B:47:0x00f7, B:44:0x00ed, B:45:?, B:106:0x01cc] A[DONT_GENERATE, DONT_INLINE], Splitter:B:23:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02e0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:23:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(int r19) {
        /*
            r18 = this;
            r2 = r18
            boolean r0 = r2 instanceof X.C162697p0
            if (r0 == 0) goto L_0x0041
            X.7p0 r2 = (X.C162697p0) r2
            int r0 = r2.A03
            java.lang.Object r1 = r2.A02
            if (r0 == 0) goto L_0x002c
            X.65Q r1 = (X.AnonymousClass65Q) r1
            X.6Xi r3 = r1.A07
            java.lang.Object r6 = r2.A00
            X.6Te r6 = (X.C132346Te) r6
            java.lang.Object r7 = r2.A01
            X.6FR r7 = (X.AnonymousClass6FR) r7
            r0 = 1
            X.6YW r4 = new X.6YW
            r4.<init>(r1, r0)
            X.1el r5 = r1.A06
        L_0x0022:
            r8 = r19
            X.6Pk r1 = r3.A08(r4, r5, r6, r7, r8)
            r7.A02()
        L_0x002b:
            return r1
        L_0x002c:
            X.6VL r1 = (X.AnonymousClass6VL) r1
            r0 = 0
            X.6YW r4 = new X.6YW
            r4.<init>(r1, r0)
            X.6Xi r3 = r1.A0K
            java.lang.Object r6 = r2.A00
            X.6Te r6 = (X.C132346Te) r6
            java.lang.Object r7 = r2.A01
            X.6FR r7 = (X.AnonymousClass6FR) r7
            X.1el r5 = r1.A0J
            goto L_0x0022
        L_0x0041:
            boolean r0 = r2 instanceof X.C101674y6
            if (r0 == 0) goto L_0x004f
            X.4y6 r2 = (X.C101674y6) r2
            X.6pV r6 = new X.6pV
            r6.<init>(r2)
            r5 = 0
            goto L_0x0171
        L_0x004f:
            boolean r0 = r2 instanceof X.C101684y7
            if (r0 == 0) goto L_0x005c
            X.4y7 r2 = (X.C101684y7) r2
            java.lang.String r9 = "Having problems with local storage"
            r8 = 5
            r7 = 0
            r6 = 1
            goto L_0x019c
        L_0x005c:
            boolean r0 = r2 instanceof X.C101644y3
            if (r0 == 0) goto L_0x0126
            X.4y3 r2 = (X.C101644y3) r2
            X.6Te r4 = r2.A01
            java.lang.String r5 = r2.A02
            java.lang.String r6 = "name"
            java.lang.String r7 = "backup"
            java.lang.String r3 = "gdrive-api-v2/backup/rename failed with exception"
            X.6Xi r9 = r4.A08
            boolean r0 = r9.A0D()
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "gdrive-api-v2/rename-backup/api disabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0079:
            r0 = 0
        L_0x007a:
            if (r0 == 0) goto L_0x0367
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L_0x007f:
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            r13 = 0
            java.lang.String r10 = "POST"
            java.lang.StringBuilder r1 = X.C101664y5.A00(r4)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237, all -> 0x02e0 }
            java.lang.String r0 = ":rename"
            java.lang.String r11 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237, all -> 0x02e0 }
            java.lang.String r12 = "application/json; charset=UTF-8"
            r14 = 1
            X.AnonymousClass00C.A0D(r11, r14)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237, all -> 0x02e0 }
            javax.net.ssl.HttpsURLConnection r13 = r9.A09(r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237, all -> 0x02e0 }
            java.io.OutputStream r8 = r13.getOutputStream()     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x022a }
            java.lang.String r0 = "{\"newName\": \"clients/wa/backups/"
            r1.append(r0)     // Catch:{ all -> 0x022a }
            r1.append(r5)     // Catch:{ all -> 0x022a }
            java.lang.String r0 = "\"}"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x022a }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ all -> 0x022a }
            X.AnonymousClass00C.A09(r0)     // Catch:{ all -> 0x022a }
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ all -> 0x022a }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x022a }
            byte[] r0 = X.C36371kC.A1Z(r1, r0)     // Catch:{ all -> 0x022a }
            r8.write(r0)     // Catch:{ all -> 0x022a }
            r8.close()     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            int r8 = r13.getResponseCode()     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r8 == r0) goto L_0x00f7
            r0 = 409(0x199, float:5.73E-43)
            if (r8 == r0) goto L_0x0206
            r0 = 429(0x1ad, float:6.01E-43)
            r7 = 32
            java.lang.String r6 = "gdrive-api-v2/backup/rename weird status code: "
            if (r8 == r0) goto L_0x01f1
            r0 = 400(0x190, float:5.6E-43)
            if (r8 == r0) goto L_0x0206
            r0 = 401(0x191, float:5.62E-43)
            if (r8 == r0) goto L_0x00ed
            r0 = 403(0x193, float:5.65E-43)
            if (r8 == r0) goto L_0x0231
            r0 = 404(0x194, float:5.66E-43)
            if (r8 == r0) goto L_0x01e1
            goto L_0x01cc
        L_0x00ed:
            r9.A0C()     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0079
        L_0x00f7:
            java.io.InputStream r0 = r13.getInputStream()     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            org.json.JSONObject r1 = X.AnonymousClass14X.A01(r0)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            if (r1 == 0) goto L_0x0225
            boolean r0 = r1.has(r7)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            if (r0 == 0) goto L_0x0217
            org.json.JSONObject r1 = r1.getJSONObject(r7)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            boolean r0 = r1.has(r6)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            if (r0 == 0) goto L_0x0217
            java.lang.String r0 = r1.getString(r6)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            X.C18740tg.A06(r0)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            r4.A01 = r0     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r0 = 1
            goto L_0x007a
        L_0x0126:
            boolean r0 = r2 instanceof X.C162687oz
            if (r0 == 0) goto L_0x0146
            X.7oz r2 = (X.C162687oz) r2
            int r0 = r2.A02
            if (r0 == 0) goto L_0x02f3
            java.lang.Object r8 = r2.A00
            X.6Xi r8 = (X.C133226Xi) r8
            java.lang.String r11 = r2.A01
            java.lang.String r5 = "GoogleBackupApi/create-backup/failed "
            r2 = 0
            boolean r0 = r8.A0D()
            r15 = 0
            if (r0 == 0) goto L_0x024c
            java.lang.String r0 = "GoogleBackupApi/create-backup/api disabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r15
        L_0x0146:
            boolean r0 = r2 instanceof X.C162677oy
            if (r0 == 0) goto L_0x015d
            X.7oy r2 = (X.C162677oy) r2
            int r0 = r2.A02
            if (r0 == 0) goto L_0x0305
            java.lang.Object r5 = r2.A00
            X.6Te r5 = (X.C132346Te) r5
            X.6Xi r4 = r5.A08
            java.lang.String r3 = r5.A0A
            java.lang.String r2 = r2.A01
            monitor-enter(r5)
            goto L_0x02fe
        L_0x015d:
            boolean r0 = r2 instanceof X.C101584xx
            if (r0 == 0) goto L_0x0317
            X.4xx r2 = (X.C101584xx) r2
            X.6Xi r0 = r2.A00
            boolean r0 = r0.A0C()
            r1 = 0
            if (r0 == 0) goto L_0x002b
            java.lang.Boolean r1 = X.C36371kC.A0m()
            return r1
        L_0x0171:
            java.lang.String r0 = "restore>RestoreAction/restore-messages/stage: save message store to device"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 4yM | 4yN -> 0x0189 }
            X.6Lu r0 = r2.A03     // Catch:{ 4yM | 4yN -> 0x0189 }
            X.6Xi r4 = r0.A07     // Catch:{ 4yM | 4yN -> 0x0189 }
            java.io.File r3 = r2.A04     // Catch:{ 4yM | 4yN -> 0x0189 }
            X.6Pk r1 = r2.A02     // Catch:{ 4yM | 4yN -> 0x0189 }
            X.1el r0 = r0.A06     // Catch:{ 4yM | 4yN -> 0x0189 }
            boolean r0 = r4.A0E(r6, r0, r1, r3)     // Catch:{ 4yM | 4yN -> 0x0189 }
            if (r0 == 0) goto L_0x0193
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ 4yM | 4yN -> 0x0189 }
            return r5
        L_0x0189:
            r3 = move-exception
            int r1 = r2.A00
            r0 = 5
            if (r1 > r0) goto L_0x0194
            int r0 = r1 + 1
            r2.A00 = r0
        L_0x0193:
            return r5
        L_0x0194:
            java.lang.String r1 = "Having problems with local storage during restore"
            X.4yT r0 = new X.4yT
            r0.<init>(r1, r3)
            throw r0
        L_0x019c:
            X.6Xi r5 = r2.A03     // Catch:{ 4yM -> 0x01bc, 4yN -> 0x01b1 }
            java.io.File r4 = r2.A05     // Catch:{ 4yM -> 0x01bc, 4yN -> 0x01b1 }
            X.6Pk r3 = r2.A04     // Catch:{ 4yM -> 0x01bc, 4yN -> 0x01b1 }
            X.7fU r1 = r2.A01     // Catch:{ 4yM -> 0x01bc, 4yN -> 0x01b1 }
            X.1el r0 = r2.A02     // Catch:{ 4yM -> 0x01bc, 4yN -> 0x01b1 }
            boolean r0 = r5.A0E(r1, r0, r3, r4)     // Catch:{ 4yM -> 0x01bc, 4yN -> 0x01b1 }
            if (r0 == 0) goto L_0x01cb
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)     // Catch:{ 4yM -> 0x01bc, 4yN -> 0x01b1 }
            return r7
        L_0x01b1:
            r1 = move-exception
            int r0 = r2.A00
            if (r0 <= r8) goto L_0x01c7
            X.4yT r0 = new X.4yT
            r0.<init>(r9, r1)
            throw r0
        L_0x01bc:
            r1 = move-exception
            int r0 = r2.A00
            if (r0 <= r8) goto L_0x01c7
            X.4yT r0 = new X.4yT
            r0.<init>(r9, r1)
            throw r0
        L_0x01c7:
            int r0 = r0 + 1
            r2.A00 = r0
        L_0x01cb:
            return r7
        L_0x01cc:
            java.lang.String r1 = X.C90474aD.A0h(r13)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r8, r6)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            r0.append(r7)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            X.C36321k7.A1Z(r0, r1)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            r0 = -1
            X.4yS r2 = new X.4yS     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            goto L_0x0224
        L_0x01e1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            java.lang.String r0 = "Failed to find backup "
            java.lang.String r0 = X.AnonymousClass000.A0l(r4, r0, r1)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            X.4yT r1 = new X.4yT     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            goto L_0x0236
        L_0x01f1:
            X.0yC r1 = r4.A09     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            r0 = 916(0x394, float:1.284E-42)
            boolean r1 = r1.A0E(r0)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            java.lang.String r0 = "rename-backup"
            X.AnonymousClass6UB.A02(r0, r13, r1)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            throw r0     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
        L_0x0206:
            java.lang.String r2 = X.C90474aD.A0h(r13)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            X.0wN r1 = r4.A06     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            java.lang.String r0 = "gdrive-api-v2/rename-backup"
            r1.A0E(r0, r2, r14)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            X.4yG r1 = new X.4yG     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            goto L_0x0236
        L_0x0217:
            java.lang.String r0 = "gdrive-api-v2/backup/rename failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            java.lang.String r1 = "unable to get new name"
            r0 = -1
            X.4yS r2 = new X.4yS     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
        L_0x0224:
            throw r2     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
        L_0x0225:
            java.lang.IllegalArgumentException r1 = X.C36381kD.A0k()     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            goto L_0x0236
        L_0x022a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x022c }
        L_0x022c:
            r1 = move-exception
            X.C05600Qi.A00(r8, r0)     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            goto L_0x0236
        L_0x0231:
            X.4yH r1 = new X.4yH     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
            r1.<init>()     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
        L_0x0236:
            throw r1     // Catch:{ IOException -> 0x0239, JSONException -> 0x0237 }
        L_0x0237:
            r1 = move-exception
            goto L_0x0243
        L_0x0239:
            r1 = move-exception
            com.whatsapp.util.Log.e(r3, r1)     // Catch:{ all -> 0x03e6 }
            X.4yS r0 = new X.4yS     // Catch:{ all -> 0x03e6 }
            r0.<init>(r1)     // Catch:{ all -> 0x03e6 }
            goto L_0x024b
        L_0x0243:
            com.whatsapp.util.Log.e(r3, r1)     // Catch:{ all -> 0x03e6 }
            X.4yS r0 = new X.4yS     // Catch:{ all -> 0x03e6 }
            r0.<init>(r1)     // Catch:{ all -> 0x03e6 }
        L_0x024b:
            throw r0     // Catch:{ all -> 0x03e6 }
        L_0x024c:
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            r3 = 1
            X.011[] r1 = new X.AnonymousClass011[r3]     // Catch:{ IOException -> 0x02e3, all -> 0x02e0 }
            java.lang.String r0 = "backupId"
            X.C36341k9.A1J(r0, r11, r1, r2)     // Catch:{ IOException -> 0x02e3, all -> 0x02e0 }
            java.util.LinkedHashMap r16 = X.C000400e.A08(r1)     // Catch:{ IOException -> 0x02e3, all -> 0x02e0 }
            java.lang.String r13 = "POST"
            java.lang.String r14 = "clients/wa/backups"
            r17 = 0
            r12 = r8
            javax.net.ssl.HttpsURLConnection r4 = r12.A09(r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x02e3, all -> 0x02e0 }
            int r1 = r4.getResponseCode()     // Catch:{ IOException -> 0x02de }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x02c4
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x02b3
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x02ac
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x029b
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0297
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ IOException -> 0x02de }
            int r0 = r4.getResponseCode()     // Catch:{ IOException -> 0x02de }
            X.C36351kA.A1R(r1, r0)     // Catch:{ IOException -> 0x02de }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r5)     // Catch:{ IOException -> 0x02de }
            java.lang.String r0 = X.C90474aD.A0h(r4)     // Catch:{ IOException -> 0x02de }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ IOException -> 0x02de }
            goto L_0x02d7
        L_0x0297:
            r8.A0C()     // Catch:{ IOException -> 0x02de }
            goto L_0x02d7
        L_0x029b:
            java.lang.String r2 = X.C90474aD.A0h(r4)     // Catch:{ IOException -> 0x02de }
            X.0wN r1 = r8.A03     // Catch:{ IOException -> 0x02de }
            java.lang.String r0 = "GoogleBackupApi/create-backup"
            r1.A0E(r0, r2, r3)     // Catch:{ IOException -> 0x02de }
            X.4yG r0 = new X.4yG     // Catch:{ IOException -> 0x02de }
            r0.<init>(r2)     // Catch:{ IOException -> 0x02de }
            goto L_0x02c3
        L_0x02ac:
            X.6Te r15 = r8.A07(r11)     // Catch:{ 4yF -> 0x02b1 }
            goto L_0x02d7
        L_0x02b1:
            r1 = move-exception
            goto L_0x02b9
        L_0x02b3:
            X.4yH r0 = new X.4yH     // Catch:{ IOException -> 0x02de }
            r0.<init>()     // Catch:{ IOException -> 0x02de }
            goto L_0x02c3
        L_0x02b9:
            java.lang.String r0 = "GoogleBackupApi/create-backup/failed to get one"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x02de }
            X.4yQ r0 = new X.4yQ     // Catch:{ IOException -> 0x02de }
            r0.<init>(r1)     // Catch:{ IOException -> 0x02de }
        L_0x02c3:
            throw r0     // Catch:{ IOException -> 0x02de }
        L_0x02c4:
            X.0yC r9 = r8.A07     // Catch:{ IOException -> 0x02de }
            X.0wN r5 = r8.A03     // Catch:{ IOException -> 0x02de }
            X.1Ck r7 = r8.A05     // Catch:{ IOException -> 0x02de }
            X.1Cn r6 = r8.A04     // Catch:{ IOException -> 0x02de }
            java.io.InputStream r10 = r4.getInputStream()     // Catch:{ IOException -> 0x02de }
            X.AnonymousClass00C.A08(r10)     // Catch:{ IOException -> 0x02de }
            X.6Te r15 = X.C109795Zd.A00(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x02de }
        L_0x02d7:
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r15
        L_0x02de:
            r1 = move-exception
            goto L_0x02e5
        L_0x02e0:
            r0 = move-exception
            goto L_0x03ec
        L_0x02e3:
            r1 = move-exception
            r4 = r15
        L_0x02e5:
            X.4yS r0 = new X.4yS     // Catch:{ all -> 0x02eb }
            r0.<init>(r1)     // Catch:{ all -> 0x02eb }
            throw r0     // Catch:{ all -> 0x02eb }
        L_0x02eb:
            r0 = move-exception
            if (r4 == 0) goto L_0x03ec
            r4.disconnect()
            goto L_0x03ec
        L_0x02f3:
            java.lang.Object r1 = r2.A00
            X.6Xi r1 = (X.C133226Xi) r1
            java.lang.String r0 = r2.A01
            X.6Te r15 = r1.A07(r0)
            return r15
        L_0x02fe:
            java.lang.String r1 = r5.A00     // Catch:{ all -> 0x0302 }
            monitor-exit(r5)
            goto L_0x0310
        L_0x0302:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0305:
            java.lang.Object r0 = r2.A00
            X.6Te r0 = (X.C132346Te) r0
            X.6Xi r4 = r0.A08
            java.lang.String r3 = r0.A0A
            java.lang.String r2 = r2.A01
            r1 = 0
        L_0x0310:
            r0 = 5000(0x1388, float:7.006E-42)
            android.util.Pair r1 = r4.A06(r3, r2, r1, r0)
            return r1
        L_0x0317:
            boolean r0 = r2 instanceof X.C101554xu
            if (r0 == 0) goto L_0x037b
            X.4xu r2 = (X.C101554xu) r2
            X.6VL r3 = r2.A00
            X.0yC r1 = r3.A0T
            r0 = 2997(0xbb5, float:4.2E-42)
            boolean r0 = r1.A0E(r0)
            java.util.List r2 = r2.A01
            X.1Q9 r1 = r3.A0R
            if (r0 != 0) goto L_0x035b
            java.io.File r0 = r1.A0J()
            r2.add(r0)
        L_0x0334:
            java.util.Iterator r3 = r2.iterator()
        L_0x0338:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0379
            java.io.File r2 = X.C90504aG.A0a(r3)
            if (r2 == 0) goto L_0x0338
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = "msgstore.db"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0338
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0338
            java.lang.Boolean r1 = X.C36371kC.A0m()
            return r1
        L_0x035b:
            r0 = 3
            java.util.List r0 = r1.A0O(r0)
            X.AnonymousClass00C.A08(r0)
            r2.addAll(r0)
            goto L_0x0334
        L_0x0367:
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            java.lang.String r0 = r2.A03
            X.C90494aF.A1H(r0, r5, r1)
            java.lang.String r0 = "gdrive-service/change-number-v2 failed to rename backup old name: %s, new name: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0379:
            r1 = 0
            return r1
        L_0x037b:
            X.4xv r2 = (X.C101564xv) r2
            X.6Xi r4 = r2.A01
            java.lang.String r3 = r2.A02
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "GoogleBackupApi/delete-backup/"
            X.C36321k7.A1Q(r2, r3, r0)
            boolean r0 = r4.A0D()
            r9 = 0
            if (r0 == 0) goto L_0x039b
            java.lang.String r0 = "GoogleBackupApi/delete-backup/api disabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0396:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            return r1
        L_0x039b:
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            r7 = 0
            java.lang.String r5 = "DELETE"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x03c2 }
            java.lang.String r0 = "clients/wa/backups/"
            java.lang.String r6 = X.AnonymousClass000.A0p(r0, r3, r1)     // Catch:{ IOException -> 0x03c2 }
            r0 = 1
            X.AnonymousClass00C.A0D(r6, r0)     // Catch:{ IOException -> 0x03c2 }
            r8 = r7
            javax.net.ssl.HttpsURLConnection r7 = r4.A09(r5, r6, r7, r8, r9)     // Catch:{ IOException -> 0x03c2 }
            int r1 = r7.getResponseCode()     // Catch:{ IOException -> 0x03c2 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x03c2 }
            X.C36321k7.A1T(r2, r0, r1)     // Catch:{ IOException -> 0x03c2 }
            goto L_0x03c7
        L_0x03c2:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x03df }
            goto L_0x03d0
        L_0x03c7:
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x03d9
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x03d0
            r9 = 1
        L_0x03d0:
            if (r7 == 0) goto L_0x03d5
            r7.disconnect()
        L_0x03d5:
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0396
        L_0x03d9:
            X.4yH r0 = new X.4yH     // Catch:{ IOException -> 0x03c2 }
            r0.<init>()     // Catch:{ IOException -> 0x03c2 }
            throw r0     // Catch:{ IOException -> 0x03c2 }
        L_0x03df:
            r0 = move-exception
            if (r7 == 0) goto L_0x03ec
            r7.disconnect()
            goto L_0x03ec
        L_0x03e6:
            r0 = move-exception
            if (r13 == 0) goto L_0x03ec
            r13.disconnect()
        L_0x03ec:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125315zi.A01(int):java.lang.Object");
    }
}
