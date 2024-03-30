package X;

/* renamed from: X.3gx  reason: invalid class name and case insensitive filesystem */
public final class C71553gx implements C159417jK {
    public final C19700wN A00;
    public final AnonymousClass1LO A01;
    public final C26821Lq A02;
    public final C26841Ls A03;
    public final C21010yW A04;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BV1() {
        /*
            r25 = this;
            java.lang.String r0 = "CommunityEventLoggerDailyCron/sendCommunityHomeActionLogging()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r14 = r25
            X.1LO r4 = r14.A01     // Catch:{ SQLiteException -> 0x0050 }
            X.1M0 r5 = r4.get()     // Catch:{ SQLiteException -> 0x0050 }
            X.1Ls r6 = r14.A03     // Catch:{ all -> 0x0049 }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "SELECT jid_row_id, home_view_count, home_group_navigation_count, home_group_discovery_count, home_group_join_count FROM community_home_action_logging"
            r1 = 0
            java.lang.String r0 = "get_community_action_counts"
            android.database.Cursor r2 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x0049 }
            r1 = 1
            X.4YI r0 = new X.4YI     // Catch:{ all -> 0x0049 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0049 }
            X.3xe r3 = new X.3xe     // Catch:{ all -> 0x0049 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0049 }
            r2 = 0
        L_0x0026:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003b
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0042 }
            X.2Qo r1 = (X.C45232Qo) r1     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0026
            X.0yW r0 = r14.A04     // Catch:{ all -> 0x0042 }
            r0.Blv(r1)     // Catch:{ all -> 0x0042 }
            r2 = 1
            goto L_0x0026
        L_0x003b:
            r3.close()     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ SQLiteException -> 0x0050 }
            goto L_0x0060
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0049 }
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ SQLiteException -> 0x0050 }
            throw r0     // Catch:{ SQLiteException -> 0x0050 }
        L_0x0050:
            r3 = move-exception
            X.0wN r2 = r14.A00
            java.lang.String r1 = "CommunityEventLoggerDailyCron/send"
            java.lang.String r0 = "Issue sending community action logs"
            r2.A0D(r1, r0, r3)
            java.lang.String r0 = "CommunityEventLoggerDailyCron/failed to send home actions"
            com.whatsapp.util.Log.e(r0, r3)
            goto L_0x0076
        L_0x0060:
            if (r2 == 0) goto L_0x0076
            java.lang.String r0 = "DailyMetricsDbHelper/recreating community table"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.14e r0 = r4.BJK()
            android.database.sqlite.SQLiteDatabase r3 = r0.A00
            java.lang.String r2 = "community_home_action_logging"
            java.lang.String r1 = "DROP TABLE IF EXISTS community_home_action_logging"
            java.lang.String r0 = "CREATE TABLE community_home_action_logging(jid_row_id INTEGER PRIMARY KEY, home_view_count INTEGER NOT NULL DEFAULT 0, home_group_navigation_count INTEGER NOT NULL DEFAULT 0, home_group_discovery_count INTEGER NOT NULL DEFAULT 0, home_group_join_count INTEGER NOT NULL DEFAULT 0)"
            X.AnonymousClass1LO.A01(r3, r4, r2, r1, r0)
        L_0x0076:
            X.1Lq r0 = r14.A02
            r24 = r0
            android.content.SharedPreferences r1 = X.C26821Lq.A00(r24)
            java.lang.String r13 = "community_tab_no_action_view"
            r0 = 0
            int r3 = r1.getInt(r13, r0)
            android.content.SharedPreferences r1 = X.C26821Lq.A00(r24)
            java.lang.String r12 = "community_tab_daily_views"
            int r2 = r1.getInt(r12, r0)
            android.content.SharedPreferences r1 = X.C26821Lq.A00(r24)
            java.lang.String r11 = "community_tab_views_via_context_menu"
            int r1 = r1.getInt(r11, r0)
            int r2 = r2 + r1
            int r1 = java.lang.Math.min(r3, r2)
            long r1 = (long) r1
            r22 = r1
            android.content.SharedPreferences r1 = X.C26821Lq.A00(r24)
            java.lang.String r10 = "community_tab_group_navigation"
            int r1 = r1.getInt(r10, r0)
            long r15 = (long) r1
            android.content.SharedPreferences r1 = X.C26821Lq.A00(r24)
            int r1 = r1.getInt(r12, r0)
            long r7 = (long) r1
            android.content.SharedPreferences r1 = X.C26821Lq.A00(r24)
            java.lang.String r9 = "community_tab_to_home_views"
            int r1 = r1.getInt(r9, r0)
            long r5 = (long) r1
            android.content.SharedPreferences r1 = X.C26821Lq.A00(r24)
            int r1 = r1.getInt(r11, r0)
            long r3 = (long) r1
            r2 = 5
            long[] r1 = new long[r2]
            r1[r0] = r22
            r0 = 1
            r1[r0] = r15
            r0 = 2
            r1[r0] = r7
            r0 = 3
            r1[r0] = r5
            r0 = 4
            r1[r0] = r3
            r0 = 0
        L_0x00db:
            r20 = r1[r0]
            r18 = 0
            int r17 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r17 == 0) goto L_0x0168
            X.2Qp r1 = new X.2Qp
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r22)
            r1.A00 = r0
            java.lang.Long r2 = java.lang.Long.valueOf(r15)
            r1.A01 = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r1.A03 = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r1.A02 = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r1.A04 = r2
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r3 = "\n                  CommunityEventLoggerDailyCron/sendCommunityTabLogging\n                  /no action views = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "\n                  /navigation = "
            r2.append(r0)
            java.lang.Long r0 = r1.A01
            r2.append(r0)
            java.lang.String r0 = "\n                  / view count = "
            r2.append(r0)
            java.lang.Long r0 = r1.A03
            r2.append(r0)
            java.lang.String r0 = "\n                  / tab to home = "
            r2.append(r0)
            java.lang.Long r0 = r1.A02
            r2.append(r0)
            java.lang.String r0 = "\n                  / view count from context menu = "
            r2.append(r0)
            java.lang.Long r0 = r1.A04
            r2.append(r0)
            java.lang.String r0 = "\n                  "
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            X.AnonymousClass091.A01(r0)
            X.0yW r0 = r14.A04
            r0.Blv(r1)
            android.content.SharedPreferences r0 = X.C26821Lq.A00(r24)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r12)
            android.content.SharedPreferences$Editor r0 = r0.remove(r11)
            android.content.SharedPreferences$Editor r0 = r0.remove(r9)
            android.content.SharedPreferences$Editor r0 = r0.remove(r10)
            android.content.SharedPreferences$Editor r0 = r0.remove(r13)
            r0.commit()
        L_0x0167:
            return
        L_0x0168:
            int r0 = r0 + 1
            if (r0 >= r2) goto L_0x0167
            goto L_0x00db
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71553gx.BV1():void");
    }

    public C71553gx(C19700wN r1, AnonymousClass1LO r2, C26821Lq r3, C26841Ls r4, C21010yW r5) {
        C36321k7.A1B(r1, r5, r2, r3, r4);
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
