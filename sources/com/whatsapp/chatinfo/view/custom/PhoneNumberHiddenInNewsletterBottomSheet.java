package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass22V;
import X.C19730wQ;
import X.C20380xT;
import X.C224514j;
import X.C24801Dv;
import X.C36331k8;
import X.C36341k9;
import android.content.Intent;
import android.view.View;
import com.whatsapp.R;

public class PhoneNumberHiddenInNewsletterBottomSheet extends Hilt_PhoneNumberHiddenInNewsletterBottomSheet {
    public C24801Dv A00;
    public C19730wQ A01;
    public C20380xT A02;

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0198, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0199, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x019c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r10, android.view.View r11) {
        /*
            r9 = this;
            r2 = 0
            X.AnonymousClass00C.A0D(r11, r2)
            super.A1S(r10, r11)
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A06
            if (r1 == 0) goto L_0x0011
            r0 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1.setText(r0)
        L_0x0011:
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A07
            if (r1 == 0) goto L_0x001b
            r0 = 2131896681(0x7f122969, float:1.942823E38)
            r1.setText(r0)
        L_0x001b:
            r5 = r9
            boolean r3 = r9 instanceof com.whatsapp.chatinfo.view.custom.CreatorPrivacyNewsletterBottomSheet
            if (r3 == 0) goto L_0x0103
            com.whatsapp.chatinfo.view.custom.CreatorPrivacyNewsletterBottomSheet r5 = (com.whatsapp.chatinfo.view.custom.CreatorPrivacyNewsletterBottomSheet) r5
            com.whatsapp.WaTextView r6 = r5.A04
            if (r6 == 0) goto L_0x004d
            X.12q r4 = r5.A03
            if (r4 == 0) goto L_0x01ac
            android.os.Bundle r1 = r5.A0A
            if (r1 == 0) goto L_0x0100
            java.lang.String r0 = "jid"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x0100
            X.3Ro r0 = X.C28981Uw.A03
            X.1Uw r0 = r0.A01(r1)
        L_0x003c:
            X.3Qp r1 = X.C36371kC.A0W(r4, r0)
            boolean r0 = r1 instanceof X.C44072La
            if (r0 == 0) goto L_0x00fd
            X.2La r1 = (X.C44072La) r1
            if (r1 == 0) goto L_0x00fd
            java.lang.String r0 = r1.A0K
        L_0x004a:
            r6.setText(r0)
        L_0x004d:
            com.whatsapp.WaTextView r1 = r5.A05
            if (r1 == 0) goto L_0x0057
            r0 = 2131893110(0x7f121b76, float:1.9420987E38)
            r1.setText(r0)
        L_0x0057:
            android.content.Context r8 = r5.A1D()
            if (r8 == 0) goto L_0x00b3
            com.whatsapp.ListItemWithLeftIcon r1 = r5.A00
            if (r1 == 0) goto L_0x0071
            r0 = 2131893102(0x7f121b6e, float:1.9420971E38)
            X.AnonymousClass22V.A01(r8, r1, r0)
            r0 = 2131893101(0x7f121b6d, float:1.942097E38)
            java.lang.String r0 = r8.getString(r0)
            r1.setDescription((java.lang.CharSequence) r0)
        L_0x0071:
            com.whatsapp.ListItemWithLeftIcon r1 = r5.A01
            if (r1 == 0) goto L_0x0085
            r0 = 2131893105(0x7f121b71, float:1.9420977E38)
            X.AnonymousClass22V.A01(r8, r1, r0)
            r0 = 2131893104(0x7f121b70, float:1.9420975E38)
            java.lang.String r0 = r8.getString(r0)
            r1.setDescription((java.lang.CharSequence) r0)
        L_0x0085:
            com.whatsapp.ListItemWithLeftIcon r7 = r5.A02
            if (r7 == 0) goto L_0x00b3
            r0 = 2131893108(0x7f121b74, float:1.9420983E38)
            X.AnonymousClass22V.A01(r8, r7, r0)
            X.0xT r1 = r5.A02
            if (r1 == 0) goto L_0x01a5
            java.lang.String r0 = "245599461477281"
            android.net.Uri r0 = r1.A02(r0)
            java.lang.String r6 = X.C36381kD.A0y(r0)
            r1 = 2131893107(0x7f121b73, float:1.9420981E38)
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = X.C36351kA.A0x(r8, r6, r0, r2, r1)
            X.ATA r0 = new X.ATA
            r0.<init>(r5)
            android.text.SpannableString r0 = X.AnonymousClass3RM.A00(r8, r0, r1)
            r7.A06(r0, r4)
        L_0x00b3:
            if (r3 != 0) goto L_0x01a4
            boolean r0 = X.C222013h.A05
            if (r0 == 0) goto L_0x01a4
            X.0wQ r0 = r9.A01
            if (r0 == 0) goto L_0x019d
            java.lang.String r5 = r0.A0C()
            if (r5 == 0) goto L_0x01a4
            com.whatsapp.WaTextView r1 = r9.A04
            if (r1 == 0) goto L_0x00cc
            r0 = 8
            r1.setVisibility(r0)
        L_0x00cc:
            X.7u4 r4 = new X.7u4
            r4.<init>()
            com.whatsapp.WaImageView r0 = r9.A03
            if (r0 == 0) goto L_0x00d8
            r0.setImageDrawable(r4)
        L_0x00d8:
            android.content.res.Resources r0 = X.C36341k9.A0G(r9)
            android.content.res.AssetManager r1 = r0.getAssets()
            java.lang.String r0 = "wds_anim_hide_number_android.json"
            java.io.InputStream r1 = r1.open(r0)
            X.AnonymousClass00C.A08(r1)
            java.nio.charset.Charset r0 = X.AnonymousClass0S4.A05
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r1, r0)
            r1 = 8192(0x2000, float:1.14794E-41)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 != 0) goto L_0x0176
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r3, r1)
            r3 = r0
            goto L_0x0176
        L_0x00fd:
            r0 = 0
            goto L_0x004a
        L_0x0100:
            r0 = 0
            goto L_0x003c
        L_0x0103:
            com.whatsapp.WaTextView r1 = r9.A04
            if (r1 == 0) goto L_0x0112
            X.0wQ r0 = r9.A01
            if (r0 == 0) goto L_0x01b3
            java.lang.String r0 = r0.A0C()
            r1.setText(r0)
        L_0x0112:
            com.whatsapp.WaTextView r1 = r9.A05
            if (r1 == 0) goto L_0x011c
            r0 = 2131893109(0x7f121b75, float:1.9420985E38)
            r1.setText(r0)
        L_0x011c:
            android.content.Context r4 = r9.A1D()
            if (r4 == 0) goto L_0x00b3
            com.whatsapp.ListItemWithLeftIcon r1 = r9.A00
            if (r1 == 0) goto L_0x012c
            r0 = 2131893103(0x7f121b6f, float:1.9420973E38)
            X.AnonymousClass22V.A01(r4, r1, r0)
        L_0x012c:
            com.whatsapp.ListItemWithLeftIcon r1 = r9.A00
            if (r1 == 0) goto L_0x013a
            r0 = 2131896913(0x7f122a51, float:1.94287E38)
            java.lang.String r0 = r4.getString(r0)
            r1.setDescription((java.lang.CharSequence) r0)
        L_0x013a:
            com.whatsapp.ListItemWithLeftIcon r1 = r9.A01
            if (r1 == 0) goto L_0x0144
            r0 = 2131893106(0x7f121b72, float:1.942098E38)
            X.AnonymousClass22V.A01(r4, r1, r0)
        L_0x0144:
            com.whatsapp.ListItemWithLeftIcon r1 = r9.A01
            if (r1 == 0) goto L_0x0152
            r0 = 2131896914(0x7f122a52, float:1.9428703E38)
            java.lang.String r0 = r4.getString(r0)
            r1.setDescription((java.lang.CharSequence) r0)
        L_0x0152:
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A07
            if (r1 == 0) goto L_0x015c
            r0 = 2131886212(0x7f120084, float:1.9406996E38)
            X.C36331k8.A0q(r4, r1, r0)
        L_0x015c:
            com.whatsapp.ListItemWithLeftIcon r1 = r9.A02
            if (r1 == 0) goto L_0x0166
            r0 = 2131896916(0x7f122a54, float:1.9428707E38)
            X.AnonymousClass22V.A01(r4, r1, r0)
        L_0x0166:
            com.whatsapp.ListItemWithLeftIcon r1 = r9.A02
            if (r1 == 0) goto L_0x00b3
            r0 = 2131896915(0x7f122a53, float:1.9428705E38)
            java.lang.String r0 = r4.getString(r0)
            r1.setDescription((java.lang.CharSequence) r0)
            goto L_0x00b3
        L_0x0176:
            java.lang.String r1 = X.C05610Qj.A00(r3)     // Catch:{ all -> 0x0196 }
            java.lang.String r0 = "+34•••••••89"
            java.lang.String r1 = X.AnonymousClass098.A05(r1, r0, r5, r2)     // Catch:{ all -> 0x0196 }
            r3.close()
            X.AYU r0 = new X.AYU
            r0.<init>(r1)
            X.6TF r1 = new X.6TF
            r1.<init>(r0, r2)
            X.9xw r0 = new X.9xw
            r0.<init>(r4, r9)
            r1.A02(r0)
            return
        L_0x0196:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0198 }
        L_0x0198:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x019d:
            java.lang.String r0 = "meManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01a4:
            return
        L_0x01a5:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01ac:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01b3:
            java.lang.String r0 = "meManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInNewsletterBottomSheet.A1S(android.os.Bundle, android.view.View):void");
    }

    public void onClick(View view) {
        AnonymousClass00C.A0D(view, 0);
        int id = view.getId();
        if (id != R.id.pnh_primary_button) {
            if (id == R.id.pnh_secondary_button) {
                C20380xT r1 = this.A02;
                if (r1 != null) {
                    Intent A0D = C36341k9.A0D(r1, "1318001139066835");
                    C24801Dv r12 = this.A00;
                    if (r12 != null) {
                        r12.A06(A0i(), A0D);
                    } else {
                        throw C36331k8.A0d("activityUtils");
                    }
                } else {
                    throw C36331k8.A0d("faqLinkFactory");
                }
            } else {
                return;
            }
        }
        A1c();
    }

    public static void A05(AnonymousClass22V r4, int i) {
        if (r4 != null) {
            r4.setIcon(i);
            r4.setIconColor(AnonymousClass00F.A00(r4.getContext(), C224514j.A00(r4.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)));
        }
    }
}
