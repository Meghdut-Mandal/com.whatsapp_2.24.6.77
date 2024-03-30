package X;

/* renamed from: X.1ZK  reason: invalid class name */
public final class AnonymousClass1ZK {
    public final AnonymousClass17T A00;
    public final AnonymousClass17U A01;
    public final AnonymousClass1A1 A02;
    public final C19970wo A03;
    public final C20310xM A04;
    public final C20810yC A05;
    public final AnonymousClass1SM A06;
    public final AnonymousClass1SP A07;
    public final C238019x A08;

    public AnonymousClass1ZK(C19970wo r2, C20310xM r3, AnonymousClass17T r4, AnonymousClass17U r5, C20810yC r6, AnonymousClass1SM r7, AnonymousClass1SP r8, C238019x r9, AnonymousClass1A1 r10) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r10, 4);
        AnonymousClass00C.A0D(r9, 5);
        AnonymousClass00C.A0D(r7, 6);
        AnonymousClass00C.A0D(r3, 7);
        AnonymousClass00C.A0D(r6, 9);
        this.A03 = r2;
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r10;
        this.A08 = r9;
        this.A06 = r7;
        this.A04 = r3;
        this.A07 = r8;
        this.A05 = r6;
    }

    public final void A00(C44072La r12) {
        if (this.A01.A05(r12.A06()) != 3) {
            C28981Uw A0J = r12.A0J();
            Long valueOf = Long.valueOf(r12.A0Q);
            A01(A0J, valueOf, 134, 3);
            A01(A0J, valueOf, 132, 4);
            if (r12.A0L()) {
                A01(A0J, valueOf, 154, 5);
            }
        }
    }

    public final void A01(AnonymousClass11F r6, Long l, int i, long j) {
        long A002;
        AnonymousClass00C.A0D(r6, 0);
        if (l != null) {
            A002 = l.longValue();
        } else {
            A002 = C19970wo.A00(this.A03);
        }
        AnonymousClass2bI A022 = this.A08.A02(r6, i, A002);
        AnonymousClass00C.A08(A022);
        A022.A1O = j;
        this.A04.A0P(A022);
        AnonymousClass1SP r3 = this.A07;
        r3.A02.A00(new C35741jB(A022, r3, 39));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C28981Uw r8) {
        /*
            r7 = this;
            X.1SM r6 = r7.A06
            r5 = 0
            X.12P r0 = r6.A03     // Catch:{ SQLiteException -> 0x0066 }
            X.1M0 r3 = r0.A05()     // Catch:{ SQLiteException -> 0x0066 }
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x005f }
            X.163 r0 = r6.A00     // Catch:{ all -> 0x005f }
            long r0 = r0.A08(r8)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x005f }
            r4[r5] = r0     // Catch:{ all -> 0x005f }
            r1 = 1
            java.lang.String r0 = "133"
            r4[r1] = r0     // Catch:{ all -> 0x005f }
            X.14e r2 = r3.A02     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "SELECT m._id FROM message_view AS m LEFT JOIN message_system AS ms  ON m._id = ms.message_row_id  WHERE chat_row_id = ?  AND action_type = ?"
            java.lang.String r0 = "SELECT_DELETE_SYSTEM_MESSAGE"
            android.database.Cursor r4 = r2.A09(r1, r0, r4)     // Catch:{ all -> 0x005f }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "_id"
            int r0 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0058 }
            if (r0 < 0) goto L_0x0051
            long r1 = r4.getLong(r0)     // Catch:{ all -> 0x0058 }
            X.1A1 r0 = r6.A07     // Catch:{ all -> 0x0058 }
            X.175 r0 = r0.A01     // Catch:{ all -> 0x0058 }
            X.3T1 r2 = r0.A01(r1)     // Catch:{ all -> 0x0058 }
            boolean r0 = r2 instanceof X.AnonymousClass2bI     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0051
            X.0xM r1 = r6.A02     // Catch:{ all -> 0x0058 }
            java.util.List r0 = java.util.Collections.singletonList(r2)     // Catch:{ all -> 0x0058 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0058 }
            r1.A0v(r0, r5)     // Catch:{ all -> 0x0058 }
        L_0x0051:
            r4.close()     // Catch:{ all -> 0x005f }
            r3.close()     // Catch:{ SQLiteException -> 0x0066 }
            return
        L_0x0058:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x005f }
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ SQLiteException -> 0x0066 }
            throw r0     // Catch:{ SQLiteException -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageStore/deleteNewsletterDeleteSystemMessage"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZK.A02(X.1Uw):void");
    }
}
