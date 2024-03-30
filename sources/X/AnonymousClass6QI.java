package X;

import android.database.sqlite.SQLiteStatement;

/* renamed from: X.6QI  reason: invalid class name */
public class AnonymousClass6QI {
    public final SQLiteStatement A00;
    public final AnonymousClass11g A01;
    public final AnonymousClass12S A02;
    public final String A03;
    public final String A04;

    public static void A00(AnonymousClass6QI r4) {
        r4.A01.A02(r4.A03, 7, r4.A04);
    }

    public int A01() {
        int executeUpdateDelete = this.A00.executeUpdateDelete();
        A00(this);
        return executeUpdateDelete;
    }

    public long A02() {
        long executeInsert = this.A00.executeInsert();
        A00(this);
        return executeInsert;
    }

    public void A03() {
        this.A00.clearBindings();
    }

    public void A04(int i) {
        this.A00.bindNull(i);
    }

    public void A05(int i, long j) {
        this.A00.bindLong(i, j);
    }

    public void A06(int i, String str) {
        this.A00.bindString(i, str);
    }

    public void A07(int i, byte[] bArr) {
        this.A00.bindBlob(i, bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AnonymousClass6QI) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6QI(SQLiteStatement sQLiteStatement, AnonymousClass11g r2, AnonymousClass12S r3, String str, String str2) {
        this.A00 = sQLiteStatement;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = r3;
        this.A01 = r2;
    }
}
