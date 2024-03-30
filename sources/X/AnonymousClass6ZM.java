package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: X.6ZM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6ZM implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ C019508h A00;

    public /* synthetic */ AnonymousClass6ZM(C019508h r1) {
        this.A00 = r1;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        C019508h r1 = this.A00;
        AnonymousClass00C.A0D(r1, 0);
        return (Cursor) r1.BKu(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
