package X;

import android.content.SharedPreferences;

/* renamed from: X.6V6  reason: invalid class name */
public class AnonymousClass6V6 {
    public SharedPreferences A00;
    public final C19890wg A01;

    public static SharedPreferences A01(AnonymousClass6V6 r2) {
        synchronized (r2) {
            if (r2.A00 == null) {
                r2.A00 = r2.A01.A00("privatestats_props");
            }
        }
        return r2.A00;
    }

    public static void A02(AnonymousClass6V6 r4, String str, long j) {
        SharedPreferences.Editor remove;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        SharedPreferences.Editor A002 = A00(r4);
        if (i > 0) {
            remove = A002.putLong(str, j);
        } else {
            remove = A002.remove(str);
        }
        remove.apply();
    }

    public void A04(int i) {
        SharedPreferences.Editor remove;
        SharedPreferences.Editor A002 = A00(this);
        if (i > 0) {
            remove = A002.putInt("token_not_ready_reason", i);
        } else {
            remove = A002.remove("token_not_ready_reason");
        }
        remove.apply();
    }

    public AnonymousClass6V6(C19890wg r1) {
        this.A01 = r1;
    }

    public static SharedPreferences.Editor A00(AnonymousClass6V6 r0) {
        return A01(r0).edit();
    }

    public static void A03(AnonymousClass6V6 r0, String str, String str2) {
        SharedPreferences.Editor remove;
        SharedPreferences.Editor A002 = A00(r0);
        if (str2 != null) {
            remove = A002.putString(str, str2);
        } else {
            remove = A002.remove(str);
        }
        remove.apply();
    }
}
