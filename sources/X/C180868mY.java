package X;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.8mY  reason: invalid class name and case insensitive filesystem */
public class C180868mY extends AnonymousClass2bM implements C22992Azi {
    public long A00;
    public String A01;
    public transient byte[] A02;

    public boolean A1O() {
        return true;
    }

    public int A1Y() {
        return 1;
    }

    public boolean A1e() {
        return true;
    }

    public String BE6() {
        return "inactive";
    }

    public C180868mY(C64933Qa r2, long j) {
        super(r2, 56, j);
    }

    public void A1c(Cursor cursor, C219712j r6, HashMap hashMap) {
        super.A1c(cursor, r6, hashMap);
        int A002 = C224014d.A00("reaction", hashMap);
        int A003 = C224014d.A00("sender_timestamp", hashMap);
        String string = cursor.getString(A002);
        long j = cursor.getLong(A003);
        this.A01 = string;
        boolean isEmpty = TextUtils.isEmpty(string);
        int i = 0;
        if (isEmpty) {
            i = 7;
        }
        this.A01 = i;
        this.A00 = j;
    }

    public C180868mY(C64933Qa r2, byte[] bArr, long j) {
        super(r2, 56, j);
        this.A02 = bArr;
    }

    public C180868mY(C64933Qa r3, C195759Vv r4, C195759Vv r5, String str, long j, long j2, long j3) {
        super(r3, 56, j);
        this.A04 = r4;
        this.A03 = r5;
        this.A01 = j2;
        this.A01 = str;
        this.A01 = TextUtils.isEmpty(str) ? 7 : 0;
        this.A00 = j3;
    }
}
