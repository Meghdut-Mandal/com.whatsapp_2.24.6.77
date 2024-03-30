package X;

import android.database.Cursor;

/* renamed from: X.1DN  reason: invalid class name */
public class AnonymousClass1DN extends C229416o {
    public static C119505pv A04(Cursor cursor) {
        Long valueOf;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("real_issue_timestamp");
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("sent_tc_token_timestamp"));
        if (cursor.isNull(columnIndexOrThrow)) {
            valueOf = Long.valueOf(j);
        } else {
            long j2 = cursor.getLong(columnIndexOrThrow);
            if (j2 == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(j2);
            }
        }
        return new C119505pv(valueOf, j);
    }

    public AnonymousClass1DN(C229716r r1) {
        super(r1);
    }
}
