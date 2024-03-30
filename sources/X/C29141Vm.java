package X;

import android.content.SharedPreferences;
import java.util.Collections;

/* renamed from: X.1Vm  reason: invalid class name and case insensitive filesystem */
public class C29141Vm {
    public SharedPreferences A00;
    public final C19890wg A01;

    public void A00(C119985qm r4, String str) {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A00("com.whatsapp_payment_sync_preferences");
                this.A00 = sharedPreferences;
            }
        }
        sharedPreferences.edit().putString(r4.A01.A00(), str).apply();
        for (C119985qm A002 : Collections.unmodifiableList(r4.A00)) {
            A00(A002, str);
        }
    }

    public C29141Vm(C19890wg r1) {
        this.A01 = r1;
    }
}
