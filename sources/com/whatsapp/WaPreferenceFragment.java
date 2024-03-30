package com.whatsapp;

import X.AnonymousClass07B;
import X.AnonymousClass9XO;
import X.C100834vr;
import X.C90514aH;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.preference.PreferenceScreen;

public abstract class WaPreferenceFragment extends Hilt_WaPreferenceFragment {
    public C100834vr A00;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r3 = (com.whatsapp.settings.SettingsChatHistoryFragment) r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1a(int r11) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof com.whatsapp.settings.SettingsJidNotificationFragment
            if (r0 == 0) goto L_0x0021
            r1 = r10
            com.whatsapp.settings.SettingsJidNotificationFragment r1 = (com.whatsapp.settings.SettingsJidNotificationFragment) r1
            if (r11 != 0) goto L_0x00b5
            X.4vr r2 = r1.A00
            X.1H2 r4 = r1.A04
            X.1Dv r3 = r1.A00
            X.0xT r5 = r1.A07
            r0 = 2131893164(0x7f121bac, float:1.9421097E38)
            java.lang.String r6 = r1.A0n(r0)
            r8 = 0
            java.lang.String r7 = "26000003"
            r9 = r8
            X.0FM r0 = com.whatsapp.dialogs.FAQLearnMoreDialogFragment.A05(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0021:
            boolean r0 = r10 instanceof com.whatsapp.settings.SettingsChatHistoryFragment
            if (r0 == 0) goto L_0x00b5
            r3 = r10
            com.whatsapp.settings.SettingsChatHistoryFragment r3 = (com.whatsapp.settings.SettingsChatHistoryFragment) r3
            X.4vr r1 = r3.A00
            r4 = 0
            if (r1 == 0) goto L_0x004d
            r0 = 3
            r6 = 0
            if (r11 == r0) goto L_0x009e
            r0 = 4
            if (r11 == r0) goto L_0x0081
            r0 = 5
            if (r11 == r0) goto L_0x004e
            r0 = 10
            if (r11 != r0) goto L_0x004d
            X.11F r1 = r3.A0A
            if (r1 == 0) goto L_0x004d
            X.16D r0 = r3.A04
            X.141 r2 = r0.A0D(r1)
            X.3Pb r1 = r3.A06
            X.4vr r0 = r3.A00
            X.0FM r4 = r1.A01(r0, r0, r2)
        L_0x004d:
            return r4
        L_0x004e:
            X.1A6 r0 = r3.A05
            int r0 = r0.A03()
            if (r0 <= 0) goto L_0x0057
            r6 = 1
        L_0x0057:
            r0 = 4
            X.4XS r2 = new X.4XS
            r2.<init>(r0, r3, r6)
            android.content.Context r0 = r3.A1D()
            X.1qm r1 = X.AnonymousClass3LW.A00(r0)
            r0 = 2131895157(0x7f122375, float:1.942514E38)
            if (r6 == 0) goto L_0x006d
            r0 = 2131886507(0x7f1201ab, float:1.9407595E38)
        L_0x006d:
            r1.A0c(r0)
            r0 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1.A0h(r2, r0)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            r1.A0f(r4, r0)
            X.0FM r4 = r1.create()
            return r4
        L_0x0081:
            r1 = 2
            X.4Xz r0 = new X.4Xz
            r0.<init>(r3, r1)
            X.1ed r2 = r3.A0B
            android.content.Context r3 = r3.A1D()
            X.4Y2 r4 = new X.4Y2
            r4.<init>(r0, r1)
            r5 = -1
            r7 = 0
            r8 = 0
            X.1qm r0 = r2.A00(r3, r4, r5, r6, r7, r8)
            X.0FM r4 = r0.create()
            return r4
        L_0x009e:
            r5 = 1
            X.4Y2 r2 = new X.4Y2
            r2.<init>(r3, r5)
            X.1ed r0 = r3.A0B
            r3 = -1
            r4 = 3
            r6 = 1
            X.1qm r0 = r0.A00(r1, r2, r3, r4, r5, r6)
            X.0FM r4 = r0.create()
            r4.show()
            return r4
        L_0x00b5:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.WaPreferenceFragment.A1a(int):android.app.Dialog");
    }

    public void A1b(int i) {
        AnonymousClass9XO r2 = this.A01;
        if (r2 != null) {
            PreferenceScreen A02 = r2.A02(A1D(), this.A01.A06, i);
            AnonymousClass9XO r1 = this.A01;
            PreferenceScreen preferenceScreen = r1.A06;
            if (A02 != preferenceScreen) {
                if (preferenceScreen != null) {
                    preferenceScreen.A08();
                }
                r1.A06 = A02;
                this.A03 = true;
                if (this.A04) {
                    Handler handler = this.A00;
                    if (!handler.hasMessages(1)) {
                        handler.obtainMessage(1).sendToTarget();
                    }
                }
            }
            C100834vr r0 = this.A00;
            if (r0 != null) {
                CharSequence title = r0.getTitle();
                AnonymousClass07B supportActionBar = r0.getSupportActionBar();
                if (!TextUtils.isEmpty(title) && supportActionBar != null) {
                    supportActionBar.A0Q(title);
                    return;
                }
                return;
            }
            return;
        }
        throw C90514aH.A0s("This should be called after super.onCreate.");
    }

    public void A19() {
        super.A19();
        this.A00 = null;
    }

    public void A1O(Context context) {
        super.A1O(context);
        this.A00 = (C100834vr) A0h();
    }
}
