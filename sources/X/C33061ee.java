package X;

import android.content.SharedPreferences;

/* renamed from: X.1ee  reason: invalid class name and case insensitive filesystem */
public class C33061ee {
    public final C19420v0 A00;
    public final C19970wo A01;
    public final C20810yC A02;

    public void A00(int i) {
        C19420v0 r3 = this.A00;
        long A002 = C19970wo.A00(this.A01);
        SharedPreferences.Editor edit = ((SharedPreferences) r3.A00.get()).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("smb_merchant_payment_account_nag_last_seen_");
        sb.append(i);
        edit.putLong(sb.toString(), A002).apply();
    }

    public C33061ee(C19970wo r1, C19420v0 r2, C20810yC r3) {
        this.A01 = r1;
        this.A02 = r3;
        this.A00 = r2;
    }
}
