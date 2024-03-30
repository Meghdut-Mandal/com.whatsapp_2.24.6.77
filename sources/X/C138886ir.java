package X;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: X.6ir  reason: invalid class name and case insensitive filesystem */
public final class C138886ir implements AnonymousClass7e9 {
    public final C97124oV A00;
    public final AnonymousClass6Q8 A01;

    public ArrayList BAz(String str) {
        String str2;
        C138686iW A012 = C109355Xg.A01("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", str);
        AnonymousClass6Q8 r0 = this.A01;
        r0.A05();
        Cursor A002 = C109365Xh.A00(r0, A012, false);
        try {
            ArrayList A0n = C90474aD.A0n(A002);
            while (A002.moveToNext()) {
                if (A002.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = A002.getString(0);
                }
                A0n.add(str2);
            }
            return A0n;
        } finally {
            A002.close();
            A012.A00();
        }
    }

    public C138886ir(AnonymousClass6Q8 r3) {
        this.A01 = r3;
        this.A00 = new C162537ok(r3, this, 0);
    }
}
