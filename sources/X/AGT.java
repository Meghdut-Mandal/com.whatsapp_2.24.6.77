package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.util.Log;
import java.util.List;

public class AGT implements B3P {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public /* synthetic */ void BZF(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
    }

    public /* synthetic */ void BcO(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public /* synthetic */ void BcS(C207249un r1, PaymentMethodRow paymentMethodRow) {
    }

    public /* synthetic */ void BcV(PaymentBottomSheet paymentBottomSheet, int i, int i2) {
    }

    public /* synthetic */ void BcZ(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public AGT(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public void BUD(View view, View view2, C207079uW r35, C175728ax r36, C207249un r37, PaymentBottomSheet paymentBottomSheet) {
        String A0J;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.Bu1(R.string.f12nameremoved);
        C175928bI r1 = new C175928bI();
        indiaUpiSendPaymentActivity.A0O = r1;
        r1.A0K = C165607th.A0p(indiaUpiSendPaymentActivity);
        C175928bI r12 = indiaUpiSendPaymentActivity.A0O;
        if (!TextUtils.isEmpty(indiaUpiSendPaymentActivity.A0o)) {
            A0J = indiaUpiSendPaymentActivity.A0o;
        } else {
            A0J = C173858Tk.A0J(indiaUpiSendPaymentActivity);
        }
        r12.A0S = A0J;
        C175818b6 A0Q = C165597tg.A0Q(indiaUpiSendPaymentActivity.A0g, indiaUpiSendPaymentActivity.A0B.A08, "IndiaUpiPaymentActivity onRequestPayment: Cannot get IndiaUpiMethodData");
        indiaUpiSendPaymentActivity.A0O.A0C = A0Q.A05;
        indiaUpiSendPaymentActivity.A0R = AnonymousClass972.A00(indiaUpiSendPaymentActivity.A0F, indiaUpiSendPaymentActivity.A0Q);
        AnonymousClass8gO r3 = indiaUpiSendPaymentActivity.A0D;
        C135086c7 r13 = indiaUpiSendPaymentActivity.A0I;
        String str = indiaUpiSendPaymentActivity.A0h;
        C135086c7 A08 = indiaUpiSendPaymentActivity.A0M.A08();
        String A0E = indiaUpiSendPaymentActivity.A0M.A0E();
        C135086c7 r2 = A0Q.A05;
        AnonymousClass16X r7 = indiaUpiSendPaymentActivity.A09;
        C175928bI r5 = indiaUpiSendPaymentActivity.A0O;
        String str2 = r5.A0S;
        String str3 = r5.A0K;
        String str4 = indiaUpiSendPaymentActivity.A0B.A0A;
        String str5 = indiaUpiSendPaymentActivity.A0R;
        C135086c7 r52 = indiaUpiSendPaymentActivity.A0H;
        C194499Py r0 = new C194499Py(indiaUpiSendPaymentActivity);
        Log.i("PAY: collectFromVpa called");
        AnonymousClass19A r28 = r3.A02;
        String A09 = r28.A09();
        String A0k = C165577te.A0k(r13);
        String str6 = (String) C165577te.A0g(r52);
        String str7 = (String) A08.A00;
        String str8 = (String) C165577te.A0g(r2);
        String A01 = r3.A04.A01();
        C207119ua A02 = r3.A01.A02(AnonymousClass16W.A05, r7);
        String valueOf = String.valueOf(A02.A01());
        String valueOf2 = String.valueOf(A02.A00);
        String str9 = ((AnonymousClass16V) A02.A01).A02;
        AnonymousClass6QB A0X = C165597tg.A0X();
        AnonymousClass6QB A0q = C36441kJ.A0q("money");
        if (C203539oF.A0P(valueOf, 1, 100, false)) {
            C36331k8.A1D(A0q, "value", valueOf);
        }
        if (C203539oF.A0P(valueOf2, 1, 100, false)) {
            C36331k8.A1D(A0q, "offset", valueOf2);
        }
        if (C203539oF.A0P(str9, 1, 100, false)) {
            C36331k8.A1D(A0q, "currency", str9);
        }
        C203399nx A0I = C165567td.A0I(A0q, A0X);
        AnonymousClass6QB A0q2 = C36441kJ.A0q("amount");
        A0q2.A06(A0I);
        C203399nx A03 = A0q2.A03();
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1D(A0T);
        C203539oF.A0E(A0T, A09);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-collect-from-vpa");
        if (C203539oF.A0P(A0k, 1, 100, false)) {
            C36331k8.A1D(A0a, "sender-vpa", A0k);
        }
        if (str != null && C203539oF.A0P(str, 1, 100, true)) {
            C36331k8.A1D(A0a, "sender-vpa-id", str);
        }
        if (str6 != null && C203539oF.A0P(str6, 8, 15, true)) {
            C36331k8.A1D(A0a, "sender-upi-number", str6);
        }
        if (C203539oF.A0P(str7, 1, 100, false)) {
            C36331k8.A1D(A0a, "receiver-vpa", str7);
        }
        if (A0E != null && C203539oF.A0P(A0E, 1, 100, true)) {
            C36331k8.A1D(A0a, "receiver-vpa-id", A0E);
        }
        if (C203539oF.A0V(str8, 1, false)) {
            C36331k8.A1D(A0a, "upi-bank-info", str8);
        }
        if (C203539oF.A0P(str2, 0, 35, false)) {
            C36331k8.A1D(A0a, "seq-no", str2);
        }
        if (C203539oF.A0P(str4, 1, 100, false)) {
            C36331k8.A1D(A0a, "credential-id", str4);
        }
        if (str5 != null && C203539oF.A0V(str5, 0, true)) {
            C36331k8.A1D(A0a, "note", str5);
        }
        if (C203539oF.A0P(str3, 1, 100, false)) {
            C36331k8.A1D(A0a, "message-id", str3);
        }
        C203539oF.A0G(A0a, A01, false);
        A0a.A05(A03);
        AnonymousClass19A r9 = r28;
        r9.A0E(new B7M(r3.A00, r3.A01, r3.A03, AnonymousClass9I1.A04(r3, "upi-collect-from-vpa"), r3, r0), C165567td.A0I(A0a, A0T), A09, 204, 0);
    }

    public void Bca(int i) {
        String str;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        if (i == 1) {
            str = "p2p";
        } else {
            str = "p2m";
        }
        indiaUpiSendPaymentActivity.A0p = str;
    }

    public void BjR(PaymentBottomSheet paymentBottomSheet) {
        String str = this.A00.A0Q;
        IndiaUpiEditTransactionDescriptionFragment indiaUpiEditTransactionDescriptionFragment = new IndiaUpiEditTransactionDescriptionFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("arg_payment_description", str);
        indiaUpiEditTransactionDescriptionFragment.A17(A07);
        indiaUpiEditTransactionDescriptionFragment.A08 = new C23187B8v(this, 1);
        paymentBottomSheet.A1n(indiaUpiEditTransactionDescriptionFragment);
    }
}
