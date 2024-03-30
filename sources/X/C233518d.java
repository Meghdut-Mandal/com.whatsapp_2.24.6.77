package X;

import android.content.SharedPreferences;

/* renamed from: X.18d  reason: invalid class name and case insensitive filesystem */
public final class C233518d {
    public SharedPreferences A00;
    public final C19890wg A01;

    public C233518d(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public static final synchronized SharedPreferences A00(C233518d r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A00("time_spent_logging_prefs");
                r2.A00 = sharedPreferences;
            }
            AnonymousClass00C.A0E(sharedPreferences, "null cannot be cast to non-null type android.content.SharedPreferences");
        }
        return sharedPreferences;
    }
}
