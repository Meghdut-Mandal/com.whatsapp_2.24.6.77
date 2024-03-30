package X;

import android.content.SharedPreferences;

/* renamed from: X.1b2  reason: invalid class name and case insensitive filesystem */
public final class C30951b2 {
    public final C19970wo A00;
    public final C20810yC A01;
    public final C30931b0 A02;

    public C30951b2(C19970wo r2, C20810yC r3, C30931b0 r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final boolean A01(C51332ne r9) {
        C20810yC r4 = this.A01;
        C21000yV r3 = C21000yV.A02;
        if (C20800yB.A01(r3, r4, 5869)) {
            AnonymousClass00T r6 = this.A02.A01;
            String string = ((SharedPreferences) r6.getValue()).getString("pref_disclosure_source", (String) null);
            if (string != null && !AnonymousClass00C.A0J(r9.toString(), string)) {
                int A002 = C20800yB.A00(r3, r4, 5591) * 1000;
                C19970wo r42 = this.A00;
                if (C19970wo.A00(r42) - ((SharedPreferences) r6.getValue()).getLong("pref_disclosure_timestamp", C19970wo.A00(r42)) < ((long) A002)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A00(C51332ne r6) {
        if (C20800yB.A01(C21000yV.A02, this.A01, 5869)) {
            C30931b0 r1 = this.A02;
            long A002 = C19970wo.A00(this.A00);
            SharedPreferences.Editor edit = ((SharedPreferences) r1.A01.getValue()).edit();
            edit.putString("pref_disclosure_source", r6.toString());
            edit.putLong("pref_disclosure_timestamp", A002);
            edit.apply();
        }
    }
}
