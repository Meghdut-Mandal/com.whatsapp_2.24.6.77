package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;

/* renamed from: X.17o  reason: invalid class name and case insensitive filesystem */
public class C232017o extends C229616q {
    public final AnonymousClass11g A00;
    public final AnonymousClass12S A01;

    public C232017o(Context context, C19700wN r4, AnonymousClass11g r5, AnonymousClass12S r6) {
        super(context, r4, "companion_devices.db", 13);
        this.A01 = r6;
        this.A00 = r5;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C224614k.A01(sQLiteDatabase, "devices");
        sQLiteDatabase.execSQL("CREATE TABLE devices (_id INTEGER PRIMARY KEY AUTOINCREMENT,device_id TEXT,device_os TEXT,platform_type INTEGER,last_active INTEGER,login_time INTEGER,logout_time INTEGER NOT NULL DEFAULT 0,adv_key_index INTEGER NOT NULL DEFAULT 0,full_sync_required INTEGER NOT NULL DEFAULT 0,place_name TEXT,nickname TEXT,support_bot_user_agent_chat_history INTEGER NOT NULL DEFAULT 0,support_cag_reactions_and_polls_history INTEGER NOT NULL DEFAULT 0,support_recent_sync_chunk_message_tuning INTEGER NOT NULL DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS companion_device_jid_index ON devices(device_id);");
        C224614k.A01(sQLiteDatabase, "devices_history");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("CompanionDeviceDbHelper/downgrade from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        r4.execSQL("DROP TABLE IF EXISTS devices_history");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        r4.execSQL("ALTER TABLE devices ADD nickname TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        X.C132766Ve.A02(r4, "devices", "support_bot_user_agent_chat_history", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0059, code lost:
        X.C132766Ve.A02(r4, "devices", "support_cag_reactions_and_polls_history", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        X.C132766Ve.A02(r4, "devices", "support_recent_sync_chunk_message_tuning", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        r4.execSQL("ALTER TABLE devices ADD login_time INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        r4.execSQL("ALTER TABLE devices ADD adv_key_index INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r4.execSQL("ALTER TABLE devices ADD full_sync_required INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        r4.execSQL("ALTER TABLE devices ADD place_name TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        r4.execSQL("ALTER TABLE devices ADD logout_time INTEGER NOT NULL DEFAULT 0");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CompanionDeviceDbHelper/upgrade from "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            switch(r5) {
                case 1: goto L_0x0028;
                case 2: goto L_0x002d;
                case 3: goto L_0x0032;
                case 4: goto L_0x0037;
                case 5: goto L_0x003c;
                case 6: goto L_0x0041;
                case 7: goto L_0x0046;
                case 8: goto L_0x0046;
                case 9: goto L_0x004b;
                case 10: goto L_0x0050;
                case 11: goto L_0x0059;
                case 12: goto L_0x0062;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.String r0 = "CompanionDeviceDbHelper/upgrade unknown old version"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3.onCreate(r4)
            return
        L_0x0028:
            java.lang.String r0 = "ALTER TABLE devices ADD platform_type INTEGER"
            r4.execSQL(r0)
        L_0x002d:
            java.lang.String r0 = "ALTER TABLE devices ADD login_time INTEGER"
            r4.execSQL(r0)
        L_0x0032:
            java.lang.String r0 = "ALTER TABLE devices ADD adv_key_index INTEGER NOT NULL DEFAULT 0"
            r4.execSQL(r0)
        L_0x0037:
            java.lang.String r0 = "ALTER TABLE devices ADD full_sync_required INTEGER NOT NULL DEFAULT 0"
            r4.execSQL(r0)
        L_0x003c:
            java.lang.String r0 = "ALTER TABLE devices ADD place_name TEXT"
            r4.execSQL(r0)
        L_0x0041:
            java.lang.String r0 = "ALTER TABLE devices ADD logout_time INTEGER NOT NULL DEFAULT 0"
            r4.execSQL(r0)
        L_0x0046:
            java.lang.String r0 = "DROP TABLE IF EXISTS devices_history"
            r4.execSQL(r0)
        L_0x004b:
            java.lang.String r0 = "ALTER TABLE devices ADD nickname TEXT"
            r4.execSQL(r0)
        L_0x0050:
            java.lang.String r2 = "devices"
            java.lang.String r1 = "support_bot_user_agent_chat_history"
            java.lang.String r0 = "INTEGER NOT NULL DEFAULT 0"
            X.C132766Ve.A02(r4, r2, r1, r0)
        L_0x0059:
            java.lang.String r2 = "devices"
            java.lang.String r1 = "support_cag_reactions_and_polls_history"
            java.lang.String r0 = "INTEGER NOT NULL DEFAULT 0"
            X.C132766Ve.A02(r4, r2, r1, r0)
        L_0x0062:
            java.lang.String r2 = "devices"
            java.lang.String r1 = "support_recent_sync_chunk_message_tuning"
            java.lang.String r0 = "INTEGER NOT NULL DEFAULT 0"
            X.C132766Ve.A02(r4, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232017o.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public C224114e A07() {
        String databaseName = getDatabaseName();
        return C224014d.A01(super.A02(), this.A00, this.A01, databaseName);
    }
}
