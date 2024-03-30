package X;

import android.widget.ProgressBar;
import com.whatsapp.QrImageView;
import com.whatsapp.R;
import com.whatsapp.identity.ScanQrCodeActivity;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.EnumMap;
import java.util.Set;

/* renamed from: X.3n1  reason: invalid class name and case insensitive filesystem */
public final class C75313n1 implements AnonymousClass4TF {
    public final /* synthetic */ ScanQrCodeActivity A00;

    public C75313n1(ScanQrCodeActivity scanQrCodeActivity) {
        this.A00 = scanQrCodeActivity;
    }

    public void BXz(C599836a r8, Set set, Set set2) {
        ScanQrCodeActivity scanQrCodeActivity = this.A00;
        ProgressBar progressBar = scanQrCodeActivity.A00;
        if (progressBar == null) {
            throw C36331k8.A0d("progressBar");
        }
        progressBar.setVisibility(8);
        if (r8 != null) {
            if (scanQrCodeActivity.A08 != null) {
                C599836a r0 = scanQrCodeActivity.A07;
                if (r0 == r8) {
                    return;
                }
                if (r0 != null) {
                    C62353Fv r1 = r0.A01;
                    C62353Fv r02 = r8.A01;
                    if (!(r1 == null || r02 == null || !r1.equals(r02))) {
                        return;
                    }
                }
            } else {
                throw C36331k8.A0d("fingerprintUtil");
            }
        }
        scanQrCodeActivity.A07 = r8;
        C63453Kc r03 = scanQrCodeActivity.A09;
        if (r03 != null) {
            r03.A0A = r8;
            if (r8 != null) {
                QrImageView qrImageView = (QrImageView) scanQrCodeActivity.findViewById(R.id.qr_code);
                try {
                    EnumMap enumMap = new EnumMap(C187798yY.class);
                    AnonymousClass9S4 A002 = C200649ht.A00(C023109s.A00, new String(r8.A02.A0o(), scanQrCodeActivity.A0E), enumMap);
                    scanQrCodeActivity.A01 = A002;
                    qrImageView.setQrCode(A002);
                    qrImageView.invalidate();
                } catch (AnonymousClass92E | UnsupportedEncodingException e) {
                    Log.w("scanqrcode/", e);
                }
            }
        } else {
            throw C36331k8.A0d("qrCodeValidationUtil");
        }
    }

    public void BdB() {
        ProgressBar progressBar = this.A00.A00;
        if (progressBar == null) {
            throw C36331k8.A0d("progressBar");
        }
        progressBar.setVisibility(0);
    }
}
