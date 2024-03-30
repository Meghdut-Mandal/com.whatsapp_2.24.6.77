package X;

import android.content.SharedPreferences;

/* renamed from: X.3NR  reason: invalid class name */
public class AnonymousClass3NR {
    public C19890wg A00;
    public volatile SharedPreferences A01;

    public static SharedPreferences A00(AnonymousClass3NR r2) {
        if (r2.A01 == null) {
            synchronized (r2) {
                if (r2.A01 == null) {
                    r2.A01 = r2.A00.A00("preloads_prefs");
                }
            }
        }
        return r2.A01;
    }
}
