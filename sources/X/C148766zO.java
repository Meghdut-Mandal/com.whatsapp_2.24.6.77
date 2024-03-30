package X;

import android.content.SharedPreferences;

/* renamed from: X.6zO  reason: invalid class name and case insensitive filesystem */
public class C148766zO implements C158537hf {
    public final C21100yf A00;

    public void BRD() {
        C21100yf r0 = this.A00;
        synchronized (C21100yf.class) {
            SharedPreferences.Editor edit = r0.A00.edit();
            C36331k8.A0w(edit, "server_props:one_time_unlocked", true);
            C36341k9.A0u(edit, "server_props:config_hash");
        }
    }

    public C148766zO(C21100yf r1) {
        this.A00 = r1;
    }
}
