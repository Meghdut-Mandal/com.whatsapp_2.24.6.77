package X;

import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.ArrayList;

/* renamed from: X.AGc  reason: case insensitive filesystem */
public final /* synthetic */ class C21298AGc implements C22980AzW {
    public final /* synthetic */ C207119ua A00;
    public final /* synthetic */ IndiaUpiCheckOrderDetailsActivity A01;

    public /* synthetic */ C21298AGc(C207119ua r1, IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity) {
        this.A01 = indiaUpiCheckOrderDetailsActivity;
        this.A00 = r1;
    }

    public final void Bby(C207199ui r8, AnonymousClass2bZ r9) {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A01;
        C207119ua r5 = this.A00;
        C188098z2 A0I = indiaUpiCheckOrderDetailsActivity.A0W.A0I(r8);
        if (A0I == C188098z2.TOS_NONE || AnonymousClass1FR.A0B(indiaUpiCheckOrderDetailsActivity.A0D, r8)) {
            indiaUpiCheckOrderDetailsActivity.A4s(r5);
            return;
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        if (A0I == C188098z2.TOS_V1 || A0I == C188098z2.TOS_ALL) {
            A0I2.add(new C185628uX("upi_pay_privacy_policy"));
        }
        if (A0I == C188098z2.TOS_V2 || A0I == C188098z2.TOS_ALL) {
            A0I2.add(new C185628uX("pay_tos_v3"));
        }
        indiaUpiCheckOrderDetailsActivity.A0M.A0E(new C23170B8e(A0I, r5, indiaUpiCheckOrderDetailsActivity, 1), new C50612lC(A0I2, 1));
    }
}
