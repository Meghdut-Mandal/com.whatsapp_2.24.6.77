package X;

import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.util.Log;

/* renamed from: X.28r  reason: invalid class name and case insensitive filesystem */
public abstract class C430728r extends AnonymousClass3BV {
    public void A01() {
    }

    public void A02(C02680Bk r3, C160387kv r4) {
        Log.i("AppAuthSettingsActivity/authenticate");
        AnonymousClass18U r1 = ((AnonymousClass28q) this).A00.A05;
        C18740tg.A0C(r1.A05());
        AnonymousClass18U.A00(r1).B1a(r3, r4);
    }

    public void A03(byte[] bArr) {
        if (this instanceof AnonymousClass28q) {
            Log.i("AppAuthSettingsActivity/fingerprint-success");
            AppAuthSettingsActivity appAuthSettingsActivity = ((AnonymousClass28q) this).A00;
            appAuthSettingsActivity.A09.A22(true);
            appAuthSettingsActivity.A05.A02(false);
            appAuthSettingsActivity.A3j().A09();
            appAuthSettingsActivity.A3i().A01();
        }
    }
}
