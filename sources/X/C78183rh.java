package X;

/* renamed from: X.3rh  reason: invalid class name and case insensitive filesystem */
public final class C78183rh implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;

    public C78183rh(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ee, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f2, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B7J(X.AnonymousClass3T1 r14) {
        /*
            r13 = this;
            r6 = 0
            X.AnonymousClass00C.A0D(r14, r6)
            X.005 r0 = r13.A00
            java.lang.Object r0 = r0.get()
            X.1Ei r0 = (X.C24931Ei) r0
            X.2bT r14 = (X.AnonymousClass2bT) r14
            X.AnonymousClass00C.A0D(r14, r6)
            X.12P r0 = r0.A02
            X.1M0 r3 = r0.get()
            X.14e r5 = r3.A02     // Catch:{ all -> 0x00ef }
            java.lang.String r4 = "SELECT name, description, join_link, start_time, is_canceled, location_latitude, location_longitude, location_name, location_address, chat_row_id, event_state FROM message_event WHERE message_row_id = ? "
            java.lang.String[] r2 = X.C36441kJ.A1R()     // Catch:{ all -> 0x00ef }
            long r0 = r14.A1N     // Catch:{ all -> 0x00ef }
            X.C36351kA.A1V(r2, r6, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = "GET_MESSAGE_EVENT_BY_MESSAGE_ROW_ID"
            android.database.Cursor r6 = r5.A09(r4, r0, r2)     // Catch:{ all -> 0x00ef }
            boolean r0 = r6.moveToLast()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = "name"
            int r12 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "description"
            int r11 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "join_link"
            int r9 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "start_time"
            int r1 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "is_canceled"
            int r8 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "location_latitude"
            int r4 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "location_longitude"
            int r2 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "location_name"
            int r7 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "location_address"
            int r5 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "event_state"
            int r10 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = r6.getString(r12)     // Catch:{ all -> 0x00e8 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x00e8 }
            r14.A05 = r0     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = r6.getString(r11)     // Catch:{ all -> 0x00e8 }
            r14.A03 = r0     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = r6.getString(r9)     // Catch:{ all -> 0x00e8 }
            r14.A04 = r0     // Catch:{ all -> 0x00e8 }
            long r0 = r6.getLong(r1)     // Catch:{ all -> 0x00e8 }
            r14.A00 = r0     // Catch:{ all -> 0x00e8 }
            int r0 = r6.getInt(r8)     // Catch:{ all -> 0x00e8 }
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r14.A06 = r0     // Catch:{ all -> 0x00e8 }
            java.lang.String r9 = r6.getString(r7)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = r6.getString(r5)     // Catch:{ all -> 0x00e8 }
            double r4 = r6.getDouble(r4)     // Catch:{ all -> 0x00e8 }
            java.lang.Double r7 = java.lang.Double.valueOf(r4)     // Catch:{ all -> 0x00e8 }
            double r0 = r6.getDouble(r2)     // Catch:{ all -> 0x00e8 }
            java.lang.Double r2 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x00e8 }
            if (r7 == 0) goto L_0x00ae
            if (r2 == 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r2 = 0
            goto L_0x00b5
        L_0x00b0:
            X.3IM r2 = new X.3IM     // Catch:{ all -> 0x00e8 }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x00e8 }
        L_0x00b5:
            X.3J7 r0 = new X.3J7     // Catch:{ all -> 0x00e8 }
            r0.<init>(r2, r9, r8)     // Catch:{ all -> 0x00e8 }
            r14.A01 = r0     // Catch:{ all -> 0x00e8 }
            int r4 = r6.getInt(r10)     // Catch:{ all -> 0x00e8 }
            X.00n r0 = X.C52192p2.A00     // Catch:{ all -> 0x00e8 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x00e8 }
        L_0x00c6:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00e8 }
            X.2p2 r1 = (X.C52192p2) r1     // Catch:{ all -> 0x00e8 }
            int r0 = r1.value     // Catch:{ all -> 0x00e8 }
            if (r0 != r4) goto L_0x00c6
            r14.A02 = r1     // Catch:{ all -> 0x00e8 }
            goto L_0x00e1
        L_0x00d9:
            java.lang.String r1 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x00e8 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e8 }
            throw r0     // Catch:{ all -> 0x00e8 }
        L_0x00e1:
            r6.close()     // Catch:{ all -> 0x00ef }
            r3.close()
            return
        L_0x00e8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x00ef }
            throw r0     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78183rh.B7J(X.3T1):void");
    }

    public void BKi(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((C24931Ei) this.A00.get()).A02((AnonymousClass2bT) r2);
    }

    public void BwV(AnonymousClass3T1 r1) {
    }
}
