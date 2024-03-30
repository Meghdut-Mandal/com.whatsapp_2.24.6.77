package X;

import android.database.Cursor;
import java.util.List;

/* renamed from: X.5B1  reason: invalid class name */
public class AnonymousClass5B1 extends AnonymousClass6R4 {
    public final AnonymousClass1A6 A00;
    public final C220712t A01;
    public final C220412q A02;
    public final AnonymousClass3G0 A03;
    public final C46402Wt A04;
    public final AnonymousClass1CR A05;
    public final C19970wo A06;
    public final C20310xM A07;
    public final AnonymousClass1A1 A08;

    public static void A00(AnonymousClass5B1 r15, AnonymousClass11F r16, List list, long j) {
        AnonymousClass11F r9 = r16;
        long A072 = r15.A02.A07(r9);
        C20310xM r8 = r15.A07;
        C19970wo r3 = r15.A06;
        C600336f A0S = r8.A0S(r9, 100, A072, C19970wo.A00(r3));
        try {
            Cursor cursor = A0S.A00;
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    do {
                        AnonymousClass3T1 A012 = r15.A08.A01(cursor, r9);
                        if (A012 != null && A012.A1N != A072 && !A012.A1J.A02 && A012.A0G >= C19970wo.A00(r3) - j) {
                            list.add(A012);
                        }
                    } while (cursor.moveToNext());
                }
                cursor.close();
            }
        } catch (Throwable th) {
            Cursor cursor2 = A0S.A00;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public AnonymousClass5B1(AnonymousClass1A6 r1, C19970wo r2, C220712t r3, C220412q r4, C20310xM r5, AnonymousClass3G0 r6, C46402Wt r7, AnonymousClass1CR r8, AnonymousClass1A1 r9) {
        this.A06 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A07 = r5;
        this.A08 = r9;
        this.A05 = r8;
        this.A00 = r1;
        this.A04 = r7;
        this.A03 = r6;
    }
}
