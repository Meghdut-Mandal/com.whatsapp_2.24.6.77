package X;

import android.os.Handler;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;

/* renamed from: X.9xR  reason: invalid class name and case insensitive filesystem */
public class C207979xR implements C22848Awx {
    public final /* synthetic */ PreferenceGroup A00;
    public final /* synthetic */ C168137zl A01;

    public C207979xR(PreferenceGroup preferenceGroup, C168137zl r2) {
        this.A01 = r2;
        this.A00 = preferenceGroup;
    }

    public boolean BdH(Preference preference) {
        this.A00.A00 = Integer.MAX_VALUE;
        C168137zl r0 = this.A01;
        Handler handler = r0.A00;
        Runnable runnable = r0.A01;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
        return true;
    }
}
