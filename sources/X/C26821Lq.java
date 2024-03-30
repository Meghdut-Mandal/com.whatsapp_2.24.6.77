package X;

import android.content.SharedPreferences;

/* renamed from: X.1Lq  reason: invalid class name and case insensitive filesystem */
public class C26821Lq {
    public SharedPreferences A00;
    public final C19890wg A01;

    public static synchronized SharedPreferences A00(C26821Lq r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A00("daily_metrics_prefs");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public C26821Lq(C19890wg r1) {
        this.A01 = r1;
    }
}
