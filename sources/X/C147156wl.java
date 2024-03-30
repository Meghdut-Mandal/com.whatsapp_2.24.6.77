package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.6wl  reason: invalid class name and case insensitive filesystem */
public class C147156wl implements AnonymousClass1XD {
    public final /* synthetic */ C20310xM A00;
    public final /* synthetic */ AnonymousClass4T4 A01;
    public final /* synthetic */ C23043B1o A02;
    public final /* synthetic */ C19770wU A03;

    public C147156wl(C20310xM r1, AnonymousClass4T4 r2, C23043B1o b1o, C19770wU r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = b1o;
    }

    public void Bf1(AnonymousClass9KX r6) {
        if (r6 instanceof C178548gi) {
            List list = ((C178548gi) r6).A01;
            if (list != null && list.size() > 0) {
                int i = ((C202319lY) C36391kE.A0t(list)).A02;
                Set set = C202449lr.A01;
                Integer valueOf = Integer.valueOf(i);
                if (!set.contains(valueOf) && !C202449lr.A00.contains(valueOf)) {
                    this.A03.Boy(new C81193wc(this.A02, this.A00, 24));
                    this.A01.Bha();
                    return;
                }
            } else {
                return;
            }
        }
        this.A01.BhX();
    }

    public void Bes(C202059ky r3) {
        C36321k7.A1J(r3, "PAY: InteractiveMessageCheckoutInfoConverter verifyFromServer/onRequestError. paymentNetworkError: ", AnonymousClass000.A0u());
        this.A01.BhX();
    }

    public void Bf0(C202059ky r3) {
        C36321k7.A1J(r3, "PAY: InteractiveMessageCheckoutInfoConverter verifyFromServer/onResponseError. paymentNetworkError: ", AnonymousClass000.A0u());
        this.A01.BhX();
    }
}
