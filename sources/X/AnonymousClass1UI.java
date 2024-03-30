package X;

import android.content.SharedPreferences;

/* renamed from: X.1UI  reason: invalid class name */
public final class AnonymousClass1UI {
    public SharedPreferences A00;
    public final C19890wg A01;

    public AnonymousClass1UI(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public static final SharedPreferences A00(AnonymousClass1UI r3) {
        if (r3.A00 == null) {
            synchronized (AnonymousClass1UI.class) {
                if (r3.A00 == null) {
                    r3.A00 = r3.A01.A00("xfamily_fb_account_file");
                }
            }
        }
        SharedPreferences sharedPreferences = r3.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
