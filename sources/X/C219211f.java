package X;

import android.content.SharedPreferences;

/* renamed from: X.11f  reason: invalid class name and case insensitive filesystem */
public class C219211f {
    public SharedPreferences A00;
    public final C19970wo A01;
    public final C19890wg A02;

    public static synchronized SharedPreferences A00(C219211f r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A02.A00("core_health_event_pref_file");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public C219211f(C19970wo r1, C19890wg r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
