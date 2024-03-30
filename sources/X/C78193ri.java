package X;

/* renamed from: X.3ri  reason: invalid class name and case insensitive filesystem */
public final class C78193ri implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;

    public C78193ri(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B7J(X.AnonymousClass3T1 r9) {
        /*
            r8 = this;
            r4 = 0
            X.AnonymousClass00C.A0D(r9, r4)
            X.005 r0 = r8.A00
            java.lang.Object r2 = r0.get()
            X.3CZ r2 = (X.AnonymousClass3CZ) r2
            X.2c1 r9 = (X.AnonymousClass2c1) r9
            X.AnonymousClass00C.A0D(r9, r4)
            java.lang.String[] r3 = X.C36441kJ.A1R()
            long r0 = r9.A1N
            X.C36351kA.A1V(r3, r4, r0)
            X.12P r0 = r2.A00
            X.1M0 r7 = r0.get()
            X.14e r2 = r7.A02     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "SELECT message_row_id, placeholder_type FROM message_fixed_content_placeholder WHERE message_row_id = ?"
            java.lang.String r0 = "GET_PLACEHOLDER_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r6 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x0058 }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "placeholder_type"
            int r5 = X.C36351kA.A03(r6, r0)     // Catch:{ all -> 0x0051 }
            X.2ot[] r4 = X.C52102ot.values()     // Catch:{ all -> 0x0051 }
            int r3 = r4.length     // Catch:{ all -> 0x0051 }
            r2 = 0
        L_0x003c:
            if (r2 >= r3) goto L_0x0047
            r1 = r4[r2]     // Catch:{ all -> 0x0051 }
            int r0 = r1.value     // Catch:{ all -> 0x0051 }
            if (r0 == r5) goto L_0x0048
            int r2 = r2 + 1
            goto L_0x003c
        L_0x0047:
            r1 = 0
        L_0x0048:
            r9.A00 = r1     // Catch:{ all -> 0x0051 }
        L_0x004a:
            r6.close()     // Catch:{ all -> 0x0058 }
            r7.close()
            return
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78193ri.B7J(X.3T1):void");
    }

    public void BKi(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((AnonymousClass3CZ) this.A00.get()).A00((AnonymousClass2c1) r2);
    }

    public void BwV(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((AnonymousClass3CZ) this.A00.get()).A00((AnonymousClass2c1) r2);
    }
}
