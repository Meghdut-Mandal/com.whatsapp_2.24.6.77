package X;

import android.content.SharedPreferences;

/* renamed from: X.0yS  reason: invalid class name and case insensitive filesystem */
public class C20970yS {
    public SharedPreferences A00;
    public final C19890wg A01;

    public int A00(int i) {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A00("field-stats-events-sampling");
                this.A00 = sharedPreferences;
            }
        }
        return sharedPreferences.getInt(String.valueOf(i), 0);
    }

    public C20970yS(C19890wg r1) {
        this.A01 = r1;
    }
}
