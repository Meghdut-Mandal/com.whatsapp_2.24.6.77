package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;

/* renamed from: X.B8s  reason: case insensitive filesystem */
public class C23184B8s implements C22990Azg {
    public Object A00;
    public final int A01;

    public C23184B8s(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BmO(C203399nx r5) {
        C203399nx A0c;
        C207249un A02;
        AnonymousClass1EU r0;
        C203399nx A0c2;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                AnonymousClass9jA r3 = (AnonymousClass9jA) obj;
                C203399nx A0c3 = r5.A0c("pay");
                C18740tg.A06(A0c3);
                C203399nx A0c4 = A0c3.A0c("merchant");
                C18740tg.A06(A0c4);
                A02 = C175898bF.A02(r3.A02, new C175868bC(), A0c4);
                r0 = r3.A04;
                break;
            case 1:
                BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) obj;
                C203399nx A0c5 = r5.A0c("pay");
                if (A0c5 != null && (A0c = A0c5.A0c("card")) != null) {
                    C207249un A022 = C175898bF.A02(brazilPaymentActivity.A06, new AnonymousClass8b7(), A0c);
                    brazilPaymentActivity.A0P.A01().A04((C22935Ayl) null, A022);
                    brazilPaymentActivity.A0M.A0J(C90484aE.A0r(A022));
                    brazilPaymentActivity.A0C.A0C();
                    return;
                }
                return;
            default:
                BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = (BrazilPaymentCardDetailsActivity) obj;
                C203399nx A0c6 = r5.A0c("pay");
                if (A0c6 != null && (A0c2 = A0c6.A0c("card")) != null) {
                    A02 = C175898bF.A02(brazilPaymentCardDetailsActivity.A00, new AnonymousClass8b7(), A0c2);
                    r0 = brazilPaymentCardDetailsActivity.A09;
                    break;
                } else {
                    return;
                }
        }
        r0.A01().A04((C22935Ayl) null, A02);
    }
}
