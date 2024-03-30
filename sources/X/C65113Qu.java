package X;

import com.whatsapp.WaTextView;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.identity.QrCodeValidationResultBottomSheet;
import com.whatsapp.identity.ScanQrCodeActivity;
import com.whatsapp.qrcode.WaQrScannerView;

/* renamed from: X.3Qu  reason: invalid class name and case insensitive filesystem */
public class C65113Qu implements C87904Qp {
    public Object A00;
    public final int A01;

    public C65113Qu(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bdx(boolean z) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            ScanQrCodeActivity scanQrCodeActivity = (ScanQrCodeActivity) obj;
            QrCodeValidationResultBottomSheet qrCodeValidationResultBottomSheet = new QrCodeValidationResultBottomSheet();
            qrCodeValidationResultBottomSheet.A17(C05430Pr.A00(C36441kJ.A19("is_valid", Boolean.valueOf(z))));
            qrCodeValidationResultBottomSheet.A01 = new AnonymousClass3Y3(scanQrCodeActivity, 5);
            qrCodeValidationResultBottomSheet.A00 = new AnonymousClass3Y3(scanQrCodeActivity, 8);
            WaTextView waTextView = scanQrCodeActivity.A02;
            if (waTextView == null) {
                throw C36331k8.A0d("errorIndicatorView");
            }
            waTextView.setVisibility(8);
            C36381kD.A1F(qrCodeValidationResultBottomSheet, scanQrCodeActivity.getSupportFragmentManager(), "QrCodeValidationResultBottomSheet");
            WaQrScannerView waQrScannerView = scanQrCodeActivity.A0B;
            if (waQrScannerView == null) {
                throw C36331k8.A0d("qrScannerView");
            }
            waQrScannerView.Bv5();
            return;
        }
        IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) obj;
        identityVerificationActivity.A0K.A02(new AnonymousClass75B(39, (Object) identityVerificationActivity, z));
    }
}
