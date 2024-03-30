package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

public class B9U implements C22954Az6 {
    public Object A00;
    public Object A01;
    public final int A02;

    public B9U(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BfL(UserJid userJid, C135086c7 r11, C135086c7 r12, C135086c7 r13, C202059ky r14, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i;
        int i2;
        String str4 = str2;
        String str5 = str3;
        boolean z6 = z2;
        boolean z7 = z5;
        if (this.A02 != 0) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A00;
            Runnable runnable = (Runnable) this.A01;
            indiaUpiSendPaymentActivity.A0n = z6;
            if (!AnonymousClass14B.A0F(str5)) {
                indiaUpiSendPaymentActivity.A0S = str5;
                indiaUpiSendPaymentActivity.A0Z = str5;
            }
            indiaUpiSendPaymentActivity.Bnv();
            if (z && r14 == null) {
                indiaUpiSendPaymentActivity.A0G = r11;
                indiaUpiSendPaymentActivity.A0h = str;
                UserJid userJid2 = userJid;
                indiaUpiSendPaymentActivity.A0E = userJid;
                indiaUpiSendPaymentActivity.A0q = str4;
                indiaUpiSendPaymentActivity.A0t = z7;
                indiaUpiSendPaymentActivity.A0v = z6;
                if (z3) {
                    indiaUpiSendPaymentActivity.A05.A00(indiaUpiSendPaymentActivity, new C23153B7n(runnable, indiaUpiSendPaymentActivity, 1), userJid2, indiaUpiSendPaymentActivity.A0I, true, false);
                    return;
                }
                runnable.run();
            } else if (indiaUpiSendPaymentActivity.A0K) {
                if (r14 == null || !((i2 = r14.A00) == -2 || i2 == 6 || i2 == 7)) {
                    i = 4;
                } else {
                    i = 2;
                }
                indiaUpiSendPaymentActivity.A00 = i;
                IndiaUpiSendPaymentActivity.A12(indiaUpiSendPaymentActivity);
            } else {
                C165597tg.A1A(indiaUpiSendPaymentActivity, R.string.f12nameremoved);
            }
        } else {
            C23054B2a b2a = (C23054B2a) this.A00;
            C175698au r4 = (C175698au) this.A01;
            if (r14 != null) {
                if (b2a != null) {
                    b2a.BUT(r4);
                }
            } else if (z) {
                r4.A01 = r12;
                r4.A00 = r11;
                r4.A02 = str;
                if (b2a != null) {
                    b2a.Bbl(new AnonymousClass9XA(r13, r4, str4, str5, z7, z6));
                }
            }
        }
    }
}
