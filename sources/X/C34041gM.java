package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.1gM  reason: invalid class name and case insensitive filesystem */
public class C34041gM extends C229616q {
    public final C19630wG A00;
    public final C19660wJ A01 = new C19660wJ(new C18910u1(Collections.emptySet(), (AnonymousClass004) null));
    public final String A02;
    public final AnonymousClass11g A03;
    public final AnonymousClass12S A04;

    public synchronized C224114e A07() {
        C224114e r0;
        try {
            String databaseName = getDatabaseName();
            r0 = C224014d.A01(A02(), this.A03, this.A04, databaseName);
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w("chat-settings-store/corrupt/removing", e);
            A05();
            String databaseName2 = getDatabaseName();
            r0 = C224014d.A01(super.A02(), this.A03, this.A04, databaseName2);
        } catch (SQLiteException e2) {
            e = e2;
            if (e.toString().contains("file is encrypted")) {
                Log.w("chat-settings-store/encrypted/removing", e);
                A05();
                String databaseName3 = getDatabaseName();
                r0 = C224014d.A01(super.A02(), this.A03, this.A04, databaseName3);
            }
            throw e;
        } catch (StackOverflowError e3) {
            e = e3;
            Log.w("chat-settings-store/stackoverflowerror", e);
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                if (stackTrace[i].getMethodName().equals("onCorruption")) {
                    Log.w("chat-settings-store/stackoverflowerror/corrupt/removing");
                    A05();
                    String databaseName4 = getDatabaseName();
                    r0 = C224014d.A01(super.A02(), this.A03, this.A04, databaseName4);
                } else {
                    i++;
                }
            }
            throw e;
        }
        return r0;
    }

    public C34041gM(C19700wN r4, C19630wG r5, AnonymousClass11g r6, AnonymousClass12S r7, String str) {
        super(r5.A00, r4, str, 1);
        this.A02 = str;
        this.A00 = r5;
        this.A04 = r7;
        this.A03 = r6;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("chat-settings-store/create");
        C224614k.A01(sQLiteDatabase, "settings");
        sQLiteDatabase.execSQL("CREATE TABLE settings (_id INTEGER PRIMARY KEY AUTOINCREMENT,jid TEXT,deleted INTEGER,mute_end INTEGER,muted_notifications BOOLEAN,use_custom_notifications BOOLEAN,message_tone TEXT,message_vibrate INTEGER,message_popup INTEGER,message_light INTEGER,call_tone TEXT,call_vibrate INTEGER,status_muted INTEGER,pinned BOOLEAN,pinned_time INTEGER,low_pri_notifications BOOLEAN,media_visibility INTEGER,mute_reactions INTEGER,wallpaper_light_type TEXT,wallpaper_light_value TEXT,wallpaper_dark_type TEXT,wallpaper_dark_value TEXT,wallpaper_dark_opacity INTEGER,notifications_auto_muted INTEGER NOT NULL DEFAULT 0,push_recording_button_mode INTEGER,call_mute_end_time INTEGER);");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS jid_index ON settings(jid);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("chat-settings-store/downgrade from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("chat-settings-store/upgrade from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void A05() {
        super.A05();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((C24481Cp) it.next()).A09();
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        String databaseName = getDatabaseName();
        C224114e A012 = C224014d.A01(sQLiteDatabase, this.A03, this.A04, databaseName);
        String A002 = C224614k.A00(A012, "table", "settings");
        if (!TextUtils.isEmpty(A002)) {
            C224614k.A04(A012, A002, "settings", "status_muted", "INTEGER", "ChatSettingsDatabaseHelper");
            C224114e r8 = A012;
            String str = A002;
            String str2 = "settings";
            String str3 = "ChatSettingsDatabaseHelper";
            C224614k.A04(r8, str, str2, "pinned", "BOOLEAN", str3);
            C224614k.A04(A012, A002, "settings", "pinned_time", "INTEGER", "ChatSettingsDatabaseHelper");
            C224614k.A04(r8, str, str2, "low_pri_notifications", "BOOLEAN", str3);
            C224614k.A04(A012, A002, "settings", "media_visibility", "INTEGER", "ChatSettingsDatabaseHelper");
            C224614k.A04(A012, A002, "settings", "mute_reactions", "INTEGER", "ChatSettingsDatabaseHelper");
            C224614k.A04(r8, str, str2, "notifications_auto_muted", "INTEGER NOT NULL DEFAULT 0", str3);
            C224614k.A04(A012, A002, "settings", "push_recording_button_mode", "INTEGER", "ChatSettingsDatabaseHelper");
            C224614k.A04(A012, A002, "settings", "call_mute_end_time", "INTEGER", "ChatSettingsDatabaseHelper");
            C224614k.A04(r8, str, str2, "wallpaper_light_type", "TEXT", str3);
            C224614k.A04(r8, str, str2, "wallpaper_light_value", "TEXT", str3);
            C224614k.A04(r8, str, str2, "wallpaper_dark_type", "TEXT", str3);
            C224614k.A04(r8, str, str2, "wallpaper_dark_value", "TEXT", str3);
            C224614k.A04(A012, A002, "settings", "wallpaper_dark_opacity", "INTEGER", "ChatSettingsDatabaseHelper");
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((C24481Cp) it.next()).A0F(A012);
        }
    }
}
