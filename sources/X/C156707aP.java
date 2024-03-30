package X;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* renamed from: X.7aP  reason: invalid class name and case insensitive filesystem */
public final class C156707aP extends AnonymousClass00R implements C019508h {
    public final /* synthetic */ C158917iS $query;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156707aP(C158917iS r2) {
        super(4);
        this.$query = r2;
    }

    public /* bridge */ /* synthetic */ Object BKu(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        C158917iS r1 = this.$query;
        AnonymousClass00C.A0B(sQLiteQuery);
        r1.B1r(new C138676iV(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
