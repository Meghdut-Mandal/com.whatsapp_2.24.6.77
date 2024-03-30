package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.54b  reason: invalid class name and case insensitive filesystem */
public class C1031254b extends C229616q {
    public final AnonymousClass11g A00;
    public final AnonymousClass12S A01;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C1031254b(Context context, C19700wN r4, AnonymousClass11g r5, AnonymousClass12S r6) {
        super(context, r4, "migration_prefetcher.db", 1);
        this.A01 = r6;
        this.A00 = r5;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE prefetched_files(_id INTEGER PRIMARY KEY AUTOINCREMENT, remote_file_path TEXT UNIQUE NOT NULL, prefetched_file_path TEXT UNIQUE, file_size INTEGER, required INTEGER, prefetched INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS remote_file_path_index ON prefetched_files (remote_file_path)");
        sQLiteDatabase.execSQL("CREATE TABLE encrypted_files(_id INTEGER PRIMARY KEY AUTOINCREMENT, remote_file_path TEXT UNIQUE NOT NULL, enc_iv TEXT)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS remote_file_path_index ON encrypted_files (remote_file_path)");
        sQLiteDatabase.execSQL("CREATE TABLE properties(_id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT UNIQUE NOT NULL, value TEXT)");
    }

    public C224114e A07() {
        try {
            String databaseName = getDatabaseName();
            return C224014d.A01(super.A02(), this.A00, this.A01, databaseName);
        } catch (SQLiteException e) {
            Log.e("Failed to open writable file prefetcher db.", e);
            String databaseName2 = getDatabaseName();
            return C224014d.A01(super.A02(), this.A00, this.A01, databaseName2);
        }
    }
}
