package X;

import android.content.Intent;
import com.whatsapp.payments.ui.IndiaUpiStepUpActivity;

/* renamed from: X.AGe  reason: case insensitive filesystem */
public final /* synthetic */ class C21300AGe implements C22983AzZ {
    public final /* synthetic */ C179658kU A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C21300AGe(C179658kU r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void BXi(C207249un r5) {
        C179658kU r0 = this.A00;
        String str = this.A01;
        if (r5 != null) {
            AnonymousClass155 r2 = r0.A05;
            Intent A0I = C165577te.A0I(r2, r5, IndiaUpiStepUpActivity.class);
            A0I.putExtra("extra_step_up_id", str);
            r2.startActivity(A0I);
            return;
        }
        r0.A03();
    }
}
