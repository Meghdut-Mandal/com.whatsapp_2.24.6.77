package X;

import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3HL  reason: invalid class name */
public abstract class AnonymousClass3HL {
    public void A00() {
        if (this instanceof C39091rA) {
            Log.i("DeviceAuthenticationPlugin/AuthenticationCallback/failed");
        } else if (this instanceof C39081r9) {
            C39081r9 r6 = (C39081r9) this;
            C69933eK r5 = r6.A04;
            AnonymousClass3L5 r4 = r5.A01;
            C53502rQ r3 = r6.A01;
            r4.A03(r3, Integer.valueOf(r6.A00), C36361kB.A0i(), 10);
            r4.A02(r3, (Integer) null);
            r6.A02.BXH();
            r5.A00 = null;
        } else {
            C89044Va r1 = (C89044Va) this;
            if (2 - r1.A01 == 0) {
                Log.i("AppAuthenticationActivity/failed");
                ((AppAuthenticationActivity) r1.A00).A00 = 3;
            }
        }
    }

    public void A01() {
        if (this instanceof C39091rA) {
            Log.i("DeviceAuthenticationPlugin/AuthenticationCallback/succeeded");
            ((C39091rA) this).A01.BRa(-1);
        } else if (this instanceof C39081r9) {
            C39081r9 r6 = (C39081r9) this;
            Log.i("ChatLockAuthActivity/success");
            C69933eK r5 = r6.A04;
            r5.A01.A03(r6.A01, Integer.valueOf(r6.A00), C36361kB.A0i(), 3);
            ((C69873eE) r6.A02).A01.Bf7(new C63093Is(C51832oS.SUCCESS, (Integer) null, (Integer) null));
            r5.A00 = null;
        } else {
            C89044Va r1 = (C89044Va) this;
            switch (r1.A01) {
                case 1:
                    Log.i("AppAuthSettingsActivity/success");
                    AppAuthSettingsActivity appAuthSettingsActivity = (AppAuthSettingsActivity) r1.A00;
                    appAuthSettingsActivity.A05.A02(false);
                    appAuthSettingsActivity.A09.A22(true);
                    appAuthSettingsActivity.A3j().A09();
                    appAuthSettingsActivity.A0Q(true);
                    SwitchCompat A01 = appAuthSettingsActivity.A06;
                    if (A01 == null) {
                        throw C36331k8.A0d("appAuthSettingsSwitch");
                    }
                    A01.setChecked(true);
                    appAuthSettingsActivity.A3i().A01();
                    appAuthSettingsActivity.A05.A01(appAuthSettingsActivity);
                    return;
                case 2:
                    Log.i("AppAuthenticationActivity/success");
                    AppAuthenticationActivity appAuthenticationActivity = (AppAuthenticationActivity) r1.A00;
                    appAuthenticationActivity.A00 = 3;
                    C36401kF.A0R(appAuthenticationActivity).A02(false);
                    appAuthenticationActivity.A07();
                    appAuthenticationActivity.finish();
                    return;
                default:
                    return;
            }
        }
    }
}
