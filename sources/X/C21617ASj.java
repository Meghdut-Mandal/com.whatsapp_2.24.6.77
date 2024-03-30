package X;

import android.os.Vibrator;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment;
import com.whatsapp.util.Log;

/* renamed from: X.ASj  reason: case insensitive filesystem */
public class C21617ASj implements AnonymousClass4UB {
    public final /* synthetic */ IndiaUpiScanQrCodeFragment A00;

    public C21617ASj(IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment) {
        this.A00 = indiaUpiScanQrCodeFragment;
    }

    public void BSs(int i) {
        AnonymousClass17Y r1;
        int i2;
        IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = this.A00;
        if (indiaUpiScanQrCodeFragment.A01.A03()) {
            r1 = indiaUpiScanQrCodeFragment.A00;
            i2 = R.string.f12nameremoved;
        } else if (i != 2) {
            r1 = indiaUpiScanQrCodeFragment.A00;
            i2 = R.string.f12nameremoved;
        } else {
            return;
        }
        r1.A06(i2, 1);
    }

    public void BdY() {
        Log.i("qractivity/previewready");
        IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = this.A00;
        indiaUpiScanQrCodeFragment.A08 = null;
        IndiaUpiScanQrCodeFragment.A00(indiaUpiScanQrCodeFragment);
        if (!indiaUpiScanQrCodeFragment.A02.A0P()) {
            indiaUpiScanQrCodeFragment.A1c();
        }
        indiaUpiScanQrCodeFragment.A05.A00("payments_camera");
    }

    public void Bdv(String str) {
        IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = this.A00;
        indiaUpiScanQrCodeFragment.A05.A01(2);
        if (indiaUpiScanQrCodeFragment.A09) {
            String str2 = str;
            if (str != null && !str.equals(indiaUpiScanQrCodeFragment.A08)) {
                indiaUpiScanQrCodeFragment.A08 = str;
                IndiaUpiQrTabActivity indiaUpiQrTabActivity = (IndiaUpiQrTabActivity) indiaUpiScanQrCodeFragment.A0i();
                Vibrator A0H = indiaUpiQrTabActivity.A08.A0H();
                if (A0H != null) {
                    A0H.vibrate(75);
                }
                if (!C202809mh.A02(indiaUpiQrTabActivity.A0D, indiaUpiQrTabActivity.A03.A0B()) || !C202809mh.A03(indiaUpiQrTabActivity.A0D, str)) {
                    boolean A1S = AnonymousClass000.A1S(14, indiaUpiQrTabActivity.getIntent().getIntExtra("extra_payments_entry_type", -1));
                    if (indiaUpiQrTabActivity.A0D.A0E(1354)) {
                        indiaUpiQrTabActivity.A02.A00(indiaUpiQrTabActivity, (AnonymousClass11F) null, new C147116wh(indiaUpiQrTabActivity), str2, "SCANNED_QR_CODE", IndiaUpiQrTabActivity.A01(indiaUpiQrTabActivity, false), 1025, A1S);
                        return;
                    }
                    indiaUpiQrTabActivity.Btl(IndiaUpiQrCodeScannedDialogFragment.A03((AnonymousClass11F) null, str, "SCANNED_QR_CODE", IndiaUpiQrTabActivity.A01(indiaUpiQrTabActivity, false)), "SCANNED_QR_CODE");
                    return;
                } else if (indiaUpiQrTabActivity.A04.A0D() && indiaUpiQrTabActivity.A07.A02()) {
                    indiaUpiQrTabActivity.A02.A00(indiaUpiQrTabActivity, (AnonymousClass11F) null, (B1D) null, str2, "SCANNED_QR_CODE", IndiaUpiQrTabActivity.A01(indiaUpiQrTabActivity, false), 0, false);
                    return;
                } else if (!indiaUpiQrTabActivity.A07.A02()) {
                    indiaUpiQrTabActivity.A04.Box(new C183518qv(indiaUpiQrTabActivity, indiaUpiQrTabActivity.A05, new C21301AGf(indiaUpiQrTabActivity, "SCANNED_QR_CODE", str)), new AnonymousClass012[0]);
                    return;
                } else {
                    return;
                }
            }
        }
        indiaUpiScanQrCodeFragment.A06.BoN();
    }
}
