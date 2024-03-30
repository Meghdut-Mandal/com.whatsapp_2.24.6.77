package X;

import android.content.SharedPreferences;

/* renamed from: X.19y  reason: invalid class name and case insensitive filesystem */
public class C238119y {
    public SharedPreferences A00;
    public final C19890wg A01;

    public static synchronized SharedPreferences A00(C238119y r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A00("disappearing_mode_prefs");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public C238119y(C19890wg r1) {
        this.A01 = r1;
    }
}
