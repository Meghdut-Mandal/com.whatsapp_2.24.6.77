package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.util.List;

/* renamed from: X.BAn  reason: case insensitive filesystem */
public class C23231BAn implements B1O {
    public Object A00;
    public final int A01;

    public C23231BAn(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BWg(C202059ky r14) {
        if (this.A01 != 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("init/getPaymentConfig : failed. Error code = ");
            C165577te.A1M("PaymentCheckoutOrderViewModel", C36381kD.A10(A0u, r14.A00));
            C167747yk r0 = (C167747yk) this.A00;
            r0.A03.A0C(r0.A08.A00((C202319lY) null, (UserJid) null, new C207059uU(C187998ys.GET_PAYMENT_CONFIG_FAILED, R.string.f12nameremoved, R.string.f12nameremoved), (C188008yt) null, (AnonymousClass2bZ) null, (Boolean) null, (List) null, 0));
            return;
        }
        BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this.A00;
        brazilPaymentActivity.Bnv();
        BrazilPaymentActivity.A1B(brazilPaymentActivity, false);
    }
}
