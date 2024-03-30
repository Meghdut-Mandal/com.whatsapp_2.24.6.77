package X;

import android.content.ContentValues;

/* renamed from: X.3SW  reason: invalid class name */
public abstract class AnonymousClass3SW {
    public static void A00(ContentValues contentValues, Long l, String str) {
        if (l == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, l);
        }
    }

    public static void A01(ContentValues contentValues, String str, String str2) {
        if (str2 == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, str2);
        }
    }

    public static void A02(ContentValues contentValues, String str, boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        C36341k9.A0p(contentValues, str, j);
    }

    public static void A03(ContentValues contentValues, String str, byte[] bArr) {
        if (bArr == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, bArr);
        }
    }
}
