package X;

import com.whatsapp.payments.PaymentConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8ai  reason: invalid class name and case insensitive filesystem */
public class C175578ai extends C183618r5 {
    public final AnonymousClass16S A00;
    public final AnonymousClass9FC A01;
    public final String A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A09 = this.A00.A09();
        Iterator it = A09.iterator();
        while (it.hasNext()) {
            C207249un A0S = C165607th.A0S(it);
            if (this.A02.equals(A0S.A0A)) {
                int i = this.A01.A00;
                C175858bB r0 = (C175858bB) A0S.A08;
                if (r0 != null) {
                    r0.A04 = i;
                }
            }
        }
        C192489He A0G = A0G("p2p_context", A09);
        ArrayList A14 = C36441kJ.A14(1);
        if (!A0G.A01) {
            return A0G;
        }
        Iterator it2 = A0G.A00.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C207249un A0S2 = C165607th.A0S(it2);
            if (this.A02.equals(A0S2.A0A)) {
                A14.add(A0S2);
                break;
            }
        }
        return new C192489He(A14, true);
    }

    public C175578ai(C22935Ayl ayl, AnonymousClass16S r2, PaymentConfiguration paymentConfiguration, AnonymousClass9FC r4, C19770wU r5, String str) {
        super(ayl, r2, paymentConfiguration, r5);
        this.A00 = r2;
        this.A02 = str;
        this.A01 = r4;
    }
}
