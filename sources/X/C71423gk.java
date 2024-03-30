package X;

/* renamed from: X.3gk  reason: invalid class name and case insensitive filesystem */
public final class C71423gk implements C159417jK {
    public final AnonymousClass1LO A00;
    public final C588631i A01;
    public final C21010yW A02;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BV1() {
        /*
            r7 = this;
            X.1LO r4 = r7.A00     // Catch:{ SQLiteException -> 0x0067 }
            X.1M0 r3 = r4.get()     // Catch:{ SQLiteException -> 0x0067 }
            X.31i r6 = r7.A01     // Catch:{ all -> 0x0060 }
            X.C36361kB.A1I(r3)     // Catch:{ all -> 0x0060 }
            r5 = 0
            X.14e r2 = r3.A02     // Catch:{ Exception -> 0x0043 }
            java.lang.String r1 = "\n          SELECT\n            comment_parent_group_id, \n            comment_space_id, \n            comments, \n            comment_deletes, \n            accumulated_comments, \n            group_size_bucket,\n            cag_message_sent_ds \n          FROM comments_event_logging\n        "
            java.lang.String r0 = "get_comment_action_counts"
            android.database.Cursor r5 = r2.A09(r1, r0, r5)     // Catch:{ Exception -> 0x0043 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ Exception -> 0x0043 }
            r1 = 0
            X.4YI r0 = new X.4YI     // Catch:{ Exception -> 0x0043 }
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x0043 }
            X.3xe r2 = new X.3xe     // Catch:{ Exception -> 0x0043 }
            r2.<init>(r5, r0)     // Catch:{ Exception -> 0x0043 }
        L_0x0024:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0038
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x003c }
            X.2Rb r1 = (X.C45362Rb) r1     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0024
            X.0yW r0 = r7.A02     // Catch:{ all -> 0x003c }
            r0.Blv(r1)     // Catch:{ all -> 0x003c }
            goto L_0x0024
        L_0x0038:
            r2.close()     // Catch:{ all -> 0x0060 }
            goto L_0x004d
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0060 }
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0043:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "CommentDailyActionLoggingStore/getWamCommentsDailyStats: "
            X.C36321k7.A1W(r0, r1, r2)     // Catch:{ all -> 0x0060 }
        L_0x004d:
            r3.close()     // Catch:{ SQLiteException -> 0x0067 }
            X.14e r0 = r4.BJK()
            android.database.sqlite.SQLiteDatabase r3 = r0.A00
            java.lang.String r2 = "comments_event_logging"
            java.lang.String r1 = "DROP TABLE IF EXISTS comments_event_logging"
            java.lang.String r0 = "CREATE TABLE comments_event_logging (comment_space_id TEXT PRIMARY KEY, comment_parent_group_id TEXT NOT NULL, comments INTEGER NOT NULL DEFAULT 0, comment_deletes INTEGER NOT NULL DEFAULT 0, accumulated_comments INTEGER NOT NULL DEFAULT 0, group_size_bucket INTEGER NOT NULL DEFAULT 0, cag_message_sent_ds INTEGER NOT NULL DEFAULT 0)"
            X.AnonymousClass1LO.A01(r3, r4, r2, r1, r0)
            return
        L_0x0060:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ SQLiteException -> 0x0067 }
            throw r0     // Catch:{ SQLiteException -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            java.lang.String r0 = "CommentsDailyEventLoggerDailyCron/failed to send comments daily actions"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71423gk.BV1():void");
    }

    public C71423gk(AnonymousClass1LO r1, C588631i r2, C21010yW r3) {
        C36321k7.A11(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
