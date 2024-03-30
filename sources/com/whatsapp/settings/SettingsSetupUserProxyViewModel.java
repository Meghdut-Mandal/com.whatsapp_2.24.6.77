package com.whatsapp.settings;

import X.AnonymousClass00C;
import X.AnonymousClass011;
import X.AnonymousClass04R;
import X.AnonymousClass1VS;
import X.AnonymousClass3QR;
import X.C001700s;
import X.C36431kI;

public final class SettingsSetupUserProxyViewModel extends AnonymousClass04R {
    public AnonymousClass3QR A00;
    public AnonymousClass3QR A01;
    public final C001700s A02 = C36431kI.A0S();
    public final AnonymousClass1VS A03;

    public SettingsSetupUserProxyViewModel(AnonymousClass1VS r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A03 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (X.C55182uD.A00(r4) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass3QR r4, com.whatsapp.settings.SettingsSetupUserProxyViewModel r5) {
        /*
            X.3QR r0 = r5.A01
            if (r0 != 0) goto L_0x0026
            X.1VS r0 = r5.A03
            X.1BX r0 = r0.A00
            java.lang.String r3 = r0.A01()
            int r2 = r0.A00()
            X.0wg r1 = r0.A01
            java.lang.String r0 = "user_proxy_setting_pref"
            android.content.SharedPreferences r1 = r1.A00(r0)
            java.lang.String r0 = "proxy_use_tls"
            boolean r1 = X.C36441kJ.A1I(r1, r0)
            r0 = 443(0x1bb, float:6.21E-43)
            X.3QR r0 = X.C55172uC.A00(r3, r0, r2, r1)
            r5.A01 = r0
        L_0x0026:
            boolean r0 = X.AnonymousClass00C.A0J(r0, r4)
            if (r0 != 0) goto L_0x0033
            boolean r1 = X.C55182uD.A00(r4)
            r0 = 0
            if (r1 == 0) goto L_0x0034
        L_0x0033:
            r0 = 2
        L_0x0034:
            X.00s r1 = r5.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.011 r0 = X.C36441kJ.A19(r0, r4)
            r1.A0D(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsSetupUserProxyViewModel.A01(X.3QR, com.whatsapp.settings.SettingsSetupUserProxyViewModel):void");
    }

    public final AnonymousClass3QR A0S() {
        AnonymousClass3QR r0;
        AnonymousClass011 r02 = (AnonymousClass011) this.A02.A04();
        if (r02 == null || (r0 = (AnonymousClass3QR) r02.second) == null) {
            return new AnonymousClass3QR((String) null, (String) null, 443, 587, true);
        }
        return r0;
    }
}
