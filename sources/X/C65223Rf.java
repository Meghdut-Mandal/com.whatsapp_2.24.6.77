package X;

import android.database.Cursor;

/* renamed from: X.3Rf  reason: invalid class name and case insensitive filesystem */
public class C65223Rf {
    public int A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public C65223Rf(int i, String str, long j) {
        this.A04 = str;
        this.A03 = 0;
        this.A02 = i;
        this.A01 = j;
    }

    public static C65223Rf A00(Cursor cursor) {
        return new C65223Rf(cursor.getString(cursor.getColumnIndexOrThrow("file_key")), cursor.getInt(cursor.getColumnIndexOrThrow("rmr_source")), cursor.getInt(cursor.getColumnIndexOrThrow("failure_count")), cursor.getInt(cursor.getColumnIndexOrThrow("response_device_id")), cursor.getLong(cursor.getColumnIndexOrThrow("last_fetch_timestamp")));
    }

    public C65223Rf(String str, int i, int i2, int i3, long j) {
        this.A04 = str;
        this.A03 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = j;
    }
}
