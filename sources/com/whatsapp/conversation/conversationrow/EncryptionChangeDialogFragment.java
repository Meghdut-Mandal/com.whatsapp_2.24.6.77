package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass185;
import X.AnonymousClass1CF;
import X.AnonymousClass1H2;
import X.AnonymousClass2QH;
import X.C19730wQ;
import X.C20380xT;
import X.C20500xf;
import X.C21010yW;
import X.C235618y;
import X.C24801Dv;
import android.content.DialogInterface;

public class EncryptionChangeDialogFragment extends Hilt_EncryptionChangeDialogFragment {
    public C24801Dv A00;
    public C19730wQ A01;
    public AnonymousClass16D A02;
    public AnonymousClass185 A03;
    public AnonymousClass171 A04;
    public C235618y A05;
    public AnonymousClass17X A06;
    public AnonymousClass1H2 A07;
    public C20500xf A08;
    public C21010yW A09;
    public AnonymousClass2QH A0A;
    public AnonymousClass1CF A0B;
    public C20380xT A0C;

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass2QH r1 = this.A0A;
        if (r1 != null) {
            r1.A01 = 0;
            this.A09.Bly(r1);
        }
        super.onCancel(dialogInterface);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c6, code lost:
        if (X.C36391kE.A1X(r10.A02) == false) goto L_0x01c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1a(android.os.Bundle r11) {
        /*
            r10 = this;
            android.os.Bundle r3 = r10.A0b()
            java.lang.String r0 = "jid"
            java.lang.String r2 = r3.getString(r0)
            java.lang.String r1 = "provider_category"
            r0 = 0
            int r9 = r3.getInt(r1, r0)
            java.lang.String r1 = "business_state_id"
            r0 = -1
            int r7 = r3.getInt(r1, r0)
            X.11F r6 = X.C36421kH.A0N(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid jid="
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            X.C18740tg.A07(r6, r0)
            r8 = -1
            boolean r0 = X.AnonymousClass000.A1S(r7, r8)
            r5 = 1
            if (r0 == 0) goto L_0x01b0
            X.16D r0 = r10.A02
            X.141 r2 = r0.A0D(r6)
            if (r9 == 0) goto L_0x010a
            X.0xf r4 = r10.A08
            android.content.Context r3 = r10.A0a()
            X.16D r0 = r10.A02
            X.171 r1 = r10.A04
            X.141 r0 = r0.A0D(r6)
            java.lang.String r2 = r1.A0R(r0, r8, r5)
            switch(r9) {
                case 1: goto L_0x0101;
                case 2: goto L_0x00f4;
                case 3: goto L_0x00f4;
                case 4: goto L_0x0101;
                case 5: goto L_0x00f4;
                case 6: goto L_0x00f4;
                default: goto L_0x004e;
            }
        L_0x004e:
            r0 = 2131889204(0x7f120c34, float:1.9413065E38)
            java.lang.String r3 = r3.getString(r0)
        L_0x0055:
            X.0xT r2 = r10.A0C
            java.lang.String r1 = "security-and-privacy"
            java.lang.String r0 = "end-to-end-encryption-for-business-messages"
            android.net.Uri r0 = r2.A04(r1, r0)
        L_0x005f:
            X.00I r2 = X.C36441kJ.A0W(r3, r0)
        L_0x0063:
            java.lang.Object r8 = r2.A00
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r4 = r2.A01
            X.1qm r3 = X.AnonymousClass3LW.A04(r10)
            r0 = 16
            if (r7 == r0) goto L_0x00a1
            r0 = 17
            if (r7 == r0) goto L_0x00a1
            android.content.Context r1 = r10.A0a()
            X.1H2 r0 = r10.A07
            java.lang.CharSequence r0 = X.AnonymousClass3UG.A05(r1, r0, r8)
            r3.A0Z(r0)
        L_0x0082:
            r3.A0a(r5)
            r0 = 10
            X.4Xp r1 = new X.4Xp
            r1.<init>(r4, r10, r0)
            r0 = 2131896681(0x7f122969, float:1.942823E38)
            r3.A0g(r1, r0)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 32
            X.4XM r0 = new X.4XM
            r0.<init>(r10, r1)
            X.0FM r0 = X.C36431kI.A0R(r0, r3, r2)
            return r0
        L_0x00a1:
            android.content.Context r0 = r10.A0a()
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r0)
            com.whatsapp.jid.UserJid r6 = X.C36401kF.A0b(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00f2
            if (r6 == 0) goto L_0x00f2
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            X.4VV r1 = new X.4VV
            r1.<init>(r10, r6, r5)
            java.lang.String r0 = "coex-verify-encryption"
            r2.put(r0, r1)
            android.text.SpannableStringBuilder r2 = X.AnonymousClass6YV.A03(r8, r2)
        L_0x00c8:
            android.content.Context r1 = r10.A0a()
            X.1H2 r0 = r10.A07
            java.lang.CharSequence r0 = X.AnonymousClass3UG.A05(r1, r0, r2)
            r7.setText(r0)
            X.C36391kE.A1J(r7)
            r1 = 1103101952(0x41c00000, float:24.0)
            android.content.res.Resources r0 = X.C36341k9.A0G(r10)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r5, r1, r0)
            int r0 = (int) r0
            r7.setPadding(r0, r0, r0, r0)
            r0 = 5
            r7.setTextAlignment(r0)
            r3.setView(r7)
            goto L_0x0082
        L_0x00f2:
            r2 = 0
            goto L_0x00c8
        L_0x00f4:
            boolean r1 = X.AnonymousClass3RB.A00(r4, r6)
            r0 = 2131886934(0x7f120356, float:1.940846E38)
            if (r1 == 0) goto L_0x0104
            r0 = 2131888275(0x7f120893, float:1.941118E38)
            goto L_0x0104
        L_0x0101:
            r0 = 2131886932(0x7f120354, float:1.9408457E38)
        L_0x0104:
            java.lang.String r3 = X.C36351kA.A0w(r3, r2, r5, r0)
            goto L_0x0055
        L_0x010a:
            X.1CF r0 = r10.A0B
            boolean r0 = r0.A02(r6)
            if (r0 == 0) goto L_0x0123
            r0 = 2131888277(0x7f120895, float:1.9411185E38)
            java.lang.String r3 = r10.A0n(r0)
            X.0xT r1 = r10.A0C
            java.lang.String r0 = "about-safely-communicating-with-whatsapp-support"
        L_0x011d:
            android.net.Uri r0 = r1.A03(r0)
            goto L_0x005f
        L_0x0123:
            X.0yC r0 = r10.A02
            boolean r0 = X.AnonymousClass3RR.A00(r0, r6)
            if (r0 == 0) goto L_0x0140
            android.content.Context r4 = r10.A0a()
            r3 = 2131893230(0x7f121bee, float:1.942123E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r1 = 0
            java.lang.String r0 = "WhatsApp Surveys"
            java.lang.String r3 = X.C36391kE.A0v(r4, r0, r2, r1, r3)
            X.0xT r1 = r10.A0C
            java.lang.String r0 = "https://faq.whatsapp.com/general/about-whatsapp-surveys"
            goto L_0x011d
        L_0x0140:
            X.0xf r0 = r10.A08
            boolean r0 = X.AnonymousClass3M3.A01(r0, r6)
            if (r0 == 0) goto L_0x0158
            android.content.Context r1 = r10.A0a()
            r0 = 2131896094(0x7f12271e, float:1.942704E38)
            java.lang.String r3 = X.C44122Lf.A02(r1, r0)
            X.0xT r1 = r10.A0C
            java.lang.String r0 = "https://faq.whatsapp.com/general/chats/about-the-official-whatsapp-chat-account"
            goto L_0x011d
        L_0x0158:
            com.whatsapp.jid.UserJid r1 = X.C36401kF.A0b(r6)
            if (r1 == 0) goto L_0x01ae
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x01ae
            X.185 r0 = r10.A03
            boolean r2 = r0.A04(r1)
        L_0x016a:
            X.0xf r0 = r10.A08
            boolean r1 = X.AnonymousClass3RB.A00(r0, r6)
            r0 = 2131889204(0x7f120c34, float:1.9413065E38)
            if (r1 == 0) goto L_0x0178
            r0 = 2131896062(0x7f1226fe, float:1.9426975E38)
        L_0x0178:
            java.lang.String r3 = r10.A0n(r0)
            if (r2 == 0) goto L_0x018c
            X.0xT r1 = r10.A0C
            java.lang.String r0 = "26000103"
            java.lang.String r0 = r1.A05(r0)
        L_0x0186:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x005f
        L_0x018c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "https://www.whatsapp.com/security?lg="
            r1.append(r0)
            X.0ts r0 = r10.A01
            java.lang.String r0 = r0.A06()
            r1.append(r0)
            java.lang.String r0 = "&lc="
            r1.append(r0)
            X.0ts r0 = r10.A01
            java.lang.String r0 = r0.A05()
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            goto L_0x0186
        L_0x01ae:
            r2 = 0
            goto L_0x016a
        L_0x01b0:
            X.2QH r0 = new X.2QH
            r0.<init>()
            r10.A0A = r0
            X.0wQ r0 = r10.A01
            boolean r0 = r0.A0M(r6)
            if (r0 == 0) goto L_0x01c8
            X.0yC r0 = r10.A02
            boolean r0 = X.C36391kE.A1X(r0)
            r2 = 1
            if (r0 != 0) goto L_0x01c9
        L_0x01c8:
            r2 = 0
        L_0x01c9:
            X.1CF r0 = r10.A0B
            boolean r0 = r0.A02(r6)
            if (r0 == 0) goto L_0x0220
            r0 = 2131893229(0x7f121bed, float:1.9421229E38)
            java.lang.String r2 = r10.A0n(r0)
            X.0xT r1 = r10.A0C
            java.lang.String r0 = "about-safely-communicating-with-whatsapp-support"
            android.net.Uri r0 = r1.A03(r0)
        L_0x01e0:
            X.00I r2 = X.C36441kJ.A0W(r2, r0)
            X.2QH r3 = r10.A0A
            boolean r0 = r6 instanceof X.AnonymousClass144
            if (r0 == 0) goto L_0x020e
            boolean r0 = X.AnonymousClass143.A0G(r6)
            if (r0 == 0) goto L_0x020e
            X.17X r0 = r10.A06
            X.AnonymousClass2QH.A00(r0, r3, r6)
            r0 = 2
        L_0x01f6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A00 = r0
        L_0x01fc:
            X.2QH r1 = r10.A0A
            switch(r7) {
                case 5: goto L_0x020a;
                case 6: goto L_0x020a;
                case 7: goto L_0x020c;
                case 8: goto L_0x020c;
                case 9: goto L_0x020a;
                case 10: goto L_0x020a;
                case 11: goto L_0x0201;
                case 12: goto L_0x0201;
                case 13: goto L_0x0201;
                case 14: goto L_0x0201;
                case 15: goto L_0x020a;
                case 16: goto L_0x020a;
                case 17: goto L_0x020a;
                default: goto L_0x0201;
            }
        L_0x0201:
            r0 = 0
        L_0x0202:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            goto L_0x0063
        L_0x020a:
            r0 = 2
            goto L_0x0202
        L_0x020c:
            r0 = 1
            goto L_0x0202
        L_0x020e:
            boolean r0 = r6 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x01fc
            X.16D r1 = r10.A02
            r0 = r6
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A0q(r0)
            boolean r0 = X.C36431kI.A1Q(r0)
            goto L_0x01f6
        L_0x0220:
            X.0yC r0 = r10.A02
            boolean r0 = X.AnonymousClass3RR.A00(r0, r6)
            if (r0 == 0) goto L_0x023f
            android.content.Context r4 = r10.A0a()
            r3 = 2131893230(0x7f121bee, float:1.942123E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r1 = 0
            java.lang.String r0 = "WhatsApp Surveys"
            java.lang.String r2 = X.C36391kE.A0v(r4, r0, r2, r1, r3)
            java.lang.String r0 = "https://faq.whatsapp.com/general/about-whatsapp-surveys"
        L_0x023a:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x01e0
        L_0x023f:
            X.0xf r0 = r10.A08
            boolean r0 = X.AnonymousClass3M3.A01(r0, r6)
            android.content.Context r1 = r10.A0a()
            if (r0 == 0) goto L_0x0255
            r0 = 2131896094(0x7f12271e, float:1.942704E38)
            java.lang.String r2 = X.C44122Lf.A02(r1, r0)
            java.lang.String r0 = "https://faq.whatsapp.com/general/chats/about-the-official-whatsapp-chat-account"
            goto L_0x023a
        L_0x0255:
            switch(r7) {
                case 0: goto L_0x025e;
                case 1: goto L_0x025e;
                case 2: goto L_0x025e;
                case 3: goto L_0x025e;
                case 4: goto L_0x025e;
                case 5: goto L_0x0267;
                case 6: goto L_0x0267;
                case 7: goto L_0x026b;
                case 8: goto L_0x026b;
                case 9: goto L_0x0267;
                case 10: goto L_0x0267;
                case 11: goto L_0x0258;
                case 12: goto L_0x0258;
                case 13: goto L_0x0258;
                case 14: goto L_0x0258;
                case 15: goto L_0x0267;
                case 16: goto L_0x026f;
                case 17: goto L_0x0273;
                default: goto L_0x0258;
            }
        L_0x0258:
            r2 = 0
        L_0x0259:
            java.lang.String r0 = X.AnonymousClass3U1.A01(r7)
            goto L_0x023a
        L_0x025e:
            r0 = 2131893227(0x7f121beb, float:1.9421225E38)
            if (r2 == 0) goto L_0x0276
            r0 = 2131891081(0x7f121389, float:1.9416872E38)
            goto L_0x0276
        L_0x0267:
            r0 = 2131893228(0x7f121bec, float:1.9421227E38)
            goto L_0x0276
        L_0x026b:
            r0 = 2131893223(0x7f121be7, float:1.9421216E38)
            goto L_0x0276
        L_0x026f:
            r0 = 2131893225(0x7f121be9, float:1.942122E38)
            goto L_0x0276
        L_0x0273:
            r0 = 2131893226(0x7f121bea, float:1.9421223E38)
        L_0x0276:
            java.lang.String r2 = r1.getString(r0)
            goto L_0x0259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment.A1a(android.os.Bundle):android.app.Dialog");
    }
}
