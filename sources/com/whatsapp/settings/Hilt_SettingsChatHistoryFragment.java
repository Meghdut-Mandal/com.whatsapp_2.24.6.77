package com.whatsapp.settings;

import X.AnonymousClass1A6;
import X.C18800tq;
import X.C18830tt;
import X.C20060wx;
import X.C24341Cb;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C33051ed;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36431kI;
import X.C64693Pb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.WaPreferenceFragment;

public abstract class Hilt_SettingsChatHistoryFragment extends WaPreferenceFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Z() {
        if (!this.A02) {
            this.A02 = true;
            SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) this;
            C18800tq r3 = ((C32581dr) ((C32571dq) generatedComponent())).A1K;
            settingsChatHistoryFragment.A01 = C36351kA.A0N(r3);
            settingsChatHistoryFragment.A0C = C36341k9.A0Z(r3);
            settingsChatHistoryFragment.A02 = C36431kI.A0W(r3);
            settingsChatHistoryFragment.A03 = C36361kB.A0T(r3);
            settingsChatHistoryFragment.A08 = (C20060wx) r3.A8B.get();
            settingsChatHistoryFragment.A04 = C36341k9.A0R(r3);
            C18830tt r1 = r3.A00;
            settingsChatHistoryFragment.A06 = (C64693Pb) r1.A7I.get();
            settingsChatHistoryFragment.A07 = (C24341Cb) r3.A4n.get();
            settingsChatHistoryFragment.A05 = (AnonymousClass1A6) r3.A2P.get();
            settingsChatHistoryFragment.A00 = C36351kA.A0M(r3);
            settingsChatHistoryFragment.A0B = (C33051ed) r1.A1L.get();
            settingsChatHistoryFragment.A09 = C36341k9.A0V(r3);
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A00();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C36331k8.A08(super.A1E(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r3) {
        /*
            r2 = this;
            super.A1F(r3)
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C32551do.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C36331k8.A1U(r0)
            r2.A00()
            r2.A1Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.Hilt_SettingsChatHistoryFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Z();
    }
}
