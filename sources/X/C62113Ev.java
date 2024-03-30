package X;

import android.database.Cursor;

/* renamed from: X.3Ev  reason: invalid class name and case insensitive filesystem */
public class C62113Ev {
    public final C19730wQ A00;
    public final AnonymousClass1DT A01;
    public final C61023Ag A02;
    public final AnonymousClass1EV A03;
    public final C30791am A04;
    public final C33061ee A05;
    public final AnonymousClass1A1 A06;

    public boolean A00(C600336f r7, AnonymousClass11F r8, AnonymousClass3T1 r9) {
        Cursor cursor;
        if (r7 == null || (cursor = r7.A00) == null || cursor.isClosed() || !cursor.moveToFirst()) {
            return true;
        }
        AnonymousClass3T1 A012 = this.A06.A01(cursor, r8);
        return A012 == null || A012.A1O < r9.A1O;
    }

    public C62113Ev(C19730wQ r1, AnonymousClass1DT r2, C30791am r3, C61023Ag r4, C33061ee r5, AnonymousClass1EV r6, AnonymousClass1A1 r7) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r4;
        this.A06 = r7;
        this.A04 = r3;
        this.A03 = r6;
        this.A05 = r5;
    }
}
