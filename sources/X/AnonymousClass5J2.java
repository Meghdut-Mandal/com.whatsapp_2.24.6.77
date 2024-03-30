package X;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: X.5J2  reason: invalid class name */
public final class AnonymousClass5J2 extends AnonymousClass2bM implements C22992Azi {
    public int A00;
    public long A01;

    public boolean A1O() {
        return true;
    }

    public int A1Y() {
        return 8;
    }

    public void A1c(Cursor cursor, C219712j r5, HashMap hashMap) {
        AnonymousClass00C.A0D(r5, 0);
        C36321k7.A0x(cursor, hashMap);
        super.A1c(cursor, r5, hashMap);
        int A002 = C224014d.A00("sender_timestamp", hashMap);
        int A003 = C224014d.A00("pin_in_chat_state", hashMap);
        this.A01 = cursor.getLong(A002);
        this.A00 = cursor.getInt(A003);
    }

    public boolean A1d() {
        return true;
    }

    public boolean A1e() {
        return false;
    }

    public String BE6() {
        return "inactive";
    }

    public AnonymousClass5J2(C64933Qa r2, long j) {
        super(r2, 79, j);
        this.A01 = 2;
    }
}
