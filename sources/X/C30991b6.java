package X;

import android.content.SharedPreferences;

/* renamed from: X.1b6  reason: invalid class name and case insensitive filesystem */
public final class C30991b6 {
    public final C19890wg A00;
    public final AnonymousClass00T A01 = new AnonymousClass00U(new C31001b7(this));

    public C30991b6(C19890wg r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
    }

    public final void A00(long j, boolean z) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.A01.getValue()).edit();
        edit.putBoolean("pref_disclosure_tos_state", z);
        edit.putLong("pref_disclosure_tos_timestamp", j);
        edit.apply();
    }
}
