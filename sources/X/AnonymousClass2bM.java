package X;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: X.2bM  reason: invalid class name */
public abstract class AnonymousClass2bM extends AnonymousClass3T1 {
    public long A00;
    public long A01;
    public long A02;
    public C195759Vv A03;
    public C195759Vv A04;
    public int A05;

    public void A0o(int i) {
        C18740tg.A0D(false, "Cannot change storage type for add on messages");
    }

    public boolean A1d() {
        return false;
    }

    public int A1Y() {
        if (this instanceof C46742bb) {
            return 16;
        }
        if (this instanceof C46752bc) {
            return 4;
        }
        if (this instanceof C46732ba) {
            return -1;
        }
        return 32;
    }

    public C64933Qa A1Z() {
        C195759Vv r0 = this.A04;
        if (r0 == null) {
            return null;
        }
        return r0.A01;
    }

    public void A1b(long j) {
        if (this.A02 <= 0) {
            this.A02 = j;
            A00();
        }
    }

    public void A1c(Cursor cursor, C219712j r13, HashMap hashMap) {
        long j;
        int i;
        int A002 = C224014d.A00("_id", hashMap);
        int A003 = C224014d.A00("sender_jid_row_id", hashMap);
        int A004 = C224014d.A00("parent_message_row_id", hashMap);
        int A005 = C224014d.A00("status", hashMap);
        int A006 = C224014d.A00("server_timestamp", hashMap);
        int A007 = C224014d.A00("expiry_duration_in_secs", hashMap);
        long j2 = cursor.getLong(A002);
        long j3 = cursor.getLong(A003);
        long j4 = cursor.getLong(A004);
        int i2 = cursor.getInt(A005);
        if (cursor.isNull(A006)) {
            j = 0;
        } else {
            j = cursor.getLong(A006);
        }
        if (cursor.isNull(A007)) {
            i = 0;
        } else {
            i = cursor.getInt(A007);
        }
        this.A1N = j2;
        this.A1O = j2;
        A0q((AnonymousClass11F) r13.A0C(AnonymousClass11F.class, j3));
        this.A01 = j4;
        A0n(i2);
        A1b(j);
        A1a(i);
    }

    public boolean A1e() {
        if ((this instanceof C46742bb) || !(this instanceof C46752bc)) {
            return true;
        }
        return false;
    }

    private void A00() {
        if (A1d()) {
            int i = this.A05;
            if (i != 0) {
                long j = this.A02;
                if (j != 0) {
                    this.A00 = j + (((long) i) * 1000);
                    return;
                }
            }
            this.A00 = 0;
        }
    }

    public int A1X() {
        if (A1d()) {
            return this.A05;
        }
        return 0;
    }

    public void A1a(int i) {
        if (A1d()) {
            this.A05 = i;
            A00();
        }
    }

    public boolean A1f(C19970wo r7) {
        if (A1d()) {
            long j = this.A00;
            if (j <= 0 || j >= C19970wo.A00(r7)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass2bM(C64933Qa r1, int i, long j) {
        super(r1, i, j);
    }
}
