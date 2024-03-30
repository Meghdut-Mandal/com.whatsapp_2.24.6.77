package X;

/* renamed from: X.1ZP  reason: invalid class name */
public final class AnonymousClass1ZP {
    public final C229716r A00;

    public AnonymousClass1ZP(C229716r r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(java.lang.String r8) {
        /*
            r7 = this;
            r6 = 0
            X.AnonymousClass00C.A0D(r8, r6)
            r5 = 0
            X.16r r0 = r7.A00     // Catch:{ all -> 0x0041 }
            X.1M0 r3 = r0.get()     // Catch:{ all -> 0x0041 }
            X.14e r4 = r3.A02     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "SELECT prop_value FROM wa_newsletter_props WHERE prop_name = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x003a }
            r1[r6] = r8     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "WADB_SELECT_NEWSLETTER_PROPS_VALUE_BY_NAME"
            android.database.Cursor r2 = r4.A09(r2, r0, r1)     // Catch:{ all -> 0x003a }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "prop_value"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x002c
        L_0x002b:
            r0 = r5
        L_0x002c:
            r2.close()     // Catch:{ all -> 0x003a }
            r3.close()     // Catch:{ all -> 0x0041 }
            return r0
        L_0x0033:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x003a }
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZP.A00(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.String r8) {
        /*
            r7 = this;
            r6 = 0
            X.AnonymousClass00C.A0D(r8, r6)
            X.16r r0 = r7.A00
            X.1M0 r5 = r0.A04()
            X.14e r4 = r5.A02     // Catch:{ all -> 0x001e }
            java.lang.String r3 = "wa_newsletter_props"
            java.lang.String r2 = "prop_name = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x001e }
            r1[r6] = r8     // Catch:{ all -> 0x001e }
            java.lang.String r0 = "WADB_DELETE_NEWSLETTER_PROP"
            r4.A03(r3, r2, r0, r1)     // Catch:{ all -> 0x001e }
            r5.close()
            return
        L_0x001e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZP.A01(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            r0 = 2
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>(r0)
            java.lang.String r0 = "prop_name"
            r4.put(r0, r6)
            java.lang.String r0 = "prop_value"
            r4.put(r0, r7)
            X.16r r0 = r5.A00
            X.1M0 r3 = r0.A04()
            X.14e r2 = r3.A02     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = "wa_newsletter_props"
            java.lang.String r0 = "WADB_UPSERT_NEWSLETTER_PROPS_STRING"
            r2.A07(r1, r0, r4)     // Catch:{ all -> 0x0027 }
            r3.close()
            return
        L_0x0027:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZP.A02(java.lang.String, java.lang.String):void");
    }
}
