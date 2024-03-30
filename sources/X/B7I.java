package X;

import android.content.Context;

public class B7I extends AIB {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7I(Context context, C29221Vu r2, C19640wH r3, Object obj, Object obj2, int i) {
        super(context, r2, r3);
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A05(C202059ky r4) {
        switch (this.A02) {
            case 2:
                C165567td.A15(((C29121Vk) this.A00).A0F, r4, "tosv3 onRequestError: ", AnonymousClass000.A0u());
                break;
            case 3:
                C36321k7.A1J(r4, "getOfferDetails: failed with error: ", AnonymousClass000.A0u());
                B1V b1v = ((AnonymousClass9KZ) this.A01).A01;
                if (b1v != null) {
                    b1v.BWY();
                    return;
                }
                return;
        }
        ((AnonymousClass1XD) this.A01).Bes(r4);
    }

    public void A06(C202059ky r4) {
        switch (this.A02) {
            case 2:
                C165567td.A15(((C29121Vk) this.A00).A0F, r4, "tosv3 onResponseError: ", AnonymousClass000.A0u());
                break;
            case 3:
                C36321k7.A1J(r4, "getOfferDetails: failed with error: ", AnonymousClass000.A0u());
                B1V b1v = ((AnonymousClass9KZ) this.A01).A01;
                if (b1v != null) {
                    b1v.BWY();
                    return;
                }
                return;
        }
        ((AnonymousClass1XD) this.A01).Bf0(r4);
    }

    public void A07(C203399nx r8) {
        switch (this.A02) {
            case 0:
                ((C29121Vk) this.A00).A07(new AnonymousClass96A(this.A01, 1), r8, true);
                return;
            case 1:
                try {
                    C202059ky A012 = C202059ky.A01(r8.A0d("account"));
                    if (A012 != null) {
                        ((AnonymousClass1XD) this.A01).Bf0(A012);
                        return;
                    }
                    ((C29121Vk) this.A00).A07(new AnonymousClass96A(this.A01, 2), r8, true);
                    return;
                } catch (C235919b e) {
                    C165567td.A15(((C29121Vk) this.A00).A0F, e, "removePaymentMethod/onResponseSuccess/corrupt stream exception: ", AnonymousClass000.A0u());
                    ((AnonymousClass1XD) this.A01).Bf0(new C202059ky(500));
                    return;
                }
            case 2:
                AnonymousClass9KX r1 = new AnonymousClass9KX();
                r1.A02 = true;
                ((AnonymousClass1XD) this.A01).Bf1(r1);
                return;
            default:
                AnonymousClass9KZ r6 = (AnonymousClass9KZ) this.A01;
                try {
                    C203399nx A0d = r8.A0d("account").A0d("offer_eligibility");
                    r6.A02.A08(new B9V(r6, 0), A0d, r6.A00);
                    return;
                } catch (C235919b e2) {
                    B1V b1v = r6.A01;
                    if (b1v != null) {
                        b1v.BWY();
                    }
                    e2.printStackTrace();
                    return;
                }
        }
    }
}
