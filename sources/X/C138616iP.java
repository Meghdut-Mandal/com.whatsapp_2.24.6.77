package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* renamed from: X.6iP  reason: invalid class name and case insensitive filesystem */
public final class C138616iP implements C162177o9 {
    public static final String[] A02 = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] A03 = new String[0];
    public final SQLiteDatabase A00;
    public final List A01;

    public static Cursor A00(C138616iP r1, String str) {
        AnonymousClass00C.A0D(str, 0);
        return r1.Bmd(new C138696iX(str));
    }

    public void B6z(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00.execSQL(str);
    }

    public Cursor Bmd(C158917iS r6) {
        Cursor rawQueryWithFactory = this.A00.rawQueryWithFactory(new AnonymousClass6ZM(new C156707aP(r6)), r6.BHo(), A03, (String) null);
        AnonymousClass00C.A08(rawQueryWithFactory);
        return rawQueryWithFactory;
    }

    public void close() {
        this.A00.close();
    }

    public C138616iP(SQLiteDatabase sQLiteDatabase) {
        this.A00 = sQLiteDatabase;
        this.A01 = sQLiteDatabase.getAttachedDbs();
    }
}
