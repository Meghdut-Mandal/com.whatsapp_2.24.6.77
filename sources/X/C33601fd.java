package X;

import android.content.SharedPreferences;

/* renamed from: X.1fd  reason: invalid class name and case insensitive filesystem */
public final class C33601fd {
    public final C24461Cn A00;
    public final C19420v0 A01;

    public C33601fd(C24461Cn r2, C19420v0 r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final int A00() {
        C24461Cn r5 = this.A00;
        AnonymousClass00T r4 = r5.A01;
        int i = ((SharedPreferences) r4.getValue()).getInt("backup_current_banner_type", 0);
        if (i == 0) {
            return 0;
        }
        if (!((SharedPreferences) r4.getValue()).getBoolean("backup_current_banner_shown", false) || !r5.A09(C24461Cn.A00(i), 259200000)) {
            return i;
        }
        return 0;
    }

    public final boolean A01() {
        C19420v0 r2 = this.A01;
        int A0C = r2.A0C();
        if (A0C == 0 || A0C == 4 || r2.A0T(r2.A0c()) == 0 || !this.A00.A08() || A00() == 0) {
            return false;
        }
        return true;
    }
}
