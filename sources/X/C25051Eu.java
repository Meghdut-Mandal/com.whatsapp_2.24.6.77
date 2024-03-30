package X;

import android.content.ContentValues;

/* renamed from: X.1Eu  reason: invalid class name and case insensitive filesystem */
public class C25051Eu {
    public final AnonymousClass163 A00;
    public final AnonymousClass12P A01;

    public void A00(C65073Qp r15) {
        ContentValues contentValues;
        synchronized (r15) {
            contentValues = new ContentValues();
            contentValues.put("last_activity_ts", Long.valueOf(r15.A0K));
            contentValues.put("last_activity_seen_ts", Long.valueOf(r15.A0J));
            contentValues.put("join_ts", Long.valueOf(r15.A0I));
            contentValues.put("closed", Boolean.valueOf(r15.A0n));
        }
        AnonymousClass11F r5 = r15.A0q;
        AnonymousClass12P r2 = this.A01;
        AnonymousClass1M0 A05 = r2.A05();
        try {
            AnonymousClass163 r3 = this.A00;
            long A08 = r3.A08(r5);
            int A012 = A05.A02.A01(contentValues, "community_chat", "chat_row_id = ?", "updateCommunityChatTable", new String[]{String.valueOf(A08)});
            A05.close();
            if (A012 == 0) {
                contentValues.put("chat_row_id", Long.valueOf(r3.A08(r5)));
                A05 = r2.A05();
                try {
                    long A04 = A05.A02.A04("community_chat", "updateCommunityChatTable", contentValues);
                    A05.close();
                    r15.A0W = A04;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
        } finally {
            th = th;
            A05.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b9, code lost:
        if (r7 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c3, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.util.Map r19) {
        /*
            r18 = this;
            java.lang.String r0 = "CommunityChatStore/loadData"
            X.14g r13 = new X.14g
            r13.<init>((java.lang.String) r0)
            r12 = r18
            X.12P r0 = r12.A01
            X.1M0 r8 = r0.get()
            X.14e r3 = r8.A02     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = "SELECT chat_row_id, last_activity_ts, last_activity_seen_ts, join_ts, closed FROM community_chat"
            r1 = 0
            java.lang.String r0 = "GET_COMMUNITY_CHATS_SQL"
            android.database.Cursor r7 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x00c4 }
            java.lang.String r0 = "chat_row_id"
            int r6 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "last_activity_ts"
            int r5 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "last_activity_seen_ts"
            int r4 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "join_ts"
            int r3 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "closed"
            int r2 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b8 }
        L_0x0038:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00ae
            X.163 r9 = r12.A00     // Catch:{ all -> 0x00b8 }
            long r0 = r7.getLong(r6)     // Catch:{ all -> 0x00b8 }
            X.11F r10 = r9.A0A(r0)     // Catch:{ all -> 0x00b8 }
            if (r10 != 0) goto L_0x0063
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r9.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "CommunityChatStore/failed to find chatJid by row id: "
            r9.append(r0)     // Catch:{ all -> 0x00b8 }
            long r0 = r7.getLong(r6)     // Catch:{ all -> 0x00b8 }
            r9.append(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x00b8 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x0038
        L_0x0063:
            r11 = r19
            java.lang.Object r14 = r11.get(r10)     // Catch:{ all -> 0x00b8 }
            r9 = r14
            X.3Qp r9 = (X.C65073Qp) r9     // Catch:{ all -> 0x00b8 }
            if (r9 != 0) goto L_0x0083
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r1.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "CommunityChatStore/missing chat in map: "
            r1.append(r0)     // Catch:{ all -> 0x00b8 }
            r1.append(r10)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b8 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x0038
        L_0x0083:
            long r0 = r7.getLong(r5)     // Catch:{ all -> 0x00b8 }
            monitor-enter(r14)     // Catch:{ all -> 0x00b8 }
            r9.A0K = r0     // Catch:{ all -> 0x00ab }
            monitor-exit(r14)     // Catch:{ all -> 0x00b8 }
            long r0 = r7.getLong(r4)     // Catch:{ all -> 0x00b8 }
            monitor-enter(r14)     // Catch:{ all -> 0x00b8 }
            r9.A0J = r0     // Catch:{ all -> 0x00ab }
            monitor-exit(r14)     // Catch:{ all -> 0x00b8 }
            long r0 = r7.getLong(r3)     // Catch:{ all -> 0x00b8 }
            r9.A0I = r0     // Catch:{ all -> 0x00b8 }
            long r16 = r7.getLong(r2)     // Catch:{ all -> 0x00b8 }
            r14 = 1
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x00a5
            r0 = 1
        L_0x00a5:
            r9.A0n = r0     // Catch:{ all -> 0x00b8 }
            r11.put(r10, r9)     // Catch:{ all -> 0x00b8 }
            goto L_0x0038
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00b8 }
            throw r0     // Catch:{ all -> 0x00b8 }
        L_0x00ae:
            r13.A01()     // Catch:{ all -> 0x00b8 }
            r7.close()     // Catch:{ all -> 0x00c4 }
            r8.close()
            return
        L_0x00b8:
            r1 = move-exception
            if (r7 == 0) goto L_0x00c3
            r7.close()     // Catch:{ all -> 0x00bf }
            goto L_0x00c3
        L_0x00bf:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00c4 }
        L_0x00c3:
            throw r1     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00c9 }
            throw r1
        L_0x00c9:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25051Eu.A01(java.util.Map):void");
    }

    public C25051Eu(AnonymousClass163 r1, AnonymousClass12P r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
