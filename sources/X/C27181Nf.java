package X;

import android.content.SharedPreferences;

/* renamed from: X.1Nf  reason: invalid class name and case insensitive filesystem */
public class C27181Nf {
    public SharedPreferences A00;
    public final C19890wg A01;

    public static synchronized SharedPreferences A00(C27181Nf r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A00("block_reasons_prefs");
                r2.A00 = sharedPreferences;
            }
            C18740tg.A06(sharedPreferences);
        }
        return sharedPreferences;
    }

    public C27181Nf(C19890wg r1) {
        this.A01 = r1;
    }

    public void A01(int i) {
        A00(this).edit().putInt("biz_block_reasons_api_back_off_days", i).apply();
    }
}
