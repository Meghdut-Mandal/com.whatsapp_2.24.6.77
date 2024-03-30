package X;

import android.content.SharedPreferences;

/* renamed from: X.9Qj  reason: invalid class name and case insensitive filesystem */
public abstract class C194599Qj {
    public SharedPreferences A00;
    public final C19890wg A01;

    public SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        boolean z = this instanceof C177848eT;
        synchronized (this) {
            if (z) {
                sharedPreferences = this.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = this.A01.A00("com.whatsapp_business_directory");
                    this.A00 = sharedPreferences;
                }
            } else {
                sharedPreferences = this.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = this.A01.A00("com.whatsapp_business_search");
                    this.A00 = sharedPreferences;
                }
                AnonymousClass00C.A07(sharedPreferences);
            }
        }
        return sharedPreferences;
    }

    public C194599Qj(C19890wg r1) {
        this.A01 = r1;
    }
}
