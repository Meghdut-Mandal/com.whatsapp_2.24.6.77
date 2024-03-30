package X;

/* renamed from: X.3gl  reason: invalid class name and case insensitive filesystem */
public final class C71433gl implements C159417jK {
    public final AnonymousClass1LO A00;
    public final AnonymousClass1YC A01;
    public final C21010yW A02;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BV1() {
        /*
            r7 = this;
            X.1LO r4 = r7.A00     // Catch:{ SQLiteException -> 0x00af }
            X.1M0 r3 = r4.get()     // Catch:{ SQLiteException -> 0x00af }
            X.1YC r6 = r7.A01     // Catch:{ all -> 0x00a8 }
            r5 = 0
            X.14e r2 = r3.A02     // Catch:{ Exception -> 0x0086 }
            java.lang.String r1 = "SELECT community_id, type_of_subgroup, reaction_open_tray_count, reaction_delete_count, pnh_indicator_clicks_chat, pnh_indicator_clicks_info_screen FROM pnh_daily_event_logging"
            java.lang.String r0 = "get_pnh_daily_action_counts"
            android.database.Cursor r5 = r2.A09(r1, r0, r5)     // Catch:{ Exception -> 0x0086 }
            r1 = 2
            X.4YI r0 = new X.4YI     // Catch:{ Exception -> 0x0086 }
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x0086 }
            X.3xe r2 = new X.3xe     // Catch:{ Exception -> 0x0086 }
            r2.<init>(r5, r0)     // Catch:{ Exception -> 0x0086 }
        L_0x001e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x007b
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x007f }
            X.2RQ r1 = (X.AnonymousClass2RQ) r1     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x001e
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "\n                  PnhDailyEventLoggerDailyCron/sendPnhDailyActionLogging\n                  /community id = "
            r5.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = r1.A05     // Catch:{ all -> 0x007f }
            r5.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "\n                  /type of group = "
            r5.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.Integer r0 = r1.A00     // Catch:{ all -> 0x007f }
            r5.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "\n                  /pnh click in chat = "
            r5.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.Long r0 = r1.A01     // Catch:{ all -> 0x007f }
            r5.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "\n                  /pnh click in cag info = "
            r5.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.Long r0 = r1.A02     // Catch:{ all -> 0x007f }
            r5.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "\n                  /reaction delete count = "
            r5.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.Long r0 = r1.A03     // Catch:{ all -> 0x007f }
            r5.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "\n                  /reaction open tray count = "
            r5.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.Long r0 = r1.A04     // Catch:{ all -> 0x007f }
            r5.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "\n                  "
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r5)     // Catch:{ all -> 0x007f }
            X.AnonymousClass091.A01(r0)     // Catch:{ all -> 0x007f }
            X.0yW r0 = r7.A02     // Catch:{ all -> 0x007f }
            r0.Blv(r1)     // Catch:{ all -> 0x007f }
            goto L_0x001e
        L_0x007b:
            r2.close()     // Catch:{ all -> 0x00a8 }
            goto L_0x0090
        L_0x007f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x00a8 }
            throw r0     // Catch:{ all -> 0x00a8 }
        L_0x0086:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "PollDailyActionLoggingStore/getWamPnhDaily failure: "
            X.C36321k7.A1J(r2, r0, r1)     // Catch:{ all -> 0x00a8 }
        L_0x0090:
            r3.close()     // Catch:{ SQLiteException -> 0x00af }
            java.lang.String r0 = "DailyMetricsDbHelper/recreating pnh_daily_event_logging table"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.14e r0 = r4.BJK()
            android.database.sqlite.SQLiteDatabase r3 = r0.A00
            java.lang.String r2 = "pnh_daily_event_logging"
            java.lang.String r1 = "DROP TABLE IF EXISTS pnh_daily_event_logging"
            java.lang.String r0 = "CREATE TABLE pnh_daily_event_logging(community_id TEXT NOT NULL, type_of_subgroup INTEGER NOT NULL, reaction_open_tray_count INTEGER NOT NULL DEFAULT 0, reaction_delete_count INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_chat INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_info_screen INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (community_id, type_of_subgroup))"
            X.AnonymousClass1LO.A01(r3, r4, r2, r1, r0)
            return
        L_0x00a8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ SQLiteException -> 0x00af }
            throw r0     // Catch:{ SQLiteException -> 0x00af }
        L_0x00af:
            r1 = move-exception
            java.lang.String r0 = "PnhDailyEventLoggerDailyCron/failed to send pnh daily actions"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71433gl.BV1():void");
    }

    public C71433gl(AnonymousClass1LO r1, AnonymousClass1YC r2, C21010yW r3) {
        C36321k7.A11(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
