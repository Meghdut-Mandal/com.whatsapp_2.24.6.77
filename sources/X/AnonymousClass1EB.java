package X;

import android.content.SharedPreferences;

/* renamed from: X.1EB  reason: invalid class name */
public final class AnonymousClass1EB {
    public final C19890wg A00;
    public final AnonymousClass00T A01 = new AnonymousClass00U(new AnonymousClass1EC(this));

    public AnonymousClass1EB(C19890wg r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
    }

    public final int A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("tos_acceptance_state_");
        sb.append(str);
        return ((SharedPreferences) this.A01.getValue()).getInt(sb.toString(), 0);
    }

    public final void A01(String str, int i) {
        AnonymousClass00C.A0D(str, 0);
        SharedPreferences.Editor edit = ((SharedPreferences) this.A01.getValue()).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("tos_acceptance_state_");
        sb.append(str);
        edit.putInt(sb.toString(), i).apply();
    }

    public final void A02(String str, long j) {
        AnonymousClass00C.A0D(str, 0);
        SharedPreferences.Editor edit = ((SharedPreferences) this.A01.getValue()).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("tos_last_refresh_timestamp_");
        sb.append(str);
        edit.putLong(sb.toString(), j).apply();
    }
}
