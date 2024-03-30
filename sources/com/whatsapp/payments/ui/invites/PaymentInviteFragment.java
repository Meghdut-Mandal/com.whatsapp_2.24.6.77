package com.whatsapp.payments.ui.invites;

import X.AnonymousClass001;
import X.AnonymousClass02E;
import X.C167527yC;
import X.C176658cT;
import X.C195029Se;
import X.C21130A9q;
import X.C225014r;
import X.C30021Yx;
import X.C36341k9;
import X.C36361kB;
import X.C36441kJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public abstract class PaymentInviteFragment extends Hilt_PaymentInviteFragment {
    public C30021Yx A00;
    public C21130A9q A01;
    public C167527yC A02;
    public String A03;
    public List A04;
    public PaymentIncentiveViewModel A05;

    public static Bundle A05(String str, ArrayList arrayList, boolean z, boolean z2) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("payment_service", 3);
        A07.putParcelableArrayList("user_jids", arrayList);
        A07.putBoolean("requires_sync", z);
        A07.putString("referral_screen", str);
        A07.putBoolean("show_incentive_blurb", z2);
        return A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x006f, code lost:
        if (com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel.A02(r6.A05.A05().BFZ(), r6.A06.A01(), r6) == false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r13, android.view.View r14) {
        /*
            r12 = this;
            r2 = r12
            com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment r2 = (com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment) r2
            X.8cT r1 = new X.8cT
            r1.<init>()
            java.lang.String r0 = "payment_invite_prompt"
            r1.A0b = r0
            java.lang.String r0 = r2.A03
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "chat"
        L_0x0012:
            r1.A0a = r0
            com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment.A00(r1, r2)
            java.lang.Integer r0 = X.C36381kD.A0m()
            r1.A08 = r0
            com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment.A00(r1, r2)
            X.AF7 r0 = r2.A0B
            r0.BOl(r1)
            android.os.Bundle r1 = r12.A0b()
            android.os.Bundle r3 = r12.A0b()
            java.lang.String r0 = "user_jids"
            java.util.ArrayList r0 = r3.getParcelableArrayList(r0)
            X.C18740tg.A06(r0)
            r12.A04 = r0
            java.lang.String r0 = "referral_screen"
            java.lang.String r0 = r3.getString(r0)
            r12.A03 = r0
            X.04H r3 = X.C36381kD.A0P(r12)
            java.lang.Class<com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel> r0 = com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel.class
            X.04R r0 = r3.A00(r0)
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r0 = (com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel) r0
            r12.A05 = r0
            java.lang.String r0 = "show_incentive_blurb"
            boolean r0 = r1.getBoolean(r0)
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0071
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r6 = r12.A05
            X.1YQ r0 = r6.A06
            X.6O3 r5 = r0.A01()
            X.1EU r0 = r6.A05
            X.B66 r0 = r0.A05()
            X.9Yc r0 = r0.BFZ()
            boolean r0 = com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel.A02(r0, r5, r6)
            r11 = 1
            if (r0 != 0) goto L_0x0072
        L_0x0071:
            r11 = 0
        L_0x0072:
            X.1Pn r9 = r2.A03
            X.16D r6 = r2.A00
            X.171 r8 = r2.A02
            X.185 r7 = r2.A01
            java.lang.String r10 = r2.A03
            X.8jr r5 = new X.8jr
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.A01 = r5
            X.04H r5 = X.C36381kD.A0P(r12)
            java.lang.Class<X.7yC> r0 = X.C167527yC.class
            X.04R r0 = r5.A00(r0)
            X.7yC r0 = (X.C167527yC) r0
            r12.A02 = r0
            java.lang.String r0 = "payment_service"
            r1.getInt(r0)
            X.A9q r6 = r12.A01
            r0 = 2131432459(0x7f0b140b, float:1.8486676E38)
            r5 = 2131432458(0x7f0b140a, float:1.8486674E38)
            if (r6 == 0) goto L_0x00ab
            android.view.View r0 = r14.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x00f8
            X.C53692rj.A00(r0, r6)
        L_0x00ab:
            java.util.List r0 = r12.A04
            int r0 = r0.size()
            if (r0 != r4) goto L_0x00ea
            java.lang.String r0 = "requires_sync"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x00ea
            X.A9q r1 = r12.A01
            r5 = 0
            X.9HZ r0 = new X.9HZ
            r0.<init>(r4, r5)
            r1.B1n(r0)
            java.util.List r0 = r12.A04
            java.lang.Object r4 = r0.get(r3)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.7yF r1 = r2.A0D
            android.content.Context r3 = r2.A1D()
            X.9Ul r2 = r2.A0A
            X.1Db r0 = r1.A03
            java.lang.Boolean r7 = r0.A05()
            r0 = 1
            X.B7o r6 = new X.B7o
            r6.<init>(r4, r1, r0)
            r2.A00(r3, r4, r5, r6, r7)
        L_0x00e5:
            X.A9q r0 = r12.A01
            r0.A04 = r12
            return
        L_0x00ea:
            X.A9q r3 = r12.A01
            r2 = 2
            java.util.List r1 = r12.A04
            X.9HZ r0 = new X.9HZ
            r0.<init>(r2, r1)
            r3.B1n(r0)
            goto L_0x00e5
        L_0x00f8:
            android.view.View r0 = r14.findViewById(r5)
            r6.BkP(r0)
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.invites.PaymentInviteFragment.A1S(android.os.Bundle, android.view.View):void");
    }

    public void A1a(int i, boolean z) {
        IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = (IndiaUpiPaymentInviteFragment) this;
        C176658cT r1 = new C176658cT();
        r1.A0b = "payment_invite_prompt";
        String str = indiaUpiPaymentInviteFragment.A03;
        if (str == null) {
            str = "chat";
        }
        r1.A0a = str;
        IndiaUpiPaymentInviteFragment.A00(r1, indiaUpiPaymentInviteFragment);
        int i2 = 1;
        C176658cT.A02(r1, 1);
        if (z) {
            i2 = 54;
        }
        r1.A07 = Integer.valueOf(i2);
        r1.A0I = C36441kJ.A0y(i);
        indiaUpiPaymentInviteFragment.A0B.BOl(r1);
    }

    public void A1b(boolean z) {
        IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = (IndiaUpiPaymentInviteFragment) this;
        AnonymousClass02E r1 = indiaUpiPaymentInviteFragment.A0I;
        if (r1 instanceof PaymentBottomSheet) {
            String str = indiaUpiPaymentInviteFragment.A03;
            new C195029Se(indiaUpiPaymentInviteFragment.A0i(), (C225014r) indiaUpiPaymentInviteFragment.A0i(), indiaUpiPaymentInviteFragment.A06, indiaUpiPaymentInviteFragment.A08, str, z).A00((PaymentBottomSheet) r1);
        }
    }

    public void A1Z() {
        Log.i("dismiss()");
        C36341k9.A16(this.A02.A00, 3);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }
}
