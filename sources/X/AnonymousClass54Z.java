package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.54Z  reason: invalid class name */
public final class AnonymousClass54Z extends C229616q {
    public final AnonymousClass11g A00;
    public final AnonymousClass12S A01;

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass00C.A0D(sQLiteDatabase, 0);
        sQLiteDatabase.execSQL("CREATE TABLE notifications (account_lid TEXT NOT NULL, notification_type TEXT NOT NULL, sender_jid TEXT NOT NULL, group_jid TEXT DEFAULT '' NOT NULL, call_id TEXT DEFAULT '' NOT NULL, call_status INTEGER DEFAULT 0 NOT NULL, timestamp INTEGER NOT NULL, display_name TEXT DEFAULT '' NOT NULL, count INTEGER DEFAULT 1 NOT NULL, sender_pn_jid TEXT DEFAULT '' NOT NULL, PRIMARY KEY(account_lid, sender_jid, notification_type, call_id, call_status, group_jid))");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass54Z(C19700wN r4, C19630wG r5, AnonymousClass11g r6, AnonymousClass12S r7) {
        super(r5.A00, r4, "account_switcher.db", 4);
        C36321k7.A11(r5, r4, r7);
        AnonymousClass00C.A0D(r6, 4);
        this.A01 = r7;
        this.A00 = r6;
    }

    public C224114e A07() {
        String databaseName = getDatabaseName();
        return C224014d.A01(super.A02(), this.A00, this.A01, databaseName);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r3, int r4, int r5) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AccountSwitcherDbHelper/upgrading db from "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " to "
            X.C36321k7.A1T(r0, r1, r5)
            r1 = 4
            if (r5 != r1) goto L_0x004c
            r0 = 2
            if (r4 >= r0) goto L_0x0046
            java.lang.String r0 = "AccountSwitcherDbHelper/processing db upgrade from 1 to 2"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == 0) goto L_0x0028
            java.lang.String r0 = "DROP TABLE IF EXISTS notifications"
            r3.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE notifications (account_lid TEXT NOT NULL, notification_type TEXT NOT NULL, sender_jid TEXT NOT NULL, group_jid TEXT DEFAULT '' NOT NULL, call_id TEXT DEFAULT '' NOT NULL, call_status INTEGER DEFAULT 0 NOT NULL, timestamp INTEGER NOT NULL, display_name TEXT DEFAULT '' NOT NULL, count INTEGER DEFAULT 1 NOT NULL, sender_pn_jid TEXT DEFAULT '' NOT NULL, PRIMARY KEY(account_lid, sender_jid, notification_type, call_id, call_status, group_jid))"
            r3.execSQL(r0)
        L_0x0028:
            java.lang.String r0 = "AccountSwitcherDbHelper/processing db upgrade from 2 to 3"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == 0) goto L_0x0034
            java.lang.String r0 = "ALTER TABLE notifications ADD COLUMN display_name TEXT DEFAULT '' NOT NULL"
            r3.execSQL(r0)
        L_0x0034:
            java.lang.String r0 = "AccountSwitcherDbHelper/processing db upgrade from 3 to 4"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == 0) goto L_0x0045
            java.lang.String r0 = "ALTER TABLE notifications ADD COLUMN count INTEGER DEFAULT 1 NOT NULL"
            r3.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE notifications ADD COLUMN sender_pn_jid TEXT DEFAULT '' NOT NULL"
            r3.execSQL(r0)
        L_0x0045:
            return
        L_0x0046:
            r0 = 3
            if (r4 < r0) goto L_0x0028
            if (r4 >= r1) goto L_0x0045
            goto L_0x0034
        L_0x004c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown upgrade destination version: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " -> "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r5)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54Z.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
