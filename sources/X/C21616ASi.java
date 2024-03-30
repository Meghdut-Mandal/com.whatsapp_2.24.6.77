package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;

/* renamed from: X.ASi  reason: case insensitive filesystem */
public final /* synthetic */ class C21616ASi implements AnonymousClass4RW {
    public final /* synthetic */ IndiaUpiQrTabActivity A00;

    public /* synthetic */ C21616ASi(IndiaUpiQrTabActivity indiaUpiQrTabActivity) {
        this.A00 = indiaUpiQrTabActivity;
    }

    public final void BfH(String str, int i) {
        int i2;
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A00;
        indiaUpiQrTabActivity.Bnv();
        if (!indiaUpiQrTabActivity.BLh()) {
            if (i != 0) {
                i2 = R.string.f12nameremoved;
                if (i != 1) {
                    if (i == 2) {
                        String str2 = str;
                        if (!C202809mh.A02(indiaUpiQrTabActivity.A0D, indiaUpiQrTabActivity.A03.A0B()) || !C202809mh.A03(indiaUpiQrTabActivity.A0D, str)) {
                            indiaUpiQrTabActivity.Btl(IndiaUpiQrCodeScannedDialogFragment.A03((AnonymousClass11F) null, str, "GALLERY_QR_CODE", IndiaUpiQrTabActivity.A01(indiaUpiQrTabActivity, true)), "GALLERY_QR_CODE");
                            return;
                        } else if (indiaUpiQrTabActivity.A04.A0D() && indiaUpiQrTabActivity.A07.A02()) {
                            indiaUpiQrTabActivity.A02.A00(indiaUpiQrTabActivity, (AnonymousClass11F) null, (B1D) null, str2, "GALLERY_QR_CODE", IndiaUpiQrTabActivity.A01(indiaUpiQrTabActivity, true), 0, false);
                            return;
                        } else if (!indiaUpiQrTabActivity.A07.A02()) {
                            indiaUpiQrTabActivity.A04.Box(new C183518qv(indiaUpiQrTabActivity, indiaUpiQrTabActivity.A05, new C21301AGf(indiaUpiQrTabActivity, "GALLERY_QR_CODE", str)), new AnonymousClass012[0]);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                i2 = R.string.f12nameremoved;
            }
            String string = indiaUpiQrTabActivity.getString(i2);
            C39001qm A002 = AnonymousClass3LW.A00(indiaUpiQrTabActivity);
            C165587tf.A17(A002);
            A002.A0p(string);
            C36341k9.A11(A002);
        }
    }
}
