package X;

import android.content.SharedPreferences;

/* renamed from: X.1Eq  reason: invalid class name and case insensitive filesystem */
public final class C25011Eq {
    public SharedPreferences A00;
    public final C19890wg A01;

    public C25011Eq(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public static final synchronized SharedPreferences A00(C25011Eq r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A00("wabai_consent_prefs");
                AnonymousClass00C.A08(sharedPreferences);
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }
}
