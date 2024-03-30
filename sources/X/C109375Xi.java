package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.5Xi  reason: invalid class name and case insensitive filesystem */
public abstract class C109375Xi {
    public static final C138616iP A00(SQLiteDatabase sQLiteDatabase, C114455hH r3) {
        AnonymousClass00C.A0D(r3, 0);
        C138616iP r1 = r3.A00;
        if (r1 != null && AnonymousClass00C.A0J(r1.A00, sQLiteDatabase)) {
            return r1;
        }
        C138616iP r12 = new C138616iP(sQLiteDatabase);
        r3.A00 = r12;
        return r12;
    }
}
