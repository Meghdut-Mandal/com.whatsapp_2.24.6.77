package X;

import android.content.SharedPreferences;

/* renamed from: X.6Jt  reason: invalid class name and case insensitive filesystem */
public final class C130106Jt {
    public SharedPreferences A00;
    public final C19890wg A01;

    public C130106Jt(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public static final synchronized SharedPreferences A00(C130106Jt r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A00("waffle_crossposting_prefs");
                r2.A00 = sharedPreferences;
            }
            if (sharedPreferences == null) {
                throw C36381kD.A0l();
            }
        }
        return sharedPreferences;
    }
}
