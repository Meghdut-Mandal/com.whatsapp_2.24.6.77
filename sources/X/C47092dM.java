package X;

import android.os.SystemClock;

/* renamed from: X.2dM  reason: invalid class name and case insensitive filesystem */
public final class C47092dM extends C107145Ms {
    public final /* synthetic */ AnonymousClass2dN A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47092dM(AnonymousClass2dN r3) {
        super(r3, true, false, false);
        this.A00 = r3;
    }

    public String A0H() {
        return "restore>PrepareMessageStoreTransferTask/";
    }

    public void A0K(C131006Ni r1) {
    }

    public boolean A0L(C131006Ni r2) {
        return false;
    }

    public C131006Ni A0G() {
        C29301Wc r0 = this.A00.A01;
        C591532v r4 = new C591532v(this);
        C20220xD A002 = C29301Wc.A00(r0);
        return A002.A09.A0G(new AnonymousClass6XX(A002, r4, 0), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.C05600Qi.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012f, code lost:
        if (r2 == false) goto L_0x0131;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I() {
        /*
            r13 = this;
            X.2dN r4 = r13.A00
            X.1CR r0 = r4.A04
            X.1Ch r2 = r0.A0E
            X.0wG r0 = r0.A07
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "chatsettings.db"
            java.io.File r1 = r1.getDatabasePath(r0)
            java.lang.String r0 = "chat_setting_store"
            int r1 = r2.A03(r1, r0)
            r0 = 19
            boolean r5 = X.AnonymousClass000.A1S(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/successfully replaced chat setting "
            X.C36321k7.A1X(r0, r1, r5)
            X.3T0 r0 = r4.A05
            boolean r2 = r0.A0D()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/successfully replaced wall paper "
            X.C36321k7.A1X(r0, r1, r2)
            X.54W r2 = r4.A06
            monitor-enter(r2)
            X.0yF r0 = r2.A04     // Catch:{ IOException -> 0x00c0 }
            X.0yG r1 = r0.A00     // Catch:{ IOException -> 0x00c0 }
            java.lang.String r0 = ""
            java.io.File r3 = r1.A01(r0)     // Catch:{ IOException -> 0x00c0 }
            X.1Ch r1 = r2.A02     // Catch:{ IOException -> 0x00c0 }
            java.lang.String r0 = "sticker_store"
            int r1 = r1.A03(r3, r0)     // Catch:{ IOException -> 0x00c0 }
            r0 = 19
            if (r1 != r0) goto L_0x00c6
            X.0wG r0 = r2.A01     // Catch:{ all -> 0x01f8 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x01f8 }
            boolean r3 = r2.A0N(r0, r3)     // Catch:{ all -> 0x01f8 }
            if (r3 == 0) goto L_0x00c7
            X.1Aq r0 = r2.A03     // Catch:{ all -> 0x01f8 }
            java.lang.String r9 = "/com.whatsapp/"
            java.lang.String r6 = "/com.whatsapp.w4b/"
            r11 = 1
            X.005 r0 = r0.A01     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01f8 }
            X.16q r0 = (X.C229616q) r0     // Catch:{ all -> 0x01f8 }
            X.1M0 r7 = r0.A04()     // Catch:{ all -> 0x01f8 }
            X.71s r10 = r7.B1k()     // Catch:{ all -> 0x00b9 }
            X.14e r8 = r7.A02     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = "UPDATE stickers SET file_path = REPLACE(file_path, ?, ?);"
            java.lang.String r0 = "UPDATE_STICKER_TABLE_FILE_PATH"
            X.6QI r1 = r8.A0C(r1, r0)     // Catch:{ all -> 0x00b2 }
            r1.A06(r11, r9)     // Catch:{ all -> 0x00b2 }
            r0 = 2
            r1.A06(r0, r6)     // Catch:{ all -> 0x00b2 }
            r1.A01()     // Catch:{ all -> 0x00b2 }
            r10.A00()     // Catch:{ all -> 0x00b2 }
            r10.close()     // Catch:{ all -> 0x00b9 }
            r7.close()     // Catch:{ all -> 0x01f8 }
            X.1Av r0 = r2.A00     // Catch:{ all -> 0x01f8 }
            X.1Ay r0 = r0.A02     // Catch:{ all -> 0x01f8 }
            X.12P r0 = r0.A00     // Catch:{ all -> 0x01f8 }
            X.1M0 r8 = r0.A05()     // Catch:{ all -> 0x01f8 }
            r0 = 2
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x00a8 }
            X.C36341k9.A1I(r9, r6, r7)     // Catch:{ all -> 0x00a8 }
            X.14e r6 = r8.A02     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = "UPDATE media_refs SET path = REPLACE (path, ?, ?);"
            java.lang.String r0 = "MEDIA_REFS_CHANGE_PATH_SQL"
            r6.A0E(r1, r0, r7)     // Catch:{ all -> 0x00a8 }
            r8.close()     // Catch:{ all -> 0x01f8 }
            goto L_0x00c7
        L_0x00a8:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00ad }
            goto L_0x00b1
        L_0x00ad:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01f8 }
        L_0x00b1:
            throw r1     // Catch:{ all -> 0x01f8 }
        L_0x00b2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            X.C05600Qi.A00(r10, r1)     // Catch:{ all -> 0x00b9 }
            throw r0     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x01f8 }
            throw r0     // Catch:{ all -> 0x01f8 }
        L_0x00c0:
            r1 = move-exception
            java.lang.String r0 = "StickerDBStorage/getFileToRestoreFrom: failed to copy sticker file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01f8 }
        L_0x00c6:
            r3 = 0
        L_0x00c7:
            monitor-exit(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/successfully restored stickers "
            X.C36321k7.A1X(r0, r1, r3)
            X.54Q r0 = r4.A01
            r6 = 0
            X.1Ch r2 = r0.A00     // Catch:{ IllegalArgumentException -> 0x00ee }
            java.lang.String r1 = "chat_lock_passcode"
            X.005 r0 = r0.A01     // Catch:{ IllegalArgumentException -> 0x00ee }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalArgumentException -> 0x00ee }
            X.1Hn r0 = (X.C25751Hn) r0     // Catch:{ IllegalArgumentException -> 0x00ee }
            java.io.File r0 = r0.A01()     // Catch:{ IllegalArgumentException -> 0x00ee }
            int r1 = r2.A03(r0, r1)     // Catch:{ IllegalArgumentException -> 0x00ee }
            r0 = 19
            if (r1 != r0) goto L_0x00f4
            r6 = 1
            goto L_0x00f4
        L_0x00ee:
            r1 = move-exception
            java.lang.String r0 = "ChatLockBackup/restoreFromMigration failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00f4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/successfully restored chat lock "
            X.C36321k7.A1X(r0, r1, r6)
            X.1Ch r7 = r4.A03
            X.0v0 r6 = r7.A03
            java.lang.String r2 = r6.A0f()
            java.lang.String r1 = r6.A0h()
            java.lang.String r0 = "share_preferences"
            android.net.Uri r8 = X.C24401Ch.A01(r0, r2, r1)
            X.0yb r0 = r7.A01
            X.0ya r7 = r0.A0O()
            r9 = 0
            r11 = r9
            r12 = r9
            r10 = r9
            android.database.Cursor r8 = r7.A03(r8, r9, r10, r11, r12)
            r9 = 0
            if (r8 != 0) goto L_0x013f
            r2 = 0
        L_0x0121:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/successfully restored some shared preferences setting "
            X.C36321k7.A1X(r0, r1, r2)
            if (r5 == 0) goto L_0x0131
            if (r3 == 0) goto L_0x0131
            r0 = 1
            if (r2 != 0) goto L_0x0132
        L_0x0131:
            r0 = 0
        L_0x0132:
            X.1QE r1 = r4.A02
            r0 = r0 ^ 1
            X.1QF r1 = r1.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            return
        L_0x013f:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x01ee }
            r1 = 1
            if (r0 == 0) goto L_0x01e8
            r0 = 2
            java.lang.String r2 = r8.getString(r0)     // Catch:{ all -> 0x01ee }
            java.lang.String r7 = r8.getString(r9)     // Catch:{ all -> 0x01ee }
            int r0 = r2.hashCode()     // Catch:{ all -> 0x01ee }
            switch(r0) {
                case -1572742348: goto L_0x0157;
                case -891985903: goto L_0x019f;
                case 104431: goto L_0x01af;
                case 3327612: goto L_0x01bf;
                case 64711720: goto L_0x01d4;
                default: goto L_0x0156;
            }     // Catch:{ all -> 0x01ee }
        L_0x0156:
            goto L_0x013f
        L_0x0157:
            java.lang.String r0 = "string_set"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = r8.getString(r1)     // Catch:{ JSONException -> 0x0190 }
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0190 }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x0190 }
            int r0 = r10.length()     // Catch:{ JSONException -> 0x0190 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ JSONException -> 0x0190 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0190 }
            r1 = 0
        L_0x0172:
            int r0 = r10.length()     // Catch:{ JSONException -> 0x0190 }
            if (r1 >= r0) goto L_0x0184
            java.lang.Object r0 = r10.get(r1)     // Catch:{ JSONException -> 0x0190 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0190 }
            r2.add(r0)     // Catch:{ JSONException -> 0x0190 }
            int r1 = r1 + 1
            goto L_0x0172
        L_0x0184:
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r6)     // Catch:{ JSONException -> 0x0190 }
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r7, r2)     // Catch:{ JSONException -> 0x0190 }
            r0.apply()     // Catch:{ JSONException -> 0x0190 }
            goto L_0x013f
        L_0x0190:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01ee }
            java.lang.String r0 = "MigrateFileDirectlyHelper/replaceSharedPreferencesSetting/ failed to create json array for key: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r7, r1)     // Catch:{ all -> 0x01ee }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x01ee }
            goto L_0x013f
        L_0x019f:
            java.lang.String r0 = "string"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = r8.getString(r1)     // Catch:{ all -> 0x01ee }
            r6.A1m(r7, r0)     // Catch:{ all -> 0x01ee }
            goto L_0x013f
        L_0x01af:
            java.lang.String r0 = "int"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x013f
            int r0 = r8.getInt(r1)     // Catch:{ all -> 0x01ee }
            r6.A1c(r7, r0)     // Catch:{ all -> 0x01ee }
            goto L_0x013f
        L_0x01bf:
            java.lang.String r0 = "long"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x013f
            long r1 = r8.getLong(r1)     // Catch:{ all -> 0x01ee }
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r6)     // Catch:{ all -> 0x01ee }
            X.C36341k9.A0w(r0, r7, r1)     // Catch:{ all -> 0x01ee }
            goto L_0x013f
        L_0x01d4:
            java.lang.String r0 = "boolean"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x013f
            int r0 = r8.getInt(r1)     // Catch:{ all -> 0x01ee }
            if (r0 == r1) goto L_0x01e3
            r1 = 0
        L_0x01e3:
            X.C36331k8.A18(r6, r7, r1)     // Catch:{ all -> 0x01ee }
            goto L_0x013f
        L_0x01e8:
            r8.close()
            r2 = 1
            goto L_0x0121
        L_0x01ee:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x01f3 }
            throw r1
        L_0x01f3:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x01f8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47092dM.A0I():void");
    }

    public void A0J(long j) {
        if (j > 0) {
            SystemClock.sleep(j);
        }
    }
}
