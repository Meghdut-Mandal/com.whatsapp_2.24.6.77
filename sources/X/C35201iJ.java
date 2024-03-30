package X;

/* renamed from: X.1iJ  reason: invalid class name and case insensitive filesystem */
public class C35201iJ implements Runnable {
    public int A00;
    public Object A01;
    public final int A02;

    public C35201iJ(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0295, code lost:
        r8 = (X.AnonymousClass2bU) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ba, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00be, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c1, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0318 A[LOOP:4: B:163:0x0312->B:165:0x0318, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A02
            switch(r0) {
                case 0: goto L_0x033a;
                case 1: goto L_0x0037;
                case 2: goto L_0x004b;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00d0;
                case 5: goto L_0x00dd;
                case 6: goto L_0x00f3;
                case 7: goto L_0x012f;
                case 8: goto L_0x0165;
                case 9: goto L_0x0172;
                case 10: goto L_0x01a9;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r14.A01
            X.18b r7 = (X.C233318b) r7
            int r8 = r14.A00
            monitor-enter(r7)
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0034 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r0
            long r3 = r7.A01     // Catch:{ all -> 0x0034 }
            long r1 = r5 - r3
            boolean r0 = r7.A04     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0020
            X.C233318b.A01(r7, r5)     // Catch:{ all -> 0x0034 }
            r1 = 0
        L_0x0020:
            if (r8 != 0) goto L_0x0027
            int r0 = (int) r1     // Catch:{ all -> 0x0034 }
            r7.A00 = r0     // Catch:{ all -> 0x0034 }
            r0 = 1
            goto L_0x0030
        L_0x0027:
            boolean r0 = r7.A03     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0032
            int r0 = (int) r1     // Catch:{ all -> 0x0034 }
            X.C233318b.A00(r7, r0)     // Catch:{ all -> 0x0034 }
            r0 = 0
        L_0x0030:
            r7.A03 = r0     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r7)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0037:
            java.lang.Object r0 = r14.A01
            X.15h r0 = (X.C226615h) r0
            int r1 = r14.A00
            com.whatsapp.HomeActivity r0 = r0.A00
            X.005 r0 = r0.A1P
            java.lang.Object r0 = r0.get()
            X.1LV r0 = (X.AnonymousClass1LV) r0
            r0.A08(r1)
            return
        L_0x004b:
            int r1 = r14.A00
            java.lang.Object r0 = r14.A01
            X.1KH r0 = (X.AnonymousClass1KH) r0
            r5 = 1
            if (r1 != r5) goto L_0x0344
            X.1KK r4 = r0.A01
            X.1LE r0 = r4.A06
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.16r r0 = r0.A00
            X.1M0 r3 = r0.get()
            java.lang.String r7 = "SELECT jid FROM wa_biz_profiles WHERE automated_type = ?"
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ all -> 0x00bb }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00bb }
            r2[r1] = r0     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "GET_BUSINESS_JIDS_BY_AUTOMATED_TYPE"
            android.database.Cursor r2 = X.C229416o.A03(r3, r7, r0, r2)     // Catch:{ all -> 0x00bb }
        L_0x0074:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = "jid"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b4 }
            X.13r r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00b4 }
            com.whatsapp.jid.UserJid r0 = r1.A02(r0)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0074
            r6.add(r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x0074
        L_0x0090:
            r2.close()     // Catch:{ all -> 0x00bb }
            r3.close()
            java.util.Iterator r3 = r6.iterator()
        L_0x009a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0344
            java.lang.Object r2 = r3.next()
            X.11F r2 = (X.AnonymousClass11F) r2
            X.0xM r1 = r4.A08
            X.17T r0 = r1.A0j
            boolean r0 = r0.A08(r2)
            if (r0 == 0) goto L_0x009a
            X.C20310xM.A0D(r1, r2, r5, r5)
            goto L_0x009a
        L_0x00b4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x00c2:
            java.lang.Object r0 = r14.A01
            X.1ji r0 = (X.C36071ji) r0
            int r1 = r14.A00
            java.lang.Object r0 = r0.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            com.whatsapp.conversationslist.ConversationsFragment.A0L(r0, r1)
            return
        L_0x00d0:
            java.lang.Object r0 = r14.A01
            X.1e0 r0 = (X.C32671e0) r0
            int r2 = r14.A00
            X.1eC r1 = r0.A03
            r0 = 0
            r1.A00(r2, r0)
            return
        L_0x00dd:
            java.lang.Object r1 = r14.A01
            X.0yX r1 = (X.C21020yX) r1
            int r4 = r14.A00
            X.005 r0 = r1.A09
            java.lang.Object r3 = r0.get()
            X.7jN r3 = (X.C159447jN) r3
            X.1C9 r2 = r1.A03
            r1 = 0
            r0 = 1
            r3.Bpi(r2, r4, r1, r0)
            return
        L_0x00f3:
            int r3 = r14.A00
            java.lang.Object r2 = r14.A01
            X.1VU r2 = (X.AnonymousClass1VU) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PassiveModeManager/onConnectedPassiveMode passive-mode timeout ("
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " seconds), sending active-iq"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A03
            r0 = 0
            r1.set(r0)
            java.util.concurrent.atomic.AtomicReference r0 = r2.A00
            r1 = 0
            r0.set(r1)
            java.util.concurrent.atomic.AtomicReference r0 = r2.A04
            r0.get()
            java.lang.Object r0 = r0.getAndSet(r1)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x0344
            r0.run()
            return
        L_0x012f:
            java.lang.Object r5 = r14.A01
            X.1YM r5 = (X.AnonymousClass1YM) r5
            int r4 = r14.A00
            X.1EV r1 = r5.A01
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0344
            X.0wG r0 = r5.A00
            android.content.Context r1 = r0.A00
            r0 = 2131891707(0x7f1215fb, float:1.9418142E38)
            java.lang.String r3 = r1.getString(r0)
            r0 = 37
            r2 = 0
            if (r4 != r0) goto L_0x015b
            r0 = 2131891715(0x7f121603, float:1.9418158E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "DOC_VERIF_SUCCESS"
        L_0x0157:
            X.AnonymousClass1YM.A02(r5, r3, r1, r0, r2)
            return
        L_0x015b:
            r0 = 2131891714(0x7f121602, float:1.9418156E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "DOC_VERIF_FAILURE"
            goto L_0x0157
        L_0x0165:
            java.lang.Object r2 = r14.A01
            X.1Dj r2 = (X.C24681Dj) r2
            r1 = 20240306(0x134d7b2, float:3.3215532E-38)
            r0 = 162(0xa2, float:2.27E-43)
            r2.A02(r1, r0)
            return
        L_0x0172:
            java.lang.Object r3 = r14.A01
            X.1Z8 r3 = (X.AnonymousClass1Z8) r3
            int r2 = r14.A00
            X.1Z9 r0 = r3.A05
            X.00T r0 = r0.A06
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r0)
            X.3Pa r1 = (X.C64683Pa) r1
            if (r1 == 0) goto L_0x0194
            r0 = 170(0xaa, float:2.38E-43)
            r3.A01(r1, r0)
            return
        L_0x0194:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "usernoticecmsmanager/executebadgeselected not found notice in cmscontentmanager noticeid = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x01a9:
            java.lang.Object r5 = r14.A01
            X.1aL r5 = (X.C30521aL) r5
            int r8 = r14.A00
            X.1Xj r7 = r5.A0K
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.A03
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0218
            X.1Xn r0 = r7.A01
            r9 = 100
            X.12P r0 = r0.A00
            X.1M0 r6 = r0.get()
            X.14e r4 = r6.A02     // Catch:{ all -> 0x0205 }
            java.lang.String r3 = "SELECT message_row_id FROM mms_thumbnail_metadata WHERE transferred = 0 AND direct_path IS NOT NULL AND enc_thumb_hash IS NOT NULL AND media_key IS NOT NULL AND enc_thumb_hash IS NOT NULL AND media_key IS NOT NULL  ORDER BY message_row_id DESC  LIMIT ? "
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0205 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0205 }
            r2[r1] = r0     // Catch:{ all -> 0x0205 }
            java.lang.String r0 = "GET_MMS_THUMBNAIL_METADATA_TO_RETRY"
            android.database.Cursor r4 = r4.A09(r3, r0, r2)     // Catch:{ all -> 0x0205 }
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch:{ all -> 0x01f9 }
            r3.<init>()     // Catch:{ all -> 0x01f9 }
            java.lang.String r0 = "message_row_id"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01f9 }
        L_0x01e3:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x01f9 }
            if (r0 == 0) goto L_0x01f5
            long r0 = r4.getLong(r2)     // Catch:{ all -> 0x01f9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01f9 }
            r3.add(r0)     // Catch:{ all -> 0x01f9 }
            goto L_0x01e3
        L_0x01f5:
            r4.close()     // Catch:{ all -> 0x0205 }
            goto L_0x020a
        L_0x01f9:
            r1 = move-exception
            if (r4 == 0) goto L_0x0204
            r4.close()     // Catch:{ all -> 0x0200 }
            goto L_0x0204
        L_0x0200:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0205 }
        L_0x0204:
            throw r1     // Catch:{ all -> 0x0205 }
        L_0x0205:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0335 }
            throw r1
        L_0x020a:
            r6.close()
            r3.size()
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            X.C29631Xj.A00(r7, r3, r0)
        L_0x0218:
            if (r8 == 0) goto L_0x0344
            X.1DF r2 = r5.A0D
            X.0wo r0 = r5.A07
            long r11 = X.C19970wo.A00(r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r11 - r0
            r10 = 32
            r13 = 0
            X.14g r3 = new X.14g
            r3.<init>((boolean) r13)
            java.lang.String r0 = "msgstore/getRetryAutodownloadMessages"
            r3.A04(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.17U r0 = r2.A09
            X.12P r0 = r0.A02
            X.1M0 r4 = r0.get()
            X.14e r8 = r4.A02     // Catch:{ all -> 0x0330 }
            java.lang.String r7 = "SELECT sort_id FROM available_message_view WHERE timestamp <= ? ORDER BY sort_id DESC LIMIT 1"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = java.lang.Long.toString(r11)     // Catch:{ all -> 0x0330 }
            r1[r13] = r0     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "GET_SORT_ID_BY_TIMESTAMP"
            android.database.Cursor r7 = r8.A09(r7, r0, r1)     // Catch:{ all -> 0x0330 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0324 }
            if (r0 == 0) goto L_0x0264
            java.lang.String r0 = "sort_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0324 }
            long r11 = r7.getLong(r0)     // Catch:{ all -> 0x0324 }
            goto L_0x0266
        L_0x0264:
            r11 = 0
        L_0x0266:
            r7.close()     // Catch:{ all -> 0x0330 }
            r4.close()
            r4 = 1
            X.12P r0 = r2.A08     // Catch:{ IllegalStateException -> 0x02de, SQLiteDatabaseCorruptException -> 0x02d4, SQLiteDiskIOException -> 0x02cd }
            X.1M0 r7 = r0.get()     // Catch:{ IllegalStateException -> 0x02de, SQLiteDatabaseCorruptException -> 0x02d4, SQLiteDiskIOException -> 0x02cd }
            X.14e r9 = r7.A02     // Catch:{ all -> 0x02c3 }
            java.lang.String r8 = X.C56892xB.A0I     // Catch:{ all -> 0x02c3 }
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x02c3 }
            java.lang.String r0 = java.lang.Long.toString(r11)     // Catch:{ all -> 0x02c3 }
            r1[r13] = r0     // Catch:{ all -> 0x02c3 }
            java.lang.String r0 = "GET_NOT_DOWNLOADED_MEDIA_MESSAGES_SQL"
            android.database.Cursor r9 = r9.A09(r8, r0, r1)     // Catch:{ all -> 0x02c3 }
        L_0x0285:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x02b7 }
            if (r0 == 0) goto L_0x02b0
            X.1A1 r0 = r2.A0D     // Catch:{ all -> 0x02b7 }
            X.3T1 r8 = r0.A00(r9)     // Catch:{ all -> 0x02b7 }
            boolean r0 = r8 instanceof X.AnonymousClass2bU     // Catch:{ all -> 0x02b7 }
            if (r0 == 0) goto L_0x02aa
            X.2bU r8 = (X.AnonymousClass2bU) r8     // Catch:{ all -> 0x02b7 }
            X.3Qj r1 = r8.A01     // Catch:{ all -> 0x02b7 }
            if (r1 == 0) goto L_0x02aa
            boolean r0 = r1.A0V     // Catch:{ all -> 0x02b7 }
            if (r0 != 0) goto L_0x02aa
            boolean r0 = r1.A0f     // Catch:{ all -> 0x02b7 }
            if (r0 != 0) goto L_0x02aa
            boolean r0 = r1.A0Q     // Catch:{ all -> 0x02b7 }
            if (r0 == 0) goto L_0x02aa
            r6.add(r8)     // Catch:{ all -> 0x02b7 }
        L_0x02aa:
            int r0 = r6.size()     // Catch:{ all -> 0x02b7 }
            if (r0 < r10) goto L_0x0285
        L_0x02b0:
            r9.close()     // Catch:{ all -> 0x02c3 }
            r7.close()     // Catch:{ IllegalStateException -> 0x02de, SQLiteDatabaseCorruptException -> 0x02d4, SQLiteDiskIOException -> 0x02cd }
            goto L_0x02e4
        L_0x02b7:
            r1 = move-exception
            if (r9 == 0) goto L_0x02c2
            r9.close()     // Catch:{ all -> 0x02be }
            goto L_0x02c2
        L_0x02be:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02c3 }
        L_0x02c2:
            throw r1     // Catch:{ all -> 0x02c3 }
        L_0x02c3:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x02c8 }
            goto L_0x02cc
        L_0x02c8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x02de, SQLiteDatabaseCorruptException -> 0x02d4, SQLiteDiskIOException -> 0x02cd }
        L_0x02cc:
            throw r1     // Catch:{ IllegalStateException -> 0x02de, SQLiteDatabaseCorruptException -> 0x02d4, SQLiteDiskIOException -> 0x02cd }
        L_0x02cd:
            r1 = move-exception
            X.12T r0 = r2.A06
            r0.A00(r4)
            throw r1
        L_0x02d4:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r2.A07
            r0.A03()
            goto L_0x02e4
        L_0x02de:
            r1 = move-exception
            java.lang.String r0 = "msgstore/getRetryAutodownloadMessages/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
        L_0x02e4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "msgstore/getRetryAutodownloadMessages "
            r2.append(r0)
            int r0 = r6.size()
            r2.append(r0)
            java.lang.String r0 = " | time spent:"
            r2.append(r0)
            long r0 = r3.A01()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wD r0 = r5.A05
            int r3 = r0.A03(r4)
            java.util.Iterator r2 = r6.iterator()
        L_0x0312:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0344
            java.lang.Object r1 = r2.next()
            X.2bU r1 = (X.AnonymousClass2bU) r1
            X.1Ye r0 = r5.A0J
            X.C29841Ye.A00(r0, r1, r3, r4)
            goto L_0x0312
        L_0x0324:
            r1 = move-exception
            if (r7 == 0) goto L_0x032f
            r7.close()     // Catch:{ all -> 0x032b }
            goto L_0x032f
        L_0x032b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0330 }
        L_0x032f:
            throw r1     // Catch:{ all -> 0x0330 }
        L_0x0330:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0335 }
            throw r1
        L_0x0335:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x033a:
            java.lang.Object r2 = r14.A01
            X.17Y r2 = (X.AnonymousClass17Y) r2
            int r1 = r14.A00
            r0 = 1
            r2.A04(r1, r0)
        L_0x0344:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35201iJ.run():void");
    }

    public C35201iJ(C24681Dj r2) {
        this.A02 = 8;
        this.A01 = r2;
        this.A00 = 20240306;
    }
}
