package X;

import android.content.ContentValues;

/* renamed from: X.12k  reason: invalid class name and case insensitive filesystem */
public class C219812k {
    public final AnonymousClass12P A00;

    public static void A00(C26911Lz r5, long j, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("lid_row_id", Long.valueOf(j));
        contentValues.put("jid_row_id", Long.valueOf(j2));
        ((AnonymousClass1M0) r5).A02.A08("jid_map", "JidMapStore/INSERT_MAPPING", contentValues, 5);
    }

    public C219812k(AnonymousClass12P r1) {
        this.A00 = r1;
    }
}
