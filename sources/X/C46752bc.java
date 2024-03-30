package X;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: X.2bc  reason: invalid class name and case insensitive filesystem */
public class C46752bc extends AnonymousClass2bM {
    public int A00;
    public int A01;
    public long A02;

    public C46752bc(C64933Qa r3, C195759Vv r4, int i, long j, long j2, long j3) {
        super(r3, 68, j);
        this.A04 = r4;
        this.A03 = null;
        this.A01 = j2;
        this.A01 = i;
        this.A02 = j3;
    }

    public void A1c(Cursor cursor, C219712j r6, HashMap hashMap) {
        super.A1c(cursor, r6, hashMap);
        int A002 = C224014d.A00("sender_timestamp", hashMap);
        int A003 = C224014d.A00("keep_in_chat_state", hashMap);
        int A004 = C224014d.A00("keep_count", hashMap);
        long j = cursor.getLong(A002);
        int i = cursor.getInt(A003);
        int i2 = cursor.getInt(A004);
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
    }

    public C46752bc(C64933Qa r2, long j) {
        super(r2, 68, j);
    }
}
