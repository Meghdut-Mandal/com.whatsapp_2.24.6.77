package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.54a  reason: invalid class name and case insensitive filesystem */
public class C1031154a extends C229616q {
    public final AnonymousClass11g A00;
    public final AnonymousClass12S A01;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C1031154a(Context context, C19700wN r4, AnonymousClass11g r5, AnonymousClass12S r6) {
        super(context, r4, "migration_export_metadata.db", 1);
        this.A01 = r6;
        this.A00 = r5;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE exported_files_metadata(_id INTEGER PRIMARY KEY AUTOINCREMENT, local_path TEXT NOT NULL, exported_path TEXT UNIQUE NOT NULL, file_size INTEGER, required INTEGER, encryption_iv TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS exported_files_metadata_local_path_index ON exported_files_metadata (local_path)");
    }

    public C224114e A07() {
        try {
            String databaseName = getDatabaseName();
            return C224014d.A01(super.A02(), this.A00, this.A01, databaseName);
        } catch (SQLiteException e) {
            Log.e("Failed to open writable export metadata db.", e);
            String databaseName2 = getDatabaseName();
            return C224014d.A01(super.A02(), this.A00, this.A01, databaseName2);
        }
    }
}
