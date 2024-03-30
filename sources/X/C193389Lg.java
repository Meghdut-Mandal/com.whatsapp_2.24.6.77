package X;

import android.database.Cursor;

/* renamed from: X.9Lg  reason: invalid class name and case insensitive filesystem */
public class C193389Lg {
    public final long A00;
    public final long A01;
    public final C64933Qa A02;
    public final boolean A03;

    public C193389Lg(Cursor cursor, AnonymousClass11F r7) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("key_id"));
        boolean z = false;
        boolean A1S = AnonymousClass000.A1S(C36351kA.A03(cursor, "from_me"), 1);
        this.A02 = C165617ti.A0R(r7, string, A1S);
        cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        this.A00 = C36351kA.A07(cursor, "sort_id");
        this.A03 = C36351kA.A03(cursor, "starred") == 1 ? true : z;
        this.A01 = C21158AAs.A01(cursor, A1S);
    }
}
