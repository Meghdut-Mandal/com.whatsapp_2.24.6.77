package X;

/* renamed from: X.3Gr  reason: invalid class name and case insensitive filesystem */
public final class C62573Gr {
    public final C25681Hg A00;
    public final AnonymousClass1KJ A01;
    public final C220412q A02;
    public final C20310xM A03;
    public final C20690y0 A04;
    public final AnonymousClass1XZ A05;
    public final AnonymousClass1A1 A06;

    public final void A01(AnonymousClass3T1 r4) {
        String str;
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass3KQ A0N = r4.A0N();
        String str2 = null;
        if (A0N != null) {
            str = A0N.A03;
        } else {
            str = null;
        }
        AnonymousClass3KQ A0N2 = r4.A0N();
        if (A0N2 != null) {
            str2 = A0N2.A06;
        }
        if (str != null) {
            AnonymousClass6YY.A0P(this.A04.A0O(str));
        }
        if (str2 != null) {
            AnonymousClass6YY.A0P(this.A04.A0P(str2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A00(java.lang.String r8) {
        /*
            r7 = this;
            X.1XZ r0 = r7.A05
            r6 = 0
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            X.12P r0 = r0.A00
            X.1M0 r4 = r0.get()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = "SELECT message_row_id FROM bot_message_info WHERE target_id= ?"
            java.lang.String[] r1 = X.C36441kJ.A1R()     // Catch:{ all -> 0x0059 }
            r1[r6] = r8     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "SQL_GET_BOT_MESSAGE_ROW_ID_BY_TARGET_ID"
            android.database.Cursor r2 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x0059 }
        L_0x001d:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "message_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0052 }
            X.C36351kA.A17(r2, r5, r0)     // Catch:{ all -> 0x0052 }
            goto L_0x001d
        L_0x002d:
            r2.close()     // Catch:{ all -> 0x0059 }
            r4.close()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r5.iterator()
        L_0x003b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0051
            long r1 = X.C36391kE.A0D(r3)
            X.1A1 r0 = r7.A06
            X.3T1 r0 = X.C36421kH.A0R(r0, r1)
            if (r0 == 0) goto L_0x003b
            r4.add(r0)
            goto L_0x003b
        L_0x0051:
            return r4
        L_0x0052:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62573Gr.A00(java.lang.String):java.util.ArrayList");
    }

    public C62573Gr(C20690y0 r2, C25681Hg r3, AnonymousClass1XZ r4, AnonymousClass1KJ r5, C220412q r6, C20310xM r7, AnonymousClass1A1 r8) {
        C36321k7.A18(r3, r6, r2, r8);
        AnonymousClass00C.A0D(r7, 7);
        this.A00 = r3;
        this.A02 = r6;
        this.A04 = r2;
        this.A06 = r8;
        this.A01 = r5;
        this.A05 = r4;
        this.A03 = r7;
    }
}
