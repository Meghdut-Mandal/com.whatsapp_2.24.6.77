package X;

import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;

public class AGV implements B3P {
    public final /* synthetic */ C79593ty A00;
    public final /* synthetic */ AnonymousClass16X A01;
    public final /* synthetic */ AnonymousClass6O3 A02;
    public final /* synthetic */ ConfirmPaymentFragment A03;
    public final /* synthetic */ C178848hw A04;

    public void BZF(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
    }

    public void BcV(PaymentBottomSheet paymentBottomSheet, int i, int i2) {
    }

    public void BcZ(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public AGV(C79593ty r1, AnonymousClass16X r2, AnonymousClass6O3 r3, ConfirmPaymentFragment confirmPaymentFragment, C178848hw r5) {
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = confirmPaymentFragment;
    }

    public void BUD(View view, View view2, C207079uW r9, C175728ax r10, C207249un r11, PaymentBottomSheet paymentBottomSheet) {
        C178848hw r5 = this.A04;
        if (C179148jG.A1P(r5)) {
            C36341k9.A0x(C90494aF.A0E(r5.A0P), "pref_p2m_hybrid_last_used_payment_option", "WhatsappPay");
            C198199d4 r1 = r5.A0I;
            C64933Qa A022 = AnonymousClass3UJ.A02(r5.getIntent());
            if (A022 != null) {
                C183358qf r12 = r1.A05;
                String str = A022.A01;
                AnonymousClass00C.A07(str);
                r12.A0A(str);
            }
        }
        if (C201659k4.A00(r11, r5.A0p)) {
            BcO(paymentBottomSheet, 0);
            return;
        }
        C79593ty r4 = this.A00;
        if (r4 != null) {
            r5.Bu1(R.string.f12nameremoved);
            C203269nh r3 = r5.A0W;
            r4.A0B(new C23206B9o(r5, new C21316AGu(this, paymentBottomSheet), r3, 1), r3.A00.A04);
            return;
        }
        r5.A4T(paymentBottomSheet);
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A1b();
        }
        r5.A4V(this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r2.A0O.A0H(r2.A0D, r2.A0Z, r2.A0g) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BcO(com.whatsapp.payments.ui.PaymentBottomSheet r18, int r19) {
        /*
            r17 = this;
            r3 = r17
            X.8hw r2 = r3.A04
            X.9un r1 = r2.A0B
            java.lang.String r0 = r2.A0p
            boolean r6 = X.C201659k4.A00(r1, r0)
            boolean r0 = X.C179148jG.A1P(r2)
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = r2.A0h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
        L_0x001a:
            X.1EV r5 = r2.A0O
            X.11F r4 = r2.A0D
            java.lang.String r1 = r2.A0Z
            java.lang.String r0 = r2.A0g
            boolean r0 = r5.A0H(r4, r1, r0)
            r5 = 0
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            r5 = 1
        L_0x002a:
            X.16X r4 = r3.A01
            X.6O3 r0 = r3.A02
            X.6Ps r8 = X.C178848hw.A1A(r4, r0, r2)
            if (r5 == 0) goto L_0x003c
            X.AF7 r1 = r2.A0S
            X.9un r0 = r2.A0B
            X.6Ps r8 = r1.A05(r0, r8)
        L_0x003c:
            X.AF7 r7 = r2.A0S
            java.lang.Integer r9 = X.C36361kB.A0i()
            r0 = 84
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            if (r6 == 0) goto L_0x0074
            java.lang.String r11 = "add_credential_prompt"
        L_0x004c:
            java.lang.String r12 = r2.A0f
            r15 = 0
            boolean r16 = X.C179148jG.A1P(r2)
            java.lang.String r13 = r2.A0i
            java.lang.String r14 = r2.A0h
            r7.BOq(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r6 = r18
            if (r5 == 0) goto L_0x0077
            X.9fK r1 = new X.9fK
            r1.<init>()
            r1.A02(r4)
            X.16U r0 = X.AnonymousClass16W.A05
            r1.A02 = r0
            X.9ua r1 = r1.A01()
            X.9un r0 = r2.A0B
            r2.A4W(r0, r1, r6)
            return
        L_0x0074:
            java.lang.String r11 = "payment_confirm_prompt"
            goto L_0x004c
        L_0x0077:
            java.util.List r0 = r2.A0i
            com.whatsapp.payments.ui.PaymentMethodsListPickerFragment r1 = com.whatsapp.payments.ui.PaymentMethodsListPickerFragment.A00(r0)
            X.AGi r0 = new X.AGi
            r0.<init>(r2, r1)
            r1.A07 = r0
            X.AGX r0 = new X.AGX
            r0.<init>(r2)
            r1.A04 = r0
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r3.A03
            r1.A0y(r0, r15)
            r6.A1n(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AGV.BcO(com.whatsapp.payments.ui.PaymentBottomSheet, int):void");
    }

    public void BcS(C207249un r2, PaymentMethodRow paymentMethodRow) {
        C178848hw.A1G(r2, this.A04);
    }

    public void Bca(int i) {
        String str;
        C178848hw r1 = this.A04;
        if (i == 1) {
            str = "p2p";
        } else {
            str = "p2m";
        }
        r1.A0p = str;
    }

    public void BjR(PaymentBottomSheet paymentBottomSheet) {
        C178848hw r4 = this.A04;
        String str = r4.A0Q;
        IndiaUpiEditTransactionDescriptionFragment indiaUpiEditTransactionDescriptionFragment = new IndiaUpiEditTransactionDescriptionFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("arg_payment_description", str);
        indiaUpiEditTransactionDescriptionFragment.A17(A07);
        r4.A40(64, "payment_confirm_prompt");
        indiaUpiEditTransactionDescriptionFragment.A08 = new C23187B8v(this, 0);
        paymentBottomSheet.A1n(indiaUpiEditTransactionDescriptionFragment);
    }
}
