package X;

/* renamed from: X.1ZV  reason: invalid class name */
public final class AnonymousClass1ZV {
    public final AnonymousClass163 A00;
    public final C219712j A01;
    public final AnonymousClass12P A02;
    public final AnonymousClass12O A03;
    public final AnonymousClass164 A04;
    public final C19970wo A05;
    public final C20810yC A06;
    public final AnonymousClass1GQ A07;

    public AnonymousClass1ZV(AnonymousClass164 r2, C19970wo r3, AnonymousClass163 r4, C219712j r5, AnonymousClass12P r6, AnonymousClass12O r7, C20810yC r8, AnonymousClass1GQ r9) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r8, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r2, 5);
        AnonymousClass00C.A0D(r9, 6);
        AnonymousClass00C.A0D(r7, 7);
        AnonymousClass00C.A0D(r6, 8);
        this.A05 = r3;
        this.A06 = r8;
        this.A01 = r5;
        this.A00 = r4;
        this.A04 = r2;
        this.A07 = r9;
        this.A03 = r7;
        this.A02 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0116, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0121, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(X.C52172p0 r33, X.C28981Uw r34) {
        /*
            r32 = this;
            r4 = 0
            r2 = 1
            r13 = r32
            X.12P r0 = r13.A02     // Catch:{ all -> 0x0122 }
            X.1M0 r8 = r0.get()     // Catch:{ all -> 0x0122 }
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x011b }
            X.163 r7 = r13.A00     // Catch:{ all -> 0x011b }
            r0 = r34
            long r0 = r7.A08(r0)     // Catch:{ all -> 0x011b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x011b }
            r3[r4] = r0     // Catch:{ all -> 0x011b }
            r0 = r33
            int r0 = r0.value     // Catch:{ all -> 0x011b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x011b }
            r3[r2] = r0     // Catch:{ all -> 0x011b }
            X.14e r2 = r8.A02     // Catch:{ all -> 0x011b }
            java.lang.String r1 = "SELECT * FROM newsletter_subscribers WHERE chat_row_id=? AND type_of_fetch=?"
            java.lang.String r0 = "GET_NEWSLETTER_SUBSCRIBERS_SQL"
            android.database.Cursor r6 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x011b }
            X.AnonymousClass00C.A0B(r6)     // Catch:{ all -> 0x0114 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0114 }
            r5.<init>()     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "chat_row_id"
            int r21 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "jid_row_id"
            int r4 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "display_name"
            int r3 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "profile_picture_direct_path"
            int r2 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "subscription_time"
            int r1 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "role"
            int r20 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "type_of_fetch"
            int r19 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "fetched_time"
            int r18 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0114 }
        L_0x0067:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x010d
            r0 = r21
            long r14 = r6.getLong(r0)     // Catch:{ all -> 0x0114 }
            boolean r0 = r6.isNull(r4)     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x007c
            r17 = 0
            goto L_0x0084
        L_0x007c:
            long r9 = r6.getLong(r4)     // Catch:{ all -> 0x0114 }
            java.lang.Long r17 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0114 }
        L_0x0084:
            boolean r0 = r6.isNull(r3)     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x008d
            r28 = 0
            goto L_0x0091
        L_0x008d:
            java.lang.String r28 = r6.getString(r3)     // Catch:{ all -> 0x0114 }
        L_0x0091:
            boolean r0 = r6.isNull(r2)     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x009a
            r29 = 0
            goto L_0x009e
        L_0x009a:
            java.lang.String r29 = r6.getString(r2)     // Catch:{ all -> 0x0114 }
        L_0x009e:
            boolean r0 = r6.isNull(r1)     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x00a7
            r27 = 0
            goto L_0x00af
        L_0x00a7:
            long r9 = r6.getLong(r1)     // Catch:{ all -> 0x0114 }
            java.lang.Long r27 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0114 }
        L_0x00af:
            r0 = r20
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x0114 }
            X.2pL r23 = X.C54112sQ.A00(r0)     // Catch:{ all -> 0x0114 }
            r0 = r19
            int r12 = r6.getInt(r0)     // Catch:{ all -> 0x0114 }
            X.2p0[] r11 = X.C52172p0.values()     // Catch:{ all -> 0x0114 }
            int r10 = r11.length     // Catch:{ all -> 0x0114 }
            r9 = 0
        L_0x00c5:
            if (r9 >= r10) goto L_0x0105
            r16 = r11[r9]     // Catch:{ all -> 0x0114 }
            r0 = r16
            int r0 = r0.value     // Catch:{ all -> 0x0114 }
            if (r0 != r12) goto L_0x0102
            r0 = r18
            long r30 = r6.getLong(r0)     // Catch:{ all -> 0x0114 }
            X.11F r0 = r7.A0A(r14)     // Catch:{ all -> 0x0114 }
            java.lang.String r9 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.AnonymousClass00C.A0E(r0, r9)     // Catch:{ all -> 0x0114 }
            X.1Uw r0 = (X.C28981Uw) r0     // Catch:{ all -> 0x0114 }
            if (r17 == 0) goto L_0x0100
            long r9 = r17.longValue()     // Catch:{ all -> 0x0114 }
            X.12j r11 = r13.A01     // Catch:{ all -> 0x0114 }
            com.whatsapp.jid.Jid r9 = r11.A09(r9)     // Catch:{ all -> 0x0114 }
        L_0x00ec:
            X.13w r9 = (X.C223313w) r9     // Catch:{ all -> 0x0114 }
            X.3KO r10 = new X.3KO     // Catch:{ all -> 0x0114 }
            r22 = r10
            r24 = r16
            r25 = r9
            r26 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0114 }
            r5.add(r10)     // Catch:{ all -> 0x0114 }
            goto L_0x0067
        L_0x0100:
            r9 = 0
            goto L_0x00ec
        L_0x0102:
            int r9 = r9 + 1
            goto L_0x00c5
        L_0x0105:
            java.lang.String r1 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0114 }
            r0.<init>(r1)     // Catch:{ all -> 0x0114 }
            throw r0     // Catch:{ all -> 0x0114 }
        L_0x010d:
            r6.close()     // Catch:{ all -> 0x011b }
            r8.close()     // Catch:{ all -> 0x0122 }
            return r5
        L_0x0114:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0116 }
        L_0x0116:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x011b }
            throw r0     // Catch:{ all -> 0x011b }
        L_0x011b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x011d }
        L_0x011d:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ all -> 0x0122 }
            throw r0     // Catch:{ all -> 0x0122 }
        L_0x0122:
            r1 = move-exception
            X.03N r0 = new X.03N
            r0.<init>(r1)
            java.lang.Throwable r1 = r0.exception
            if (r1 == 0) goto L_0x0131
            java.lang.String r0 = "NewsletterSubscribersManager/getNewsletterSubscribersFromDb/failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0131:
            X.09w r5 = X.C023409w.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZV.A01(X.2p0, X.1Uw):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2Y9 A00(X.C52172p0 r8, X.C28981Uw r9, X.AnonymousClass4RF r10, boolean r11) {
        /*
            r7 = this;
            X.1GQ r1 = r7.A07
            r0 = 3877(0xf25, float:5.433E-42)
            boolean r0 = X.AnonymousClass1GQ.A01(r1, r0)
            r6 = 0
            if (r0 == 0) goto L_0x0095
            r4 = 0
            r2 = 1
            X.12P r0 = r7.A02     // Catch:{ all -> 0x0060 }
            X.1M0 r5 = r0.get()     // Catch:{ all -> 0x0060 }
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0059 }
            X.163 r0 = r7.A00     // Catch:{ all -> 0x0059 }
            long r0 = r0.A08(r9)     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0059 }
            r3[r4] = r0     // Catch:{ all -> 0x0059 }
            int r0 = r8.value     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0059 }
            r3[r2] = r0     // Catch:{ all -> 0x0059 }
            X.14e r2 = r5.A02     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = "SELECT fetched_time FROM newsletter_subscribers WHERE chat_row_id=? AND type_of_fetch=? LIMIT 1"
            java.lang.String r0 = "GET_NEWSLETTER_SUBSCRIBERS_SQL"
            android.database.Cursor r2 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x0059 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0041
            r2.close()     // Catch:{ all -> 0x0059 }
            r5.close()     // Catch:{ all -> 0x0060 }
            goto L_0x006f
        L_0x0041:
            java.lang.String r0 = "fetched_time"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0052 }
            long r3 = r2.getLong(r0)     // Catch:{ all -> 0x0052 }
            r2.close()     // Catch:{ all -> 0x0059 }
            r5.close()     // Catch:{ all -> 0x0060 }
            goto L_0x0071
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
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0060 }
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r1 = move-exception
            X.03N r0 = new X.03N
            r0.<init>(r1)
            java.lang.Throwable r1 = r0.exception
            if (r1 == 0) goto L_0x006f
            java.lang.String r0 = "NewsletterSubscribersManager/getNewsletterSubscribersFromDb/failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x006f:
            r3 = -1
        L_0x0071:
            X.0yC r2 = r7.A06
            r1 = 5217(0x1461, float:7.31E-42)
            X.0yV r0 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r0, r2, r1)
            if (r11 != 0) goto L_0x008a
            long r0 = (long) r0
            long r3 = r3 + r0
            X.0wo r0 = r7.A05
            long r1 = X.C19970wo.A00(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x008a
            return r6
        L_0x008a:
            X.2Y9 r1 = new X.2Y9
            r1.<init>(r8, r9, r10)
            X.164 r0 = r7.A04
            r0.A01(r1)
            return r1
        L_0x0095:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZV.A00(X.2p0, X.1Uw, X.4RF, boolean):X.2Y9");
    }
}
