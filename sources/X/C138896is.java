package X;

import android.database.Cursor;
import java.util.TreeMap;

/* renamed from: X.6is  reason: invalid class name and case insensitive filesystem */
public final class C138896is implements C158957iW {
    public final C97124oV A00;
    public final AnonymousClass6Q8 A01;

    public Long BDh(String str) {
        TreeMap treeMap = C138686iW.A08;
        C138686iW A002 = C109355Xg.A00("SELECT long_value FROM Preference where `key`=?", 1);
        A002.B1q(1, str);
        AnonymousClass6Q8 r0 = this.A01;
        r0.A05();
        Long l = null;
        Cursor A003 = C109365Xh.A00(r0, A002, false);
        try {
            if (A003.moveToFirst() && !A003.isNull(0)) {
                l = C36361kB.A0k(A003, 0);
            }
            return l;
        } finally {
            A003.close();
            A002.A00();
        }
    }

    public void BKj(AnonymousClass69K r3) {
        AnonymousClass6Q8 r1 = this.A01;
        r1.A05();
        r1.A06();
        try {
            this.A00.A04(r3);
            r1.A07();
        } finally {
            AnonymousClass6Q8.A01(r1);
        }
    }

    public C138896is(AnonymousClass6Q8 r3) {
        this.A01 = r3;
        this.A00 = new C162537ok(r3, this, 1);
    }
}
