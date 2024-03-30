package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1P8  reason: invalid class name */
public class AnonymousClass1P8 extends C229616q {
    public final AnonymousClass11g A00;
    public final AnonymousClass12S A01;

    public AnonymousClass1P8(C19700wN r4, C19630wG r5, AnonymousClass11g r6, AnonymousClass12S r7) {
        super(r5.A00, r4, "location.db", 2);
        this.A01 = r7;
        this.A00 = r6;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("LocationDbHelper/onCreate; version=2");
        Log.i("LocationSharerTable/createTable/version=2");
        C224614k.A01(sQLiteDatabase, "location_sharer");
        sQLiteDatabase.execSQL("CREATE TABLE location_sharer (_id INTEGER PRIMARY KEY AUTOINCREMENT, remote_jid TEXT NOT NULL, from_me BOOLEAN NOT NULL, remote_resource TEXT NOT NULL, expires INTEGER NOT NULL, message_id TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_sharer_index ON location_sharer(remote_jid, from_me, remote_resource, message_id)");
        Log.i("LocationKeyDistributionTable/createTable/version=2");
        C224614k.A01(sQLiteDatabase, "location_key_distribution");
        sQLiteDatabase.execSQL("CREATE TABLE location_key_distribution (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, sent_to_server BOOLEAN NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_key_distribution_index ON location_key_distribution(jid)");
        Log.i("LocationCacheTable/createTable/version=2");
        C224614k.A01(sQLiteDatabase, "location_cache");
        sQLiteDatabase.execSQL("CREATE TABLE location_cache (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, latitude REAL NOT NULL, longitude REAL NOT NULL, accuracy INTEGER NOT NULL, speed REAL NOT NULL, bearing INTEGER NOT NULL, location_ts INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS user_location_index ON location_cache(jid)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationDbHelper/onDowngrade; oldVersion=");
        sb.append(i);
        sb.append("; newVersion=");
        sb.append(i2);
        Log.w(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationDbHelper/onUpgrade; oldVersion=");
        sb.append(i);
        sb.append("; newVersion=");
        sb.append(i2);
        Log.i(sb.toString());
        if (i2 != 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("LocationDbHelper/Unknown upgrade destination version: ");
            sb2.append(i);
            sb2.append(" -> ");
            sb2.append(i2);
            throw new SQLiteException(sb2.toString());
        } else if (i != 1) {
            Log.i("LocationDbHelper/onUpgrade/unknown old version");
            onCreate(sQLiteDatabase);
        } else {
            sQLiteDatabase.execSQL("DROP INDEX IF EXISTS location_sharer_index");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_sharer_index ON location_sharer(remote_jid, from_me, remote_resource, message_id)");
        }
    }

    public C224114e A07() {
        try {
            return C224014d.A01(super.A02(), this.A00, this.A01, getDatabaseName());
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w("LocationDbHelper/getReadableDatabase/Locations database is corrupt. Removing...", e);
            A05();
            return C224014d.A01(super.A02(), this.A00, this.A01, getDatabaseName());
        } catch (SQLiteException e2) {
            e = e2;
            String obj = e.toString();
            if (obj.contains("file is encrypted")) {
                Log.w("LocationDbHelper/getReadableDatabase/Locations database is encrypted. Removing...", e);
                A05();
                return C224014d.A01(super.A02(), this.A00, this.A01, getDatabaseName());
            }
            if (obj.contains("upgrade read-only database")) {
                Log.w("LocationDbHelper/getReadableDatabase/Client actually opened database as read-only and can't upgrade. Switching to writable...", e);
                return C224014d.A01(super.A02(), this.A00, this.A01, getDatabaseName());
            }
            throw e;
        } catch (StackOverflowError e3) {
            e = e3;
            Log.w("LocationDbHelper/getReadableDatabase/StackOverflowError during db init check");
            for (StackTraceElement methodName : e.getStackTrace()) {
                if (methodName.getMethodName().equals("onCorruption")) {
                    Log.w("LocationDbHelper/getReadableDatabase/Locations database is corrupt. Found via StackOverflowError. Removing...");
                    A05();
                    return C224014d.A01(super.A02(), this.A00, this.A01, getDatabaseName());
                }
            }
            throw e;
        }
    }
}
