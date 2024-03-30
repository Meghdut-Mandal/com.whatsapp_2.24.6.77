package X;

/* renamed from: X.3sU  reason: invalid class name and case insensitive filesystem */
public final class C78673sU implements C17820s5 {
    public final AnonymousClass005 A00;

    public C78673sU(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0071, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0074, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BmI(X.AnonymousClass3T1 r9, X.C52942qQ r10) {
        /*
            r8 = this;
            X.3Qa r1 = X.AnonymousClass3T1.A06(r9)
            X.11F r0 = r1.A00
            boolean r0 = r0 instanceof X.C177528dw
            if (r0 == 0) goto L_0x0075
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0075
            X.005 r0 = r8.A00
            java.lang.Object r0 = r0.get()
            X.31e r0 = (X.C588231e) r0
            r7 = 0
            X.12P r0 = r0.A00
            X.1M0 r3 = r0.get()
            X.14e r6 = r3.A02     // Catch:{ all -> 0x006e }
            java.lang.String r4 = "SELECT status_distribution_mode FROM status_message_info WHERE message_row_id = ?"
            r5 = 1
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ all -> 0x006e }
            long r0 = r9.A1N     // Catch:{ all -> 0x006e }
            X.C36351kA.A1V(r2, r7, r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "GET_STATUS_DISTRIBUTION_MODE"
            android.database.Cursor r4 = r6.A09(r4, r0, r2)     // Catch:{ all -> 0x006e }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "status_distribution_mode"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0067 }
            int r2 = r4.getInt(r1)     // Catch:{ all -> 0x0067 }
            if (r2 == 0) goto L_0x0050
            if (r2 == r5) goto L_0x0050
            r0 = 2
            if (r2 == r0) goto L_0x0050
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "StatusMessageDistributionModeStore/fillStatusDistributionMode unexpected db value="
            X.C36321k7.A1S(r0, r1, r2)     // Catch:{ all -> 0x0067 }
            goto L_0x0058
        L_0x0050:
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x0067 }
            X.3GP r0 = r9.A0c     // Catch:{ all -> 0x0067 }
            r0.A00 = r1     // Catch:{ all -> 0x0067 }
        L_0x0058:
            r4.close()     // Catch:{ all -> 0x006e }
            r3.close()
            if (r10 == 0) goto L_0x0075
            java.lang.Class<X.3sU> r0 = X.C78673sU.class
            java.lang.NullPointerException r0 = X.C36321k7.A04(r0)
            throw r0
        L_0x0067:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78673sU.BmI(X.3T1, X.2qQ):void");
    }
}
