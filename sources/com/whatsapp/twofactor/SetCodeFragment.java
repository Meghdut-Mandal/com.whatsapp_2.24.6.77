package com.whatsapp.twofactor;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02E;
import X.AnonymousClass1DY;
import X.C19420v0;
import X.C19730wQ;
import X.C20810yC;
import X.C29011Uz;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;

public class SetCodeFragment extends Hilt_SetCodeFragment {
    public int A00;
    public TextView A01;
    public CodeInputField A02;
    public C19730wQ A03;
    public C19420v0 A04;
    public AnonymousClass1DY A05;
    public C20810yC A06;
    public TwoFactorAuthActivity A07;
    public C29011Uz A08;
    public Button A09;

    public static void A00(SetCodeFragment setCodeFragment) {
        TwoFactorAuthActivity twoFactorAuthActivity;
        Bundle bundle;
        AnonymousClass02E r0;
        int i = setCodeFragment.A00;
        boolean z = true;
        if (i == 1) {
            twoFactorAuthActivity = setCodeFragment.A07;
            bundle = AnonymousClass001.A07();
            bundle.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 2);
            r0 = new SetCodeFragment();
        } else if (i == 2) {
            twoFactorAuthActivity = setCodeFragment.A07;
            if (twoFactorAuthActivity.A3l(setCodeFragment)) {
                if (!setCodeFragment.A05.A00() || !setCodeFragment.A06.A0E(5156) || C36371kC.A1U(C36341k9.A0E(setCodeFragment.A04), "settings_verification_email_address_verified")) {
                    z = false;
                }
                C36321k7.A1X("SetCodeFragment/shouldShowAddEmailActivity : ", AnonymousClass000.A0u(), z);
                setCodeFragment.A07.A3k(z);
                return;
            }
            bundle = AnonymousClass001.A07();
            bundle.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
            r0 = new SetEmailFragment();
        } else {
            return;
        }
        r0.A17(bundle);
        twoFactorAuthActivity.A3j(r0, true);
    }

    public static void A03(SetCodeFragment setCodeFragment) {
        String str;
        if (setCodeFragment.A09 != null) {
            boolean z = true;
            if (setCodeFragment.A00 != 1 ? (str = setCodeFragment.A07.A02) == null || !str.contentEquals(setCodeFragment.A02.getCode()) : setCodeFragment.A02.getCode().length() != 6) {
                z = false;
            }
            setCodeFragment.A09.setEnabled(z);
        }
    }

    public static boolean A05(SetCodeFragment setCodeFragment, CharSequence charSequence) {
        C36391kE.A1K(setCodeFragment.A01);
        if (charSequence.length() == 6) {
            int i = setCodeFragment.A00;
            if (i != 1) {
                if (i == 2) {
                    String str = setCodeFragment.A07.A02;
                    if (str == null || !str.contentEquals(setCodeFragment.A02.getCode())) {
                        setCodeFragment.A01.setText(R.string.f12nameremoved);
                    }
                }
                setCodeFragment.A02.requestFocus();
            }
            return true;
        }
        return false;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1J() {
        super.A1J();
        this.A07 = null;
        this.A09 = null;
        this.A02 = null;
        this.A01 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A07.A3l(r4) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1L() {
        /*
            r4 = this;
            super.A1L()
            int r0 = r4.A00
            r3 = 2
            if (r0 != r3) goto L_0x0011
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r4.A07
            boolean r0 = r0.A3l(r4)
            r2 = 1
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            android.widget.Button r1 = r4.A09
            r0 = 2131891541(0x7f121555, float:1.9417805E38)
            if (r2 == 0) goto L_0x001c
            r0 = 2131895134(0x7f12235e, float:1.9425092E38)
        L_0x001c:
            r1.setText(r0)
            android.widget.Button r0 = r4.A09
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            X.0yC r1 = r4.A06
            r0 = 5711(0x164f, float:8.003E-42)
            boolean r1 = r1.A0E(r0)
            r0 = -2
            if (r1 == 0) goto L_0x0031
            r0 = -1
        L_0x0031:
            r2.width = r0
            int r0 = r4.A00
            if (r0 != r3) goto L_0x004b
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r4.A07
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L_0x004b
            com.whatsapp.CodeInputField r0 = r4.A02
            r0.setCode(r1)
            com.whatsapp.CodeInputField r0 = r4.A02
            java.lang.String r0 = r0.getCode()
            A05(r4, r0)
        L_0x004b:
            A03(r4)
            com.whatsapp.CodeInputField r0 = r4.A02
            r0.requestFocus()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetCodeFragment.A1L():void");
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A00 = A0b().getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r14, android.view.View r15) {
        /*
            r13 = this;
            X.01I r0 = r13.A0h()
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = (com.whatsapp.twofactor.TwoFactorAuthActivity) r0
            r13.A07 = r0
            r0 = 2131434448(0x7f0b1bd0, float:1.849071E38)
            android.view.View r1 = r15.findViewById(r0)
            android.widget.Button r1 = (android.widget.Button) r1
            r13.A09 = r1
            r0 = 32
            X.C48772i1.A00(r1, r13, r0)
            r0 = 2131430012(0x7f0b0a7c, float:1.8481713E38)
            android.widget.TextView r0 = X.C36391kE.A0P(r15, r0)
            r13.A01 = r0
            r0 = 2131428871(0x7f0b0607, float:1.8479399E38)
            android.view.View r0 = r15.findViewById(r0)
            com.whatsapp.CodeInputField r0 = (com.whatsapp.CodeInputField) r0
            r13.A02 = r0
            r1 = 2
            X.3M1 r7 = new X.3M1
            r7.<init>(r13, r1)
            r5 = 2131886230(0x7f120096, float:1.9407033E38)
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r12 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r2 = 0
            java.lang.String r9 = X.C36401kF.A0q(r13, r4, r0, r2, r5)
            com.whatsapp.CodeInputField r5 = r13.A02
            X.4Yw r6 = new X.4Yw
            r6.<init>(r13, r12)
            r10 = 42
            r8 = 0
            r11 = 42
            r5.A0H(r6, r7, r8, r9, r10, r11, r12)
            int r0 = r13.A00
            if (r0 == r3) goto L_0x007a
            if (r0 == r1) goto L_0x0071
            r0 = 2131895139(0x7f122363, float:1.9425103E38)
            java.lang.String r1 = r13.A0n(r0)
        L_0x005e:
            r4 = 0
        L_0x005f:
            r0 = 2131428873(0x7f0b0609, float:1.8479403E38)
            X.C36371kC.A1E(r15, r1, r0)
            com.whatsapp.twofactor.TwoFactorAuthActivity r1 = r13.A07
            int[] r0 = r1.A07
            int r0 = r0.length
            if (r0 != r3) goto L_0x006d
            r2 = r4
        L_0x006d:
            r1.A3i(r15, r2)
            return
        L_0x0071:
            r0 = 2131895109(0x7f122345, float:1.9425042E38)
            java.lang.String r1 = r13.A0n(r0)
            r4 = 1
            goto L_0x005f
        L_0x007a:
            r1 = 2131895105(0x7f122341, float:1.9425034E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = X.C36401kF.A0q(r13, r4, r0, r2, r1)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetCodeFragment.A1S(android.os.Bundle, android.view.View):void");
    }
}
