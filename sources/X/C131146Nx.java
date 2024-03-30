package X;

import android.content.SharedPreferences;

/* renamed from: X.6Nx  reason: invalid class name and case insensitive filesystem */
public class C131146Nx {
    public SharedPreferences A00;
    public final C19890wg A01;

    public static synchronized SharedPreferences A00(C131146Nx r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A00("network_resources_pref");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public C131146Nx(C19890wg r1) {
        this.A01 = r1;
    }

    public int A01(String str) {
        return A00(this).getInt(AnonymousClass000.A0p("downloadstate/", str, AnonymousClass000.A0u()), 5);
    }

    public void A02(String str, int i) {
        C36341k9.A0v(A00(this).edit(), AnonymousClass000.A0p("downloadstate/", str, AnonymousClass000.A0u()), i);
    }
}
