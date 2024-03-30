package X;

import android.content.Intent;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;

/* renamed from: X.AGf  reason: case insensitive filesystem */
public final /* synthetic */ class C21301AGf implements C22983AzZ {
    public final /* synthetic */ IndiaUpiQrTabActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C21301AGf(IndiaUpiQrTabActivity indiaUpiQrTabActivity, String str, String str2) {
        this.A00 = indiaUpiQrTabActivity;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void BXi(C207249un r7) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        if (r7 != null) {
            Intent A0I = C165577te.A0I(indiaUpiQrTabActivity, r7, IndiaUpiInternationalActivationActivity.class);
            A0I.putExtra("INTERNATIONAL_QR_SOURCE", str);
            A0I.putExtra("EXTRA_INTERNATIONAL_QR_ACTIVATION_FROM_SCAN", true);
            A0I.putExtra("INTERNATIONAL_QR_PAYLOAD", C165617ti.A0P(C146356vT.A00(), String.class, str2, "invoiceUrl"));
            indiaUpiQrTabActivity.BuO(A0I, 1019);
        }
    }
}
