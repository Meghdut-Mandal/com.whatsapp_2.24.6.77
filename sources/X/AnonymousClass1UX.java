package X;

import android.content.SharedPreferences;

/* renamed from: X.1UX  reason: invalid class name */
public class AnonymousClass1UX {
    public final C19890wg A00;
    public volatile SharedPreferences A01;

    public static SharedPreferences A00(AnonymousClass1UX r3) {
        if (r3.A01 == null) {
            synchronized (AnonymousClass1UX.class) {
                if (r3.A01 == null) {
                    r3.A01 = r3.A00.A00("fb_credentials_prefs");
                }
            }
        }
        return r3.A01;
    }

    public void A01(String str) {
        synchronized (AnonymousClass1UX.class) {
            A00(this).edit().putString("pref_fb_user_credentials_encrypted", str).apply();
        }
    }

    public AnonymousClass1UX(C19890wg r1) {
        this.A00 = r1;
    }
}
