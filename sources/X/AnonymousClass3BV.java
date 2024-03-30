package X;

import android.app.Activity;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.util.Log;

/* renamed from: X.3BV  reason: invalid class name */
public abstract class AnonymousClass3BV {
    public void A00() {
        FingerprintBottomSheet A0G;
        if (this instanceof C89294Vz) {
            C89294Vz r1 = (C89294Vz) this;
            if (r1.A01 != 0) {
                Log.i("AuthenticationActivity/fingerprint-success-animation-end");
                C36331k8.A0m((Activity) r1.A00);
                return;
            }
            Log.i("AppAuthenticationActivity/fingerprint-success-animation-end");
            AppAuthenticationActivity appAuthenticationActivity = (AppAuthenticationActivity) r1.A00;
            appAuthenticationActivity.A07();
            appAuthenticationActivity.finish();
            return;
        }
        Log.i("AppAuthSettingsActivity/fingerprint-success-animation-end");
        AppAuthSettingsActivity appAuthSettingsActivity = ((AnonymousClass28q) this).A00;
        FingerprintBottomSheet A0G2 = appAuthSettingsActivity.A0B;
        if (!(A0G2 == null || !A0G2.A15() || (A0G = appAuthSettingsActivity.A0B) == null)) {
            A0G.A1c();
        }
        SwitchCompat A01 = appAuthSettingsActivity.A06;
        if (A01 == null) {
            throw C36331k8.A0d("appAuthSettingsSwitch");
        }
        A01.setChecked(true);
        appAuthSettingsActivity.A0Q(true);
    }
}
