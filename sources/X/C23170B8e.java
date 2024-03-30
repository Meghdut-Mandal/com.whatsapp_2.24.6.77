package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;

/* renamed from: X.B8e  reason: case insensitive filesystem */
public class C23170B8e implements AnonymousClass1XD {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C23170B8e(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void Bes(C202059ky r3) {
        if (this.A03 != 0) {
            C179068j0 r1 = (C179068j0) this.A00;
            r1.A4p(false);
            r1.BO5(R.string.f12nameremoved);
            return;
        }
        ((AnonymousClass1XD) this.A01).Bes(r3);
    }

    public void Bf0(C202059ky r5) {
        if (this.A03 != 0) {
            C179068j0 r1 = (C179068j0) this.A00;
            r1.A4p(false);
            r1.BO5(R.string.f12nameremoved);
            return;
        }
        IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this.A00;
        C165567td.A16(indiaUpiBankAccountDetailsActivity.A0L, r5, "removePayment/onResponseError. paymentNetworkError: ", AnonymousClass000.A0u());
        C23075B3f b3f = (C23075B3f) this.A02;
        if (b3f != null) {
            b3f.BOb(r5, 13);
        }
        C199729fr A032 = indiaUpiBankAccountDetailsActivity.A04.A03((AnonymousClass9YX) null, r5.A00);
        if (A032.A00 != 0) {
            indiaUpiBankAccountDetailsActivity.Bnv();
            C199729fr.A00(indiaUpiBankAccountDetailsActivity, A032).A1f(indiaUpiBankAccountDetailsActivity.getSupportFragmentManager(), (String) null);
            return;
        }
        ((AnonymousClass1XD) this.A01).Bf0(r5);
    }

    public void Bf1(AnonymousClass9KX r4) {
        C24601Db r0;
        int i = this.A03;
        Object obj = this.A01;
        if (i != 0) {
            int ordinal = ((C188098z2) obj).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    r0 = ((C179128jE) this.A00).A0P;
                } else if (ordinal == 2) {
                    C179128jE r1 = (C179128jE) this.A00;
                    r1.A0P.A0A();
                    r0 = r1.A0P;
                }
                C36331k8.A0w(C90494aF.A0E(r0), "pref_p2m_hybrid_v2_tos_accepted", true);
            } else {
                ((C179128jE) this.A00).A0P.A0A();
            }
            ((IndiaUpiCheckOrderDetailsActivity) this.A00).A4s((C207119ua) this.A02);
            return;
        }
        ((AnonymousClass1XD) obj).Bf1(r4);
    }
}
