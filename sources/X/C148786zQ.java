package X;

import android.content.SharedPreferences;

/* renamed from: X.6zQ  reason: invalid class name and case insensitive filesystem */
public class C148786zQ implements C158537hf {
    public final C21510zM A00;

    public void BRD() {
        C21510zM r2 = this.A00;
        synchronized (r2) {
            SharedPreferences.Editor edit = r2.A00.edit();
            edit.remove("ab_props:sys:config_hash");
            edit.remove("ab_props:sys:last_refresh_time");
            edit.apply();
        }
    }

    public C148786zQ(C21510zM r1) {
        this.A00 = r1;
    }
}
