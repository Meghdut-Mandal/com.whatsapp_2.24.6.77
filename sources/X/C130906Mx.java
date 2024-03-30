package X;

/* renamed from: X.6Mx  reason: invalid class name and case insensitive filesystem */
public final class C130906Mx {
    public final C19600wD A00;
    public final AnonymousClass13E A01;
    public final C20050ww A02;
    public final C117295m1 A03;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C123305wH A00(X.C130906Mx r7, X.C162167o8 r8, java.lang.Exception r9) {
        /*
            r0 = 34
            X.0ww r4 = r7.A02     // Catch:{ Exception -> 0x004b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x004b }
            r1 = 0
            X.6v1 r8 = (X.C146096v1) r8     // Catch:{ Exception -> 0x004b }
            java.net.HttpURLConnection r0 = r8.A01     // Catch:{ Exception -> 0x004b }
            java.io.InputStream r0 = r0.getErrorStream()     // Catch:{ Exception -> 0x004b }
            X.5RE r2 = new X.5RE     // Catch:{ Exception -> 0x004b }
            r2.<init>(r4, r0, r1, r3)     // Catch:{ Exception -> 0x004b }
            org.json.JSONObject r1 = X.AnonymousClass14X.A01(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003f
            java.lang.String r0 = "error"
            org.json.JSONObject r5 = r1.getJSONObject(r0)     // Catch:{ all -> 0x0044 }
            if (r5 == 0) goto L_0x0038
            java.lang.String r0 = "code"
            int r7 = r5.optInt(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "error_subcode"
            int r8 = r5.optInt(r0)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            r6 = 2
            X.5wH r3 = new X.5wH     // Catch:{ all -> 0x0044 }
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0044 }
            goto L_0x003b
        L_0x0038:
            r7 = 0
            r8 = 0
            goto L_0x0030
        L_0x003b:
            r2.close()     // Catch:{ Exception -> 0x004b }
            return r3
        L_0x003f:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ all -> 0x0044 }
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ Exception -> 0x004b }
            throw r0     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to parse the error response: "
            X.C36321k7.A1J(r2, r0, r1)
            r4 = 1
            r5 = 0
            r3 = 0
            X.5wH r1 = new X.5wH
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130906Mx.A00(X.6Mx, X.7o8, java.lang.Exception):X.5wH");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C05600Qi.A00(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C123305wH A01(java.lang.String r22, java.util.List r23) {
        /*
            r21 = this;
            java.lang.String r2 = "me"
            r5 = 34
            r12 = 0
            r3 = r22
            X.AnonymousClass00C.A0D(r3, r12)
            r18 = 1
            r0 = r21
            X.0wD r1 = r0.A00
            boolean r1 = r1.A09()
            r9 = 0
            if (r1 != 0) goto L_0x0020
            r11 = -1
            X.5wH r8 = new X.5wH
            r10 = r9
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0020:
            java.lang.StringBuilder r4 = X.AnonymousClass6JD.A01(r2, r3)
            java.lang.String r3 = ","
            X.7Xk r2 = X.C155787Xk.A00
            java.lang.String r1 = ""
            r6 = r23
            java.lang.String r2 = X.C007103b.A0Q(r3, r1, r1, r6, r2)
            java.lang.String r1 = "&fields="
            r4.append(r1)
            java.lang.StringBuilder r2 = X.C90484aE.A0q(r2, r4)
            r1 = 24
            android.net.TrafficStats.setThreadStatsTag(r1)
            X.13E r6 = r0.A01     // Catch:{ IOException -> 0x00ae }
            java.lang.String r8 = r4.toString()     // Catch:{ IOException -> 0x00ae }
            java.util.Map r11 = X.C19430v1.A0E     // Catch:{ IOException -> 0x00ae }
            java.lang.String r10 = "WhatsApp"
            java.lang.Integer r7 = X.C36371kC.A0p()     // Catch:{ IOException -> 0x00ae }
            r15 = 0
            r13 = 0
            r14 = 0
            X.6v1 r3 = X.AnonymousClass13E.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x00ae }
            X.0ww r4 = r0.A02     // Catch:{ IOException -> 0x009e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x009e }
            X.5RE r4 = r3.B8D(r4, r9, r1)     // Catch:{ IOException -> 0x009e }
            java.lang.String r1 = X.C19430v1.A0B     // Catch:{ all -> 0x0097 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x0097 }
            r6.<init>(r4, r1)     // Catch:{ all -> 0x0097 }
            r1 = 4096(0x1000, float:5.74E-42)
            char[] r5 = new char[r1]     // Catch:{ all -> 0x0097 }
        L_0x0068:
            int r1 = r6.read(r5)     // Catch:{ all -> 0x0097 }
            if (r1 < 0) goto L_0x0072
            r2.append(r5, r12, r1)     // Catch:{ all -> 0x0097 }
            goto L_0x0068
        L_0x0072:
            java.net.HttpURLConnection r1 = r3.A01     // Catch:{ all -> 0x0097 }
            int r5 = r1.getResponseCode()     // Catch:{ all -> 0x0097 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 == r1) goto L_0x007d
            r15 = 1
        L_0x007d:
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0097 }
            org.json.JSONObject r14 = X.C36441kJ.A1C(r1)     // Catch:{ all -> 0x0097 }
            X.5wH r8 = new X.5wH     // Catch:{ all -> 0x0097 }
            r16 = 0
            r17 = 0
            r12 = r8
            r13 = r9
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0097 }
            r4.close()     // Catch:{ IOException -> 0x009e }
            r3.close()     // Catch:{ IOException -> 0x00ae }
            return r8
        L_0x0097:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r1 = move-exception
            X.C05600Qi.A00(r4, r2)     // Catch:{ IOException -> 0x009e }
            throw r1     // Catch:{ IOException -> 0x009e }
        L_0x009e:
            r1 = move-exception
            X.5wH r8 = A00(r0, r3, r1)     // Catch:{ all -> 0x00a7 }
            r3.close()     // Catch:{ IOException -> 0x00ae }
            return r8
        L_0x00a7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ IOException -> 0x00ae }
            throw r0     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            r16 = move-exception
            X.5wH r15 = new X.5wH
            r19 = 0
            r20 = 0
            r17 = r9
            r15.<init>(r16, r17, r18, r19, r20)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130906Mx.A01(java.lang.String, java.util.List):X.5wH");
    }

    public C130906Mx(C20050ww r1, C19600wD r2, C117295m1 r3, AnonymousClass13E r4) {
        C36321k7.A18(r4, r1, r2, r3);
        this.A01 = r4;
        this.A02 = r1;
        this.A00 = r2;
        this.A03 = r3;
    }
}
