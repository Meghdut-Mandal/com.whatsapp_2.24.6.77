package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.ADy  reason: case insensitive filesystem */
public class C21242ADy implements AnonymousClass1XD {
    public final int A00;
    public final C23083B3q A01;
    public final C23075B3f A02;
    public final WeakReference A03;

    private void A00(C202059ky r4, C178888i4 r5) {
        int i;
        C23075B3f b3f = this.A02;
        if (b3f != null) {
            b3f.BOb(r4, this.A00);
        }
        r5.Bnv();
        if (r4 != null) {
            C23083B3q b3q = this.A01;
            if (b3q == null || (i = b3q.BBe((AnonymousClass9YX) null, r4.A00)) == 0) {
                i = R.string.f12nameremoved;
            }
            r5.BO5(i);
        }
    }

    public void Bes(C202059ky r5) {
        C178888i4 r3 = (C178888i4) this.A03.get();
        if (r3 != null) {
            C165567td.A16(r3.A0K, r5, "setDefault/onRequestError. paymentNetworkError: ", AnonymousClass000.A0u());
            A00(r5, r3);
        }
    }

    public void Bf0(C202059ky r5) {
        C178888i4 r3 = (C178888i4) this.A03.get();
        if (r3 != null) {
            r3.A0K.A04(AnonymousClass000.A0l(r5, "setDefault/onResponseError. paymentNetworkError: ", AnonymousClass000.A0u()));
            A00(r5, r3);
        }
    }

    public void Bf1(AnonymousClass9KX r6) {
        int i;
        C175898bF r0;
        if (this instanceof C179208jQ) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = ((C179208jQ) this).A00;
            if (!indiaUpiBankAccountDetailsActivity.isFinishing()) {
                indiaUpiBankAccountDetailsActivity.A0L.A06("setDefault Success");
                indiaUpiBankAccountDetailsActivity.A0D.BOb((C202059ky) null, 15);
                Iterator it = ((C178538gh) r6).A00.iterator();
                while (it.hasNext()) {
                    C207249un A0S = C165607th.A0S(it);
                    if (A0S.A0A.equals(indiaUpiBankAccountDetailsActivity.A00.A0A)) {
                        indiaUpiBankAccountDetailsActivity.A3j(A0S, false);
                    }
                }
                indiaUpiBankAccountDetailsActivity.Bnv();
                C175748az r02 = indiaUpiBankAccountDetailsActivity.A00;
                if (r02 != null && (r0 = r02.A08) != null && ((C175818b6) r0).A0G) {
                    indiaUpiBankAccountDetailsActivity.BO6(indiaUpiBankAccountDetailsActivity.getString(R.string.f12nameremoved));
                    return;
                }
                return;
            }
            return;
        }
        C178888i4 r3 = (C178888i4) this.A03.get();
        if (r3 != null) {
            r3.A0K.A06("setDefault Success");
            C23075B3f b3f = this.A02;
            if (b3f != null) {
                b3f.BOb((C202059ky) null, this.A00);
            }
            r3.A0I.A02(((C178538gh) r6).A00);
            r3.Bnv();
            if (this instanceof C179198jP) {
                boolean equals = "p2m".equals(((C179198jP) this).A01);
                i = R.string.f12nameremoved;
                if (equals) {
                    i = R.string.f12nameremoved;
                }
            } else {
                i = R.string.f12nameremoved;
            }
            r3.BO6(r3.getString(i));
        }
    }

    public C21242ADy(C23083B3q b3q, C23075B3f b3f, C178888i4 r4, int i) {
        this.A02 = b3f;
        this.A00 = i;
        this.A01 = b3q;
        this.A03 = AnonymousClass001.A0F(r4);
    }
}
