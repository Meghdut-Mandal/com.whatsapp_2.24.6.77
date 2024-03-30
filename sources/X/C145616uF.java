package X;

/* renamed from: X.6uF  reason: invalid class name and case insensitive filesystem */
public class C145616uF implements C159447jN {
    public final C20050ww A00;
    public final C20810yC A01;
    public final AnonymousClass6X1 A02;
    public final AnonymousClass1VS A03;
    public final C21080yd A04;
    public final C20020wt A05;
    public final AnonymousClass005 A06;
    public final C19600wD A07;
    public final C19970wo A08;
    public final AnonymousClass1J6 A09;

    public void Bpg(AnonymousClass1C9 r2, boolean z) {
        Bpi(r2, 0, z, false);
    }

    public void Bpi(AnonymousClass1C9 r7, int i, boolean z, boolean z2) {
        A00(r7, i, z, z2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x023e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if ((r10 - r5.A05.A05[r5.A02].A04) > 600) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0221, code lost:
        if (r29.size() <= 0) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0223, code lost:
        r49.A05(r29);
        r50.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022d, code lost:
        if (r56 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x022f, code lost:
        if (r4 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0231, code lost:
        A00(r50, r35, r38, r39, true);
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04cd A[LOOP:0: B:25:0x007e->B:212:0x04cd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0219 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0209  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass1C9 r52, int r53, boolean r54, boolean r55, boolean r56) {
        /*
            r51 = this;
            r2 = r51
            X.0wD r0 = r2.A07
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0064
            X.6X1 r3 = r2.A02
            int r1 = r3.A05()
            r0 = 2
            r4 = 0
            r7 = 1
            r50 = r52
            r38 = r54
            if (r1 == r0) goto L_0x0055
            r0 = 13
            if (r1 == r0) goto L_0x0055
            r0 = 15
            if (r1 == r0) goto L_0x0055
            if (r56 != 0) goto L_0x0055
            r0 = r50
            X.1CJ r6 = r0.A04
            boolean r0 = r6.A07()
            if (r0 != 0) goto L_0x0055
            boolean r0 = r50.A07()
            if (r0 != 0) goto L_0x0055
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r10 = r5.toSeconds(r0)
            r8 = 600(0x258, double:2.964E-321)
            if (r54 != 0) goto L_0x0052
            X.1CT r5 = r6.A00
            X.1CC r0 = r5.A05
            X.1CD[] r1 = r0.A05
            int r0 = r5.A02
            r0 = r1[r0]
            long r0 = r0.A04
            long r10 = r10 - r0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0055
        L_0x0052:
            r50.A04()
        L_0x0055:
            r0 = r50
            X.1CJ r0 = r0.A04
            r49 = r0
            boolean r0 = r49.A07()
            if (r0 != 0) goto L_0x0065
            r3.A06()
        L_0x0064:
            return
        L_0x0065:
            r0 = r50
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x006e
            r50.A03()
        L_0x006e:
            android.util.SparseArray r30 = r49.A00()
            int r0 = r30.size()
            java.util.ArrayList r29 = X.C36441kJ.A14(r0)
            r30.size()
            r15 = 0
        L_0x007e:
            int r0 = r30.size()
            r35 = r53
            r39 = r55
            if (r15 >= r0) goto L_0x021d
            r0 = r30
            int r28 = r0.keyAt(r15)
            r1 = r0
            r0 = r28
            java.lang.Object r9 = r1.get(r0)
            byte[] r9 = (byte[]) r9
            r0 = r50
            int r1 = r0.A03
            r0 = 3
            boolean r27 = X.AnonymousClass000.A1S(r1, r0)
            long r16 = android.os.SystemClock.elapsedRealtime()
            java.lang.Integer r26 = X.C36371kC.A0p()
            java.lang.Integer r25 = java.lang.Integer.valueOf(r4)
            r1 = r26
            r0 = r25
            android.util.Pair r24 = android.util.Pair.create(r1, r0)
            monitor-enter(r3)
            boolean r0 = X.AnonymousClass6X1.A04(r3)     // Catch:{ all -> 0x04d1 }
            r5 = 0
            if (r0 != 0) goto L_0x0119
            X.6V6 r11 = r3.A05     // Catch:{ all -> 0x04d1 }
            android.content.SharedPreferences r1 = X.AnonymousClass6V6.A01(r11)     // Catch:{ all -> 0x04d1 }
            java.lang.String r0 = "original_token"
            java.lang.String r23 = r1.getString(r0, r5)     // Catch:{ all -> 0x04d1 }
            if (r23 == 0) goto L_0x00ff
            android.content.SharedPreferences r6 = X.AnonymousClass6V6.A01(r11)     // Catch:{ all -> 0x04d1 }
            java.lang.String r1 = "redeem_count"
            r0 = -1
            int r10 = r6.getInt(r1, r0)     // Catch:{ all -> 0x04d1 }
            X.0wo r0 = r3.A03     // Catch:{ all -> 0x04d1 }
            long r18 = X.C36371kC.A09(r0)     // Catch:{ all -> 0x04d1 }
            android.content.SharedPreferences r8 = X.AnonymousClass6V6.A01(r11)     // Catch:{ all -> 0x04d1 }
            java.lang.String r6 = "base_timestamp"
            r0 = 0
            long r12 = r8.getLong(r6, r0)     // Catch:{ all -> 0x04d1 }
            long r18 = r18 - r12
            if (r10 < 0) goto L_0x00ff
            r6 = 512(0x200, float:7.175E-43)
            if (r10 >= r6) goto L_0x00ff
            android.content.SharedPreferences r8 = X.AnonymousClass6V6.A01(r11)     // Catch:{ all -> 0x04d1 }
            java.lang.String r6 = "time_to_live"
            long r12 = r8.getLong(r6, r0)     // Catch:{ all -> 0x04d1 }
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ff
            monitor-exit(r3)
            goto L_0x011c
        L_0x00ff:
            boolean r0 = r3.A0E     // Catch:{ all -> 0x04d1 }
            if (r0 != 0) goto L_0x0108
            r3.A0E = r7     // Catch:{ all -> 0x04d1 }
            r3.A07(r4)     // Catch:{ all -> 0x04d1 }
        L_0x0108:
            android.content.SharedPreferences r1 = X.AnonymousClass6V6.A01(r11)     // Catch:{ all -> 0x04d1 }
            java.lang.String r0 = "token_not_ready_reason"
            int r0 = r1.getInt(r0, r4)     // Catch:{ all -> 0x04d1 }
            if (r0 != 0) goto L_0x0119
            r0 = 13
            r11.A04(r0)     // Catch:{ all -> 0x04d1 }
        L_0x0119:
            monitor-exit(r3)
            r23 = r5
        L_0x011c:
            r22 = 0
            if (r23 == 0) goto L_0x01d8
            monitor-enter(r3)
            X.6V6 r13 = r3.A05     // Catch:{ all -> 0x04d1 }
            android.content.SharedPreferences r1 = X.AnonymousClass6V6.A01(r13)     // Catch:{ all -> 0x04d1 }
            java.lang.String r0 = "shared_secret"
            java.lang.String r1 = r1.getString(r0, r5)     // Catch:{ all -> 0x04d1 }
            if (r1 == 0) goto L_0x01c2
            r0 = 8
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch:{ all -> 0x04d1 }
            if (r0 == 0) goto L_0x01c2
            byte[] r12 = X.C110525ao.A00(r9, r0)     // Catch:{ Exception -> 0x01b7 }
            if (r12 == 0) goto L_0x01cb
            android.content.SharedPreferences r1 = X.AnonymousClass6V6.A01(r13)     // Catch:{ all -> 0x04d1 }
            java.lang.String r5 = "redeem_count"
            r0 = -1
            int r0 = r1.getInt(r5, r0)     // Catch:{ all -> 0x04d1 }
            int r1 = r0 + 1
            if (r1 < 0) goto L_0x0188
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass6V6.A00(r13)     // Catch:{ all -> 0x04d1 }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r5, r1)     // Catch:{ all -> 0x04d1 }
        L_0x0154:
            r0.apply()     // Catch:{ all -> 0x04d1 }
            android.content.SharedPreferences r1 = X.AnonymousClass6V6.A01(r13)     // Catch:{ all -> 0x04d1 }
            r0 = -1
            int r14 = r1.getInt(r5, r0)     // Catch:{ all -> 0x04d1 }
            X.0yf r1 = r3.A01     // Catch:{ all -> 0x04d1 }
            X.0yh r0 = X.C21100yf.A09     // Catch:{ all -> 0x04d1 }
            int r11 = r1.A04(r0)     // Catch:{ all -> 0x04d1 }
            X.0yh r0 = X.C21100yf.A08     // Catch:{ all -> 0x04d1 }
            int r0 = r1.A04(r0)     // Catch:{ all -> 0x04d1 }
            long r5 = (long) r0     // Catch:{ all -> 0x04d1 }
            X.0wo r0 = r3.A03     // Catch:{ all -> 0x04d1 }
            long r20 = X.C36371kC.A09(r0)     // Catch:{ all -> 0x04d1 }
            android.content.SharedPreferences r10 = X.AnonymousClass6V6.A01(r13)     // Catch:{ all -> 0x04d1 }
            java.lang.String r8 = "base_timestamp"
            r0 = 0
            long r18 = r10.getLong(r8, r0)     // Catch:{ all -> 0x04d1 }
            long r20 = r20 - r18
            boolean r8 = r3.A0E     // Catch:{ all -> 0x04d1 }
            if (r8 != 0) goto L_0x01b0
            goto L_0x0191
        L_0x0188:
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass6V6.A00(r13)     // Catch:{ all -> 0x04d1 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r5)     // Catch:{ all -> 0x04d1 }
            goto L_0x0154
        L_0x0191:
            if (r14 >= r11) goto L_0x01a2
            android.content.SharedPreferences r10 = X.AnonymousClass6V6.A01(r13)     // Catch:{ all -> 0x04d1 }
            java.lang.String r8 = "time_to_live"
            long r10 = r10.getLong(r8, r0)     // Catch:{ all -> 0x04d1 }
            long r10 = r10 - r5
            int r0 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b0
        L_0x01a2:
            r3.A0E = r7     // Catch:{ all -> 0x04d1 }
            X.0wU r5 = r3.A07     // Catch:{ all -> 0x04d1 }
            r1 = 21
            X.3v5 r0 = new X.3v5     // Catch:{ all -> 0x04d1 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x04d1 }
            r5.Boy(r0)     // Catch:{ all -> 0x04d1 }
        L_0x01b0:
            r0 = 10
            java.lang.String r5 = android.util.Base64.encodeToString(r12, r0)     // Catch:{ all -> 0x04d1 }
            goto L_0x01cb
        L_0x01b7:
            r1 = move-exception
            r0 = 6
            r13.A04(r0)     // Catch:{ all -> 0x04d1 }
            java.lang.String r0 = "PrivateStatsToken/computeHMAC failed to compute hmac"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04d1 }
            goto L_0x01cb
        L_0x01c2:
            r0 = 3
            r13.A04(r0)     // Catch:{ all -> 0x04d1 }
            java.lang.String r0 = "PrivateStatsToken/computeHMAC sharedSecret is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04d1 }
        L_0x01cb:
            monitor-exit(r3)
            if (r5 == 0) goto L_0x01d8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r23)
            java.lang.String r0 = "+"
            java.lang.String r22 = X.AnonymousClass000.A0p(r0, r5, r1)
        L_0x01d8:
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            if (r0 == 0) goto L_0x0253
            java.lang.String r0 = "PrivateStatsUploader/doUpload no valid auth token, abort uploading"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r1 = X.C36401kF.A0h()
            int r0 = r3.A05()
            android.util.Pair r24 = X.C90514aH.A0P(r1, r0)
        L_0x01ef:
            long r36 = X.C90514aH.A0J(r16)
            int r5 = X.C36381kD.A04(r24)
            if (r5 != r7) goto L_0x0200
            r1 = r29
            r0 = r28
            X.AnonymousClass000.A1F(r1, r0)
        L_0x0200:
            r1 = 7
            X.1J6 r0 = r2.A09
            int r33 = X.C36381kD.A03(r24)
            if (r5 != r1) goto L_0x023f
            r32 = 7
            r34 = 0
            r31 = r0
            X.AnonymousClass1J6.A00(r31, r32, r33, r34, r35, r36, r38, r39)
        L_0x0212:
            int r1 = X.C36381kD.A04(r24)
            r0 = 4
            if (r1 != r0) goto L_0x04cd
            r3.A06()
            r4 = 1
        L_0x021d:
            int r0 = r29.size()
            if (r0 <= 0) goto L_0x022d
            r1 = r49
            r0 = r29
            r1.A05(r0)
            r50.A03()
        L_0x022d:
            if (r56 != 0) goto L_0x0064
            if (r4 != 0) goto L_0x0064
            r5 = 1
            r0 = r2
            r1 = r50
            r2 = r35
            r3 = r38
            r4 = r39
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x023f:
            r42 = 0
            r44 = r35
            r48 = r39
            r40 = r0
            r41 = r5
            r43 = r33
            r45 = r36
            r47 = r38
            X.AnonymousClass1J6.A00(r40, r41, r42, r43, r44, r45, r47, r48)
            goto L_0x0212
        L_0x0253:
            if (r9 != 0) goto L_0x025b
            java.lang.String r0 = "PrivateStatsUploader/doUpload--->dataToSend is null, why?!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x01ef
        L_0x025b:
            X.1VS r6 = r2.A03
            X.005 r0 = r2.A06
            java.lang.Object r5 = r0.get()
            X.1BS r5 = (X.AnonymousClass1BS) r5
            X.0yC r1 = r2.A01
            X.640 r19 = new X.640
            r0 = r19
            r0.<init>(r1, r6, r5)
            r0 = 23
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.lang.String r0 = r19.A00()
        L_0x0277:
            if (r0 == 0) goto L_0x01ef
            java.net.URLConnection r11 = X.C90504aG.A0r(r0)     // Catch:{ Exception -> 0x04a3 }
            javax.net.ssl.HttpsURLConnection r11 = (javax.net.ssl.HttpsURLConnection) r11     // Catch:{ Exception -> 0x04a3 }
            X.0yd r0 = r2.A04     // Catch:{ Exception -> 0x04a3 }
            X.8qS r0 = r0.A00()     // Catch:{ Exception -> 0x04a3 }
            r11.setSSLSocketFactory(r0)     // Catch:{ Exception -> 0x04a3 }
            java.lang.String r5 = X.AnonymousClass6JD.A0S     // Catch:{ Exception -> 0x04a3 }
            javax.net.ssl.HostnameVerifier r1 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch:{ Exception -> 0x04a3 }
            X.77d r0 = new X.77d     // Catch:{ Exception -> 0x04a3 }
            r0.<init>(r5, r1)     // Catch:{ Exception -> 0x04a3 }
            r11.setHostnameVerifier(r0)     // Catch:{ Exception -> 0x04a3 }
            r0 = 15000(0x3a98, float:2.102E-41)
            r11.setConnectTimeout(r0)     // Catch:{ Exception -> 0x04a3 }
            r0 = 60000(0xea60, float:8.4078E-41)
            r11.setReadTimeout(r0)     // Catch:{ Exception -> 0x04a3 }
            r11.setDoInput(r7)     // Catch:{ Exception -> 0x04a3 }
            r11.setDoOutput(r7)     // Catch:{ Exception -> 0x04a3 }
            java.lang.String r0 = "POST"
            r11.setRequestMethod(r0)     // Catch:{ Exception -> 0x04a3 }
            r11.setChunkedStreamingMode(r4)     // Catch:{ Exception -> 0x04a3 }
            r11.setUseCaches(r4)     // Catch:{ Exception -> 0x04a3 }
            java.lang.String r1 = "User-Agent"
            X.0wt r0 = r2.A05     // Catch:{ Exception -> 0x04a3 }
            java.lang.String r0 = r0.A02()     // Catch:{ Exception -> 0x04a3 }
            r11.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x04a3 }
            java.lang.String r1 = "Connection"
            java.lang.String r0 = "Keep-Alive"
            r11.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x04a3 }
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = "multipart/form-data; boundary=boundaryWAMpsAAL123xyz"
            r11.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x04a3 }
            java.lang.String r1 = "Accept"
            java.lang.String r0 = "text/plain"
            r11.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x04a3 }
            java.lang.String r1 = "Accept-Charset"
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ Exception -> 0x04a3 }
            r11.setRequestProperty(r1, r0)     // Catch:{ Exception -> 0x04a3 }
            java.lang.String r0 = "Host"
            r11.setRequestProperty(r0, r5)     // Catch:{ Exception -> 0x04a3 }
            r11.connect()     // Catch:{ Exception -> 0x04a3 }
            java.lang.String r10 = "\r\n"
            X.0ww r0 = r2.A00     // Catch:{ Exception -> 0x04af }
            r20 = r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x04af }
            java.lang.Integer r18 = X.C36401kF.A0i()     // Catch:{ Exception -> 0x04af }
            r1 = r0
            r0 = r18
            X.5RL r1 = X.C132776Vf.A01(r1, r8, r0, r11)     // Catch:{ Exception -> 0x04af }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x04af }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04af }
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x04af }
            r6.<init>(r0)     // Catch:{ Exception -> 0x04af }
            java.lang.String r5 = "--boundaryWAMpsAAL123xyz\r\n"
            r6.writeBytes(r5)     // Catch:{ all -> 0x049e }
            java.lang.String r1 = "Content-Type: text/plain\r\n"
            r6.writeBytes(r1)     // Catch:{ all -> 0x049e }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"access_token\"\r\n"
            r6.writeBytes(r0)     // Catch:{ all -> 0x049e }
            r6.writeBytes(r10)     // Catch:{ all -> 0x049e }
            java.lang.String r0 = X.AnonymousClass6JD.A0U     // Catch:{ all -> 0x049e }
            r6.writeBytes(r0)     // Catch:{ all -> 0x049e }
            r6.writeBytes(r10)     // Catch:{ all -> 0x049e }
            r6.writeBytes(r5)     // Catch:{ all -> 0x049e }
            r6.writeBytes(r1)     // Catch:{ all -> 0x049e }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"credential\"\r\n"
            r6.writeBytes(r0)     // Catch:{ all -> 0x049e }
            r6.writeBytes(r10)     // Catch:{ all -> 0x049e }
            r0 = r22
            r6.writeBytes(r0)     // Catch:{ all -> 0x049e }
            r6.writeBytes(r10)     // Catch:{ all -> 0x049e }
            r6.size()     // Catch:{ all -> 0x049e }
            r6.writeBytes(r5)     // Catch:{ all -> 0x049e }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"message\"; filename=\"WAMEventBuffer.dat\"\r\n"
            r6.writeBytes(r0)     // Catch:{ all -> 0x049e }
            java.lang.String r0 = "Content-Type: application/octet-stream\r\n"
            r6.writeBytes(r0)     // Catch:{ all -> 0x049e }
            java.lang.String r0 = "Content-Transfer-Encoding: binary\r\n"
            r6.writeBytes(r0)     // Catch:{ all -> 0x049e }
            r6.writeBytes(r10)     // Catch:{ all -> 0x049e }
            int r13 = r9.length     // Catch:{ all -> 0x049e }
            r12 = 2048(0x800, float:2.87E-42)
            int r14 = r13 / r12
            int r13 = r13 % r12
            r1 = 0
            r0 = 0
        L_0x0350:
            if (r1 >= r14) goto L_0x035a
            r6.write(r9, r0, r12)     // Catch:{ all -> 0x049e }
            int r0 = r0 + 2048
            int r1 = r1 + 1
            goto L_0x0350
        L_0x035a:
            if (r13 <= 0) goto L_0x035f
            r6.write(r9, r0, r13)     // Catch:{ all -> 0x049e }
        L_0x035f:
            r6.writeBytes(r10)     // Catch:{ all -> 0x049e }
            r6.size()     // Catch:{ all -> 0x049e }
            org.json.JSONObject r13 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0384 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0384 }
            long r0 = X.C36391kE.A0B(r0)     // Catch:{ JSONException -> 0x0384 }
            java.lang.String r12 = "t"
            r13.put(r12, r0)     // Catch:{ JSONException -> 0x0384 }
            java.lang.String r1 = "rt"
            if (r27 == 0) goto L_0x0381
            java.lang.String r0 = "true"
        L_0x037c:
            java.lang.String r12 = X.C90484aE.A0l(r0, r1, r13)     // Catch:{ JSONException -> 0x0384 }
            goto L_0x038b
        L_0x0381:
            java.lang.String r0 = "false"
            goto L_0x037c
        L_0x0384:
            r1 = move-exception
            r12 = 0
            java.lang.String r0 = "PrivateStatsUploader/writeMetadataPart"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x049e }
        L_0x038b:
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x049e }
            if (r0 != 0) goto L_0x03aa
            r6.writeBytes(r5)     // Catch:{ all -> 0x049e }
            java.lang.String r0 = "Content-Type: application/json\r\n"
            r6.writeBytes(r0)     // Catch:{ all -> 0x049e }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"meta_data\"\r\n"
            r6.writeBytes(r0)     // Catch:{ all -> 0x049e }
            r6.writeBytes(r10)     // Catch:{ all -> 0x049e }
            r6.writeBytes(r12)     // Catch:{ all -> 0x049e }
            r6.writeBytes(r10)     // Catch:{ all -> 0x049e }
            r6.size()     // Catch:{ all -> 0x049e }
        L_0x03aa:
            java.lang.String r0 = "--boundaryWAMpsAAL123xyz--\r\n"
            r6.writeBytes(r0)     // Catch:{ all -> 0x049e }
            r6.writeBytes(r10)     // Catch:{ all -> 0x049e }
            r6.flush()     // Catch:{ all -> 0x049e }
            int r13 = r11.getResponseCode()     // Catch:{ IOException -> 0x0484 }
            r11.getResponseMessage()     // Catch:{ IOException -> 0x0482 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r13 != r0) goto L_0x03c6
            android.util.Pair r24 = X.C90514aH.A0P(r8, r0)     // Catch:{ IOException -> 0x0482 }
            goto L_0x0497
        L_0x03c6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0482 }
            java.lang.String r0 = "PrivateStatsUploader/handleResponse --- upload failed --- code = "
            X.C36321k7.A1S(r0, r1, r13)     // Catch:{ IOException -> 0x0482 }
            r12 = 400(0x190, float:5.6E-43)
            if (r13 != r12) goto L_0x046c
            java.io.InputStream r10 = r11.getErrorStream()     // Catch:{ Exception -> 0x045b }
            X.5RE r5 = new X.5RE     // Catch:{ Exception -> 0x045b }
            r1 = r20
            r0 = r18
            r5.<init>(r1, r10, r8, r0)     // Catch:{ Exception -> 0x045b }
            r10 = 0
            java.io.BufferedReader r5 = X.C90484aE.A0b(r5)     // Catch:{ Exception -> 0x0405 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x03fb }
        L_0x03e9:
            java.lang.String r0 = r5.readLine()     // Catch:{ all -> 0x03fb }
            if (r0 == 0) goto L_0x03f3
            r1.append(r0)     // Catch:{ all -> 0x03fb }
            goto L_0x03e9
        L_0x03f3:
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x03fb }
            r5.close()     // Catch:{ Exception -> 0x0405 }
            goto L_0x040f
        L_0x03fb:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0400 }
            goto L_0x0404
        L_0x0400:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0405 }
        L_0x0404:
            throw r1     // Catch:{ Exception -> 0x0405 }
        L_0x0405:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x045b }
            java.lang.String r0 = "PrivateStatsUploader/readresponsemsg "
            X.C36321k7.A1J(r5, r0, r1)     // Catch:{ Exception -> 0x045b }
        L_0x040f:
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x045b }
            r8 = 5
            if (r0 != 0) goto L_0x0452
            org.json.JSONObject r1 = X.C36441kJ.A1C(r10)     // Catch:{ JSONException -> 0x0448 }
            java.lang.String r0 = "error"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x0448 }
            java.lang.String r0 = "error_subcode"
            int r5 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0448 }
            java.lang.String r0 = "code"
            int r1 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0448 }
            r0 = 9
            if (r1 != r0) goto L_0x0433
            r8 = 8
            goto L_0x0452
        L_0x0433:
            r0 = 3067002(0x2ecc7a, float:4.297785E-39)
            if (r5 != r0) goto L_0x043a
            r8 = 2
            goto L_0x0452
        L_0x043a:
            r0 = 3067003(0x2ecc7b, float:4.297787E-39)
            if (r5 != r0) goto L_0x0441
            r8 = 3
            goto L_0x0452
        L_0x0441:
            r0 = 3067004(0x2ecc7c, float:4.297788E-39)
            if (r5 != r0) goto L_0x0452
            r8 = 4
            goto L_0x0452
        L_0x0448:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x045b }
            java.lang.String r0 = "PrivateStatsUploader/parseErrorResponse "
            X.C36321k7.A1J(r5, r0, r1)     // Catch:{ Exception -> 0x045b }
        L_0x0452:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x045b }
            android.util.Pair r24 = X.C90514aH.A0P(r0, r12)     // Catch:{ Exception -> 0x045b }
            goto L_0x0497
        L_0x045b:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0482 }
            java.lang.String r0 = "PrivateStatsUploader processing response err "
            X.C36321k7.A1J(r5, r0, r1)     // Catch:{ IOException -> 0x0482 }
            r0 = r26
            android.util.Pair r24 = X.C90514aH.A0P(r0, r12)     // Catch:{ IOException -> 0x0482 }
            goto L_0x0497
        L_0x046c:
            r1 = 401(0x191, float:5.62E-43)
            if (r13 != r1) goto L_0x0479
            java.lang.Integer r0 = X.C36421kH.A0U()     // Catch:{ IOException -> 0x0482 }
            android.util.Pair r24 = X.C90514aH.A0P(r0, r1)     // Catch:{ IOException -> 0x0482 }
            goto L_0x0497
        L_0x0479:
            java.lang.Integer r0 = X.C36391kE.A0r()     // Catch:{ IOException -> 0x0482 }
            android.util.Pair r24 = X.C90514aH.A0P(r0, r13)     // Catch:{ IOException -> 0x0482 }
            goto L_0x0497
        L_0x0482:
            r5 = move-exception
            goto L_0x0486
        L_0x0484:
            r5 = move-exception
            r13 = 0
        L_0x0486:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x049e }
            java.lang.String r0 = "PrivateStatsUploader response error "
            X.C36321k7.A1J(r5, r0, r1)     // Catch:{ all -> 0x049e }
            java.lang.Integer r0 = X.C36381kD.A0n()     // Catch:{ all -> 0x049e }
            android.util.Pair r24 = X.C90514aH.A0P(r0, r13)     // Catch:{ all -> 0x049e }
        L_0x0497:
            r6.close()     // Catch:{ Exception -> 0x04af }
            r11.disconnect()     // Catch:{ Exception -> 0x04af }
            goto L_0x04c8
        L_0x049e:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x04aa }
            goto L_0x04ae
        L_0x04a3:
            r1 = move-exception
            java.lang.String r0 = "PrivateStatsUploader/makeConnection error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x04af }
            goto L_0x04ae
        L_0x04aa:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x04af }
        L_0x04ae:
            throw r1     // Catch:{ Exception -> 0x04af }
        L_0x04af:
            r1 = move-exception
            java.lang.String r0 = "PrivateStatsUploader/doUpload error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04d4 }
            java.lang.Integer r1 = X.C36381kD.A0n()     // Catch:{ all -> 0x04d4 }
            r0 = r25
            android.util.Pair r24 = android.util.Pair.create(r1, r0)     // Catch:{ all -> 0x04d4 }
            java.lang.String r0 = r19.A00()     // Catch:{ all -> 0x04d4 }
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0277
        L_0x04c8:
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x01ef
        L_0x04cd:
            int r15 = r15 + 1
            goto L_0x007e
        L_0x04d1:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x04d4:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145616uF.A00(X.1C9, int, boolean, boolean, boolean):void");
    }

    public C145616uF(C20050ww r1, C19600wD r2, C19970wo r3, C20810yC r4, AnonymousClass1J6 r5, AnonymousClass6X1 r6, AnonymousClass1VS r7, C21080yd r8, C20020wt r9, AnonymousClass005 r10) {
        this.A08 = r3;
        this.A05 = r9;
        this.A00 = r1;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = r8;
        this.A09 = r5;
        this.A07 = r2;
        this.A01 = r4;
        this.A06 = r10;
    }
}
