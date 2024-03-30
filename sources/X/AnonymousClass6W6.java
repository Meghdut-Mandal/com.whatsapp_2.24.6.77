package X;

import android.content.SharedPreferences;

/* renamed from: X.6W6  reason: invalid class name */
public class AnonymousClass6W6 {
    public SharedPreferences A00;
    public final C19890wg A01;
    public final String A02;

    public static SharedPreferences A00(AnonymousClass6W6 r2) {
        synchronized (r2) {
            if (r2.A00 == null) {
                r2.A00 = r2.A01.A00(r2.A02);
            }
        }
        return r2.A00;
    }

    public static void A02(AnonymousClass6W6 r4, String str, long j) {
        SharedPreferences.Editor remove;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        SharedPreferences.Editor edit = A00(r4).edit();
        if (i > 0) {
            remove = edit.putLong(str, j);
        } else {
            remove = edit.remove(str);
        }
        remove.apply();
    }

    public void A04(int i) {
        SharedPreferences.Editor remove;
        SharedPreferences.Editor edit = A00(this).edit();
        if (i > 0) {
            remove = edit.putInt("token_not_ready_reason", i);
        } else {
            remove = edit.remove("token_not_ready_reason");
        }
        remove.apply();
    }

    public AnonymousClass6W6(C19890wg r3, String str) {
        this.A01 = r3;
        this.A02 = AnonymousClass000.A0p("acs_token_", str, AnonymousClass000.A0u());
    }

    public static void A01(AnonymousClass6W6 r0, String str, int i) {
        SharedPreferences.Editor remove;
        SharedPreferences.Editor edit = A00(r0).edit();
        if (i >= 0) {
            remove = edit.putInt(str, i);
        } else {
            remove = edit.remove(str);
        }
        remove.apply();
    }

    public static void A03(AnonymousClass6W6 r0, String str, String str2) {
        SharedPreferences.Editor remove;
        SharedPreferences.Editor edit = A00(r0).edit();
        if (str2 != null) {
            remove = edit.putString(str, str2);
        } else {
            remove = edit.remove(str);
        }
        remove.apply();
    }
}
