package X;

/* renamed from: X.1Zp  reason: invalid class name and case insensitive filesystem */
public final class C30201Zp {
    public final AnonymousClass1DQ A00;
    public final AnonymousClass16J A01;
    public final AnonymousClass12P A02;
    public final AnonymousClass1A1 A03;

    public C30201Zp(AnonymousClass1DQ r2, AnonymousClass16J r3, AnonymousClass12P r4, AnonymousClass1A1 r5) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r4, 4);
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A00(X.C65073Qp r9) {
        /*
            r8 = this;
            r7 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r6 = X.C56642we.A01
            X.12P r0 = r8.A02     // Catch:{ all -> 0x0070 }
            X.1M0 r3 = r0.get()     // Catch:{ all -> 0x0070 }
            X.14e r5 = r3.A02     // Catch:{ all -> 0x0069 }
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0069 }
            java.lang.Long r0 = r9.A07()     // Catch:{ all -> 0x0069 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0069 }
            r4[r7] = r0     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "GET_ENFORCED_MESSAGES_FOR_CHAT"
            android.database.Cursor r4 = r5.A09(r6, r0, r4)     // Catch:{ all -> 0x0069 }
        L_0x0027:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0059
            X.1A1 r1 = r8.A03     // Catch:{ all -> 0x0062 }
            X.11F r0 = r9.A06()     // Catch:{ all -> 0x0062 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0062 }
            X.3T1 r0 = r1.A01(r4, r0)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0040
            r2.add(r0)     // Catch:{ all -> 0x0062 }
            goto L_0x0027
        L_0x0040:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r1.<init>()     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/failed to read enforced message for channel for channel: "
            r1.append(r0)     // Catch:{ all -> 0x0062 }
            X.11F r0 = r9.A06()     // Catch:{ all -> 0x0062 }
            r1.append(r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0062 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0062 }
            goto L_0x0027
        L_0x0059:
            X.0AJ r1 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0062 }
            r4.close()     // Catch:{ all -> 0x0069 }
            r3.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0076
        L_0x0062:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006b }
        L_0x006b:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x0076:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/failed get enforced messages for channel"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30201Zp.A00(X.3Qp):java.util.ArrayList");
    }
}
