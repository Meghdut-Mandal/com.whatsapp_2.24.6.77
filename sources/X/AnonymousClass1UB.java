package X;

import android.content.SharedPreferences;

/* renamed from: X.1UB  reason: invalid class name */
public final class AnonymousClass1UB {
    public SharedPreferences A00;
    public final C19970wo A01;
    public final C19890wg A02;

    public AnonymousClass1UB(C19970wo r2, C19890wg r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public static final SharedPreferences A00(AnonymousClass1UB r3) {
        if (r3.A00 == null) {
            synchronized (AnonymousClass1UB.class) {
                if (r3.A00 == null) {
                    r3.A00 = r3.A02.A00("account_linking_prefs");
                }
            }
        }
        SharedPreferences sharedPreferences = r3.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A01(long j) {
        A00(this).edit().putLong("pref_ping_validity_time", (C19970wo.A00(this.A01) / ((long) 1000)) + j).apply();
    }
}
