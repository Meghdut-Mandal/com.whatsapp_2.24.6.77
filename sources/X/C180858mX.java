package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8mX  reason: invalid class name and case insensitive filesystem */
public class C180858mX extends AnonymousClass2bM {
    public long A00;
    public List A01;
    public byte[] A02;
    @Deprecated
    public byte[] A03;
    @Deprecated
    public byte[] A04;
    @Deprecated
    public byte[] A05;
    public final List A06;

    public boolean A1O() {
        return true;
    }

    public int A1Y() {
        return 2;
    }

    public boolean A1e() {
        return true;
    }

    public C180858mX(C64933Qa r2, long j) {
        super(r2, 67, j);
        this.A06 = AnonymousClass001.A0I();
    }

    public void A1c(Cursor cursor, C219712j r4, HashMap hashMap) {
        super.A1c(cursor, r4, hashMap);
        this.A00 = cursor.getLong(C224014d.A00("sender_timestamp", hashMap));
    }

    public C180858mX(C64933Qa r3, C195759Vv r4, List list, long j, long j2, long j3) {
        super(r3, 67, j);
        this.A04 = r4;
        this.A03 = null;
        this.A01 = j2;
        ArrayList A0I = AnonymousClass001.A0I();
        this.A06 = A0I;
        A0I.addAll(list);
        this.A00 = j3;
    }

    public C180858mX(long j, C64933Qa r5, C195759Vv r6, List list, long j2, long j3) {
        super(r5, 67, j);
        this.A04 = r6;
        this.A03 = null;
        this.A01 = j2;
        this.A06 = AnonymousClass001.A0I();
        this.A01 = list;
        this.A00 = j3;
    }
}
