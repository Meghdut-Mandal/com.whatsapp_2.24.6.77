package X;

import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment;

/* renamed from: X.B6t  reason: case insensitive filesystem */
public class C23135B6t extends AnonymousClass04N {
    public Object A00;
    public final int A01;

    public C23135B6t(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public AnonymousClass04R B3o(Class cls) {
        switch (this.A01) {
            case 0:
                if (cls.isAssignableFrom(C180348lc.class)) {
                    BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = (BrazilPaymentCardDetailsActivity) this.A00;
                    C19970wo r2 = brazilPaymentCardDetailsActivity.A07;
                    C19770wU r11 = brazilPaymentCardDetailsActivity.A0D;
                    C207249un r3 = brazilPaymentCardDetailsActivity.A04;
                    AnonymousClass1EU r6 = brazilPaymentCardDetailsActivity.A09;
                    C200959iX r9 = brazilPaymentCardDetailsActivity.A09;
                    AnonymousClass1EZ r4 = brazilPaymentCardDetailsActivity.A06;
                    C196039Xk r10 = brazilPaymentCardDetailsActivity.A0A;
                    return new C180348lc(r2, r3, r4, brazilPaymentCardDetailsActivity.A04, r6, brazilPaymentCardDetailsActivity.A07, brazilPaymentCardDetailsActivity.A08, r9, r10, r11);
                }
                throw AnonymousClass001.A08("View Model type mismatch. Expected a BrazilPaymentCardDetailsViewModel");
            case 1:
                if (cls.isAssignableFrom(C167787yo.class)) {
                    IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = (IndiaUpiSendPaymentToVpaFragment) this.A00;
                    C20810yC r32 = indiaUpiSendPaymentToVpaFragment.A07;
                    C19770wU r7 = indiaUpiSendPaymentToVpaFragment.A0N;
                    return new C167787yo(indiaUpiSendPaymentToVpaFragment.A05, r32, indiaUpiSendPaymentToVpaFragment.A0B, indiaUpiSendPaymentToVpaFragment.A0C, indiaUpiSendPaymentToVpaFragment.A0G, r7);
                }
                throw AnonymousClass001.A08("Invalid viewModel for IndiaUpiSendToVpaViewModel");
            default:
                if (cls.isAssignableFrom(C167547yF.class)) {
                    return new C167547yF(((IndiaUpiPaymentInviteFragment) this.A00).A07);
                }
                throw AnonymousClass001.A08("Invalid viewModel");
        }
    }
}
