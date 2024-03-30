package X;

import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;

/* renamed from: X.8Tq  reason: invalid class name and case insensitive filesystem */
public abstract class C173918Tq extends AnonymousClass155 {
    public boolean A00 = false;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = (PaymentTransactionHistoryActivity) this;
            C18800tq r2 = ((C27111My) C36421kH.A0H(this)).A5g;
            C165567td.A11(r2, paymentTransactionHistoryActivity);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, paymentTransactionHistoryActivity, C36321k7.A05(r2, r1, paymentTransactionHistoryActivity));
            paymentTransactionHistoryActivity.A04 = C36341k9.A0T(r2);
            A01(r2, r1, paymentTransactionHistoryActivity);
        }
    }

    public C173918Tq() {
        C23140B7a.A00(this, 5);
    }

    public static void A01(C18800tq r1, C18830tt r2, PaymentTransactionHistoryActivity paymentTransactionHistoryActivity) {
        paymentTransactionHistoryActivity.A06 = (C20650xu) r1.A3Z.get();
        paymentTransactionHistoryActivity.A0C = (AnonymousClass1EU) r1.A6M.get();
        paymentTransactionHistoryActivity.A0B = (AnonymousClass1EV) r1.A6K.get();
        paymentTransactionHistoryActivity.A09 = (C25251Fo) r1.A5J.get();
        paymentTransactionHistoryActivity.A0J = (AnonymousClass1N6) r1.A5V.get();
        paymentTransactionHistoryActivity.A0D = (C202179lC) r2.A39.get();
        paymentTransactionHistoryActivity.A0A = (AnonymousClass1DR) r1.A6G.get();
        paymentTransactionHistoryActivity.A0H = (AnonymousClass1FR) r1.A6O.get();
        paymentTransactionHistoryActivity.A05 = (C20310xM) r1.A2S.get();
        paymentTransactionHistoryActivity.A07 = (AnonymousClass1VZ) r1.A6B.get();
        paymentTransactionHistoryActivity.A0F = (C1276068y) r2.AAm.get();
    }
}
