package X;

/* renamed from: X.3ru  reason: invalid class name and case insensitive filesystem */
public final class C78313ru implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x00b3=Splitter:B:28:0x00b3, B:43:0x00eb=Splitter:B:43:0x00eb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B7J(X.AnonymousClass3T1 r8) {
        /*
            r7 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            boolean r0 = r8 instanceof X.C181458nV
            if (r0 == 0) goto L_0x0019
            X.005 r0 = r7.A00
            X.1Fl r2 = X.C36441kJ.A0g(r0)
            X.8nV r8 = (X.C181458nV) r8
            long r0 = r8.A1N
            int r0 = X.C25221Fl.A00(r2, r0)
            r8.A00 = r0
        L_0x0018:
            return
        L_0x0019:
            boolean r0 = r8 instanceof X.AnonymousClass2cF
            if (r0 == 0) goto L_0x002e
            X.005 r0 = r7.A00
            X.1Fl r2 = X.C36441kJ.A0g(r0)
            X.2cF r8 = (X.AnonymousClass2cF) r8
            long r0 = r8.A1N
            int r0 = X.C25221Fl.A00(r2, r0)
            r8.A00 = r0
            return
        L_0x002e:
            boolean r0 = r8 instanceof X.C181158n1
            if (r0 == 0) goto L_0x0053
            X.005 r0 = r7.A00
            X.1Fl r2 = X.C36441kJ.A0g(r0)
            X.8n1 r8 = (X.C181158n1) r8
            long r0 = r8.A1N
            int r0 = X.C25221Fl.A00(r2, r0)
            r8.A00 = r0
            X.0yC r1 = r2.A06
            r0 = 5309(0x14bd, float:7.44E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00c0
            X.12P r0 = r2.A02
            X.1M0 r4 = r0.get()
            goto L_0x0068
        L_0x0053:
            boolean r0 = r8 instanceof X.AnonymousClass2cR
            if (r0 == 0) goto L_0x0018
            X.005 r0 = r7.A00
            X.1Fl r2 = X.C36441kJ.A0g(r0)
            X.2cR r8 = (X.AnonymousClass2cR) r8
            long r0 = r8.A1N
            int r0 = X.C25221Fl.A00(r2, r0)
            r8.A00 = r0
            return
        L_0x0068:
            X.14e r5 = r4.A02     // Catch:{ all -> 0x00ff }
            java.lang.String r3 = "SELECT setting_reason, ephemeral_trigger, ephemeral_initiated_by_me FROM message_ephemeral_setting WHERE message_row_id = ?"
            r6 = 1
            java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ all -> 0x00ff }
            long r0 = r8.A1N     // Catch:{ all -> 0x00ff }
            X.C36421kH.A1Q(r2, r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "GET_EPHEMERAL_SETTING_INFO"
            android.database.Cursor r5 = r5.A09(r3, r0, r2)     // Catch:{ all -> 0x00ff }
            if (r5 == 0) goto L_0x00bc
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = "setting_reason"
            int r3 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "ephemeral_trigger"
            int r2 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "ephemeral_initiated_by_me"
            int r1 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b7 }
            int r0 = r5.getInt(r3)     // Catch:{ all -> 0x00b7 }
            r8.A00 = r0     // Catch:{ all -> 0x00b7 }
            int r0 = r5.getInt(r2)     // Catch:{ all -> 0x00b7 }
            r8.A04 = r0     // Catch:{ all -> 0x00b7 }
            boolean r0 = r5.isNull(r1)     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x00b3
            int r0 = r5.getInt(r1)     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x00ad
            r6 = 0
        L_0x00ad:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x00b7 }
            r8.A0d = r0     // Catch:{ all -> 0x00b7 }
        L_0x00b3:
            r5.close()     // Catch:{ all -> 0x00ff }
            goto L_0x00bc
        L_0x00b7:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00f4 }
            goto L_0x00f8
        L_0x00bc:
            r4.close()
            return
        L_0x00c0:
            long r0 = r8.A1N
            X.12P r2 = r2.A02
            X.1M0 r4 = r2.get()
            X.14e r5 = r4.A02     // Catch:{ all -> 0x00ff }
            java.lang.String r3 = "SELECT setting_reason FROM message_ephemeral_setting WHERE message_row_id = ?"
            java.lang.String[] r2 = X.C36441kJ.A1R()     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x00ff }
            r1 = 0
            r2[r1] = r0     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "GET_EPHEMERAL_SETTING_DURATION"
            android.database.Cursor r2 = r5.A09(r3, r0, r2)     // Catch:{ all -> 0x00ff }
            if (r2 == 0) goto L_0x00f9
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = "setting_reason"
            int r1 = X.C36351kA.A03(r2, r0)     // Catch:{ all -> 0x00ef }
        L_0x00eb:
            r2.close()     // Catch:{ all -> 0x00ff }
            goto L_0x00f9
        L_0x00ef:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00f4 }
            goto L_0x00f8
        L_0x00f4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ff }
        L_0x00f8:
            throw r1     // Catch:{ all -> 0x00ff }
        L_0x00f9:
            r4.close()
            r8.A00 = r1
            return
        L_0x00ff:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0104 }
            throw r1
        L_0x0104:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78313ru.B7J(X.3T1):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.2cF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: X.8nV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: X.2cF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: X.2cF} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BKi(X.AnonymousClass3T1 r9) {
        /*
            r8 = this;
            r3 = 0
            X.AnonymousClass00C.A0D(r9, r3)
            X.005 r0 = r8.A01
            java.lang.Object r1 = r0.get()
            X.17A r1 = (X.AnonymousClass17A) r1
            r0 = r9
            X.2bI r0 = (X.AnonymousClass2bI) r0
            r1.A02(r0)
            boolean r0 = r9 instanceof X.C181458nV
            if (r0 == 0) goto L_0x002a
            X.005 r0 = r8.A00
            X.1Fl r0 = X.C36441kJ.A0g(r0)
            long r5 = r9.A1N
            X.8nV r9 = (X.C181458nV) r9
            int r2 = r9.A00
        L_0x0022:
            int r4 = r9.A04
            java.lang.Boolean r1 = r9.A0d
        L_0x0026:
            r0.A06(r1, r2, r3, r4, r5)
        L_0x0029:
            return
        L_0x002a:
            boolean r0 = r9 instanceof X.AnonymousClass2cF
            if (r0 == 0) goto L_0x003b
            X.005 r0 = r8.A00
            X.1Fl r0 = X.C36441kJ.A0g(r0)
            long r5 = r9.A1N
            X.2cF r9 = (X.AnonymousClass2cF) r9
            int r2 = r9.A00
            goto L_0x0022
        L_0x003b:
            boolean r0 = r9 instanceof X.C181158n1
            if (r0 == 0) goto L_0x0056
            X.005 r0 = r8.A00
            X.1Fl r1 = X.C36441kJ.A0g(r0)
            long r6 = r9.A1N
            r0 = r9
            X.8n1 r0 = (X.C181158n1) r0
            int r3 = r0.A00
            int r4 = r9.A00
            int r5 = r0.A04
            java.lang.Boolean r2 = r0.A0d
            r1.A06(r2, r3, r4, r5, r6)
            return
        L_0x0056:
            boolean r0 = r9 instanceof X.AnonymousClass2cR
            if (r0 == 0) goto L_0x0029
            X.005 r0 = r8.A00
            X.1Fl r0 = X.C36441kJ.A0g(r0)
            long r5 = r9.A1N
            X.2cR r9 = (X.AnonymousClass2cR) r9
            int r2 = r9.A00
            r1 = 0
            r4 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78313ru.BKi(X.3T1):void");
    }

    public void BwV(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((AnonymousClass17A) this.A01.get()).A02((AnonymousClass2bI) r2);
    }

    public C78313ru(AnonymousClass005 r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
