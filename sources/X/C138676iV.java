package X;

import android.database.sqlite.SQLiteProgram;

/* renamed from: X.6iV  reason: invalid class name and case insensitive filesystem */
public class C138676iV implements C162187oA {
    public final SQLiteProgram A00;

    public C138676iV(SQLiteProgram sQLiteProgram) {
        AnonymousClass00C.A0D(sQLiteProgram, 1);
        this.A00 = sQLiteProgram;
    }

    public void B1m(int i, byte[] bArr) {
        AnonymousClass00C.A0D(bArr, 1);
        this.A00.bindBlob(i, bArr);
    }

    public void B1q(int i, String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A00.bindString(i, str);
    }

    public void B1o(int i, long j) {
        this.A00.bindLong(i, j);
    }

    public void B1p(int i) {
        this.A00.bindNull(i);
    }

    public void close() {
        this.A00.close();
    }
}
