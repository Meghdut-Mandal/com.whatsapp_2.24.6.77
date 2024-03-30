package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1Wf  reason: invalid class name and case insensitive filesystem */
public class C29331Wf extends C229616q {
    public final Context A00;
    public final AnonymousClass11g A01;
    public final AnonymousClass12S A02;

    public C29331Wf(Context context, C19700wN r4, AnonymousClass11g r5, AnonymousClass12S r6) {
        super(context, r4, "hsmpacks.db", 2);
        this.A00 = context;
        this.A02 = r6;
        this.A01 = r5;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C224614k.A01(sQLiteDatabase, "packs");
        sQLiteDatabase.execSQL("CREATE TABLE packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, lg TEXT NOT NULL, lc TEXT NOT NULL, hash TEXT NOT NULL, namespace TEXT NOT NULL, timestamp INTEGER NOT NULL, data BLOB NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS pack_index ON packs (lg, lc, namespace)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("language-pack-store/downgrade from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("language-pack-store/upgrade from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.i(sb.toString());
        if (i != 1) {
            Log.e("language-pack-store/upgrade unknown old version");
        }
        onCreate(sQLiteDatabase);
    }

    public C224114e A07() {
        try {
            String databaseName = getDatabaseName();
            return C224014d.A01(super.A02(), this.A01, this.A02, databaseName);
        } catch (SQLiteException e) {
            Log.e("failed to open pack store", e);
            A05();
            String databaseName2 = getDatabaseName();
            return C224014d.A01(super.A02(), this.A01, this.A02, databaseName2);
        }
    }
}
