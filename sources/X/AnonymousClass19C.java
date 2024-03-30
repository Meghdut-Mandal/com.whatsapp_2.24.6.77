package X;

/* renamed from: X.19C  reason: invalid class name */
public final class AnonymousClass19C {
    public final C19700wN A00;
    public final C19420v0 A01;
    public final C20810yC A02;
    public final AnonymousClass19D A03 = new AnonymousClass19D();
    public final AnonymousClass005 A04;

    public AnonymousClass19C(C19700wN r2, C19420v0 r3, C20810yC r4, AnonymousClass005 r5) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r3, 4);
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = r5;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.AnonymousClass19C r5) {
        /*
            monitor-enter(r5)
            X.0v0 r4 = r5.A01     // Catch:{ all -> 0x004e }
            X.005 r0 = r4.A00     // Catch:{ all -> 0x004e }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x004e }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x004e }
            java.lang.String r3 = "wa_dictionary_version"
            r0 = 0
            int r2 = r1.getInt(r3, r0)     // Catch:{ all -> 0x004e }
            r1 = 3
            if (r2 == r1) goto L_0x0020
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r4)     // Catch:{ all -> 0x004e }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r1)     // Catch:{ all -> 0x004e }
            r0.apply()     // Catch:{ all -> 0x004e }
        L_0x0020:
            monitor-exit(r5)
            if (r2 == 0) goto L_0x004c
            if (r2 == r1) goto L_0x004c
            java.lang.String r0 = "PreacksStore/deleteAll preacks"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.005 r0 = r5.A04
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r4 = r0.A04()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "preacks"
            java.lang.String r1 = "PreacksStore/DELETE_ALL"
            r0 = 0
            r3.A03(r2, r0, r1, r0)     // Catch:{ all -> 0x0045 }
            r4.close()
            r0 = 1
            return r0
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x004c:
            r0 = 0
            return r0
        L_0x004e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19C.A00(X.19C):boolean");
    }
}
