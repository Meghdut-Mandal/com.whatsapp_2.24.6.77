package X;

import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.B7q  reason: case insensitive filesystem */
public class C23156B7q implements C23054B2a {
    public Object A00;
    public final int A01;

    public C23156B7q(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, int i) {
        this.A01 = i;
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public void BUT(C175698au r3) {
        switch (this.A01) {
            case 0:
                ((C179108jC) this.A00).A4E();
                return;
            case 1:
                IndiaUpiSendPaymentActivity.A11(r3, (IndiaUpiSendPaymentActivity) this.A00);
                return;
            default:
                if (r3 != null && !C202349ld.A02(r3.A00)) {
                    ((C179128jE) this.A00).A0G = r3.A00;
                    return;
                }
                return;
        }
    }

    public void BWg(C202059ky r5) {
        int i = this.A01;
        C178848hw r3 = (C178848hw) this.A00;
        switch (i) {
            case 0:
                if (!AEA.A02(r3, "upi-get-vpa", r5.A00, false)) {
                    r3.A0g.A06("could not get account vpa: showErrorAndFinish");
                    break;
                } else {
                    return;
                }
            case 1:
                r3.A0a = false;
                r3.Bnv();
                if (!AEA.A02(r3, "upi-get-vpa", r5.A00, false)) {
                    C24611Dc r2 = r3.A0g;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("could not get vpa for jid: ");
                    A0u.append(r3.A0E);
                    C165567td.A18(r2, "; showErrorAndFinish", A0u);
                    break;
                } else {
                    return;
                }
            default:
                C24611Dc r22 = r3.A0g;
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("could not get payee name for jio: ");
                r22.A05(AnonymousClass000.A0o(r3.A0E, A0u2));
                return;
        }
        r3.A4Z(r5);
    }

    public /* synthetic */ void Bbl(AnonymousClass9XA r4) {
        if (1 - this.A01 == 0) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A00;
            IndiaUpiSendPaymentActivity.A11(r4.A01, indiaUpiSendPaymentActivity);
            IndiaUpiSendPaymentActivity.A13(indiaUpiSendPaymentActivity);
            indiaUpiSendPaymentActivity.A0n = r4.A05;
            String str = r4.A02;
            indiaUpiSendPaymentActivity.A0S = str;
            if (str != null && !str.equals("0000")) {
                indiaUpiSendPaymentActivity.A0p = "p2m";
            }
        }
    }
}
