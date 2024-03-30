package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.8UX  reason: invalid class name */
public class AnonymousClass8UX extends C430728r {
    public final C225314u A00;
    public final FingerprintBottomSheet A01;
    public final C19970wo A02;
    public final C196039Xk A03;
    public final C21253AEj A04;
    public final C201009id A05;

    public void A00() {
        FingerprintBottomSheet fingerprintBottomSheet = this.A01;
        fingerprintBottomSheet.A1g(true);
        fingerprintBottomSheet.A1c();
    }

    public void A01() {
        C21253AEj aEj = this.A04;
        BrazilPaymentActivity brazilPaymentActivity = aEj.A05;
        C207249un r2 = aEj.A03;
        AnonymousClass16X r1 = aEj.A02;
        String str = aEj.A06;
        String str2 = aEj.A07;
        BrazilPaymentActivity.A16(aEj.A01, r1, r2, aEj.A04, brazilPaymentActivity, str, str2);
    }

    public void A02(C02680Bk r7, C160387kv r8) {
        long A002 = this.A03.A00() * 1000;
        if (A002 > C19970wo.A00(this.A02)) {
            this.A01.A1k(A002);
            return;
        }
        C201009id r4 = this.A05;
        C21094A8f a8f = new C21094A8f(r8, this);
        AVX.A00(r4.A0Q, r4, 5);
        AF3 A012 = r4.A0H.A01("FB", "PIN");
        if (A012 != null) {
            C201009id.A00(r7, r4, a8f, new C194449Pt(A012));
            return;
        }
        r4.A0G.A00(new C21258AEo(r7, r4, a8f, a8f.A01.A04.A05.A0M.A02.A00("get-provider-key")), "FB");
    }

    public AnonymousClass8UX(C225314u r1, FingerprintBottomSheet fingerprintBottomSheet, C19970wo r3, C201009id r4, C196039Xk r5, C21253AEj aEj) {
        this.A02 = r3;
        this.A03 = r5;
        this.A00 = r1;
        this.A05 = r4;
        this.A01 = fingerprintBottomSheet;
        this.A04 = aEj;
    }
}
