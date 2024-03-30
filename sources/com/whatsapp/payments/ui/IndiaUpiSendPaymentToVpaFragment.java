package com.whatsapp.payments.ui;

import X.AE0;
import X.AEA;
import X.AF7;
import X.AnonymousClass000;
import X.AnonymousClass00F;
import X.AnonymousClass01I;
import X.AnonymousClass16T;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1N2;
import X.AnonymousClass5GM;
import X.AnonymousClass8gL;
import X.B5A;
import X.B7U;
import X.BA9;
import X.C012005e;
import X.C135086c7;
import X.C146356vT;
import X.C165577te;
import X.C165607th;
import X.C165617ti;
import X.C167787yo;
import X.C183588r2;
import X.C18740tg;
import X.C18820ts;
import X.C195029Se;
import X.C196129Xv;
import X.C197639c2;
import X.C19770wU;
import X.C199499fP;
import X.C199729fr;
import X.C200169gl;
import X.C202269lR;
import X.C202349ld;
import X.C206719tr;
import X.C20810yC;
import X.C23135B6t;
import X.C23153B7n;
import X.C24611Dc;
import X.C24881Ed;
import X.C29121Vk;
import X.C29131Vl;
import X.C29221Vu;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C64073Mn;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.LinkedHashSet;

public class IndiaUpiSendPaymentToVpaFragment extends Hilt_IndiaUpiSendPaymentToVpaFragment {
    public EditText A00;
    public ProgressBar A01;
    public TextView A02;
    public AnonymousClass17Y A03;
    public C18820ts A04;
    public C24881Ed A05;
    public AnonymousClass16T A06;
    public C20810yC A07;
    public AnonymousClass19A A08;
    public C199499fP A09;
    public C196129Xv A0A;
    public AEA A0B;
    public C202269lR A0C;
    public AE0 A0D;
    public C29221Vu A0E;
    public C29121Vk A0F;
    public AnonymousClass8gL A0G;
    public AF7 A0H;
    public C195029Se A0I;
    public C200169gl A0J;
    public AnonymousClass5GM A0K;
    public C29131Vl A0L;
    public AnonymousClass1N2 A0M;
    public C19770wU A0N;
    public WDSButton A0O;
    public String A0P;
    public boolean A0Q;
    public C135086c7 A0R;
    public C167787yo A0S;
    public WDSButton A0T;
    public final C24611Dc A0U = C165607th.A0a("IndiaUpiSendPaymentToVpaDialogFragment");

    public static void A00(UserJid userJid, C135086c7 r9, IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment) {
        C195029Se r1 = indiaUpiSendPaymentToVpaFragment.A0I;
        if (r1 != null) {
            PaymentBottomSheet paymentBottomSheet = r1.A01;
            if (paymentBottomSheet != null) {
                paymentBottomSheet.A1b();
            }
            r1.A06.A00(r1.A02, new C23153B7n(r9, r1, 0), userJid, r9, false, false);
        }
    }

    public static void A05(IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment) {
        int i;
        int length;
        String lowerCase = C36331k8.A0f(indiaUpiSendPaymentToVpaFragment.A00).toLowerCase(C36401kF.A0x(indiaUpiSendPaymentToVpaFragment.A04));
        if (!C36361kB.A1Z(lowerCase, C64073Mn.A00)) {
            if (C197639c2.A00(lowerCase)) {
                indiaUpiSendPaymentToVpaFragment.A0R = C165577te.A0T(lowerCase, "upiAlias");
                String A002 = AE0.A00(indiaUpiSendPaymentToVpaFragment.A0D);
                if (!C202349ld.A02(indiaUpiSendPaymentToVpaFragment.A0R) && C165577te.A0k(indiaUpiSendPaymentToVpaFragment.A0R).equalsIgnoreCase(A002)) {
                    i = R.string.f12nameremoved;
                } else if (indiaUpiSendPaymentToVpaFragment.A0A.A03(indiaUpiSendPaymentToVpaFragment.A0R)) {
                    A00((UserJid) null, indiaUpiSendPaymentToVpaFragment.A0R, indiaUpiSendPaymentToVpaFragment);
                    return;
                } else {
                    indiaUpiSendPaymentToVpaFragment.A0S.A0S(indiaUpiSendPaymentToVpaFragment.A0R, (C135086c7) null);
                }
            } else {
                i = R.string.f12nameremoved;
            }
            A06(indiaUpiSendPaymentToVpaFragment, new C199729fr(i));
            return;
        } else if (TextUtils.isEmpty(lowerCase) || (length = lowerCase.length()) < 8 || length > 10) {
            i = R.string.f12nameremoved;
            A06(indiaUpiSendPaymentToVpaFragment, new C199729fr(i));
            return;
        } else {
            C200169gl r0 = indiaUpiSendPaymentToVpaFragment.A0J;
            LinkedHashSet A17 = C36441kJ.A17();
            for (C206719tr r02 : r0.A00) {
                A17.add(C135086c7.A00(r02.A00));
            }
            if (A17.contains(lowerCase)) {
                i = R.string.f12nameremoved;
                A06(indiaUpiSendPaymentToVpaFragment, new C199729fr(i));
                return;
            }
            indiaUpiSendPaymentToVpaFragment.A0S.A0S((C135086c7) null, C165577te.A0T(lowerCase, "upiAlias"));
        }
        indiaUpiSendPaymentToVpaFragment.A0H.BOm(C36361kB.A0i(), C36371kC.A0p(), "enter_user_payment_id", indiaUpiSendPaymentToVpaFragment.A0P);
    }

    public static void A06(IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment, C199729fr r6) {
        C24611Dc r2 = indiaUpiSendPaymentToVpaFragment.A0U;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("showErrorText: ");
        C165577te.A1D(r2, A0u, r6.A00);
        indiaUpiSendPaymentToVpaFragment.A02.setVisibility(0);
        indiaUpiSendPaymentToVpaFragment.A02.setText(r6.A01(indiaUpiSendPaymentToVpaFragment.A0a()));
        AnonymousClass01I A0h = indiaUpiSendPaymentToVpaFragment.A0h();
        if (A0h != null) {
            C012005e.A0F(AnonymousClass00F.A04(A0h, R.color.f6nameremoved), indiaUpiSendPaymentToVpaFragment.A00);
        }
        indiaUpiSendPaymentToVpaFragment.A0H.BOm(0, 51, "enter_user_payment_id", indiaUpiSendPaymentToVpaFragment.A0P);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A09.A01(new B5A(this, 4));
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public static void A03(IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment) {
        int i;
        C135086c7 A0P2 = C165617ti.A0P(C146356vT.A00(), String.class, C36331k8.A0f(indiaUpiSendPaymentToVpaFragment.A00).toLowerCase(C36401kF.A0x(indiaUpiSendPaymentToVpaFragment.A04)), "upiHandle");
        indiaUpiSendPaymentToVpaFragment.A0R = A0P2;
        if (!C197639c2.A00((String) A0P2.A00)) {
            i = R.string.f12nameremoved;
        } else {
            String A002 = AE0.A00(indiaUpiSendPaymentToVpaFragment.A0D);
            if (!C202349ld.A02(indiaUpiSendPaymentToVpaFragment.A0R) && C165577te.A0k(indiaUpiSendPaymentToVpaFragment.A0R).equalsIgnoreCase(A002)) {
                i = R.string.f12nameremoved;
            } else if (indiaUpiSendPaymentToVpaFragment.A0A.A03(indiaUpiSendPaymentToVpaFragment.A0R)) {
                A00((UserJid) null, indiaUpiSendPaymentToVpaFragment.A0R, indiaUpiSendPaymentToVpaFragment);
                return;
            } else {
                indiaUpiSendPaymentToVpaFragment.A0S.A0S(indiaUpiSendPaymentToVpaFragment.A0R, (C135086c7) null);
                indiaUpiSendPaymentToVpaFragment.A0H.BOm(C36361kB.A0i(), C36371kC.A0p(), "enter_user_payment_id", indiaUpiSendPaymentToVpaFragment.A0P);
                return;
            }
        }
        A06(indiaUpiSendPaymentToVpaFragment, new C199729fr(i));
    }

    public void A1J() {
        super.A1J();
        this.A0G = null;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A0T = null;
        this.A0O = null;
    }

    public void A1L() {
        super.A1L();
        if (this.A09.A02()) {
            C199499fP.A00(A0h());
        }
    }

    public void A1S(Bundle bundle, View view) {
        EditText editText;
        int i;
        Context A1D = A1D();
        AnonymousClass17Y r2 = this.A03;
        AnonymousClass19A r4 = this.A08;
        C29131Vl r10 = this.A0L;
        this.A0G = new AnonymousClass8gL(A1D, r2, this.A06, r4, this.A0A, this.A0C, this.A0E, this.A0F, this.A0K, r10);
        C167787yo r42 = (C167787yo) C165617ti.A0A(new C23135B6t(this, 1), this).A00(C167787yo.class);
        this.A0S = r42;
        int A072 = r42.A04.A07(2492);
        C36331k8.A1F(new C183588r2(r42.A03, r42, A072), r42.A05);
        this.A00 = (EditText) C012005e.A02(view, R.id.account_id_handle);
        this.A01 = (ProgressBar) C012005e.A02(view, R.id.progress);
        this.A02 = C36391kE.A0O(view, R.id.error_text);
        this.A0T = C36431kI.A0y(view, R.id.close_dialog_button);
        this.A0O = C36431kI.A0y(view, R.id.primary_payment_button);
        TextView A0O2 = C36391kE.A0O(view, R.id.title_text);
        this.A0O.setEnabled(false);
        boolean A002 = C64073Mn.A00(this.A07, this.A0D.A0B());
        this.A0Q = A002;
        if (A002) {
            A0O2.setText(R.string.f12nameremoved);
            editText = this.A00;
            i = R.string.f12nameremoved;
        } else {
            A0O2.setText(R.string.f12nameremoved);
            editText = this.A00;
            i = R.string.f12nameremoved;
        }
        editText.setHint(i);
        this.A00.addTextChangedListener(new B7U(this, 2));
        C36421kH.A13(this.A0T, this, 17);
        C36421kH.A13(this.A0O, this, 18);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            C135086c7 r22 = (C135086c7) bundle2.getParcelable("extra_payment_handle");
            if (!C202349ld.A02(r22)) {
                EditText editText2 = this.A00;
                Object obj = r22.A00;
                C18740tg.A06(obj);
                C165607th.A1A(editText2, obj);
                if (this.A0Q) {
                    A05(this);
                } else {
                    A03(this);
                }
            }
            this.A0P = bundle2.getString("extra_referral_screen");
        }
        this.A0H.BOm(0, (Integer) null, "enter_user_payment_id", this.A0P);
        BA9.A01(A0m(), this.A0S.A00, this, 48);
        BA9.A01(A0m(), this.A0S.A02, this, 47);
        BA9.A01(A0m(), this.A0S.A01, this, 46);
    }
}
