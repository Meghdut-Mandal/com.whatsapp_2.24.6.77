package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.14m  reason: invalid class name */
public abstract class AnonymousClass14m {
    public static String A00(C224114e r3, String str, String str2) {
        Cursor A09 = r3.A09("SELECT value FROM props WHERE key = ?", "SELECT_PROPS_VALUE_BY_KEY", new String[]{str});
        try {
            if (A09.moveToNext()) {
                String string = A09.getString(A09.getColumnIndexOrThrow("value"));
                A09.close();
                return string;
            }
            A09.close();
            return str2;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static void A01(C224114e r3, String str) {
        r3.A0E("DELETE FROM props WHERE key = ?", "DELETE_PROPS", new String[]{str});
    }

    public static void A02(C224114e r3, String str, String str2, long j) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("key", str);
        contentValues.put("value", Long.valueOf(j));
        r3.A07("props", C63853Lr.A01(str2, "setProp", "REPLACE_PROPS_LONG"), contentValues);
    }

    public static void A03(C224114e r3, String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("key", str);
        contentValues.put("value", str2);
        r3.A07("props", C63853Lr.A01(str3, "setProp", "REPLACE_PROPS_STRING"), contentValues);
    }
}
