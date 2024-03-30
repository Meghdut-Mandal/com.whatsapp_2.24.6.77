package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.1XU  reason: invalid class name */
public final class AnonymousClass1XU extends C229616q {
    public final AnonymousClass11g A00;
    public final AnonymousClass12S A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1XU(Context context, C19700wN r4, AnonymousClass11g r5, AnonymousClass12S r6) {
        super(context, r4, "emojidictionary.db", 1);
        AnonymousClass00C.A0D(context, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r6, 3);
        AnonymousClass00C.A0D(r5, 4);
        this.A01 = r6;
        this.A00 = r5;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass00C.A0D(sQLiteDatabase, 0);
        sQLiteDatabase.execSQL("CREATE TABLE emoji_search_tag (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, type INTEGER NOT NULL, symbol TEXT NOT NULL, tag TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS emoji_search_pack_index ON emoji_search_tag (type, symbol, tag)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass00C.A0D(sQLiteDatabase, 0);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS emoji_search_tag");
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass00C.A0D(sQLiteDatabase, 0);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS emoji_search_tag");
        onCreate(sQLiteDatabase);
    }

    public C224114e A07() {
        String databaseName = getDatabaseName();
        return C224014d.A01(super.A02(), this.A00, this.A01, databaseName);
    }
}
