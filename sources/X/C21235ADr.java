package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity;

/* renamed from: X.ADr  reason: case insensitive filesystem */
public final /* synthetic */ class C21235ADr implements C22952Az4 {
    public final /* synthetic */ IndiaUpiVpaContactInfoActivity A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C21235ADr(IndiaUpiVpaContactInfoActivity indiaUpiVpaContactInfoActivity, boolean z) {
        this.A00 = indiaUpiVpaContactInfoActivity;
        this.A01 = z;
    }

    public final void Bf8(C202059ky r3) {
        IndiaUpiVpaContactInfoActivity indiaUpiVpaContactInfoActivity = this.A00;
        boolean z = this.A01;
        if (r3 == null) {
            IndiaUpiVpaContactInfoActivity.A07(indiaUpiVpaContactInfoActivity, z);
        } else if (z) {
            indiaUpiVpaContactInfoActivity.BO5(R.string.f12nameremoved);
        } else {
            C165597tg.A1A(indiaUpiVpaContactInfoActivity, R.string.f12nameremoved);
        }
    }
}
