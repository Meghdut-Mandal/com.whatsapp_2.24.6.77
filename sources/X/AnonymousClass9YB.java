package X;

import com.whatsapp.payments.PaymentConfiguration;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9YB  reason: invalid class name */
public class AnonymousClass9YB {
    public final C24881Ed A00;
    public final AnonymousClass16S A01;
    public final PaymentConfiguration A02;
    public final C19770wU A03;

    public static void A01(AnonymousClass9YB r1, C207249un r2, Object obj, int i) {
        r1.A04(new C203869p1(r2, obj, i), r2);
    }

    public C79593ty A02() {
        C79593ty r2 = new C79593ty();
        C81193wc.A01(this.A03, this, r2, 21);
        return r2;
    }

    public C79593ty A03(String str) {
        C79593ty r2 = new C79593ty();
        C1502274l.A00(this.A03, this, r2, str, 45);
        return r2;
    }

    public void A06(C22935Ayl ayl, List list) {
        C19770wU r4 = this.A03;
        C36331k8.A1F(new C175558ag(ayl, this.A01, this.A02, r4, list), r4);
    }

    public AnonymousClass9YB(C24881Ed r1, AnonymousClass16S r2, PaymentConfiguration paymentConfiguration, C19770wU r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = paymentConfiguration;
        this.A00 = r1;
    }

    public static C79593ty A00(AnonymousClass1EU r0) {
        return r0.A01().A02();
    }

    public void A04(C22935Ayl ayl, C207249un r9) {
        ArrayList A10 = C165607th.A10();
        A10.add(r9);
        C19770wU r4 = this.A03;
        C36331k8.A1F(new C175568ah(ayl, this.A01, this.A02, r4, "p2p_context", A10), r4);
    }

    public void A05(C22935Ayl ayl, C207249un r9, String str) {
        ArrayList A10 = C165607th.A10();
        A10.add(r9);
        C19770wU r4 = this.A03;
        C36331k8.A1F(new C175568ah(ayl, this.A01, this.A02, r4, str, A10), r4);
    }
}
