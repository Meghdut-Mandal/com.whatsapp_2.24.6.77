package X;

import com.whatsapp.util.Log;

/* renamed from: X.3n5  reason: invalid class name and case insensitive filesystem */
public class C75353n5 implements AnonymousClass4U7 {
    public final /* synthetic */ AnonymousClass3SE A00;

    public C75353n5(AnonymousClass3SE r1) {
        this.A00 = r1;
    }

    public void BTR() {
        AnonymousClass3SE r1 = this.A00;
        if (r1.A00 != null) {
            Log.e("ContactUsActivity/createTicketIq/onDeliveryFailure, falling back to email support.");
            r1.A00.Bnv();
            r1.A01();
        }
    }

    public void BTS(int i) {
        AnonymousClass3SE r2 = this.A00;
        if (r2.A00 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("ContactUsActivity/createTicketIq/onError/errorCode=");
            A0u.append(i);
            C36321k7.A1Z(A0u, " falling back to email support.");
            r2.A00.Bnv();
            r2.A01();
        }
    }

    public void BTT(AnonymousClass11F r7) {
        AnonymousClass3SE r5 = this.A00;
        if (r5.A00 != null) {
            Log.i("ContactUsActivity/createTicketIq/onSuccess, removing spinner and finishing activity");
            boolean z = false;
            int max = Math.max(0, r5.A0A.A07(974));
            r5.A01 = r7;
            r5.A02 = false;
            if (r7 != null && r5.A06.A0M(r7)) {
                C80253v6.A01(r5.A0D, this, 31);
            }
            C24381Cf r2 = r5.A08;
            C24521Ct r1 = r5.A07;
            r2.registerObserver(r1);
            if (max <= 0) {
                z = true;
            }
            if (!r5.A05(z)) {
                r5.A05.A0I(new C80253v6(this, 32), (long) max);
            } else {
                r2.unregisterObserver(r1);
            }
        }
    }
}
