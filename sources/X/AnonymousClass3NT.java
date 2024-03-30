package X;

import android.content.SharedPreferences;

/* renamed from: X.3NT  reason: invalid class name */
public class AnonymousClass3NT {
    public SharedPreferences A00;
    public final C19890wg A01;

    public static synchronized SharedPreferences A00(AnonymousClass3NT r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A00("google_migrate_prefs");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public AnonymousClass3NT(C19890wg r1) {
        this.A01 = r1;
    }
}
