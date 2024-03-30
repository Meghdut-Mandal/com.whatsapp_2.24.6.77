package X;

import android.content.SharedPreferences;

/* renamed from: X.3NV  reason: invalid class name */
public final class AnonymousClass3NV {
    public SharedPreferences A00;
    public final C19890wg A01;

    public AnonymousClass3NV(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public static final SharedPreferences A00(AnonymousClass3NV r3) {
        if (r3.A00 == null) {
            synchronized (AnonymousClass3NV.class) {
                if (r3.A00 == null) {
                    r3.A00 = r3.A01.A00("xfamily_crossposting_prefs");
                }
            }
        }
        SharedPreferences sharedPreferences = r3.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw C36381kD.A0l();
    }

    public static SharedPreferences A01(AnonymousClass005 r0) {
        return A00((AnonymousClass3NV) r0.get());
    }
}
