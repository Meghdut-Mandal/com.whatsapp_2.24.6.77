package com.whatsapp.settings;

import X.AnonymousClass11F;
import X.AnonymousClass16D;
import X.AnonymousClass17Y;
import X.AnonymousClass1A6;
import X.AnonymousClass1X4;
import X.C100834vr;
import X.C18740tg;
import X.C19730wQ;
import X.C19770wU;
import X.C20060wx;
import X.C20810yC;
import X.C21100yf;
import X.C24341Cb;
import X.C33051ed;
import X.C36401kF;
import X.C64693Pb;
import X.C96364nD;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsChatHistoryFragment extends Hilt_SettingsChatHistoryFragment {
    public AnonymousClass17Y A00;
    public C19730wQ A01;
    public C21100yf A02;
    public AnonymousClass1X4 A03;
    public AnonymousClass16D A04;
    public AnonymousClass1A6 A05;
    public C64693Pb A06;
    public C24341Cb A07;
    public C20060wx A08;
    public C20810yC A09;
    public AnonymousClass11F A0A;
    public C33051ed A0B;
    public C19770wU A0C;
    public boolean A0D = false;

    public void A1N(int i, int i2, Intent intent) {
        if (i == 10 && i2 == -1) {
            AnonymousClass11F A0Z = C36401kF.A0Z(intent, "contact");
            C18740tg.A07(A0Z, intent.getStringExtra("contact"));
            this.A0A = A0Z;
            C100834vr r2 = this.A00;
            if (r2 != null) {
                this.A06.A02(r2, r2, this.A04.A08(A0Z), A0Z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0082, code lost:
        if (r0 == 0) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Y(java.lang.String r6, android.os.Bundle r7) {
        /*
            r5 = this;
            X.4vr r0 = r5.A00
            if (r0 == 0) goto L_0x00ac
            X.01I r1 = r5.A0i()
            r0 = 2131894109(0x7f121f5d, float:1.9423013E38)
            java.lang.String r1 = r1.getString(r0)
            X.4vr r0 = r5.A00
            if (r0 == 0) goto L_0x0016
            r0.setTitle(r1)
        L_0x0016:
            r0 = 2132279304(0x7f180008, float:2.0204282E38)
            r5.A1b(r0)
            X.0yC r1 = r5.A09
            r0 = 4023(0xfb7, float:5.637E-42)
            boolean r0 = r1.A0E(r0)
            r5.A0D = r0
            X.0yf r1 = r5.A02
            X.0yi r0 = X.C21100yf.A0v
            boolean r0 = r1.A09(r0)
            java.lang.String r2 = "email_chat_history"
            if (r0 == 0) goto L_0x00ad
            X.0wQ r0 = r5.A01
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x00ad
            androidx.preference.Preference r1 = r5.B7M(r2)
            X.6iJ r0 = new X.6iJ
            r0.<init>(r5)
            r1.A0B = r0
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x004f
            r0 = 2131232726(0x7f0807d6, float:1.808157E38)
            r1.A09(r0)
        L_0x004f:
            java.lang.String r0 = "msgstore_delete_all_chats"
            androidx.preference.Preference r4 = r5.B7M(r0)
            r1 = 0
            X.B8H r0 = new X.B8H
            r0.<init>(r5, r1)
            r4.A0B = r0
            java.lang.String r0 = "msgstore_clear_all_chats"
            androidx.preference.Preference r2 = r5.B7M(r0)
            r1 = 1
            X.B8H r0 = new X.B8H
            r0.<init>(r5, r1)
            r2.A0B = r0
            java.lang.String r2 = "msgstore_archive_all_chats"
            androidx.preference.Preference r3 = r5.B7M(r2)
            X.1A6 r0 = r5.A05
            int r1 = r0.A03()
            X.1A6 r0 = r5.A05
            int r0 = r0.A02()
            if (r1 > 0) goto L_0x0084
            r1 = 2131895156(0x7f122374, float:1.9425137E38)
            if (r0 != 0) goto L_0x0087
        L_0x0084:
            r1 = 2131896325(0x7f122805, float:1.9427508E38)
        L_0x0087:
            android.content.Context r0 = r3.A05
            java.lang.String r0 = r0.getString(r1)
            r3.A0I(r0)
            androidx.preference.Preference r2 = r5.B7M(r2)
            r1 = 2
            X.B8H r0 = new X.B8H
            r0.<init>(r5, r1)
            r2.A0B = r0
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x00ac
            r0 = 2131232724(0x7f0807d4, float:1.8081565E38)
            r3.A09(r0)
            r0 = 2131232664(0x7f080798, float:1.8081444E38)
            r4.A09(r0)
        L_0x00ac:
            return
        L_0x00ad:
            X.9XO r0 = r5.A01
            androidx.preference.PreferenceScreen r1 = r0.A06
            if (r1 == 0) goto L_0x004f
            androidx.preference.Preference r0 = r5.B7M(r2)
            if (r0 == 0) goto L_0x004f
            androidx.preference.PreferenceGroup.A00(r0, r1)
            r1.A06()
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsChatHistoryFragment.A1Y(java.lang.String, android.os.Bundle):void");
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        C96364nD r2 = this.A06;
        r2.A00 = colorDrawable.getIntrinsicHeight();
        r2.A01 = colorDrawable;
        PreferenceFragmentCompat preferenceFragmentCompat = r2.A03;
        preferenceFragmentCompat.A02.A0b();
        r2.A00 = 0;
        preferenceFragmentCompat.A02.A0b();
    }
}
