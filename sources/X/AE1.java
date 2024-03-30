package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;

public final /* synthetic */ class AE1 implements C22954Az6 {
    public final /* synthetic */ C179098jA A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AE1(C179098jA r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void BfL(UserJid userJid, C135086c7 r11, C135086c7 r12, C135086c7 r13, C202059ky r14, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        C179098jA r3 = this.A00;
        String str4 = this.A01;
        r3.Bnv();
        if (!z || r14 != null) {
            C165597tg.A1A(r3, R.string.f12nameremoved);
            return;
        }
        r3.A0E = (String) C165577te.A0g(r11);
        r3.A0F = str4;
        r3.A0H = z2;
        r3.A0Z = str3;
        if (z3) {
            boolean z7 = r3 instanceof IndiaUpiMandatePaymentActivity;
            AnonymousClass3EU r2 = r3.A07;
            C135086c7 A0S = C165577te.A0S(str4);
            if (z7) {
                z6 = true;
            } else {
                z6 = false;
            }
            r2.A00(r3, r3, (UserJid) null, A0S, z6, false);
            return;
        }
        r3.A4N(r3.A09);
    }
}
