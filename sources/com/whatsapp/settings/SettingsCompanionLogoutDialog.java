package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass17Y;
import X.AnonymousClass1RU;
import X.AnonymousClass3KU;
import X.AnonymousClass3LW;
import X.AnonymousClass3U8;
import X.AnonymousClass4XS;
import X.C18820ts;
import X.C19420v0;
import X.C19740wR;
import X.C19770wU;
import X.C19900wh;
import X.C19970wo;
import X.C222913s;
import X.C24801Dv;
import X.C25951Ih;
import X.C36321k7;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class SettingsCompanionLogoutDialog extends Hilt_SettingsCompanionLogoutDialog {
    public C24801Dv A00;
    public AnonymousClass17Y A01;
    public AnonymousClass1RU A02;
    public C25951Ih A03;
    public C19970wo A04;
    public C19420v0 A05;
    public C19900wh A06;
    public C19770wU A07;

    public Dialog A1a(Bundle bundle) {
        String str;
        boolean A0A = this.A02.A0A();
        int i = R.string.f12nameremoved;
        if (A0A) {
            i = R.string.f12nameremoved;
        }
        String A0n = A0n(i);
        if (A0A) {
            str = null;
            try {
                AnonymousClass3KU A032 = this.A02.A03();
                if (A032 != null) {
                    C18820ts r2 = this.A01;
                    String str2 = A032.A07;
                    UserJid userJid = PhoneUserJid.WHATSAPP_CAPS_SURVEY;
                    str = r2.A0H(AnonymousClass3U8.A04(C222913s.A00(str2)));
                } else {
                    Log.e("SettingsCompanionLogoutDialog/getCurrentPhoneNumber/currentAccount is null ");
                }
            } catch (C19740wR e) {
                C36321k7.A1J(e, "SettingsCompanionLogoutDialog/getCurrentPhoneNumber/InvalidJidException : ", AnonymousClass000.A0u());
            }
        } else {
            str = A0n(R.string.f12nameremoved);
        }
        C39001qm A042 = AnonymousClass3LW.A04(this);
        A042.A0q(A0n);
        A042.A0p(str);
        C39001qm.A03(new AnonymousClass4XS(5, this, A0A), A042, R.string.f12nameremoved);
        return A042.create();
    }
}
