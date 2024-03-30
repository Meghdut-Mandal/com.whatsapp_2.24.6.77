package X;

import android.content.SharedPreferences;

/* renamed from: X.1Na  reason: invalid class name and case insensitive filesystem */
public class C27131Na {
    public SharedPreferences A00;
    public SharedPreferences A01;
    public final C19970wo A02;
    public final AnonymousClass1A1 A03;
    public final C19890wg A04;

    public static synchronized SharedPreferences A00(C27131Na r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A04.A00("msg_attribute_pref_file");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public static synchronized SharedPreferences A01(C27131Na r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A01;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A04.A00("in_app_msg_source_pref_file");
                r2.A01 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public static String A02(AnonymousClass11F r2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(r2.getRawString());
        sb.append(",");
        sb.append(str);
        return sb.toString();
    }

    public void A03(C64933Qa r4, int i) {
        AnonymousClass11F r2 = r4.A00;
        if (r2 != null) {
            A01(this).edit().putInt(A02(r2, r4.A01), i).apply();
        }
    }

    public C27131Na(C19970wo r1, C19890wg r2, AnonymousClass1A1 r3) {
        this.A02 = r1;
        this.A03 = r3;
        this.A04 = r2;
    }
}
