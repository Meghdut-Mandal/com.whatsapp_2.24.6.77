package X;

import android.content.ContentValues;

/* renamed from: X.16x  reason: invalid class name and case insensitive filesystem */
public final class C230316x {
    public final AnonymousClass12P A00;
    public final C20810yC A01;

    public C230316x(AnonymousClass12P r2, C20810yC r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0061, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0064, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C64863Ps A00(X.C230316x r5, long r6) {
        /*
            X.12P r0 = r5.A00
            X.1M0 r5 = r0.get()
            X.14e r4 = r5.A02     // Catch:{ all -> 0x005e }
            java.lang.String r3 = "SELECT display_name, username FROM lid_display_name WHERE lid_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x005e }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x005e }
            r2[r1] = r0     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "LidDisplayNameStore/GET_DISPLAY_NAME"
            android.database.Cursor r4 = r4.A09(r3, r0, r2)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "username"
            int r2 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "display_name"
            int r3 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0057 }
            r1 = 0
            if (r3 < 0) goto L_0x0050
            if (r2 < 0) goto L_0x0050
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0050
            java.lang.String r2 = r4.getString(r2)     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x003f
            int r0 = r2.length()     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x0040
            r2 = 0
            goto L_0x0040
        L_0x003f:
            r2 = r1
        L_0x0040:
            java.lang.String r1 = r4.getString(r3)     // Catch:{ all -> 0x0057 }
            X.3Ps r0 = new X.3Ps     // Catch:{ all -> 0x0057 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0057 }
            r4.close()     // Catch:{ all -> 0x005e }
            r5.close()
            return r0
        L_0x0050:
            r4.close()     // Catch:{ all -> 0x005e }
            r5.close()
            return r1
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230316x.A00(X.16x, long):X.3Ps");
    }

    public static final void A01(C26911Lz r9, String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("lid_row_id", Long.valueOf(j));
        contentValues.put("display_name", str);
        C224114e r5 = ((AnonymousClass1M0) r9).A02;
        if (((long) r5.A01(contentValues, "lid_display_name", "lid_row_id = ?", "LidDisplayNameStore/INSERT_DISPLAY_NAME", new String[]{String.valueOf(j)})) <= 0) {
            r5.A08("lid_display_name", "LidDisplayNameStore/INSERT_DISPLAY_NAME", contentValues, 5);
        }
    }
}
