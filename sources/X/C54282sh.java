package X;

import android.database.Cursor;

/* renamed from: X.2sh  reason: invalid class name and case insensitive filesystem */
public abstract class C54282sh {
    public static final boolean A00(Cursor cursor, int i) {
        return i != -1 && !cursor.isNull(i) && cursor.getInt(i) == 1;
    }
}
