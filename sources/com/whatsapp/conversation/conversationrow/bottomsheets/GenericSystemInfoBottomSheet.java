package com.whatsapp.conversation.conversationrow.bottomsheets;

import X.AnonymousClass00C;
import X.AnonymousClass190;
import X.AnonymousClass3NG;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public abstract class GenericSystemInfoBottomSheet extends Hilt_GenericSystemInfoBottomSheet {
    public C24801Dv A00;
    public C21060yb A01;
    public C20810yC A02;
    public AnonymousClass190 A03;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0102, code lost:
        if (r2 == 4) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019f, code lost:
        if (r7 == false) goto L_0x01a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r12, android.view.View r13) {
        /*
            r11 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            super.A1S(r12, r13)
            r0 = 2131433729(0x7f0b1901, float:1.8489252E38)
            android.view.View r1 = X.C36361kB.A0G(r13, r0)
            r0 = 2131433727(0x7f0b18ff, float:1.8489248E38)
            android.widget.TextView r5 = X.C36341k9.A0M(r13, r0)
            r0 = 2131433726(0x7f0b18fe, float:1.8489246E38)
            com.whatsapp.WaTextView r4 = X.C36341k9.A0Q(r13, r0)
            r0 = 2131433737(0x7f0b1909, float:1.8489268E38)
            android.view.View r6 = X.C36361kB.A0G(r13, r0)
            r0 = 6
            X.C66963Xz.A00(r1, r11, r0)
            r9 = r11
            boolean r3 = r11 instanceof com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet
            if (r3 == 0) goto L_0x01ef
            com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet r9 = (com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet) r9
            X.13q r1 = X.AnonymousClass11F.A00
            java.lang.String r0 = "jid"
            X.00T r0 = X.AnonymousClass3TE.A00(r9, r0)
            java.lang.String r0 = X.C36431kI.A1E(r0)
            X.11F r0 = r1.A02(r0)
            r9.A04 = r0
            java.lang.String r1 = "business_state_id"
            r0 = -1
            X.00T r0 = X.AnonymousClass3TE.A02(r9, r1, r0)
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A06 = r0
            X.1CF r1 = r9.A03
            if (r1 == 0) goto L_0x02cc
            X.11F r0 = r9.A04
            boolean r0 = r1.A02(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x012d
            r0 = 2131893229(0x7f121bed, float:1.9421229E38)
            java.lang.String r7 = r9.A0n(r0)
            X.0xT r2 = r9.A05
            if (r2 == 0) goto L_0x02ad
            java.lang.String r0 = "about-safely-communicating-with-whatsapp-support"
            android.net.Uri r0 = r2.A03(r0)
            X.3Iz r8 = new X.3Iz
            r8.<init>(r0, r1, r7)
        L_0x0073:
            r9 = 0
            if (r8 == 0) goto L_0x012a
            java.lang.CharSequence r1 = r8.A02
        L_0x0078:
            r7 = 0
            X.AnonymousClass00C.A0D(r5, r7)
            if (r1 == 0) goto L_0x0123
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0123
            r5.setVisibility(r7)
            r5.setText(r1)
        L_0x008a:
            if (r8 == 0) goto L_0x008e
            java.lang.CharSequence r9 = r8.A01
        L_0x008e:
            r10 = r11
            if (r3 == 0) goto L_0x00f1
            com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet r10 = (com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet) r10
            X.37z r2 = r10.A01
            if (r2 == 0) goto L_0x029f
            android.content.Context r5 = r10.A0a()
            java.lang.Integer r0 = r10.A06
            if (r0 == 0) goto L_0x00ef
            int r1 = r0.intValue()
            r0 = 16
            if (r1 == r0) goto L_0x00ab
            r0 = 17
            if (r1 != r0) goto L_0x00ef
        L_0x00ab:
            r0 = 1
        L_0x00ac:
            X.4Ad r1 = new X.4Ad
            r1.<init>(r10)
            if (r9 == 0) goto L_0x0121
            if (r0 == 0) goto L_0x00c7
            X.1e1 r3 = r2.A03
            java.lang.String r2 = r9.toString()
            r0 = 27
            X.3v4 r1 = X.C80233v4.A00(r1, r0)
            java.lang.String r0 = "coex-verify-encryption"
            android.text.SpannableStringBuilder r9 = r3.A02(r5, r1, r2, r0)
        L_0x00c7:
            X.AnonymousClass00C.A0D(r4, r7)
            if (r9 == 0) goto L_0x00e9
            int r0 = r9.length()
            if (r0 == 0) goto L_0x00e9
            r4.setVisibility(r7)
            r4.setText(r9)
        L_0x00d8:
            X.0yC r1 = r11.A02
            if (r1 == 0) goto L_0x029a
            X.0yb r0 = r11.A01
            if (r0 == 0) goto L_0x0295
            X.C33521fV.A08(r4, r0, r1)
            r0 = 41
            X.AnonymousClass3YF.A00(r6, r11, r8, r0)
            return
        L_0x00e9:
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x00d8
        L_0x00ef:
            r0 = 0
            goto L_0x00ac
        L_0x00f1:
            com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet r10 = (com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet) r10
            X.37z r3 = r10.A03
            if (r3 == 0) goto L_0x02a6
            android.content.Context r5 = r10.A0a()
            int r2 = r10.A01
            r0 = 5
            if (r2 == r0) goto L_0x0104
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L_0x0105
        L_0x0104:
            r0 = 1
        L_0x0105:
            X.4Ac r1 = new X.4Ac
            r1.<init>(r10)
            if (r9 == 0) goto L_0x0121
            if (r0 == 0) goto L_0x00c7
            X.1e1 r3 = r3.A03
            java.lang.String r2 = r9.toString()
            r0 = 27
            X.3v4 r1 = X.C80233v4.A00(r1, r0)
            java.lang.String r0 = "coex-verify-encryption"
            android.text.SpannableStringBuilder r9 = r3.A02(r5, r1, r2, r0)
            goto L_0x00c7
        L_0x0121:
            r9 = 0
            goto L_0x00c7
        L_0x0123:
            r0 = 8
            r5.setVisibility(r0)
            goto L_0x008a
        L_0x012a:
            r1 = r9
            goto L_0x0078
        L_0x012d:
            X.0yC r2 = r9.A02
            if (r2 == 0) goto L_0x02c7
            X.11F r0 = r9.A04
            boolean r0 = X.AnonymousClass3RR.A00(r2, r0)
            if (r0 == 0) goto L_0x0163
            android.content.Context r8 = r9.A0a()
            r7 = 2131893235(0x7f121bf3, float:1.942124E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r1 = 0
            java.lang.String r0 = "WhatsApp Surveys"
            java.lang.String r1 = X.C36391kE.A0v(r8, r0, r2, r1, r7)
            android.content.Context r2 = r9.A0a()
            r0 = 2131893222(0x7f121be6, float:1.9421214E38)
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r2 = "https://faq.whatsapp.com/general/about-whatsapp-surveys"
        L_0x0158:
            android.net.Uri r2 = android.net.Uri.parse(r2)
            X.3Iz r8 = new X.3Iz
            r8.<init>(r2, r1, r0)
            goto L_0x0073
        L_0x0163:
            X.0xf r2 = r9.A02
            if (r2 == 0) goto L_0x02c0
            X.11F r0 = r9.A04
            boolean r0 = X.AnonymousClass3M3.A01(r2, r0)
            if (r0 == 0) goto L_0x017d
            android.content.Context r2 = r9.A0a()
            r0 = 2131896094(0x7f12271e, float:1.942704E38)
            java.lang.String r0 = X.C44122Lf.A02(r2, r0)
            java.lang.String r2 = "https://faq.whatsapp.com/general/chats/about-the-official-whatsapp-chat-account"
            goto L_0x0158
        L_0x017d:
            java.lang.Integer r2 = r9.A06
            r0 = 0
            if (r2 == 0) goto L_0x01ec
            int r10 = r2.intValue()
            android.content.Context r8 = r9.A0a()
            X.0wQ r7 = r9.A00
            if (r7 == 0) goto L_0x02b9
            X.11F r2 = r9.A04
            boolean r2 = r7.A0M(r2)
            if (r2 == 0) goto L_0x01a1
            X.0yC r2 = r9.A02
            if (r2 == 0) goto L_0x02b4
            boolean r7 = X.C36391kE.A1X(r2)
            r2 = 1
            if (r7 != 0) goto L_0x01a2
        L_0x01a1:
            r2 = 0
        L_0x01a2:
            switch(r10) {
                case 0: goto L_0x01ab;
                case 1: goto L_0x01ab;
                case 2: goto L_0x01ab;
                case 3: goto L_0x01ab;
                case 4: goto L_0x01ab;
                case 5: goto L_0x01bb;
                case 6: goto L_0x01bb;
                case 7: goto L_0x01bb;
                case 8: goto L_0x01bb;
                case 9: goto L_0x01bb;
                case 10: goto L_0x01bb;
                case 11: goto L_0x01a5;
                case 12: goto L_0x01a5;
                case 13: goto L_0x01a5;
                case 14: goto L_0x01a5;
                case 15: goto L_0x01bb;
                case 16: goto L_0x01c6;
                case 17: goto L_0x01d1;
                default: goto L_0x01a5;
            }
        L_0x01a5:
            r1 = r0
        L_0x01a6:
            java.lang.String r2 = X.AnonymousClass3U1.A01(r10)
            goto L_0x0158
        L_0x01ab:
            r0 = 2131891081(0x7f121389, float:1.9416872E38)
            if (r2 != 0) goto L_0x01db
            r0 = 2131893233(0x7f121bf1, float:1.9421237E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131893220(0x7f121be4, float:1.942121E38)
            goto L_0x01db
        L_0x01bb:
            r0 = 2131893234(0x7f121bf2, float:1.9421239E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131893221(0x7f121be5, float:1.9421212E38)
            goto L_0x01db
        L_0x01c6:
            r0 = 2131893231(0x7f121bef, float:1.9421233E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131893218(0x7f121be2, float:1.9421206E38)
            goto L_0x01db
        L_0x01d1:
            r0 = 2131893232(0x7f121bf0, float:1.9421235E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131893219(0x7f121be3, float:1.9421208E38)
        L_0x01db:
            java.lang.String r0 = r8.getString(r0)
            X.00I r0 = X.C36441kJ.A0W(r1, r0)
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.A01
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x01a6
        L_0x01ec:
            r8 = r0
            goto L_0x0073
        L_0x01ef:
            com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet r9 = (com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet) r9
            X.13q r1 = X.AnonymousClass11F.A00
            java.lang.String r0 = "jid"
            X.00T r0 = X.AnonymousClass3TE.A00(r9, r0)
            java.lang.String r0 = X.C36431kI.A1E(r0)
            X.11F r0 = r1.A02(r0)
            r9.A07 = r0
            java.lang.String r0 = "arg_transition_id"
            r1 = -1
            X.00T r0 = X.AnonymousClass3TE.A02(r9, r0, r1)
            int r0 = X.C36331k8.A02(r0)
            r9.A01 = r0
            java.lang.String r0 = "arg_message_action"
            X.00T r0 = X.AnonymousClass3TE.A02(r9, r0, r1)
            int r0 = X.C36331k8.A02(r0)
            r9.A00 = r0
            r7 = 0
            r8 = 69
            if (r0 != r8) goto L_0x0293
            android.content.res.Resources r10 = X.C36341k9.A0G(r9)
            int r2 = r9.A01
            r0 = 1
            r1 = 2131893233(0x7f121bf1, float:1.9421237E38)
            if (r2 == r0) goto L_0x028e
            r0 = 2
            if (r2 == r0) goto L_0x0287
            r0 = 3
            if (r2 == r0) goto L_0x0287
            r0 = 4
            r1 = 2131893232(0x7f121bf0, float:1.9421235E38)
            if (r2 == r0) goto L_0x028e
            r0 = 5
            if (r2 == r0) goto L_0x028b
            r2 = 0
        L_0x023d:
            int r0 = r9.A00
            if (r0 != r8) goto L_0x025d
            android.content.res.Resources r8 = X.C36341k9.A0G(r9)
            int r7 = r9.A01
            r0 = 1
            r1 = 2131893220(0x7f121be4, float:1.942121E38)
            if (r7 == r0) goto L_0x0282
            r0 = 2
            if (r7 == r0) goto L_0x027b
            r0 = 3
            if (r7 == r0) goto L_0x027b
            r0 = 4
            r1 = 2131893219(0x7f121be3, float:1.9421208E38)
            if (r7 == r0) goto L_0x0282
            r0 = 5
            if (r7 == r0) goto L_0x027f
            r7 = 0
        L_0x025d:
            int r1 = r9.A01
            r0 = 1
            if (r1 == r0) goto L_0x0278
            r0 = 4
            if (r1 == r0) goto L_0x0275
            r0 = 5
            if (r1 == r0) goto L_0x0275
            java.lang.String r0 = "https://faq.whatsapp.com/1148840052398648"
        L_0x026a:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            X.3Iz r8 = new X.3Iz
            r8.<init>(r0, r2, r7)
            goto L_0x0073
        L_0x0275:
            java.lang.String r0 = "https://faq.whatsapp.com/1520500555178162"
            goto L_0x026a
        L_0x0278:
            java.lang.String r0 = "https://www.whatsapp.com/security"
            goto L_0x026a
        L_0x027b:
            r1 = 2131893221(0x7f121be5, float:1.9421212E38)
            goto L_0x0282
        L_0x027f:
            r1 = 2131893218(0x7f121be2, float:1.9421206E38)
        L_0x0282:
            java.lang.String r7 = r8.getString(r1)
            goto L_0x025d
        L_0x0287:
            r1 = 2131893234(0x7f121bf2, float:1.9421239E38)
            goto L_0x028e
        L_0x028b:
            r1 = 2131893231(0x7f121bef, float:1.9421233E38)
        L_0x028e:
            java.lang.String r2 = r10.getString(r1)
            goto L_0x023d
        L_0x0293:
            r2 = r7
            goto L_0x023d
        L_0x0295:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x029a:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x029f:
            java.lang.String r0 = "systemInfoDialogHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02a6:
            java.lang.String r0 = "systemInfoDialogHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02ad:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02b4:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x02b9:
            java.lang.String r0 = "meManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02c0:
            java.lang.String r0 = "infraAbProps"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02c7:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x02cc:
            java.lang.String r0 = "supportGatingUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.bottomsheets.GenericSystemInfoBottomSheet.A1S(android.os.Bundle, android.view.View):void");
    }

    public void A1k(AnonymousClass3NG r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.A00.A06 = true;
    }
}
