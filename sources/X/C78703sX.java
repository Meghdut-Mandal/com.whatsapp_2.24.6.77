package X;

/* renamed from: X.3sX  reason: invalid class name and case insensitive filesystem */
public final class C78703sX implements C17820s5 {
    public final AnonymousClass005 A00;

    public C78703sX(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BmI(X.AnonymousClass3T1 r11, X.C52942qQ r12) {
        /*
            r10 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            int r0 = r11.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x0082
            X.005 r0 = r10.A00
            java.lang.Object r0 = r0.get()
            X.1G3 r0 = (X.AnonymousClass1G3) r0
            r9 = 0
            X.12P r0 = r0.A00
            X.1M0 r6 = r0.get()
            X.14e r4 = r6.A02     // Catch:{ all -> 0x007b }
            java.lang.String r0 = X.C56332w7.A00     // Catch:{ all -> 0x007b }
            java.lang.String r3 = "SELECT \nparent_message_row_id,\nassociation_type\nFROM message_parent_association\nWHERE\nmessage_row_id =?"
            java.lang.String[] r2 = X.C36441kJ.A1R()     // Catch:{ all -> 0x007b }
            long r0 = r11.A1N     // Catch:{ all -> 0x007b }
            X.C36351kA.A1V(r2, r9, r0)     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "GET_PARENT_ASSOCIATION_FOR_MSG_ROW_ID_SQL"
            android.database.Cursor r7 = r4.A09(r3, r0, r2)     // Catch:{ all -> 0x007b }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "parent_message_row_id"
            long r1 = X.C36351kA.A07(r7, r0)     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "association_type"
            int r8 = X.C36351kA.A03(r7, r0)     // Catch:{ all -> 0x0074 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0065
            X.2ow[] r5 = X.C52132ow.values()     // Catch:{ all -> 0x0074 }
            int r3 = r5.length     // Catch:{ all -> 0x0074 }
        L_0x0050:
            if (r9 >= r3) goto L_0x0065
            r4 = r5[r9]     // Catch:{ all -> 0x0074 }
            int r0 = r4.value     // Catch:{ all -> 0x0074 }
            if (r0 != r8) goto L_0x0062
            r3 = 0
            X.3JM r0 = new X.3JM     // Catch:{ all -> 0x0074 }
            r0.<init>(r4, r3, r1)     // Catch:{ all -> 0x0074 }
            r11.A14(r0)     // Catch:{ all -> 0x0074 }
            goto L_0x0065
        L_0x0062:
            int r9 = r9 + 1
            goto L_0x0050
        L_0x0065:
            r7.close()     // Catch:{ all -> 0x007b }
            r6.close()
            if (r12 == 0) goto L_0x0082
            java.lang.Class<X.3sX> r0 = X.C78703sX.class
            java.lang.NullPointerException r0 = X.C36321k7.A04(r0)
            throw r0
        L_0x0074:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007d }
        L_0x007d:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78703sX.BmI(X.3T1, X.2qQ):void");
    }
}
