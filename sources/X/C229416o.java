package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Locale;

/* renamed from: X.16o  reason: invalid class name and case insensitive filesystem */
public abstract class C229416o {
    public final C229716r A00;

    public static long A00(ContentValues contentValues, C26911Lz r3, String str) {
        return ((AnonymousClass1M0) r3).A02.A05(str, A04("ContactProvider/insertOrReplace/INSERT_", str), contentValues);
    }

    public static long A01(ContentValues contentValues, C26911Lz r5, String str, String str2, String[] strArr) {
        return (long) ((AnonymousClass1M0) r5).A02.A01(contentValues, str, str2, A04("ContactProvider/delete/UPDATE_", str), strArr);
    }

    public static long A02(C26911Lz r1, String str, String str2, String[] strArr) {
        return (long) ((AnonymousClass1M0) r1).A02.A03(str, str2, A04("ContactProvider/delete/DELETE_", str), strArr);
    }

    public static Cursor A03(C26901Ly r2, String str, String str2, String[] strArr) {
        C224114e r22 = ((AnonymousClass1M0) r2).A02;
        StringBuilder sb = new StringBuilder();
        sb.append("ContactProvider/query/QUERY_");
        sb.append(str2);
        return r22.A09(str, sb.toString(), strArr);
    }

    public static String A04(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2.toUpperCase(Locale.ROOT));
        return sb.toString();
    }

    public static void A05(ContentValues contentValues, C26911Lz r3, String str) {
        ((AnonymousClass1M0) r3).A02.A07(str, A04("ContactProvider/insertOrReplace/REPLACE_", str), contentValues);
    }

    public C229416o(C229716r r3) {
        this.A00 = r3;
        r3.A05.registerObserver(new C230216w(this));
    }
}
